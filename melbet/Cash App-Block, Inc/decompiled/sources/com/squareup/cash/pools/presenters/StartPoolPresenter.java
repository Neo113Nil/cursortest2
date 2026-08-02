package com.squareup.cash.pools.presenters;

import android.app.Activity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverKt;
import app.cash.badging.backend.Badger;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.NavigationSideEffects;
import com.squareup.cash.R;
import com.squareup.cash.cdf.asset.AssetPoolPoolHomeView;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.db.SupportConfig;
import com.squareup.cash.family.familyhub.backend.real.RealFamilyAccountsManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.invitations.InviteErrorPresenter$models$1$1;
import com.squareup.cash.keystore.RealKeyStoreProvider;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.cash.pools.backend.api.CreatePoolFailureReason;
import com.squareup.cash.pools.backend.api.CreatePoolResult;
import com.squareup.cash.pools.backend.api.PoolAction$CreatePoolAction;
import com.squareup.cash.pools.backend.real.RealPoolActionManager;
import com.squareup.cash.pools.backend.real.RealPoolsRepository;
import com.squareup.cash.pools.screens.PoolDetailsScreen;
import com.squareup.cash.pools.screens.StartPoolScreen;
import com.squareup.cash.pools.viewmodels.StartPoolViewModel;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda2;
import com.squareup.protos.cash.cashidv.flows.IdvFlowParameters;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.common.Money;
import com.squareup.util.android.RealIntentFactory;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import okio.ByteString;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class StartPoolPresenter implements MoleculePresenter {
    public final Activity activity;
    public final Analytics analytics;
    public final AppConfigManager appConfig;
    public final StartPoolScreen args;
    public final FlowStarter blockersNavigator;
    public final String flowToken;
    public final RealIntentFactory intentFactory;
    public final CoroutineContext ioDispatcher;
    public final MoneyFormatter moneyFormatter;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealPoolActionManager poolActionManager;
    public final RealPoolsRepository poolsRepository;
    public final RealFamilyAccountsManager sponsorshipStateProvider;
    public final AndroidStringManager stringManager;

    public StartPoolPresenter(StartPoolScreen startPoolScreen, BetterNavigator.ScreenNavigator screenNavigator, LocalizedMoneyFormatter.Factory factory, AndroidStringManager androidStringManager, Analytics analytics, RealPoolsRepository realPoolsRepository, RealPoolActionManager realPoolActionManager, FlowStarter flowStarter, Activity activity, AppConfigManager appConfigManager, RealIntentFactory realIntentFactory, RealUuidGenerator realUuidGenerator, RealFamilyAccountsManager realFamilyAccountsManager, CoroutineContext coroutineContext) {
        startPoolScreen.getClass();
        this.args = startPoolScreen;
        this.navigator = screenNavigator;
        this.stringManager = androidStringManager;
        this.analytics = analytics;
        this.poolsRepository = realPoolsRepository;
        this.poolActionManager = realPoolActionManager;
        this.blockersNavigator = flowStarter;
        this.activity = activity;
        this.appConfig = appConfigManager;
        this.intentFactory = realIntentFactory;
        this.sponsorshipStateProvider = realFamilyAccountsManager;
        this.ioDispatcher = coroutineContext;
        this.moneyFormatter = factory.create(MoneyFormatterConfig.COMPACT);
        this.flowToken = re$$ExternalSyntheticOutline0.m();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$goToTermsOfService(StartPoolPresenter startPoolPresenter, ContinuationImpl continuationImpl) {
        StartPoolPresenter$goToTermsOfService$1 startPoolPresenter$goToTermsOfService$1;
        int i;
        if (continuationImpl instanceof StartPoolPresenter$goToTermsOfService$1) {
            startPoolPresenter$goToTermsOfService$1 = (StartPoolPresenter$goToTermsOfService$1) continuationImpl;
            int i2 = startPoolPresenter$goToTermsOfService$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                startPoolPresenter$goToTermsOfService$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = startPoolPresenter$goToTermsOfService$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = startPoolPresenter$goToTermsOfService$1.label;
                Continuation continuation = null;
                int i3 = 1;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    CoroutineContext coroutineContext = startPoolPresenter.ioDispatcher;
                    StartPoolPresenter$models$2$4 startPoolPresenter$models$2$4 = new StartPoolPresenter$models$2$4(startPoolPresenter, continuation, i3);
                    startPoolPresenter$goToTermsOfService$1.label = 1;
                    obj = JobKt.withContext(coroutineContext, startPoolPresenter$models$2$4, startPoolPresenter$goToTermsOfService$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                startPoolPresenter.intentFactory.maybeStartUrlIntent(((SupportConfig) obj).terms_of_service_url, startPoolPresenter.activity, true);
                return Unit.INSTANCE;
            }
        }
        startPoolPresenter$goToTermsOfService$1 = new StartPoolPresenter$goToTermsOfService$1(startPoolPresenter, continuationImpl);
        Object obj2 = startPoolPresenter$goToTermsOfService$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = startPoolPresenter$goToTermsOfService$1.label;
        Continuation continuation2 = null;
        int i32 = 1;
        if (i != 0) {
        }
        startPoolPresenter.intentFactory.maybeStartUrlIntent(((SupportConfig) obj2).terms_of_service_url, startPoolPresenter.activity, true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0080, code lost:
    
        if (r4 == r3) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$models$createPool(StartPoolPresenter startPoolPresenter, MutableState mutableState, String str, Money money, ContinuationImpl continuationImpl) {
        StartPoolPresenter$models$createPool$1 startPoolPresenter$models$createPool$1;
        int i;
        MutableState mutableState2;
        Object withContext;
        CreatePoolResult createPoolResult;
        StartPoolPresenter startPoolPresenter2;
        CreatePoolResult createPoolResult2;
        MutableState mutableState3;
        long duration;
        StartPoolPresenter startPoolPresenter3;
        StartPoolPresenter startPoolPresenter4 = startPoolPresenter;
        if (continuationImpl instanceof StartPoolPresenter$models$createPool$1) {
            startPoolPresenter$models$createPool$1 = (StartPoolPresenter$models$createPool$1) continuationImpl;
            int i2 = startPoolPresenter$models$createPool$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                startPoolPresenter$models$createPool$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = startPoolPresenter$models$createPool$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = startPoolPresenter$models$createPool$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealPoolsRepository realPoolsRepository = startPoolPresenter4.poolsRepository;
                    String uuid = startPoolPresenter4.args.externalId.toString();
                    uuid.getClass();
                    startPoolPresenter$models$createPool$1.L$0 = startPoolPresenter4;
                    mutableState2 = mutableState;
                    startPoolPresenter$models$createPool$1.L$1 = mutableState2;
                    startPoolPresenter$models$createPool$1.label = 1;
                    withContext = JobKt.withContext(realPoolsRepository.ioDispatcher, new PoolsListPresenter$models$2$2(realPoolsRepository, money, str, uuid, (Continuation) null, 9), startPoolPresenter$models$createPool$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            createPoolResult2 = startPoolPresenter$models$createPool$1.L$4;
                            startPoolPresenter3 = startPoolPresenter$models$createPool$1.L$0;
                            SafeTrace.throwOnFailure(obj);
                            CreatePoolResult.Success success = (CreatePoolResult.Success) createPoolResult2;
                            startPoolPresenter3.navigator.goTo(new PoolDetailsScreen(String.valueOf(success.pool.pool_token), null, success.pool, startPoolPresenter3.flowToken, AssetPoolPoolHomeView.ViewHomeSource.CREATION_FLOW, null, 34));
                            return Unit.INSTANCE;
                        }
                        createPoolResult2 = startPoolPresenter$models$createPool$1.L$4;
                        mutableState3 = startPoolPresenter$models$createPool$1.L$1;
                        startPoolPresenter2 = startPoolPresenter$models$createPool$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        mutableState3.setValue(StartPoolViewModel.Success.INSTANCE);
                        Duration.Companion companion = Duration.Companion;
                        duration = DurationKt.toDuration(2, DurationUnit.SECONDS);
                        startPoolPresenter$models$createPool$1.L$0 = startPoolPresenter2;
                        startPoolPresenter$models$createPool$1.L$1 = null;
                        startPoolPresenter$models$createPool$1.L$4 = createPoolResult2;
                        startPoolPresenter$models$createPool$1.label = 3;
                        if (JobKt.m4182delayVtjQ1oo(duration, startPoolPresenter$models$createPool$1) != coroutineSingletons) {
                            startPoolPresenter3 = startPoolPresenter2;
                            CreatePoolResult.Success success2 = (CreatePoolResult.Success) createPoolResult2;
                            startPoolPresenter3.navigator.goTo(new PoolDetailsScreen(String.valueOf(success2.pool.pool_token), null, success2.pool, startPoolPresenter3.flowToken, AssetPoolPoolHomeView.ViewHomeSource.CREATION_FLOW, null, 34));
                            return Unit.INSTANCE;
                        }
                        return coroutineSingletons;
                    }
                    MutableState mutableState4 = startPoolPresenter$models$createPool$1.L$1;
                    StartPoolPresenter startPoolPresenter5 = startPoolPresenter$models$createPool$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    mutableState2 = mutableState4;
                    startPoolPresenter4 = startPoolPresenter5;
                    withContext = obj;
                }
                createPoolResult = (CreatePoolResult) withContext;
                if (!(createPoolResult instanceof CreatePoolResult.Error)) {
                    CreatePoolFailureReason createPoolFailureReason = ((CreatePoolResult.Error) createPoolResult).reason;
                    if (createPoolFailureReason == CreatePoolFailureReason.REQUIRES_IDV) {
                        startPoolPresenter4.navigator.goTo(FlowStarter.startPlasmaFlowWithParams$default(startPoolPresenter4.blockersNavigator, Flow$Type.IDV_IDENTITY_VERIFICATION, new IdvFlowParameters(null, null, null, null, null, null, null, "POOLS", null, null, null, null, null, null, null, null, ByteString.EMPTY), PaymentScreens$HomeScreens$Home.INSTANCE, null, null, null, null, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS));
                    } else {
                        AndroidStringManager androidStringManager = startPoolPresenter4.stringManager;
                        int ordinal = createPoolFailureReason.ordinal();
                        String str2 = ordinal != 1 ? ordinal != 4 ? androidStringManager.get(R.string.pools_create_error_title_generic) : androidStringManager.get(R.string.pools_create_error_title_risk_blocked_eligibility) : androidStringManager.get(R.string.pools_create_error_title_pool_limit);
                        AndroidStringManager androidStringManager2 = startPoolPresenter4.stringManager;
                        int ordinal2 = createPoolFailureReason.ordinal();
                        mutableState2.setValue(new StartPoolViewModel.Error(str2, ordinal2 != 0 ? ordinal2 != 1 ? ordinal2 != 3 ? ordinal2 != 4 ? androidStringManager2.get(R.string.pools_create_error_generic) : androidStringManager2.get(R.string.pools_create_error_risk_blocked_eligibility) : androidStringManager2.get(R.string.pools_create_error_risk_blocked) : androidStringManager2.get(R.string.pools_create_error_max_open_pool_limit) : androidStringManager2.get(R.string.pools_create_error_invalid_name)));
                    }
                    return Unit.INSTANCE;
                }
                if (!(createPoolResult instanceof CreatePoolResult.Success)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                RealPoolActionManager realPoolActionManager = startPoolPresenter4.poolActionManager;
                String uuid2 = startPoolPresenter4.args.externalId.toString();
                uuid2.getClass();
                startPoolPresenter$models$createPool$1.L$0 = startPoolPresenter4;
                startPoolPresenter$models$createPool$1.L$1 = mutableState2;
                startPoolPresenter$models$createPool$1.L$4 = createPoolResult;
                startPoolPresenter$models$createPool$1.label = 2;
                Object emit = realPoolActionManager.poolActions.emit(new PoolAction$CreatePoolAction(uuid2), startPoolPresenter$models$createPool$1);
                if (emit != coroutineSingletons) {
                    emit = Unit.INSTANCE;
                }
                if (emit != coroutineSingletons) {
                    startPoolPresenter2 = startPoolPresenter4;
                    createPoolResult2 = createPoolResult;
                    mutableState3 = mutableState2;
                    mutableState3.setValue(StartPoolViewModel.Success.INSTANCE);
                    Duration.Companion companion2 = Duration.Companion;
                    duration = DurationKt.toDuration(2, DurationUnit.SECONDS);
                    startPoolPresenter$models$createPool$1.L$0 = startPoolPresenter2;
                    startPoolPresenter$models$createPool$1.L$1 = null;
                    startPoolPresenter$models$createPool$1.L$4 = createPoolResult2;
                    startPoolPresenter$models$createPool$1.label = 3;
                    if (JobKt.m4182delayVtjQ1oo(duration, startPoolPresenter$models$createPool$1) != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        startPoolPresenter$models$createPool$1 = new StartPoolPresenter$models$createPool$1(continuationImpl);
        Object obj2 = startPoolPresenter$models$createPool$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = startPoolPresenter$models$createPool$1.label;
        if (i != 0) {
        }
        createPoolResult = (CreatePoolResult) withContext;
        if (!(createPoolResult instanceof CreatePoolResult.Error)) {
        }
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1460428196);
        Object[] objArr = new Object[0];
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (changedInstance || rememberedValue == neverEqualPolicy) {
            rememberedValue = new BottomSheet$$ExternalSyntheticLambda2(this, 6);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue, gapComposer, 0);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = this.sponsorshipStateProvider.isSponsored();
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState collectAsState = Updater.collectAsState((StateFlow) rememberedValue2, Boolean.FALSE, null, gapComposer, 48, 2);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance2 = gapComposer.changedInstance(this);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = new InviteErrorPresenter$models$1$1(this, null, 28);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue3);
        Updater.LaunchedEffect(gapComposer, flow, new PoolsListPresenter$models$2$2(flow, (Continuation) null, (MoleculePresenter) this, mutableState, (State) collectAsState, 13));
        StartPoolViewModel startPoolViewModel = (StartPoolViewModel) mutableState.getValue();
        gapComposer.end(false);
        return startPoolViewModel;
    }

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final InstanceFactory activity;
        public final DoubleCheck analytics;
        public final DoubleCheck appConfig;
        public final DoubleCheck blockersNavigator;
        public final DoubleCheck intentFactory;
        public final LambdaProvider ioDispatcher;
        public final Provider moneyFormatterFactory;
        public final Provider poolActionManager;
        public final Provider poolsRepository;
        public final Provider sponsorshipStateProvider;
        public final LambdaProvider stringManager;
        public final LambdaProvider uuidGenerator;

        public MetroFactory(RealMessageSigner.MetroFactory metroFactory, LambdaProvider lambdaProvider, DoubleCheck doubleCheck, NavigationSideEffects.MetroFactory metroFactory2, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, InstanceFactory instanceFactory, DoubleCheck doubleCheck4, DoubleCheck doubleCheck5, LambdaProvider lambdaProvider2, RealKeyStoreProvider.MetroFactory metroFactory3, LambdaProvider lambdaProvider3) {
            this.moneyFormatterFactory = metroFactory;
            this.stringManager = lambdaProvider;
            this.analytics = doubleCheck;
            this.poolsRepository = metroFactory2;
            this.poolActionManager = doubleCheck2;
            this.blockersNavigator = doubleCheck3;
            this.activity = instanceFactory;
            this.appConfig = doubleCheck4;
            this.intentFactory = doubleCheck5;
            this.uuidGenerator = lambdaProvider2;
            this.sponsorshipStateProvider = metroFactory3;
            this.ioDispatcher = lambdaProvider3;
        }

        public MetroFactory(DoubleCheck doubleCheck, Badger.MetroFactory metroFactory, LambdaProvider lambdaProvider, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, LambdaProvider lambdaProvider2, LambdaProvider lambdaProvider3, Provider provider, DoubleCheck doubleCheck4, InstanceFactory instanceFactory, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3) {
            this.analytics = doubleCheck;
            this.moneyFormatterFactory = metroFactory;
            this.stringManager = lambdaProvider;
            this.blockersNavigator = doubleCheck2;
            this.appConfig = doubleCheck3;
            this.uuidGenerator = lambdaProvider2;
            this.ioDispatcher = lambdaProvider3;
            this.poolsRepository = provider;
            this.intentFactory = doubleCheck4;
            this.activity = instanceFactory;
            this.poolActionManager = instanceFactory2;
            this.sponsorshipStateProvider = instanceFactory3;
        }
    }
}
