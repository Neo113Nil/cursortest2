package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import ru.kinopoisk.sdk.easylogin.internal.T0;
import ru.kinopoisk.sdk.easylogin.internal.X0;

/* loaded from: classes5.dex */
public final class jjj extends AtomicInteger implements wjj, ka8 {
    public static final ijj j;
    private static final long serialVersionUID = -3491074160481096299L;
    public final wjj a;
    public final h5n b;
    public final int c;
    public volatile boolean e;
    public volatile boolean f;
    public ka8 g;
    public volatile long i;
    public final AtomicReference h = new AtomicReference();
    public final fu1 d = new fu1();

    static {
        ijj ijjVar = new ijj(null, -1L, 1);
        j = ijjVar;
        ra8.b(ijjVar);
    }

    public jjj(wjj wjjVar, h5n h5nVar, int i) {
        this.a = wjjVar;
        this.b = h5nVar;
        this.c = i;
    }

    @Override // defpackage.ka8
    public final void a() {
        if (this.f) {
            return;
        }
        this.f = true;
        this.g.a();
        d();
    }

    @Override // defpackage.wjj
    public final void b(ka8 ka8Var) {
        if (ra8.h(this.g, ka8Var)) {
            this.g = ka8Var;
            this.a.b(this);
        }
    }

    public final void d() {
        ijj ijjVar;
        AtomicReference atomicReference = this.h;
        ijj ijjVar2 = (ijj) atomicReference.get();
        ijj ijjVar3 = j;
        if (ijjVar2 == ijjVar3 || (ijjVar = (ijj) atomicReference.getAndSet(ijjVar3)) == ijjVar3 || ijjVar == null) {
            return;
        }
        ra8.b(ijjVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x000e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        qjq qjqVar;
        Object obj;
        if (getAndIncrement() != 0) {
            return;
        }
        wjj wjjVar = this.a;
        AtomicReference atomicReference = this.h;
        int i = 1;
        while (!this.f) {
            if (this.e) {
                boolean z = atomicReference.get() == null;
                if (((Throwable) this.d.get()) != null) {
                    wjjVar.onError(this.d.b());
                    return;
                } else if (z) {
                    wjjVar.onComplete();
                    return;
                }
            }
            ijj ijjVar = (ijj) atomicReference.get();
            if (ijjVar != null && (qjqVar = ijjVar.d) != null) {
                if (ijjVar.e) {
                    boolean isEmpty = qjqVar.isEmpty();
                    if (((Throwable) this.d.get()) != null) {
                        wjjVar.onError(this.d.b());
                        return;
                    } else if (isEmpty) {
                        while (!atomicReference.compareAndSet(ijjVar, null) && atomicReference.get() == ijjVar) {
                        }
                    }
                }
                boolean z2 = false;
                while (!this.f) {
                    if (ijjVar == atomicReference.get()) {
                        if (((Throwable) this.d.get()) != null) {
                            wjjVar.onError(this.d.b());
                            return;
                        }
                        boolean z3 = ijjVar.e;
                        try {
                            obj = qjqVar.poll();
                        } catch (Throwable th) {
                            leu.a0(th);
                            this.d.a(th);
                            while (!atomicReference.compareAndSet(ijjVar, null) && atomicReference.get() == ijjVar) {
                            }
                            d();
                            this.g.a();
                            this.e = true;
                            z2 = true;
                            obj = null;
                        }
                        boolean z4 = obj == null;
                        if (z3 && z4) {
                            while (!atomicReference.compareAndSet(ijjVar, null) && atomicReference.get() == ijjVar) {
                            }
                        } else if (!z4) {
                            wjjVar.onNext(obj);
                        } else if (!z2) {
                            continue;
                        }
                    }
                    z2 = true;
                    if (!z2) {
                    }
                }
                return;
            }
            i = addAndGet(-i);
            if (i == 0) {
                return;
            }
        }
    }

    @Override // defpackage.wjj
    public final void onComplete() {
        if (this.e) {
            return;
        }
        this.e = true;
        e();
    }

    @Override // defpackage.wjj
    public final void onError(Throwable th) {
        if (this.e || !this.d.a(th)) {
            y5g.g0(th);
            return;
        }
        d();
        this.e = true;
        e();
    }

    @Override // defpackage.wjj
    public final void onNext(Object obj) {
        long j2 = this.i + 1;
        this.i = j2;
        ijj ijjVar = (ijj) this.h.get();
        if (ijjVar != null) {
            ra8.b(ijjVar);
        }
        try {
            hjj d = T0.d((X0) this.b.b, obj);
            up6.L(d, "The ObservableSource returned is null");
            ijj ijjVar2 = new ijj(this, j2, this.c);
            while (true) {
                ijj ijjVar3 = (ijj) this.h.get();
                if (ijjVar3 == j) {
                    return;
                }
                AtomicReference atomicReference = this.h;
                while (!atomicReference.compareAndSet(ijjVar3, ijjVar2)) {
                    if (atomicReference.get() != ijjVar3) {
                        break;
                    }
                }
                d.a(ijjVar2);
                return;
            }
        } catch (Throwable th) {
            leu.a0(th);
            this.g.a();
            onError(th);
        }
    }
}
