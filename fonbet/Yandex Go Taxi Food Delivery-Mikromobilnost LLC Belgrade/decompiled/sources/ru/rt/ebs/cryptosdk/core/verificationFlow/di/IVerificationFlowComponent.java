package ru.rt.ebs.cryptosdk.core.verificationFlow.di;

import kotlin.Metadata;
import ru.rt.ebs.cryptosdk.core.common.entities.models.IComponent;
import ru.rt.ebs.cryptosdk.core.verificationFlow.controllers.IVerificationFlowController;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationRouter;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lru/rt/ebs/cryptosdk/core/verificationFlow/di/IVerificationFlowComponent;", "Lru/rt/ebs/cryptosdk/core/common/entities/models/IComponent;", "Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/IVerificationRouter;", "router", "Lzy11;", "registerVerificationRouter", "(Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/IVerificationRouter;)V", "Lru/rt/ebs/cryptosdk/core/verificationFlow/controllers/IVerificationFlowController;", "getVerificationFlowController", "()Lru/rt/ebs/cryptosdk/core/verificationFlow/controllers/IVerificationFlowController;", "verificationFlowController", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface IVerificationFlowComponent extends IComponent {
    IVerificationFlowController getVerificationFlowController();

    void registerVerificationRouter(IVerificationRouter router);
}
