package kotlin.text;

import com.adjust.sdk.ILogger;
import com.adjust.sdk.PackageHandler;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class CatchingFishRoomCustomView implements Runnable {
    public final /* synthetic */ PackageHandler CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishRoomCustomView(PackageHandler packageHandler, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = packageHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ILogger iLogger;
        AtomicBoolean atomicBoolean;
        ILogger iLogger2;
        AtomicBoolean atomicBoolean2;
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.CatchingFishDaggerWebsocket.initI();
                break;
            case 1:
                this.CatchingFishDaggerWebsocket.sendFirstI();
                break;
            case 2:
                PackageHandler packageHandler = this.CatchingFishDaggerWebsocket;
                iLogger = packageHandler.logger;
                iLogger.verbose("Package handler can send", new Object[0]);
                atomicBoolean = packageHandler.isSending;
                atomicBoolean.set(false);
                packageHandler.sendFirstPackage();
                break;
            case 3:
                this.CatchingFishDaggerWebsocket.flushI();
                break;
            default:
                PackageHandler packageHandler2 = this.CatchingFishDaggerWebsocket;
                iLogger2 = packageHandler2.logger;
                iLogger2.verbose("Package handler finished waiting to continue", new Object[0]);
                atomicBoolean2 = packageHandler2.isSending;
                atomicBoolean2.set(false);
                packageHandler2.sendFirstPackage();
                break;
        }
    }
}
