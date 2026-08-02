package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.zaw;
import com.google.android.gms.common.internal.zzae;
import com.squareup.cash.boost.db.Reward$Adapter;

/* loaded from: classes4.dex */
public final class SignInClientImpl extends GmsClient {
    public final boolean zab;
    public final Reward$Adapter zac;
    public final Bundle zad;
    public final Integer zae;

    public SignInClientImpl(Context context, Looper looper, Reward$Adapter reward$Adapter, Bundle bundle, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 44, reward$Adapter, connectionCallbacks, onConnectionFailedListener, 0);
        this.zab = true;
        this.zac = reward$Adapter;
        this.zad = bundle;
        this.zae = (Integer) reward$Adapter.boost_attributesAdapter;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof zaf ? (zaf) queryLocalInterface : new zaf(iBinder, "com.google.android.gms.signin.internal.ISignInService", 0);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle getGetServiceRequestExtraArgs() {
        Reward$Adapter reward$Adapter = this.zac;
        boolean equals = this.zzl.getPackageName().equals((String) reward$Adapter.app_linksAdapter);
        Bundle bundle = this.zad;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) reward$Adapter.app_linksAdapter);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean requiresSignIn() {
        return this.zab;
    }

    public final void zaa(zac zacVar) {
        try {
            this.zac.getClass();
            Account account = new Account("<<default account>>", "com.google");
            GoogleSignInAccount savedDefaultGoogleSignInAccount = "<<default account>>".equals(account.name) ? Storage.getInstance(this.zzl).getSavedDefaultGoogleSignInAccount() : null;
            Integer num = this.zae;
            zzae.checkNotNull(num);
            zaw zawVar = new zaw(2, account, num.intValue(), savedDefaultGoogleSignInAccount);
            zaf zafVar = (zaf) getService();
            zai zaiVar = new zai(1, zawVar);
            Parcel zaa = zafVar.zaa();
            com.google.android.gms.internal.base.zac.zab(zaa, zaiVar);
            com.google.android.gms.internal.base.zac.zac(zaa, zacVar);
            zafVar.zac(zaa, 12);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                zacVar.zab(new zak(1, new ConnectionResult(8, null, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    public final void zad() {
        connect(new BaseGmsClient.LegacyClientCallbackAdapter(this));
    }
}
