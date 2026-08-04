package com.appsflyer.internal;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f80a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AFb1rSDK f81b;

    public /* synthetic */ f(AFb1rSDK aFb1rSDK, int i2) {
        this.f80a = i2;
        this.f81b = aFb1rSDK;
    }

    @Override // java.lang.Runnable
    public final void run() throws UnsupportedEncodingException {
        int i2 = this.f80a;
        AFb1rSDK aFb1rSDK = this.f81b;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                aFb1rSDK.copydefault();
                break;
            case 1:
                aFb1rSDK.copy();
                break;
            default:
                aFb1rSDK.copy();
                break;
        }
    }
}
