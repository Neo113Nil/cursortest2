package com.squareup.cash.blockers.presenters;

import android.app.Activity;
import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.node.NodeChain;
import androidx.glance.session.SessionWorker$doWork$2$2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.passcode.backend.RealAppLockState;
import app.cash.versioned.Versioned;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.intercept.EngineInterceptor$intercept$2;
import com.bugsnag.android.DeviceBuildInfo;
import com.google.maps.android.compose.InputHandlerKt;
import com.miteksystems.misnap.camera.a.n;
import com.squareup.cash.R;
import com.squareup.cash.biometrics.AndroidBiometricsStore;
import com.squareup.cash.biometrics.AndroidSecureStore$read$2;
import com.squareup.cash.biometrics.Biometrics$Info;
import com.squareup.cash.biometrics.BiometricsStore$AnalyticsPayload;
import com.squareup.cash.biometrics.BiometricsStore$BiometricsResult;
import com.squareup.cash.biometrics.CashBiometricsInfo;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.presenters.PasscodeConfirmTypeTransformer;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.treehouse.TreehouseFlows;
import com.squareup.cash.blockers.viewmodels.PasscodeViewModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.gcl.data.RealGlobalConfigDataSource;
import com.squareup.cash.instruments.utils.CardBrandGuesser$Brand;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.invitations.InvitationsPresenterFactory$MetroFactory;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.ui.MainActivityModule$Companion$ProvideActivityLifecycleStateFlowMetroFactory;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.data.IssuedCardManager;
import com.squareup.cash.work.applets.views.WorkApplet$applet$1;
import com.squareup.protos.cash.janus.api.PasscodeService;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.util.coroutines.Signal;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class PasscodePresenter implements MoleculePresenter {
    public final Activity activity;
    public final AppService appService;
    public final BlockersScreens.PasscodeScreen args;
    public final AndroidBiometricsStore biometricsStore;
    public final BlockerFlowListener blockerFlowAnalytics;
    public final RealBlockersHelper blockersHelper;
    public final String defaultTitleText;
    public final FlowStarter flowStarter;
    public final StateFlow lifecycleState;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealPinScreensTitleGenerator pinScreensTitleGenerator;
    public final Signal signOutSignal;
    public final AndroidStringManager stringManager;
    public final String titleTextOverride;
    public final n typedPresenterFactory;

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final InstanceFactory activity;
        public final DoubleCheck appService;
        public final Provider biometricsStore;
        public final Provider blockerFlowAnalytics;
        public final Provider blockersHelperFactory;
        public final DoubleCheck flowStarter;
        public final Provider lifecycleState;
        public final Provider pinScreensTitleGeneratorFactory;
        public final DoubleCheck signOutSignal;
        public final LambdaProvider stringManager;
        public final InvitationsPresenterFactory$MetroFactory typedPresenterFactory;

        public MetroFactory(InstanceFactory instanceFactory, DoubleCheck doubleCheck, MainActivityModule$Companion$ProvideActivityLifecycleStateFlowMetroFactory mainActivityModule$Companion$ProvideActivityLifecycleStateFlowMetroFactory, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, InvitationsPresenterFactory$MetroFactory invitationsPresenterFactory$MetroFactory, InstanceFactory instanceFactory2, LambdaProvider lambdaProvider, RealGlobalConfigDataSource.MetroFactory metroFactory, TreehouseFlows.MetroFactory metroFactory2, InstanceFactory instanceFactory3) {
            this.activity = instanceFactory;
            this.appService = doubleCheck;
            this.lifecycleState = mainActivityModule$Companion$ProvideActivityLifecycleStateFlowMetroFactory;
            this.signOutSignal = doubleCheck2;
            this.flowStarter = doubleCheck3;
            this.typedPresenterFactory = invitationsPresenterFactory$MetroFactory;
            this.blockersHelperFactory = instanceFactory2;
            this.stringManager = lambdaProvider;
            this.blockerFlowAnalytics = metroFactory;
            this.biometricsStore = metroFactory2;
            this.pinScreensTitleGeneratorFactory = instanceFactory3;
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardBrandGuesser$Brand.values().length];
            try {
                iArr[CardBrandGuesser$Brand.BALANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PasscodePresenter(Activity activity, AppService appService, StateFlow stateFlow, Signal signal, FlowStarter flowStarter, n nVar, RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl, AndroidStringManager androidStringManager, BlockerFlowListener blockerFlowListener, AndroidBiometricsStore androidBiometricsStore, RealPinScreensTitleGenerator$Factory$Impl realPinScreensTitleGenerator$Factory$Impl, BlockersScreens.PasscodeScreen passcodeScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        String format2;
        this.activity = activity;
        this.appService = appService;
        this.lifecycleState = stateFlow;
        this.signOutSignal = signal;
        this.flowStarter = flowStarter;
        this.typedPresenterFactory = nVar;
        this.stringManager = androidStringManager;
        this.blockerFlowAnalytics = blockerFlowListener;
        this.biometricsStore = androidBiometricsStore;
        this.args = passcodeScreen;
        this.navigator = screenNavigator;
        this.blockersHelper = realBlockersHelper$Factory$Impl.create(screenNavigator);
        FormattedResources formattedResources = FormattedResources.INSTANCE;
        this.pinScreensTitleGenerator = realPinScreensTitleGenerator$Factory$Impl.create$1(new TitleTemplates(new WorkApplet$applet$1(2, formattedResources, FormattedResources.class, "blockers_passcode_title_pin_format_personal_account", "blockers_passcode_title_pin_format_personal_account(Ljava/lang/Object;Ljava/lang/Object;)Lapp/cash/paraphrase/FormattedResource;", 0, 12), new WorkApplet$applet$1(2, formattedResources, FormattedResources.class, "blockers_passcode_title_pin_format_business_account", "blockers_passcode_title_pin_format_business_account(Ljava/lang/Object;Ljava/lang/Object;)Lapp/cash/paraphrase/FormattedResource;", 0, 13)));
        Redacted redacted = passcodeScreen.titleOverride;
        this.titleTextOverride = redacted != null ? (String) redacted.getValue() : null;
        CardBrandGuesser$Brand brand = InputHandlerKt.toBrand(passcodeScreen.instrumentType);
        if (WhenMappings.$EnumSwitchMapping$0[brand.ordinal()] == 1) {
            format2 = androidStringManager.get(R.string.blockers_passcode_title_pin);
        } else {
            String str = androidStringManager.get(brand.cvvLocation);
            String str2 = passcodeScreen.suffix;
            str2 = str2 == null ? "null" : str2;
            str.getClass();
            Resources resources = androidStringManager.resources;
            resources.getClass();
            format2 = new MessageFormat(resources.getString(R.string.blockers_passcode_title_card)).format(new Object[]{str, str2});
            format2.getClass();
        }
        this.defaultTitleText = format2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$fetchBiometricsToken(PasscodePresenter passcodePresenter, Biometrics$Info biometrics$Info, ContinuationImpl continuationImpl) {
        PasscodePresenter$fetchBiometricsToken$1 passcodePresenter$fetchBiometricsToken$1;
        int i;
        String str;
        BiometricsStore$BiometricsResult.Success success;
        passcodePresenter.getClass();
        if (continuationImpl instanceof PasscodePresenter$fetchBiometricsToken$1) {
            passcodePresenter$fetchBiometricsToken$1 = (PasscodePresenter$fetchBiometricsToken$1) continuationImpl;
            int i2 = passcodePresenter$fetchBiometricsToken$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                passcodePresenter$fetchBiometricsToken$1.label = i2 - PKIFailureInfo.systemUnavail;
                PasscodePresenter$fetchBiometricsToken$1 passcodePresenter$fetchBiometricsToken$12 = passcodePresenter$fetchBiometricsToken$1;
                Object obj = passcodePresenter$fetchBiometricsToken$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = passcodePresenter$fetchBiometricsToken$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    BlockersScreens.PasscodeScreen passcodeScreen = passcodePresenter.args;
                    BlockersData blockersData = passcodeScreen.blockersData;
                    if (!blockersData.skipBiometrics && (str = passcodeScreen.verificationInstrumentToken) != null) {
                        AndroidBiometricsStore androidBiometricsStore = passcodePresenter.biometricsStore;
                        Activity activity = passcodePresenter.activity;
                        String str2 = blockersData.flowToken;
                        ClientScenario clientScenario = blockersData.clientScenario;
                        BiometricsStore$AnalyticsPayload biometricsStore$AnalyticsPayload = new BiometricsStore$AnalyticsPayload(str2, clientScenario != null ? clientScenario.toString() : null);
                        passcodePresenter$fetchBiometricsToken$12.label = 1;
                        obj = androidBiometricsStore.readIfCanAuthenticate(activity, str, biometrics$Info, biometricsStore$AnalyticsPayload, passcodePresenter$fetchBiometricsToken$12);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                success = (BiometricsStore$BiometricsResult.Success) obj;
                if (success != null) {
                    return success.value;
                }
                return null;
            }
        }
        passcodePresenter$fetchBiometricsToken$1 = new PasscodePresenter$fetchBiometricsToken$1(passcodePresenter, continuationImpl);
        PasscodePresenter$fetchBiometricsToken$1 passcodePresenter$fetchBiometricsToken$122 = passcodePresenter$fetchBiometricsToken$1;
        Object obj2 = passcodePresenter$fetchBiometricsToken$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = passcodePresenter$fetchBiometricsToken$122.label;
        if (i != 0) {
        }
        success = (BiometricsStore$BiometricsResult.Success) obj2;
        if (success != null) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03e0  */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        Continuation continuation;
        Object obj;
        BlockersScreens.PasscodeScreen passcodeScreen;
        PasscodePresenter passcodePresenter;
        MutableState mutableState;
        BlockersScreens.PasscodeScreen passcodeScreen2;
        CardBrandGuesser$Brand cardBrandGuesser$Brand;
        MutableState mutableState2;
        Flow flow2;
        CardBrandGuesser$Brand cardBrandGuesser$Brand2;
        MutableState mutableState3;
        Continuation continuation2;
        Object passcodePresenter$models$3$1;
        MutableState mutableState4;
        PasscodeViewModel.VerifyPasscodeModel verifyPasscodeModel;
        PasscodePresenter passcodePresenter2;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState;
        Object obj2;
        String str;
        String str2;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1914048530);
        Object rememberedValue = gapComposer.rememberedValue();
        Object obj3 = Composer.Companion.Empty;
        if (rememberedValue == obj3) {
            rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState5 = (MutableState) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == obj3) {
            rememberedValue2 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer);
        }
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = (ParcelableSnapshotMutableIntState) rememberedValue2;
        Object rememberedValue3 = gapComposer.rememberedValue();
        Continuation continuation3 = null;
        if (rememberedValue3 == obj3) {
            rememberedValue3 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState6 = (MutableState) rememberedValue3;
        BlockersScreens.PasscodeScreen passcodeScreen3 = this.args;
        CardBrandGuesser$Brand brand = InputHandlerKt.toBrand(passcodeScreen3.instrumentType);
        CardBrandGuesser$Brand cardBrandGuesser$Brand3 = CardBrandGuesser$Brand.BALANCE;
        boolean z = brand == cardBrandGuesser$Brand3;
        String str3 = this.titleTextOverride;
        if (str3 == null) {
            str3 = this.defaultTitleText;
        }
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue4 == obj3) {
            rememberedValue4 = new PasscodePresenter$models$1$2(this, null);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState produceState = Updater.produceState(gapComposer, str3, (Function2) rememberedValue4);
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (rememberedValue5 == obj3) {
            rememberedValue5 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        MutableState mutableState7 = (MutableState) rememberedValue5;
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (rememberedValue6 == obj3) {
            rememberedValue6 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        MutableState mutableState8 = (MutableState) rememberedValue6;
        Object rememberedValue7 = gapComposer.rememberedValue();
        if (rememberedValue7 == obj3) {
            rememberedValue7 = new CompletableDeferredImpl();
            gapComposer.updateRememberedValue(rememberedValue7);
        }
        Object obj4 = (CompletableDeferred) rememberedValue7;
        Object rememberedValue8 = gapComposer.rememberedValue();
        if (rememberedValue8 == obj3) {
            SessionWorker$doWork$2$2 sessionWorker$doWork$2$2 = new SessionWorker$doWork$2$2(this, obj4, continuation3, 8);
            int ordinal = passcodeScreen3.f1062type.ordinal();
            continuation = null;
            n nVar = this.typedPresenterFactory;
            BetterNavigator.ScreenNavigator screenNavigator = this.navigator;
            if (ordinal == 0) {
                obj = obj4;
                DeviceBuildInfo deviceBuildInfo = ((PasscodeVerifyTypeTransformer$Factory$Impl) nVar.a).delegateFactory;
                AndroidStringManager androidStringManager = (AndroidStringManager) ((LambdaProvider) deviceBuildInfo.manufacturer).lambda.invoke();
                AppService appService = (AppService) ((DoubleCheck) deviceBuildInfo.model).getValue();
                Signal signal = (Signal) ((DoubleCheck) deviceBuildInfo.osVersion).getValue();
                BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) ((Provider) deviceBuildInfo.osBuild).invoke();
                Analytics analytics = (Analytics) ((DoubleCheck) deviceBuildInfo.fingerprint).getValue();
                RealAppLockState realAppLockState = (RealAppLockState) ((DoubleCheck) deviceBuildInfo.tags).getValue();
                AndroidBiometricsStore androidBiometricsStore = (AndroidBiometricsStore) ((Provider) deviceBuildInfo.brand).invoke();
                CashBiometricsInfo cashBiometricsInfo = (CashBiometricsInfo) ((Provider) deviceBuildInfo.apiLevel).invoke();
                IssuedCardManager issuedCardManager = (IssuedCardManager) ((DoubleCheck) deviceBuildInfo.cpuAbis).getValue();
                androidStringManager.getClass();
                appService.getClass();
                signal.getClass();
                blockersDataNavigator.getClass();
                analytics.getClass();
                realAppLockState.getClass();
                androidBiometricsStore.getClass();
                cashBiometricsInfo.getClass();
                issuedCardManager.getClass();
                passcodeScreen = passcodeScreen3;
                rememberedValue8 = new PasscodeVerifyTypeTransformer(androidStringManager, appService, signal, blockersDataNavigator, analytics, realAppLockState, androidBiometricsStore, cashBiometricsInfo, issuedCardManager, passcodeScreen3, screenNavigator, sessionWorker$doWork$2$2);
            } else if (ordinal == 1) {
                obj = obj4;
                PasscodeConfirmTypeTransformer.MetroFactory metroFactory = ((PasscodeConfirmTypeTransformer$Factory$Impl) nVar.b).delegateFactory;
                AndroidStringManager androidStringManager2 = (AndroidStringManager) metroFactory.stringManager.lambda.invoke();
                AppService appService2 = (AppService) metroFactory.appService.getValue();
                BlockersDataNavigator blockersDataNavigator2 = (BlockersDataNavigator) metroFactory.blockersNavigator.invoke();
                Analytics analytics2 = (Analytics) metroFactory.analytics.getValue();
                RealAppLockState realAppLockState2 = (RealAppLockState) metroFactory.appLockState.getValue();
                AndroidBiometricsStore androidBiometricsStore2 = (AndroidBiometricsStore) metroFactory.biometricsStore.invoke();
                CashBiometricsInfo cashBiometricsInfo2 = (CashBiometricsInfo) metroFactory.biometricsInfo.invoke();
                androidStringManager2.getClass();
                appService2.getClass();
                blockersDataNavigator2.getClass();
                analytics2.getClass();
                realAppLockState2.getClass();
                androidBiometricsStore2.getClass();
                cashBiometricsInfo2.getClass();
                rememberedValue8 = new PasscodeConfirmTypeTransformer(androidStringManager2, appService2, blockersDataNavigator2, analytics2, realAppLockState2, androidBiometricsStore2, cashBiometricsInfo2, passcodeScreen3, screenNavigator, sessionWorker$doWork$2$2);
                passcodeScreen = passcodeScreen3;
            } else {
                if (ordinal != 2 && ordinal != 3 && ordinal != 4) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                NodeChain nodeChain = ((PasscodeGenericGatedEndpointTypeTransformer$Factory$Impl) nVar.c).delegateFactory;
                AndroidStringManager androidStringManager3 = (AndroidStringManager) ((LambdaProvider) nodeChain.layoutNode).lambda.invoke();
                PasscodeService passcodeService = (PasscodeService) ((DoubleCheck) nodeChain.sentinelHead).getValue();
                AppService appService3 = (AppService) ((DoubleCheck) nodeChain.innerCoordinator).getValue();
                AndroidBiometricsStore androidBiometricsStore3 = (AndroidBiometricsStore) ((Provider) nodeChain.outerCoordinator).invoke();
                BlockersDataNavigator blockersDataNavigator3 = (BlockersDataNavigator) ((Provider) nodeChain.tail).invoke();
                RealAppLockState realAppLockState3 = (RealAppLockState) ((DoubleCheck) nodeChain.head).getValue();
                Analytics analytics3 = (Analytics) ((DoubleCheck) nodeChain.current).getValue();
                AndroidClock androidClock = (AndroidClock) ((LambdaProvider) nodeChain.buffer).lambda.invoke();
                CashBiometricsInfo cashBiometricsInfo3 = (CashBiometricsInfo) ((Provider) nodeChain.stack).invoke();
                RealSessionFlags realSessionFlags = (RealSessionFlags) ((Provider) nodeChain.cachedDiffer).invoke();
                androidStringManager3.getClass();
                passcodeService.getClass();
                appService3.getClass();
                androidBiometricsStore3.getClass();
                blockersDataNavigator3.getClass();
                realAppLockState3.getClass();
                analytics3.getClass();
                androidClock.getClass();
                cashBiometricsInfo3.getClass();
                realSessionFlags.getClass();
                obj = obj4;
                rememberedValue8 = new PasscodeGenericGatedEndpointTypeTransformer(androidStringManager3, passcodeService, appService3, androidBiometricsStore3, blockersDataNavigator3, realAppLockState3, analytics3, androidClock, cashBiometricsInfo3, passcodeScreen3, screenNavigator, sessionWorker$doWork$2$2, realSessionFlags);
                passcodeScreen = passcodeScreen3;
            }
            gapComposer.updateRememberedValue(rememberedValue8);
        } else {
            continuation = null;
            obj = obj4;
            passcodeScreen = passcodeScreen3;
        }
        PasscodeTypedTransformer passcodeTypedTransformer = (PasscodeTypedTransformer) rememberedValue8;
        boolean z2 = z;
        Updater.LaunchedEffect(gapComposer, flow, new AndroidSecureStore$read$2(flow, (Continuation) null, this, mutableState8, mutableState5, 24));
        Versioned versioned = (Versioned) mutableState8.getValue();
        if (versioned != null) {
            gapComposer.startReplaceGroup(-1106477359);
            passcodeScreen2 = passcodeScreen;
            cardBrandGuesser$Brand = cardBrandGuesser$Brand3;
            flow2 = flow;
            cardBrandGuesser$Brand2 = brand;
            EngineInterceptor$intercept$2 engineInterceptor$intercept$2 = new EngineInterceptor$intercept$2(20, mutableState8, versioned, this, parcelableSnapshotMutableIntState2, produceState, mutableState7, (Continuation) null);
            mutableState = mutableState8;
            mutableState3 = produceState;
            mutableState2 = mutableState7;
            passcodePresenter = this;
            parcelableSnapshotMutableIntState2 = parcelableSnapshotMutableIntState2;
            Updater.LaunchedEffect(gapComposer, versioned, engineInterceptor$intercept$2);
            gapComposer.end(false);
        } else {
            passcodePresenter = this;
            mutableState = mutableState8;
            passcodeScreen2 = passcodeScreen;
            cardBrandGuesser$Brand = cardBrandGuesser$Brand3;
            mutableState2 = mutableState7;
            flow2 = flow;
            cardBrandGuesser$Brand2 = brand;
            mutableState3 = produceState;
            gapComposer.startReplaceGroup(-1106436997);
            gapComposer.end(false);
        }
        Object rememberedValue9 = gapComposer.rememberedValue();
        if (rememberedValue9 == obj3) {
            continuation2 = continuation;
            rememberedValue9 = FlowKt.channelFlow(new PasscodePresenter$models$verifyPasscodeModel$2$1(passcodePresenter, passcodeTypedTransformer, flow2, continuation2));
            gapComposer.updateRememberedValue(rememberedValue9);
        } else {
            continuation2 = continuation;
        }
        Continuation continuation4 = continuation2;
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue9, null, null, gapComposer, 48, 2);
        PasscodeViewModel.VerifyPasscodeModel verifyPasscodeModel2 = (PasscodeViewModel.VerifyPasscodeModel) collectAsState.getValue();
        boolean changed = gapComposer.changed(collectAsState) | gapComposer.changedInstance(obj) | gapComposer.changed(z2) | gapComposer.changedInstance(passcodePresenter) | gapComposer.changed(mutableState3);
        Object rememberedValue10 = gapComposer.rememberedValue();
        if (changed || rememberedValue10 == obj3) {
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState3 = parcelableSnapshotMutableIntState2;
            mutableState4 = mutableState3;
            verifyPasscodeModel = verifyPasscodeModel2;
            passcodePresenter2 = passcodePresenter;
            passcodePresenter$models$3$1 = new PasscodePresenter$models$3$1(obj, z2, passcodePresenter2, collectAsState, mutableState2, parcelableSnapshotMutableIntState3, mutableState4, null, 0);
            parcelableSnapshotMutableIntState = parcelableSnapshotMutableIntState3;
            gapComposer.updateRememberedValue(passcodePresenter$models$3$1);
        } else {
            verifyPasscodeModel = verifyPasscodeModel2;
            passcodePresenter$models$3$1 = rememberedValue10;
            passcodePresenter2 = passcodePresenter;
            parcelableSnapshotMutableIntState = parcelableSnapshotMutableIntState2;
            mutableState4 = mutableState3;
        }
        Updater.LaunchedEffect(gapComposer, verifyPasscodeModel, (Function2) passcodePresenter$models$3$1);
        mutableState6.setValue((PasscodeViewModel.VerifyPasscodeModel) collectAsState.getValue());
        if ((((PasscodeViewModel.VerifyPasscodeModel) mutableState6.getValue()) instanceof PasscodeViewModel.VerifyPasscodeModel.VerifyingPasscode) || ((Versioned) mutableState.getValue()) != null || ((Boolean) mutableState5.getValue()).booleanValue()) {
            obj2 = PasscodeViewModel.Loading.INSTANCE;
        } else {
            int i2 = cardBrandGuesser$Brand2.cvvLength;
            String str4 = (String) mutableState2.getValue();
            if (str4 == null) {
                str4 = (String) mutableState4.getValue();
            }
            String str5 = str4;
            BlockersScreens.PasscodeScreen passcodeScreen4 = passcodeScreen2;
            String str6 = passcodeScreen4.subText;
            List list = passcodeScreen4.helpItems;
            AndroidStringManager androidStringManager4 = passcodePresenter2.stringManager;
            if (list != null && !list.isEmpty()) {
                str2 = androidStringManager4.get(R.string.blockers_help);
            } else if (cardBrandGuesser$Brand2 == cardBrandGuesser$Brand) {
                str2 = androidStringManager4.get(R.string.blockers_help);
            } else {
                str = continuation4;
                obj2 = new PasscodeViewModel.Content(i2, parcelableSnapshotMutableIntState.getIntValue(), str5, str6, str, passcodeScreen4.dismissAction == null);
            }
            str = str2;
            obj2 = new PasscodeViewModel.Content(i2, parcelableSnapshotMutableIntState.getIntValue(), str5, str6, str, passcodeScreen4.dismissAction == null);
        }
        gapComposer.end(false);
        return obj2;
    }
}
