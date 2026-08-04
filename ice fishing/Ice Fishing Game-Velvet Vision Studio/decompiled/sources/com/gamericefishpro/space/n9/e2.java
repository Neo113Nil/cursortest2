package com.gamericefishpro.space.n9;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e2 {
    public static final e2 c = new e2(100);
    public final EnumMap a;
    public final int b;

    public e2(int i) {
        EnumMap enumMap = new EnumMap(d2.class);
        this.a = enumMap;
        d2 d2Var = d2.AD_STORAGE;
        b2 b2Var = b2.UNINITIALIZED;
        enumMap.put(d2Var, b2Var);
        enumMap.put(d2.ANALYTICS_STORAGE, b2Var);
        this.b = i;
    }

    public static String a(int i) {
        if (i == -30) {
            return "TCF";
        }
        if (i == -20) {
            return "API";
        }
        if (i == -10) {
            return "MANIFEST";
        }
        if (i == 0) {
            return "1P_API";
        }
        if (i == 30) {
            return "1P_INIT";
        }
        if (i != 90) {
            return i != 100 ? "OTHER" : "UNKNOWN";
        }
        return "REMOTE_CONFIG";
    }

    public static e2 b(Bundle bundle, int i) {
        if (bundle == null) {
            return new e2(i);
        }
        EnumMap enumMap = new EnumMap(d2.class);
        for (d2 d2Var : c2.STORAGE.d) {
            enumMap.put(d2Var, d(bundle.getString(d2Var.d)));
        }
        return new e2(enumMap, i);
    }

    public static e2 c(int i, String str) {
        EnumMap enumMap = new EnumMap(d2.class);
        d2[] d2VarArr = c2.STORAGE.d;
        for (int i2 = 0; i2 < d2VarArr.length; i2++) {
            String str2 = str == null ? "" : str;
            d2 d2Var = d2VarArr[i2];
            int i3 = i2 + 2;
            if (i3 < str2.length()) {
                enumMap.put(d2Var, e(str2.charAt(i3)));
            } else {
                enumMap.put(d2Var, b2.UNINITIALIZED);
            }
        }
        return new e2(enumMap, i);
    }

    public static b2 d(String str) {
        b2 b2Var = b2.UNINITIALIZED;
        if (str == null) {
            return b2Var;
        }
        if (str.equals("granted")) {
            return b2.GRANTED;
        }
        return str.equals("denied") ? b2.DENIED : b2Var;
    }

    public static b2 e(char c2) {
        if (c2 == '+') {
            return b2.POLICY;
        }
        if (c2 != '0') {
            return c2 != '1' ? b2.UNINITIALIZED : b2.GRANTED;
        }
        return b2.DENIED;
    }

    public static char h(b2 b2Var) {
        if (b2Var == null) {
            return '-';
        }
        int iOrdinal = b2Var.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static boolean l(int i, int i2) {
        int i3 = -30;
        if (i == -20) {
            if (i2 == -30) {
                return true;
            }
            i = -20;
        }
        if (i != -30) {
            i3 = i;
        } else if (i2 == -20) {
            return true;
        }
        return i3 == i2 || i < i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e2)) {
            return false;
        }
        e2 e2Var = (e2) obj;
        for (d2 d2Var : c2.STORAGE.d) {
            if (this.a.get(d2Var) != e2Var.a.get(d2Var)) {
                return false;
            }
        }
        return this.b == e2Var.b;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0030  */
    public final String f() {
        int iOrdinal;
        StringBuilder sb = new StringBuilder("G1");
        for (d2 d2Var : c2.STORAGE.d) {
            b2 b2Var = (b2) this.a.get(d2Var);
            char c2 = '-';
            if (b2Var != null && (iOrdinal = b2Var.ordinal()) != 0) {
                if (iOrdinal == 1) {
                    c2 = '1';
                } else if (iOrdinal == 2) {
                    c2 = '0';
                } else if (iOrdinal == 3) {
                    c2 = '1';
                }
            }
            sb.append(c2);
        }
        return sb.toString();
    }

    public final String g() {
        StringBuilder sb = new StringBuilder("G1");
        for (d2 d2Var : c2.STORAGE.d) {
            sb.append(h((b2) this.a.get(d2Var)));
        }
        return sb.toString();
    }

    public final int hashCode() {
        Iterator it = this.a.values().iterator();
        int iHashCode = this.b * 17;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((b2) it.next()).hashCode();
        }
        return iHashCode;
    }

    public final boolean i(d2 d2Var) {
        return ((b2) this.a.get(d2Var)) != b2.DENIED;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    public final e2 j(e2 e2Var) {
        EnumMap enumMap = new EnumMap(d2.class);
        for (d2 d2Var : c2.STORAGE.d) {
            b2 b2Var = (b2) this.a.get(d2Var);
            b2 b2Var2 = (b2) e2Var.a.get(d2Var);
            if (b2Var == null) {
                b2Var = b2Var2;
            } else if (b2Var2 != null) {
                b2 b2Var3 = b2.UNINITIALIZED;
                if (b2Var == b2Var3) {
                    b2Var = b2Var2;
                } else if (b2Var2 != b2Var3) {
                    b2 b2Var4 = b2.POLICY;
                    if (b2Var == b2Var4) {
                        b2Var = b2Var2;
                    } else if (b2Var2 != b2Var4) {
                        b2 b2Var5 = b2.DENIED;
                        b2Var = (b2Var == b2Var5 || b2Var2 == b2Var5) ? b2Var5 : b2.GRANTED;
                    }
                }
            }
            if (b2Var != null) {
                enumMap.put(d2Var, b2Var);
            }
        }
        return new e2(enumMap, 100);
    }

    public final e2 k(e2 e2Var) {
        EnumMap enumMap = new EnumMap(d2.class);
        for (d2 d2Var : c2.STORAGE.d) {
            b2 b2Var = (b2) this.a.get(d2Var);
            if (b2Var == b2.UNINITIALIZED) {
                b2Var = (b2) e2Var.a.get(d2Var);
            }
            if (b2Var != null) {
                enumMap.put(d2Var, b2Var);
            }
        }
        return new e2(enumMap, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(a(this.b));
        for (d2 d2Var : c2.STORAGE.d) {
            sb.append(",");
            sb.append(d2Var.d);
            sb.append("=");
            b2 b2Var = (b2) this.a.get(d2Var);
            if (b2Var == null) {
                b2Var = b2.UNINITIALIZED;
            }
            sb.append(b2Var);
        }
        return sb.toString();
    }

    public e2(EnumMap enumMap, int i) {
        EnumMap enumMap2 = new EnumMap(d2.class);
        this.a = enumMap2;
        enumMap2.putAll(enumMap);
        this.b = i;
    }
}
