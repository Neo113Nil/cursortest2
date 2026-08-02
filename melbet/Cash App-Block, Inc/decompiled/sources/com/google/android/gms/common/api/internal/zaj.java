package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.fillr.embedded.profile.FEMainActivity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;

/* loaded from: classes4.dex */
public final class zaj implements GoogleApiClient.OnConnectionFailedListener {
    public final int zaa = 1;
    public final zaaz zab;
    public final /* synthetic */ zak zad;

    public zaj(zak zakVar, zaaz zaazVar, FEMainActivity fEMainActivity) {
        this.zad = zakVar;
        this.zab = zaazVar;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Log.d("AutoManageHelper", "beginFailureResolution for ".concat(String.valueOf(connectionResult)));
        zak zakVar = this.zad;
        zakVar.getClass();
        zam zamVar = new zam(connectionResult, this.zaa);
        if (FillrEnv$EnumUnboxingLocalUtility.m(zakVar.zab, zamVar)) {
            ((zap) zakVar).zad.post(new zao(0, zakVar, zamVar));
        }
    }
}
