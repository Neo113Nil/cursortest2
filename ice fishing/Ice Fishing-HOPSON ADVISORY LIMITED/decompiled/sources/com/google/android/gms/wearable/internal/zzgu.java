package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.wearable.WearableStatusCodes;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzgu {
    private final Map zza = new HashMap();

    zzgu() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzb(zzkf zzkfVar, BaseImplementation.ResultHolder resultHolder, Object obj, zzko zzkoVar) throws RemoteException {
        Map map = this.zza;
        synchronized (map) {
            if (map.get(obj) != null) {
                if (Log.isLoggable("WearableClient", 2)) {
                    String valueOf = String.valueOf(obj);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                    sb.append("duplicate listener: ");
                    sb.append(valueOf);
                    Log.v("WearableClient", sb.toString());
                }
                resultHolder.setResult(new Status(WearableStatusCodes.DUPLICATE_LISTENER));
                return;
            }
            if (Log.isLoggable("WearableClient", 2)) {
                String valueOf2 = String.valueOf(obj);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 14);
                sb2.append("new listener: ");
                sb2.append(valueOf2);
                Log.v("WearableClient", sb2.toString());
            }
            map.put(obj, zzkoVar);
            try {
                ((zzgq) zzkfVar.getService()).zzt(new zzgs(map, obj, resultHolder), new zzf(zzkoVar));
            } catch (RemoteException e) {
                if (Log.isLoggable("WearableClient", 3)) {
                    String valueOf3 = String.valueOf(obj);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 39);
                    sb3.append("addListener failed, removing listener: ");
                    sb3.append(valueOf3);
                    Log.d("WearableClient", sb3.toString());
                }
                this.zza.remove(obj);
                throw e;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzc(zzkf zzkfVar, BaseImplementation.ResultHolder resultHolder, Object obj) throws RemoteException {
        Map map = this.zza;
        synchronized (map) {
            zzko zzkoVar = (zzko) map.remove(obj);
            if (zzkoVar == null) {
                if (Log.isLoggable("WearableClient", 2)) {
                    String valueOf = String.valueOf(obj);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
                    sb.append("remove Listener unknown: ");
                    sb.append(valueOf);
                    Log.v("WearableClient", sb.toString());
                }
                resultHolder.setResult(new Status(WearableStatusCodes.UNKNOWN_LISTENER));
                return;
            }
            zzkoVar.zzu();
            if (Log.isLoggable("WearableClient", 2)) {
                String valueOf2 = String.valueOf(obj);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 24);
                sb2.append("service.removeListener: ");
                sb2.append(valueOf2);
                Log.v("WearableClient", sb2.toString());
            }
            ((zzgq) zzkfVar.getService()).zzu(new zzgt(map, obj, resultHolder), new zzin(zzkoVar));
        }
    }

    public final void zza(IBinder iBinder) {
        zzgq zzgqVar;
        Map map = this.zza;
        synchronized (map) {
            if (iBinder == null) {
                zzgqVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzgqVar = queryLocalInterface instanceof zzgq ? (zzgq) queryLocalInterface : new zzgq(iBinder);
            }
            zzjt zzjtVar = new zzjt();
            for (Map.Entry entry : map.entrySet()) {
                zzko zzkoVar = (zzko) entry.getValue();
                try {
                    zzgqVar.zzt(zzjtVar, new zzf(zzkoVar));
                    if (Log.isLoggable("WearableClient", 3)) {
                        String valueOf = String.valueOf(entry.getKey());
                        String valueOf2 = String.valueOf(zzkoVar);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27 + String.valueOf(valueOf2).length());
                        sb.append("onPostInitHandler: added: ");
                        sb.append(valueOf);
                        sb.append("/");
                        sb.append(valueOf2);
                        Log.d("WearableClient", sb.toString());
                    }
                } catch (RemoteException unused) {
                    String valueOf3 = String.valueOf(entry.getKey());
                    String valueOf4 = String.valueOf(zzkoVar);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 32 + String.valueOf(valueOf4).length());
                    sb2.append("onPostInitHandler: Didn't add: ");
                    sb2.append(valueOf3);
                    sb2.append("/");
                    sb2.append(valueOf4);
                    Log.w("WearableClient", sb2.toString());
                }
            }
        }
    }
}
