package com.android.installreferrer.api;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public interface InstallReferrerStateListener {
    void onInstallReferrerServiceDisconnected();

    void onInstallReferrerSetupFinished(int i);
}
