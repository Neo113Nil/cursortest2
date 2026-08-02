package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzji;
import com.google.android.gms.measurement.internal.zzjj;
import com.google.android.gms.measurement.internal.zzjk;
import java.util.EnumMap;
import java.util.Objects;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes.dex */
public final class x791 {
    public static final x791 f = new x791((Boolean) null, 100, (Boolean) null, (String) null);
    public final int a;
    public final String b;
    public final Boolean c;
    public final String d;
    public final EnumMap e;

    public x791(Boolean bool, int i, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(zzjk.class);
        this.e = enumMap;
        enumMap.put((EnumMap) zzjk.AD_USER_DATA, (zzjk) (bool == null ? zzji.UNINITIALIZED : bool.booleanValue() ? zzji.GRANTED : zzji.DENIED));
        this.a = i;
        this.b = e();
        this.c = bool2;
        this.d = str;
    }

    public static x791 b(String str) {
        if (str == null || str.length() <= 0) {
            return f;
        }
        String[] split = str.split(":");
        int parseInt = Integer.parseInt(split[0]);
        EnumMap enumMap = new EnumMap(zzjk.class);
        zzjk[] a = zzjj.DMA.a();
        int length = a.length;
        int i = 1;
        int i2 = 0;
        while (i2 < length) {
            enumMap.put((EnumMap) a[i2], (zzjk) wia1.e(split[i].charAt(0)));
            i2++;
            i++;
        }
        return new x791(enumMap, parseInt, (Boolean) null, (String) null);
    }

    public static x791 c(int i, Bundle bundle) {
        if (bundle == null) {
            return new x791((Boolean) null, i, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(zzjk.class);
        for (zzjk zzjkVar : zzjj.DMA.a()) {
            enumMap.put((EnumMap) zzjkVar, (zzjk) wia1.d(bundle.getString(zzjkVar.zze)));
        }
        return new x791(enumMap, i, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public static Boolean d(Bundle bundle) {
        zzji d;
        if (bundle == null || (d = wia1.d(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int ordinal = d.ordinal();
        if (ordinal == 2) {
            return Boolean.FALSE;
        }
        if (ordinal != 3) {
            return null;
        }
        return Boolean.TRUE;
    }

    public final zzji a() {
        zzji zzjiVar = (zzji) this.e.get(zzjk.AD_USER_DATA);
        return zzjiVar == null ? zzji.UNINITIALIZED : zzjiVar;
    }

    public final String e() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        for (zzjk zzjkVar : zzjj.DMA.a()) {
            sb.append(":");
            sb.append(wia1.h((zzji) this.e.get(zzjkVar)));
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x791)) {
            return false;
        }
        x791 x791Var = (x791) obj;
        if (this.b.equalsIgnoreCase(x791Var.b) && Objects.equals(this.c, x791Var.c)) {
            return Objects.equals(this.d, x791Var.d);
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = this.c;
        int i = bool == null ? 3 : true != bool.booleanValue() ? 13 : 7;
        String str = this.d;
        return ((str == null ? 17 : str.hashCode()) * HProv.PP_ENUM_LOG) + this.b.hashCode() + (i * 29);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(wia1.a(this.a));
        for (zzjk zzjkVar : zzjj.DMA.a()) {
            sb.append(",");
            sb.append(zzjkVar.zze);
            sb.append("=");
            zzji zzjiVar = (zzji) this.e.get(zzjkVar);
            if (zzjiVar == null) {
                sb.append("uninitialized");
            } else {
                int ordinal = zzjiVar.ordinal();
                if (ordinal == 0) {
                    sb.append("uninitialized");
                } else if (ordinal == 1) {
                    sb.append("eu_consent_policy");
                } else if (ordinal == 2) {
                    sb.append("denied");
                } else if (ordinal == 3) {
                    sb.append("granted");
                }
            }
        }
        Boolean bool = this.c;
        if (bool != null) {
            sb.append(",isDmaRegion=");
            sb.append(bool);
        }
        String str = this.d;
        if (str != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(str);
        }
        return sb.toString();
    }

    public x791(EnumMap enumMap, int i, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(zzjk.class);
        this.e = enumMap2;
        enumMap2.putAll(enumMap);
        this.a = i;
        this.b = e();
        this.c = bool;
        this.d = str;
    }
}
