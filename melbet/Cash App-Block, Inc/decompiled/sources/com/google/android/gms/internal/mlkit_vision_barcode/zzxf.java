package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;

/* loaded from: classes4.dex */
public final class zzxf {
    public static final zzxf zza;
    public final int zzc;
    public final float zzd;
    public final float zze;
    public final boolean zzf;
    public final float zzg;
    public final float zzh;
    public final long zzi;
    public final long zzj;
    public final boolean zzk;
    public final float zzl;
    public final float zzm;

    static {
        zzm().zzm();
        zzxd zzm = zzm();
        zzm.zze = false;
        zzm.zzm = (short) (zzm.zzm | 16);
        zza = zzm.zzm();
    }

    public zzxf(int i, float f, float f2, boolean z, float f3, float f4, long j, long j2, boolean z2, float f5, float f6) {
        this.zzc = i;
        this.zzd = f;
        this.zze = f2;
        this.zzf = z;
        this.zzg = f3;
        this.zzh = f4;
        this.zzi = j;
        this.zzj = j2;
        this.zzk = z2;
        this.zzl = f5;
        this.zzm = f6;
    }

    public static zzxd zzm() {
        zzxd zzxdVar = new zzxd();
        short s = (short) (zzxdVar.zzm | 1);
        zzxdVar.zzb = 5;
        zzxdVar.zzc = 0.25f;
        zzxdVar.zzd = 0.8f;
        zzxdVar.zze = true;
        zzxdVar.zzf = 0.5f;
        zzxdVar.zzg = 0.8f;
        zzxdVar.zzh = 1500L;
        zzxdVar.zzi = 3000L;
        zzxdVar.zzj = true;
        zzxdVar.zzk = 0.1f;
        zzxdVar.zzl = 0.05f;
        zzxdVar.zzm = (short) (((short) (((short) (((short) (((short) (((short) (((short) (((short) (((short) (((short) (((short) (s | 2)) | 4)) | 8)) | 16)) | 32)) | 64)) | 128)) | 256)) | 512)) | 1024)) | 2048);
        return zzxdVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzxf)) {
            return false;
        }
        zzxf zzxfVar = (zzxf) obj;
        return this.zzc == zzxfVar.zzc && Float.floatToIntBits(this.zzd) == Float.floatToIntBits(zzxfVar.zzd) && Float.floatToIntBits(this.zze) == Float.floatToIntBits(zzxfVar.zze) && this.zzf == zzxfVar.zzf && Float.floatToIntBits(this.zzg) == Float.floatToIntBits(zzxfVar.zzg) && Float.floatToIntBits(this.zzh) == Float.floatToIntBits(zzxfVar.zzh) && this.zzi == zzxfVar.zzi && this.zzj == zzxfVar.zzj && this.zzk == zzxfVar.zzk && Float.floatToIntBits(this.zzl) == Float.floatToIntBits(zzxfVar.zzl) && Float.floatToIntBits(this.zzm) == Float.floatToIntBits(zzxfVar.zzm);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.zzm) ^ (((((((((((((((((((((-715379941) ^ this.zzc) * 1000003) ^ Float.floatToIntBits(this.zzd)) * 1000003) ^ Float.floatToIntBits(this.zze)) * 1000003) ^ (true != this.zzf ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.zzg)) * 1000003) ^ Float.floatToIntBits(this.zzh)) * 1000003) ^ ((int) this.zzi)) * 1000003) ^ ((int) this.zzj)) * 1000003) ^ (true != this.zzk ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.zzl)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AutoZoomOptions{recentFramesToCheck=10, recentFramesContainingPredictedArea=");
        sb.append(this.zzc);
        sb.append(", recentFramesIou=");
        sb.append(this.zzd);
        sb.append(", maxCoverage=");
        sb.append(this.zze);
        sb.append(", useConfidenceScore=");
        sb.append(this.zzf);
        sb.append(", lowerConfidenceScore=");
        sb.append(this.zzg);
        sb.append(", higherConfidenceScore=");
        sb.append(this.zzh);
        sb.append(", zoomIntervalInMillis=");
        sb.append(this.zzi);
        sb.append(", resetIntervalInMillis=");
        sb.append(this.zzj);
        sb.append(", enableZoomThreshold=");
        sb.append(this.zzk);
        sb.append(", zoomInThreshold=");
        sb.append(this.zzl);
        sb.append(", zoomOutThreshold=");
        return Recorder$$ExternalSyntheticOutline1.m(this.zzm, "}", sb);
    }
}
