package com.google.mlkit.vision.face;

import com.google.android.gms.maps.zzah;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class FaceContour {
    public final int zza;
    public final ArrayList zzb;

    public FaceContour(int i, ArrayList arrayList) {
        this.zza = i;
        this.zzb = arrayList;
    }

    public final String toString() {
        zzah zzahVar = new zzah("FaceContour", 11);
        zzahVar.zzb(this.zza, "type");
        zzahVar.zzc(this.zzb.toArray(), "points");
        return zzahVar.toString();
    }
}
