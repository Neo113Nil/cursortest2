package com.google.android.gms.internal.fido;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzhn extends zzhp {
    public final String zza;

    public zzhn(String str) {
        this.zza = str;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzhp zzhpVar = (zzhp) obj;
        int zza = zzhpVar.zza();
        int zzd = zzhp.zzd((byte) 96);
        if (zzd != zza) {
            return zzd - zzhpVar.zza();
        }
        String str = ((zzhn) zzhpVar).zza;
        int length = str.length();
        String str2 = this.zza;
        if (str2.length() == length) {
            return str2.compareTo(str);
        }
        return str2.length() - str.length();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzhn.class == obj.getClass()) {
            return this.zza.equals(((zzhn) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zzhp.zzd((byte) 96)), this.zza});
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("\""), this.zza, "\"");
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    public final int zza() {
        return zzhp.zzd((byte) 96);
    }
}
