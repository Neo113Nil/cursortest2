package com.google.android.gms.identitycredentials.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.identitycredentials.internal.IIdentityCredentialService;
import com.google.android.gms.internal.identity_credentials.zze;

/* loaded from: classes4.dex */
public final class IdentityCredentialClientImpl extends GmsClient {
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface createServiceInterface(IBinder iBinder) {
        iBinder.getClass();
        int i = IIdentityCredentialService.Stub.$r8$clinit;
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        return queryLocalInterface instanceof IIdentityCredentialService ? (IIdentityCredentialService) queryLocalInterface : new IIdentityCredentialService.Stub.Proxy(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] getApiFeatures() {
        return zze.zzo;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.identitycredentials.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean getUseDynamicLookup() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
        return true;
    }
}
