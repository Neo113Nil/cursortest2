package com.google.mlkit.vision.face;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.SparseArray;
import com.google.android.gms.internal.mlkit_vision_face.zzd;
import com.google.android.gms.internal.mlkit_vision_face.zzf;
import com.google.android.gms.internal.mlkit_vision_face.zzn;
import com.google.android.gms.internal.mlkit_vision_face.zzos;
import com.google.android.gms.internal.mlkit_vision_face.zzow;
import com.google.android.gms.internal.mlkit_vision_face.zzpc;
import com.google.android.gms.maps.zzah;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class Face {
    public final Rect zza;
    public int zzb;
    public final float zzc;
    public final float zzd;
    public final float zze;
    public final float zzf;
    public final float zzg;
    public final float zzh;
    public final SparseArray zzi = new SparseArray();
    public final SparseArray zzj = new SparseArray();

    public Face(zzf zzfVar) {
        float f = zzfVar.zzc;
        float f2 = zzfVar.zze / 2.0f;
        float f3 = zzfVar.zzd;
        float f4 = zzfVar.zzf / 2.0f;
        this.zza = new Rect((int) (f - f2), (int) (f3 - f4), (int) (f + f2), (int) (f3 + f4));
        this.zzb = zzfVar.zzb;
        for (zzn zznVar : zzfVar.zzj) {
            if (zze(zznVar.zzd)) {
                PointF pointF = new PointF(zznVar.zzb, zznVar.zzc);
                SparseArray sparseArray = this.zzi;
                int i = zznVar.zzd;
                sparseArray.put(i, new FaceLandmark(i, pointF));
            }
        }
        for (zzd zzdVar : zzfVar.zzn) {
            int i2 = zzdVar.zzb;
            if (i2 <= 15 && i2 > 0) {
                PointF[] pointFArr = zzdVar.zza;
                pointFArr.getClass();
                long length = pointFArr.length + 5 + (r5 / 10);
                ArrayList arrayList = new ArrayList(length > 2147483647L ? Integer.MAX_VALUE : (int) length);
                Collections.addAll(arrayList, pointFArr);
                this.zzj.put(i2, new FaceContour(i2, arrayList));
            }
        }
        this.zzf = zzfVar.zzi;
        this.zzg = zzfVar.zzg;
        this.zzh = zzfVar.zzh;
        this.zze = zzfVar.zzm;
        this.zzd = zzfVar.zzk;
        this.zzc = zzfVar.zzl;
    }

    public static boolean zze(int i) {
        return i == 0 || i == 1 || i == 7 || i == 3 || i == 9 || i == 4 || i == 10 || i == 5 || i == 11 || i == 6;
    }

    public final String toString() {
        zzah zzahVar = new zzah("Face", 11);
        zzahVar.zzc(this.zza, "boundingBox");
        zzahVar.zzb(this.zzb, "trackingId");
        zzahVar.zza("rightEyeOpenProbability", this.zzc);
        zzahVar.zza("leftEyeOpenProbability", this.zzd);
        zzahVar.zza("smileProbability", this.zze);
        zzahVar.zza("eulerX", this.zzf);
        zzahVar.zza("eulerY", this.zzg);
        zzahVar.zza("eulerZ", this.zzh);
        zzah zzahVar2 = new zzah("Landmarks", 11);
        for (int i = 0; i <= 11; i++) {
            if (zze(i)) {
                zzahVar2.zzc((FaceLandmark) this.zzi.get(i), JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "landmark_"));
            }
        }
        zzahVar.zzc(zzahVar2.toString(), "landmarks");
        zzah zzahVar3 = new zzah("Contours", 11);
        for (int i2 = 1; i2 <= 15; i2++) {
            zzahVar3.zzc((FaceContour) this.zzj.get(i2), JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "Contour_"));
        }
        zzahVar.zzc(zzahVar3.toString(), "contours");
        return zzahVar.toString();
    }

    public Face(zzow zzowVar) {
        this.zza = zzowVar.zzb;
        this.zzb = zzowVar.zza;
        for (zzpc zzpcVar : zzowVar.zzj) {
            if (zze(zzpcVar.zza)) {
                PointF pointF = zzpcVar.zzb;
                SparseArray sparseArray = this.zzi;
                int i = zzpcVar.zza;
                sparseArray.put(i, new FaceLandmark(i, pointF));
            }
        }
        for (zzos zzosVar : zzowVar.zzk) {
            int i2 = zzosVar.zza;
            if (i2 <= 15 && i2 > 0) {
                List list = zzosVar.zzb;
                list.getClass();
                this.zzj.put(i2, new FaceContour(i2, new ArrayList(list)));
            }
        }
        this.zzf = zzowVar.zze;
        this.zzg = zzowVar.zzd;
        this.zzh = -zzowVar.zzc;
        this.zze = zzowVar.zzh;
        this.zzd = zzowVar.zzf;
        this.zzc = zzowVar.zzg;
    }
}
