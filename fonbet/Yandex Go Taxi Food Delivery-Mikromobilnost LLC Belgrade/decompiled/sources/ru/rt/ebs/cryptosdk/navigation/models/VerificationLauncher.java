package ru.rt.ebs.cryptosdk.navigation.models;

import defpackage.i831;
import defpackage.m50;
import defpackage.o731;
import defpackage.pey;
import defpackage.qg61;
import defpackage.t50;
import defpackage.tls;
import kotlin.Metadata;
import ru.rt.ebs.cryptosdk.core.common.entities.exceptions.NotInitializedSdkEbsException;
import ru.rt.ebs.cryptosdk.core.initialization.controllers.IInitializationController;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B/\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lru/rt/ebs/cryptosdk/navigation/models/VerificationLauncher;", "", "Lt50;", "activityResultRegistry", "Lpey;", "lifecycleOwner", "Lkotlin/Function1;", "Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/VerificationResult;", "Lzy11;", "callback", "<init>", "(Lt50;Lpey;Ltls;)V", "Lru/rt/ebs/cryptosdk/core/initialization/controllers/IInitializationController;", "initializationController", "startVerification$cryptosdk_prodRelease", "(Lru/rt/ebs/cryptosdk/core/initialization/controllers/IInitializationController;)V", "startVerification", "Lm50;", "", "launcher", "Lm50;", "Companion", "i831", "cryptosdk_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class VerificationLauncher {
    public static final i831 Companion = new i831();
    private static final String REGISTRY_KEY = "EBSSDK_VERIFICATION";
    private final m50 launcher;

    public VerificationLauncher(t50 t50Var, pey peyVar, tls tlsVar) {
        this.launcher = t50Var.d(REGISTRY_KEY, peyVar, new o731(), new qg61(tlsVar));
    }

    public final void startVerification$cryptosdk_prodRelease(IInitializationController initializationController) {
        if (!initializationController.isInitializedSdk()) {
            throw new NotInitializedSdkEbsException();
        }
        this.launcher.a("");
    }
}
