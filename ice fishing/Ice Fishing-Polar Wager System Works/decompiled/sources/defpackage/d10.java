package defpackage;

/* loaded from: classes.dex */
public final class d10 extends defpackage.ce1 implements defpackage.k00 {
    public final /* synthetic */ defpackage.l10 JlrlGoKF;
    public /* synthetic */ java.lang.Object SH1y5HwkJhh;
    public final /* synthetic */ long ez2rX8ReCYw;
    public final /* synthetic */ int riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d10(defpackage.l10 l10Var, long j, defpackage.ej ejVar) {
        super(2, ejVar);
        this.riuEU0zW4 = 0;
        this.JlrlGoKF = l10Var;
        this.ez2rX8ReCYw = j;
    }

    @Override // defpackage.v7
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        defpackage.j11 j11Var;
        int i = this.riuEU0zW4;
        defpackage.l10 l10Var = this.JlrlGoKF;
        long j = this.ez2rX8ReCYw;
        switch (i) {
            case 0:
                defpackage.n10 n10Var = (defpackage.n10) this.SH1y5HwkJhh;
                defpackage.f70.nBH8hAHy(obj);
                if (n10Var.IHQe1A4L2xu < 500) {
                    return defpackage.l10.AARZUJiTa(l10Var, "You need 500 doubloons.");
                }
                java.util.ArrayList mAr5m2L7gYDP = defpackage.x70.mAr5m2L7gYDP(n10Var);
                if (mAr5m2L7gYDP.isEmpty()) {
                    return defpackage.l10.AARZUJiTa(l10Var, "The trader has nothing you do not already own.");
                }
                defpackage.a01 a01Var = (defpackage.a01) mAr5m2L7gYDP.get(defpackage.l80.IHQe1A4L2xu(j).r1MBDhnF(0, mAr5m2L7gYDP.size()));
                defpackage.n10 F7NU4MC0GW = defpackage.l10.F7NU4MC0GW(l10Var, defpackage.l10.IHQe1A4L2xu(l10Var, n10Var, -500), a01Var.IHQe1A4L2xu);
                defpackage.nv0 nv0Var = F7NU4MC0GW.xiZrDbcSW0;
                return new defpackage.c10(defpackage.n10.IHQe1A4L2xu(F7NU4MC0GW, 0, 0, 0L, 0L, defpackage.nv0.IHQe1A4L2xu(nv0Var, 0, 0, 0, 0, 0, nv0Var.xiZrDbcSW0 + 1, 0, 0, 223), null, null, null, null, 991), new defpackage.uLnPvzwk("The chart led you to: ".concat(a01Var.oh6vYeIP), true));
            case 1:
                defpackage.n10 n10Var2 = (defpackage.n10) this.SH1y5HwkJhh;
                defpackage.f70.nBH8hAHy(obj);
                int size = (n10Var2.riuEU0zW4.size() * 2) + 20;
                int i2 = n10Var2.oh6vYeIP;
                long j2 = n10Var2.r1MBDhnF;
                long j3 = this.ez2rX8ReCYw;
                long min = java.lang.Math.min(j2, j3);
                if (i2 >= size) {
                    j11Var = new defpackage.j11(i2, j3, 0L);
                } else {
                    int i3 = (int) ((j3 - min) / 240000);
                    int i4 = i2 + i3;
                    int i5 = i4 > size ? size : i4;
                    if (i5 >= size) {
                        j11Var = new defpackage.j11(i5, j3, 0L);
                    } else {
                        long j4 = (i3 * 240000) + min;
                        j11Var = new defpackage.j11(i5, j4, defpackage.x80.DFo87pBq1E5((j4 + 240000) - j3, 0L, 240000L));
                    }
                }
                if (j11Var.IHQe1A4L2xu >= size) {
                    return defpackage.l10.AARZUJiTa(l10Var, "Your hold is already full.");
                }
                if (n10Var2.IHQe1A4L2xu < 60) {
                    return defpackage.l10.AARZUJiTa(l10Var, "You need 60 doubloons.");
                }
                defpackage.n10 r1MBDhnF = defpackage.l10.r1MBDhnF(l10Var, defpackage.l10.IHQe1A4L2xu(l10Var, n10Var2, -60), j);
                defpackage.nv0 nv0Var2 = r1MBDhnF.xiZrDbcSW0;
                return new defpackage.c10(defpackage.n10.IHQe1A4L2xu(r1MBDhnF, 0, 0, 0L, 0L, defpackage.nv0.IHQe1A4L2xu(nv0Var2, 0, 0, 0, 0, 0, nv0Var2.xiZrDbcSW0 + 1, 0, 0, 223), null, null, null, null, 991), new defpackage.uLnPvzwk("+5 energy.", true));
            default:
                defpackage.n10 n10Var3 = (defpackage.n10) this.SH1y5HwkJhh;
                defpackage.f70.nBH8hAHy(obj);
                long j5 = n10Var3.F7NU4MC0GW;
                return ((j5 > 0L ? 1 : (j5 == 0L ? 0 : -1)) <= 0 ? 0L : defpackage.x80.DFo87pBq1E5((java.lang.Math.min(j5, j) + 86400000) - j, 0L, 86400000L)) > 0 ? defpackage.l10.AARZUJiTa(l10Var, "The chest is still locked.") : new defpackage.c10(defpackage.n10.IHQe1A4L2xu(defpackage.l10.r1MBDhnF(l10Var, defpackage.l10.oh6vYeIP(l10Var, defpackage.l10.IHQe1A4L2xu(l10Var, n10Var3, 150), com.corsair.ledger.domain.model.Rarity.COMMON, 10), j), 0, 0, 0L, this.ez2rX8ReCYw, null, null, null, null, null, 1015), new defpackage.uLnPvzwk("Daily chest: +150 doubloons, +5 energy, +10 common shards.", true));
        }
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.riuEU0zW4;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        defpackage.n10 n10Var = (defpackage.n10) obj;
        defpackage.ej ejVar = (defpackage.ej) obj2;
        switch (i) {
        }
        return ((defpackage.d10) ez2rX8ReCYw(ejVar, n10Var)).SyNS6RMn(ok1Var);
    }

    @Override // defpackage.v7
    public final defpackage.ej ez2rX8ReCYw(defpackage.ej ejVar, java.lang.Object obj) {
        switch (this.riuEU0zW4) {
            case 0:
                defpackage.d10 d10Var = new defpackage.d10(this.JlrlGoKF, this.ez2rX8ReCYw, ejVar);
                d10Var.SH1y5HwkJhh = obj;
                return d10Var;
            case 1:
                defpackage.d10 d10Var2 = new defpackage.d10(this.ez2rX8ReCYw, this.JlrlGoKF, ejVar, 1);
                d10Var2.SH1y5HwkJhh = obj;
                return d10Var2;
            default:
                defpackage.d10 d10Var3 = new defpackage.d10(this.ez2rX8ReCYw, this.JlrlGoKF, ejVar, 2);
                d10Var3.SH1y5HwkJhh = obj;
                return d10Var3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d10(long j, defpackage.l10 l10Var, defpackage.ej ejVar, int i) {
        super(2, ejVar);
        this.riuEU0zW4 = i;
        this.ez2rX8ReCYw = j;
        this.JlrlGoKF = l10Var;
    }
}
