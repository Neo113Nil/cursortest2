package com.squareup.cash.phoneplans;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.overlays.OverlayKt$Overlay$1$1$1$1$1;
import com.squareup.cash.pdf.presenter.PdfPreviewPresenter$models$1$1;
import com.squareup.protos.cash.cashsubscriptions.api.v1_0.CashSubscriptionsAppService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final class PhonePlansNewLineLoadingPresenter implements MoleculePresenter {
    public static final /* synthetic */ int $r8$clinit = 0;
    public static final long DELAY_DEFAULT;
    public static final long POLL_INTERVAL_DEFAULT;
    public final PhonePlansNewLineLoadingBlockerScreen args;
    public final RealBlockersHelper blockersHelper;
    public final BetterNavigator.ScreenNavigator navigator;
    public final CashSubscriptionsAppService subscriptionsAppService;

    static {
        Duration.Companion companion = Duration.Companion;
        DurationUnit durationUnit = DurationUnit.SECONDS;
        DELAY_DEFAULT = DurationKt.toDuration(10, durationUnit);
        POLL_INTERVAL_DEFAULT = DurationKt.toDuration(3, durationUnit);
    }

    public PhonePlansNewLineLoadingPresenter(RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl, CashSubscriptionsAppService cashSubscriptionsAppService, PhonePlansNewLineLoadingBlockerScreen phonePlansNewLineLoadingBlockerScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        phonePlansNewLineLoadingBlockerScreen.getClass();
        this.subscriptionsAppService = cashSubscriptionsAppService;
        this.args = phonePlansNewLineLoadingBlockerScreen;
        this.navigator = screenNavigator;
        this.blockersHelper = realBlockersHelper$Factory$Impl.create(screenNavigator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1524086430);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Updater.LaunchedEffect(gapComposer, flow, new PdfPreviewPresenter$models$1$1(flow, (Continuation) (0 == true ? 1 : 0), (MoleculePresenter) this, 5));
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new PhonePlansNewLineLoadingPresenter$models$1$1(this, objArr == true ? 1 : 0, 1);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
        boolean changedInstance2 = gapComposer.changedInstance(this);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = new OverlayKt$Overlay$1$1$1$1$1(this, mutableState, objArr2 == true ? 1 : 0, 28);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue3);
        PhonePlansNewLineLoadingBlockerScreen phonePlansNewLineLoadingBlockerScreen = this.args;
        String str = phonePlansNewLineLoadingBlockerScreen.blocker.title;
        if (str == null) {
            str = "";
        }
        PhonePlansNewLineLoadingViewModel phonePlansNewLineLoadingViewModel = new PhonePlansNewLineLoadingViewModel(str, ((Boolean) mutableState.getValue()).booleanValue() ? phonePlansNewLineLoadingBlockerScreen.blocker.description : null, ((Boolean) mutableState.getValue()).booleanValue());
        gapComposer.end(false);
        return phonePlansNewLineLoadingViewModel;
    }
}
