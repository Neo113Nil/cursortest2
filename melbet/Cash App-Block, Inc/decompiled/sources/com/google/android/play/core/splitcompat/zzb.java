package com.google.android.play.core.splitcompat;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import java.io.File;

/* loaded from: classes4.dex */
public final class zzb {
    public final File zza;
    public final String zzb;

    public zzb(File file, String str) {
        this.zza = file;
        this.zzb = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzb)) {
            return false;
        }
        zzb zzbVar = (zzb) obj;
        return this.zza.equals(zzbVar.zza) && this.zzb.equals(zzbVar.zzb);
    }

    public final int hashCode() {
        return this.zzb.hashCode() ^ ((this.zza.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("SplitFileInfo{splitFile=", this.zza.toString(), ", splitId=", this.zzb, "}");
    }
}
