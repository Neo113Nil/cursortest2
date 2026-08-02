package com.squareup.cash.formview.components.arcade;

import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.db2.SyncDetailsQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.formview.components.FormElementViewBuilder$$ExternalSyntheticLambda16;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.history.views.ErrorView$$ExternalSyntheticLambda1;
import com.squareup.protos.cash.ui.Animation;
import com.squareup.protos.franklin.api.FormBlocker;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public abstract class ArcadeFormHeroKt {
    public static final void ArcadeFormHero(FormBlocker.Element.HeroElement heroElement, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1281912222);
        int i2 = (gapComposer.changedInstance(heroElement) ? 4 : 2) | i | 48;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1744201865, new FormElementViewBuilder$$ExternalSyntheticLambda16(heroElement, 1), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ErrorView$$ExternalSyntheticLambda1(heroElement, modifier, i, 6);
        }
    }

    public static final void LottieAnimation(Animation animation, Modifier modifier, Composer composer, int i) {
        String str;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1734633407);
        int i2 = (gapComposer.changedInstance(animation) ? 4 : 2) | i | (gapComposer.changed(modifier) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            if (colors.isLight) {
                str = animation.light_url;
                str.getClass();
            } else {
                str = animation.dark_url;
                if (str == null) {
                    str = animation.light_url;
                    str.getClass();
                }
            }
            Float f = animation.aspect_ratio;
            Modifier modifier2 = Modifier.Companion.$$INSTANCE;
            Modifier aspectRatio = f != null ? OffsetKt.aspectRatio(1.0f / f.floatValue(), modifier2, false) : null;
            if (aspectRatio != null) {
                modifier2 = aspectRatio;
            }
            Modifier then = modifier.then(modifier2);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (rememberedValue == obj) {
                rememberedValue = new GpsConfigQueries$$ExternalSyntheticLambda1(10);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function1 function1 = (Function1) rememberedValue;
            boolean changed = gapComposer.changed(str);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed || rememberedValue2 == obj) {
                rememberedValue2 = new SyncDetailsQueries$$ExternalSyntheticLambda2(str, 27);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            AndroidView_androidKt.AndroidView(function1, then, (Function1) rememberedValue2, gapComposer, 6, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ErrorView$$ExternalSyntheticLambda1(animation, modifier, i, 7);
        }
    }
}
