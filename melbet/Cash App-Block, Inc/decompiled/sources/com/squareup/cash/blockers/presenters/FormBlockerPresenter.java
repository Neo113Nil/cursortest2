package com.squareup.cash.blockers.presenters;

import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import androidx.core.text.TextUtilsCompat;
import app.cash.api.ApiResult;
import app.cash.badging.backend.RealBadger2;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.views.LocalViewFactory;
import app.cash.versioned.Versioned;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.account.types.SignedInState;
import com.squareup.cash.account.types.SignedInStateManager;
import com.squareup.cash.bitcoin.views.send.MoveBitcoinViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.blockers.actions.util.BlockerActionUriDecoder;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.flow.RealMultiBlockerFacilitator;
import com.squareup.cash.blockers.flow.api.MultiBlockerFacilitator$Resolver;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.card.onboarding.CardModelView$iconTexture$$inlined$map$1;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.TemporaryStorage;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.formview.presenters.FormPresenter;
import com.squareup.cash.formview.presenters.FormPresenter$Factory$Impl;
import com.squareup.cash.formview.viewevents.real.RealFormAnalytics;
import com.squareup.cash.formview.viewmodels.BlockerIdentifiers;
import com.squareup.cash.formview.viewmodels.ButtonIcon;
import com.squareup.cash.formview.viewmodels.ClientScenarioAndFlowToken;
import com.squareup.cash.formview.viewmodels.FormViewModel;
import com.squareup.cash.gcl.RealMarketAttributesProvider;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.util.compose.SharedViewEventsKt;
import com.withpersona.sdk2.camera.CameraPropertiesKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes4.dex */
public final class FormBlockerPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final BlockersScreens.FormScreen args;
    public final MultiBlockerFacilitator$Resolver blockerResolver;
    public final RealBlockersHelper blockersHelper;
    public final BlockersDataNavigator blockersNavigator;
    public final AndroidClock clock;
    public final RealFormAnalytics formAnalytics;
    public final FormPresenter formPresenter;
    public final BetterNavigator.ScreenNavigator navigator;
    public final Flow signOut;
    public final SignedInStateManager signedInStateManager;
    public final AndroidStringManager stringManager;

    public FormBlockerPresenter(FormPresenter$Factory$Impl formPresenter$Factory$Impl, Flow flow, SignedInStateManager signedInStateManager, BlockersDataNavigator blockersDataNavigator, Analytics analytics, RealFormAnalytics realFormAnalytics, RealMultiBlockerFacilitator realMultiBlockerFacilitator, AndroidStringManager androidStringManager, AndroidClock androidClock, RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl, BlockersScreens.FormScreen formScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.signOut = flow;
        this.signedInStateManager = signedInStateManager;
        this.blockersNavigator = blockersDataNavigator;
        this.analytics = analytics;
        this.formAnalytics = realFormAnalytics;
        this.stringManager = androidStringManager;
        this.clock = androidClock;
        this.args = formScreen;
        this.navigator = screenNavigator;
        this.blockersHelper = realBlockersHelper$Factory$Impl.create(screenNavigator);
        this.blockerResolver = realMultiBlockerFacilitator.getResolver(screenNavigator, formScreen);
        FormPresenter.MetroFactory metroFactory = formPresenter$Factory$Impl.delegateFactory;
        RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl2 = (RealBlockersHelper$Factory$Impl) metroFactory.blockersHelperFactory.invoke();
        Analytics analytics2 = (Analytics) metroFactory.analytics.getValue();
        RealFormAnalytics realFormAnalytics2 = (RealFormAnalytics) metroFactory.formAnalytics.invoke();
        BlockerActionUriDecoder blockerActionUriDecoder = (BlockerActionUriDecoder) metroFactory.blockerActionUriDecoder.invoke();
        AndroidClock androidClock2 = (AndroidClock) metroFactory.clock.lambda.invoke();
        realBlockersHelper$Factory$Impl2.getClass();
        analytics2.getClass();
        realFormAnalytics2.getClass();
        blockerActionUriDecoder.getClass();
        androidClock2.getClass();
        this.formPresenter = new FormPresenter(realBlockersHelper$Factory$Impl2, formScreen, screenNavigator, analytics2, realFormAnalytics2, blockerActionUriDecoder, androidClock2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$models$handleSubmitAction(FormBlockerPresenter formBlockerPresenter, State state, MutableState mutableState, Map map, BlockerAction.SubmitAction submitAction, ContinuationImpl continuationImpl) {
        FormBlockerPresenter$models$handleSubmitAction$1 formBlockerPresenter$models$handleSubmitAction$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof FormBlockerPresenter$models$handleSubmitAction$1) {
            formBlockerPresenter$models$handleSubmitAction$1 = (FormBlockerPresenter$models$handleSubmitAction$1) continuationImpl;
            int i2 = formBlockerPresenter$models$handleSubmitAction$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                formBlockerPresenter$models$handleSubmitAction$1.label = i2 - PKIFailureInfo.systemUnavail;
                FormBlockerPresenter$models$handleSubmitAction$1 formBlockerPresenter$models$handleSubmitAction$12 = formBlockerPresenter$models$handleSubmitAction$1;
                Object obj = formBlockerPresenter$models$handleSubmitAction$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = formBlockerPresenter$models$handleSubmitAction$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!((Boolean) state.getValue()).booleanValue()) {
                        String str = submitAction.id;
                        if (!formBlockerPresenter.blockerResolver.getResolvesSynchronously()) {
                            String str2 = submitAction.loading_label;
                            BlockerAction.SubmitAction.AnimationDirection animationDirection = submitAction.direction;
                            if (animationDirection == null) {
                                animationDirection = BlockerAction.SubmitAction.AnimationDirection.FORWARD;
                            }
                            mutableState.setValue(new FormViewModel.SubmissionState.SubmissionInFlight(str2, animationDirection));
                        }
                        Analytics analytics = formBlockerPresenter.analytics;
                        BlockersData blockersData = formBlockerPresenter.args.blockersData;
                        AndroidStringManager androidStringManager = formBlockerPresenter.stringManager;
                        MoveBitcoinViewKt$$ExternalSyntheticLambda3 moveBitcoinViewKt$$ExternalSyntheticLambda3 = new MoveBitcoinViewKt$$ExternalSyntheticLambda3(13);
                        FormBlockerPresenter$models$handleSubmitAction$result$2 formBlockerPresenter$models$handleSubmitAction$result$2 = new FormBlockerPresenter$models$handleSubmitAction$result$2(formBlockerPresenter, map, str, null);
                        formBlockerPresenter$models$handleSubmitAction$12.L$0 = formBlockerPresenter;
                        formBlockerPresenter$models$handleSubmitAction$12.L$2 = mutableState;
                        formBlockerPresenter$models$handleSubmitAction$12.label = 1;
                        obj = PointerInputModifierNodeKt.trackBlockerPotentialSubmissionAnalytics(analytics, blockersData, androidStringManager, moveBitcoinViewKt$$ExternalSyntheticLambda3, R.string.blockers_retrofit_error_message, formBlockerPresenter$models$handleSubmitAction$result$2, formBlockerPresenter$models$handleSubmitAction$12);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mutableState = formBlockerPresenter$models$handleSubmitAction$12.L$2;
                formBlockerPresenter = formBlockerPresenter$models$handleSubmitAction$12.L$0;
                SafeTrace.throwOnFailure(obj);
                apiResult = (ApiResult) obj;
                if (apiResult != null) {
                    return Unit.INSTANCE;
                }
                if (apiResult instanceof ApiResult.Failure) {
                    Timber.Forest.e("Failed to submit form.", new Object[0]);
                    formBlockerPresenter.navigator.goTo(new FailureMessageBlockerScreen(formBlockerPresenter.args.blockersData, TextUtilsCompat.errorMessaging(formBlockerPresenter.stringManager, (ApiResult.Failure) apiResult, null).message, null, 4));
                    mutableState.setValue(FormViewModel.SubmissionState.SubmissionFailed.INSTANCE);
                } else {
                    if (!(apiResult instanceof ApiResult.Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ResponseContext responseContext = (ResponseContext) ((ApiResult.Success) apiResult).response;
                    BlockersScreens.FormScreen formScreen = formBlockerPresenter.args;
                    BetterNavigator.ScreenNavigator screenNavigator = formBlockerPresenter.navigator;
                    BlockersData blockersData2 = formScreen.blockersData;
                    Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                    BlockersData updateFromResponseContext = blockersData2.updateFromResponseContext(responseContext, false);
                    if (updateFromResponseContext.clientScenario == ClientScenario.CLOSE_ACCOUNT) {
                        formBlockerPresenter.signedInStateManager.update(SignedInState.SIGNED_OUT);
                    } else {
                        String str3 = responseContext.failure_message;
                        if (str3 != null) {
                            screenNavigator.goTo(new ProfileScreens.ErrorScreen(str3, null, 14));
                        } else {
                            String str4 = responseContext.dialog_message;
                            if (str4 != null) {
                                screenNavigator.goTo(new BlockersScreens.SuccessMessageScreen(updateFromResponseContext, null, str4, responseContext.dialog_title, 2));
                            } else {
                                screenNavigator.goTo(formBlockerPresenter.blockersNavigator.getNext(formBlockerPresenter.args, updateFromResponseContext));
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }
        formBlockerPresenter$models$handleSubmitAction$1 = new FormBlockerPresenter$models$handleSubmitAction$1(continuationImpl);
        FormBlockerPresenter$models$handleSubmitAction$1 formBlockerPresenter$models$handleSubmitAction$122 = formBlockerPresenter$models$handleSubmitAction$1;
        Object obj2 = formBlockerPresenter$models$handleSubmitAction$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = formBlockerPresenter$models$handleSubmitAction$122.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult != null) {
        }
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        Object formBlockerPresenter$models$2$1;
        MutableState mutableState;
        MutableState mutableState2;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1153844932);
        Flow rememberSharedViewEvents = SharedViewEventsKt.rememberSharedViewEvents(gapComposer);
        Object rememberedValue = gapComposer.rememberedValue();
        Object obj = Composer.Companion.Empty;
        if (rememberedValue == obj) {
            rememberedValue = new CardModelView$iconTexture$$inlined$map$1(this.signOut, 9);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, Boolean.FALSE, null, gapComposer, 48, 2);
        FormViewModel models = this.formPresenter.models(rememberSharedViewEvents, (Composer) gapComposer, 64);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == obj) {
            rememberedValue2 = Updater.mutableStateOf$default(FormViewModel.SubmissionState.None.INSTANCE);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState3 = (MutableState) rememberedValue2;
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == obj) {
            rememberedValue3 = Updater.mutableStateOf$default(new Versioned(null, 0));
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState4 = (MutableState) rememberedValue3;
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == obj) {
            rememberedValue4 = new LinkedHashMap();
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        Map map = (Map) rememberedValue4;
        FormBlockerPresenter formBlockerPresenter = this;
        Updater.LaunchedEffect(gapComposer, flow, new RealIdvPresenter$models$1$1(flow, (Continuation) null, this, rememberSharedViewEvents, map, mutableState4, 3));
        Versioned versioned = (Versioned) mutableState4.getValue();
        boolean changed = gapComposer.changed(collectAsState) | gapComposer.changedInstance(formBlockerPresenter) | gapComposer.changedInstance(map);
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (changed || rememberedValue5 == obj) {
            formBlockerPresenter$models$2$1 = new FormBlockerPresenter$models$2$1(mutableState4, formBlockerPresenter, collectAsState, mutableState3, map, null);
            formBlockerPresenter = formBlockerPresenter;
            mutableState = collectAsState;
            mutableState2 = mutableState3;
            gapComposer.updateRememberedValue(formBlockerPresenter$models$2$1);
        } else {
            formBlockerPresenter$models$2$1 = rememberedValue5;
            mutableState = collectAsState;
            mutableState2 = mutableState3;
        }
        Updater.LaunchedEffect(gapComposer, versioned, (Function2) formBlockerPresenter$models$2$1);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(formBlockerPresenter) | gapComposer.changed(mutableState) | gapComposer.changedInstance(map);
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue6 == obj) {
            Object formBlockerPresenter$models$3$1 = new FormBlockerPresenter$models$3$1(formBlockerPresenter, mutableState, mutableState2, map, null);
            gapComposer.updateRememberedValue(formBlockerPresenter$models$3$1);
            rememberedValue6 = formBlockerPresenter$models$3$1;
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue6);
        FormViewModel.SubmissionState submissionState = (FormViewModel.SubmissionState) mutableState2.getValue();
        List list = models.elements;
        boolean z = models.toolbarNavigationEnabled;
        String str = models.primaryActionText;
        ButtonIcon buttonIcon = models.primaryActionIcon;
        String str2 = models.secondaryActionText;
        String str3 = models.disclaimerText;
        boolean z2 = models.helpEnabled;
        String str4 = models.submitActionId;
        ColorModel colorModel = models.accentColor;
        boolean z3 = models.requiresFullScroll;
        CameraPropertiesKt cameraPropertiesKt = models.onDisplayEffect;
        FormBlocker.Element.ButtonElement.Type type2 = models.primaryActionType;
        FormBlocker.Element.ButtonElement.Style style = models.primaryActionStyle;
        FormBlocker.Element.ButtonElement.Style style2 = models.secondaryActionStyle;
        ColorModel colorModel2 = models.fullBleedHeaderImageBackgroundColor;
        ClientScenarioAndFlowToken clientScenarioAndFlowToken = models.clientScenarioAndFlowToken;
        BlockerIdentifiers blockerIdentifiers = models.blockerIdentifiers;
        boolean z4 = models.retreatEnabled;
        String str5 = models.titleBarAccessoryText;
        list.getClass();
        type2.getClass();
        style.getClass();
        style2.getClass();
        submissionState.getClass();
        FormViewModel formViewModel = new FormViewModel(list, z, str, buttonIcon, str2, str3, z2, str4, colorModel, z3, cameraPropertiesKt, type2, style, style2, colorModel2, submissionState, clientScenarioAndFlowToken, blockerIdentifiers, z4, str5);
        gapComposer.end(false);
        return formViewModel;
    }

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final DoubleCheck analytics;
        public final Provider blockersHelperFactory;
        public final Provider blockersNavigator;
        public final LambdaProvider clock;
        public final Provider formAnalytics;
        public final InstanceFactory formPresenterFactory;
        public final Provider multiBlockerFacilitator;
        public final DoubleCheck signOut;
        public final DoubleCheck signedInStateManager;
        public final LambdaProvider stringManager;

        public MetroFactory(LambdaProvider lambdaProvider, RealBadger2.MetroFactory metroFactory, TemporaryStorage.MetroFactory metroFactory2, InstanceFactory instanceFactory, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, InstanceFactory instanceFactory2, DoubleCheck doubleCheck3, RealMessageSigner.MetroFactory metroFactory3) {
            this.stringManager = lambdaProvider;
            this.blockersNavigator = metroFactory;
            this.formAnalytics = metroFactory2;
            this.multiBlockerFacilitator = instanceFactory;
            this.clock = lambdaProvider2;
            this.signOut = doubleCheck;
            this.signedInStateManager = doubleCheck2;
            this.formPresenterFactory = instanceFactory2;
            this.analytics = doubleCheck3;
            this.blockersHelperFactory = metroFactory3;
        }

        public MetroFactory(InstanceFactory instanceFactory, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, RealBrazeManager.MetroFactory metroFactory, DoubleCheck doubleCheck3, RealMarketAttributesProvider.MetroFactory metroFactory2, LocalViewFactory.MetroFactory metroFactory3, LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, InstanceFactory instanceFactory2) {
            this.formPresenterFactory = instanceFactory;
            this.signOut = doubleCheck;
            this.signedInStateManager = doubleCheck2;
            this.blockersNavigator = metroFactory;
            this.analytics = doubleCheck3;
            this.formAnalytics = metroFactory2;
            this.multiBlockerFacilitator = metroFactory3;
            this.stringManager = lambdaProvider;
            this.clock = lambdaProvider2;
            this.blockersHelperFactory = instanceFactory2;
        }
    }
}
