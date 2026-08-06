package defpackage;

/* loaded from: classes.dex */
public final class fl1 implements defpackage.jj {
    public final defpackage.fl1 adDC3e2L;
    public final defpackage.bm xiZrDbcSW0;

    public fl1(defpackage.fl1 fl1Var, defpackage.bm bmVar) {
        this.adDC3e2L = fl1Var;
        this.xiZrDbcSW0 = bmVar;
    }

    @Override // defpackage.lj
    public final java.lang.Object EgCjBq0SZwJ(defpackage.k00 k00Var, java.lang.Object obj) {
        return k00Var.adDC3e2L(obj, this);
    }

    public final void IHQe1A4L2xu(defpackage.bm bmVar) {
        if (this.xiZrDbcSW0 == bmVar) {
            defpackage.db.AARZUJiTa("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
            return;
        }
        defpackage.fl1 fl1Var = this.adDC3e2L;
        if (fl1Var != null) {
            fl1Var.IHQe1A4L2xu(bmVar);
        }
    }

    @Override // defpackage.lj
    public final defpackage.lj JlrlGoKF(defpackage.lj ljVar) {
        return defpackage.ci0.hkbnNdmy(this, ljVar);
    }

    @Override // defpackage.lj
    public final defpackage.lj V7bD7b8KA(defpackage.kj kjVar) {
        return defpackage.ci0.XZx205DYe(this, kjVar);
    }

    @Override // defpackage.lj
    public final defpackage.jj cnag84Bm(defpackage.kj kjVar) {
        return defpackage.ci0.NHJTzaLwkd(this, kjVar);
    }

    @Override // defpackage.jj
    public final defpackage.kj getKey() {
        return defpackage.ad1.SH1y5HwkJhh;
    }
}
