package com.google.android.datatransport;

import com.adjust.sdk.ILogger;
import com.adjust.sdk.PackageHandler;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowCloudSingleton implements Runnable {
    public final /* synthetic */ PackageHandler WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowCloudSingleton(PackageHandler packageHandler, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = packageHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ILogger iLogger;
        AtomicBoolean atomicBoolean;
        ILogger iLogger2;
        AtomicBoolean atomicBoolean2;
        int i = this.WinterFlowVariableVersionControl;
        PackageHandler packageHandler = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                packageHandler.initI();
                break;
            case 1:
                packageHandler.sendFirstI();
                break;
            case 2:
                iLogger = packageHandler.logger;
                iLogger.verbose("Package handler can send", new Object[0]);
                atomicBoolean = packageHandler.isSending;
                atomicBoolean.set(false);
                packageHandler.sendFirstPackage();
                break;
            case 3:
                packageHandler.flushI();
                break;
            default:
                iLogger2 = packageHandler.logger;
                iLogger2.verbose("Package handler finished waiting to continue", new Object[0]);
                atomicBoolean2 = packageHandler.isSending;
                atomicBoolean2.set(false);
                packageHandler.sendFirstPackage();
                break;
        }
    }
}
