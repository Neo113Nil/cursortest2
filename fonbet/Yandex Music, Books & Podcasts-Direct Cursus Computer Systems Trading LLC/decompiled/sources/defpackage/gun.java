package defpackage;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class gun implements mm6, eun {
    public static final ku3 e = new ku3();
    public final CoroutineContext a;
    public final CoroutineContext b;
    public final gun c = this;
    public volatile CoroutineContext d;

    public gun(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
        this.a = coroutineContext;
        this.b = coroutineContext2;
    }

    public final void a() {
        synchronized (this.c) {
            try {
                CoroutineContext coroutineContext = this.d;
                if (coroutineContext == null) {
                    this.d = e;
                } else {
                    saf.B(coroutineContext, new yrc(0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.eun
    public final void d() {
        a();
    }

    @Override // defpackage.eun
    public final void e() {
        a();
    }

    @Override // defpackage.mm6
    public final CoroutineContext getCoroutineContext() {
        CoroutineContext coroutineContext;
        CoroutineContext coroutineContext2 = this.d;
        if (coroutineContext2 == null || coroutineContext2 == e) {
            synchronized (this.c) {
                try {
                    coroutineContext = this.d;
                    if (coroutineContext == null) {
                        CoroutineContext coroutineContext3 = this.a;
                        coroutineContext = coroutineContext3.plus(new w2f((r2f) coroutineContext3.get(o6c.l))).plus(this.b);
                    } else if (coroutineContext == e) {
                        CoroutineContext coroutineContext4 = this.a;
                        w2f w2fVar = new w2f((r2f) coroutineContext4.get(o6c.l));
                        w2fVar.t(new yrc(0));
                        coroutineContext = coroutineContext4.plus(w2fVar).plus(this.b);
                    }
                    this.d = coroutineContext;
                } catch (Throwable th) {
                    throw th;
                }
            }
            coroutineContext2 = coroutineContext;
        }
        coroutineContext2.getClass();
        return coroutineContext2;
    }

    @Override // defpackage.eun
    public final void b() {
    }
}
