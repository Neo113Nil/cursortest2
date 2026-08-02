package com.squareup.cash.favorites.presenters;

import androidx.lifecycle.Lifecycle;
import com.squareup.cash.appmessages.RealAppMessageRepositoryWriter;
import com.squareup.cash.boost.backend.RealBoostSelector;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.payments.backend.api.PaymentManager;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageClientService;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import com.squareup.util.coroutines.android.IoActivitySetupTeardown;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;

/* loaded from: classes.dex */
public final class FavoriteUpsellRefresher implements IoActivitySetupTeardown {
    public final RealAppMessageRepositoryWriter appMessageRepositoryWriter;
    public final AppMessageClientService appService;
    public final FeatureFlagManager featureFlagManager;
    public final PaymentManager paymentManager;

    public FavoriteUpsellRefresher(PaymentManager paymentManager, FeatureFlagManager featureFlagManager, RealAppMessageRepositoryWriter realAppMessageRepositoryWriter, AppMessageClientService appMessageClientService) {
        this.paymentManager = paymentManager;
        this.featureFlagManager = featureFlagManager;
        this.appMessageRepositoryWriter = realAppMessageRepositoryWriter;
        this.appService = appMessageClientService;
    }

    @Override // com.squareup.util.coroutines.SetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope, Object obj) {
        coroutineScope.getClass();
        ((Lifecycle) obj).getClass();
        JobKt.launch$default(coroutineScope, null, CoroutineStart.DEFAULT, new RealBoostSelector.AnonymousClass1((Continuation) null, this, 12), 1);
        return StateFlowKt.noOpTeardown;
    }
}
