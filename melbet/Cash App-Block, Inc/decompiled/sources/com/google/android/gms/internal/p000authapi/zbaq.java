package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.auth.api.identity.zbv;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.signin.zaa;
import com.stripe.android.financialconnections.utils.ErrorsKt;

/* loaded from: classes4.dex */
public final class zbaq extends GoogleApi {
    public static final Api zbc = new Api("Auth.Api.Identity.SignIn.API", new zaa(8), new Api.ClientKey());
    public final String zbd;

    public zbaq(Context context, zbv zbvVar) {
        super(context, null, zbc, zbvVar, GoogleApi.Settings.DEFAULT_SETTINGS);
        this.zbd = zbat.zba();
    }

    public static SignInCredential getSignInCredentialFromIntent(Intent intent) {
        Status status = Status.RESULT_INTERNAL_ERROR;
        if (intent == null) {
            throw new ApiException(status);
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status2 = (Status) (byteArrayExtra == null ? null : ErrorsKt.deserializeFromBytes(byteArrayExtra, creator));
        if (status2 == null) {
            throw new ApiException(Status.RESULT_CANCELED);
        }
        if (!status2.isSuccess()) {
            throw new ApiException(status2);
        }
        Parcelable.Creator<SignInCredential> creator2 = SignInCredential.CREATOR;
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
        SignInCredential signInCredential = (SignInCredential) (byteArrayExtra2 != null ? ErrorsKt.deserializeFromBytes(byteArrayExtra2, creator2) : null);
        if (signInCredential != null) {
            return signInCredential;
        }
        throw new ApiException(status);
    }
}
