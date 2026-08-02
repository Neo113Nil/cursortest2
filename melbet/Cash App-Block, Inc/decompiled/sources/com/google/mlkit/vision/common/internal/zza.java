package com.google.mlkit.vision.common.internal;

import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzlv;
import com.google.android.gms.internal.mlkit_vision_common.zzlx;
import com.google.android.gms.internal.mlkit_vision_common.zzmv;
import com.google.android.gms.internal.mlkit_vision_common.zzmw;
import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzjd;
import com.google.android.gms.measurement.internal.zzjk;
import com.google.android.gms.measurement.internal.zzjl;
import com.google.android.gms.measurement.internal.zzpg;
import com.google.android.gms.measurement.internal.zzr;
import com.google.mlkit.vision.common.InputImage;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final /* synthetic */ class zza implements Callable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object zza;
    public final /* synthetic */ Object zzb;

    public zza(zzpg zzpgVar, zzr zzrVar) {
        this.$r8$classId = 3;
        this.zza = zzrVar;
        Objects.requireNonNull(zzpgVar);
        this.zzb = zzpgVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        zzlx zzlxVar;
        int i = this.$r8$classId;
        Object obj = this.zzb;
        Object obj2 = this.zza;
        switch (i) {
            case 0:
                MobileVisionBase mobileVisionBase = (MobileVisionBase) obj2;
                InputImage inputImage = (InputImage) obj;
                mobileVisionBase.getClass();
                HashMap hashMap = zzlx.zza;
                zzmw.zza();
                int i2 = zzmv.$r8$clinit;
                zzmw.zza();
                if (Boolean.parseBoolean("")) {
                    HashMap hashMap2 = zzlx.zza;
                    if (hashMap2.get("detectorTaskWithResource#run") == null) {
                        hashMap2.put("detectorTaskWithResource#run", new zzlx("detectorTaskWithResource#run"));
                    }
                    zzlxVar = (zzlx) hashMap2.get("detectorTaskWithResource#run");
                } else {
                    zzlxVar = zzlv.zza;
                }
                zzlxVar.zzb();
                try {
                    Object run = mobileVisionBase.zzd.run(inputImage);
                    zzlxVar.close();
                    return run;
                } catch (Throwable th) {
                    try {
                        zzlxVar.close();
                    } catch (Throwable th2) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        } catch (Exception unused) {
                        }
                    }
                    throw th;
                }
            case 1:
                zzjd zzjdVar = (zzjd) obj;
                zzjdVar.zza.zzaa$1();
                zzaw zzawVar = zzjdVar.zza.zze;
                zzpg.zzaT(zzawVar);
                return zzawVar.zzn((String) obj2);
            case 2:
                zzjd zzjdVar2 = (zzjd) obj;
                zzjdVar2.zza.zzaa$1();
                return new zzao(zzjdVar2.zza.zzy(((zzr) obj2).zza));
            default:
                zzr zzrVar = (zzr) obj2;
                String str = zzrVar.zza;
                zzae.checkNotNull(str);
                zzpg zzpgVar = (zzpg) obj;
                zzjl zzB = zzpgVar.zzB(str);
                zzjk zzjkVar = zzjk.ANALYTICS_STORAGE;
                if (zzB.zzo(zzjkVar) && zzjl.zzf(100, zzrVar.zzs).zzo(zzjkVar)) {
                    return zzpgVar.zzap(zzrVar).zzd();
                }
                zzpgVar.zzaW().zzl.zza("Analytics storage consent denied. Returning null app instance id");
                return null;
        }
    }

    public /* synthetic */ zza(MobileVisionBase mobileVisionBase, InputImage inputImage) {
        this.$r8$classId = 0;
        this.zza = mobileVisionBase;
        this.zzb = inputImage;
    }

    public /* synthetic */ zza(zzjd zzjdVar, Object obj, int i) {
        this.$r8$classId = i;
        this.zza = obj;
        this.zzb = zzjdVar;
    }
}
