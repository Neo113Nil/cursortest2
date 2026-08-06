package defpackage;

/* loaded from: classes.dex */
public final class e10 extends defpackage.ce1 implements defpackage.k00 {
    public final /* synthetic */ defpackage.l10 JlrlGoKF;
    public /* synthetic */ java.lang.Object SH1y5HwkJhh;
    public final /* synthetic */ java.lang.String ez2rX8ReCYw;
    public final /* synthetic */ int riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e10(java.lang.String str, defpackage.l10 l10Var, defpackage.ej ejVar, int i) {
        super(2, ejVar);
        this.riuEU0zW4 = i;
        this.ez2rX8ReCYw = str;
        this.JlrlGoKF = l10Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.v7
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        java.util.LinkedHashMap linkedHashMap;
        java.util.LinkedHashMap linkedHashMap2;
        int i = this.riuEU0zW4;
        java.lang.String str = this.ez2rX8ReCYw;
        defpackage.l10 l10Var = this.JlrlGoKF;
        java.lang.Object obj2 = this.SH1y5HwkJhh;
        switch (i) {
            case 0:
                defpackage.n10 n10Var = (defpackage.n10) obj2;
                defpackage.f70.nBH8hAHy(obj);
                java.util.List list = defpackage.d01.IHQe1A4L2xu;
                defpackage.a01 IHQe1A4L2xu = defpackage.d01.IHQe1A4L2xu(str);
                if (IHQe1A4L2xu == null) {
                    return defpackage.l10.AARZUJiTa(l10Var, "No such relic.");
                }
                java.lang.String str2 = IHQe1A4L2xu.oh6vYeIP;
                com.corsair.ledger.domain.model.Rarity rarity = IHQe1A4L2xu.F7NU4MC0GW;
                n10Var.getClass();
                if (n10Var.oh6vYeIP(str) > 0) {
                    return defpackage.l10.AARZUJiTa(l10Var, str2.concat(" is already in your ledger."));
                }
                int IHQe1A4L2xu2 = rarity.IHQe1A4L2xu();
                if (n10Var.r1MBDhnF(rarity) >= IHQe1A4L2xu2) {
                    defpackage.n10 F7NU4MC0GW = defpackage.l10.F7NU4MC0GW(l10Var, defpackage.l10.oh6vYeIP(l10Var, n10Var, rarity, -IHQe1A4L2xu2), str);
                    defpackage.nv0 nv0Var = F7NU4MC0GW.xiZrDbcSW0;
                    return new defpackage.c10(defpackage.n10.IHQe1A4L2xu(F7NU4MC0GW, 0, 0, 0L, 0L, defpackage.nv0.IHQe1A4L2xu(nv0Var, 0, 0, 0, nv0Var.F7NU4MC0GW + 1, 0, 0, 0, 0, 247), null, null, null, null, 991), new defpackage.uLnPvzwk("Forged: ".concat(str2), true));
                }
                java.lang.String lowerCase = rarity.r1MBDhnF().toLowerCase(java.util.Locale.ROOT);
                lowerCase.getClass();
                return defpackage.l10.AARZUJiTa(l10Var, "You need " + IHQe1A4L2xu2 + " " + lowerCase + " shards.");
            case 1:
                defpackage.n10 n10Var2 = (defpackage.n10) obj2;
                defpackage.f70.nBH8hAHy(obj);
                java.util.List list2 = defpackage.d01.IHQe1A4L2xu;
                defpackage.a01 IHQe1A4L2xu3 = defpackage.d01.IHQe1A4L2xu(str);
                if (IHQe1A4L2xu3 == null) {
                    return defpackage.l10.AARZUJiTa(l10Var, "No such relic.");
                }
                com.corsair.ledger.domain.model.Rarity rarity2 = IHQe1A4L2xu3.F7NU4MC0GW;
                if (n10Var2.oh6vYeIP(str) <= 1) {
                    return defpackage.l10.AARZUJiTa(l10Var, "You have no spare copy to break down.");
                }
                int xiZrDbcSW0 = rarity2.xiZrDbcSW0();
                java.util.Map map = n10Var2.EXtogiMhuM;
                java.lang.Integer num = new java.lang.Integer(n10Var2.oh6vYeIP(str) - 1);
                map.getClass();
                if (map.isEmpty()) {
                    ?? singletonMap = java.util.Collections.singletonMap(str, num);
                    singletonMap.getClass();
                    linkedHashMap = singletonMap;
                } else {
                    java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap(map);
                    linkedHashMap3.put(str, num);
                    linkedHashMap = linkedHashMap3;
                }
                defpackage.n10 oh6vYeIP = defpackage.l10.oh6vYeIP(l10Var, defpackage.n10.IHQe1A4L2xu(n10Var2, 0, 0, 0L, 0L, null, null, linkedHashMap, null, null, 895), rarity2, xiZrDbcSW0);
                java.lang.String lowerCase2 = rarity2.r1MBDhnF().toLowerCase(java.util.Locale.ROOT);
                lowerCase2.getClass();
                return new defpackage.c10(oh6vYeIP, new defpackage.uLnPvzwk("Broken down for " + xiZrDbcSW0 + " " + lowerCase2 + " shards.", true));
            default:
                defpackage.n10 n10Var3 = (defpackage.n10) obj2;
                defpackage.f70.nBH8hAHy(obj);
                java.util.List list3 = defpackage.d01.IHQe1A4L2xu;
                defpackage.a01 IHQe1A4L2xu4 = defpackage.d01.IHQe1A4L2xu(str);
                if (IHQe1A4L2xu4 == null) {
                    return defpackage.l10.AARZUJiTa(l10Var, "No such relic.");
                }
                if (n10Var3.oh6vYeIP(str) <= 1) {
                    return defpackage.l10.AARZUJiTa(l10Var, "You have no spare copy to sell.");
                }
                int AARZUJiTa = IHQe1A4L2xu4.F7NU4MC0GW.AARZUJiTa();
                java.util.Map map2 = n10Var3.EXtogiMhuM;
                java.lang.Integer num2 = new java.lang.Integer(n10Var3.oh6vYeIP(str) - 1);
                map2.getClass();
                if (map2.isEmpty()) {
                    ?? singletonMap2 = java.util.Collections.singletonMap(str, num2);
                    singletonMap2.getClass();
                    linkedHashMap2 = singletonMap2;
                } else {
                    java.util.LinkedHashMap linkedHashMap4 = new java.util.LinkedHashMap(map2);
                    linkedHashMap4.put(str, num2);
                    linkedHashMap2 = linkedHashMap4;
                }
                defpackage.n10 IHQe1A4L2xu5 = defpackage.l10.IHQe1A4L2xu(l10Var, defpackage.n10.IHQe1A4L2xu(n10Var3, 0, 0, 0L, 0L, null, null, linkedHashMap2, null, null, 895), AARZUJiTa);
                defpackage.nv0 nv0Var2 = IHQe1A4L2xu5.xiZrDbcSW0;
                return new defpackage.c10(defpackage.n10.IHQe1A4L2xu(IHQe1A4L2xu5, 0, 0, 0L, 0L, defpackage.nv0.IHQe1A4L2xu(nv0Var2, 0, 0, 0, 0, 0, 0, nv0Var2.AARZUJiTa + 1, 0, 191), null, null, null, null, 991), new defpackage.uLnPvzwk(defpackage.fx0.riuEU0zW4(AARZUJiTa, "Sold for ", " doubloons."), true));
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
        return ((defpackage.e10) ez2rX8ReCYw(ejVar, n10Var)).SyNS6RMn(ok1Var);
    }

    @Override // defpackage.v7
    public final defpackage.ej ez2rX8ReCYw(defpackage.ej ejVar, java.lang.Object obj) {
        switch (this.riuEU0zW4) {
            case 0:
                defpackage.e10 e10Var = new defpackage.e10(this.ez2rX8ReCYw, this.JlrlGoKF, ejVar, 0);
                e10Var.SH1y5HwkJhh = obj;
                return e10Var;
            case 1:
                defpackage.e10 e10Var2 = new defpackage.e10(this.ez2rX8ReCYw, this.JlrlGoKF, ejVar, 1);
                e10Var2.SH1y5HwkJhh = obj;
                return e10Var2;
            default:
                defpackage.e10 e10Var3 = new defpackage.e10(this.ez2rX8ReCYw, this.JlrlGoKF, ejVar, 2);
                e10Var3.SH1y5HwkJhh = obj;
                return e10Var3;
        }
    }
}
