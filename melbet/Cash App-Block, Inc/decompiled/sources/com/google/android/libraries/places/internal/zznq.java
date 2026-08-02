package com.google.android.libraries.places.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class zznq {
    public final String zza;
    public final int zzb;
    public final zzns zzc;

    public zznq(String str, int i, zzns zznsVar) {
        this.zza = str;
        this.zzb = i;
        this.zzc = zznsVar;
    }

    public static zznp zzd(Context context) {
        String packageName = context.getPackageName();
        int i = 0;
        try {
            i = context.getPackageManager().getPackageInfo(packageName, 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        zznp zznpVar = new zznp();
        if (packageName == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null packageName");
            return null;
        }
        zznpVar.zza = packageName;
        zznpVar.zzb = i;
        zznpVar.zzd = (byte) 1;
        zznpVar.zzc = zzns.zza;
        return zznpVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zznq) {
            zznq zznqVar = (zznq) obj;
            if (this.zza.equals(zznqVar.zza) && this.zzb == zznqVar.zzb && this.zzc.equals(zznqVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzc.hashCode() ^ ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb) * 1000003);
    }

    public final String toString() {
        String obj = this.zzc.toString();
        int i = this.zzb;
        int length = String.valueOf(i).length();
        int length2 = obj.length();
        String str = this.zza;
        StringBuilder sb = new StringBuilder(str.length() + 40 + length + 16 + length2 + 1);
        sb.append("ClientProfile{packageName=");
        sb.append(str);
        sb.append(", versionCode=");
        sb.append(i);
        return Recorder$$ExternalSyntheticOutline2.m(sb, ", requestSource=", obj, "}");
    }
}
