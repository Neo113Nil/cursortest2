package com.squareup.cash.localization;

import app.cash.molecule.PlatformKt;
import com.google.mlkit.vision.common.zzb;
import com.squareup.cash.account.types.SignedInState;
import com.squareup.cash.account.types.SignedInStateManager;
import com.squareup.cash.activity.backend.RealActivityFeedProducer;
import com.squareup.cash.cashapplite.CashAppLiteReleaseModule$$ExternalSyntheticLambda0;
import com.squareup.cash.clientroutes.DeepLinksConfig;
import com.squareup.cash.clientsync.telemetry.RealClientSyncTracer;
import com.squareup.cash.notifications.channels.MiscNotificationChannelContributor;
import com.squareup.cash.observability.backend.api.BugsnagClient;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.offers.backend.real.RealSearchTrackingManager;
import com.squareup.cash.payments.backend.real.RealPaymentManager;
import com.squareup.cash.profilemigration.real.RealMigratedSyncValueBugsnagMetadata;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.session.backend.SessionState;
import com.squareup.cash.support.backend.real.RealSearchPlaceholderProvider;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.cash.upsell.presenters.NullStateSwipeConfigProvider;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.presenters.LiteCardLockFlowTypeProvider;
import com.squareup.cash.work.data.real.RealPersonNameFormatter;
import dev.chrisbanes.haze.Pool;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.internal.Factory;
import okhttp3.ConnectionPool;
import squareup.cash.savings.ArcadeElement;

/* loaded from: classes.dex */
public final class RealLocaleAssetProvider$MetroFactory implements Factory {
    public final /* synthetic */ int $r8$classId;
    public final LambdaProvider localeManager;

    public /* synthetic */ RealLocaleAssetProvider$MetroFactory(LambdaProvider lambdaProvider, int i) {
        this.$r8$classId = i;
        this.localeManager = lambdaProvider;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        int i2 = 1;
        LambdaProvider lambdaProvider = this.localeManager;
        switch (i) {
            case 0:
                RealLocaleManager realLocaleManager = (RealLocaleManager) lambdaProvider.lambda.invoke();
                realLocaleManager.getClass();
                return new zzb(realLocaleManager);
            case 1:
                AndroidStringManager androidStringManager = (AndroidStringManager) lambdaProvider.lambda.invoke();
                androidStringManager.getClass();
                return new ConnectionPool(androidStringManager);
            case 2:
                DeepLinksConfig deepLinksConfig = (DeepLinksConfig) lambdaProvider.invoke();
                deepLinksConfig.getClass();
                return deepLinksConfig.hosts;
            case 3:
                RealObservabilityManager realObservabilityManager = (RealObservabilityManager) lambdaProvider.lambda.invoke();
                realObservabilityManager.getClass();
                return new RealClientSyncTracer(realObservabilityManager);
            case 4:
                SessionManager sessionManager = (SessionManager) lambdaProvider.lambda.invoke();
                sessionManager.getClass();
                return new SignedInStateManager(PlatformKt.getCurrentSessionState(sessionManager) instanceof SessionState.Authenticated ? SignedInState.SIGNED_IN : SignedInState.SIGNED_OUT);
            case 5:
                AndroidClock androidClock = (AndroidClock) lambdaProvider.lambda.invoke();
                androidClock.getClass();
                return new RealActivityFeedProducer(androidClock, i2);
            case 6:
                CashAppLiteReleaseModule$$ExternalSyntheticLambda0 cashAppLiteReleaseModule$$ExternalSyntheticLambda0 = (CashAppLiteReleaseModule$$ExternalSyntheticLambda0) lambdaProvider.lambda.invoke();
                cashAppLiteReleaseModule$$ExternalSyntheticLambda0.getClass();
                return ArcadeElement.Element.provideMoneyTabToolbarConfig$presenters(cashAppLiteReleaseModule$$ExternalSyntheticLambda0);
            case 7:
                AndroidStringManager androidStringManager2 = (AndroidStringManager) lambdaProvider.lambda.invoke();
                androidStringManager2.getClass();
                return new MiscNotificationChannelContributor(androidStringManager2, 1);
            case 8:
                AndroidStringManager androidStringManager3 = (AndroidStringManager) lambdaProvider.lambda.invoke();
                androidStringManager3.getClass();
                return new MiscNotificationChannelContributor(androidStringManager3, 2);
            case 9:
                AndroidStringManager androidStringManager4 = (AndroidStringManager) lambdaProvider.lambda.invoke();
                androidStringManager4.getClass();
                return new MiscNotificationChannelContributor(androidStringManager4, 0);
            case 10:
                AndroidStringManager androidStringManager5 = (AndroidStringManager) lambdaProvider.lambda.invoke();
                androidStringManager5.getClass();
                return new MiscNotificationChannelContributor(androidStringManager5, 3);
            case 11:
                AndroidStringManager androidStringManager6 = (AndroidStringManager) lambdaProvider.lambda.invoke();
                androidStringManager6.getClass();
                return new MiscNotificationChannelContributor(androidStringManager6, 4);
            case 12:
                RealObservabilityManager realObservabilityManager2 = (RealObservabilityManager) lambdaProvider.lambda.invoke();
                realObservabilityManager2.getClass();
                return new ToolbarTuckTargets(realObservabilityManager2);
            case 13:
                RealObservabilityManager realObservabilityManager3 = (RealObservabilityManager) lambdaProvider.lambda.invoke();
                realObservabilityManager3.getClass();
                return new RealSearchTrackingManager(realObservabilityManager3);
            case 14:
                AndroidStringManager androidStringManager7 = (AndroidStringManager) lambdaProvider.lambda.invoke();
                androidStringManager7.getClass();
                return new RealPaymentManager(androidStringManager7);
            case 15:
                BugsnagClient bugsnagClient = (BugsnagClient) lambdaProvider.lambda.invoke();
                bugsnagClient.getClass();
                return new RealMigratedSyncValueBugsnagMetadata(bugsnagClient);
            case 16:
                AndroidStringManager androidStringManager8 = (AndroidStringManager) lambdaProvider.lambda.invoke();
                androidStringManager8.getClass();
                return new RealSearchPlaceholderProvider(androidStringManager8);
            case 17:
                AndroidStringManager androidStringManager9 = (AndroidStringManager) lambdaProvider.lambda.invoke();
                androidStringManager9.getClass();
                return new NullStateSwipeConfigProvider(androidStringManager9);
            case 18:
                CashAppLiteReleaseModule$$ExternalSyntheticLambda0 cashAppLiteReleaseModule$$ExternalSyntheticLambda02 = (CashAppLiteReleaseModule$$ExternalSyntheticLambda0) lambdaProvider.lambda.invoke();
                cashAppLiteReleaseModule$$ExternalSyntheticLambda02.getClass();
                return cashAppLiteReleaseModule$$ExternalSyntheticLambda02.f$0 ? LiteCardLockFlowTypeProvider.INSTANCE : LiteCardLockFlowTypeProvider.INSTANCE$1;
            case 19:
                RealLocaleManager realLocaleManager2 = (RealLocaleManager) lambdaProvider.lambda.invoke();
                realLocaleManager2.getClass();
                return new RealPersonNameFormatter(realLocaleManager2);
            default:
                AndroidClock androidClock2 = (AndroidClock) lambdaProvider.lambda.invoke();
                androidClock2.getClass();
                return new Pool(androidClock2);
        }
    }
}
