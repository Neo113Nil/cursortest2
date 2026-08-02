package com.squareup.cash.cashapppay.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.views.LocalViewFactory;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.appmessages.AppMessageSyncer;
import com.squareup.cash.arcade.ArcadeModule$ProvideHapticVibratorMetroFactory;
import com.squareup.cash.blockers.actions.presenters.BlockerActionUtilKt;
import com.squareup.cash.blockers.actions.util.BlockerActionUriDecoder;
import com.squareup.cash.blockers.flow.RealMultiBlockerFacilitator;
import com.squareup.cash.blockers.flow.api.MultiBlockerFacilitator$Resolver;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.presenters.RealIdvPresenter$models$1$1;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.braze.RealBrazeConfigurator;
import com.squareup.cash.cashapppay.viewmodels.GrantViewModel;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$3$1;
import com.squareup.cash.clientsync.EntitySyncerKt$hasSyncedFlow$1;
import com.squareup.cash.common.viewmodels.AvatarBadgeViewModel;
import com.squareup.cash.common.viewmodels.AvatarViewModel;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.money.views.MoneyUiFactory;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.PayWithCashAuthorizationBlocker;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DelegateFactory;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class GrantPresenter implements MoleculePresenter {
    public final Flow activityEvents;
    public final Analytics analytics;
    public final BlockersScreens.CashAppPayGrant args;
    public final BlockerActionUriDecoder blockerActionUriDecoder;
    public final BlockerFlowListener blockerFlowAnalytics;
    public final MultiBlockerFacilitator$Resolver blockerResolver;
    public final BlockersDataNavigator blockersDataNavigator;
    public final RealBlockersHelper blockersHelper;
    public final GrantViewModel.Main initialMainViewModel;
    public final BetterNavigator.ScreenNavigator navigator;

    public GrantPresenter(BlockersDataNavigator blockersDataNavigator, RealMultiBlockerFacilitator realMultiBlockerFacilitator, Analytics analytics, BlockerFlowListener blockerFlowListener, BetterNavigator.ScreenNavigator screenNavigator, BlockersScreens.CashAppPayGrant cashAppPayGrant, RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl, BlockerActionUriDecoder blockerActionUriDecoder, Flow flow) {
        Integer num;
        AvatarBadgeViewModel.IconRes iconRes;
        Color color;
        Color color2;
        cashAppPayGrant.getClass();
        this.blockersDataNavigator = blockersDataNavigator;
        this.analytics = analytics;
        this.blockerFlowAnalytics = blockerFlowListener;
        this.navigator = screenNavigator;
        this.args = cashAppPayGrant;
        this.blockerActionUriDecoder = blockerActionUriDecoder;
        this.activityEvents = flow;
        this.blockersHelper = realBlockersHelper$Factory$Impl.create(screenNavigator);
        this.blockerResolver = realMultiBlockerFacilitator.getResolver(screenNavigator, cashAppPayGrant);
        PayWithCashAuthorizationBlocker.Avatar avatar = cashAppPayGrant.getAvatar();
        PayWithCashAuthorizationBlocker.Badge badge = avatar != null ? avatar.badge : null;
        int i = badge == null ? -1 : GrantPresenterKt$WhenMappings.$EnumSwitchMapping$0[badge.ordinal()];
        if (i == -1) {
            num = null;
        } else if (i == 1) {
            num = Integer.valueOf(R.drawable.linked_icon);
        } else {
            if (i != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                throw null;
            }
            num = Integer.valueOf(R.drawable.ic_afterpay_logo);
        }
        Image image = avatar != null ? avatar.image : null;
        String str = avatar != null ? avatar.monogram_text : null;
        ColorModel.Accented accented = (avatar == null || (color2 = avatar.background_color) == null) ? null : new ColorModel.Accented(color2);
        if (num != null) {
            iconRes = new AvatarBadgeViewModel.IconRes(num.intValue(), (avatar == null || (color = avatar.badge_background_color) == null) ? ColorModel.PrimaryButtonBackground.INSTANCE : new ColorModel.Accented(color), null, 12);
        } else {
            iconRes = null;
        }
        this.initialMainViewModel = new GrantViewModel.Main(new AvatarViewModel(image, accented, str, (String) null, false, true, (String) null, (String) null, (String) null, (AvatarBadgeViewModel) iconRes, (String) null, false, false, 30736), cashAppPayGrant.getTitle(), cashAppPayGrant.getSubtitle(), cashAppPayGrant.getMoneyAmount(), cashAppPayGrant.getCallToActionElement(), cashAppPayGrant.getFooter());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$submitForm(GrantPresenter grantPresenter, String str, ContinuationImpl continuationImpl) {
        GrantPresenter$submitForm$1 grantPresenter$submitForm$1;
        int i;
        ApiResult apiResult;
        BlockersScreens.CashAppPayGrant cashAppPayGrant = grantPresenter.args;
        if (continuationImpl instanceof GrantPresenter$submitForm$1) {
            grantPresenter$submitForm$1 = (GrantPresenter$submitForm$1) continuationImpl;
            int i2 = grantPresenter$submitForm$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                grantPresenter$submitForm$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = grantPresenter$submitForm$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = grantPresenter$submitForm$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    MultiBlockerFacilitator$Resolver multiBlockerFacilitator$Resolver = grantPresenter.blockerResolver;
                    SubmitFormRequest submitFormRequest = new SubmitFormRequest(cashAppPayGrant.getBlockersData().requestContext, str, EmptyList.INSTANCE, 8);
                    grantPresenter$submitForm$1.label = 1;
                    obj = multiBlockerFacilitator$Resolver.resolve(submitFormRequest, grantPresenter$submitForm$1);
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
                apiResult = (ApiResult) obj;
                if (apiResult != null) {
                    return Boolean.FALSE;
                }
                BlockerActionUtilKt.handleSubmitFormResponseContext(apiResult, cashAppPayGrant, cashAppPayGrant.getBlockersData(), grantPresenter.navigator, grantPresenter.blockersDataNavigator);
                return Boolean.valueOf(apiResult instanceof ApiResult.Success);
            }
        }
        grantPresenter$submitForm$1 = new GrantPresenter$submitForm$1(grantPresenter, continuationImpl);
        Object obj2 = grantPresenter$submitForm$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = grantPresenter$submitForm$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult != null) {
        }
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        Object obj;
        PayWithCashAuthorizationBlocker.Interstitial.Content content;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(577224463);
        Object rememberedValue = gapComposer.rememberedValue();
        BlockersScreens.CashAppPayGrant cashAppPayGrant = this.args;
        Continuation continuation = null;
        Object obj2 = Composer.Companion.Empty;
        if (rememberedValue == obj2) {
            PayWithCashAuthorizationBlocker.Interstitial onDisplayInterstitial = cashAppPayGrant.getOnDisplayInterstitial();
            if (onDisplayInterstitial != null && (content = onDisplayInterstitial.content) != null) {
                PayWithCashAuthorizationBlocker.Interstitial.Content.StatusInterstitial statusInterstitial = content instanceof PayWithCashAuthorizationBlocker.Interstitial.Content.StatusInterstitial ? (PayWithCashAuthorizationBlocker.Interstitial.Content.StatusInterstitial) content : null;
                PayWithCashAuthorizationBlocker.Interstitial.StatusInterstitial value = statusInterstitial != null ? statusInterstitial.getValue() : null;
                if (value != null) {
                    String str = value.text;
                    if (str == null) {
                        str = "";
                    }
                    obj = new GrantViewModel.OnDisplayInterstitial(str);
                    rememberedValue = Updater.mutableStateOf$default(obj);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
            }
            obj = this.initialMainViewModel;
            rememberedValue = Updater.mutableStateOf$default(obj);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Boolean bool = Boolean.FALSE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue2 == obj2) {
            rememberedValue2 = new EntitySyncerKt$hasSyncedFlow$1(this, continuation, 4);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState produceState = Updater.produceState(gapComposer, bool, (Function2) rememberedValue2);
        Updater.LaunchedEffect(gapComposer, flow, new VerifyCheckDepositPresenter$models$3$1(flow, continuation, (MoleculePresenter) this, mutableState, 7));
        Long autoDismissDelayMs = cashAppPayGrant.getAutoDismissDelayMs();
        BlockerAction autoDismissAction = cashAppPayGrant.getAutoDismissAction();
        if (autoDismissDelayMs == null || autoDismissAction == null) {
            gapComposer.startReplaceGroup(-952526509);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-952908987);
            Boolean bool2 = (Boolean) produceState.getValue();
            bool2.getClass();
            boolean changed = gapComposer.changed(produceState) | gapComposer.changed(autoDismissDelayMs) | gapComposer.changedInstance(autoDismissAction) | gapComposer.changedInstance(this);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed || rememberedValue3 == obj2) {
                Object realIdvPresenter$models$1$1 = new RealIdvPresenter$models$1$1(autoDismissDelayMs, autoDismissAction, produceState, this, mutableState, (Continuation) null);
                mutableState = mutableState;
                gapComposer.updateRememberedValue(realIdvPresenter$models$1$1);
                rememberedValue3 = realIdvPresenter$models$1$1;
            }
            Updater.LaunchedEffect(gapComposer, bool2, (Function2) rememberedValue3);
            gapComposer.end(false);
        }
        GrantViewModel grantViewModel = (GrantViewModel) mutableState.getValue();
        gapComposer.end(false);
        return grantViewModel;
    }

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final InstanceFactory activityEvents;
        public final Provider analytics;
        public final Provider blockerActionUriDecoder;
        public final Provider blockerFlowAnalytics;
        public final Provider blockersDataNavigator;
        public final Provider blockersHelperFactory;
        public final Provider multiBlockerFacilitator;

        public /* synthetic */ MetroFactory(Provider provider, Provider provider2, Object obj, Provider provider3, Object obj2, Provider provider4, InstanceFactory instanceFactory) {
            this.blockersDataNavigator = provider;
            this.multiBlockerFacilitator = provider2;
            this.analytics = (Provider) obj;
            this.blockerFlowAnalytics = provider3;
            this.blockersHelperFactory = (Provider) obj2;
            this.blockerActionUriDecoder = provider4;
            this.activityEvents = instanceFactory;
        }

        public MetroFactory(LambdaProvider lambdaProvider, DoubleCheck doubleCheck, InstanceFactory instanceFactory, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, LocalViewFactory.MetroFactory metroFactory, AppMessageSyncer.MetroFactory metroFactory2) {
            this.blockersDataNavigator = lambdaProvider;
            this.multiBlockerFacilitator = doubleCheck;
            this.activityEvents = instanceFactory;
            this.analytics = doubleCheck2;
            this.blockerFlowAnalytics = doubleCheck3;
            this.blockersHelperFactory = metroFactory;
            this.blockerActionUriDecoder = metroFactory2;
        }

        public /* synthetic */ MetroFactory(Provider provider, DoubleCheck doubleCheck, Provider provider2, InstanceFactory instanceFactory, Provider provider3, Provider provider4, LambdaProvider lambdaProvider) {
            this.blockersDataNavigator = provider;
            this.multiBlockerFacilitator = doubleCheck;
            this.analytics = provider2;
            this.activityEvents = instanceFactory;
            this.blockerFlowAnalytics = provider3;
            this.blockersHelperFactory = provider4;
            this.blockerActionUriDecoder = lambdaProvider;
        }

        public MetroFactory(DelegateFactory delegateFactory, RealSessionFlags.MetroFactory metroFactory, MoneyUiFactory.MetroFactory metroFactory2, RealBrazeConfigurator.MetroFactory metroFactory3, LambdaProvider lambdaProvider, InstanceFactory instanceFactory, ArcadeModule$ProvideHapticVibratorMetroFactory arcadeModule$ProvideHapticVibratorMetroFactory) {
            this.blockersDataNavigator = delegateFactory;
            this.multiBlockerFacilitator = metroFactory;
            this.analytics = metroFactory2;
            this.blockerFlowAnalytics = metroFactory3;
            this.blockersHelperFactory = lambdaProvider;
            this.activityEvents = instanceFactory;
            this.blockerActionUriDecoder = arcadeModule$ProvideHapticVibratorMetroFactory;
        }

        public MetroFactory(InstanceFactory instanceFactory, Provider provider, LambdaProvider lambdaProvider, DoubleCheck doubleCheck, IntentLauncher.MetroFactory metroFactory, LambdaProvider lambdaProvider2, LambdaProvider lambdaProvider3) {
            this.activityEvents = instanceFactory;
            this.blockersDataNavigator = provider;
            this.multiBlockerFacilitator = lambdaProvider;
            this.analytics = doubleCheck;
            this.blockerFlowAnalytics = metroFactory;
            this.blockersHelperFactory = lambdaProvider2;
            this.blockerActionUriDecoder = lambdaProvider3;
        }
    }
}
