package com.squareup.cash.formview.components.arcade;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.formview.components.FormElementViewBuilder$$ExternalSyntheticLambda2;
import com.squareup.protos.franklin.api.FormBlocker;

/* loaded from: classes6.dex */
public abstract class ArcadeFormSelectedInstrumentKt {
    public static final void ArcadeFormSelectedInstrument(FormBlocker.Element.SelectedInstrumentElement selectedInstrumentElement, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1519479377);
        int i2 = (gapComposer.changedInstance(selectedInstrumentElement) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-288416804, new FormElementViewBuilder$$ExternalSyntheticLambda2(selectedInstrumentElement, 1, (byte) 0), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FormElementViewBuilder$$ExternalSyntheticLambda2(selectedInstrumentElement, i);
        }
    }
}
