package com.squareup.cash.moneybot.presenters.plugins;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculeCallbackPresenter;
import app.cash.broadway.presenter.molecule.StableCoroutineScope;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsc;
import com.google.zxing.BinaryBitmap;
import com.squareup.cash.borrow.views.BorrowHomeKt$$ExternalSyntheticLambda1;
import com.squareup.cash.businessaccount.kybrestriction.viewmodels.KybRestrictionBannerViewModel;
import com.squareup.cash.businessaccount.screens.KybRestrictionBannerScreen;
import com.squareup.cash.card.onboarding.CardModelView$iconTexture$$inlined$map$1;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.moneybot.analytics.RealMoneybotAnalyticsService;
import com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.NavigationCard;
import com.squareup.cash.moneybot.components.api.PluginContext;
import com.squareup.cash.moneybot.viewmodels.plugins.NavigationCardViewEvent$LaunchClientRoute;
import com.squareup.cash.moneybot.viewmodels.plugins.NavigationCardViewModel;
import com.squareup.cash.overlays.Overlay$$ExternalSyntheticLambda0;
import com.squareup.cash.payments.backend.real.RealP2pSettingsManager;
import com.squareup.cash.sharesheet.RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1;
import com.squareup.protos.cash.cashbusinessaccounts.KybEligibilityWarning;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes6.dex */
public final class NavigationCardPresenter implements MoleculeCallbackPresenter {
    public final /* synthetic */ int $r8$classId = 1;
    public final Object analyticsService;
    public final Object metadata;
    public final Object pluginContext;
    public final RealRouter router;

    public NavigationCardPresenter(Analytics analytics, RealRouter$Factory$Impl realRouter$Factory$Impl, BinaryBitmap binaryBitmap, BetterNavigator.ScreenNavigator screenNavigator, KybRestrictionBannerScreen kybRestrictionBannerScreen) {
        this.analyticsService = analytics;
        this.metadata = binaryBitmap;
        this.pluginContext = kybRestrictionBannerScreen;
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // app.cash.broadway.presenter.molecule.MoleculeCallbackPresenter
    public final UiCallbackModel models(Composer composer) {
        int i = this.$r8$classId;
        Object obj = this.metadata;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        switch (i) {
            case 0:
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(2069190606);
                NavigationCard navigationCard = (NavigationCard) obj;
                NavigationCardViewModel navigationCardViewModel = new NavigationCardViewModel(navigationCard.icon.avatar, navigationCard.cta, new NavigationCardViewEvent$LaunchClientRoute(navigationCard.requestId, navigationCard.tapAction.clientRoute));
                boolean changedInstance = gapComposer.changedInstance(this);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new Overlay$$ExternalSyntheticLambda0(this, 4);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                UiCallbackModel uiCallbackModel = new UiCallbackModel((Function1) rememberedValue, navigationCardViewModel);
                gapComposer.end(false);
                return uiCallbackModel;
            default:
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(1426635626);
                StableCoroutineScope rememberStableCoroutineScope = zzsc.rememberStableCoroutineScope(gapComposer2);
                Object rememberedValue2 = gapComposer2.rememberedValue();
                Object[] objArr = 0;
                if (rememberedValue2 == neverEqualPolicy) {
                    BinaryBitmap binaryBitmap = (BinaryBitmap) obj;
                    KybEligibilityWarning.RestrictedFeature restrictedFeature = ((KybRestrictionBannerScreen) this.pluginContext).restrictedFeature;
                    restrictedFeature.getClass();
                    rememberedValue2 = FlowKt.transformLatest(new CardModelView$iconTexture$$inlined$map$1(((RealP2pSettingsManager) binaryBitmap.binarizer).select(), 21), new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1((Continuation) (objArr == true ? 1 : 0), (Object) binaryBitmap, (Object) restrictedFeature, 6));
                    gapComposer2.updateRememberedValue(rememberedValue2);
                }
                MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue2, null, null, gapComposer2, 48, 2);
                Object rememberedValue3 = gapComposer2.rememberedValue();
                if (rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new BorrowHomeKt$$ExternalSyntheticLambda1(5, rememberStableCoroutineScope, this);
                    gapComposer2.updateRememberedValue(rememberedValue3);
                }
                Function1 function1 = (Function1) rememberedValue3;
                KybEligibilityWarning.BannerDetail bannerDetail = (KybEligibilityWarning.BannerDetail) collectAsState.getValue();
                UiCallbackModel uiCallbackModel2 = new UiCallbackModel(function1, bannerDetail != null ? new KybRestrictionBannerViewModel(bannerDetail) : null);
                gapComposer2.end(false);
                return uiCallbackModel2;
        }
    }

    public NavigationCardPresenter(RealMoneybotAnalyticsService realMoneybotAnalyticsService, RealRouter$Factory$Impl realRouter$Factory$Impl, NavigationCard navigationCard, PluginContext pluginContext, BetterNavigator.ScreenNavigator screenNavigator) {
        this.analyticsService = realMoneybotAnalyticsService;
        this.metadata = navigationCard;
        this.pluginContext = pluginContext;
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
    }
}
