package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public final class zzxg {
    public final float zza;
    public final float zzb;
    public final float zzc;
    public final float zzd;

    public zzxg(float f, float f2, float f3, float f4) {
        this.zza = f;
        this.zzb = f2;
        this.zzc = f3;
        this.zzd = f4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzxg) {
            zzxg zzxgVar = (zzxg) obj;
            if (Float.floatToIntBits(this.zza) == Float.floatToIntBits(zzxgVar.zza) && Float.floatToIntBits(this.zzb) == Float.floatToIntBits(zzxgVar.zzb) && Float.floatToIntBits(this.zzc) == Float.floatToIntBits(zzxgVar.zzc) && Float.floatToIntBits(this.zzd) == Float.floatToIntBits(zzxgVar.zzd) && Float.floatToIntBits(RecyclerView.DECELERATION_RATE) == Float.floatToIntBits(RecyclerView.DECELERATION_RATE)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.zzd) ^ ((((((Float.floatToIntBits(this.zza) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.zzb)) * 1000003) ^ Float.floatToIntBits(this.zzc)) * 1000003)) * 1000003) ^ Float.floatToIntBits(RecyclerView.DECELERATION_RATE);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PredictedArea{xMin=");
        sb.append(this.zza);
        sb.append(", yMin=");
        sb.append(this.zzb);
        sb.append(", xMax=");
        sb.append(this.zzc);
        sb.append(", yMax=");
        return Recorder$$ExternalSyntheticOutline1.m(this.zzd, ", confidenceScore=0.0}", sb);
    }

    public final float zzf() {
        if (!zzh()) {
            return RecyclerView.DECELERATION_RATE;
        }
        return (this.zzd - this.zzb) * (this.zzc - this.zza);
    }

    public final boolean zzh() {
        float f = this.zza;
        if (f < RecyclerView.DECELERATION_RATE) {
            return false;
        }
        float f2 = this.zzc;
        if (f >= f2 || f2 > 1.0f) {
            return false;
        }
        float f3 = this.zzb;
        if (f3 < RecyclerView.DECELERATION_RATE) {
            return false;
        }
        float f4 = this.zzd;
        return f3 < f4 && f4 <= 1.0f;
    }
}
