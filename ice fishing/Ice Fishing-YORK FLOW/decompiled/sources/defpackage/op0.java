package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class op0 {
    public final java.util.LinkedHashMap JhCgjQRTAOCT;
    public final java.util.ArrayList WDYagTQQm9ns;
    public final defpackage.yq0 ZpBGe2uQfcn8;
    public final java.lang.String fWTAfUmVKrZq;
    public final int giKS3J6vZuNy;
    public final java.util.LinkedHashMap oh71FJcDz6S2;

    public op0(defpackage.yq0 yq0Var, defpackage.ne neVar, java.util.Map map) {
        java.lang.String str;
        map.getClass();
        int oCu53ZX2v4Ju = neVar != null ? defpackage.w60.oCu53ZX2v4Ju(defpackage.t80.BXaznwstz2U0(neVar)) : -1;
        int i = 0;
        if (neVar != null) {
            defpackage.rb0 BXaznwstz2U0 = defpackage.t80.BXaznwstz2U0(neVar);
            if (BXaznwstz2U0 instanceof defpackage.l01) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot generate route pattern from polymorphic class ");
                defpackage.ne UmgHb6n58gfG = defpackage.ok0.UmgHb6n58gfG(((defpackage.l01) BXaznwstz2U0).giKS3J6vZuNy());
                sb.append(UmgHb6n58gfG != null ? UmgHb6n58gfG.fWTAfUmVKrZq() : null);
                sb.append(". Routes can only be generated from concrete classes or objects.");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            defpackage.s81 s81Var = new defpackage.s81(BXaznwstz2U0);
            defpackage.cd cdVar = new defpackage.cd(4, s81Var);
            int fWTAfUmVKrZq = BXaznwstz2U0.giKS3J6vZuNy().fWTAfUmVKrZq();
            for (int i2 = 0; i2 < fWTAfUmVKrZq; i2++) {
                java.lang.String JhCgjQRTAOCT = BXaznwstz2U0.giKS3J6vZuNy().JhCgjQRTAOCT(i2);
                defpackage.oq0 h3m55N1URyyK = defpackage.w60.h3m55N1URyyK(BXaznwstz2U0.giKS3J6vZuNy().QiMR8OkAhezm(i2), map);
                if (h3m55N1URyyK == null) {
                    defpackage.h7.w7APNrr0aGRc(defpackage.w60.z16KqenTjq8o(JhCgjQRTAOCT, BXaznwstz2U0.giKS3J6vZuNy().QiMR8OkAhezm(i2).ZpBGe2uQfcn8(), BXaznwstz2U0.giKS3J6vZuNy().ZpBGe2uQfcn8(), map.toString()));
                    throw null;
                }
                cdVar.JhCgjQRTAOCT(java.lang.Integer.valueOf(i2), JhCgjQRTAOCT, h3m55N1URyyK);
            }
            str = ((java.lang.String) s81Var.oh71FJcDz6S2) + ((java.lang.String) s81Var.QiMR8OkAhezm) + ((java.lang.String) s81Var.P05cfTpS5W5L);
        } else {
            str = null;
        }
        this.ZpBGe2uQfcn8 = yq0Var;
        this.giKS3J6vZuNy = oCu53ZX2v4Ju;
        this.fWTAfUmVKrZq = str;
        this.JhCgjQRTAOCT = new java.util.LinkedHashMap();
        this.WDYagTQQm9ns = new java.util.ArrayList();
        this.oh71FJcDz6S2 = new java.util.LinkedHashMap();
        if (neVar != null) {
            defpackage.rb0 BXaznwstz2U02 = defpackage.t80.BXaznwstz2U0(neVar);
            if (BXaznwstz2U02 instanceof defpackage.l01) {
                throw new java.lang.IllegalArgumentException("Cannot generate NavArguments for polymorphic serializer " + BXaznwstz2U02 + ". Arguments can only be generated from concrete classes or objects.");
            }
            int fWTAfUmVKrZq2 = BXaznwstz2U02.giKS3J6vZuNy().fWTAfUmVKrZq();
            java.util.ArrayList arrayList = new java.util.ArrayList(fWTAfUmVKrZq2);
            for (int i3 = 0; i3 < fWTAfUmVKrZq2; i3++) {
                java.lang.String JhCgjQRTAOCT2 = BXaznwstz2U02.giKS3J6vZuNy().JhCgjQRTAOCT(i3);
                JhCgjQRTAOCT2.getClass();
                defpackage.hc1 QiMR8OkAhezm = BXaznwstz2U02.giKS3J6vZuNy().QiMR8OkAhezm(i3);
                boolean oh71FJcDz6S2 = QiMR8OkAhezm.oh71FJcDz6S2();
                defpackage.oq0 h3m55N1URyyK2 = defpackage.w60.h3m55N1URyyK(QiMR8OkAhezm, map);
                if (h3m55N1URyyK2 == null) {
                    defpackage.h7.w7APNrr0aGRc(defpackage.w60.z16KqenTjq8o(JhCgjQRTAOCT2, QiMR8OkAhezm.ZpBGe2uQfcn8(), BXaznwstz2U02.giKS3J6vZuNy().ZpBGe2uQfcn8(), map.toString()));
                    throw null;
                }
                arrayList.add(new defpackage.vo0(JhCgjQRTAOCT2, new defpackage.wo0(h3m55N1URyyK2, oh71FJcDz6S2, BXaznwstz2U02.giKS3J6vZuNy().P05cfTpS5W5L(i3))));
            }
            int size = arrayList.size();
            while (i < size) {
                java.lang.Object obj = arrayList.get(i);
                i++;
                defpackage.vo0 vo0Var = (defpackage.vo0) obj;
                this.JhCgjQRTAOCT.put(vo0Var.ZpBGe2uQfcn8, vo0Var.giKS3J6vZuNy);
            }
        }
    }

    public defpackage.np0 ZpBGe2uQfcn8() {
        defpackage.np0 giKS3J6vZuNy = giKS3J6vZuNy();
        giKS3J6vZuNy.getClass();
        defpackage.qp0 qp0Var = giKS3J6vZuNy.oh71FJcDz6S2;
        for (java.util.Map.Entry entry : this.JhCgjQRTAOCT.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            defpackage.wo0 wo0Var = (defpackage.wo0) entry.getValue();
            str.getClass();
            wo0Var.getClass();
            qp0Var.getClass();
            ((java.util.LinkedHashMap) qp0Var.JhCgjQRTAOCT).put(str, wo0Var);
        }
        java.util.ArrayList arrayList = this.WDYagTQQm9ns;
        int size = arrayList.size();
        final int i = 0;
        int i2 = 0;
        while (i2 < size) {
            java.lang.Object obj = arrayList.get(i2);
            i2++;
            final defpackage.kp0 kp0Var = (defpackage.kp0) obj;
            kp0Var.getClass();
            qp0Var.getClass();
            java.util.ArrayList BXaznwstz2U0 = defpackage.w60.BXaznwstz2U0((java.util.LinkedHashMap) qp0Var.JhCgjQRTAOCT, new defpackage.y10() { // from class: pp0
                @Override // defpackage.y10
                public final java.lang.Object P05cfTpS5W5L(java.lang.Object obj2) {
                    boolean contains;
                    int i3 = i;
                    defpackage.kp0 kp0Var2 = kp0Var;
                    java.lang.String str2 = (java.lang.String) obj2;
                    switch (i3) {
                        case 0:
                            str2.getClass();
                            contains = kp0Var2.fWTAfUmVKrZq().contains(str2);
                            break;
                        default:
                            str2.getClass();
                            contains = kp0Var2.fWTAfUmVKrZq().contains(str2);
                            break;
                    }
                    return java.lang.Boolean.valueOf(!contains);
                }
            });
            if (!BXaznwstz2U0.isEmpty()) {
                throw new java.lang.IllegalArgumentException(("Deep link " + kp0Var.ZpBGe2uQfcn8 + " can't be used to open destination " + ((defpackage.np0) qp0Var.giKS3J6vZuNy) + ".\nFollowing required arguments are missing: " + BXaznwstz2U0).toString());
            }
            ((java.util.ArrayList) qp0Var.fWTAfUmVKrZq).add(kp0Var);
        }
        java.util.Iterator it = this.oh71FJcDz6S2.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry2 = (java.util.Map.Entry) it.next();
            ((java.lang.Number) entry2.getKey()).intValue();
            entry2.getValue().getClass();
            defpackage.p81.ZpBGe2uQfcn8();
            return null;
        }
        java.lang.String str2 = this.fWTAfUmVKrZq;
        if (str2 != null) {
            qp0Var.getClass();
            if (defpackage.tg1.PS16moFv2oLu(str2)) {
                defpackage.h7.w7APNrr0aGRc("Cannot have an empty route");
                return null;
            }
            java.lang.String concat = "android-app://androidx.navigation/".concat(str2);
            final defpackage.kp0 kp0Var2 = new defpackage.kp0(concat);
            final int i3 = 1;
            java.util.ArrayList BXaznwstz2U02 = defpackage.w60.BXaznwstz2U0((java.util.LinkedHashMap) qp0Var.JhCgjQRTAOCT, new defpackage.y10() { // from class: pp0
                @Override // defpackage.y10
                public final java.lang.Object P05cfTpS5W5L(java.lang.Object obj2) {
                    boolean contains;
                    int i32 = i3;
                    defpackage.kp0 kp0Var22 = kp0Var2;
                    java.lang.String str22 = (java.lang.String) obj2;
                    switch (i32) {
                        case 0:
                            str22.getClass();
                            contains = kp0Var22.fWTAfUmVKrZq().contains(str22);
                            break;
                        default:
                            str22.getClass();
                            contains = kp0Var22.fWTAfUmVKrZq().contains(str22);
                            break;
                    }
                    return java.lang.Boolean.valueOf(!contains);
                }
            });
            if (!BXaznwstz2U02.isEmpty()) {
                throw new java.lang.IllegalArgumentException(("Cannot set route \"" + str2 + "\" for destination " + ((defpackage.np0) qp0Var.giKS3J6vZuNy) + ". Following required arguments are missing: " + BXaznwstz2U02).toString());
            }
            qp0Var.oh71FJcDz6S2 = new defpackage.ti1(new defpackage.l3(18, concat));
            qp0Var.ZpBGe2uQfcn8 = concat.hashCode();
            qp0Var.WDYagTQQm9ns = str2;
        }
        int i4 = this.giKS3J6vZuNy;
        if (i4 != -1) {
            qp0Var.ZpBGe2uQfcn8 = i4;
        }
        return giKS3J6vZuNy;
    }

    public defpackage.np0 giKS3J6vZuNy() {
        return this.ZpBGe2uQfcn8.ZpBGe2uQfcn8();
    }
}
