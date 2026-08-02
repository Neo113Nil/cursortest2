package com.google.android.gms.internal.mlkit_genai_prompt;

import android.app.ActivityManager;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzds implements zzjt {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ zzer zza;

    public /* synthetic */ zzds(zzer zzerVar, int i) {
        this.$r8$classId = i;
        this.zza = zzerVar;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzjt
    public final ListenableFuture zza(Object obj) {
        int i = this.$r8$classId;
        int i2 = 1;
        zzer zzerVar = this.zza;
        switch (i) {
            case 0:
                zzcs zzcsVar = (zzcs) obj;
                try {
                    return zzki.zzd(new zzfo(zzerVar.zzg(zzcsVar.zza), zzcsVar.zzb));
                } catch (RemoteException e) {
                    Log.e("zzer", "Failed to initialize service.", e);
                    return zzki.zzc(new zzcm(2, 6, "Failed to initialize service.", e));
                } catch (RuntimeException e2) {
                    Log.e("zzer", "Failed to initialize service.", e2);
                    return zzki.zzc(new zzcm(2, 0, "Failed to initialize service.", e2));
                }
            case 1:
                return !((Boolean) obj).booleanValue() ? zzki.zzc(zzcm.zzb(30, "Request blocked due to background use.", null)) : zzerVar.zzv();
            case 2:
                Integer num = (Integer) obj;
                if (num.intValue() == 0 || num.intValue() == 2147483646) {
                    return zzerVar.zzv();
                }
                final int intValue = num.intValue();
                zzku zzkuVar = zzerVar.zze.zzf;
                zzlc zzlcVar = new zzlc(new Callable() { // from class: com.google.android.gms.internal.mlkit_genai_prompt.zzcx
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        return Boolean.valueOf(runningAppProcessInfo.importance <= intValue);
                    }
                });
                zzkuVar.execute(zzlcVar);
                return zzki.zzh(zzjz.zzw(zzlcVar), new zzds(zzerVar, i2), zzerVar.zzb);
            case 3:
                try {
                    zzad zzadVar = ((zzcs) obj).zza;
                    zzm zze = zzerVar.zza.zze();
                    zzab zzabVar = (zzab) zzadVar;
                    Parcel zza = zzabVar.zza();
                    int i3 = zzl.$r8$clinit;
                    zza.writeInt(1);
                    zze.writeToParcel(zza, 0);
                    Parcel zzb = zzabVar.zzb(zza, 39);
                    int readInt = zzb.readInt();
                    zzb.recycle();
                    return zzki.zzd(Integer.valueOf(readInt));
                } catch (RemoteException e3) {
                    return zzki.zzc(zzcm.zzb(6, "Failed to connect to AICore service.", e3));
                }
            default:
                return zzerVar.zze.zzu().zza();
        }
    }
}
