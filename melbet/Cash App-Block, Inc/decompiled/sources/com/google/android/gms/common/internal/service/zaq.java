package com.google.android.gms.common.internal.service;

import android.content.Context;
import coil3.request.OneShotDisposable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.zacn;
import com.google.android.gms.internal.base.zad;
import com.google.android.gms.signin.zaa;

/* loaded from: classes4.dex */
public final class zaq extends GoogleApi {
    public static final Api zae = new Api("ClientNotification.API", new zaa(4), new Api.ClientKey());

    public zaq(Context context) {
        super(context, null, zae, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.common.Feature[], java.io.Serializable] */
    public final void zaa(com.google.android.gms.common.internal.zab zabVar) {
        zacn builder = zacn.builder();
        builder.zaa$1 = new Feature[]{zad.zab};
        builder.zab = false;
        builder.zaa = new OneShotDisposable(zabVar, 18);
        zae(2, builder.build());
    }
}
