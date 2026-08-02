package com.squareup.cash.bitcoin.views.applet.welcome;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import com.squareup.cash.bitcoin.viewmodels.welcome.BitcoinWelcomeViewModel;
import com.squareup.cash.blockers.presenters.CheckmarkPresenter$$ExternalSyntheticLambda0;
import com.squareup.util.cash.Countries;
import com.squareup.util.compose.TransitionsKt;

/* loaded from: classes5.dex */
public abstract class BitcoinWelcomeWidgetViewKt {
    static {
        new BitcoinWelcomeViewModel("Buy bitcoin for as little as $1", "Whether you're an expert or just getting started");
    }

    public static final void BitcoinWelcomeWidgetView(BitcoinWelcomeViewModel bitcoinWelcomeViewModel, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        bitcoinWelcomeViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-111131067);
        int i2 = (gapComposer.changed(bitcoinWelcomeViewModel) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            modifier2 = modifier;
            TransitionsKt.NullStateWidgetView(Countries.painterResource(2131231128, 0, gapComposer), bitcoinWelcomeViewModel.title, modifier2, SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), bitcoinWelcomeViewModel.subTitle, gapComposer, Painter.$stable | 3072 | ((i2 << 3) & 896), 0);
        } else {
            modifier2 = modifier;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CheckmarkPresenter$$ExternalSyntheticLambda0(bitcoinWelcomeViewModel, modifier2, i, 6);
        }
    }
}
