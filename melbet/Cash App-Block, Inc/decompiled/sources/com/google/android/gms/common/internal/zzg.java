package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes4.dex */
public final class zzg extends zza {
    public final /* synthetic */ BaseGmsClient zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzg(BaseGmsClient baseGmsClient, int i, Bundle bundle) {
        super(baseGmsClient, i, bundle);
        this.zze = baseGmsClient;
    }

    @Override // com.google.android.gms.common.internal.zza
    public final boolean zza() {
        this.zze.zzc.onReportServiceBinding(ConnectionResult.RESULT_SUCCESS);
        return true;
    }

    @Override // com.google.android.gms.common.internal.zza
    public final void zzb(ConnectionResult connectionResult) {
        BaseGmsClient baseGmsClient = this.zze;
        baseGmsClient.getClass();
        baseGmsClient.zzc.onReportServiceBinding(connectionResult);
        baseGmsClient.zzi = connectionResult.zzb;
        baseGmsClient.zzj = System.currentTimeMillis();
    }
}
