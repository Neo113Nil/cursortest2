package com.google.mlkit.vision.face;

import android.graphics.PointF;
import com.google.android.gms.maps.zzah;

/* loaded from: classes4.dex */
public final class FaceLandmark {
    public final int zza;
    public final PointF zzb;

    public FaceLandmark(int i, PointF pointF) {
        this.zza = i;
        this.zzb = pointF;
    }

    public final String toString() {
        zzah zzahVar = new zzah("FaceLandmark", 11);
        zzahVar.zzb(this.zza, "type");
        zzahVar.zzc(this.zzb, "position");
        return zzahVar.toString();
    }
}
