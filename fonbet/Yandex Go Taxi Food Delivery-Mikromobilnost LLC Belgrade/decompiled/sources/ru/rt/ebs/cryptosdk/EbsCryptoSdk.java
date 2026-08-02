package ru.rt.ebs.cryptosdk;

import android.content.Context;
import defpackage.ajn;
import defpackage.pey;
import defpackage.t50;
import kotlin.Metadata;
import ru.rt.ebs.cryptosdk.core.logging.IEbsLoggerClient;
import ru.rt.ebs.cryptosdk.core.networkClient.entities.INetworkClient;
import ru.rt.ebs.cryptosdk.core.security.entities.models.TLSOptions;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationListener;
import ru.rt.ebs.cryptosdk.entities.models.FZ115VerificationRequest;
import ru.rt.ebs.cryptosdk.entities.models.ProdEbsCryptoSdkConfig;
import ru.rt.ebs.cryptosdk.entities.models.VerificationWithoutEsiaRequest;
import ru.rt.ebs.cryptosdk.entities.models.VideoResolutionRestrictions;
import ru.rt.ebs.cryptosdk.navigation.models.VerificationLauncher;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ-\u0010\u0010\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u001d\u001a\u00020\u001c2\b\b\u0001\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010$\u001a\u00020\u00062\b\b\u0001\u0010 \u001a\u00020\u001f2\b\b\u0001\u0010!\u001a\u00020\u001c2\b\b\u0003\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b$\u0010%J-\u0010'\u001a\u00020\u00062\b\b\u0001\u0010 \u001a\u00020&2\b\b\u0001\u0010!\u001a\u00020\u001c2\b\b\u0003\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b'\u0010(R\u001a\u0010*\u001a\u00020)8GX\u0087\u0004¢\u0006\f\u0012\u0004\b,\u0010\u0003\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lru/rt/ebs/cryptosdk/EbsCryptoSdk;", "Lajn;", "<init>", "()V", "Lru/rt/ebs/cryptosdk/core/logging/IEbsLoggerClient;", "loggerClient", "Lzy11;", "registerLogger", "(Lru/rt/ebs/cryptosdk/core/logging/IEbsLoggerClient;)V", "unregisterLogger", "Landroid/content/Context;", "context", "Lru/rt/ebs/cryptosdk/entities/models/ProdEbsCryptoSdkConfig;", "ebsCryptoSdkConfig", "Lru/rt/ebs/cryptosdk/core/security/entities/models/TLSOptions;", "tlsOptions", "initialize", "(Landroid/content/Context;Lru/rt/ebs/cryptosdk/entities/models/ProdEbsCryptoSdkConfig;Lru/rt/ebs/cryptosdk/core/security/entities/models/TLSOptions;)V", "release", "Lru/rt/ebs/cryptosdk/core/networkClient/entities/INetworkClient;", "getNetworkClient", "()Lru/rt/ebs/cryptosdk/core/networkClient/entities/INetworkClient;", "Lt50;", "activityResultRegistry", "Lpey;", "lifecycleOwner", "Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/IVerificationListener;", "listener", "Lru/rt/ebs/cryptosdk/navigation/models/VerificationLauncher;", "createVerificationLauncher", "(Lt50;Lpey;Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/IVerificationListener;)Lru/rt/ebs/cryptosdk/navigation/models/VerificationLauncher;", "Lru/rt/ebs/cryptosdk/entities/models/FZ115VerificationRequest;", "request", "launcher", "Lru/rt/ebs/cryptosdk/entities/models/VideoResolutionRestrictions;", "videoResolutionRestrictions", "startVerificationFZ115", "(Lru/rt/ebs/cryptosdk/entities/models/FZ115VerificationRequest;Lru/rt/ebs/cryptosdk/navigation/models/VerificationLauncher;Lru/rt/ebs/cryptosdk/entities/models/VideoResolutionRestrictions;)V", "Lru/rt/ebs/cryptosdk/entities/models/VerificationWithoutEsiaRequest;", "startVerificationWithoutEsia", "(Lru/rt/ebs/cryptosdk/entities/models/VerificationWithoutEsiaRequest;Lru/rt/ebs/cryptosdk/navigation/models/VerificationLauncher;Lru/rt/ebs/cryptosdk/entities/models/VideoResolutionRestrictions;)V", "", "isInitialized", "()Z", "isInitialized$annotations", "cryptosdk_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EbsCryptoSdk extends ajn {
    public static final EbsCryptoSdk INSTANCE = new EbsCryptoSdk();

    private EbsCryptoSdk() {
    }

    public static final VerificationLauncher createVerificationLauncher(t50 activityResultRegistry, pey lifecycleOwner, IVerificationListener listener) {
        return INSTANCE.createVerificationLauncherSdk(activityResultRegistry, lifecycleOwner, listener);
    }

    public static final synchronized INetworkClient getNetworkClient() {
        INetworkClient networkClientSdk;
        synchronized (EbsCryptoSdk.class) {
            networkClientSdk = INSTANCE.getNetworkClientSdk();
        }
        return networkClientSdk;
    }

    public static final synchronized void initialize(Context context, ProdEbsCryptoSdkConfig ebsCryptoSdkConfig, TLSOptions tlsOptions) {
        synchronized (EbsCryptoSdk.class) {
            INSTANCE.initializeSdk(context, ebsCryptoSdkConfig, tlsOptions);
        }
    }

    public static final boolean isInitialized() {
        return INSTANCE.isInitializedSdk();
    }

    public static /* synthetic */ void isInitialized$annotations() {
    }

    public static final void registerLogger(IEbsLoggerClient loggerClient) {
        INSTANCE.registerLoggerSdk(loggerClient);
    }

    public static final synchronized void release() {
        synchronized (EbsCryptoSdk.class) {
            INSTANCE.releaseSdk();
        }
    }

    public static final void startVerificationFZ115(FZ115VerificationRequest request, VerificationLauncher launcher, VideoResolutionRestrictions videoResolutionRestrictions) {
        INSTANCE.startVerificationFZ115Sdk(request, launcher, videoResolutionRestrictions);
    }

    public static /* synthetic */ void startVerificationFZ115$default(FZ115VerificationRequest fZ115VerificationRequest, VerificationLauncher verificationLauncher, VideoResolutionRestrictions videoResolutionRestrictions, int i, Object obj) {
        if ((i & 4) != 0) {
            videoResolutionRestrictions = new VideoResolutionRestrictions.Builder().buildDefault();
        }
        startVerificationFZ115(fZ115VerificationRequest, verificationLauncher, videoResolutionRestrictions);
    }

    public static final void startVerificationWithoutEsia(VerificationWithoutEsiaRequest request, VerificationLauncher launcher, VideoResolutionRestrictions videoResolutionRestrictions) {
        INSTANCE.startVerificationWithoutEsiaSdk(request, launcher, videoResolutionRestrictions);
    }

    public static /* synthetic */ void startVerificationWithoutEsia$default(VerificationWithoutEsiaRequest verificationWithoutEsiaRequest, VerificationLauncher verificationLauncher, VideoResolutionRestrictions videoResolutionRestrictions, int i, Object obj) {
        if ((i & 4) != 0) {
            videoResolutionRestrictions = new VideoResolutionRestrictions.Builder().buildDefault();
        }
        startVerificationWithoutEsia(verificationWithoutEsiaRequest, verificationLauncher, videoResolutionRestrictions);
    }

    public static final void unregisterLogger(IEbsLoggerClient loggerClient) {
        INSTANCE.unregisterLoggerSdk(loggerClient);
    }
}
