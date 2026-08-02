package com.google.android.gms.internal.measurement;

import androidx.core.view.NestedScrollingParentHelper;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;

/* loaded from: classes.dex */
public final class zznv {
    public final zznd zza;
    public final NestedScrollingParentHelper zzb;

    public zznv(zznd zzndVar, NestedScrollingParentHelper nestedScrollingParentHelper) {
        this.zza = zzndVar;
        this.zzb = nestedScrollingParentHelper;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zznv) {
            zznv zznvVar = (zznv) obj;
            zznd zzndVar = zznvVar.zza;
            zznd zzndVar2 = this.zza;
            if (zzndVar2 != null ? zzndVar2 == zzndVar : zzndVar == null) {
                return this.zzb == zznvVar.zzb;
            }
        }
        return false;
    }

    public final int hashCode() {
        zznd zzndVar = this.zza;
        return this.zzb.hashCode() ^ (((zzndVar == null ? 0 : zzndVar.hashCode()) ^ 1000003) * 1000003);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String obj = this.zzb.toString();
        StringBuilder sb = new StringBuilder(valueOf.length() + 52 + obj.length() + 1);
        Boxes$$ExternalSyntheticOutline1.m(sb, "SnapshotBlobAndResult{snapshotBlob=", valueOf, ", snapshotResult=", obj);
        sb.append("}");
        return sb.toString();
    }
}
