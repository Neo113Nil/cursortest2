package com.google.android.gms.internal.mlkit_genai_prompt;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class zzmd {
    public final String zza;
    public final String zzb;
    public final long zzc;

    public zzmd(String str, String str2, long j) {
        str.getClass();
        str2.getClass();
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzmd)) {
            return false;
        }
        zzmd zzmdVar = (zzmd) obj;
        return Intrinsics.areEqual(this.zza, zzmdVar.zza) && Intrinsics.areEqual(this.zzb, zzmdVar.zzb) && this.zzc == zzmdVar.zzc;
    }

    public final int hashCode() {
        int hashCode = this.zzb.hashCode() + (this.zza.hashCode() * 31);
        long j = this.zzc;
        return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CacheMetadata(id=");
        sb.append(this.zza);
        sb.append(", path=");
        sb.append(this.zzb);
        sb.append(", lastAccessTime=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(this.zzc, ")", sb);
    }
}
