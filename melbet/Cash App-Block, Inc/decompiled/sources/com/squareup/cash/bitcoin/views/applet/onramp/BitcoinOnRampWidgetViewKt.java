package com.squareup.cash.bitcoin.views.applet.onramp;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.room.Room;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda2;
import com.squareup.cash.bitcoin.viewmodels.applet.onramp.BitcoinOnRampOptionType;
import com.squareup.cash.bitcoin.viewmodels.applet.onramp.BitcoinOnRampOptionViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.onramp.BitcoinOnRampWidgetViewModel;
import com.squareup.cash.bitcoin.views.map.BitcoinMapViewKt$$ExternalSyntheticLambda0;
import com.squareup.util.coroutines.TakeUntilKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public abstract class BitcoinOnRampWidgetViewKt {
    static {
        new BitcoinOnRampWidgetViewModel(CollectionsKt__CollectionsKt.listOf((Object[]) new BitcoinOnRampOptionViewModel[]{new BitcoinOnRampOptionViewModel(Icons.Passkey24, "Auto-withdraw to Bitkey", "Link your Bitkey with a secure one-time connection", BitcoinOnRampOptionType.AUTO_WITHDRAW, null), new BitcoinOnRampOptionViewModel(Icons.Location24, "Pay with bitcoin", "Find nearby businesses that accept bitcoin", BitcoinOnRampOptionType.PAY_WITH_BITCOIN, null), new BitcoinOnRampOptionViewModel(Icons.Wallet24, "Deposit Bitcoin", "Get your bitcoin address", BitcoinOnRampOptionType.WALLET_ADDRESS, null), new BitcoinOnRampOptionViewModel(Icons.CurrencyUsd24, "Pay in USD", "Use your Cash balance instead of bitcoin", BitcoinOnRampOptionType.PAY_IN_USD, "Off")}));
    }

    public static final void BitcoinOnRampWidgetView(BitcoinOnRampWidgetViewModel bitcoinOnRampWidgetViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        bitcoinOnRampWidgetViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-962408134);
        int i2 = i | (gapComposer.changed(bitcoinOnRampWidgetViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            TakeUntilKt.WidgetSectionView(Room.stringResource(gapComposer, R.string.bitcoin_views_ways_to_use_bitcoin), modifier, null, null, Expect_jvmKt.rememberComposableLambda(-881332076, new BankingDialogKt$$ExternalSyntheticLambda2(26, (Object) bitcoinOnRampWidgetViewModel, function1), gapComposer), gapComposer, ((i2 >> 3) & 112) | 196608, 28);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BitcoinMapViewKt$$ExternalSyntheticLambda0(modifier, (Object) bitcoinOnRampWidgetViewModel, function1, i, 10);
        }
    }
}
