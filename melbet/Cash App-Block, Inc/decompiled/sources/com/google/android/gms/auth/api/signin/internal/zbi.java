package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.zzae;

/* loaded from: classes4.dex */
public final class zbi extends BasePendingResult {
    public final /* synthetic */ int $r8$classId;
    public final Api api;
    public final Api.ClientKey clientKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zbi(GoogleApiClient googleApiClient, int i) {
        super(googleApiClient);
        this.$r8$classId = i;
        zzae.checkNotNull(googleApiClient, "GoogleApiClient must not be null");
        Api api = Auth.GOOGLE_SIGN_IN_API;
        zzae.checkNotNull(api, "Api must not be null");
        this.clientKey = api.zab;
        this.api = api;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ Result createFailedResult(Status status) {
        int i = this.$r8$classId;
        return status;
    }

    public final void doExecute(GmsClient gmsClient) {
        switch (this.$r8$classId) {
            case 0:
                zbe zbeVar = (zbe) gmsClient;
                zbs zbsVar = (zbs) zbeVar.getService();
                zbh zbhVar = new zbh(this, 0);
                GoogleSignInOptions googleSignInOptions = zbeVar.zba;
                Parcel zba = zbsVar.zba();
                int i = com.google.android.gms.internal.p000authapi.zbc.$r8$clinit;
                zba.writeStrongBinder(zbhVar);
                com.google.android.gms.internal.p000authapi.zbc.zbc(zba, googleSignInOptions);
                zbsVar.zbb(zba, 102);
                break;
            default:
                zbe zbeVar2 = (zbe) gmsClient;
                zbs zbsVar2 = (zbs) zbeVar2.getService();
                zbh zbhVar2 = new zbh(this, 1);
                GoogleSignInOptions googleSignInOptions2 = zbeVar2.zba;
                Parcel zba2 = zbsVar2.zba();
                int i2 = com.google.android.gms.internal.p000authapi.zbc.$r8$clinit;
                zba2.writeStrongBinder(zbhVar2);
                com.google.android.gms.internal.p000authapi.zbc.zbc(zba2, googleSignInOptions2);
                zbsVar2.zbb(zba2, 103);
                break;
        }
    }

    public final void setFailedResult(Status status) {
        zzae.checkArgument("Failed result must not be success", !status.isSuccess());
        setResult(createFailedResult(status));
    }
}
