package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.fillr.n;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.review.internal.zzd;
import com.google.android.play.core.review.internal.zze;
import com.google.android.play.core.review.internal.zzr;
import com.google.android.play.core.review.internal.zzt;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class zzf extends com.google.android.play.core.review.internal.zzj {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object zza;
    public final /* synthetic */ Object zzb;

    public zzf(zzr zzrVar, IBinder iBinder) {
        this.zza = iBinder;
        this.zzb = zzrVar;
    }

    @Override // com.google.android.play.core.review.internal.zzj
    public final void zza() {
        HashMap hashMap;
        com.google.android.play.core.review.internal.zzf zzfVar = null;
        switch (this.$r8$classId) {
            case 0:
                try {
                    zzi zziVar = (zzi) this.zzb;
                    com.google.android.play.core.review.internal.zzf zzfVar2 = zziVar.zza.zzn;
                    String str = zziVar.zzc;
                    Bundle bundle = new Bundle();
                    HashMap hashMap2 = zzj.zza;
                    synchronized (zzj.class) {
                        hashMap = zzj.zza;
                        hashMap.put("java", 20002);
                    }
                    bundle.putInt("playcore_version_code", ((Integer) hashMap.get("java")).intValue());
                    if (hashMap.containsKey("native")) {
                        bundle.putInt("playcore_native_version", ((Integer) hashMap.get("native")).intValue());
                    }
                    if (hashMap.containsKey("unity")) {
                        bundle.putInt("playcore_unity_version", ((Integer) hashMap.get("unity")).intValue());
                    }
                    zzi zziVar2 = (zzi) this.zzb;
                    TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.zza;
                    String str2 = zziVar2.zzc;
                    zzh zzhVar = new zzh(zziVar2, taskCompletionSource);
                    zzd zzdVar = (zzd) zzfVar2;
                    zzdVar.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    obtain.writeString(str);
                    int i = com.google.android.play.core.review.internal.zzc.$r8$clinit;
                    obtain.writeInt(1);
                    bundle.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(zzhVar);
                    try {
                        zzdVar.zza.transact(2, obtain, null, 1);
                        obtain.recycle();
                        return;
                    } catch (Throwable th) {
                        obtain.recycle();
                        throw th;
                    }
                } catch (RemoteException e) {
                    zzi zziVar3 = (zzi) this.zzb;
                    n.a aVar = zzi.zzb;
                    Object[] objArr = {zziVar3.zzc};
                    aVar.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", n.a.zze(aVar.b, "error requesting in-app review for %s", objArr), e);
                    }
                    ((TaskCompletionSource) this.zza).trySetException(new RuntimeException(e));
                    return;
                }
            default:
                zzt zztVar = (zzt) ((zzr) this.zzb).zza;
                IBinder iBinder = (IBinder) this.zza;
                int i2 = zze.$r8$clinit;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    zzfVar = queryLocalInterface instanceof com.google.android.play.core.review.internal.zzf ? (com.google.android.play.core.review.internal.zzf) queryLocalInterface : new zzd(iBinder);
                }
                zztVar.zzn = zzfVar;
                n.a aVar2 = zztVar.zzc;
                aVar2.zzc("linkToDeath", new Object[0]);
                try {
                    zztVar.zzn.asBinder().linkToDeath(zztVar.zzk, 0);
                } catch (RemoteException e2) {
                    Object[] objArr2 = new Object[0];
                    aVar2.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", n.a.zze(aVar2.b, "linkToDeath failed", objArr2), e2);
                    }
                }
                zztVar.zzh = false;
                Iterator it = zztVar.zze.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                zztVar.zze.clear();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzf(zzi zziVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zza = taskCompletionSource2;
        this.zzb = zziVar;
    }
}
