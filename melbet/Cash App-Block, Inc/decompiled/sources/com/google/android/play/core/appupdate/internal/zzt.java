package com.google.android.play.core.appupdate.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.fillr.browsersdk.utilities.Obfuscator;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class zzt extends zzn {
    public final /* synthetic */ IBinder zza;
    public final /* synthetic */ com.google.android.play.core.review.internal.zzr zzb;

    public zzt(com.google.android.play.core.review.internal.zzr zzrVar, IBinder iBinder) {
        this.zzb = zzrVar;
        this.zza = iBinder;
    }

    @Override // com.google.android.play.core.appupdate.internal.zzn
    public final void zza() {
        zzf zzdVar;
        zzx zzxVar = (zzx) this.zzb.zza;
        int i = zze.$r8$clinit;
        IBinder iBinder = this.zza;
        if (iBinder == null) {
            zzdVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            zzdVar = queryLocalInterface instanceof zzf ? (zzf) queryLocalInterface : new zzd(iBinder);
        }
        zzxVar.zzn = zzdVar;
        zzxVar.zzc.zzd("linkToDeath", new Object[0]);
        try {
            zzxVar.zzn.asBinder().linkToDeath(zzxVar.zzk, 0);
        } catch (RemoteException e) {
            Obfuscator obfuscator = zzxVar.zzc;
            Object[] objArr = new Object[0];
            obfuscator.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", Obfuscator.zzf(obfuscator.salt, "linkToDeath failed", objArr), e);
            }
        }
        zzxVar.zzh = false;
        Iterator it = zzxVar.zze.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        zzxVar.zze.clear();
    }
}
