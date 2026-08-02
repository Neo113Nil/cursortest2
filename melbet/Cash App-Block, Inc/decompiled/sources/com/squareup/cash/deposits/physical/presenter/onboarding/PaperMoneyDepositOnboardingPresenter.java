package com.squareup.cash.deposits.physical.presenter.onboarding;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.squareup.cash.cdf.papermoney.PaperMoneyDepositCloseTutorial;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$3$1;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.deposits.physical.screens.PaperMoneyDepositOnboardingScreen;
import com.squareup.cash.deposits.physical.viewmodels.onboarding.PaperMoneyDepositOnboardingEvent;
import com.squareup.cash.deposits.physical.viewmodels.onboarding.PaperMoneyDepositOnboardingViewModel;
import com.squareup.cash.google.pay.GooglePayPresenter$models$1$1;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.screens.Back;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.preferences.BooleanPreference;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.franklin.api.PaperCashDepositBlocker;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final class PaperMoneyDepositOnboardingPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final AndroidClock clock;
    public final KeyValue lastViewed;
    public final BetterNavigator.ScreenNavigator navigator;
    public final BooleanPreference physicalDepositViewed;
    public final PaperCashDepositBlocker.TutorialCarousel tutorialBlockerInfo;

    public PaperMoneyDepositOnboardingPresenter(Analytics analytics, AndroidClock androidClock, PaperMoneyDepositOnboardingScreen paperMoneyDepositOnboardingScreen, BetterNavigator.ScreenNavigator screenNavigator, KeyValue keyValue, BooleanPreference booleanPreference) {
        paperMoneyDepositOnboardingScreen.getClass();
        this.analytics = analytics;
        this.clock = androidClock;
        this.navigator = screenNavigator;
        this.lastViewed = keyValue;
        this.physicalDepositViewed = booleanPreference;
        PaperCashDepositBlocker.TutorialCarousel tutorialCarousel = paperMoneyDepositOnboardingScreen.paperCashDepositBlocker.turorial_carousel;
        tutorialCarousel.getClass();
        this.tutorialBlockerInfo = tutorialCarousel;
    }

    public static final void access$onClose(PaperMoneyDepositOnboardingPresenter paperMoneyDepositOnboardingPresenter, PaperMoneyDepositOnboardingEvent.Paged paged) {
        paperMoneyDepositOnboardingPresenter.analytics.track(new PaperMoneyDepositCloseTutorial(Boolean.valueOf(paperMoneyDepositOnboardingPresenter.isLastPage(paged))), null);
        BooleanPreference booleanPreference = paperMoneyDepositOnboardingPresenter.physicalDepositViewed;
        booleanPreference.preferences.edit().putBoolean(booleanPreference.key, true).commit();
        paperMoneyDepositOnboardingPresenter.navigator.goTo(Back.INSTANCE);
    }

    public final boolean isLastPage(PaperMoneyDepositOnboardingEvent.Paged paged) {
        return paged.getPage() == this.tutorialBlockerInfo.pages.size() - 1;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1648936402);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Continuation continuation = null;
        if (changedInstance || rememberedValue == neverEqualPolicy) {
            rememberedValue = new GooglePayPresenter$models$1$1(this, continuation, 10);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            PaperCashDepositBlocker.TutorialCarousel tutorialCarousel = this.tutorialBlockerInfo;
            String str = tutorialCarousel.submit_button_text;
            str.getClass();
            rememberedValue2 = Updater.mutableStateOf$default(new PaperMoneyDepositOnboardingViewModel(str, tutorialCarousel.pages, 0));
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState = (MutableState) rememberedValue2;
        Updater.LaunchedEffect(gapComposer, flow, new VerifyCheckDepositPresenter$models$3$1(flow, continuation, (MoleculePresenter) this, mutableState, 22));
        PaperMoneyDepositOnboardingViewModel paperMoneyDepositOnboardingViewModel = (PaperMoneyDepositOnboardingViewModel) mutableState.getValue();
        gapComposer.end(false);
        return paperMoneyDepositOnboardingViewModel;
    }
}
