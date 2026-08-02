package com.squareup.cash.knot.backend.real;

import android.content.Context;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.featuretoggle.UnleashContext;
import com.google.mlkit.vision.text.zzb;
import com.knotapi.knot.Knot;
import com.knotapi.knot.models.CustomerConfiguration;
import com.knotapi.knot.models.Environment;
import com.knotapi.knot.models.KnotConfiguration;
import com.squareup.cash.agents.applets.presenters.RealAgentsRepository;
import com.squareup.cash.blockers.views.FileBlockerView;
import com.squareup.cash.clientsync.pipeline.ClientSyncRequestExecutor;
import com.squareup.cash.clientsync.pipeline.RealClientSyncStorageOperationBatchExecutor;
import com.squareup.cash.clientsync.pipeline.TaskIdGenerator;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.family.applets.data.RealApprovedContactsAppletTileRepository;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.knot.backend.api.KnotLauncher;
import com.squareup.cash.moneybot.components.plugins.SlottedCardPlugin;
import com.squareup.cash.moneybot.presenters.plugins.SlottedCardPresenter$Factory$Impl;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.offers.presenters.RealOffersPopupMessageDismisser;
import com.squareup.cash.phoneplans.applets.presenters.RealPhonePlansAppletTileAvailabilityManager;
import com.squareup.cash.reactions.real.RealReactionManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.session.backend.TimeToLiveSyncState;
import com.squareup.cash.shopping.backend.real.RealProductSearchRepository;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.agentcore.api.v1.AgentCoreService;
import com.squareup.protos.cash.blockly.api.BlocklyService;
import com.squareup.protos.cash.cashsubscriptions.api.v1_0.CashSubscriptionsAppService;
import com.squareup.protos.cash.customersearch.api.CustomerSearchClientService;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageClientService;
import com.squareup.protos.cash.postcard.app.CreateKnotSessionRequest;
import com.squareup.protos.cash.postcard.app.CreateKnotSessionResponse;
import com.squareup.protos.cash.postcard.app.KnotEntryPoint;
import com.squareup.protos.cash.postcard.app.KnotSdkConfig;
import com.squareup.protos.cash.postcard.app.PostcardClientService;
import com.squareup.protos.franklin.app.AppService;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealKnotLauncher implements KnotLauncher {
    public final Context appContext;
    public final String environment;
    public final RealKnotEventDelegate$Factory$Impl knotEventDelegateFactory;
    public final PostcardClientService postcardAppService;

    public RealKnotLauncher(PostcardClientService postcardClientService, RealKnotEventDelegate$Factory$Impl realKnotEventDelegate$Factory$Impl, zzb zzbVar, String str, Context context) {
        this.postcardAppService = postcardClientService;
        this.knotEventDelegateFactory = realKnotEventDelegate$Factory$Impl;
        this.environment = str;
        this.appContext = context.getApplicationContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object launch(String str, ContinuationImpl continuationImpl) {
        RealKnotLauncher$launch$1 realKnotLauncher$launch$1;
        int i;
        String str2;
        ApiResult apiResult;
        CreateKnotSessionResponse createKnotSessionResponse;
        String str3;
        String str4;
        List list;
        if (continuationImpl instanceof RealKnotLauncher$launch$1) {
            realKnotLauncher$launch$1 = (RealKnotLauncher$launch$1) continuationImpl;
            int i2 = realKnotLauncher$launch$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realKnotLauncher$launch$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realKnotLauncher$launch$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realKnotLauncher$launch$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    CreateKnotSessionRequest createKnotSessionRequest = new CreateKnotSessionRequest(KnotEntryPoint.valueOf(str), null, null, ByteString.EMPTY);
                    realKnotLauncher$launch$1.L$0 = str;
                    realKnotLauncher$launch$1.label = 1;
                    obj = this.postcardAppService.createKnotSession(createKnotSessionRequest, realKnotLauncher$launch$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str2 = str;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = realKnotLauncher$launch$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success) && (str3 = (createKnotSessionResponse = (CreateKnotSessionResponse) ((ApiResult.Success) apiResult).response).session_id) != null && (str4 = createKnotSessionResponse.client_id) != null) {
                    KnotSdkConfig knotSdkConfig = createKnotSessionResponse.sdk_config;
                    Environment environment = !this.environment.equals("Production") ? Environment.production : Environment.development;
                    Knot.Product product = Knot.Product.card_switcher;
                    int[] intArray = (knotSdkConfig != null || (list = knotSdkConfig.merchant_ids) == null) ? null : CollectionsKt.toIntArray(list);
                    Boolean bool = knotSdkConfig == null ? knotSdkConfig.categories : null;
                    Boolean bool2 = knotSdkConfig == null ? knotSdkConfig.search : null;
                    String lowerCase = str2.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    KnotConfiguration knotConfiguration = new KnotConfiguration(str3, str4, environment, product, intArray, bool, bool2, null, lowerCase, new CustomerConfiguration(null, null, null));
                    FileBlockerView.MetroFactory metroFactory = this.knotEventDelegateFactory.delegateFactory;
                    PostcardClientService postcardClientService = (PostcardClientService) metroFactory.vibrator.invoke();
                    Analytics analytics = (Analytics) metroFactory.permissionManager.invoke();
                    CoroutineScope coroutineScope = (CoroutineScope) metroFactory.activityEvents.value;
                    postcardClientService.getClass();
                    analytics.getClass();
                    coroutineScope.getClass();
                    EglCore eglCore = new EglCore(postcardClientService, analytics, coroutineScope, str3);
                    Context context = this.appContext;
                    context.getClass();
                    Knot.open(context, knotConfiguration, eglCore);
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
        }
        realKnotLauncher$launch$1 = new RealKnotLauncher$launch$1(this, continuationImpl);
        Object obj2 = realKnotLauncher$launch$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realKnotLauncher$launch$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
            return Unit.INSTANCE;
        }
        KnotSdkConfig knotSdkConfig2 = createKnotSessionResponse.sdk_config;
        Environment environment2 = !this.environment.equals("Production") ? Environment.production : Environment.development;
        Knot.Product product2 = Knot.Product.card_switcher;
        if (knotSdkConfig2 != null) {
        }
        if (knotSdkConfig2 == null) {
        }
        if (knotSdkConfig2 == null) {
        }
        String lowerCase2 = str2.toLowerCase(Locale.ROOT);
        lowerCase2.getClass();
        KnotConfiguration knotConfiguration2 = new KnotConfiguration(str3, str4, environment2, product2, intArray, bool, bool2, null, lowerCase2, new CustomerConfiguration(null, null, null));
        FileBlockerView.MetroFactory metroFactory2 = this.knotEventDelegateFactory.delegateFactory;
        PostcardClientService postcardClientService2 = (PostcardClientService) metroFactory2.vibrator.invoke();
        Analytics analytics2 = (Analytics) metroFactory2.permissionManager.invoke();
        CoroutineScope coroutineScope2 = (CoroutineScope) metroFactory2.activityEvents.value;
        postcardClientService2.getClass();
        analytics2.getClass();
        coroutineScope2.getClass();
        EglCore eglCore2 = new EglCore(postcardClientService2, analytics2, coroutineScope2, str3);
        Context context2 = this.appContext;
        context2.getClass();
        Knot.open(context2, knotConfiguration2, eglCore2);
        return Unit.INSTANCE;
    }

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final Provider context;
        public final Provider environment;
        public final InstanceFactory knotEventDelegateFactory;
        public final Provider postcardAppService;

        public MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, InstanceFactory instanceFactory, LambdaProvider lambdaProvider) {
            this.$r8$classId = 0;
            this.postcardAppService = doubleCheck;
            this.knotEventDelegateFactory = instanceFactory;
            this.environment = lambdaProvider;
            this.context = doubleCheck2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            Provider provider = this.context;
            InstanceFactory instanceFactory = this.knotEventDelegateFactory;
            Provider provider2 = this.environment;
            Provider provider3 = this.postcardAppService;
            switch (i) {
                case 0:
                    PostcardClientService postcardClientService = (PostcardClientService) provider3.invoke();
                    RealKnotEventDelegate$Factory$Impl realKnotEventDelegate$Factory$Impl = (RealKnotEventDelegate$Factory$Impl) instanceFactory.value;
                    zzb zzbVar = (zzb) RealKnotSdkWrapper$MetroFactory.INSTANCE.invoke();
                    String str = (String) provider2.invoke();
                    Context context = (Context) provider.invoke();
                    postcardClientService.getClass();
                    realKnotEventDelegate$Factory$Impl.getClass();
                    str.getClass();
                    context.getClass();
                    return new RealKnotLauncher(postcardClientService, realKnotEventDelegate$Factory$Impl, zzbVar, str, context);
                case 1:
                    AgentCoreService agentCoreService = (AgentCoreService) provider3.invoke();
                    SessionManager sessionManager = (SessionManager) provider2.invoke();
                    AndroidStringManager androidStringManager = (AndroidStringManager) provider.invoke();
                    CoroutineScope coroutineScope = (CoroutineScope) instanceFactory.value;
                    agentCoreService.getClass();
                    sessionManager.getClass();
                    androidStringManager.getClass();
                    coroutineScope.getClass();
                    return new RealAgentsRepository(agentCoreService, sessionManager, androidStringManager, coroutineScope);
                case 2:
                    CoroutineScope coroutineScope2 = (CoroutineScope) instanceFactory.value;
                    ClientSyncRequestExecutor clientSyncRequestExecutor = (ClientSyncRequestExecutor) provider3.invoke();
                    RealClientSyncStorageOperationBatchExecutor realClientSyncStorageOperationBatchExecutor = (RealClientSyncStorageOperationBatchExecutor) provider2.invoke();
                    TaskIdGenerator taskIdGenerator = (TaskIdGenerator) provider.invoke();
                    coroutineScope2.getClass();
                    clientSyncRequestExecutor.getClass();
                    realClientSyncStorageOperationBatchExecutor.getClass();
                    taskIdGenerator.getClass();
                    return new RealClientSyncer(coroutineScope2, clientSyncRequestExecutor, realClientSyncStorageOperationBatchExecutor, taskIdGenerator);
                case 3:
                    RealFamilyProfileManager realFamilyProfileManager = (RealFamilyProfileManager) provider3.invoke();
                    BlocklyService blocklyService = (BlocklyService) provider2.invoke();
                    SessionManager sessionManager2 = (SessionManager) provider.invoke();
                    CoroutineScope coroutineScope3 = (CoroutineScope) instanceFactory.value;
                    realFamilyProfileManager.getClass();
                    blocklyService.getClass();
                    sessionManager2.getClass();
                    coroutineScope3.getClass();
                    return new RealApprovedContactsAppletTileRepository(realFamilyProfileManager, blocklyService, sessionManager2, coroutineScope3);
                case 4:
                    CoroutineContext coroutineContext = (CoroutineContext) provider2.invoke();
                    CoroutineScope coroutineScope4 = (CoroutineScope) instanceFactory.value;
                    StateFlow stateFlow = (StateFlow) provider.invoke();
                    provider3.getClass();
                    coroutineContext.getClass();
                    coroutineScope4.getClass();
                    stateFlow.getClass();
                    return new UnleashContext(provider3, coroutineContext, coroutineScope4, stateFlow);
                case 5:
                    SlottedCardPresenter$Factory$Impl slottedCardPresenter$Factory$Impl = (SlottedCardPresenter$Factory$Impl) instanceFactory.value;
                    ErrorReporter errorReporter = (ErrorReporter) provider3.invoke();
                    SampleStrategy sampleStrategy = (SampleStrategy) provider2.invoke();
                    LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) provider.invoke();
                    slottedCardPresenter$Factory$Impl.getClass();
                    errorReporter.getClass();
                    sampleStrategy.getClass();
                    factory.getClass();
                    return new SlottedCardPlugin(slottedCardPresenter$Factory$Impl, errorReporter, sampleStrategy, factory);
                case 6:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) provider3.invoke();
                    AppMessageClientService appMessageClientService = (AppMessageClientService) provider2.invoke();
                    CoroutineScope coroutineScope5 = (CoroutineScope) instanceFactory.value;
                    CoroutineContext coroutineContext2 = (CoroutineContext) provider.invoke();
                    cashAccountDatabaseImpl.getClass();
                    appMessageClientService.getClass();
                    coroutineScope5.getClass();
                    coroutineContext2.getClass();
                    return new RealOffersPopupMessageDismisser(cashAccountDatabaseImpl, appMessageClientService, coroutineScope5, coroutineContext2);
                case 7:
                    CoroutineScope coroutineScope6 = (CoroutineScope) instanceFactory.value;
                    CashSubscriptionsAppService cashSubscriptionsAppService = (CashSubscriptionsAppService) provider3.invoke();
                    SyncValueReader syncValueReader = (SyncValueReader) provider2.invoke();
                    CoroutineContext coroutineContext3 = (CoroutineContext) provider.invoke();
                    coroutineScope6.getClass();
                    cashSubscriptionsAppService.getClass();
                    syncValueReader.getClass();
                    coroutineContext3.getClass();
                    return new RealPhonePlansAppletTileAvailabilityManager(coroutineScope6, cashSubscriptionsAppService, syncValueReader, coroutineContext3);
                case 8:
                    AppService appService = (AppService) provider3.invoke();
                    CoroutineContext coroutineContext4 = (CoroutineContext) provider2.invoke();
                    CoroutineScope coroutineScope7 = (CoroutineScope) instanceFactory.value;
                    Analytics analytics = (Analytics) provider.invoke();
                    appService.getClass();
                    coroutineContext4.getClass();
                    coroutineScope7.getClass();
                    analytics.getClass();
                    return new RealReactionManager(appService, coroutineContext4, coroutineScope7, analytics);
                case 9:
                    AndroidClock androidClock = (AndroidClock) provider3.invoke();
                    SessionManager sessionManager3 = (SessionManager) provider2.invoke();
                    Flow flow = (Flow) provider.invoke();
                    CoroutineScope coroutineScope8 = (CoroutineScope) instanceFactory.value;
                    androidClock.getClass();
                    sessionManager3.getClass();
                    flow.getClass();
                    coroutineScope8.getClass();
                    return new TimeToLiveSyncState(3L, androidClock, sessionManager3, flow, coroutineScope8);
                case 10:
                    AndroidClock androidClock2 = (AndroidClock) provider3.invoke();
                    SessionManager sessionManager4 = (SessionManager) provider2.invoke();
                    Flow flow2 = (Flow) provider.invoke();
                    CoroutineScope coroutineScope9 = (CoroutineScope) instanceFactory.value;
                    androidClock2.getClass();
                    sessionManager4.getClass();
                    flow2.getClass();
                    coroutineScope9.getClass();
                    return new TimeToLiveSyncState(5L, androidClock2, sessionManager4, flow2, coroutineScope9);
                default:
                    CustomerSearchClientService customerSearchClientService = (CustomerSearchClientService) provider3.invoke();
                    CashAccountDatabaseImpl cashAccountDatabaseImpl2 = (CashAccountDatabaseImpl) provider2.invoke();
                    CoroutineScope coroutineScope10 = (CoroutineScope) instanceFactory.value;
                    CoroutineContext coroutineContext5 = (CoroutineContext) provider.invoke();
                    customerSearchClientService.getClass();
                    cashAccountDatabaseImpl2.getClass();
                    coroutineScope10.getClass();
                    coroutineContext5.getClass();
                    return new RealProductSearchRepository(customerSearchClientService, cashAccountDatabaseImpl2, coroutineScope10, coroutineContext5);
            }
        }

        public /* synthetic */ MetroFactory(DoubleCheck doubleCheck, Provider provider, InstanceFactory instanceFactory, Provider provider2, int i) {
            this.$r8$classId = i;
            this.postcardAppService = doubleCheck;
            this.environment = provider;
            this.knotEventDelegateFactory = instanceFactory;
            this.context = provider2;
        }

        public /* synthetic */ MetroFactory(Provider provider, Provider provider2, Provider provider3, InstanceFactory instanceFactory, int i) {
            this.$r8$classId = i;
            this.postcardAppService = provider;
            this.environment = provider2;
            this.context = provider3;
            this.knotEventDelegateFactory = instanceFactory;
        }

        public /* synthetic */ MetroFactory(InstanceFactory instanceFactory, Provider provider, Provider provider2, Provider provider3, int i) {
            this.$r8$classId = i;
            this.knotEventDelegateFactory = instanceFactory;
            this.postcardAppService = provider;
            this.environment = provider2;
            this.context = provider3;
        }
    }
}
