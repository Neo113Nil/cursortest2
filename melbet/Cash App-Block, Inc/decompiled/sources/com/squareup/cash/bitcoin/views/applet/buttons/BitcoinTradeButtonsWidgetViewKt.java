package com.squareup.cash.bitcoin.views.applet.buttons;

import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.RulerKt;
import app.cash.local.views.internal.DismissableToastKt$$ExternalSyntheticLambda4;
import coil3.size.SizeKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabx;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda1;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda2;
import com.squareup.cash.benefits.views.BenefitsHomeViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.bitcoin.viewmodels.applet.buttons.BitcoinTradeButtonDisplayType;
import com.squareup.cash.bitcoin.viewmodels.applet.buttons.BitcoinTradeButtonViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.buttons.BitcoinTradeButtonsWidgetViewEvent;
import com.squareup.cash.bitcoin.viewmodels.applet.buttons.BitcoinTradeButtonsWidgetViewModel;
import com.squareup.cash.bitcoin.views.map.BitcoinMapViewKt$$ExternalSyntheticLambda0;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public abstract class BitcoinTradeButtonsWidgetViewKt {
    static {
        BitcoinTradeButtonDisplayType.Text text = new BitcoinTradeButtonDisplayType.Text("Buy");
        BitcoinTradeButtonsWidgetViewEvent.Buy buy = BitcoinTradeButtonsWidgetViewEvent.Buy.INSTANCE;
        new BitcoinTradeButtonsWidgetViewModel(CollectionsKt__CollectionsJVMKt.listOf(new BitcoinTradeButtonViewModel(text, buy)));
        new BitcoinTradeButtonsWidgetViewModel(CollectionsKt__CollectionsKt.listOf((Object[]) new BitcoinTradeButtonViewModel[]{new BitcoinTradeButtonViewModel(new BitcoinTradeButtonDisplayType.Text("Buy"), buy), new BitcoinTradeButtonViewModel(new BitcoinTradeButtonDisplayType.Text("Sell"), BitcoinTradeButtonsWidgetViewEvent.Sell.INSTANCE), new BitcoinTradeButtonViewModel(new BitcoinTradeButtonDisplayType.Drawable("Send or receive"), BitcoinTradeButtonsWidgetViewEvent.Transfer.INSTANCE)}));
    }

    public static final void BitcoinTradeButtonsWidgetView(BitcoinTradeButtonsWidgetViewModel bitcoinTradeButtonsWidgetViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        bitcoinTradeButtonsWidgetViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-201433562);
        int i2 = (gapComposer.changed(bitcoinTradeButtonsWidgetViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            zzabx.ButtonDefaultGroupHorizontal(OffsetKt.height(modifier, IntrinsicSize.Min), Expect_jvmKt.rememberComposableLambda(2026088600, new BankingDialogKt$$ExternalSyntheticLambda2(24, (Object) bitcoinTradeButtonsWidgetViewModel, function1), gapComposer), gapComposer, 48, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BitcoinMapViewKt$$ExternalSyntheticLambda0(modifier, (Object) bitcoinTradeButtonsWidgetViewModel, function1, i, 2);
        }
    }

    public static final void TextButton(String str, Function0 function0, Function1 function1, Modifier modifier, Composer composer, int i) {
        Function1 function12;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1785213275);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changedInstance(function0) ? 32 : 16) | (gapComposer.changed(modifier) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                function12 = function1;
                rememberedValue = new AvatarsKt$$ExternalSyntheticLambda1(12, function12);
                gapComposer.updateRememberedValue(rememberedValue);
            } else {
                function12 = function1;
            }
            SizeKt.Button(function0, RulerKt.onSizeChanged(modifier, (Function1) rememberedValue), buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(196208088, new BenefitsHomeViewKt$$ExternalSyntheticLambda5(str, 13), gapComposer), gapComposer, ((i2 >> 3) & 14) | 1573248, 56);
        } else {
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DismissableToastKt$$ExternalSyntheticLambda4(str, function0, function12, modifier, i, 29);
        }
    }
}
