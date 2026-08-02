package defpackage;

import com.google.common.cache.b;
import java.lang.ref.ReferenceQueue;

/* loaded from: classes3.dex */
public final class zhg implements nig {
    public volatile nig a;
    public final xop b;
    public final hhr c;

    public zhg() {
        qhg qhgVar = b.w;
        this.b = new xop();
        this.c = new hhr();
        this.a = qhgVar;
    }

    public final lcg a(Object obj, qzc qzcVar) {
        v6 jdeVar;
        try {
            this.c.b();
            if (this.a.get() == null) {
                qnh s = qzcVar.s(obj);
                return this.b.l(s) ? this.b : leu.S(s);
            }
            qzcVar.getClass();
            obj.getClass();
            kde S = leu.S(qzcVar.s(obj));
            g3a g3aVar = new g3a(29, this);
            e48 e48Var = e48.a;
            r9 r9Var = new r9();
            r9Var.h = S;
            r9Var.i = g3aVar;
            S.a(r9Var, e48Var);
            return r9Var;
        } catch (Throwable th) {
            if (this.b.m(th)) {
                jdeVar = this.b;
            } else {
                jdeVar = new jde();
                jdeVar.m(th);
            }
            if (th instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            return jdeVar;
        }
    }

    @Override // defpackage.nig
    public final boolean b() {
        return this.a.b();
    }

    @Override // defpackage.nig
    public final boolean f() {
        return true;
    }

    @Override // defpackage.nig
    public final void g(Object obj) {
        if (obj != null) {
            this.b.l(obj);
        } else {
            this.a = b.w;
        }
    }

    @Override // defpackage.nig
    public final Object get() {
        return this.a.get();
    }

    @Override // defpackage.nig
    public final int h() {
        return this.a.h();
    }

    @Override // defpackage.nig
    public final crn i() {
        return null;
    }

    @Override // defpackage.nig
    public final Object j() {
        return uwf.t(this.b);
    }

    @Override // defpackage.nig
    public final nig k(ReferenceQueue referenceQueue, Object obj, crn crnVar) {
        return this;
    }
}
