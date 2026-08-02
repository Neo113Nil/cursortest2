package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.bugsnag.android.Client;
import com.google.android.filament.Box;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzj implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ zzp zza;

    public /* synthetic */ zzj(zzp zzpVar, int i) {
        this.$r8$classId = i;
        this.zza = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                break;
            case 1:
                zzp zzpVar = this.zza;
                synchronized (zzpVar) {
                    if (zzpVar.zza == 1) {
                        zzpVar.zza("Timed out while binding");
                    }
                }
                return;
            default:
                this.zza.zza("Service disconnected");
                return;
        }
        while (true) {
            zzp zzpVar2 = this.zza;
            synchronized (zzpVar2) {
                try {
                    if (zzpVar2.zza != 2) {
                        return;
                    }
                    if (zzpVar2.zzd.isEmpty()) {
                        zzpVar2.zzf();
                        return;
                    }
                    zzr zzrVar = (zzr) zzpVar2.zzd.poll();
                    zzpVar2.zze.put(zzrVar.zza, zzrVar);
                    ((ScheduledExecutorService) zzpVar2.zzf.zzc).schedule(new Client.AnonymousClass4(18, zzpVar2, zzrVar), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(zzrVar)));
                    }
                    zzv zzvVar = zzpVar2.zzf;
                    Messenger messenger = zzpVar2.zzb;
                    int i = zzrVar.zzc;
                    Context context = (Context) zzvVar.zzb;
                    Message obtain = Message.obtain();
                    obtain.what = i;
                    obtain.arg1 = zzrVar.zza;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", zzrVar.zzb());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", zzrVar.zzd);
                    obtain.setData(bundle);
                    try {
                        Box box = zzpVar2.zzc;
                        Messenger messenger2 = (Messenger) box.mCenter;
                        if (messenger2 != null) {
                            messenger2.send(obtain);
                        } else {
                            zzd zzdVar = (zzd) box.mHalfExtent;
                            if (zzdVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            zzdVar.zzb(obtain);
                        }
                    } catch (RemoteException e) {
                        zzpVar2.zza(e.getMessage());
                    }
                } finally {
                }
            }
        }
    }
}
