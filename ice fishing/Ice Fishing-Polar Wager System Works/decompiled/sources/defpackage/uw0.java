package defpackage;

/* loaded from: classes.dex */
public final class uw0 extends defpackage.ce1 implements defpackage.k00 {
    public final /* synthetic */ defpackage.k00 JlrlGoKF;
    public int SH1y5HwkJhh;
    public /* synthetic */ java.lang.Object ez2rX8ReCYw;
    public final /* synthetic */ int riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uw0(defpackage.k00 k00Var, defpackage.ej ejVar, int i) {
        super(2, ejVar);
        this.riuEU0zW4 = i;
        this.JlrlGoKF = k00Var;
    }

    @Override // defpackage.v7
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        int i = this.riuEU0zW4;
        defpackage.k00 k00Var = this.JlrlGoKF;
        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
        switch (i) {
            case 0:
                int i2 = this.SH1y5HwkJhh;
                if (i2 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    defpackage.kl0 kl0Var = (defpackage.kl0) this.ez2rX8ReCYw;
                    this.SH1y5HwkJhh = 1;
                    obj = k00Var.adDC3e2L(kl0Var, this);
                    if (obj == vjVar) {
                        return vjVar;
                    }
                } else {
                    if (i2 != 1) {
                        defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    defpackage.f70.nBH8hAHy(obj);
                }
                defpackage.kl0 kl0Var2 = (defpackage.kl0) obj;
                kl0Var2.getClass();
                ((java.util.concurrent.atomic.AtomicBoolean) kl0Var2.oh6vYeIP.xiZrDbcSW0).set(true);
                return kl0Var2;
            case 1:
                int i3 = this.SH1y5HwkJhh;
                if (i3 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    defpackage.kl0 kl0Var3 = new defpackage.kl0(new java.util.LinkedHashMap(((defpackage.kl0) this.ez2rX8ReCYw).IHQe1A4L2xu()), false);
                    this.ez2rX8ReCYw = kl0Var3;
                    this.SH1y5HwkJhh = 1;
                    return k00Var.adDC3e2L(kl0Var3, this) == vjVar ? vjVar : kl0Var3;
                }
                if (i3 != 1) {
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                defpackage.kl0 kl0Var4 = (defpackage.kl0) this.ez2rX8ReCYw;
                defpackage.f70.nBH8hAHy(obj);
                return kl0Var4;
            default:
                int i4 = this.SH1y5HwkJhh;
                if (i4 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    defpackage.uj ujVar = (defpackage.uj) this.ez2rX8ReCYw;
                    this.SH1y5HwkJhh = 1;
                    if (k00Var.adDC3e2L(ujVar, this) == vjVar) {
                        return vjVar;
                    }
                } else {
                    if (i4 != 1) {
                        defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    defpackage.f70.nBH8hAHy(obj);
                }
                return defpackage.ok1.IHQe1A4L2xu;
        }
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.riuEU0zW4;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        switch (i) {
            case 0:
                return ((defpackage.uw0) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.kl0) obj)).SyNS6RMn(ok1Var);
            case 1:
                return ((defpackage.uw0) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.kl0) obj)).SyNS6RMn(ok1Var);
            default:
                return ((defpackage.uw0) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.uj) obj)).SyNS6RMn(ok1Var);
        }
    }

    @Override // defpackage.v7
    public final defpackage.ej ez2rX8ReCYw(defpackage.ej ejVar, java.lang.Object obj) {
        int i = this.riuEU0zW4;
        defpackage.k00 k00Var = this.JlrlGoKF;
        switch (i) {
            case 0:
                defpackage.uw0 uw0Var = new defpackage.uw0(k00Var, ejVar, 0);
                uw0Var.ez2rX8ReCYw = obj;
                return uw0Var;
            case 1:
                defpackage.uw0 uw0Var2 = new defpackage.uw0(k00Var, ejVar, 1);
                uw0Var2.ez2rX8ReCYw = obj;
                return uw0Var2;
            default:
                defpackage.uw0 uw0Var3 = new defpackage.uw0(k00Var, ejVar, 2);
                uw0Var3.ez2rX8ReCYw = obj;
                return uw0Var3;
        }
    }
}
