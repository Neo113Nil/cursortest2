package com.google.android.gms.internal.appset;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.signin.zaa;

/* loaded from: classes4.dex */
public final class zzp extends GoogleApi {
    public static final Api zzc = new Api("AppSet.API", new zaa(7), new Api.ClientKey());
    public final Context zzd;
    public final GoogleApiAvailabilityLight zze;

    public zzp(Context context, GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        super(context, null, zzc, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
        this.zzd = context;
        this.zze = googleApiAvailabilityLight;
    }
}
