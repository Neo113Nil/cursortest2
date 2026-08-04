package com.appsflyer;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f58b;

    public /* synthetic */ a(Function1 function1, int i2) {
        this.f57a = i2;
        this.f58b = function1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f57a;
        Function1 function1 = this.f58b;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                AFLogger.getMonetizationNetwork(function1);
                break;
            case 1:
                AFLogger.getMonetizationNetwork(function1);
                break;
            case 2:
                AFLogger.getMonetizationNetwork(function1);
                break;
            case 3:
                AFLogger.getMonetizationNetwork(function1);
                break;
            case InstallReferrerClient.InstallReferrerResponse.PERMISSION_ERROR /* 4 */:
                AFLogger.getMonetizationNetwork(function1);
                break;
            default:
                AFLogger.getMonetizationNetwork(function1);
                break;
        }
    }
}
