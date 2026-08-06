package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class np0 {
    public static final /* synthetic */ int e6mdH7fiFuta = 0;
    public final defpackage.rf1 P05cfTpS5W5L;
    public defpackage.rp0 QiMR8OkAhezm;
    public final java.lang.String WDYagTQQm9ns;
    public final defpackage.qp0 oh71FJcDz6S2;

    static {
        new java.util.LinkedHashMap();
    }

    public np0(defpackage.yq0 yq0Var) {
        yq0Var.getClass();
        java.util.LinkedHashMap linkedHashMap = defpackage.zq0.giKS3J6vZuNy;
        this.WDYagTQQm9ns = defpackage.t80.maCixPsq4ml2(yq0Var.getClass());
        defpackage.qp0 qp0Var = new defpackage.qp0();
        qp0Var.giKS3J6vZuNy = this;
        qp0Var.fWTAfUmVKrZq = new java.util.ArrayList();
        qp0Var.JhCgjQRTAOCT = new java.util.LinkedHashMap();
        this.oh71FJcDz6S2 = qp0Var;
        this.P05cfTpS5W5L = new defpackage.rf1();
    }

    public final android.os.Bundle ZpBGe2uQfcn8(android.os.Bundle bundle) {
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) this.oh71FJcDz6S2.JhCgjQRTAOCT;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        android.os.Bundle GE9mJIPrb8gP = defpackage.i61.GE9mJIPrb8gP((defpackage.bw0[]) java.util.Arrays.copyOf(new defpackage.bw0[0], 0));
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            ((defpackage.wo0) entry.getValue()).getClass();
            str.getClass();
        }
        if (bundle != null) {
            GE9mJIPrb8gP.putAll(bundle);
            for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
                java.lang.String str2 = (java.lang.String) entry2.getKey();
                defpackage.wo0 wo0Var = (defpackage.wo0) entry2.getValue();
                boolean z = wo0Var.JhCgjQRTAOCT;
                defpackage.oq0 oq0Var = wo0Var.ZpBGe2uQfcn8;
                if (!z) {
                    str2.getClass();
                    if (wo0Var.giKS3J6vZuNy || !GE9mJIPrb8gP.containsKey(str2) || !defpackage.wc1.OVwOqzUGHcCU(str2, GE9mJIPrb8gP)) {
                        try {
                            oq0Var.ZpBGe2uQfcn8(str2, GE9mJIPrb8gP);
                        } catch (java.lang.IllegalStateException unused) {
                        }
                    }
                    defpackage.h7.Ns0WNyEWdPsk("Wrong argument type for '", str2, "' in argument savedState. ", oq0Var.giKS3J6vZuNy(), " expected.");
                    return null;
                }
            }
        }
        return GE9mJIPrb8gP;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(java.lang.Object obj) {
        boolean z;
        boolean z2;
        if (this != obj) {
            if (obj != null && (obj instanceof defpackage.np0)) {
                defpackage.qp0 qp0Var = this.oh71FJcDz6S2;
                java.util.ArrayList arrayList = (java.util.ArrayList) qp0Var.fWTAfUmVKrZq;
                defpackage.np0 np0Var = (defpackage.np0) obj;
                defpackage.rf1 rf1Var = np0Var.P05cfTpS5W5L;
                defpackage.qp0 qp0Var2 = np0Var.oh71FJcDz6S2;
                boolean QiMR8OkAhezm = defpackage.ma0.QiMR8OkAhezm(arrayList, (java.util.ArrayList) qp0Var2.fWTAfUmVKrZq);
                defpackage.rf1 rf1Var2 = this.P05cfTpS5W5L;
                if (rf1Var2.WDYagTQQm9ns() == rf1Var.WDYagTQQm9ns()) {
                    java.util.Iterator it = defpackage.fc1.hH0RRJrNssvh(new defpackage.sf1(rf1Var2)).iterator();
                    while (it.hasNext()) {
                        int intValue = ((java.lang.Number) it.next()).intValue();
                        if (!defpackage.ma0.QiMR8OkAhezm(rf1Var2.giKS3J6vZuNy(intValue), rf1Var.giKS3J6vZuNy(intValue))) {
                        }
                    }
                    z = true;
                    if (giKS3J6vZuNy().size() == np0Var.giKS3J6vZuNy().size()) {
                        java.util.Set<java.util.Map.Entry> entrySet = giKS3J6vZuNy().entrySet();
                        entrySet.getClass();
                        for (java.util.Map.Entry entry : entrySet) {
                            if (np0Var.giKS3J6vZuNy().containsKey(entry.getKey()) && defpackage.ma0.QiMR8OkAhezm(np0Var.giKS3J6vZuNy().get(entry.getKey()), entry.getValue())) {
                            }
                        }
                        z2 = true;
                        if (qp0Var.ZpBGe2uQfcn8 == qp0Var2.ZpBGe2uQfcn8 || !defpackage.ma0.QiMR8OkAhezm((java.lang.String) qp0Var.WDYagTQQm9ns, (java.lang.String) qp0Var2.WDYagTQQm9ns) || !QiMR8OkAhezm || !z || !z2) {
                        }
                    }
                    z2 = false;
                    if (qp0Var.ZpBGe2uQfcn8 == qp0Var2.ZpBGe2uQfcn8) {
                    }
                }
                z = false;
                if (giKS3J6vZuNy().size() == np0Var.giKS3J6vZuNy().size()) {
                }
                z2 = false;
                if (qp0Var.ZpBGe2uQfcn8 == qp0Var2.ZpBGe2uQfcn8) {
                }
            }
            return false;
        }
        return true;
    }

    public defpackage.mp0 fWTAfUmVKrZq(defpackage.a7 a7Var) {
        boolean matches;
        defpackage.d41 d41Var;
        defpackage.a7 ZpBGe2uQfcn8;
        defpackage.qp0 qp0Var = this.oh71FJcDz6S2;
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) qp0Var.JhCgjQRTAOCT;
        android.net.Uri uri = (android.net.Uri) a7Var.giKS3J6vZuNy;
        java.util.ArrayList arrayList = (java.util.ArrayList) qp0Var.fWTAfUmVKrZq;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        defpackage.mp0 mp0Var = null;
        int i = 0;
        while (i < size) {
            java.lang.Object obj = arrayList.get(i);
            i++;
            defpackage.kp0 kp0Var = (defpackage.kp0) obj;
            kp0Var.getClass();
            defpackage.ti1 ti1Var = kp0Var.JhCgjQRTAOCT;
            if (((defpackage.d41) ti1Var.getValue()) == null) {
                matches = true;
            } else if (uri == null) {
                matches = false;
            } else {
                defpackage.d41 d41Var2 = (defpackage.d41) ti1Var.getValue();
                d41Var2.getClass();
                java.lang.String uri2 = uri.toString();
                uri2.getClass();
                matches = d41Var2.WDYagTQQm9ns.matcher(uri2).matches();
            }
            if (matches) {
                android.os.Bundle JhCgjQRTAOCT = uri != null ? kp0Var.JhCgjQRTAOCT(uri, linkedHashMap) : null;
                int giKS3J6vZuNy = kp0Var.giKS3J6vZuNy(uri);
                java.lang.String str = (java.lang.String) a7Var.fWTAfUmVKrZq;
                boolean z = str != null && str.equals(null);
                if (JhCgjQRTAOCT == null) {
                    if (z) {
                        linkedHashMap.getClass();
                        android.os.Bundle GE9mJIPrb8gP = defpackage.i61.GE9mJIPrb8gP((defpackage.bw0[]) java.util.Arrays.copyOf(new defpackage.bw0[0], 0));
                        if (uri != null && (d41Var = (defpackage.d41) ti1Var.getValue()) != null && (ZpBGe2uQfcn8 = d41Var.ZpBGe2uQfcn8(uri.toString())) != null) {
                            kp0Var.WDYagTQQm9ns(ZpBGe2uQfcn8, GE9mJIPrb8gP, linkedHashMap);
                            if (((java.lang.Boolean) kp0Var.WDYagTQQm9ns.getValue()).booleanValue()) {
                                kp0Var.oh71FJcDz6S2(uri, GE9mJIPrb8gP, linkedHashMap);
                            }
                        }
                        if (defpackage.w60.BXaznwstz2U0(linkedHashMap, new defpackage.ip0(GE9mJIPrb8gP, 1)).isEmpty()) {
                        }
                    }
                }
                defpackage.mp0 mp0Var2 = new defpackage.mp0((defpackage.np0) qp0Var.giKS3J6vZuNy, JhCgjQRTAOCT, kp0Var.fNwYGHIYeJcR, giKS3J6vZuNy, z);
                if (mp0Var == null || mp0Var2.compareTo(mp0Var) > 0) {
                    mp0Var = mp0Var2;
                }
            }
        }
        return mp0Var;
    }

    public final java.util.Map giKS3J6vZuNy() {
        return defpackage.jk0.OVwOqzUGHcCU((java.util.LinkedHashMap) this.oh71FJcDz6S2.JhCgjQRTAOCT);
    }

    public int hashCode() {
        defpackage.qp0 qp0Var = this.oh71FJcDz6S2;
        int i = qp0Var.ZpBGe2uQfcn8 * 31;
        java.lang.String str = (java.lang.String) qp0Var.WDYagTQQm9ns;
        int hashCode = i + (str != null ? str.hashCode() : 0);
        java.util.ArrayList arrayList = (java.util.ArrayList) qp0Var.fWTAfUmVKrZq;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            java.lang.Object obj = arrayList.get(i2);
            i2++;
            hashCode = (((defpackage.kp0) obj).ZpBGe2uQfcn8.hashCode() + (hashCode * 31)) * 961;
        }
        defpackage.rf1 rf1Var = this.P05cfTpS5W5L;
        rf1Var.getClass();
        if (rf1Var.WDYagTQQm9ns() > 0) {
            rf1Var.oh71FJcDz6S2(0).getClass();
            defpackage.p81.ZpBGe2uQfcn8();
            return 0;
        }
        for (java.lang.String str2 : giKS3J6vZuNy().keySet()) {
            int hashCode2 = (str2.hashCode() + (hashCode * 31)) * 31;
            java.lang.Object obj2 = giKS3J6vZuNy().get(str2);
            hashCode = (obj2 != null ? obj2.hashCode() : 0) + hashCode2;
        }
        return hashCode;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(0x");
        defpackage.qp0 qp0Var = this.oh71FJcDz6S2;
        qp0Var.getClass();
        sb.append(java.lang.Integer.toHexString(qp0Var.ZpBGe2uQfcn8));
        sb.append(")");
        java.lang.String str = (java.lang.String) qp0Var.WDYagTQQm9ns;
        if (str != null && !defpackage.tg1.PS16moFv2oLu(str)) {
            sb.append(" route=");
            sb.append((java.lang.String) qp0Var.WDYagTQQm9ns);
        }
        return sb.toString();
    }
}
