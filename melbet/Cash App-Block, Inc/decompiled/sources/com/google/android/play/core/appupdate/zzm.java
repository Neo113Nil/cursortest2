package com.google.android.play.core.appupdate;

import android.os.RemoteException;
import android.util.Log;
import com.fillr.browsersdk.utilities.Obfuscator;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.appupdate.internal.zzn;
import com.google.android.play.core.appupdate.internal.zzx;
import com.google.zxing.BinaryBitmap;

/* loaded from: classes4.dex */
public final class zzm extends zzn {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object zza;
    public final /* synthetic */ TaskCompletionSource zzb;
    public final /* synthetic */ Object zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzm(zzx zzxVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, zzm zzmVar) {
        super(taskCompletionSource);
        this.zzc = zzxVar;
        this.zzb = taskCompletionSource2;
        this.zza = zzmVar;
    }

    @Override // com.google.android.play.core.appupdate.internal.zzn
    public final void zza() {
        switch (this.$r8$classId) {
            case 0:
                TaskCompletionSource taskCompletionSource = this.zzb;
                zzr zzrVar = (zzr) this.zzc;
                String str = (String) this.zza;
                try {
                    zzrVar.zza.zzn.zzd(zzrVar.zzd, zzr.zzb(zzrVar, str), new zzq(zzrVar, taskCompletionSource, str));
                    return;
                } catch (RemoteException e) {
                    Obfuscator obfuscator = zzr.zzb;
                    Object[] objArr = {str};
                    obfuscator.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", Obfuscator.zzf(obfuscator.salt, "requestUpdateInfo(%s)", objArr), e);
                    }
                    taskCompletionSource.trySetException(new RuntimeException(e));
                    return;
                }
            default:
                synchronized (((zzx) this.zzc).zzg) {
                    try {
                        zzx zzxVar = (zzx) this.zzc;
                        TaskCompletionSource taskCompletionSource2 = this.zzb;
                        zzxVar.zzf.add(taskCompletionSource2);
                        taskCompletionSource2.zza.addOnCompleteListener(new BinaryBitmap(2, zzxVar, taskCompletionSource2));
                        if (((zzx) this.zzc).zzl.getAndIncrement() > 0) {
                            ((zzx) this.zzc).zzc.zzd("Already connected to the service.", new Object[0]);
                        }
                        zzx.zzp((zzx) this.zzc, (zzm) this.zza);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzm(zzr zzrVar, TaskCompletionSource taskCompletionSource, String str, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zzc = zzrVar;
        this.zza = str;
        this.zzb = taskCompletionSource2;
    }
}
