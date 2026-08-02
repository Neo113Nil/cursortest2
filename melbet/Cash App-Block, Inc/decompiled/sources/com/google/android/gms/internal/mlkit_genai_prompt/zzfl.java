package com.google.android.gms.internal.mlkit_genai_prompt;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.UserManager;
import android.util.Log;
import androidx.camera.video.VideoCapture;
import com.google.android.gms.internal.mlkit_genai_prompt.zzjc;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* loaded from: classes4.dex */
public final class zzfl implements ServiceConnection {
    public zzla zzb;
    public final /* synthetic */ zzfn zzd;
    public final /* synthetic */ zzfn zze;
    public final Object zza = new Object();
    public VideoCapture.AnonymousClass3 zzc = new VideoCapture.AnonymousClass3(8);

    public zzfl(zzfn zzfnVar) {
        this.zze = zzfnVar;
        this.zzd = zzfnVar;
        zze();
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        zzd(zzcm.zzb(603, "AiCore service binding died.", null));
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        zzd(zzcm.zzb(605, "AiCore service returns null on binding.", null));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzag zzaeVar;
        zzad zzadVar = null;
        if (!Objects.equals(componentName, zzfn.zzd)) {
            if (!Objects.equals(componentName, zzfn.zze)) {
                zzd(zzcm.zzb(0, "AiCore service is not connected. Unknown component ".concat(String.valueOf(componentName)), null));
                return;
            }
            int i = zzac.$r8$clinit;
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IAICoreService");
                zzadVar = queryLocalInterface instanceof zzad ? (zzad) queryLocalInterface : new zzab(iBinder);
            }
            zzc(zzadVar);
            return;
        }
        int i2 = zzaf.$r8$clinit;
        if (iBinder == null) {
            zzaeVar = null;
        } else {
            IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IAiCoreServiceProvider");
            zzaeVar = queryLocalInterface2 instanceof zzag ? (zzag) queryLocalInterface2 : new zzae(iBinder, "com.google.android.apps.aicore.aidl.IAiCoreServiceProvider", 6);
        }
        try {
            zzfk zzfkVar = new zzfk(this);
            zzae zzaeVar2 = (zzae) zzaeVar;
            Parcel zza = zzaeVar2.zza();
            int i3 = zzl.$r8$clinit;
            zza.writeStrongBinder(zzfkVar);
            try {
                zzaeVar2.zaa.transact(2, zza, null, 1);
            } finally {
                zza.recycle();
            }
        } catch (RemoteException | RuntimeException e) {
            zzd(zzcm.zzb(6, "AiCore service provider communication error.", e));
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.zza) {
            this.zzc.zzd();
            this.zzb.zzm(zzcm.zzb(602, "AiCore service disconnected.", null));
            zze();
        }
    }

    public final zzla zza() {
        zzla zzlaVar;
        synchronized (this.zza) {
            try {
                if (this.zzb.valueField instanceof zzjc.zza) {
                    zze();
                }
                zzlaVar = this.zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzlaVar;
    }

    public final void zzb() {
        Intent intent = new Intent();
        intent.setComponent(zzfn.zzd);
        zzfn zzfnVar = this.zze;
        try {
            if (zzg$com$google$android$gms$internal$mlkit_genai_prompt$zzfj(intent)) {
                return;
            }
            zzfnVar.zza.unbindService(this);
            Intent intent2 = new Intent();
            intent2.setComponent(zzfn.zze);
            if (zzg$com$google$android$gms$internal$mlkit_genai_prompt$zzfj(intent2)) {
                return;
            }
            zzd(zzcm.zzb(601, "AiCore service failed to bind to primary or fallback.", null));
        } catch (SecurityException e) {
            zzd(zzcm.zzb(601, "AiCore service failed to bind due to SecurityException.", e));
        }
    }

    public final void zzc(zzad zzadVar) {
        synchronized (this.zza) {
            this.zzb.zzl(new zzcs(zzadVar, this.zzc));
            zzfn zzfnVar = this.zzd;
            UserManager userManager = zzfnVar.zzk;
            if (!(userManager != null && userManager.isSystemUser())) {
                try {
                    zzadVar.asBinder().linkToDeath(zzfnVar, 0);
                } catch (RemoteException e) {
                    zzd(zzcm.zzb(6, "AICore service died before linking death recipient.", e));
                }
            }
        }
    }

    public final void zzd(zzcm zzcmVar) {
        synchronized (this.zza) {
            this.zzb.zzm(zzcmVar);
        }
        this.zzd.zzq();
    }

    public final void zze() {
        synchronized (this.zza) {
            this.zzb = new zzla();
            this.zzc = new VideoCapture.AnonymousClass3(8);
        }
    }

    public final void zzf() {
        synchronized (this.zza) {
            zzla zzlaVar = this.zzb;
            if (zzlaVar != null && zzlaVar.isDone()) {
                if (!(this.zzb.valueField instanceof zzjc.zza)) {
                    zzfn zzfnVar = this.zzd;
                    UserManager userManager = zzfnVar.zzk;
                    if (!(userManager != null && userManager.isSystemUser())) {
                        try {
                            ((zzcs) zzki.zzi(this.zzb)).zza.asBinder().unlinkToDeath(zzfnVar, 0);
                        } catch (NoSuchElementException e) {
                            ComponentName componentName = zzfn.zzd;
                            Log.w("zzfn", "Attempted to unlink a death recipient that was not registered. This is safe to ignore.", e);
                        } catch (RuntimeException | ExecutionException e2) {
                            ComponentName componentName2 = zzfn.zzd;
                            Log.e("zzfn", "Failed to get service for unbind, unable to call unlinkToDeath. Cause: ", e2);
                        }
                    }
                }
                ComponentName componentName3 = zzfn.zzd;
                Log.i("zzfn", "Service context future was cancelled, no need to unlinkToDeath.");
            }
            this.zzd.zza.unbindService(this);
            this.zzc.zzd();
        }
    }

    public final boolean zzg$com$google$android$gms$internal$mlkit_genai_prompt$zzfj(Intent intent) {
        zzfn zzfnVar = this.zzd;
        return zzfnVar.zza.bindService(intent, this, true == zzfnVar.zzh ? 65 : 1);
    }
}
