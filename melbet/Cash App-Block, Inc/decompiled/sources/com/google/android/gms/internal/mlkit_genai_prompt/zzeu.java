package com.google.android.gms.internal.mlkit_genai_prompt;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.mlkit.genai.common.GenAiException;
import java.util.concurrent.CancellationException;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzeu implements zzjt {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object zza;

    public /* synthetic */ zzeu(Object obj, int i) {
        this.$r8$classId = i;
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzjt
    public final ListenableFuture zza(Object obj) {
        GenAiException genAiException;
        GenAiException genAiException2;
        int i = this.$r8$classId;
        Object obj2 = this.zza;
        int i2 = 0;
        switch (i) {
            case 0:
                zzct zzctVar = (zzct) obj2;
                zzad zzadVar = (zzad) obj;
                try {
                    zzm zze = zzctVar.zze();
                    zzab zzabVar = (zzab) zzadVar;
                    Parcel zza = zzabVar.zza();
                    int i3 = zzl.$r8$clinit;
                    zza.writeInt(1);
                    zze.writeToParcel(zza, 0);
                    Parcel zzb = zzabVar.zzb(zza, 3);
                    int readInt = zzb.readInt();
                    zzb.recycle();
                    return zzki.zzd(Integer.valueOf(readInt));
                } catch (RemoteException e) {
                    Log.e("zzfn", "AiCore service failed to get feature status for ".concat(zzctVar.zza), e);
                    return zzki.zzc(new zzcm(3, 6, "AiCore service failed to get feature status for ".concat(zzctVar.zza), e));
                }
            case 1:
                Throwable th = (Throwable) obj;
                if (th instanceof GenAiException) {
                    genAiException2 = (GenAiException) th;
                } else {
                    if (th instanceof zzcm) {
                        zzcm zzcmVar = (zzcm) th;
                        genAiException = new GenAiException(zzcmVar, zzcmVar.zza);
                    } else {
                        if (th instanceof CancellationException) {
                            String message = th.getMessage();
                            genAiException = new GenAiException(7, message != null ? message : "", th);
                        } else {
                            String message2 = th.getMessage();
                            genAiException = new GenAiException(0, message2 != null ? message2 : "", th);
                        }
                    }
                    genAiException2 = genAiException;
                }
                ((zzajc) obj2).zza(genAiException2);
                return zzki.zzc(genAiException2);
            default:
                zzajh zzajhVar = (zzajh) obj2;
                zzct zzctVar2 = (zzct) obj;
                if (zzctVar2 == null) {
                    return zzki.zzd(0);
                }
                zzfn zzfnVar = zzajhVar.zza;
                zzfnVar.zzv();
                return zzki.zzh(zzki.zzg(zzjz.zzw(zzfnVar.zzu().zza()), new zzet(), zzjx.zza), new zzeu(zzctVar2, i2), zzfnVar.zzf);
        }
    }
}
