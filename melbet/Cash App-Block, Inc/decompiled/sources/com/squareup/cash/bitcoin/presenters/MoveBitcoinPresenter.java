package com.squareup.cash.bitcoin.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.graphics.AndroidTileMode_androidKt;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.squareup.cash.biometrics.AndroidSecureStore$read$2;
import com.squareup.cash.bitcoin.navigation.RealBitcoinInboundNavigator;
import com.squareup.cash.bitcoin.navigation.RealBitcoinInboundNavigator$Factory$Impl;
import com.squareup.cash.bitcoin.screens.MoveBitcoinScreen;
import com.squareup.cash.bitcoin.viewmodels.BitcoinKeypadError$MaxLimitError;
import com.squareup.cash.bitcoin.viewmodels.BitcoinKeypadModel;
import com.squareup.cash.bitcoin.viewmodels.MoveBitcoinModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$BitcoinEnableShowRestrictedBalance;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$BitcoinSendMaxAmountButton;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.protos.common.Money;
import com.squareup.util.compose.SharedViewEventsKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* loaded from: classes5.dex */
public final class MoveBitcoinPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final MoveBitcoinScreen args;
    public final RealBitcoinInboundNavigator bitcoinInboundNavigator;
    public final RealBitcoinKeypadPresenter keypadPresenter;
    public final RealBitcoinKeypadStateStore$Factory$Impl keypadStateStoreFactory;
    public final BetterNavigator.ScreenNavigator navigator;
    public final boolean showMaxButton;
    public final boolean useRestrictedBalance;

    public final class State implements BitcoinKeypadStateStore$SharedState {
        public final BitcoinKeypadStateStore$State bitcoinKeypadState;

        public State(BitcoinKeypadStateStore$State bitcoinKeypadStateStore$State) {
            this.bitcoinKeypadState = bitcoinKeypadStateStore$State;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof State) && this.bitcoinKeypadState.equals(((State) obj).bitcoinKeypadState);
        }

        @Override // com.squareup.cash.bitcoin.presenters.BitcoinKeypadStateStore$SharedState
        public final BitcoinKeypadStateStore$State getBitcoinKeypadState() {
            return this.bitcoinKeypadState;
        }

        public final int hashCode() {
            return this.bitcoinKeypadState.hashCode();
        }

        public final String toString() {
            return "State(bitcoinKeypadState=" + this.bitcoinKeypadState + ")";
        }
    }

    public MoveBitcoinPresenter(RealBitcoinKeypadStateStore$Factory$Impl realBitcoinKeypadStateStore$Factory$Impl, RealBitcoinKeypadPresenter realBitcoinKeypadPresenter, RealBitcoinInboundNavigator$Factory$Impl realBitcoinInboundNavigator$Factory$Impl, Analytics analytics, FeatureFlagManager featureFlagManager, MoveBitcoinScreen moveBitcoinScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        moveBitcoinScreen.getClass();
        this.keypadStateStoreFactory = realBitcoinKeypadStateStore$Factory$Impl;
        this.keypadPresenter = realBitcoinKeypadPresenter;
        this.analytics = analytics;
        this.args = moveBitcoinScreen;
        this.navigator = screenNavigator;
        this.bitcoinInboundNavigator = realBitcoinInboundNavigator$Factory$Impl.create(screenNavigator);
        RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) featureFlagManager;
        this.useRestrictedBalance = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) realFeatureFlagManager.peekCurrentValue(LaunchDarklyFeatureFlags$BitcoinEnableShowRestrictedBalance.INSTANCE)).enabled();
        this.showMaxButton = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) realFeatureFlagManager.peekCurrentValue(LaunchDarklyFeatureFlags$BitcoinSendMaxAmountButton.INSTANCE)).enabled();
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        Object content;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1176959669);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = this.keypadStateStoreFactory.create$1(this.navigator);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        RealBitcoinKeypadStateStore realBitcoinKeypadStateStore = (RealBitcoinKeypadStateStore) rememberedValue;
        MutableSharedFlow rememberSharedViewEvents = SharedViewEventsKt.rememberSharedViewEvents(gapComposer);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = Updater.mutableStateOf$default(new State(new BitcoinKeypadStateStore$State(null, null, null, null, null, null, this.useRestrictedBalance, 3071)));
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState = (MutableState) rememberedValue2;
        gapComposer.startReplaceGroup(1481856843);
        State state = (State) mutableState.getValue();
        BitcoinKeypadStateStore$State models = realBitcoinKeypadStateStore.models((State) mutableState.getValue(), rememberSharedViewEvents, gapComposer);
        state.getClass();
        models.getClass();
        mutableState.setValue(new State(models));
        gapComposer.end(false);
        Updater.LaunchedEffect(gapComposer, flow, new AndroidSecureStore$read$2(flow, (Continuation) null, rememberSharedViewEvents, this, mutableState, 9));
        BitcoinKeypadStateStore$State bitcoinKeypadStateStore$State = ((State) mutableState.getValue()).bitcoinKeypadState;
        if (bitcoinKeypadStateStore$State.isReady()) {
            Money money = bitcoinKeypadStateStore$State.availableBalance;
            money.getClass();
            Long l = money.amount;
            l.getClass();
            boolean z = l.longValue() > 0;
            BitcoinKeypadModel buildViewModel = this.keypadPresenter.buildViewModel(bitcoinKeypadStateStore$State);
            AndroidTileMode_androidKt androidTileMode_androidKt = buildViewModel.error;
            if ((androidTileMode_androidKt instanceof BitcoinKeypadError$MaxLimitError) && ((BitcoinKeypadError$MaxLimitError) androidTileMode_androidKt).message == null) {
                buildViewModel = BitcoinKeypadModel.copy$default(buildViewModel, null, null, 31);
            }
            content = new MoveBitcoinModel.Content(z, buildViewModel, this.showMaxButton);
        } else {
            content = MoveBitcoinModel.Loading.INSTANCE;
        }
        gapComposer.end(false);
        return content;
    }
}
