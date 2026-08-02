package com.google.android.gms.internal.mlkit_vision_barcode;

import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class zzxd {
    public int zzb;
    public float zzc;
    public float zzd;
    public boolean zze;
    public float zzf;
    public float zzg;
    public long zzh;
    public long zzi;
    public boolean zzj;
    public float zzk;
    public float zzl;
    public short zzm;

    public final zzxf zzm() {
        if (this.zzm == 4095) {
            return new zzxf(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.zzm & 1) == 0) {
            sb.append(" recentFramesToCheck");
        }
        if ((this.zzm & 2) == 0) {
            sb.append(" recentFramesContainingPredictedArea");
        }
        if ((this.zzm & 4) == 0) {
            sb.append(" recentFramesIou");
        }
        if ((this.zzm & 8) == 0) {
            sb.append(" maxCoverage");
        }
        if ((this.zzm & 16) == 0) {
            sb.append(" useConfidenceScore");
        }
        if ((this.zzm & 32) == 0) {
            sb.append(" lowerConfidenceScore");
        }
        if ((this.zzm & 64) == 0) {
            sb.append(" higherConfidenceScore");
        }
        if ((this.zzm & 128) == 0) {
            sb.append(" zoomIntervalInMillis");
        }
        if ((this.zzm & 256) == 0) {
            sb.append(" resetIntervalInMillis");
        }
        if ((this.zzm & 512) == 0) {
            sb.append(" enableZoomThreshold");
        }
        if ((this.zzm & 1024) == 0) {
            sb.append(" zoomInThreshold");
        }
        if ((this.zzm & 2048) == 0) {
            sb.append(" zoomOutThreshold");
        }
        a$$ExternalSyntheticBUOutline0.m$1("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
