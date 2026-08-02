package com.google.android.gms.wallet.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.wallet.zzk;
import com.squareup.cash.boost.db.Reward$Adapter;

/* loaded from: classes4.dex */
public final class WalletClientImpl extends GmsClient {
    public final Context zze;
    public final int zzf;
    public final String zzg;
    public final int zzh;
    public final boolean zzi;
    public final String zzj;

    public WalletClientImpl(Context context, Looper looper, Reward$Adapter reward$Adapter, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, int i, String str) {
        super(context, looper, 4, reward$Adapter, connectionCallbacks, onConnectionFailedListener, 0);
        this.zze = context;
        this.zzf = i;
        this.zzg = null;
        this.zzh = 1;
        this.zzi = true;
        this.zzj = str;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
        return queryLocalInterface instanceof zza ? (zza) queryLocalInterface : new zza(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] getApiFeatures() {
        return zzk.zzi;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final int getMinApkVersion() {
        return 12600000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.wallet.service.BIND";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
        return true;
    }

    public final Bundle zzp() {
        String packageName = this.zze.getPackageName();
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", this.zzf);
        bundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", this.zzi);
        bundle.putString("androidPackageName", packageName);
        String str = this.zzg;
        if (!TextUtils.isEmpty(str)) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(str, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", this.zzh);
        bundle.putString("com.google.android.gms.wallet.EXTRA_WALLET_CLIENT_ID", this.zzj);
        return bundle;
    }
}
