package ru.rt.ebs.cryptosdk.core.di;

import kotlin.Metadata;
import ru.rt.ebs.cryptosdk.core.common.controllers.ICommonController;
import ru.rt.ebs.cryptosdk.core.initialization.controllers.IInitializationController;
import ru.rt.ebs.cryptosdk.core.instructions.controllers.IInstructionsController;
import ru.rt.ebs.cryptosdk.core.metadata.controllers.IMetadataController;
import ru.rt.ebs.cryptosdk.core.security.controllers.ISecurityController;
import ru.rt.ebs.cryptosdk.core.verification.adapter.controllers.IAdapterController;
import ru.rt.ebs.cryptosdk.core.verification.consumer.controllers.IConsumerController;
import ru.rt.ebs.cryptosdk.core.verification.ebs.controllers.IEbsController;
import ru.rt.ebs.cryptosdk.core.verificationFlow.controllers.IVerificationSessionController;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationRouter;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lru/rt/ebs/cryptosdk/core/di/IVerificationFlowBridge;", "", "Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/IVerificationRouter;", "router", "Lzy11;", "registerRouter", "(Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/IVerificationRouter;)V", "unregisterRouter", "()V", "Lru/rt/ebs/cryptosdk/core/verificationFlow/controllers/IVerificationSessionController;", "getVerificationSessionController", "()Lru/rt/ebs/cryptosdk/core/verificationFlow/controllers/IVerificationSessionController;", "verificationSessionController", "getRouter", "()Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/IVerificationRouter;", "Lru/rt/ebs/cryptosdk/core/initialization/controllers/IInitializationController;", "getInitializationController", "()Lru/rt/ebs/cryptosdk/core/initialization/controllers/IInitializationController;", "initializationController", "Lru/rt/ebs/cryptosdk/core/security/controllers/ISecurityController;", "getSecurityController", "()Lru/rt/ebs/cryptosdk/core/security/controllers/ISecurityController;", "securityController", "Lru/rt/ebs/cryptosdk/core/instructions/controllers/IInstructionsController;", "getInstructionsController", "()Lru/rt/ebs/cryptosdk/core/instructions/controllers/IInstructionsController;", "instructionsController", "Lru/rt/ebs/cryptosdk/core/verification/adapter/controllers/IAdapterController;", "getAdapterController", "()Lru/rt/ebs/cryptosdk/core/verification/adapter/controllers/IAdapterController;", "adapterController", "Lru/rt/ebs/cryptosdk/core/verification/ebs/controllers/IEbsController;", "getEbsController", "()Lru/rt/ebs/cryptosdk/core/verification/ebs/controllers/IEbsController;", "ebsController", "Lru/rt/ebs/cryptosdk/core/verification/consumer/controllers/IConsumerController;", "getConsumerController", "()Lru/rt/ebs/cryptosdk/core/verification/consumer/controllers/IConsumerController;", "consumerController", "Lru/rt/ebs/cryptosdk/core/metadata/controllers/IMetadataController;", "getMetadataController", "()Lru/rt/ebs/cryptosdk/core/metadata/controllers/IMetadataController;", "metadataController", "Lru/rt/ebs/cryptosdk/core/common/controllers/ICommonController;", "getCommonController", "()Lru/rt/ebs/cryptosdk/core/common/controllers/ICommonController;", "commonController", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface IVerificationFlowBridge {
    IAdapterController getAdapterController();

    ICommonController getCommonController();

    IConsumerController getConsumerController();

    IEbsController getEbsController();

    IInitializationController getInitializationController();

    IInstructionsController getInstructionsController();

    IMetadataController getMetadataController();

    IVerificationRouter getRouter();

    ISecurityController getSecurityController();

    IVerificationSessionController getVerificationSessionController();

    void registerRouter(IVerificationRouter router);

    void unregisterRouter();
}
