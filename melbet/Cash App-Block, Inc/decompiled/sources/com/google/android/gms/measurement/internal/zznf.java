package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.common.stats.ConnectionTracker;

/* loaded from: classes.dex */
public final class zznf implements ServiceConnection, BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    public final /* synthetic */ zznl zza;
    public volatile boolean zzb;
    public volatile zzgo zzc;

    public zznf(zznl zznlVar) {
        this.zza = zznlVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected() {
        zzhz zzhzVar = ((zzic) this.zza.$$delegate_0).zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzd();
        synchronized (this) {
            try {
                zzae.checkNotNull(this.zzc);
                zzgb zzgbVar = (zzgb) this.zzc.getService();
                zzhz zzhzVar2 = ((zzic) this.zza.$$delegate_0).zzj;
                zzic.zzP(zzhzVar2);
                zzhzVar2.zzj(new com.google.android.gms.tasks.zzc(2, this, zzgbVar));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.zzc = null;
                this.zzb = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        zznl zznlVar = this.zza;
        zzhz zzhzVar = ((zzic) zznlVar.$$delegate_0).zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzd();
        zzgu zzguVar = ((zzic) zznlVar.$$delegate_0).zzi;
        if (zzguVar == null || !((zzjf) zzguVar).zza) {
            zzguVar = null;
        }
        if (zzguVar != null) {
            zzguVar.zzl.zzb(connectionResult, "Service connection failed");
        }
        synchronized (this) {
            this.zzb = false;
            this.zzc = null;
        }
        zzhz zzhzVar2 = ((zzic) this.zza.$$delegate_0).zzj;
        zzic.zzP(zzhzVar2);
        zzhzVar2.zzj(new com.google.android.gms.tasks.zzc(3, this, connectionResult));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        zzic zzicVar = (zzic) this.zza.$$delegate_0;
        zzhz zzhzVar = zzicVar.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzd();
        zzgu zzguVar = zzicVar.zzi;
        zzic.zzP(zzguVar);
        zzguVar.zzk.zza("Service connection suspended");
        zzhz zzhzVar2 = zzicVar.zzj;
        zzic.zzP(zzhzVar2);
        zzhzVar2.zzj(new com.google.android.gms.stats.zza(this, 3));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzhz zzhzVar = ((zzic) this.zza.$$delegate_0).zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzd();
        synchronized (this) {
            if (iBinder == null) {
                this.zzb = false;
                zzgu zzguVar = ((zzic) this.zza.$$delegate_0).zzi;
                zzic.zzP(zzguVar);
                zzguVar.zzd.zza("Service connected with null binder");
                return;
            }
            Object obj = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    obj = queryLocalInterface instanceof zzgb ? (zzgb) queryLocalInterface : new zzfz(iBinder);
                    zzgu zzguVar2 = ((zzic) this.zza.$$delegate_0).zzi;
                    zzic.zzP(zzguVar2);
                    zzguVar2.zzl.zza("Bound to IMeasurementService interface");
                } else {
                    zzgu zzguVar3 = ((zzic) this.zza.$$delegate_0).zzi;
                    zzic.zzP(zzguVar3);
                    zzguVar3.zzd.zzb(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                zzgu zzguVar4 = ((zzic) this.zza.$$delegate_0).zzi;
                zzic.zzP(zzguVar4);
                zzguVar4.zzd.zza("Service connect failed to get IMeasurementService");
            }
            if (obj == null) {
                this.zzb = false;
                try {
                    ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
                    zznl zznlVar = this.zza;
                    connectionTracker.unbindService(((zzic) zznlVar.$$delegate_0).zzd, zznlVar.zza);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                zzhz zzhzVar2 = ((zzic) this.zza.$$delegate_0).zzj;
                zzic.zzP(zzhzVar2);
                zzhzVar2.zzj(new com.google.android.gms.tasks.zzi(7, this, obj));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzic zzicVar = (zzic) this.zza.$$delegate_0;
        zzhz zzhzVar = zzicVar.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzd();
        zzgu zzguVar = zzicVar.zzi;
        zzic.zzP(zzguVar);
        zzguVar.zzk.zza("Service disconnected");
        zzhz zzhzVar2 = zzicVar.zzj;
        zzic.zzP(zzhzVar2);
        zzhzVar2.zzj(new com.google.android.gms.tasks.zzc(1, this, componentName));
    }
}
