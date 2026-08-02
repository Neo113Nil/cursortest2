package com.google.mlkit.vision.face.internal;

import android.graphics.Rect;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseArray;
import com.fillr.e0;
import com.fillr.profile.adapter.ProfileAdapter;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.internal.mlkit_vision_face.zzdn;
import com.google.android.gms.internal.mlkit_vision_face.zzkr;
import com.google.android.gms.internal.mlkit_vision_face.zzks;
import com.google.android.gms.internal.mlkit_vision_face.zzkt;
import com.google.android.gms.internal.mlkit_vision_face.zzoc;
import com.google.android.gms.internal.mlkit_vision_face.zzoe;
import com.google.firebase.messaging.SyncTask;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.MLTask;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.common.internal.BitmapInStreamingChecker;
import com.google.mlkit.vision.face.Face;
import com.google.mlkit.vision.face.FaceContour;
import com.google.mlkit.vision.face.FaceDetectorOptions;
import com.nimbusds.jose.JWECryptoParts;
import com.nimbusds.jose.jca.JCAContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.brotli.dec.HuffmanTreeGroup;

/* loaded from: classes4.dex */
public final class zzh extends MLTask {
    public static final AtomicBoolean zza = new AtomicBoolean(true);
    public static final com.google.mlkit.vision.common.internal.zzc zzb = com.google.mlkit.vision.common.internal.zzc.zzb;
    public final FaceDetectorOptions zzc;
    public final zzoc zzd;
    public final zzoe zze;
    public final zzb zzf;
    public boolean zzg;
    public final BitmapInStreamingChecker zzh = new BitmapInStreamingChecker();

    public zzh(zzoc zzocVar, FaceDetectorOptions faceDetectorOptions, zzb zzbVar) {
        zzae.checkNotNull(faceDetectorOptions, "FaceDetectorOptions can not be null");
        this.zzc = faceDetectorOptions;
        this.zzd = zzocVar;
        this.zzf = zzbVar;
        this.zze = new zzoe(MlKitContext.getInstance().getApplicationContext(), 0);
    }

    @Override // com.google.mlkit.common.sdkinternal.MLTask
    public final synchronized void load() {
        this.zzg = this.zzf.zzd();
    }

