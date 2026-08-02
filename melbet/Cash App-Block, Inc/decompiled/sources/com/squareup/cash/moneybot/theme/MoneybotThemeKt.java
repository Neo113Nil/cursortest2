package com.squareup.cash.moneybot.theme;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda6;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda8;
import com.squareup.cash.overlays.FakeOverlayLayerKt$$ExternalSyntheticLambda0;

/* loaded from: classes6.dex */
public abstract class MoneybotThemeKt {
    public static final StaticProvidableCompositionLocal LocalMoneybotColors = new StaticProvidableCompositionLocal(new MoneyTabUIKt$$ExternalSyntheticLambda6(16));

    public static final void MoneybotTheme(Colors colors, MoneybotColors moneybotColors, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        Colors colors2;
        MoneybotColors moneybotColors2;
        Colors colors3;
        MoneybotColors fromArcade;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2086239756);
        int i3 = i | 2 | (((i2 & 2) == 0 && gapComposer.changed(moneybotColors)) ? 32 : 16);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                if ((i2 & 2) != 0) {
                    colors3 = colors;
                    fromArcade = MoneybotColorsKt.fromArcade(colors);
                    gapComposer.endDefaults();
                    ArcadeThemeKt.ArcadeTheme(colors3, null, null, Expect_jvmKt.rememberComposableLambda(-16742569, new FakeOverlayLayerKt$$ExternalSyntheticLambda0(fromArcade, composableLambdaImpl), gapComposer), gapComposer, 3072, 6);
                    moneybotColors2 = fromArcade;
                    colors2 = colors3;
                }
            } else {
                gapComposer.skipToGroupEnd();
            }
            colors3 = colors;
            fromArcade = moneybotColors;
            gapComposer.endDefaults();
            ArcadeThemeKt.ArcadeTheme(colors3, null, null, Expect_jvmKt.rememberComposableLambda(-16742569, new FakeOverlayLayerKt$$ExternalSyntheticLambda0(fromArcade, composableLambdaImpl), gapComposer), gapComposer, 3072, 6);
            moneybotColors2 = fromArcade;
            colors2 = colors3;
        } else {
            gapComposer.skipToGroupEnd();
            colors2 = colors;
            moneybotColors2 = moneybotColors;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda8(colors2, moneybotColors2, composableLambdaImpl, i, i2, 11);
        }
    }
}
