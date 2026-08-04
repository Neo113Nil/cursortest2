package com.protoclaw.airfishing;

import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;

/* JADX INFO: loaded from: classes.dex */
public final class f implements InstallReferrerStateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f113a = g.f115b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InstallReferrerClient f114b;

    public f(InstallReferrerClient installReferrerClient) {
        this.f114b = installReferrerClient;
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerServiceDisconnected() {
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerSetupFinished(int i2) {
        InstallReferrerClient installReferrerClient = this.f114b;
        if (i2 == 0) {
            try {
                g gVar = this.f113a;
                String installReferrer = installReferrerClient.getInstallReferrer().getInstallReferrer();
                if (installReferrer == null) {
                    installReferrer = "";
                }
                gVar.f116a = installReferrer;
            } catch (Exception unused) {
            }
            installReferrerClient.endConnection();
        }
    }
}
