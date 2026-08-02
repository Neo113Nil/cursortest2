package com.squareup.cash.history.presenters;

import android.app.Activity;
import androidx.compose.ui.node.NodeChain;
import app.cash.broadway.navigation.Navigator;
import app.cash.history.screens.HistoryScreens;
import com.squareup.cash.attribution.ProductionAttributionEventEmitter;
import com.squareup.cash.banking.presenters.TransfersPresenter;
import com.squareup.cash.biometrics.AndroidBiometricsStore;
import com.squareup.cash.biometrics.CashBiometricsInfo;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.payments.backend.api.PaymentManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.franklin.app.AppService;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.InstanceFactory;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class PasscodeDialogPresenter$Factory$Impl {
    public final NodeChain delegateFactory;

    public PasscodeDialogPresenter$Factory$Impl(NodeChain nodeChain) {
        this.delegateFactory = nodeChain;
    }

    public final TransfersPresenter create(HistoryScreens.PaymentPasscodeDialog paymentPasscodeDialog, Navigator navigator) {
        paymentPasscodeDialog.getClass();
        NodeChain nodeChain = this.delegateFactory;
        AndroidStringManager androidStringManager = (AndroidStringManager) ((Provider) nodeChain.layoutNode).invoke();
        AppService appService = (AppService) ((Provider) nodeChain.sentinelHead).invoke();
        Analytics analytics = (Analytics) ((Provider) nodeChain.innerCoordinator).invoke();
        AndroidBiometricsStore androidBiometricsStore = (AndroidBiometricsStore) ((Provider) nodeChain.outerCoordinator).invoke();
        CoroutineContext coroutineContext = (CoroutineContext) ((Provider) nodeChain.tail).invoke();
        CashBiometricsInfo cashBiometricsInfo = (CashBiometricsInfo) ((Provider) nodeChain.head).invoke();
        PaymentManager paymentManager = (PaymentManager) ((Provider) nodeChain.current).invoke();
        ProductionAttributionEventEmitter productionAttributionEventEmitter = (ProductionAttributionEventEmitter) ((Provider) nodeChain.buffer).invoke();
        FeatureFlagManager featureFlagManager = (FeatureFlagManager) ((Provider) nodeChain.stack).invoke();
        Activity activity = (Activity) ((InstanceFactory) nodeChain.cachedDiffer).value;
        androidStringManager.getClass();
        appService.getClass();
        analytics.getClass();
        androidBiometricsStore.getClass();
        coroutineContext.getClass();
        cashBiometricsInfo.getClass();
        paymentManager.getClass();
        productionAttributionEventEmitter.getClass();
        featureFlagManager.getClass();
        activity.getClass();
        return new TransfersPresenter(androidStringManager, appService, analytics, androidBiometricsStore, coroutineContext, cashBiometricsInfo, paymentManager, productionAttributionEventEmitter, featureFlagManager, activity, paymentPasscodeDialog, navigator);
    }
}
