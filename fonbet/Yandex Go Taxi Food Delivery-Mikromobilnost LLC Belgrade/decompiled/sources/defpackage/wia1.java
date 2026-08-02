package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzji;
import com.google.android.gms.measurement.internal.zzjj;
import com.google.android.gms.measurement.internal.zzjk;
import com.ybsdk.widgets.common.MoneyInputEditView;
import java.util.EnumMap;
import java.util.Iterator;
import ru.CryptoPro.JCP.tools.LicenseUtility;

/* loaded from: classes.dex */
public final class wia1 {
    public static final wia1 c = new wia1(100);
    public final EnumMap a;
    public final int b;

    public wia1(int i) {
        EnumMap enumMap = new EnumMap(zzjk.class);
        this.a = enumMap;
        zzjk zzjkVar = zzjk.AD_STORAGE;
        zzji zzjiVar = zzji.UNINITIALIZED;
        enumMap.put((EnumMap) zzjkVar, (zzjk) zzjiVar);
        enumMap.put((EnumMap) zzjk.ANALYTICS_STORAGE, (zzjk) zzjiVar);
        this.b = i;
    }

    public static String a(int i) {
        return i != -30 ? i != -20 ? i != -10 ? i != 0 ? i != 30 ? i != 90 ? i != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    public static wia1 b(int i, Bundle bundle) {
        if (bundle == null) {
            return new wia1(i);
        }
        EnumMap enumMap = new EnumMap(zzjk.class);
        for (zzjk zzjkVar : zzjj.STORAGE.b()) {
            enumMap.put((EnumMap) zzjkVar, (zzjk) d(bundle.getString(zzjkVar.zze)));
        }
        return new wia1(enumMap, i);
    }

    public static wia1 c(int i, String str) {
        EnumMap enumMap = new EnumMap(zzjk.class);
        zzjk[] a = zzjj.STORAGE.a();
        for (int i2 = 0; i2 < a.length; i2++) {
            String str2 = str == null ? "" : str;
            zzjk zzjkVar = a[i2];
            int i3 = i2 + 2;
            if (i3 < str2.length()) {
                enumMap.put((EnumMap) zzjkVar, (zzjk) e(str2.charAt(i3)));
            } else {
                enumMap.put((EnumMap) zzjkVar, (zzjk) zzji.UNINITIALIZED);
            }
        }
        return new wia1(enumMap, i);
    }

    public static zzji d(String str) {
        return str == null ? zzji.UNINITIALIZED : str.equals("granted") ? zzji.GRANTED : str.equals("denied") ? zzji.DENIED : zzji.UNINITIALIZED;
    }

    public static zzji e(char c2) {
        return c2 != '+' ? c2 != '0' ? c2 != '1' ? zzji.UNINITIALIZED : zzji.GRANTED : zzji.DENIED : zzji.POLICY;
    }

    public static char h(zzji zzjiVar) {
        if (zzjiVar == null) {
            return LicenseUtility.SEPARATOR;
        }
        int ordinal = zzjiVar.ordinal();
        if (ordinal == 1) {
            return '+';
        }
        if (ordinal == 2) {
            return MoneyInputEditView.DEFAULT_VALUE;
        }
        if (ordinal != 3) {
            return LicenseUtility.SEPARATOR;
        }
        return '1';
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
        if (!(obj instanceof wia1)) {
            return false;
        }
        wia1 wia1Var = (wia1) obj;
        for (zzjk zzjkVar : zzjj.STORAGE.b()) {
            if (this.a.get(zzjkVar) != wia1Var.a.get(zzjkVar)) {
                return false;
            }
        }
        return this.b == wia1Var.b;
    }

    public final String f() {
        int ordinal;
        StringBuilder sb = new StringBuilder("G1");
        for (zzjk zzjkVar : zzjj.STORAGE.a()) {
            zzji zzjiVar = (zzji) this.a.get(zzjkVar);
            char c2 = LicenseUtility.SEPARATOR;
            if (zzjiVar != null && (ordinal = zzjiVar.ordinal()) != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        c2 = MoneyInputEditView.DEFAULT_VALUE;
                    } else if (ordinal != 3) {
                    }
                }
                c2 = '1';
            }
            sb.append(c2);
        }
        return sb.toString();
    }

    public final String g() {
        StringBuilder sb = new StringBuilder("G1");
        for (zzjk zzjkVar : zzjj.STORAGE.a()) {
            sb.append(h((zzji) this.a.get(zzjkVar)));
        }
        return sb.toString();
    }

    public final int hashCode() {
        Iterator it = this.a.values().iterator();
        int i = this.b * 17;
        while (it.hasNext()) {
            i = (i * 31) + ((zzji) it.next()).hashCode();
        }
        return i;
    }

    public final boolean i(zzjk zzjkVar) {
        return ((zzji) this.a.get(zzjkVar)) != zzji.DENIED;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final wia1 j(wia1 wia1Var) {
        EnumMap enumMap = new EnumMap(zzjk.class);
        for (zzjk zzjkVar : zzjj.STORAGE.b()) {
            zzji zzjiVar = (zzji) this.a.get(zzjkVar);
            zzji zzjiVar2 = (zzji) wia1Var.a.get(zzjkVar);
            if (zzjiVar != null) {
                if (zzjiVar2 != null) {
                    zzji zzjiVar3 = zzji.UNINITIALIZED;
                    if (zzjiVar != zzjiVar3) {
                        if (zzjiVar2 != zzjiVar3) {
                            zzji zzjiVar4 = zzji.POLICY;
                            if (zzjiVar != zzjiVar4) {
                                if (zzjiVar2 != zzjiVar4) {
                                    zzji zzjiVar5 = zzji.DENIED;
                                    zzjiVar = (zzjiVar == zzjiVar5 || zzjiVar2 == zzjiVar5) ? zzjiVar5 : zzji.GRANTED;
                                }
                            }
                        }
                    }
                }
                if (zzjiVar == null) {
                    enumMap.put((EnumMap) zzjkVar, (zzjk) zzjiVar);
                }
            }
            zzjiVar = zzjiVar2;
            if (zzjiVar == null) {
            }
        }
        return new wia1(enumMap, 100);
    }

    public final wia1 k(wia1 wia1Var) {
        EnumMap enumMap = new EnumMap(zzjk.class);
        for (zzjk zzjkVar : zzjj.STORAGE.b()) {
            zzji zzjiVar = (zzji) this.a.get(zzjkVar);
            if (zzjiVar == zzji.UNINITIALIZED) {
                zzjiVar = (zzji) wia1Var.a.get(zzjkVar);
            }
            if (zzjiVar != null) {
                enumMap.put((EnumMap) zzjkVar, (zzjk) zzjiVar);
            }
        }
        return new wia1(enumMap, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(a(this.b));
        for (zzjk zzjkVar : zzjj.STORAGE.b()) {
            sb.append(",");
            sb.append(zzjkVar.zze);
            sb.append("=");
            zzji zzjiVar = (zzji) this.a.get(zzjkVar);
            if (zzjiVar == null) {
                zzjiVar = zzji.UNINITIALIZED;
            }
            sb.append(zzjiVar);
        }
        return sb.toString();
    }

    public wia1(EnumMap enumMap, int i) {
        EnumMap enumMap2 = new EnumMap(zzjk.class);
        this.a = enumMap2;
        enumMap2.putAll(enumMap);
        this.b = i;
    }
}
