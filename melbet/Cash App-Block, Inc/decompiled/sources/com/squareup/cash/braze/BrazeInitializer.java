package com.squareup.cash.braze;

import android.app.Activity;
import android.app.Application;
import android.content.ClipboardManager;
import android.content.Context;
import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper;
import app.cash.local.presenters.LocalPresenterModule$Companion;
import app.cash.passcode.presenters.EndAppLockPresenter$Factory$Impl;
import com.bugsnag.android.internal.dag.ContextModule;
import com.squareup.cash.advertising.presenters.FullscreenAdPresenter$Factory$Impl;
import com.squareup.cash.agents.applets.presenters.AgentsHomePresenter$Factory$Impl;
import com.squareup.cash.appintro.views.AppIntroViewFactory;
import com.squareup.cash.appupdate.presenters.AppUpdateDialogPresenter$Factory$Impl;
import com.squareup.cash.billssubscriptions.presenters.BillsSubscriptionsMerchantListPresenter$Factory$Impl;
import com.squareup.cash.blockers.scenarioplan.views.ScenarioPlanErrorView$Factory$Impl;
import com.squareup.cash.blockers.treehouse.presenters.TreehouseBlockerPresenter$Factory$Impl;
import com.squareup.cash.blockers.treehouse.views.TreehouseBlockerUi$Factory$Impl;
import com.squareup.cash.blockers.web.delegates.WebViewBlockerBridge$Factory$Impl;
import com.squareup.cash.blockers.web.presenters.WebViewBlockerPresenter$Factory$Impl;
import com.squareup.cash.bugreporting.presenters.BugReportingPresenter$Factory$Impl;
import com.squareup.cash.card.onboarding.RealStyledCardPresenter$Factory$Impl;
import com.squareup.cash.cashapplite.presenters.PasskeySignatureBlockerPresenter$Factory$Impl;
import com.squareup.cash.checks.CheckDepositUiFactory;
import com.squareup.cash.clientrouting.interceptors.CombinedClientRouteInterceptor$Factory$Impl;
import com.squareup.cash.contacts.encryption.JsonKeyPathEncryptorFactory$Factory$Impl;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.db.CashAppDatabaseCallback;
import com.squareup.cash.db.db.CashAppDatabaseImpl;
import com.squareup.cash.device.RealDeviceOrientationProvider;
import com.squareup.cash.discover.promotiondetails.presenters.PromotionDetailsPresenter$Factory$Impl;
import com.squareup.cash.family.safetyhub.presenters.SafetyHubPresenter$Factory$Impl;
import com.squareup.cash.genericelements.presenters.GenericTreeElementsScreenPresenter$Factory$Impl;
import com.squareup.cash.globalsearch.presenters.GlobalSearchPresenter$Factory$Impl;
import com.squareup.cash.gps.backend.real.AndroidLocationSettingsChecker;
import com.squareup.cash.history.analytics.LoadTimeClock$Factory$Impl;
import com.squareup.cash.history.presenters.InvestingPendingTransactionsPresenter$Factory$Impl;
import com.squareup.cash.initialscreenloader.backend.RealPreSignInScreenLoader;
import com.squareup.cash.initialscreenloader.backend.RealPreSignInScreenLoader$Factory$Impl;
import com.squareup.cash.integration.firebase.FirebaseInitializer;
import com.squareup.cash.nearby.presenters.NearbyPresentersFactory;
import com.squareup.cash.nfc.presenters.NfcPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.squareup.cash.passkeys.presenters.PasskeyBlockerPresenterFactory;
import com.squareup.cash.pdf.presenter.PdfPresenterFactory;
import com.squareup.cash.work.presenters.RealYouPresenter$MetroFactory;
import com.squareup.cash.worker.ApplicationWorker;
import com.squareup.protos.cash.usher.api.UsherService;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okhttp3.ConnectionPool;

/* loaded from: classes.dex */
public final class BrazeInitializer implements ApplicationWorker {
    public final Context context;
    public final CoroutineContext ioContext;

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final InstanceFactory context;

