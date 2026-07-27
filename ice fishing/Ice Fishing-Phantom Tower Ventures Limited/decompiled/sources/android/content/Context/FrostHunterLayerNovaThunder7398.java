package android.content.Context;

import android.os.Build;
import android.os.StrictMode;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterLayerNovaThunder7398 implements FrostHunterAdapterDelegateForceForce1151 {
    public final /* synthetic */ int FrostHunterAlphaAnimationNeoCosmos5761;

    @Override // android.content.Context.FrostHunterAdapterDelegateForceForce1151
    public final Object get() {
        switch (this.FrostHunterAlphaAnimationNeoCosmos5761) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Collections.EMPTY_SET;
            case 1:
                FrostHunterWorkManagerHyperionSpeed9013 frostHunterWorkManagerHyperionSpeed9013 = ExecutorsRegistrar.FrostHunterAlphaAnimationNeoCosmos5761;
                StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                detectNetwork.detectResourceMismatches();
                if (Build.VERSION.SDK_INT >= 26) {
                    detectNetwork.detectUnbufferedIo();
                }
                return new FrostHunterContentResolverPulsePixel6161(Executors.newFixedThreadPool(4, new FrostHunterLayoutPhantomBlaze1579("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.FrostHunterServiceEliteCelestialThunder1757.get());
            case 2:
                FrostHunterWorkManagerHyperionSpeed9013 frostHunterWorkManagerHyperionSpeed90132 = ExecutorsRegistrar.FrostHunterAlphaAnimationNeoCosmos5761;
                return new FrostHunterContentResolverPulsePixel6161(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new FrostHunterLayoutPhantomBlaze1579("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.FrostHunterServiceEliteCelestialThunder1757.get());
            case 3:
                FrostHunterWorkManagerHyperionSpeed9013 frostHunterWorkManagerHyperionSpeed90133 = ExecutorsRegistrar.FrostHunterAlphaAnimationNeoCosmos5761;
                return new FrostHunterContentResolverPulsePixel6161(Executors.newCachedThreadPool(new FrostHunterLayoutPhantomBlaze1579("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.FrostHunterServiceEliteCelestialThunder1757.get());
            case 4:
                FrostHunterWorkManagerHyperionSpeed9013 frostHunterWorkManagerHyperionSpeed90134 = ExecutorsRegistrar.FrostHunterAlphaAnimationNeoCosmos5761;
                return Executors.newSingleThreadScheduledExecutor(new FrostHunterLayoutPhantomBlaze1579("Firebase Scheduler", 0, null));
            default:
                return null;
        }
    }
}
