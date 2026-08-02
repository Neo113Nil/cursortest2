package com.squareup.cash.arcade.util;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.network.NetworkFetcher$fetch$2;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.treehouse.ColorBindingsKt;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.Strings;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import timber.log.Timber;

/* loaded from: classes5.dex */
public abstract class ThemablesKt {
    public static final Color forTheme(ColorModel colorModel, Composer composer) {
        long j;
        colorModel.getClass();
        if (colorModel instanceof ColorModel.Accented) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startReplaceGroup(-1837138388);
            Color forTheme = forTheme(((ColorModel.Accented) colorModel).color, gapComposer);
            gapComposer.end(false);
            return forTheme;
        }
        if (colorModel.equals(ColorModel.CashGreen.INSTANCE)) {
            GapComposer gapComposer2 = (GapComposer) composer;
            gapComposer2.startReplaceGroup(-1837134350);
            if (Strings.getColors(gapComposer2).isLight) {
                gapComposer2.startReplaceGroup(-1116561077);
                j = Strings.getColors(gapComposer2).base.cashGreen10;
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(-1116502549);
                j = Strings.getColors(gapComposer2).base.cashGreen30;
                gapComposer2.end(false);
            }
            return Recorder$$ExternalSyntheticOutline1.m(gapComposer2, false, j);
        }
        if (colorModel.equals(ColorModel.Bitcoin.INSTANCE)) {
            GapComposer gapComposer3 = (GapComposer) composer;
            gapComposer3.startReplaceGroup(-1837128313);
            Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
            } else {
                gapComposer3.startReplaceGroup(-1762997739);
                gapComposer3.end(false);
            }
            return Recorder$$ExternalSyntheticOutline1.m(gapComposer3, false, colors.semantic.icon.brand);
        }
        if (colorModel.equals(ColorModel.Investing.INSTANCE)) {
            GapComposer gapComposer4 = (GapComposer) composer;
            gapComposer4.startReplaceGroup(-1837126421);
            Colors colors2 = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
            } else {
                gapComposer4.startReplaceGroup(-1762997739);
                gapComposer4.end(false);
            }
            return Recorder$$ExternalSyntheticOutline1.m(gapComposer4, false, colors2.semantic.service.investing);
        }
        if (colorModel.equals(ColorModel.PrimaryButtonBackground.INSTANCE)) {
            GapComposer gapComposer5 = (GapComposer) composer;
            gapComposer5.startReplaceGroup(-1837123287);
            Colors colors3 = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
            if (colors3 == null) {
                colors3 = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
            } else {
                gapComposer5.startReplaceGroup(-1762997739);
                gapComposer5.end(false);
            }
            return Recorder$$ExternalSyntheticOutline1.m(gapComposer5, false, colors3.component.button.prominent.background.f160default);
        }
        if (colorModel.equals(ColorModel.GiftCard.INSTANCE)) {
            GapComposer gapComposer6 = (GapComposer) composer;
            gapComposer6.startReplaceGroup(-1837121746);
            Colors colors4 = (Colors) gapComposer6.consume(ArcadeThemeKt.LocalColors);
            if (colors4 == null) {
                colors4 = re$$ExternalSyntheticOutline0.m(gapComposer6, -1762997026, gapComposer6, false);
            } else {
                gapComposer6.startReplaceGroup(-1762997739);
                gapComposer6.end(false);
            }
            return Recorder$$ExternalSyntheticOutline1.m(gapComposer6, false, colors4.base.brandGreenS1);
        }
        if (colorModel.equals(ColorModel.Error.INSTANCE)) {
            GapComposer gapComposer7 = (GapComposer) composer;
            gapComposer7.startReplaceGroup(-1837118841);
            Colors colors5 = (Colors) gapComposer7.consume(ArcadeThemeKt.LocalColors);
            if (colors5 == null) {
                colors5 = re$$ExternalSyntheticOutline0.m(gapComposer7, -1762997026, gapComposer7, false);
            } else {
                gapComposer7.startReplaceGroup(-1762997739);
                gapComposer7.end(false);
            }
            return Recorder$$ExternalSyntheticOutline1.m(gapComposer7, false, colors5.component.input.border.error);
        }
        if (colorModel.equals(ColorModel.Background.INSTANCE)) {
            GapComposer gapComposer8 = (GapComposer) composer;
            gapComposer8.startReplaceGroup(-1837116822);
            Colors colors6 = (Colors) gapComposer8.consume(ArcadeThemeKt.LocalColors);
            if (colors6 == null) {
                colors6 = re$$ExternalSyntheticOutline0.m(gapComposer8, -1762997026, gapComposer8, false);
            } else {
                gapComposer8.startReplaceGroup(-1762997739);
                gapComposer8.end(false);
            }
            return Recorder$$ExternalSyntheticOutline1.m(gapComposer8, false, colors6.semantic.background.standard);
        }
        if (colorModel.equals(ColorModel.SecondaryLabel.INSTANCE)) {
            GapComposer gapComposer9 = (GapComposer) composer;
            gapComposer9.startReplaceGroup(-1837114776);
            Colors colors7 = (Colors) gapComposer9.consume(ArcadeThemeKt.LocalColors);
            if (colors7 == null) {
                colors7 = re$$ExternalSyntheticOutline0.m(gapComposer9, -1762997026, gapComposer9, false);
            } else {
                gapComposer9.startReplaceGroup(-1762997739);
                gapComposer9.end(false);
            }
            return Recorder$$ExternalSyntheticOutline1.m(gapComposer9, false, colors7.semantic.text.subtle);
        }
        if (colorModel.equals(ColorModel.Icon.INSTANCE)) {
            GapComposer gapComposer10 = (GapComposer) composer;
            gapComposer10.startReplaceGroup(-1837113110);
            Colors colors8 = (Colors) gapComposer10.consume(ArcadeThemeKt.LocalColors);
            if (colors8 == null) {
                colors8 = re$$ExternalSyntheticOutline0.m(gapComposer10, -1762997026, gapComposer10, false);
            } else {
                gapComposer10.startReplaceGroup(-1762997739);
                gapComposer10.end(false);
            }
            return Recorder$$ExternalSyntheticOutline1.m(gapComposer10, false, colors8.semantic.icon.standard);
        }
        if (colorModel.equals(ColorModel.SecondaryButtonBackground.INSTANCE)) {
            GapComposer gapComposer11 = (GapComposer) composer;
            gapComposer11.startReplaceGroup(-1837110520);
            Colors colors9 = (Colors) gapComposer11.consume(ArcadeThemeKt.LocalColors);
            if (colors9 == null) {
                colors9 = re$$ExternalSyntheticOutline0.m(gapComposer11, -1762997026, gapComposer11, false);
            } else {
                gapComposer11.startReplaceGroup(-1762997739);
                gapComposer11.end(false);
            }
            return Recorder$$ExternalSyntheticOutline1.m(gapComposer11, false, colors9.semantic.background.subtle);
        }
        if (colorModel.equals(ColorModel.Warning.INSTANCE)) {
            GapComposer gapComposer12 = (GapComposer) composer;
            gapComposer12.startReplaceGroup(-1837108759);
            Colors colors10 = (Colors) gapComposer12.consume(ArcadeThemeKt.LocalColors);
            if (colors10 == null) {
                colors10 = re$$ExternalSyntheticOutline0.m(gapComposer12, -1762997026, gapComposer12, false);
            } else {
                gapComposer12.startReplaceGroup(-1762997739);
                gapComposer12.end(false);
            }
            return Recorder$$ExternalSyntheticOutline1.m(gapComposer12, false, colors10.semantic.icon.warning);
        }
        if (colorModel instanceof ColorModel.Arcade) {
            GapComposer gapComposer13 = (GapComposer) composer;
            gapComposer13.startReplaceGroup(-1837106251);
            Colors colors11 = (Colors) gapComposer13.consume(ArcadeThemeKt.LocalColors);
            if (colors11 == null) {
                colors11 = re$$ExternalSyntheticOutline0.m(gapComposer13, -1762997026, gapComposer13, false);
            } else {
                gapComposer13.startReplaceGroup(-1762997739);
                gapComposer13.end(false);
            }
            return Recorder$$ExternalSyntheticOutline1.m(gapComposer13, false, ColorBindingsKt.getColorById(colors11, ((ColorModel.Arcade) colorModel).token));
        }
        if (!colorModel.equals(ColorModel.BaseWhite.INSTANCE)) {
            throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer, -1837138525, false);
        }
        GapComposer gapComposer14 = (GapComposer) composer;
        gapComposer14.startReplaceGroup(-1837104305);
        Colors colors12 = (Colors) gapComposer14.consume(ArcadeThemeKt.LocalColors);
        if (colors12 == null) {
            colors12 = re$$ExternalSyntheticOutline0.m(gapComposer14, -1762997026, gapComposer14, false);
        } else {
            gapComposer14.startReplaceGroup(-1762997739);
            gapComposer14.end(false);
        }
        return Recorder$$ExternalSyntheticOutline1.m(gapComposer14, false, colors12.base.constantWhite);
    }

    public static final String urlForTheme(Image image, Composer composer) {
        image.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
        if (colors == null) {
            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
        } else {
            gapComposer.startReplaceGroup(-1762997739);
            gapComposer.end(false);
        }
        if (colors.isLight) {
            String str = image.light_url;
            str.getClass();
            return str;
        }
        String str2 = image.dark_url;
        if (str2 != null) {
            if (StringsKt.isBlank(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                return str2;
            }
        }
        String str3 = image.light_url;
        str3.getClass();
        return str3;
    }

    public static final Color forTheme(com.squareup.protos.cash.ui.Color color, Composer composer) {
        Color.ModeVariant modeVariant;
        color.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
        if (colors == null) {
            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
        } else {
            gapComposer.startReplaceGroup(-1762997739);
            gapComposer.end(false);
        }
        if (colors.isLight) {
            modeVariant = color.light;
            modeVariant.getClass();
        } else {
            Color.ModeVariant modeVariant2 = color.dark;
            if (modeVariant2 == null) {
                modeVariant = color.light;
                modeVariant.getClass();
            } else {
                modeVariant = modeVariant2;
            }
        }
        String str = modeVariant.srgb;
        Timber.Forest forest = Timber.Forest;
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new NetworkFetcher$fetch$2(1, forest, Timber.Forest.class, "e", "e(Ljava/lang/Throwable;)V", 0, 27);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Integer safeParseColor = com.squareup.util.android.StringsKt.safeParseColor(str, (Function1) ((KFunction) rememberedValue));
        if (safeParseColor != null) {
            return new androidx.compose.ui.graphics.Color(ColorKt.Color(safeParseColor.intValue()));
        }
        return null;
    }
}
