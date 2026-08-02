package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import ru.kinopoisk.sdk.easylogin.internal.P0;

/* loaded from: classes5.dex */
public final class cij extends AtomicInteger implements ka8 {
    private static final long serialVersionUID = 8567835998786448817L;
    public final wjj a;
    public final xh2 b;
    public final bij[] c;
    public Object[] d;
    public final d9r e;
    public volatile boolean f;
    public volatile boolean g;
    public final fu1 h = new fu1();
    public int i;
    public int j;

    public cij(wjj wjjVar, xh2 xh2Var, int i, int i2) {
        this.a = wjjVar;
        this.b = xh2Var;
        this.d = new Object[i];
        bij[] bijVarArr = new bij[i];
        for (int i3 = 0; i3 < i; i3++) {
            bijVarArr[i3] = new bij(this, i3);
        }
        this.c = bijVarArr;
        this.e = new d9r(i2);
    }

    @Override // defpackage.ka8
    public final void a() {
        if (this.f) {
            return;
        }
        this.f = true;
        b();
        if (getAndIncrement() == 0) {
            d(this.e);
        }
    }

    public final void b() {
        for (bij bijVar : this.c) {
            bijVar.getClass();
            ra8.b(bijVar);
        }
    }

    public final void d(d9r d9rVar) {
        synchronized (this) {
            this.d = null;
        }
        d9rVar.clear();
    }

    public final void e() {
        if (getAndIncrement() != 0) {
            return;
        }
        d9r d9rVar = this.e;
        wjj wjjVar = this.a;
        int i = 1;
        while (!this.f) {
            if (this.h.get() != null) {
                b();
                d(d9rVar);
                wjjVar.onError(this.h.b());
                return;
            }
            boolean z = this.g;
            Object[] objArr = (Object[]) d9rVar.poll();
            boolean z2 = objArr == null;
            if (z && z2) {
                d(d9rVar);
                Throwable b = this.h.b();
                if (b == null) {
                    wjjVar.onComplete();
                    return;
                } else {
                    wjjVar.onError(b);
                    return;
                }
            }
            if (z2) {
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            } else {
                try {
                    List c = P0.c(this.b.b, objArr);
                    up6.L(c, "The combiner returned a null value");
                    wjjVar.onNext(c);
                } catch (Throwable th) {
                    leu.a0(th);
                    this.h.a(th);
                    b();
                    d(d9rVar);
                    wjjVar.onError(this.h.b());
                    return;
                }
            }
        }
        d(d9rVar);
    }
}
