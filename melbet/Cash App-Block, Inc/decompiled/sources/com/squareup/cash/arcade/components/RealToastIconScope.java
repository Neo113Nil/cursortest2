package com.squareup.cash.arcade.components;

import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.tracing.Trace;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public final class RealToastIconScope {
    public static final RealToastIconScope INSTANCE = new RealToastIconScope();

    public final void Icon(Icons icons, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        icons.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(801048418);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(icons.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed((Object) null) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Trace.m1191Iconww6aTOc(icons, (String) null, SpacerKt.m298padding3ABfNKs(companion, 8.0f), 0L, gapComposer, (i3 & 14) | ((i3 >> 3) & 112), 8);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CopyCodeKt$$ExternalSyntheticLambda10(i, 13, modifier2, this, icons);
        }
    }
}
