package defpackage;

/* loaded from: classes.dex */
public abstract class hn0 {
    public final defpackage.oo0 IHQe1A4L2xu;
    public final java.lang.String oh6vYeIP;
    public final java.util.LinkedHashMap r1MBDhnF = new java.util.LinkedHashMap();
    public final java.util.ArrayList F7NU4MC0GW = new java.util.ArrayList();
    public final java.util.LinkedHashMap adDC3e2L = new java.util.LinkedHashMap();

    public hn0(defpackage.oo0 oo0Var, java.lang.String str) {
        this.IHQe1A4L2xu = oo0Var;
        this.oh6vYeIP = str;
    }

    public defpackage.gn0 IHQe1A4L2xu() {
        defpackage.gn0 oh6vYeIP = oh6vYeIP();
        oh6vYeIP.getClass();
        defpackage.jn0 jn0Var = oh6vYeIP.xiZrDbcSW0;
        for (java.util.Map.Entry entry : this.r1MBDhnF.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            defpackage.mm0 mm0Var = (defpackage.mm0) entry.getValue();
            str.getClass();
            mm0Var.getClass();
            jn0Var.getClass();
            ((java.util.LinkedHashMap) jn0Var.F7NU4MC0GW).put(str, mm0Var);
        }
        java.util.ArrayList arrayList = this.F7NU4MC0GW;
        int size = arrayList.size();
        final int i = 0;
        int i2 = 0;
        while (i2 < size) {
            java.lang.Object obj = arrayList.get(i2);
            i2++;
            final defpackage.en0 en0Var = (defpackage.en0) obj;
            en0Var.getClass();
            jn0Var.getClass();
            java.util.ArrayList abhbClRa = defpackage.j70.abhbClRa((java.util.LinkedHashMap) jn0Var.F7NU4MC0GW, new defpackage.g00() { // from class: in0
                @Override // defpackage.g00
                public final java.lang.Object AARZUJiTa(java.lang.Object obj2) {
                    boolean contains;
                    int i3 = i;
                    defpackage.en0 en0Var2 = en0Var;
                    java.lang.String str2 = (java.lang.String) obj2;
                    switch (i3) {
                        case 0:
                            str2.getClass();
                            contains = en0Var2.r1MBDhnF().contains(str2);
                            break;
                        default:
                            str2.getClass();
                            contains = en0Var2.r1MBDhnF().contains(str2);
                            break;
                    }
                    return java.lang.Boolean.valueOf(!contains);
                }
            });
            if (!abhbClRa.isEmpty()) {
                throw new java.lang.IllegalArgumentException(("Deep link " + en0Var.IHQe1A4L2xu + " can't be used to open destination " + ((defpackage.gn0) jn0Var.oh6vYeIP) + ".\nFollowing required arguments are missing: " + abhbClRa).toString());
            }
            ((java.util.ArrayList) jn0Var.r1MBDhnF).add(en0Var);
        }
        java.util.Iterator it = this.adDC3e2L.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry2 = (java.util.Map.Entry) it.next();
            ((java.lang.Number) entry2.getKey()).intValue();
            entry2.getValue().getClass();
            defpackage.db.kd6TUFXn();
            return null;
        }
        java.lang.String str2 = this.oh6vYeIP;
        if (str2 != null) {
            jn0Var.getClass();
            if (defpackage.rc1.AQHddgaEX(str2)) {
                defpackage.db.fnWB2E7cs("Cannot have an empty route");
                return null;
            }
            java.lang.String concat = "android-app://androidx.navigation/".concat(str2);
            final defpackage.en0 en0Var2 = new defpackage.en0(concat);
            final int i3 = 1;
            java.util.ArrayList abhbClRa2 = defpackage.j70.abhbClRa((java.util.LinkedHashMap) jn0Var.F7NU4MC0GW, new defpackage.g00() { // from class: in0
                @Override // defpackage.g00
                public final java.lang.Object AARZUJiTa(java.lang.Object obj2) {
                    boolean contains;
                    int i32 = i3;
                    defpackage.en0 en0Var22 = en0Var2;
                    java.lang.String str22 = (java.lang.String) obj2;
                    switch (i32) {
                        case 0:
                            str22.getClass();
                            contains = en0Var22.r1MBDhnF().contains(str22);
                            break;
                        default:
                            str22.getClass();
                            contains = en0Var22.r1MBDhnF().contains(str22);
                            break;
                    }
                    return java.lang.Boolean.valueOf(!contains);
                }
            });
            if (!abhbClRa2.isEmpty()) {
                throw new java.lang.IllegalArgumentException(("Cannot set route \"" + str2 + "\" for destination " + ((defpackage.gn0) jn0Var.oh6vYeIP) + ". Following required arguments are missing: " + abhbClRa2).toString());
            }
            jn0Var.xiZrDbcSW0 = new defpackage.le1(new defpackage.e3(9, concat));
            jn0Var.IHQe1A4L2xu = concat.hashCode();
            jn0Var.adDC3e2L = str2;
        }
        return oh6vYeIP;
    }

    public defpackage.gn0 oh6vYeIP() {
        return this.IHQe1A4L2xu.IHQe1A4L2xu();
    }
}