    @Override // com.google.mlkit.common.sdkinternal.MLTask
    public final synchronized void release() {
        try {
            this.zzf.zzb();
            zza.set(true);
            zzoc zzocVar = this.zzd;
            e0 e0Var = new e0(19);
            e0Var.c = this.zzg ? zzkr.TYPE_THICK : zzkr.TYPE_THIN;
            com.google.mlkit.common.sdkinternal.zzh.zza.execute(new ProfileAdapter.AnonymousClass8((Object) zzocVar, (Object) new HuffmanTreeGroup(e0Var, 0), (Enum) zzkt.ON_DEVICE_FACE_CLOSE, zzocVar.zzj(), 7));
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        com.google.android.gms.common.internal.zzae.checkNotNull(r0);
        r6 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011a A[Catch: all -> 0x002b, MlKitException -> 0x002e, Merged into TryCatch #1 {all -> 0x002b, MlKitException -> 0x002e, blocks: (B:4:0x0005, B:6:0x000e, B:10:0x0021, B:11:0x002a, B:14:0x0033, B:16:0x010a, B:22:0x0120, B:25:0x011a, B:26:0x0110, B:28:0x0041, B:29:0x0045, B:30:0x004e, B:32:0x0054, B:33:0x005f, B:35:0x0065, B:37:0x006f, B:39:0x0073, B:41:0x0079, B:43:0x00ca, B:44:0x00d2, B:46:0x00d8, B:50:0x00ec, B:57:0x00f9, B:62:0x0102, B:65:0x012b, B:67:0x0131, B:69:0x0138, B:70:0x0141, B:71:0x0135), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0110 A[Catch: all -> 0x002b, MlKitException -> 0x002e, Merged into TryCatch #1 {all -> 0x002b, MlKitException -> 0x002e, blocks: (B:4:0x0005, B:6:0x000e, B:10:0x0021, B:11:0x002a, B:14:0x0033, B:16:0x010a, B:22:0x0120, B:25:0x011a, B:26:0x0110, B:28:0x0041, B:29:0x0045, B:30:0x004e, B:32:0x0054, B:33:0x005f, B:35:0x0065, B:37:0x006f, B:39:0x0073, B:41:0x0079, B:43:0x00ca, B:44:0x00d2, B:46:0x00d8, B:50:0x00ec, B:57:0x00f9, B:62:0x0102, B:65:0x012b, B:67:0x0131, B:69:0x0138, B:70:0x0141, B:71:0x0135), top: B:3:0x0005 }] */
    @Override // com.google.mlkit.common.sdkinternal.MLTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object run(InputImage inputImage) {
        long elapsedRealtime;
        List list;
        Collection arrayList;
        List list2;
        List list3;
        Rect rect;
        synchronized (this) {
            try {
                elapsedRealtime = SystemClock.elapsedRealtime();
                this.zzh.check(inputImage);
                Pair zza2 = this.zzf.zza(inputImage);
                List<Face> list4 = (List) zza2.first;
                List<Face> list5 = (List) zza2.second;
                if (list4 == null && list5 == null) {
                    throw new MlKitException("No detector is enabled", 13);
                }
                if (list5 == null) {
                    List list6 = list4;
                    list = list5;
                    list2 = list4;
                    arrayList = list6;
                    zzg(zzks.NO_ERROR, elapsedRealtime, inputImage, list != null ? 0 : list.size(), list2 != null ? 0 : list2.size());
                    zza.set(false);
                } else {
                    HashSet hashSet = new HashSet();
                    for (Face face : list5) {
                        boolean z = false;
                        for (Face face2 : list4) {
                            Rect rect2 = face.zza;
                            if (rect2 == null || (rect = face2.zza) == null || !rect2.intersect(rect)) {
                                list3 = list5;
                            } else {
                                list3 = list5;
                                double min = (Math.min(rect2.bottom, rect.bottom) - Math.max(rect2.top, rect.top)) * (Math.min(rect2.right, rect.right) - Math.max(rect2.left, rect.left));
                                if (min / ((((rect2.bottom - rect2.top) * (rect2.right - rect2.left)) + ((rect.bottom - rect.top) * (rect.right - rect.left))) - min) > 0.6d) {
                                    SparseArray sparseArray = face.zzj;
                                    SparseArray sparseArray2 = face2.zzj;
                                    sparseArray2.clear();
                                    for (int i = 0; i < sparseArray.size(); i++) {
                                        sparseArray2.put(sparseArray.keyAt(i), (FaceContour) sparseArray.valueAt(i));
                                    }
                                    z = true;
                                }
                            }
                            hashSet.add(face2);
                            list5 = list3;
                        }
                        List list7 = list5;
                        if (!z) {
                            hashSet.add(face);
                        }
                        list5 = list7;
                    }
                    list = list5;
                    arrayList = new ArrayList(hashSet);
                    list2 = list4;
                    zzg(zzks.NO_ERROR, elapsedRealtime, inputImage, list != null ? 0 : list.size(), list2 != null ? 0 : list2.size());
                    zza.set(false);
                }
            } catch (MlKitException e) {
                zzg(e.zza == 14 ? zzks.MODEL_NOT_DOWNLOADED : zzks.UNKNOWN_ERROR, elapsedRealtime, inputImage, 0, 0);
                throw e;
            } finally {
            }
        }
        return arrayList;
    }

    public final synchronized void zzg(zzks zzksVar, long j, InputImage inputImage, int i, int i2) {
        try {
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime() - j;
                this.zzd.zzf(new zzf(this, elapsedRealtime, zzksVar, i, i2, inputImage), zzkt.ON_DEVICE_FACE_DETECT);
                JWECryptoParts jWECryptoParts = new JWECryptoParts();
                jWECryptoParts.header = zzksVar;
                jWECryptoParts.encryptedKey = Boolean.valueOf(zza.get());
                jWECryptoParts.cipherText = Integer.valueOf(i & Integer.MAX_VALUE);
                jWECryptoParts.authenticationTag = Integer.valueOf(i2 & Integer.MAX_VALUE);
                jWECryptoParts.iv = zzj.zza(this.zzc);
                com.google.mlkit.common.sdkinternal.zzh.zza.execute(new SyncTask(this.zzd, new zzdn(jWECryptoParts), elapsedRealtime, new JCAContext(this, 10)));
                long currentTimeMillis = System.currentTimeMillis();
                this.zze.zzc(currentTimeMillis - elapsedRealtime, currentTimeMillis, true != this.zzg ? 24303 : 24304, zzksVar.zzX);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }
}
