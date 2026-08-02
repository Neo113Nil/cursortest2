package com.squareup.cash.bitcoin.views.applet.boost;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda5;
import com.squareup.cash.bitcoin.viewmodels.applet.boost.BitcoinBoostWidgetViewModel;
import com.squareup.cash.bitcoin.views.map.BitcoinMapViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.common.composeui.widgets.LinkStyle;
import com.squareup.cash.investingcrypto.viewmodels.ColoredLearnMoreConfigurationModel;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.coroutines.FirstOrNullOnTimeoutKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public abstract class BitcoinBoostWidgetViewKt {
    static {
        new BitcoinBoostWidgetViewModel(new Image("fake:///boost-upsell-light.jpeg", "fake:///boost-upsell-dark.jpeg", 4), null, "Spend cash, earn bitcoin", "Get a Cash App Card to earn bitcoin or turn part of your paycheck into bitcoin.", "Order your Cash App Card", "https://cash.app/bitcoin/boost", ColoredLearnMoreConfigurationModel.LinkStyle.TEXT_BUTTON);
    }

    public static final void BitcoinBoostWidgetView(BitcoinBoostWidgetViewModel bitcoinBoostWidgetViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        LinkStyle linkStyle;
        bitcoinBoostWidgetViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1050614388);
        int i2 = i | (gapComposer.changedInstance(bitcoinBoostWidgetViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Image image = bitcoinBoostWidgetViewModel.image;
            String str = bitcoinBoostWidgetViewModel.titleText;
            String str2 = bitcoinBoostWidgetViewModel.bodyText;
            String str3 = bitcoinBoostWidgetViewModel.linkText;
            int ordinal = bitcoinBoostWidgetViewModel.linkStyle.ordinal();
            if (ordinal == 0) {
                linkStyle = LinkStyle.STANDARD;
            } else {
                if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                linkStyle = LinkStyle.SUBTLE;
            }
            boolean changedInstance = gapComposer.changedInstance(bitcoinBoostWidgetViewModel) | ((i2 & 112) == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BankingDialogKt$$ExternalSyntheticLambda5(29, function1, bitcoinBoostWidgetViewModel);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            FirstOrNullOnTimeoutKt.UpsellWidget(image, str, str2, str3, (Function0) rememberedValue, modifier, linkStyle, gapComposer, (i2 << 9) & 458752);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BitcoinMapViewKt$$ExternalSyntheticLambda0(modifier, (Object) bitcoinBoostWidgetViewModel, function1, i, 1);
        }
    }
}
