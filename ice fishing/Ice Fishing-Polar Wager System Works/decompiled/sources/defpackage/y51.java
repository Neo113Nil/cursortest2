package defpackage;

/* loaded from: classes.dex */
public final class y51 extends defpackage.ce1 implements defpackage.k00 {
    public /* synthetic */ long JlrlGoKF;
    public int SH1y5HwkJhh;
    public final /* synthetic */ java.lang.Object ez2rX8ReCYw;
    public final /* synthetic */ int riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y51(java.lang.Object obj, long j, defpackage.ej ejVar, int i) {
        super(2, ejVar);
        this.riuEU0zW4 = i;
        this.ez2rX8ReCYw = obj;
        this.JlrlGoKF = j;
    }

    @Override // defpackage.v7
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        int i = this.riuEU0zW4;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        java.lang.Object obj2 = this.ez2rX8ReCYw;
        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
        defpackage.ej ejVar = null;
        switch (i) {
            case 0:
                int i2 = this.SH1y5HwkJhh;
                if (i2 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    defpackage.i61 i61Var = ((defpackage.a61) obj2).WLpAkxCo;
                    defpackage.x51 x51Var = new defpackage.x51(this.JlrlGoKF, null);
                    this.SH1y5HwkJhh = 1;
                    if (i61Var.xiZrDbcSW0(defpackage.am0.xiZrDbcSW0, x51Var, this) == vjVar) {
                        break;
                    }
                } else if (i2 != 1) {
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    defpackage.f70.nBH8hAHy(obj);
                    break;
                }
                break;
            case 1:
                int i3 = this.SH1y5HwkJhh;
                if (i3 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    defpackage.i61 i61Var2 = ((defpackage.a61) obj2).WLpAkxCo;
                    long j = this.JlrlGoKF;
                    this.SH1y5HwkJhh = 1;
                    if (i61Var2.oh6vYeIP(j, true, this) == vjVar) {
                        break;
                    }
                } else if (i3 != 1) {
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    defpackage.f70.nBH8hAHy(obj);
                    break;
                }
                break;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                int i4 = this.SH1y5HwkJhh;
                if (i4 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    long j2 = this.JlrlGoKF;
                    defpackage.i61 i61Var3 = ((defpackage.a61) obj2).WLpAkxCo;
                    this.SH1y5HwkJhh = 1;
                    java.lang.Object IHQe1A4L2xu = defpackage.u51.IHQe1A4L2xu(i61Var3, j2, this);
                    if (IHQe1A4L2xu == vjVar) {
                        break;
                    }
                } else if (i4 != 1) {
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    defpackage.f70.nBH8hAHy(obj);
                    break;
                }
                break;
            default:
                int i5 = this.SH1y5HwkJhh;
                if (i5 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    defpackage.l10 l10Var = (defpackage.l10) obj2;
                    com.corsair.ledger.data.local.CorsairDatabase corsairDatabase = l10Var.IHQe1A4L2xu;
                    defpackage.j10 j10Var = new defpackage.j10(l10Var, this.JlrlGoKF, null);
                    this.SH1y5HwkJhh = 1;
                    if (defpackage.s70.WLpAkxCo(corsairDatabase, new defpackage.dddYo2RGJ(corsairDatabase, j10Var, ejVar, 3), this) == vjVar) {
                        break;
                    }
                } else if (i5 != 1) {
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    defpackage.f70.nBH8hAHy(obj);
                    break;
                }
                break;
        }
        return vjVar;
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.riuEU0zW4;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        switch (i) {
            case 0:
                return ((defpackage.y51) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.uj) obj)).SyNS6RMn(ok1Var);
            case 1:
                return ((defpackage.y51) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.uj) obj)).SyNS6RMn(ok1Var);
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                long j = ((defpackage.gq0) obj).IHQe1A4L2xu;
                defpackage.y51 y51Var = new defpackage.y51((defpackage.a61) this.ez2rX8ReCYw, (defpackage.ej) obj2);
                y51Var.JlrlGoKF = j;
                return y51Var.SyNS6RMn(ok1Var);
            default:
                return ((defpackage.y51) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.uj) obj)).SyNS6RMn(ok1Var);
        }
    }

    @Override // defpackage.v7
    public final defpackage.ej ez2rX8ReCYw(defpackage.ej ejVar, java.lang.Object obj) {
        int i = this.riuEU0zW4;
        java.lang.Object obj2 = this.ez2rX8ReCYw;
        switch (i) {
            case 0:
                return new defpackage.y51((defpackage.a61) obj2, this.JlrlGoKF, ejVar, 0);
            case 1:
                return new defpackage.y51((defpackage.a61) obj2, this.JlrlGoKF, ejVar, 1);
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.y51 y51Var = new defpackage.y51((defpackage.a61) obj2, ejVar);
                y51Var.JlrlGoKF = ((defpackage.gq0) obj).IHQe1A4L2xu;
                return y51Var;
            default:
                return new defpackage.y51((defpackage.l10) obj2, this.JlrlGoKF, ejVar, 3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y51(defpackage.a61 a61Var, defpackage.ej ejVar) {
        super(2, ejVar);
        this.riuEU0zW4 = 2;
        this.ez2rX8ReCYw = a61Var;
    }
}
