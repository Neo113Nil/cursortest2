package androidx.versionedparcelable;

import com.adjust.sdk.ILogger;
import com.adjust.sdk.PackageHandler;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class ZenithPathAttributeStateS9QhivFqGySB62xujD27422138650411 implements Runnable {
    public final /* synthetic */ PackageHandler LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final /* synthetic */ int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;

    public /* synthetic */ ZenithPathAttributeStateS9QhivFqGySB62xujD27422138650411(PackageHandler packageHandler, int i) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = packageHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ILogger iLogger;
        AtomicBoolean atomicBoolean;
        ILogger iLogger2;
        AtomicBoolean atomicBoolean2;
        int i = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        PackageHandler packageHandler = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
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
