package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.signin.internal.SignInClientImpl;
import com.google.android.gms.signin.zaa;
import com.google.android.gms.signin.zad;
import com.squareup.cash.boost.db.Reward$Adapter;
import java.util.Set;

/* loaded from: classes.dex */
public final class zacm extends com.google.android.gms.signin.internal.zac implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    public static final zaa zaa = zad.zac;
    public final Context zab;
    public final Handler zac;
    public final zaa zad = zaa;
    public final Set zae;
    public final Reward$Adapter zaf;
    public SignInClientImpl zag;
    public zabn zah;

    public zacm(Context context, com.google.android.gms.internal.base.zao zaoVar, Reward$Adapter reward$Adapter) {
        this.zab = context;
        this.zac = zaoVar;
        this.zaf = reward$Adapter;
        this.zae = (Set) reward$Adapter.avatarsAdapter;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        this.zag.zaa(this);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.zah.zaa(connectionResult);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        this.zah.zab(i);
    }

    @Override // com.google.android.gms.signin.internal.zac
    public final void zab(com.google.android.gms.signin.internal.zak zakVar) {
        this.zac.post(new zao(3, this, zakVar));
    }
}
