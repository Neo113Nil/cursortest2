package ru.rt.ebs.cryptosdk.core.verificationFlow.di;

import kotlin.Metadata;
import ru.rt.ebs.cryptosdk.core.common.entities.models.IComponent;
import ru.rt.ebs.cryptosdk.core.verificationFlow.controllers.IVerificationSessionController;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/rt/ebs/cryptosdk/core/verificationFlow/di/IVerificationSessionComponent;", "Lru/rt/ebs/cryptosdk/core/common/entities/models/IComponent;", "verificationSessionController", "Lru/rt/ebs/cryptosdk/core/verificationFlow/controllers/IVerificationSessionController;", "getVerificationSessionController", "()Lru/rt/ebs/cryptosdk/core/verificationFlow/controllers/IVerificationSessionController;", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface IVerificationSessionComponent extends IComponent {
    IVerificationSessionController getVerificationSessionController();
}
