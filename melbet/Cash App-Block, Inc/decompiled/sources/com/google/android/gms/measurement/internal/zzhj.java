package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.bugsnag.android.Client;
import com.google.android.gms.internal.measurement.zzbq;
import com.google.android.gms.internal.measurement.zzbr;
import com.google.android.gms.internal.measurement.zzbs;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzhj implements ServiceConnection {
    public final /* synthetic */ zzx zza;
    public final String zzb;

    public zzhj(zzx zzxVar, String str) {
        Objects.requireNonNull(zzxVar);
        this.zza = zzxVar;
        this.zzb = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzx zzxVar = this.zza;
        if (iBinder == null) {
            zzgu zzguVar = zzxVar.zza.zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzg.zza("Install Referrer connection returned with null binder");
            return;
        }
        try {
            int i = zzbr.$r8$clinit;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            zzbs zzbqVar = queryLocalInterface instanceof zzbs ? (zzbs) queryLocalInterface : new zzbq(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", 5);
            zzic zzicVar = zzxVar.zza;
            zzgu zzguVar2 = zzicVar.zzi;
            zzic.zzP(zzguVar2);
            zzguVar2.zzl.zza("Install Referrer Service connected");
            zzhz zzhzVar = zzicVar.zzj;
            zzic.zzP(zzhzVar);
            zzhzVar.zzj(new Client.AnonymousClass4(this, zzbqVar, this));
        } catch (RuntimeException e) {
            zzgu zzguVar3 = zzxVar.zza.zzi;
            zzic.zzP(zzguVar3);
            zzguVar3.zzg.zzb(e, "Exception occurred while calling Install Referrer API");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzgu zzguVar = this.zza.zza.zzi;
        zzic.zzP(zzguVar);
        zzguVar.zzl.zza("Install Referrer Service disconnected");
    }
}
