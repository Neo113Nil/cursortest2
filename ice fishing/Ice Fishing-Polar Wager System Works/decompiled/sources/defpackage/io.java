package defpackage;

/* loaded from: classes.dex */
public final class io extends defpackage.ce1 implements defpackage.k00 {
    public final /* synthetic */ java.lang.Object JlrlGoKF;
    public /* synthetic */ java.lang.Object SH1y5HwkJhh;
    public final /* synthetic */ java.lang.Object ez2rX8ReCYw;
    public final /* synthetic */ int riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public io(defpackage.sl0 sl0Var, defpackage.no noVar, defpackage.gb1 gb1Var, defpackage.ej ejVar) {
        super(2, ejVar);
        this.riuEU0zW4 = 0;
        this.SH1y5HwkJhh = sl0Var;
        this.ez2rX8ReCYw = noVar;
        this.JlrlGoKF = gb1Var;
    }

    @Override // defpackage.v7
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        int i = this.riuEU0zW4;
        java.lang.Object obj2 = this.ez2rX8ReCYw;
        java.lang.Object obj3 = this.JlrlGoKF;
        switch (i) {
            case 0:
                defpackage.f70.nBH8hAHy(obj);
                defpackage.no noVar = (defpackage.no) obj2;
                defpackage.gb1 gb1Var = (defpackage.gb1) obj3;
                for (defpackage.nm0 nm0Var : (java.util.Set) ((defpackage.sl0) this.SH1y5HwkJhh).getValue()) {
                    if (!((java.util.List) noVar.oh6vYeIP().adDC3e2L.adDC3e2L.getValue()).contains(nm0Var) && !gb1Var.contains(nm0Var)) {
                        noVar.oh6vYeIP().r1MBDhnF(nm0Var);
                    }
                }
                return defpackage.ok1.IHQe1A4L2xu;
            case 1:
                defpackage.l10 l10Var = (defpackage.l10) obj3;
                defpackage.n10 n10Var = (defpackage.n10) this.SH1y5HwkJhh;
                defpackage.f70.nBH8hAHy(obj);
                java.util.Set set = n10Var.riuEU0zW4;
                defpackage.o01 o01Var = (defpackage.o01) obj2;
                java.lang.String str = o01Var.xiZrDbcSW0;
                int i2 = o01Var.AARZUJiTa;
                if (set.contains(o01Var)) {
                    return defpackage.l10.AARZUJiTa(l10Var, "That reward is already banked.");
                }
                java.util.Map map = n10Var.EXtogiMhuM;
                map.getClass();
                java.util.List list = (java.util.List) defpackage.yh0.p4kuH6PDtgom(o01Var, defpackage.d01.r1MBDhnF);
                int i3 = 0;
                if (list == null || !list.isEmpty()) {
                    java.util.Iterator it = list.iterator();
                    int i4 = 0;
                    while (it.hasNext()) {
                        java.lang.Integer num = (java.lang.Integer) map.get(((defpackage.a01) it.next()).IHQe1A4L2xu);
                        if ((num != null ? num.intValue() : 0) > 0 && (i4 = i4 + 1) < 0) {
                            defpackage.fm.lpprD5VAS();
                            throw null;
                        }
                    }
                    i3 = i4;
                }
                if (i3 != 8) {
                    return defpackage.l10.AARZUJiTa(l10Var, str.concat(" is not complete yet."));
                }
                return new defpackage.c10(defpackage.l10.IHQe1A4L2xu(l10Var, defpackage.n10.IHQe1A4L2xu(n10Var, 0, 0, 0L, 0L, null, null, null, defpackage.e81.QPwENk36pDC(n10Var.riuEU0zW4, o01Var), null, 767), i2), new defpackage.uLnPvzwk(str + " complete: +" + i2 + " doubloons, +2 energy hold.", true));
            default:
                defpackage.l10 l10Var2 = (defpackage.l10) obj3;
                defpackage.n10 n10Var2 = (defpackage.n10) this.SH1y5HwkJhh;
                defpackage.f70.nBH8hAHy(obj);
                com.corsair.ledger.domain.model.Rarity rarity = (com.corsair.ledger.domain.model.Rarity) obj2;
                com.corsair.ledger.domain.model.Rarity adDC3e2L = rarity.adDC3e2L();
                if (adDC3e2L == null) {
                    return defpackage.l10.AARZUJiTa(l10Var2, "Legendary shards cannot be traded up.");
                }
                if (n10Var2.r1MBDhnF(rarity) < 5) {
                    java.lang.String lowerCase = rarity.r1MBDhnF().toLowerCase(java.util.Locale.ROOT);
                    lowerCase.getClass();
                    return defpackage.l10.AARZUJiTa(l10Var2, "You need 5 " + lowerCase + " shards.");
                }
                defpackage.n10 oh6vYeIP = defpackage.l10.oh6vYeIP(l10Var2, defpackage.l10.oh6vYeIP(l10Var2, n10Var2, rarity, -5), adDC3e2L, 1);
                defpackage.nv0 nv0Var = oh6vYeIP.xiZrDbcSW0;
                defpackage.n10 IHQe1A4L2xu = defpackage.n10.IHQe1A4L2xu(oh6vYeIP, 0, 0, 0L, 0L, defpackage.nv0.IHQe1A4L2xu(nv0Var, 0, 0, 0, 0, 0, nv0Var.xiZrDbcSW0 + 1, 0, 0, 223), null, null, null, null, 991);
                java.lang.String lowerCase2 = adDC3e2L.r1MBDhnF().toLowerCase(java.util.Locale.ROOT);
                lowerCase2.getClass();
                return new defpackage.c10(IHQe1A4L2xu, new defpackage.uLnPvzwk("Traded up to 1 " + lowerCase2 + " shard.", true));
        }
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.riuEU0zW4;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        switch (i) {
            case 0:
                ((defpackage.io) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.uj) obj)).SyNS6RMn(ok1Var);
                return ok1Var;
            case 1:
                return ((defpackage.io) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.n10) obj)).SyNS6RMn(ok1Var);
            default:
                return ((defpackage.io) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.n10) obj)).SyNS6RMn(ok1Var);
        }
    }

    @Override // defpackage.v7
    public final defpackage.ej ez2rX8ReCYw(defpackage.ej ejVar, java.lang.Object obj) {
        int i = this.riuEU0zW4;
        java.lang.Object obj2 = this.JlrlGoKF;
        java.lang.Object obj3 = this.ez2rX8ReCYw;
        switch (i) {
            case 0:
                return new defpackage.io((defpackage.sl0) this.SH1y5HwkJhh, (defpackage.no) obj3, (defpackage.gb1) obj2, ejVar);
            case 1:
                defpackage.io ioVar = new defpackage.io((defpackage.o01) obj3, (defpackage.l10) obj2, ejVar, 1);
                ioVar.SH1y5HwkJhh = obj;
                return ioVar;
            default:
                defpackage.io ioVar2 = new defpackage.io((com.corsair.ledger.domain.model.Rarity) obj3, (defpackage.l10) obj2, ejVar, 2);
                ioVar2.SH1y5HwkJhh = obj;
                return ioVar2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ io(java.lang.Enum r1, defpackage.l10 l10Var, defpackage.ej ejVar, int i) {
        super(2, ejVar);
        this.riuEU0zW4 = i;
        this.ez2rX8ReCYw = r1;
        this.JlrlGoKF = l10Var;
    }
}
