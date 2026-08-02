package com.squareup.cash.arcade.components;

import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.views.internal.ProgressBarKt$$ExternalSyntheticLambda0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.compose.LottieAnimatable;
import com.airbnb.lottie.compose.LottieAnimatableKt;
import com.airbnb.lottie.compose.LottieAnimationKt;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.LottieDynamicProperties;
import com.airbnb.lottie.compose.LottieDynamicPropertiesKt;
import com.airbnb.lottie.compose.LottieDynamicProperty;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.squareup.cash.R;
import com.squareup.cash.aiedge.MLKitTitleGenerator$prepareModel$1;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.internal.UtilsKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.util.cash.Countries;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public abstract class ProgressCircularKt {
    public static final String[] AllKeyPaths = {"**"};
    public static final StaticProvidableCompositionLocal LocalCircularProgressColor = new StaticProvidableCompositionLocal(ProgressCircularKt$LocalCircularProgressColor$1.INSTANCE);

    public static final void ProgressCircular(int i, int i2, Composer composer, Modifier modifier) {
        Modifier modifier2;
        int i3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1865075057);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = i | (gapComposer.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            Modifier modifier3 = i4 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
            gapComposer.startReplaceGroup(-1335760408);
            long j = ((Color) gapComposer.consume(LocalCircularProgressColor)).value;
            if (j == 16) {
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors.semantic.icon.prominent;
            }
            long j2 = j;
            gapComposer.end(false);
            if (UtilsKt.isInScreenshotTest(gapComposer)) {
                gapComposer.startReplaceGroup(1541467013);
                ImageKt.Image(Countries.painterResource(2131233365, 0, gapComposer), null, CanvasKt.progressSemantics(modifier3), null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j2, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j2), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable | 48, 56);
                gapComposer = gapComposer;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1541707666);
                LottieCompositionResult rememberLottieComposition = RememberLottieCompositionKt.rememberLottieComposition(LottieCompositionSpec.RawRes.m1524boximpl(LottieCompositionSpec.RawRes.m1525constructorimpl(R.raw.progress_circular)), null, null, null, null, null, gapComposer, 0, 62);
                LottieAnimatable rememberLottieAnimatable = LottieAnimatableKt.rememberLottieAnimatable(gapComposer, 0);
                ColorFilter colorFilter = LottieProperty.COLOR_FILTER;
                boolean changed = gapComposer.changed(j2);
                Object rememberedValue = gapComposer.rememberedValue();
                Object obj = Composer.Companion.Empty;
                if (changed || rememberedValue == obj) {
                    rememberedValue = new PorterDuffColorFilter(ColorKt.m694toArgb8_81llA(j2), PorterDuff.Mode.SRC_IN);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                LottieDynamicProperties rememberLottieDynamicProperties = LottieDynamicPropertiesKt.rememberLottieDynamicProperties(new LottieDynamicProperty[]{LottieDynamicPropertiesKt.rememberLottieDynamicProperty((PorterDuffColorFilter) colorFilter, (PorterDuffColorFilter) rememberedValue, (String[]) Arrays.copyOf(AllKeyPaths, 1), (Composer) gapComposer, 6)}, gapComposer, LottieDynamicProperty.$stable);
                LottieComposition lottieComposition = (LottieComposition) rememberLottieComposition.getValue();
                boolean changed2 = gapComposer.changed(rememberLottieComposition) | gapComposer.changed(rememberLottieAnimatable);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changed2 || rememberedValue2 == obj) {
                    rememberedValue2 = new MLKitTitleGenerator$prepareModel$1(rememberLottieComposition, rememberLottieAnimatable, null, 14);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                int i5 = LottieDynamicProperties.$stable;
                Updater.LaunchedEffect(lottieComposition, rememberLottieDynamicProperties, (Function2) rememberedValue2, gapComposer);
                LottieComposition composition = rememberLottieAnimatable.getComposition();
                Modifier progressSemantics = CanvasKt.progressSemantics(modifier3);
                boolean changed3 = gapComposer.changed(rememberLottieAnimatable);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (changed3 || rememberedValue3 == obj) {
                    rememberedValue3 = new CheckboxKt$$ExternalSyntheticLambda5(rememberLottieAnimatable, 2);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                LottieAnimationKt.LottieAnimation(composition, (Function0) rememberedValue3, progressSemantics, false, false, false, false, null, false, rememberLottieDynamicProperties, null, null, false, false, null, null, false, gapComposer, i5 << 27, 0, 130552);
                gapComposer = gapComposer;
                gapComposer.end(false);
            }
            modifier2 = modifier3;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ProgressBarKt$$ExternalSyntheticLambda0(modifier2, i, i2, 2, (byte) 0);
        }
    }
}