        public /* synthetic */ MetroFactory(InstanceFactory instanceFactory, int i) {
            this.$r8$classId = i;
            this.context = instanceFactory;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            int i2 = 2;
            int i3 = 9;
            int i4 = 8;
            int i5 = 1;
            InstanceFactory instanceFactory = this.context;
            switch (i) {
                case 0:
                    Context context = (Context) instanceFactory.value;
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                    context.getClass();
                    defaultIoScheduler.getClass();
                    return new BrazeInitializer(context, defaultIoScheduler);
                case 1:
                    Activity activity = (Activity) instanceFactory.value;
                    activity.getClass();
                    return LocalPresenterModule$Companion.provideInAppPaymentLauncher(activity);
                case 2:
                    EndAppLockPresenter$Factory$Impl endAppLockPresenter$Factory$Impl = (EndAppLockPresenter$Factory$Impl) instanceFactory.value;
                    endAppLockPresenter$Factory$Impl.getClass();
                    return new PdfPresenterFactory(endAppLockPresenter$Factory$Impl, i5);
                case 3:
                    FullscreenAdPresenter$Factory$Impl fullscreenAdPresenter$Factory$Impl = (FullscreenAdPresenter$Factory$Impl) instanceFactory.value;
                    fullscreenAdPresenter$Factory$Impl.getClass();
                    return new PdfPresenterFactory(fullscreenAdPresenter$Factory$Impl, i2);
                case 4:
                    AgentsHomePresenter$Factory$Impl agentsHomePresenter$Factory$Impl = (AgentsHomePresenter$Factory$Impl) instanceFactory.value;
                    agentsHomePresenter$Factory$Impl.getClass();
                    return new PdfPresenterFactory(agentsHomePresenter$Factory$Impl, 3);
                case 5:
                    AppUpdateDialogPresenter$Factory$Impl appUpdateDialogPresenter$Factory$Impl = (AppUpdateDialogPresenter$Factory$Impl) instanceFactory.value;
                    appUpdateDialogPresenter$Factory$Impl.getClass();
                    return new PdfPresenterFactory(appUpdateDialogPresenter$Factory$Impl, 4);
                case 6:
                    BillsSubscriptionsMerchantListPresenter$Factory$Impl billsSubscriptionsMerchantListPresenter$Factory$Impl = (BillsSubscriptionsMerchantListPresenter$Factory$Impl) instanceFactory.value;
                    billsSubscriptionsMerchantListPresenter$Factory$Impl.getClass();
                    return new NearbyPresentersFactory(billsSubscriptionsMerchantListPresenter$Factory$Impl, i5);
                case 7:
                    ScenarioPlanErrorView$Factory$Impl scenarioPlanErrorView$Factory$Impl = (ScenarioPlanErrorView$Factory$Impl) instanceFactory.value;
                    scenarioPlanErrorView$Factory$Impl.getClass();
                    return new AppIntroViewFactory(scenarioPlanErrorView$Factory$Impl, i5);
                case 8:
                    TreehouseBlockerPresenter$Factory$Impl treehouseBlockerPresenter$Factory$Impl = (TreehouseBlockerPresenter$Factory$Impl) instanceFactory.value;
                    treehouseBlockerPresenter$Factory$Impl.getClass();
                    return new PdfPresenterFactory(treehouseBlockerPresenter$Factory$Impl, 5);
                case 9:
                    TreehouseBlockerUi$Factory$Impl treehouseBlockerUi$Factory$Impl = (TreehouseBlockerUi$Factory$Impl) instanceFactory.value;
                    treehouseBlockerUi$Factory$Impl.getClass();
                    return new AppIntroViewFactory(treehouseBlockerUi$Factory$Impl, i2);
                case 10:
                    WebViewBlockerPresenter$Factory$Impl webViewBlockerPresenter$Factory$Impl = (WebViewBlockerPresenter$Factory$Impl) instanceFactory.value;
                    webViewBlockerPresenter$Factory$Impl.getClass();
                    return new PdfPresenterFactory(webViewBlockerPresenter$Factory$Impl, 6);
                case 11:
                    WebViewBlockerBridge$Factory$Impl webViewBlockerBridge$Factory$Impl = (WebViewBlockerBridge$Factory$Impl) instanceFactory.value;
                    webViewBlockerBridge$Factory$Impl.getClass();
                    return new CheckDepositUiFactory(webViewBlockerBridge$Factory$Impl, i5);
                case 12:
                    BugReportingPresenter$Factory$Impl bugReportingPresenter$Factory$Impl = (BugReportingPresenter$Factory$Impl) instanceFactory.value;
                    bugReportingPresenter$Factory$Impl.getClass();
                    return new PdfPresenterFactory(bugReportingPresenter$Factory$Impl, 7);
                case 13:
                    RealStyledCardPresenter$Factory$Impl realStyledCardPresenter$Factory$Impl = (RealStyledCardPresenter$Factory$Impl) instanceFactory.value;
                    realStyledCardPresenter$Factory$Impl.getClass();
                    return realStyledCardPresenter$Factory$Impl;
                case 14:
                    PasskeySignatureBlockerPresenter$Factory$Impl passkeySignatureBlockerPresenter$Factory$Impl = (PasskeySignatureBlockerPresenter$Factory$Impl) instanceFactory.value;
                    passkeySignatureBlockerPresenter$Factory$Impl.getClass();
                    return new PasskeyBlockerPresenterFactory(passkeySignatureBlockerPresenter$Factory$Impl, i5);
                case 15:
                    CombinedClientRouteInterceptor$Factory$Impl combinedClientRouteInterceptor$Factory$Impl = (CombinedClientRouteInterceptor$Factory$Impl) instanceFactory.value;
                    combinedClientRouteInterceptor$Factory$Impl.getClass();
                    return new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(combinedClientRouteInterceptor$Factory$Impl, i3);
                case 16:
                    Context context2 = (Context) instanceFactory.value;
                    context2.getClass();
                    Object systemService = context2.getSystemService("clipboard");
                    systemService.getClass();
                    return (ClipboardManager) systemService;
                case 17:
                    JsonKeyPathEncryptorFactory$Factory$Impl jsonKeyPathEncryptorFactory$Factory$Impl = (JsonKeyPathEncryptorFactory$Factory$Impl) instanceFactory.value;
                    jsonKeyPathEncryptorFactory$Factory$Impl.getClass();
                    Context context3 = (Context) jsonKeyPathEncryptorFactory$Factory$Impl.delegateFactory.staticImageLoader.invoke();
                    context3.getClass();
                    return new ContextModule(context3, (byte) 0);
                case 18:
                    Activity activity2 = (Activity) instanceFactory.value;
                    activity2.getClass();
                    return new RealDeviceOrientationProvider(activity2);
                case 19:
                    PromotionDetailsPresenter$Factory$Impl promotionDetailsPresenter$Factory$Impl = (PromotionDetailsPresenter$Factory$Impl) instanceFactory.value;
                    promotionDetailsPresenter$Factory$Impl.getClass();
                    return new PdfPresenterFactory(promotionDetailsPresenter$Factory$Impl, i4);
                case 20:
                    SafetyHubPresenter$Factory$Impl safetyHubPresenter$Factory$Impl = (SafetyHubPresenter$Factory$Impl) instanceFactory.value;
                    safetyHubPresenter$Factory$Impl.getClass();
                    return new PdfPresenterFactory(safetyHubPresenter$Factory$Impl, i3);
                case 21:
                    GenericTreeElementsScreenPresenter$Factory$Impl genericTreeElementsScreenPresenter$Factory$Impl = (GenericTreeElementsScreenPresenter$Factory$Impl) instanceFactory.value;
                    genericTreeElementsScreenPresenter$Factory$Impl.getClass();
                    return new NfcPresenterModule$Companion$$ExternalSyntheticLambda0(genericTreeElementsScreenPresenter$Factory$Impl, i5);
                case 22:
                    GlobalSearchPresenter$Factory$Impl globalSearchPresenter$Factory$Impl = (GlobalSearchPresenter$Factory$Impl) instanceFactory.value;
                    globalSearchPresenter$Factory$Impl.getClass();
                    return new PdfPresenterFactory(globalSearchPresenter$Factory$Impl, 10);
                case 23:
                    Activity activity3 = (Activity) instanceFactory.value;
                    activity3.getClass();
                    return new AndroidLocationSettingsChecker(activity3);
                case 24:
                    LoadTimeClock$Factory$Impl loadTimeClock$Factory$Impl = (LoadTimeClock$Factory$Impl) instanceFactory.value;
                    loadTimeClock$Factory$Impl.getClass();
                    return loadTimeClock$Factory$Impl.create(true);
                case 25:
                    InvestingPendingTransactionsPresenter$Factory$Impl investingPendingTransactionsPresenter$Factory$Impl = (InvestingPendingTransactionsPresenter$Factory$Impl) instanceFactory.value;
                    investingPendingTransactionsPresenter$Factory$Impl.getClass();
                    return new PdfPresenterFactory(investingPendingTransactionsPresenter$Factory$Impl, 11);
                case 26:
                    RealPreSignInScreenLoader$Factory$Impl realPreSignInScreenLoader$Factory$Impl = (RealPreSignInScreenLoader$Factory$Impl) instanceFactory.value;
                    realPreSignInScreenLoader$Factory$Impl.getClass();
                    Locale locale = Locale.getDefault();
                    locale.getClass();
                    RealYouPresenter$MetroFactory realYouPresenter$MetroFactory = realPreSignInScreenLoader$Factory$Impl.delegateFactory;
                    FlowStarter flowStarter = (FlowStarter) realYouPresenter$MetroFactory.assignedJobProvider.invoke();
                    UsherService usherService = (UsherService) realYouPresenter$MetroFactory.assignedLocationProvider.invoke();
                    SharedFlow sharedFlow = (SharedFlow) realYouPresenter$MetroFactory.passcodeProvider.invoke();
                    flowStarter.getClass();
                    usherService.getClass();
                    sharedFlow.getClass();
                    return new RealPreSignInScreenLoader(flowStarter, usherService, sharedFlow, locale);
                case 27:
                    Application application = (Application) instanceFactory.value;
                    application.getClass();
                    return new ConnectionPool(application);
                case 28:
                    Context context4 = (Context) instanceFactory.value;
                    context4.getClass();
                    Reflection.factory.getOrCreateKotlinClass(CashAppDatabaseImpl.class);
                    return new FrameworkSQLiteOpenHelper(context4, "cash_app.db", new CashAppDatabaseCallback(8), false, false);
                default:
                    Context context5 = (Context) instanceFactory.value;
                    context5.getClass();
                    return new FirebaseInitializer(context5);
            }
        }
    }

    public BrazeInitializer(Context context, CoroutineContext coroutineContext) {
        this.context = context;
        this.ioContext = coroutineContext;
    }

    @Override // com.squareup.cash.worker.ApplicationWorker
    public final Object work(Continuation continuation) {
        Object withContext = JobKt.withContext(this.ioContext, new BrazeInitializer$work$2(this, null), continuation);
        return withContext == CoroutineSingletons.COROUTINE_SUSPENDED ? withContext : Unit.INSTANCE;
    }
}
