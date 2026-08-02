package com.google.android.gms.internal.mlkit_genai_prompt;

import android.util.Log;
import androidx.camera.video.VideoCapture;
import androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture;
import androidx.room.util.DBUtil;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzdz implements zzjt {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ zzer zza;
    public final /* synthetic */ Object zzb;

    public /* synthetic */ zzdz(zzer zzerVar, Object obj, int i) {
        this.$r8$classId = i;
        this.zza = zzerVar;
        this.zzb = obj;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzjt
    public final ListenableFuture zza(Object obj) {
        int i = this.$r8$classId;
        int i2 = 3;
        Object obj2 = this.zzb;
        zzer zzerVar = this.zza;
        switch (i) {
            case 0:
                Executor executor = zzerVar.zzg;
                zzct zzctVar = zzerVar.zza;
                zzzx zzzxVar = (zzzx) obj2;
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                int i3 = 0;
                if (intValue == 0) {
                    zzcm zzc = zzcm.zzc(0, null, "Feature is unavailable.");
                    executor.execute(new zzeh(0));
                    return zzki.zzc(zzc);
                }
                if (intValue == 1 || intValue == 2) {
                    zzfn zzfnVar = zzerVar.zze;
                    return zzki.zzh(zzfnVar.zzu().zza(), new zzex(zzfnVar, zzctVar, zzzxVar, i3), zzfnVar.zzf);
                }
                if (intValue != 3) {
                    return zzki.zzc(zzcm.zzc(0, null, "Unexpected feature status: ".concat(String.valueOf(num))));
                }
                Log.i("zzer", "Feature " + zzctVar.zza + " is downloaded and ready.");
                executor.execute(new zzeg(zzerVar, zzzxVar));
                return zzkm.zza;
            default:
                zzfo zzfoVar = (zzfo) obj;
                CallbackToFutureAdapter$SafeFuture future = DBUtil.getFuture(new zzlq(i2, zzerVar, zzfoVar, obj2));
                VideoCapture.AnonymousClass3 anonymousClass3 = zzfoVar.zzb;
                zzzx zzzxVar2 = new zzzx(13);
                anonymousClass3.getClass();
                return DBUtil.getFuture(new zzlq(4, anonymousClass3, future, zzzxVar2));
        }
    }
}
