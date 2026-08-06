package defpackage;

/* loaded from: classes.dex */
public final class wg1 extends defpackage.ce1 implements defpackage.k00 {
    public /* synthetic */ float JlrlGoKF;
    public int SH1y5HwkJhh;
    public final /* synthetic */ java.lang.Object ez2rX8ReCYw;
    public final /* synthetic */ int riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wg1(defpackage.xg1 xg1Var, float f, defpackage.ej ejVar, int i) {
        super(2, ejVar);
        this.riuEU0zW4 = i;
        this.ez2rX8ReCYw = xg1Var;
        this.JlrlGoKF = f;
    }

    @Override // defpackage.v7
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        int i = this.riuEU0zW4;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
        java.lang.Object obj2 = this.ez2rX8ReCYw;
        switch (i) {
            case 0:
                defpackage.xg1 xg1Var = (defpackage.xg1) obj2;
                int i2 = this.SH1y5HwkJhh;
                if (i2 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    defpackage.w3 w3Var = xg1Var.abhbClRa;
                    if (w3Var == null) {
                        return ok1Var;
                    }
                    java.lang.Float f = new java.lang.Float(this.JlrlGoKF);
                    defpackage.c5 c5Var = xg1Var.V7bD7b8KA ? defpackage.ke1.xiZrDbcSW0 : xg1Var.kNAkVymC;
                    this.SH1y5HwkJhh = 1;
                    obj = defpackage.w3.r1MBDhnF(w3Var, f, c5Var, null, this, 12);
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
                return ok1Var;
            case 1:
                defpackage.xg1 xg1Var2 = (defpackage.xg1) obj2;
                int i3 = this.SH1y5HwkJhh;
                if (i3 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    defpackage.w3 w3Var2 = xg1Var2.PAEGRtP0bX;
                    if (w3Var2 == null) {
                        return ok1Var;
                    }
                    java.lang.Float f2 = new java.lang.Float(this.JlrlGoKF);
                    defpackage.c5 c5Var2 = xg1Var2.V7bD7b8KA ? defpackage.ke1.xiZrDbcSW0 : xg1Var2.kNAkVymC;
                    this.SH1y5HwkJhh = 1;
                    obj = defpackage.w3.r1MBDhnF(w3Var2, f2, c5Var2, null, this, 12);
                    if (obj == vjVar) {
                        return vjVar;
                    }
                } else {
                    if (i3 != 1) {
                        defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    defpackage.f70.nBH8hAHy(obj);
                }
                return ok1Var;
            default:
                defpackage.pg pgVar = (defpackage.pg) obj2;
                int i4 = this.SH1y5HwkJhh;
                if (i4 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    float f3 = this.JlrlGoKF;
                    java.lang.Object AARZUJiTa = pgVar.IHQe1A4L2xu.F7NU4MC0GW.adDC3e2L.AARZUJiTa(defpackage.a71.adDC3e2L);
                    defpackage.k00 k00Var = (defpackage.k00) (AARZUJiTa != null ? AARZUJiTa : null);
                    if (k00Var == null) {
                        throw defpackage.fx0.AARZUJiTa("Required value was null.");
                    }
                    defpackage.gq0 gq0Var = new defpackage.gq0((java.lang.Float.floatToRawIntBits(0.0f) << 32) | (java.lang.Float.floatToRawIntBits(f3) & 4294967295L));
                    this.SH1y5HwkJhh = 1;
                    obj = k00Var.adDC3e2L(gq0Var, this);
                    if (obj == vjVar) {
                        return vjVar;
                    }
                } else {
                    if (i4 != 1) {
                        defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    defpackage.f70.nBH8hAHy(obj);
                }
                return new java.lang.Float(java.lang.Float.intBitsToFloat((int) (((defpackage.gq0) obj).IHQe1A4L2xu & 4294967295L)));
        }
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.riuEU0zW4;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        switch (i) {
            case 0:
                return ((defpackage.wg1) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.uj) obj)).SyNS6RMn(ok1Var);
            case 1:
                return ((defpackage.wg1) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.uj) obj)).SyNS6RMn(ok1Var);
            default:
                return ((defpackage.wg1) ez2rX8ReCYw((defpackage.ej) obj2, java.lang.Float.valueOf(((java.lang.Number) obj).floatValue()))).SyNS6RMn(ok1Var);
        }
    }

    @Override // defpackage.v7
    public final defpackage.ej ez2rX8ReCYw(defpackage.ej ejVar, java.lang.Object obj) {
        int i = this.riuEU0zW4;
        java.lang.Object obj2 = this.ez2rX8ReCYw;
        switch (i) {
            case 0:
                return new defpackage.wg1((defpackage.xg1) obj2, this.JlrlGoKF, ejVar, 0);
            case 1:
                return new defpackage.wg1((defpackage.xg1) obj2, this.JlrlGoKF, ejVar, 1);
            default:
                defpackage.wg1 wg1Var = new defpackage.wg1((defpackage.pg) obj2, ejVar);
                wg1Var.JlrlGoKF = ((java.lang.Number) obj).floatValue();
                return wg1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg1(defpackage.pg pgVar, defpackage.ej ejVar) {
        super(2, ejVar);
        this.riuEU0zW4 = 2;
        this.ez2rX8ReCYw = pgVar;
    }
}
