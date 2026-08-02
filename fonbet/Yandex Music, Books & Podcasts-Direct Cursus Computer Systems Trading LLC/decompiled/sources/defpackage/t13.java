package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public abstract class t13 extends wft implements r13 {
    public Object k;

    @Override // defpackage.orq, defpackage.srq
    public void c() {
        super.c();
        if (this.k != null) {
            x97.y(this, null, null, new cs1(this, (Continuation) null, 8), 3);
        }
    }

    @Override // defpackage.orq, defpackage.srq
    public void d() {
        super.d();
        this.k = null;
    }

    @Override // defpackage.r13
    public final void e(Object obj) {
        this.k = obj;
        if (this.c.e) {
            x97.y(this, null, null, new cs1(this, (Continuation) null, 8), 3);
        }
    }

    public abstract Object p(Object obj, cs1 cs1Var);
}
