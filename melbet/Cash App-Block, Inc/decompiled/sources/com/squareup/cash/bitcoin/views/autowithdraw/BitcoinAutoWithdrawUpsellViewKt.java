package com.squareup.cash.bitcoin.views.autowithdraw;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.bitcoin.viewmodels.autowithdraw.BitcoinAutoWithdrawUpsellViewModel;
import com.squareup.cash.bitcoin.views.BitcoinUiFactory$$ExternalSyntheticLambda12;
import com.squareup.cash.blockers.presenters.CheckmarkPresenter$$ExternalSyntheticLambda0;
import com.squareup.cash.checks.ConfirmBackOfCheckKt$$ExternalSyntheticLambda6;
import com.squareup.cash.deposits.physical.view.address.AddressSearchKt$$ExternalSyntheticLambda4;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda6;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public abstract class BitcoinAutoWithdrawUpsellViewKt {

    /* renamed from: lambda$-1972412560, reason: not valid java name */
    public static final ComposableLambdaImpl f257lambda$1972412560 = new ComposableLambdaImpl(new AvatarsKt$$ExternalSyntheticLambda0(22), false, -1972412560);

    /* renamed from: lambda$-151156647, reason: not valid java name */
    public static final ComposableLambdaImpl f256lambda$151156647 = new ComposableLambdaImpl(new AvatarsKt$$ExternalSyntheticLambda0(23), false, -151156647);

    public static final void BitcoinAutoWithdrawUpsellView(BitcoinAutoWithdrawUpsellViewModel bitcoinAutoWithdrawUpsellViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        bitcoinAutoWithdrawUpsellViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2019346728);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(bitcoinAutoWithdrawUpsellViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 16;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1558449277, new BitcoinUiFactory$$ExternalSyntheticLambda12(i3, (Object) bitcoinAutoWithdrawUpsellViewModel, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CheckmarkPresenter$$ExternalSyntheticLambda0(bitcoinAutoWithdrawUpsellViewModel, function1, i, 7);
        }
    }

    public static final void InfoCell(Icons icons, String str, String str2, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(118440382);
        int i2 = i | (gapComposer.changed(str) ? 32 : 16) | (gapComposer.changed(str2) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(Expect_jvmKt.rememberComposableLambda(-509120368, new InfoSectionKt$$ExternalSyntheticLambda6(icons, 9), gapComposer), Expect_jvmKt.rememberComposableLambda(438046575, new ConfirmBackOfCheckKt$$ExternalSyntheticLambda6(str, 5), gapComposer), null, null, false, false, Expect_jvmKt.rememberComposableLambda(1826080937, new ConfirmBackOfCheckKt$$ExternalSyntheticLambda6(str2, 6), gapComposer), null, null, 0L, gapComposer, 12582966, 3964);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AddressSearchKt$$ExternalSyntheticLambda4(icons, str, str2, i, 1);
        }
    }
}
