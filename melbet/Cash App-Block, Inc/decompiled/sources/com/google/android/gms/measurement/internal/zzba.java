package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.plaid.internal.EnumC0170g;
import java.util.EnumMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzba {
    public static final zzba zza = new zzba((Boolean) null, 100, (Boolean) null, (String) null);
    public final int zzb;
    public final String zzc;
    public final Boolean zzd;
    public final String zze;
    public final EnumMap zzf;

    public zzba(Boolean bool, int i, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(zzjk.class);
        this.zzf = enumMap;
        enumMap.put((EnumMap) zzjk.AD_USER_DATA, (zzjk) (bool == null ? zzji.UNINITIALIZED : bool.booleanValue() ? zzji.GRANTED : zzji.DENIED));
        this.zzb = i;
        this.zzc = zzl();
        this.zzd = bool2;
        this.zze = str;
    }

    public static zzba zzg(String str) {
        if (str == null || str.length() <= 0) {
            return zza;
        }
        String[] split = str.split(":");
        int parseInt = Integer.parseInt(split[0]);
        EnumMap enumMap = new EnumMap(zzjk.class);
        zzjk[] zzjkVarArr = zzjj.DMA.zzc;
        int length = zzjkVarArr.length;
        int i = 1;
        int i2 = 0;
        while (i2 < length) {
            enumMap.put((EnumMap) zzjkVarArr[i2], (zzjk) zzjl.zzj(split[i].charAt(0)));
            i2++;
            i++;
        }
        return new zzba(enumMap, parseInt, (Boolean) null, (String) null);
    }

    public static zzba zzh(int i, Bundle bundle) {
        if (bundle == null) {
            return new zzba((Boolean) null, i, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(zzjk.class);
        for (zzjk zzjkVar : zzjj.DMA.zzc) {
            enumMap.put((EnumMap) zzjkVar, (zzjk) zzjl.zzg(bundle.getString(zzjkVar.zze)));
        }
        return new zzba(enumMap, i, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzba)) {
            return false;
        }
        zzba zzbaVar = (zzba) obj;
        if (this.zzc.equalsIgnoreCase(zzbaVar.zzc) && Objects.equals(this.zzd, zzbaVar.zzd)) {
            return Objects.equals(this.zze, zzbaVar.zze);
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = this.zzd;
        int i = bool == null ? 3 : true != bool.booleanValue() ? 13 : 7;
        String str = this.zze;
        return ((str == null ? 17 : str.hashCode()) * EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE) + this.zzc.hashCode() + (i * 29);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(zzjl.zzd(this.zzb));
        for (zzjk zzjkVar : zzjj.DMA.zzc) {
            sb.append(",");
            sb.append(zzjkVar.zze);
            sb.append("=");
            zzji zzjiVar = (zzji) this.zzf.get(zzjkVar);
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
        Boolean bool = this.zzd;
        if (bool != null) {
            sb.append(",isDmaRegion=");
            sb.append(bool);
        }
        String str = this.zze;
        if (str != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(str);
        }
        return sb.toString();
    }

    public final zzji zzc() {
        zzji zzjiVar = (zzji) this.zzf.get(zzjk.AD_USER_DATA);
        return zzjiVar == null ? zzji.UNINITIALIZED : zzjiVar;
    }

    public final String zzl() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.zzb);
        for (zzjk zzjkVar : zzjj.DMA.zzc) {
            sb.append(":");
            sb.append(zzjl.zzm((zzji) this.zzf.get(zzjkVar)));
        }
        return sb.toString();
    }

    public zzba(EnumMap enumMap, int i, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(zzjk.class);
        this.zzf = enumMap2;
        enumMap2.putAll(enumMap);
        this.zzb = i;
        this.zzc = zzl();
        this.zzd = bool;
        this.zze = str;
    }
}
