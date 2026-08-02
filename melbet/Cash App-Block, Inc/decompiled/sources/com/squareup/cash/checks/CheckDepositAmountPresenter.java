package com.squareup.cash.checks;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.checks.screens.CheckDepositAmountScreen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.TemporaryStorage$getDir$2;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.CheckDepositBlocker;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final class CheckDepositAmountPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final CheckDepositAmountScreen args;
    public final BlockerFlowListener blockerFlowAnalytics;
    public final BetterNavigator.ScreenNavigator navigator;

    public CheckDepositAmountPresenter(Analytics analytics, BlockerFlowListener blockerFlowListener, CheckDepositAmountScreen checkDepositAmountScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        checkDepositAmountScreen.getClass();
        this.analytics = analytics;
        this.blockerFlowAnalytics = blockerFlowListener;
        this.args = checkDepositAmountScreen;
        this.navigator = screenNavigator;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-148339221);
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Continuation continuation = null;
        if (changedInstance || rememberedValue == neverEqualPolicy) {
            rememberedValue = new TemporaryStorage$getDir$2(this, continuation, 18);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Updater.LaunchedEffect(gapComposer, this, (Function2) rememberedValue);
        Object rememberedValue2 = gapComposer.rememberedValue();
        CheckDepositAmountScreen checkDepositAmountScreen = this.args;
        if (rememberedValue2 == neverEqualPolicy) {
            CheckDepositBlocker.AmountEntryData amountEntryData = checkDepositAmountScreen.checkDepositBlocker.amount_entry_data;
            amountEntryData.getClass();
            Money money = amountEntryData.maximum_amount;
            money.getClass();
            rememberedValue2 = Boxes$$ExternalSyntheticOutline1.m(Moneys.wholeDigits(money), gapComposer);
        }
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue2;
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState = (MutableState) rememberedValue3;
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = Updater.derivedStateOf(new CaptureCheckFaceKt$$ExternalSyntheticLambda15(26, this, mutableState));
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        Updater.LaunchedEffect(gapComposer, flow, new VerifyCheckDepositPresenter$models$3$1(flow, continuation, (MoleculePresenter) this, mutableState, 10));
        CheckDepositBlocker checkDepositBlocker = checkDepositAmountScreen.checkDepositBlocker;
        CheckDepositBlocker.AmountEntryData amountEntryData2 = checkDepositBlocker.amount_entry_data;
        amountEntryData2.getClass();
        String str = amountEntryData2.title;
        str.getClass();
        CheckDepositBlocker.AmountEntryData amountEntryData3 = checkDepositBlocker.amount_entry_data;
        amountEntryData3.getClass();
        String str2 = amountEntryData3.subtitle;
        str2.getClass();
        CheckDepositBlocker.AmountEntryData amountEntryData4 = checkDepositBlocker.amount_entry_data;
        amountEntryData4.getClass();
        String str3 = amountEntryData4.primary_button_label;
        str3.getClass();
        CheckDepositAmountViewModel checkDepositAmountViewModel = new CheckDepositAmountViewModel(parcelableSnapshotMutableIntState.getIntValue(), str, str2, str3, ((Boolean) ((State) rememberedValue4).getValue()).booleanValue());
        gapComposer.end(false);
        return checkDepositAmountViewModel;
    }

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final DoubleCheck analytics;
        public final Provider blockerFlowAnalytics;

        public /* synthetic */ MetroFactory(Provider provider, DoubleCheck doubleCheck) {
            this.analytics = doubleCheck;
            this.blockerFlowAnalytics = provider;
        }

        public /* synthetic */ MetroFactory(Factory factory, DoubleCheck doubleCheck) {
            this.blockerFlowAnalytics = factory;
            this.analytics = doubleCheck;
        }
    }
}
