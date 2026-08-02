package com.squareup.cash.google.pay;

import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.wallet.data.IssuedCardManager;
import com.squareup.protos.cash.cashliteflow.api.v1.CashLiteFlowClientService;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.util.coroutines.Signal;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import io.noties.markwon.MarkwonConfiguration;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class CashLiteGooglePayProvisioningGateway$MetroFactory implements Factory {
    public final /* synthetic */ int $r8$classId = 1;
    public final DoubleCheck analytics;
    public final DoubleCheck appService;
    public final DoubleCheck cashLiteFlowClientService;
    public final DoubleCheck issuedCardManager;
    public final LambdaProvider stringManager;

    public CashLiteGooglePayProvisioningGateway$MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, LambdaProvider lambdaProvider, DoubleCheck doubleCheck4) {
        this.cashLiteFlowClientService = doubleCheck;
        this.appService = doubleCheck2;
        this.issuedCardManager = doubleCheck3;
        this.stringManager = lambdaProvider;
        this.analytics = doubleCheck4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        DoubleCheck doubleCheck = this.analytics;
        LambdaProvider lambdaProvider = this.stringManager;
        DoubleCheck doubleCheck2 = this.issuedCardManager;
        DoubleCheck doubleCheck3 = this.appService;
        DoubleCheck doubleCheck4 = this.cashLiteFlowClientService;
        switch (i) {
            case 0:
                CashLiteFlowClientService cashLiteFlowClientService = (CashLiteFlowClientService) doubleCheck4.getValue();
                AppService appService = (AppService) doubleCheck3.getValue();
                IssuedCardManager issuedCardManager = (IssuedCardManager) doubleCheck2.getValue();
                Analytics analytics = (Analytics) doubleCheck.getValue();
                AndroidStringManager androidStringManager = (AndroidStringManager) lambdaProvider.lambda.invoke();
                cashLiteFlowClientService.getClass();
                appService.getClass();
                issuedCardManager.getClass();
                analytics.getClass();
                androidStringManager.getClass();
                return new MarkwonConfiguration(cashLiteFlowClientService, appService, issuedCardManager, analytics, androidStringManager);
            default:
                CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) doubleCheck4.getValue();
                FeatureFlagManager featureFlagManager = (FeatureFlagManager) doubleCheck3.getValue();
                SyncValueReader syncValueReader = (SyncValueReader) doubleCheck2.getValue();
                CoroutineContext coroutineContext = (CoroutineContext) lambdaProvider.lambda.invoke();
                Signal signal = (Signal) doubleCheck.getValue();
                cashAccountDatabaseImpl.getClass();
                featureFlagManager.getClass();
                syncValueReader.getClass();
                coroutineContext.getClass();
                signal.getClass();
                return new MarkwonConfiguration(syncValueReader, cashAccountDatabaseImpl, featureFlagManager, signal, coroutineContext);
        }
    }

    public CashLiteGooglePayProvisioningGateway$MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, DoubleCheck doubleCheck4, LambdaProvider lambdaProvider) {
        this.cashLiteFlowClientService = doubleCheck;
        this.appService = doubleCheck2;
        this.issuedCardManager = doubleCheck3;
        this.analytics = doubleCheck4;
        this.stringManager = lambdaProvider;
    }
}
