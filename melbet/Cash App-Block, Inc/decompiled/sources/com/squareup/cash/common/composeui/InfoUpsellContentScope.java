package com.squareup.cash.common.composeui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.booklet.ui.BookletGridKt$$ExternalSyntheticLambda2;
import com.squareup.cash.checks.ConfirmBackOfCheckKt$$ExternalSyntheticLambda6;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda6;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public final class InfoUpsellContentScope {
    public final void InfoCell(Icons icons, String str, String str2, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        str.getClass();
        str2.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(264320837);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(icons.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(str) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(str2) ? 256 : 128;
        }
        int i3 = i2 | 27648;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            gapComposer = gapComposer2;
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(Expect_jvmKt.rememberComposableLambda(1161276979, new InfoSectionKt$$ExternalSyntheticLambda6(icons, 15), gapComposer2), Expect_jvmKt.rememberComposableLambda(1740043124, new ConfirmBackOfCheckKt$$ExternalSyntheticLambda6(str, 24), gapComposer2), null, null, false, false, Expect_jvmKt.rememberComposableLambda(917672698, new ConfirmBackOfCheckKt$$ExternalSyntheticLambda6(str2, 25), gapComposer2), null, null, 0L, gapComposer, (i3 & 7168) | 12582966 | ((i3 << 15) & 1879048192), 3444);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BookletGridKt$$ExternalSyntheticLambda2(this, icons, str, str2, i);
        }
    }
}
