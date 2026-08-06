package defpackage;

/* loaded from: classes.dex */
public final class fj1 extends defpackage.ce1 implements defpackage.k00 {
    public final /* synthetic */ defpackage.kj1 JlrlGoKF;
    public int SH1y5HwkJhh;
    public /* synthetic */ java.lang.Object ez2rX8ReCYw;
    public final /* synthetic */ int riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fj1(defpackage.kj1 kj1Var, defpackage.ej ejVar, int i) {
        super(2, ejVar);
        this.riuEU0zW4 = i;
        this.JlrlGoKF = kj1Var;
    }

    @Override // defpackage.v7
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        defpackage.ai1 ai1Var;
        int i = this.riuEU0zW4;
        defpackage.kj1 kj1Var = this.JlrlGoKF;
        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
        defpackage.ej ejVar = null;
        switch (i) {
            case 0:
                int i2 = this.SH1y5HwkJhh;
                if (i2 != 0) {
                    if (i2 == 1) {
                        defpackage.f70.nBH8hAHy(obj);
                        return obj;
                    }
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                defpackage.f70.nBH8hAHy(obj);
                defpackage.tt0 tt0Var = (defpackage.tt0) this.ez2rX8ReCYw;
                this.SH1y5HwkJhh = 1;
                java.lang.Object IHQe1A4L2xu = defpackage.kj1.IHQe1A4L2xu(kj1Var, tt0Var, this);
                return IHQe1A4L2xu == vjVar ? vjVar : IHQe1A4L2xu;
            default:
                int i3 = this.SH1y5HwkJhh;
                try {
                    if (i3 == 0) {
                        defpackage.f70.nBH8hAHy(obj);
                        ai1Var = (defpackage.ai1) this.ez2rX8ReCYw;
                        this.ez2rX8ReCYw = ai1Var;
                        this.SH1y5HwkJhh = 1;
                        obj = ai1Var.r1MBDhnF(this);
                        if (obj == vjVar) {
                            return vjVar;
                        }
                    } else {
                        if (i3 != 1) {
                            if (i3 == 2) {
                                defpackage.f70.nBH8hAHy(obj);
                                return (java.util.Set) obj;
                            }
                            defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ai1Var = (defpackage.ai1) this.ez2rX8ReCYw;
                        defpackage.f70.nBH8hAHy(obj);
                    }
                    if (!((java.lang.Boolean) obj).booleanValue()) {
                        defpackage.zh1 zh1Var = defpackage.zh1.xiZrDbcSW0;
                        defpackage.fj1 fj1Var = new defpackage.fj1(kj1Var, ejVar, 0);
                        this.ez2rX8ReCYw = null;
                        this.SH1y5HwkJhh = 2;
                        obj = ai1Var.IHQe1A4L2xu(zh1Var, fj1Var, this);
                        if (obj == vjVar) {
                            return vjVar;
                        }
                        return (java.util.Set) obj;
                    }
                } catch (android.database.SQLException unused) {
                }
                return defpackage.rt.adDC3e2L;
        }
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.riuEU0zW4;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        switch (i) {
            case 0:
                return ((defpackage.fj1) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.tt0) obj)).SyNS6RMn(ok1Var);
            default:
                return ((defpackage.fj1) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.ai1) obj)).SyNS6RMn(ok1Var);
        }
    }

    @Override // defpackage.v7
    public final defpackage.ej ez2rX8ReCYw(defpackage.ej ejVar, java.lang.Object obj) {
        int i = this.riuEU0zW4;
        defpackage.kj1 kj1Var = this.JlrlGoKF;
        switch (i) {
            case 0:
                defpackage.fj1 fj1Var = new defpackage.fj1(kj1Var, ejVar, 0);
                fj1Var.ez2rX8ReCYw = obj;
                return fj1Var;
            default:
                defpackage.fj1 fj1Var2 = new defpackage.fj1(kj1Var, ejVar, 1);
                fj1Var2.ez2rX8ReCYw = obj;
                return fj1Var2;
        }
    }
}
