package com.gamericefishpro.space.n9;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class o {
    public static final o f = new o((Boolean) null, 100, (Boolean) null, (String) null);
    public final int a;
    public final String b;
    public final Boolean c;
    public final String d;
    public final EnumMap e;

    public o(Boolean bool, int i, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(d2.class);
        this.e = enumMap;
        enumMap.put(d2.AD_USER_DATA, bool == null ? b2.UNINITIALIZED : bool.booleanValue() ? b2.GRANTED : b2.DENIED);
        this.a = i;
        this.b = d();
        this.c = bool2;
        this.d = str;
    }

    public static o b(String str) {
        if (str == null || str.length() <= 0) {
            return f;
        }
        String[] strArrSplit = str.split(":");
        int i = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(d2.class);
        d2[] d2VarArr = c2.DMA.d;
        int length = d2VarArr.length;
        int i2 = 1;
        int i3 = 0;
        while (i3 < length) {
            enumMap.put(d2VarArr[i3], e2.e(strArrSplit[i2].charAt(0)));
            i3++;
            i2++;
        }
        return new o(enumMap, i, (Boolean) null, (String) null);
    }

    public static o c(Bundle bundle, int i) {
        if (bundle == null) {
            return new o((Boolean) null, i, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(d2.class);
        for (d2 d2Var : c2.DMA.d) {
            enumMap.put(d2Var, e2.d(bundle.getString(d2Var.d)));
        }
        return new o(enumMap, i, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public final b2 a() {
        b2 b2Var = (b2) this.e.get(d2.AD_USER_DATA);
        return b2Var == null ? b2.UNINITIALIZED : b2Var;
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        for (d2 d2Var : c2.DMA.d) {
            sb.append(":");
            sb.append(e2.h((b2) this.e.get(d2Var)));
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.b.equalsIgnoreCase(oVar.b) && Objects.equals(this.c, oVar.c)) {
            return Objects.equals(this.d, oVar.d);
        }
        return false;
    }

    public final int hashCode() {
        int i;
        Boolean bool = this.c;
        if (bool == null) {
            i = 3;
        } else {
            i = true != bool.booleanValue() ? 13 : 7;
        }
        String str = this.d;
        return ((str == null ? 17 : str.hashCode()) * 137) + this.b.hashCode() + (i * 29);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(e2.a(this.a));
        for (d2 d2Var : c2.DMA.d) {
            sb.append(",");
            sb.append(d2Var.d);
            sb.append("=");
            b2 b2Var = (b2) this.e.get(d2Var);
            if (b2Var == null) {
                sb.append("uninitialized");
            } else {
                int iOrdinal = b2Var.ordinal();
                if (iOrdinal == 0) {
                    sb.append("uninitialized");
                } else if (iOrdinal == 1) {
                    sb.append("eu_consent_policy");
                } else if (iOrdinal == 2) {
                    sb.append("denied");
                } else if (iOrdinal == 3) {
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

    public o(EnumMap enumMap, int i, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(d2.class);
        this.e = enumMap2;
        enumMap2.putAll(enumMap);
        this.a = i;
        this.b = d();
        this.c = bool;
        this.d = str;
    }
}
