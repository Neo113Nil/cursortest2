package com.squareup.cash.arcade.theme;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.svg.SvgDecoder$$ExternalSyntheticLambda0;
import com.braze.enums.DataStoreKey$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.ColorsDarkKt;
import com.squareup.cash.arcade.ColorsLightKt;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.util.money.Moneys$$ExternalSyntheticLambda0;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.sequences.SequencesKt__SequencesKt;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes.dex */
public abstract class ArcadeThemeKt {
    public static final StaticProvidableCompositionLocal LocalColors;
    public static final DynamicProvidableCompositionLocal LocalTextStyle;
    public static final StaticProvidableCompositionLocal LocalTypography = new StaticProvidableCompositionLocal(new DataStoreKey$$ExternalSyntheticLambda0(27));
    public static final StaticProvidableCompositionLocal LocalTextColor = new StaticProvidableCompositionLocal(ArcadeThemeKt$LocalIconColor$1.INSTANCE$1);
    public static final DynamicProvidableCompositionLocal LocalTextAlign = new DynamicProvidableCompositionLocal(new DataStoreKey$$ExternalSyntheticLambda0(28));
    public static final Typography DefaultTypography = new Typography();
    public static final DynamicProvidableCompositionLocal LocalIconColor = new DynamicProvidableCompositionLocal(ArcadeThemeKt$LocalIconColor$1.INSTANCE);
    public static final StaticProvidableCompositionLocal LocalArcadeThemeSet = new StaticProvidableCompositionLocal(new DataStoreKey$$ExternalSyntheticLambda0(29));
    public static final StaticProvidableCompositionLocal LocalSizes = new StaticProvidableCompositionLocal(new Moneys$$ExternalSyntheticLambda0(1));
    public static final StaticProvidableCompositionLocal LocalScreenMargin = new StaticProvidableCompositionLocal(new Moneys$$ExternalSyntheticLambda0(2));

    static {
        int i = 26;
        LocalColors = new StaticProvidableCompositionLocal(new DataStoreKey$$ExternalSyntheticLambda0(i));
        LocalTextStyle = new DynamicProvidableCompositionLocal(new DataStoreKey$$ExternalSyntheticLambda0(i));
    }

    public static final void ArcadeTheme(Colors colors, Typography typography, DefaultSizes defaultSizes, Function2 function2, Composer composer, int i, int i2) {
        Colors colors2;
        int i3;
        Typography typography2;
        DefaultSizes defaultSizes2;
        int i4;
        DefaultSizes defaultSizes3;
        int i5;
        function2.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2025745453);
        if ((i & 6) == 0) {
            if ((i2 & 1) == 0) {
                colors2 = colors;
                if (gapComposer.changed(colors2)) {
                    i5 = 4;
                    i3 = i5 | i;
                }
            } else {
                colors2 = colors;
            }
            i5 = 2;
            i3 = i5 | i;
        } else {
            colors2 = colors;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer.changedInstance(function2) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            gapComposer.startDefaults();
            int i6 = i & 1;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = LocalSizes;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = LocalTypography;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal3 = LocalColors;
            if (i6 == 0 || gapComposer.getDefaultsInvalid()) {
                if ((i2 & 1) != 0) {
                    colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal3);
                    if (colors2 == null) {
                        gapComposer.startReplaceGroup(-1121193339);
                        Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
                        boolean changed = gapComposer.changed(context);
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (changed || rememberedValue == Composer.Companion.Empty) {
                            Iterator it = SequencesKt__SequencesKt.generateSequence(new SvgDecoder$$ExternalSyntheticLambda0(21), context).iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    rememberedValue = null;
                                    break;
                                }
                                Context context2 = (Context) it.next();
                                ArcadeContextWrapper arcadeContextWrapper = context2 instanceof ArcadeContextWrapper ? (ArcadeContextWrapper) context2 : null;
                                if (arcadeContextWrapper != null) {
                                    rememberedValue = arcadeContextWrapper;
                                    break;
                                }
                            }
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        ArcadeContextWrapper arcadeContextWrapper2 = (ArcadeContextWrapper) rememberedValue;
                        Function3 function3 = arcadeContextWrapper2 != null ? arcadeContextWrapper2.colorTransform : null;
                        if (function3 == null) {
                            gapComposer.startReplaceGroup(-397611774);
                            gapComposer.end(false);
                            colors2 = null;
                        } else {
                            gapComposer.startReplaceGroup(1372647135);
                            Colors colors3 = (Colors) gapComposer.consume(staticProvidableCompositionLocal3);
                            if (colors3 == null) {
                                colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                            } else {
                                gapComposer.startReplaceGroup(-1762997739);
                                gapComposer.end(false);
                            }
                            colors2 = (Colors) function3.invoke(colors3, gapComposer, 0);
                            gapComposer.end(false);
                        }
                    } else {
                        gapComposer.startReplaceGroup(-1121194052);
                    }
                    gapComposer.end(false);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1121192635, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1121194030);
                        gapComposer.end(false);
                    }
                    i3 &= -15;
                }
                typography2 = (Typography) gapComposer.consume(staticProvidableCompositionLocal2);
                i4 = i3 & (-1009);
                defaultSizes3 = (DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal);
            } else {
                gapComposer.skipToGroupEnd();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
                typography2 = typography;
                i4 = i3 & (-1009);
                defaultSizes3 = defaultSizes;
            }
            gapComposer.endDefaults();
            ProvidedValue defaultProvidedValue$runtime = staticProvidableCompositionLocal3.defaultProvidedValue$runtime(colors2);
            ProvidedValue defaultProvidedValue$runtime2 = staticProvidableCompositionLocal2.defaultProvidedValue$runtime(typography2);
            ProvidedValue defaultProvidedValue$runtime3 = IndicationKt.LocalIndication.defaultProvidedValue$runtime(RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer, 0, 15));
            ProvidedValue defaultProvidedValue$runtime4 = LocalTextStyle.defaultProvidedValue$runtime(typography2.labelMedium);
            ProvidedValue m = re$$ExternalSyntheticOutline0.m(colors2.semantic.text.standard, LocalTextColor);
            ProvidedValue m2 = Recorder$$ExternalSyntheticOutline2.m(colors2.semantic.icon.standard, LocalIconColor);
            ProvidedValue defaultProvidedValue$runtime5 = LocalArcadeThemeSet.defaultProvidedValue$runtime(Boolean.TRUE);
            ProvidedValue defaultProvidedValue$runtime6 = staticProvidableCompositionLocal.defaultProvidedValue$runtime(defaultSizes3);
            defaultSizes3.getClass();
            DefaultSizes.spacing.getClass();
            Updater.CompositionLocalProvider(new ProvidedValue[]{defaultProvidedValue$runtime, defaultProvidedValue$runtime2, defaultProvidedValue$runtime3, defaultProvidedValue$runtime4, m, m2, defaultProvidedValue$runtime5, defaultProvidedValue$runtime6, LocalScreenMargin.defaultProvidedValue$runtime(new Dp(16.0f))}, function2, gapComposer, ((i4 >> 6) & 112) | 8);
            defaultSizes2 = defaultSizes3;
        } else {
            gapComposer.skipToGroupEnd();
            typography2 = typography;
            defaultSizes2 = defaultSizes;
        }
        Colors colors4 = colors2;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeThemeKt$$ExternalSyntheticLambda6(colors4, typography2, defaultSizes2, function2, i, i2);
        }
    }

    public static final Colors getDefaultColors(Composer composer) {
        return ImageKt.isSystemInDarkTheme(composer) ? ColorsDarkKt.colorsDark : ColorsLightKt.colorsLight;
    }
}
