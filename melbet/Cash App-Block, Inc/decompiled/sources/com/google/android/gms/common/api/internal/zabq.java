package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.auth.api.signin.internal.zbi;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;

/* loaded from: classes.dex */
public final class zabq extends GoogleApiClient {
    public final GoogleApi zaa;

    public zabq(GoogleApi googleApi) {
        this.zaa = googleApi;
    }

    public final zbi execute(zbi zbiVar) {
        zbiVar.zak();
        GoogleApi googleApi = this.zaa;
        GoogleApiManager googleApiManager = googleApi.zaa;
        googleApiManager.getClass();
        zacc zaccVar = new zacc(new zae(zbiVar), googleApiManager.zan.get(), googleApi);
        com.google.android.gms.internal.base.zao zaoVar = googleApiManager.zas;
        zaoVar.sendMessage(zaoVar.obtainMessage(4, zaccVar));
        return zbiVar;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Looper getLooper() {
        return this.zaa.zah;
    }
}
