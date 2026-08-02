package com.squareup.cash.genericelements.components.base;

import android.content.Context;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda0;
import com.squareup.cash.family.safetyhub.views.SafetyHubViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.genericelements.viewmodels.IconViewModel;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.theming.ThemablesKt;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class GenericProgressMeterKt {
    public static final void GenericProgressMeter(IconViewModel.ProgressMeterViewModel progressMeterViewModel, Modifier modifier, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        progressMeterViewModel.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1812563230);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(progressMeterViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(modifier) ? 32 : 16;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Integer forTheme = ThemablesKt.forTheme(progressMeterViewModel.color, ThemeHelpersKt.themeInfo((Context) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalContext)));
            forTheme.getClass();
            gapComposer = gapComposer2;
            VisibleKt.m3497ProgressMeterUV7SVM(progressMeterViewModel.progress, ColorKt.Color(forTheme.intValue()), 6.0f, SizeKt.m285size3ABfNKs(modifier, progressMeterViewModel.size.value), 0L, RecyclerView.DECELERATION_RATE, ColorKt.Color(-6710887), null, null, null, null, null, Expect_jvmKt.rememberComposableLambda(782179507, new ArcadeModal2Kt$$ExternalSyntheticLambda0(29, modifier, progressMeterViewModel), gapComposer2), gapComposer, 1573248, MLKEMEngine.KyberPolyBytes, 4016);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SafetyHubViewKt$$ExternalSyntheticLambda0(progressMeterViewModel, modifier, i, 23);
        }
    }
}
