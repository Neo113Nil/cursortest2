package defpackage;

/* loaded from: classes.dex */
public abstract class gn0 {
    public static final /* synthetic */ int riuEU0zW4 = 0;
    public defpackage.kn0 AARZUJiTa;
    public final defpackage.qb1 EXtogiMhuM;
    public final java.lang.String adDC3e2L;
    public final defpackage.jn0 xiZrDbcSW0;

    static {
        new java.util.LinkedHashMap();
    }

    public gn0(defpackage.oo0 oo0Var) {
        oo0Var.getClass();
        java.util.LinkedHashMap linkedHashMap = defpackage.po0.oh6vYeIP;
        this.adDC3e2L = defpackage.e90.kd6TUFXn(oo0Var.getClass());
        defpackage.jn0 jn0Var = new defpackage.jn0();
        jn0Var.oh6vYeIP = this;
        jn0Var.r1MBDhnF = new java.util.ArrayList();
        jn0Var.F7NU4MC0GW = new java.util.LinkedHashMap();
        this.xiZrDbcSW0 = jn0Var;
        this.EXtogiMhuM = new defpackage.qb1();
    }

    public final android.os.Bundle IHQe1A4L2xu(android.os.Bundle bundle) {
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) this.xiZrDbcSW0.F7NU4MC0GW;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        android.os.Bundle SyNS6RMn = defpackage.w70.SyNS6RMn((defpackage.et0[]) java.util.Arrays.copyOf(new defpackage.et0[0], 0));
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            ((defpackage.mm0) entry.getValue()).getClass();
            str.getClass();
        }
        if (bundle != null) {
            SyNS6RMn.putAll(bundle);
            for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
                java.lang.String str2 = (java.lang.String) entry2.getKey();
                defpackage.mm0 mm0Var = (defpackage.mm0) entry2.getValue();
                mm0Var.getClass();
                defpackage.eo0 eo0Var = mm0Var.IHQe1A4L2xu;
                str2.getClass();
                if (!SyNS6RMn.containsKey(str2) || !defpackage.s70.p4kuH6PDtgom(SyNS6RMn, str2)) {
                    try {
                        eo0Var.IHQe1A4L2xu(SyNS6RMn, str2);
                    } catch (java.lang.IllegalStateException unused) {
                    }
                }
                defpackage.db.ez2rX8ReCYw("Wrong argument type for '", str2, "' in argument savedState. ", eo0Var.oh6vYeIP(), " expected.");
                return null;
            }
        }
        return SyNS6RMn;
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
            if (obj != null && (obj instanceof defpackage.gn0)) {
                defpackage.jn0 jn0Var = this.xiZrDbcSW0;
                java.util.ArrayList arrayList = (java.util.ArrayList) jn0Var.r1MBDhnF;
                defpackage.gn0 gn0Var = (defpackage.gn0) obj;
                defpackage.qb1 qb1Var = gn0Var.EXtogiMhuM;
                defpackage.jn0 jn0Var2 = gn0Var.xiZrDbcSW0;
                boolean QoRHpC4k = defpackage.x70.QoRHpC4k(arrayList, (java.util.ArrayList) jn0Var2.r1MBDhnF);
                defpackage.qb1 qb1Var2 = this.EXtogiMhuM;
                if (qb1Var2.adDC3e2L() == qb1Var.adDC3e2L()) {
                    java.util.Iterator it = defpackage.a81.p4kuH6PDtgom(new defpackage.rb1(qb1Var2)).iterator();
                    while (it.hasNext()) {
                        int intValue = ((java.lang.Number) it.next()).intValue();
                        if (!defpackage.x70.QoRHpC4k(qb1Var2.oh6vYeIP(intValue), qb1Var.oh6vYeIP(intValue))) {
                        }
                    }
                    z = true;
                    if (oh6vYeIP().size() == gn0Var.oh6vYeIP().size()) {
                        java.util.Set<java.util.Map.Entry> entrySet = oh6vYeIP().entrySet();
                        entrySet.getClass();
                        for (java.util.Map.Entry entry : entrySet) {
                            if (gn0Var.oh6vYeIP().containsKey(entry.getKey()) && defpackage.x70.QoRHpC4k(gn0Var.oh6vYeIP().get(entry.getKey()), entry.getValue())) {
                            }
                        }
                        z2 = true;
                        if (jn0Var.IHQe1A4L2xu == jn0Var2.IHQe1A4L2xu || !defpackage.x70.QoRHpC4k((java.lang.String) jn0Var.adDC3e2L, (java.lang.String) jn0Var2.adDC3e2L) || !QoRHpC4k || !z || !z2) {
                        }
                    }
                    z2 = false;
                    if (jn0Var.IHQe1A4L2xu == jn0Var2.IHQe1A4L2xu) {
                    }
                }
                z = false;
                if (oh6vYeIP().size() == gn0Var.oh6vYeIP().size()) {
                }
                z2 = false;
                if (jn0Var.IHQe1A4L2xu == jn0Var2.IHQe1A4L2xu) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        defpackage.jn0 jn0Var = this.xiZrDbcSW0;
        int i = jn0Var.IHQe1A4L2xu * 31;
        java.lang.String str = (java.lang.String) jn0Var.adDC3e2L;
        int hashCode = i + (str != null ? str.hashCode() : 0);
        java.util.ArrayList arrayList = (java.util.ArrayList) jn0Var.r1MBDhnF;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            java.lang.Object obj = arrayList.get(i2);
            i2++;
            hashCode = (((defpackage.en0) obj).IHQe1A4L2xu.hashCode() + (hashCode * 31)) * 961;
        }
        defpackage.qb1 qb1Var = this.EXtogiMhuM;
        qb1Var.getClass();
        if (qb1Var.adDC3e2L() > 0) {
            qb1Var.xiZrDbcSW0(0).getClass();
            defpackage.db.kd6TUFXn();
            return 0;
        }
        for (java.lang.String str2 : oh6vYeIP().keySet()) {
            int F7NU4MC0GW = defpackage.fx0.F7NU4MC0GW(hashCode * 31, 31, str2);
            java.lang.Object obj2 = oh6vYeIP().get(str2);
            hashCode = F7NU4MC0GW + (obj2 != null ? obj2.hashCode() : 0);
        }
        return hashCode;
    }

    public final java.util.Map oh6vYeIP() {
        return defpackage.yh0.XZx205DYe((java.util.LinkedHashMap) this.xiZrDbcSW0.F7NU4MC0GW);
    }

    public defpackage.fn0 r1MBDhnF(defpackage.v5 v5Var) {
        boolean matches;
        defpackage.uz0 uz0Var;
        defpackage.v5 IHQe1A4L2xu;
        defpackage.jn0 jn0Var = this.xiZrDbcSW0;
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) jn0Var.F7NU4MC0GW;
        android.net.Uri uri = (android.net.Uri) v5Var.oh6vYeIP;
        java.util.ArrayList arrayList = (java.util.ArrayList) jn0Var.r1MBDhnF;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        defpackage.fn0 fn0Var = null;
        int i = 0;
        while (i < size) {
            java.lang.Object obj = arrayList.get(i);
            i++;
            defpackage.en0 en0Var = (defpackage.en0) obj;
            en0Var.getClass();
            defpackage.le1 le1Var = en0Var.F7NU4MC0GW;
            if (((defpackage.uz0) le1Var.getValue()) == null) {
                matches = true;
            } else if (uri == null) {
                matches = false;
            } else {
                defpackage.uz0 uz0Var2 = (defpackage.uz0) le1Var.getValue();
                uz0Var2.getClass();
                java.lang.String uri2 = uri.toString();
                uri2.getClass();
                matches = uz0Var2.adDC3e2L.matcher(uri2).matches();
            }
            if (matches) {
                android.os.Bundle F7NU4MC0GW = uri != null ? en0Var.F7NU4MC0GW(uri, linkedHashMap) : null;
                int oh6vYeIP = en0Var.oh6vYeIP(uri);
                java.lang.String str = (java.lang.String) v5Var.r1MBDhnF;
                boolean z = str != null && str.equals(null);
                if (F7NU4MC0GW == null) {
                    if (z) {
                        linkedHashMap.getClass();
                        android.os.Bundle SyNS6RMn = defpackage.w70.SyNS6RMn((defpackage.et0[]) java.util.Arrays.copyOf(new defpackage.et0[0], 0));
                        if (uri != null && (uz0Var = (defpackage.uz0) le1Var.getValue()) != null && (IHQe1A4L2xu = uz0Var.IHQe1A4L2xu(uri.toString())) != null) {
                            en0Var.adDC3e2L(IHQe1A4L2xu, SyNS6RMn, linkedHashMap);
                            if (((java.lang.Boolean) en0Var.adDC3e2L.getValue()).booleanValue()) {
                                en0Var.xiZrDbcSW0(uri, SyNS6RMn, linkedHashMap);
                            }
                        }
                        if (defpackage.j70.abhbClRa(linkedHashMap, new defpackage.cn0(SyNS6RMn, 1)).isEmpty()) {
                        }
                    }
                }
                defpackage.fn0 fn0Var2 = new defpackage.fn0((defpackage.gn0) jn0Var.oh6vYeIP, F7NU4MC0GW, en0Var.JlrlGoKF, oh6vYeIP, z);
                if (fn0Var == null || fn0Var2.compareTo(fn0Var) > 0) {
                    fn0Var = fn0Var2;
                }
            }
        }
        return fn0Var;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(0x");
        defpackage.jn0 jn0Var = this.xiZrDbcSW0;
        jn0Var.getClass();
        sb.append(java.lang.Integer.toHexString(jn0Var.IHQe1A4L2xu));
        sb.append(")");
        java.lang.String str = (java.lang.String) jn0Var.adDC3e2L;
        if (str != null && !defpackage.rc1.AQHddgaEX(str)) {
            sb.append(" route=");
            sb.append((java.lang.String) jn0Var.adDC3e2L);
        }
        return sb.toString();
    }
}
