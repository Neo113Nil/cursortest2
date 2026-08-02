package ru.rt.ebs.cryptosdk.core.initialization.controllers;

import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ru.rt.ebs.cryptosdk.core.common.entities.models.IEbsCryptoSdkConfig;
import ru.rt.ebs.cryptosdk.core.common.entities.models.Token;
import ru.rt.ebs.cryptosdk.core.security.entities.models.TLSOptions;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\bH¦@¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH&¢\u0006\u0004\b\u000f\u0010\fJ\u000f\u0010\u0010\u001a\u00020\bH&¢\u0006\u0004\b\u0010\u0010\fR\u0014\u0010\u0012\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/rt/ebs/cryptosdk/core/initialization/controllers/IInitializationController;", "", "Lru/rt/ebs/cryptosdk/core/common/entities/models/IEbsCryptoSdkConfig;", "ebsCryptoSdkConfig", "Lru/rt/ebs/cryptosdk/core/security/entities/models/TLSOptions;", "tlsOptions", "Lru/rt/ebs/cryptosdk/core/common/entities/models/Token;", "serialNumber", "Lzy11;", "initializeSdk", "(Lru/rt/ebs/cryptosdk/core/common/entities/models/IEbsCryptoSdkConfig;Lru/rt/ebs/cryptosdk/core/security/entities/models/TLSOptions;Lru/rt/ebs/cryptosdk/core/common/entities/models/Token;)V", "updateRegistrationNotSuspend", "()V", "updateRegistration", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "flushRegistration", "release", "", "isInitializedSdk", "()Z", "isUpdateRegistration", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface IInitializationController {
    void flushRegistration();

    void initializeSdk(IEbsCryptoSdkConfig ebsCryptoSdkConfig, TLSOptions tlsOptions, Token serialNumber);

    boolean isInitializedSdk();

    boolean isUpdateRegistration();

    void release();

    Object updateRegistration(Continuation<? super zy11> continuation);

    void updateRegistrationNotSuspend();
}
