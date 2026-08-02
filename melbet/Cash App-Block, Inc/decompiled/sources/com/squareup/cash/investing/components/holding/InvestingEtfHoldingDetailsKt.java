package com.squareup.cash.investing.components.holding;

import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.list.ListUnorderedKt;
import com.squareup.cash.arcade.components.list.ListUnorderedProminence;
import com.squareup.cash.arcade.components.list.ListUnorderedSize;
import com.squareup.cash.arcade.components.list.ListUnorderedState;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.investing.viewmodels.holdings.InvestingEtfHoldingDetailsViewModel;
import com.squareup.cash.invitations.InviteContactsBodyKt$$ExternalSyntheticLambda18;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda0;
import com.squareup.cash.money.views.MoneyTabToolbarKt$$ExternalSyntheticLambda1;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.work.views.timecard.TimecardDetailViewKt$$ExternalSyntheticLambda12;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class InvestingEtfHoldingDetailsKt {
    public static final ComposableLambdaImpl lambda$836111566 = new ComposableLambdaImpl(new CashMapViewKt$$ExternalSyntheticLambda1(17), false, 836111566);
    public static final ComposableLambdaImpl lambda$1471874053 = new ComposableLambdaImpl(new CashMapViewKt$$ExternalSyntheticLambda1(18), false, 1471874053);

    public static final void InvestmentEtfHoldingDetails(RealImageLoader realImageLoader, InvestingEtfHoldingDetailsViewModel investingEtfHoldingDetailsViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        realImageLoader.getClass();
        investingEtfHoldingDetailsViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-463649857);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(realImageLoader) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(investingEtfHoldingDetailsViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (!(investingEtfHoldingDetailsViewModel instanceof InvestingEtfHoldingDetailsViewModel.Content)) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new InviteContactsBodyKt$$ExternalSyntheticLambda18(realImageLoader, investingEtfHoldingDetailsViewModel, function1, i);
                    return;
                }
                return;
            }
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(595581055, new HypeWelcomeUIKt$$ExternalSyntheticLambda0(investingEtfHoldingDetailsViewModel, function1), gapComposer), gapComposer, 56);
            modifier = Modifier.Companion.$$INSTANCE;
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.block = new MusicViewKt$$ExternalSyntheticLambda2(i, 18, realImageLoader, investingEtfHoldingDetailsViewModel, function1, modifier2, false);
        }
    }

    public static final void TimestampColumn(String str, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1704301920);
        int i2 = (gapComposer.changed(str) ? 32 : 16) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            composableLambdaImpl.invoke(ColumnScopeInstance.INSTANCE, (Object) gapComposer, (Object) 54);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            ListUnorderedKt.ListUnordered(SpacerKt.m300paddingVpY3zN4$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, 16.0f, 1), (ListUnorderedState) null, (ListUnorderedProminence) null, (ListUnorderedSize) null, RecyclerView.DECELERATION_RATE, Expect_jvmKt.rememberComposableLambda(-699927558, new MoneyTabToolbarKt$$ExternalSyntheticLambda1(str, 4), gapComposer), gapComposer, 196608, 30);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TimecardDetailViewKt$$ExternalSyntheticLambda12(str, composableLambdaImpl, i, 1);
        }
    }
}
