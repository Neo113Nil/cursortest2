package com.squareup.cash.mooncake.compose_ui;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.material.RippleConfiguration;
import androidx.compose.material.RippleKt;
import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.tracing.Trace;
import app.cash.broadway.ui.compose.UiScopeKt$$ExternalSyntheticLambda1;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.ColorsDarkKt;
import com.squareup.cash.arcade.ColorsLightKt;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.button.ButtonCtaGroupKt$$ExternalSyntheticLambda4;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.db.StorageLinkQueries$$ExternalSyntheticLambda8;
import com.squareup.cash.mooncake.themes.HasThemeInfo;
import com.squareup.cash.mooncake.themes.Theme;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.cash.util.money.Moneys$$ExternalSyntheticLambda0;
import com.squareup.util.Strings;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes.dex */
public abstract class ComposeMooncakeThemeKt {
    public static final StaticProvidableCompositionLocal LocalTextColor = new StaticProvidableCompositionLocal(ComposeMooncakeThemeKt$LocalTextColor$1.INSTANCE);
    public static final DynamicProvidableCompositionLocal LocalTextStyle = new DynamicProvidableCompositionLocal(new Moneys$$ExternalSyntheticLambda0(15));

    public static final void MooncakeTheme(ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        ComposableLambdaImpl composableLambdaImpl2;
        Context wrapWithTheme;
        ComposeColorPalette composeColorPalette;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1275827397);
        int i2 = 2;
        if (gapComposer.shouldExecute(i & 1, (i & 3) != 2)) {
            ProvidableCompositionLocal providableCompositionLocal = AndroidCompositionLocals_androidKt.LocalContext;
            ThemeInfo currentTheme = currentTheme((Context) gapComposer.consume(providableCompositionLocal));
            boolean booleanValue = ((Boolean) gapComposer.consume(ComposeColorPaletteKt.LocalColorPaletteProvided)).booleanValue();
            Object obj = Composer.Companion.Empty;
            if (booleanValue) {
                gapComposer.startReplaceGroup(-2008145439);
                wrapWithTheme = (Context) gapComposer.consume(providableCompositionLocal);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-2008101047);
                Context context = (Context) gapComposer.consume(providableCompositionLocal);
                boolean changedInstance = gapComposer.changedInstance(currentTheme);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == obj) {
                    rememberedValue = new StorageLinkQueries$$ExternalSyntheticLambda8(currentTheme, 26);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                wrapWithTheme = ThemeHelpersKt.wrapWithTheme(context, (Function1) rememberedValue);
                gapComposer.end(false);
            }
            if (booleanValue) {
                gapComposer.startReplaceGroup(-2007993446);
                Object consume = gapComposer.consume(ComposeColorPaletteKt.LocalColorPalette);
                consume.getClass();
                composeColorPalette = (ComposeColorPalette) consume;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-2007942823);
                boolean changed = gapComposer.changed(currentTheme.colorPalette);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changed || rememberedValue2 == obj) {
                    rememberedValue2 = ComposeColorPaletteKt.toComposeColorPalette(currentTheme.colorPalette, currentTheme.theme == Theme.MooncakeLight);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                composeColorPalette = (ComposeColorPalette) rememberedValue2;
                gapComposer.end(false);
            }
            composableLambdaImpl2 = composableLambdaImpl;
            ProvideMooncakeTheme(wrapWithTheme, composeColorPalette, booleanValue, composableLambdaImpl2, gapComposer, 3072);
        } else {
            composableLambdaImpl2 = composableLambdaImpl;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new UiScopeKt$$ExternalSyntheticLambda1(i, i2, composableLambdaImpl2);
        }
    }

    public static final void ProvideMooncakeTheme(Context context, ComposeColorPalette composeColorPalette, boolean z, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        boolean z2;
        Colors colors;
        int i3;
        TextStyle textStyle;
        long j;
        boolean z3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2010886003);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(context) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(composeColorPalette) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            z2 = z;
            i2 |= gapComposer.changed(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            ProvidedValue defaultProvidedValue$runtime = AndroidCompositionLocals_androidKt.LocalContext.defaultProvidedValue$runtime(context);
            ProvidedValue defaultProvidedValue$runtime2 = ComposeColorPaletteKt.LocalColorPalette.defaultProvidedValue$runtime(composeColorPalette);
            ProvidedValue defaultProvidedValue$runtime3 = ComposeColorPaletteKt.LocalColorPaletteProvided.defaultProvidedValue$runtime(Boolean.valueOf(z2));
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
            boolean z4 = composeColorPalette.isLight;
            long j2 = composeColorPalette.tint;
            if (z4) {
                colors = ColorsLightKt.colorsLight;
                i3 = -16722353;
            } else {
                colors = ColorsDarkKt.colorsDark;
                i3 = -16728762;
            }
            if (ColorKt.m694toArgb8_81llA(j2) != i3) {
                colors = DimensionKt.m1468withTint4WTKRHQ(colors, j2);
            }
            ProvidedValue defaultProvidedValue$runtime4 = staticProvidableCompositionLocal.defaultProvidedValue$runtime(colors);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = MooncakeTypographyKt.LocalTypography;
            MooncakeTypography mooncakeTypography = MooncakeTypographyKt.DefaultTypography;
            ProvidedValue defaultProvidedValue$runtime5 = staticProvidableCompositionLocal2.defaultProvidedValue$runtime(mooncakeTypography);
            ProvidedValue defaultProvidedValue$runtime6 = IndicationKt.LocalIndication.defaultProvidedValue$runtime(RippleKt.m500rippleH2RKhps$default(RecyclerView.DECELERATION_RATE, 7, 0L, false));
            int i4 = i2;
            ProvidedValue defaultProvidedValue$runtime7 = RippleKt.LocalRippleConfiguration.defaultProvidedValue$runtime(new RippleConfiguration(ColorKt.Color(composeColorPalette.isLight ? 4292861919L : 4281282608L), new RippleAlpha(0.16f, 0.5f, 0.1f, 0.5f)));
            StaticProvidableCompositionLocal staticProvidableCompositionLocal3 = ArcadeThemeKt.LocalArcadeThemeSet;
            if (((Boolean) gapComposer.consume(staticProvidableCompositionLocal3)).booleanValue()) {
                gapComposer.startReplaceGroup(102832993);
                textStyle = (TextStyle) gapComposer.consume(ArcadeThemeKt.LocalTextStyle);
                if (textStyle == null) {
                    gapComposer.startReplaceGroup(-1100573765);
                    textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                    z3 = false;
                } else {
                    z3 = false;
                    gapComposer.startReplaceGroup(-1100574912);
                }
                gapComposer.end(z3);
                gapComposer.end(z3);
            } else {
                gapComposer.startReplaceGroup(102884515);
                gapComposer.end(false);
                textStyle = mooncakeTypography.mainBody;
            }
            ProvidedValue defaultProvidedValue$runtime8 = LocalTextStyle.defaultProvidedValue$runtime(textStyle);
            if (((Boolean) gapComposer.consume(staticProvidableCompositionLocal3)).booleanValue()) {
                gapComposer.startReplaceGroup(102996673);
                gapComposer.startReplaceGroup(1044898235);
                j = ((Color) gapComposer.consume(ArcadeThemeKt.LocalTextColor)).value;
                if (j == 16) {
                    j = Strings.getColors(gapComposer).semantic.text.standard;
                }
                gapComposer.end(false);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(103047761);
                gapComposer.end(false);
                j = composeColorPalette.label;
            }
            Updater.CompositionLocalProvider(new ProvidedValue[]{defaultProvidedValue$runtime, defaultProvidedValue$runtime2, defaultProvidedValue$runtime3, defaultProvidedValue$runtime4, defaultProvidedValue$runtime5, defaultProvidedValue$runtime6, defaultProvidedValue$runtime7, defaultProvidedValue$runtime8, re$$ExternalSyntheticOutline0.m(j, LocalTextColor)}, composableLambdaImpl, gapComposer, ((i4 >> 6) & 112) | 8);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ButtonCtaGroupKt$$ExternalSyntheticLambda4(context, composeColorPalette, z, composableLambdaImpl, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public static final ThemeInfo currentTheme(Context context) {
        ContextWrapper contextWrapper = context;
        while (!(contextWrapper instanceof HasThemeInfo)) {
            if (contextWrapper instanceof ContextWrapper) {
                ContextWrapper contextWrapper2 = contextWrapper;
                if (contextWrapper2.getBaseContext() != contextWrapper) {
                    Context baseContext = contextWrapper2.getBaseContext();
                    baseContext.getClass();
                    contextWrapper = baseContext;
                }
            }
            return (contextWrapper.getResources().getConfiguration().uiMode & 48) == 32 ? Trace.moonCakeDark(contextWrapper) : Trace.moonCakeLight(contextWrapper);
        }
        return ((HasThemeInfo) contextWrapper).getThemeInfo();
    }
}
