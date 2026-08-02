package ru.rt.ebs.cryptosdk.core.initialization.di;

import kotlin.Metadata;
import ru.rt.ebs.cryptosdk.core.common.entities.models.IComponent;
import ru.rt.ebs.cryptosdk.core.initialization.controllers.IInitializationController;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/rt/ebs/cryptosdk/core/initialization/di/IInitializationComponent;", "Lru/rt/ebs/cryptosdk/core/common/entities/models/IComponent;", "initializationController", "Lru/rt/ebs/cryptosdk/core/initialization/controllers/IInitializationController;", "getInitializationController", "()Lru/rt/ebs/cryptosdk/core/initialization/controllers/IInitializationController;", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface IInitializationComponent extends IComponent {
    IInitializationController getInitializationController();
}
