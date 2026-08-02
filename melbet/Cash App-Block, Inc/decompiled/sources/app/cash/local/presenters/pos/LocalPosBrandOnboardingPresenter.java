package app.cash.local.presenters.pos;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.room.RoomDatabase$performClear$1;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.navigation.api.RealCashLocalShortlinkHandler;
import app.cash.local.navigation.launcher.RealLocalLauncher;
import app.cash.local.presenters.internal.LocalsKt;
import app.cash.local.primitives.LocalCurrencyCode;
import app.cash.local.primitives.LocalMoney;
import app.cash.local.primitives.math.LocalMoneysKt;
import app.cash.local.screens.app.LocalPosBrandOnboardingScreen;
import app.cash.local.viewmodels.pos.LocalPosBrandOnboardingViewModel;
import coil3.disk.DiskLruCache$launchCleanup$1;
import coil3.network.NetworkFetcher$doFetch$fetchResult$1;
import com.squareup.cash.R;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.POSBrandOnboarding;
import com.squareup.protos.cash.local.client.v1.ShortlinkAction;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes3.dex */
public final class LocalPosBrandOnboardingPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final POSBrandOnboarding.BrandCard brandCard;
    public final long delayBeforeFirstModel;
    public final POSBrandOnboarding.HowItWorks howItWorks;
    public final RealLocalLauncher launcher;
    public final POSBrandOnboarding.LegalConsent legalConsent;
    public final LocalMoney localCashAmount;
    public final POSBrandOnboarding.LocalCashDetails localCashDetails;
    public final BetterNavigator.ScreenNavigator navigator;
    public final POSBrandOnboarding onboarding;
    public final RealCashLocalShortlinkHandler shortlinkHandler;
    public final AndroidStringManager stringManager;

    public LocalPosBrandOnboardingPresenter(AndroidStringManager androidStringManager, RealLocalLauncher realLocalLauncher, RealCashLocalShortlinkHandler realCashLocalShortlinkHandler, Analytics analytics, LocalPosBrandOnboardingScreen localPosBrandOnboardingScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        Long l;
        localPosBrandOnboardingScreen.getClass();
        this.stringManager = androidStringManager;
        this.launcher = realLocalLauncher;
        this.shortlinkHandler = realCashLocalShortlinkHandler;
        this.analytics = analytics;
        this.navigator = screenNavigator;
        POSBrandOnboarding pOSBrandOnboarding = localPosBrandOnboardingScreen.posBrandOnboarding;
        this.onboarding = pOSBrandOnboarding;
        POSBrandOnboarding.BrandCard brandCard = pOSBrandOnboarding.brand_card;
        brandCard.getClass();
        this.brandCard = brandCard;
        this.howItWorks = pOSBrandOnboarding.how_it_works;
        this.legalConsent = pOSBrandOnboarding.legal_consent;
        POSBrandOnboarding.LocalCashDetails localCashDetails = pOSBrandOnboarding.local_cash_card;
        this.localCashDetails = localCashDetails;
        this.localCashAmount = new LocalMoney((localCashDetails == null || (l = localCashDetails.local_cash_amount) == null) ? 0L : l.longValue(), LocalCurrencyCode.USD);
        Long l2 = pOSBrandOnboarding.brand_card_slide_in_delay;
        this.delayBeforeFirstModel = l2 != null ? l2.longValue() : 0L;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        LocalPosBrandOnboardingViewModel.CallToAction callToAction;
        Continuation continuation;
        ShortlinkAction shortlinkAction;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-2060301097);
        POSBrandOnboarding.LegalConsent legalConsent = this.legalConsent;
        boolean z = legalConsent == null;
        POSBrandOnboarding pOSBrandOnboarding = this.onboarding;
        ShortlinkAction shortlinkAction2 = pOSBrandOnboarding.complete_onboarding_shortlink;
        ShortlinkAction shortlinkAction3 = shortlinkAction2 == null ? legalConsent != null ? legalConsent.accept_button_shortlink : null : shortlinkAction2;
        LocalMoney localMoney = this.localCashAmount;
        boolean isPositive = LocalMoneysKt.isPositive(localMoney);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        POSBrandOnboarding.BrandCard brandCard = this.brandCard;
        String str = brandCard.name;
        str.getClass();
        LocalImage localImage = brandCard.artwork_image;
        localImage.getClass();
        LocalPosBrandOnboardingViewModel.CardModel.BrandCard brandCard2 = new LocalPosBrandOnboardingViewModel.CardModel.BrandCard(str, localImage);
        POSBrandOnboarding.LocalCashDetails localCashDetails = this.localCashDetails;
        LocalPosBrandOnboardingViewModel.CardModel.LocalCashCard localCashCard = new LocalPosBrandOnboardingViewModel.CardModel.LocalCashCard(localCashDetails != null ? localCashDetails.title : null, LocalsKt.prettyPrint$default(localMoney, false, null, 3));
        Duration.Companion companion = Duration.Companion;
        long duration = DurationKt.toDuration(this.delayBeforeFirstModel, DurationUnit.MILLISECONDS);
        Duration duration2 = isPositive ? new Duration(LocalPosBrandOnboardingPresenterKt.LOCAL_CASH_FLIP_DELAY) : null;
        LocalColor localColor = brandCard.foreground_color;
        LocalColor localColor2 = brandCard.background_color;
        localColor2.getClass();
        LocalColor localColor3 = brandCard.brand_card_outline_color;
        String str2 = pOSBrandOnboarding.title;
        str2.getClass();
        String str3 = pOSBrandOnboarding.body;
        AndroidStringManager androidStringManager = this.stringManager;
        if (z && shortlinkAction3 == null) {
            callToAction = new LocalPosBrandOnboardingViewModel.CallToAction(androidStringManager.get(R.string.local_presenters_pos_call_to_action_following), LocalPosBrandOnboardingViewModel.CallToAction.Style.LABEL);
        } else {
            String str4 = pOSBrandOnboarding.continue_button_title;
            if (str4 == null) {
                str4 = androidStringManager.get(R.string.local_presenters_pos_call_to_action_next);
            }
            callToAction = new LocalPosBrandOnboardingViewModel.CallToAction(str4, LocalPosBrandOnboardingViewModel.CallToAction.Style.REGULAR_BUTTON);
        }
        LocalPosBrandOnboardingViewModel.CardModel cardModel = new LocalPosBrandOnboardingViewModel.CardModel(brandCard2, localCashCard, localColor, localColor2, localColor3, str2, str3, this.howItWorks, duration, duration2, callToAction);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = Updater.mutableStateOf$default(cardModel);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState2 = (MutableState) rememberedValue2;
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue3 == neverEqualPolicy) {
            continuation = null;
            rememberedValue3 = new DiskLruCache$launchCleanup$1(this, continuation, 18);
            gapComposer.updateRememberedValue(rememberedValue3);
        } else {
            continuation = null;
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue3);
        Boolean valueOf = Boolean.valueOf(z);
        boolean changed = gapComposer.changed(z) | gapComposer.changedInstance(shortlinkAction3) | gapComposer.changedInstance(this);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (changed || rememberedValue4 == neverEqualPolicy) {
            shortlinkAction = shortlinkAction3;
            RoomDatabase$performClear$1 roomDatabase$performClear$1 = new RoomDatabase$performClear$1(z, shortlinkAction, this, continuation, 4);
            gapComposer.updateRememberedValue(roomDatabase$performClear$1);
            rememberedValue4 = roomDatabase$performClear$1;
        } else {
            shortlinkAction = shortlinkAction3;
        }
        Updater.LaunchedEffect(gapComposer, valueOf, (Function2) rememberedValue4);
        Updater.LaunchedEffect(gapComposer, flow, new NetworkFetcher$doFetch$fetchResult$1(flow, (Continuation) null, this, shortlinkAction, mutableState2, mutableState, 13));
        Object obj = (LocalPosBrandOnboardingViewModel) mutableState2.getValue();
        if (((Boolean) mutableState.getValue()).booleanValue()) {
            if (obj instanceof LocalPosBrandOnboardingViewModel.CardModel) {
                obj = LocalPosBrandOnboardingViewModel.CardModel.m1297copyj88AKJc$default((LocalPosBrandOnboardingViewModel.CardModel) obj, new LocalPosBrandOnboardingViewModel.CallToAction(androidStringManager.get(R.string.local_presenters_pos_call_to_action_following), LocalPosBrandOnboardingViewModel.CallToAction.Style.LABEL), 2847);
            } else {
                if (!(obj instanceof LocalPosBrandOnboardingViewModel.LegalConsentModel)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                obj = LocalPosBrandOnboardingViewModel.CardModel.m1297copyj88AKJc$default(cardModel, new LocalPosBrandOnboardingViewModel.CallToAction(androidStringManager.get(R.string.local_presenters_pos_call_to_action_following), LocalPosBrandOnboardingViewModel.CallToAction.Style.LABEL), 2333);
            }
        }
        gapComposer.end(false);
        return obj;
    }
}
