package com.google.mlkit.vision.face;

import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.internal.mlkit_vision_face.zzt;
import com.google.android.gms.maps.zzah;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class FaceDetectorOptions {
    public final int zza;
    public final float zzf;

    public /* synthetic */ FaceDetectorOptions(float f, int i) {
        this.zza = i;
        this.zzf = f;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof FaceDetectorOptions)) {
                return false;
            }
            FaceDetectorOptions faceDetectorOptions = (FaceDetectorOptions) obj;
            if (Float.floatToIntBits(this.zzf) != Float.floatToIntBits(faceDetectorOptions.zzf) || !zzae.equal(Integer.valueOf(this.zza), Integer.valueOf(faceDetectorOptions.zza)) || !zzae.equal(1, 1) || !zzae.equal(1, 1)) {
                return false;
            }
            Boolean bool = Boolean.FALSE;
            if (!zzae.equal(bool, bool) || !zzae.equal(1, 1) || !zzae.equal(null, null)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Float.floatToIntBits(this.zzf)), Integer.valueOf(this.zza), 1, 1, Boolean.FALSE, 1, null});
    }

    public final String toString() {
        zzah zzahVar = new zzah("FaceDetectorOptions", 11);
        zzahVar.zzb(this.zza, "landmarkMode");
        zzahVar.zzb(1, "contourMode");
        zzahVar.zzb(1, "classificationMode");
        zzahVar.zzb(1, "performanceMode");
        String valueOf = String.valueOf(false);
        zzt zztVar = new zzt(10, false);
        ((zzah) zzahVar.zzc).zzc = zztVar;
        zzahVar.zzc = zztVar;
        zztVar.zzb = valueOf;
        zztVar.f68zza = "trackingEnabled";
        zzahVar.zza("minFaceSize", this.zzf);
        return zzahVar.toString();
    }
}
