package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.base.zao;

/* loaded from: classes.dex */
public final class zzb extends zao {
    public final /* synthetic */ BaseGmsClient zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzb(BaseGmsClient baseGmsClient, Looper looper) {
        super(looper, 2);
        this.zza = baseGmsClient;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        zza zzaVar;
        BaseGmsClient baseGmsClient = this.zza;
        int i = baseGmsClient.zzd.get();
        int i2 = message.arg1;
        int i3 = message.what;
        if (i != i2) {
            if ((i3 == 2 || i3 == 1 || i3 == 7) && (zzaVar = (zza) message.obj) != null) {
                zzaVar.zze();
                return;
            }
            return;
        }
        if ((i3 == 1 || i3 == 7 || i3 == 4 || i3 == 5) && !baseGmsClient.isConnecting()) {
            zza zzaVar2 = (zza) message.obj;
            if (zzaVar2 != null) {
                zzaVar2.zze();
                return;
            }
            return;
        }
        int i4 = message.what;
        if (i4 == 4) {
            baseGmsClient.zzC = new ConnectionResult(message.arg2, null, null);
            if (!baseGmsClient.zzD && !TextUtils.isEmpty(baseGmsClient.getServiceDescriptor()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(baseGmsClient.getServiceDescriptor());
                    if (!baseGmsClient.zzD) {
                        baseGmsClient.zzp(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            ConnectionResult connectionResult = baseGmsClient.zzC;
            if (connectionResult == null) {
                connectionResult = new ConnectionResult(8, null, null);
            }
            baseGmsClient.zzc.onReportServiceBinding(connectionResult);
            baseGmsClient.zzi = connectionResult.zzb;
            baseGmsClient.zzj = System.currentTimeMillis();
            return;
        }
        if (i4 == 5) {
            ConnectionResult connectionResult2 = baseGmsClient.zzC;
            if (connectionResult2 == null) {
                connectionResult2 = new ConnectionResult(8, null, null);
            }
            baseGmsClient.zzc.onReportServiceBinding(connectionResult2);
            baseGmsClient.zzi = connectionResult2.zzb;
            baseGmsClient.zzj = System.currentTimeMillis();
            return;
        }
        if (i4 == 3) {
            Object obj = message.obj;
            PendingIntent pendingIntent = obj instanceof PendingIntent ? (PendingIntent) obj : null;
            int i5 = message.arg2;
            baseGmsClient.zzc.onReportServiceBinding(new ConnectionResult(i5, pendingIntent, null));
            baseGmsClient.zzi = i5;
            baseGmsClient.zzj = System.currentTimeMillis();
            return;
        }
        if (i4 == 6) {
            baseGmsClient.zzp(5, null);
            BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks = baseGmsClient.zzw;
            if (baseConnectionCallbacks != null) {
                baseConnectionCallbacks.onConnectionSuspended(message.arg2);
            }
            baseGmsClient.onConnectionSuspended(message.arg2);
            baseGmsClient.zze(5, 1, null);
            return;
        }
        if (i4 == 2 && !baseGmsClient.isConnected()) {
            zza zzaVar3 = (zza) message.obj;
            if (zzaVar3 != null) {
                zzaVar3.zze();
                return;
            }
            return;
        }
        int i6 = message.what;
        if (i6 == 2 || i6 == 1 || i6 == 7) {
            ((zza) message.obj).zzd();
        } else {
            Log.wtf("GmsClient", Boxes$$ExternalSyntheticOutline1.m(i6, "Don't know how to handle message: ", new StringBuilder(String.valueOf(i6).length() + 34)), new Exception());
        }
    }
}
