package com.squareup.cash.common.composeui;

import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import coil3.size.DimensionKt;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda6;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda8;

/* loaded from: classes6.dex */
public final class InfoUpsellCtaButtonScope {
    public ScrollState contentScrollState;
    public ParcelableSnapshotMutableState prominentButton;

    public final void ShowCtaButton$compose_ui(ScrollState scrollState, Composer composer, int i) {
        scrollState.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1421235988);
        int i2 = (gapComposer.changed(scrollState) ? 4 : 2) | i | (gapComposer.changed(this) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            this.contentScrollState = scrollState;
            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(1556255598, new CheckDepositAmountKt$$ExternalSyntheticLambda8(this, 26), gapComposer), gapComposer, 24576, 15);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CaptureCheckFaceKt$$ExternalSyntheticLambda6(this, scrollState, i, 27);
        }
    }
}
