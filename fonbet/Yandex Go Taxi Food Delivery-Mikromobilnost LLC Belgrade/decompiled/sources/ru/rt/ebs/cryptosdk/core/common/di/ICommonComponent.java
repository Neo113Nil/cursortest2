package ru.rt.ebs.cryptosdk.core.common.di;

import android.content.Context;
import java.util.Set;
import kotlin.Metadata;
import ru.rt.ebs.cryptosdk.core.common.controllers.ICommonController;
import ru.rt.ebs.cryptosdk.core.common.entities.models.IComponent;
import ru.rt.ebs.cryptosdk.core.common.entities.models.ISdkDispatchers;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/rt/ebs/cryptosdk/core/common/di/ICommonComponent;", "Lru/rt/ebs/cryptosdk/core/common/entities/models/IComponent;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "commonController", "Lru/rt/ebs/cryptosdk/core/common/controllers/ICommonController;", "getCommonController", "()Lru/rt/ebs/cryptosdk/core/common/controllers/ICommonController;", "sdkDispatchers", "Lru/rt/ebs/cryptosdk/core/common/entities/models/ISdkDispatchers;", "getSdkDispatchers", "()Lru/rt/ebs/cryptosdk/core/common/entities/models/ISdkDispatchers;", "allowedRedirectHosts", "", "", "getAllowedRedirectHosts", "()Ljava/util/Set;", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ICommonComponent extends IComponent {
    Set<String> getAllowedRedirectHosts();

    ICommonController getCommonController();

    Context getContext();

    ISdkDispatchers getSdkDispatchers();
}
