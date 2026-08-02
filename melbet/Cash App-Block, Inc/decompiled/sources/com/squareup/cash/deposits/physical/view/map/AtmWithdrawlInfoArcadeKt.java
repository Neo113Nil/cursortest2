package com.squareup.cash.deposits.physical.view.map;

import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import com.squareup.cash.R;
import com.squareup.cash.account.components.ProfilePreviewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.arcade.components.list.ListUnorderedKt;
import com.squareup.cash.arcade.components.list.ListUnorderedProminence;
import com.squareup.cash.arcade.components.list.ListUnorderedSize;
import com.squareup.cash.arcade.components.list.ListUnorderedState;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.benefits.views.BenefitsExplanationViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.data.db.RealAppConfigManager$$ExternalSyntheticLambda6;
import com.squareup.cash.data.db.RealAppConfigManager$$ExternalSyntheticLambda7;
import com.squareup.cash.deposits.physical.viewmodels.map.AtmExplainerViewModel;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda1;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public abstract class AtmWithdrawlInfoArcadeKt {

    /* renamed from: lambda$-1765515913, reason: not valid java name */
    public static final ComposableLambdaImpl f369lambda$1765515913 = new ComposableLambdaImpl(new RealAppConfigManager$$ExternalSyntheticLambda6(28), false, -1765515913);
    public static final ComposableLambdaImpl lambda$1977085074 = new ComposableLambdaImpl(new RealAppConfigManager$$ExternalSyntheticLambda7(22), false, 1977085074);

    public static final void AtmExplainerBenefits(AtmExplainerViewModel atmExplainerViewModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(550488854);
        int i2 = (gapComposer.changedInstance(atmExplainerViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ListUnorderedKt.ListUnordered((Modifier) null, (ListUnorderedState) null, (ListUnorderedProminence) null, (ListUnorderedSize) null, RecyclerView.DECELERATION_RATE, Expect_jvmKt.rememberComposableLambda(-848338000, new AtmWithdrawlInfoArcadeKt$$ExternalSyntheticLambda3(atmExplainerViewModel, function1), gapComposer), gapComposer, 196608, 31);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AtmWithdrawlInfoArcadeKt$$ExternalSyntheticLambda0(atmExplainerViewModel, function1, i);
        }
    }

    public static final void AtmExplainerLimits(ArrayList arrayList, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1902859181);
        int i2 = (gapComposer.changedInstance(arrayList) ? 4 : 2) | i;
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ViewfinderDefaults.SectionHeader(Room.stringResource(gapComposer, R.string.explainer_limits), (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer, 0, 30);
            ListUnorderedKt.ListUnordered(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), (ListUnorderedState) null, (ListUnorderedProminence) null, (ListUnorderedSize) null, RecyclerView.DECELERATION_RATE, Expect_jvmKt.rememberComposableLambda(1060253049, new ProfilePreviewKt$$ExternalSyntheticLambda3(i3, arrayList), gapComposer), gapComposer, 196614, 30);
            gapComposer = gapComposer;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BenefitsExplanationViewKt$$ExternalSyntheticLambda5(arrayList, i, i3);
        }
    }

    public static final void AtmWithdrawalInfoArcade(AtmExplainerViewModel atmExplainerViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        atmExplainerViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1463307861);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(atmExplainerViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1094579520, new AtmWithdrawlInfoArcadeKt$$ExternalSyntheticLambda0(function1, atmExplainerViewModel), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda1(atmExplainerViewModel, function1, i, 6);
        }
    }
}
