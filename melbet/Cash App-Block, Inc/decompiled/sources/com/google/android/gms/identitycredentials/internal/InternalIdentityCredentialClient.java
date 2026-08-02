package com.google.android.gms.identitycredentials.internal;

import coil3.request.OneShotDisposable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.zacn;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.internal.identity_credentials.zze;
import com.google.android.gms.signin.zaa;
import com.google.android.gms.tasks.zzw;

/* loaded from: classes4.dex */
public final class InternalIdentityCredentialClient extends GoogleApi {
    public static final Api API = new Api("IdentityCredentials.API", new zaa(6), new Api.ClientKey());

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.common.Feature[], java.io.Serializable] */
    public final zzw getCredential(GetCredentialRequest getCredentialRequest) {
        zacn builder = zacn.builder();
        builder.zaa$1 = new Feature[]{zze.zza};
        builder.zaa = new OneShotDisposable(getCredentialRequest, 19);
        builder.zac = 32701;
        zzw zae = zae(0, builder.build());
        zae.getClass();
        return zae;
    }
}
