package androidx.compose.material3;

import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public abstract class ColorSchemeKt {
    public static final StaticProvidableCompositionLocal LocalColorScheme = new StaticProvidableCompositionLocal(new androidx.compose.material.TextKt$$ExternalSyntheticLambda0(9));
    public static final StaticProvidableCompositionLocal LocalTonalElevationEnabled = new StaticProvidableCompositionLocal(new androidx.compose.material.TextKt$$ExternalSyntheticLambda0(10));

    /* renamed from: contentColorFor-ek8zF_U, reason: not valid java name */
    public static final long m519contentColorForek8zF_U(long j, Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(89374938);
        ColorScheme colorScheme = (ColorScheme) gapComposer.consume(LocalColorScheme);
        long j2 = colorScheme.primary;
        long j3 = colorScheme.onTertiaryFixed;
        long j4 = colorScheme.onSecondaryFixed;
        long j5 = colorScheme.onPrimaryFixed;
        long j6 = colorScheme.onSurface;
        if (Color.m676equalsimpl0(j, j2)) {
            j3 = colorScheme.onPrimary;
        } else if (Color.m676equalsimpl0(j, colorScheme.secondary)) {
            j3 = colorScheme.onSecondary;
        } else if (Color.m676equalsimpl0(j, colorScheme.tertiary)) {
            j3 = colorScheme.onTertiary;
        } else if (Color.m676equalsimpl0(j, colorScheme.background)) {
            j3 = colorScheme.onBackground;
        } else if (Color.m676equalsimpl0(j, colorScheme.error)) {
            j3 = colorScheme.onError;
        } else if (Color.m676equalsimpl0(j, colorScheme.primaryContainer)) {
            j3 = colorScheme.onPrimaryContainer;
        } else if (Color.m676equalsimpl0(j, colorScheme.secondaryContainer)) {
            j3 = colorScheme.onSecondaryContainer;
        } else if (Color.m676equalsimpl0(j, colorScheme.tertiaryContainer)) {
            j3 = colorScheme.onTertiaryContainer;
        } else if (Color.m676equalsimpl0(j, colorScheme.errorContainer)) {
            j3 = colorScheme.onErrorContainer;
        } else if (Color.m676equalsimpl0(j, colorScheme.inverseSurface)) {
            j3 = colorScheme.inverseOnSurface;
        } else {
            if (!Color.m676equalsimpl0(j, colorScheme.surface)) {
                if (Color.m676equalsimpl0(j, colorScheme.surfaceVariant)) {
                    j3 = colorScheme.onSurfaceVariant;
                } else if (!Color.m676equalsimpl0(j, colorScheme.surfaceBright) && !Color.m676equalsimpl0(j, colorScheme.surfaceContainer) && !Color.m676equalsimpl0(j, colorScheme.surfaceContainerHigh) && !Color.m676equalsimpl0(j, colorScheme.surfaceContainerHighest) && !Color.m676equalsimpl0(j, colorScheme.surfaceContainerLow) && !Color.m676equalsimpl0(j, colorScheme.surfaceContainerLowest) && !Color.m676equalsimpl0(j, colorScheme.surfaceDim)) {
                    if (Color.m676equalsimpl0(j, colorScheme.primaryFixed) || Color.m676equalsimpl0(j, colorScheme.primaryFixedDim)) {
                        j3 = j5;
                    } else if (Color.m676equalsimpl0(j, colorScheme.secondaryFixed) || Color.m676equalsimpl0(j, colorScheme.secondaryFixedDim)) {
                        j3 = j4;
                    } else if (!Color.m676equalsimpl0(j, colorScheme.tertiaryFixed) && !Color.m676equalsimpl0(j, colorScheme.tertiaryFixedDim)) {
                        j3 = Color.Unspecified;
                    }
                }
            }
            j3 = j6;
        }
        if (j3 == 16) {
            j3 = ((Color) gapComposer.consume(ContentColorKt.LocalContentColor)).value;
        }
        gapComposer.end(false);
        return j3;
    }

    public static final long fromToken(ColorScheme colorScheme, ColorSchemeKeyTokens colorSchemeKeyTokens) {
        switch (colorSchemeKeyTokens.ordinal()) {
            case 0:
                return colorScheme.background;
            case 1:
                return colorScheme.error;
            case 2:
                return colorScheme.errorContainer;
            case 3:
                return colorScheme.inverseOnSurface;
            case 4:
                return colorScheme.inversePrimary;
            case 5:
                return colorScheme.inverseSurface;
            case 6:
                return colorScheme.onBackground;
            case 7:
                return colorScheme.onError;
            case 8:
                return colorScheme.onErrorContainer;
            case 9:
                return colorScheme.onPrimary;
            case 10:
                return colorScheme.onPrimaryContainer;
            case 11:
                return colorScheme.onPrimaryFixed;
            case 12:
                return colorScheme.onPrimaryFixedVariant;
            case 13:
                return colorScheme.onSecondary;
            case 14:
                return colorScheme.onSecondaryContainer;
            case 15:
                return colorScheme.onSecondaryFixed;
            case 16:
                return colorScheme.onSecondaryFixedVariant;
            case 17:
                return colorScheme.onSurface;
            case 18:
                return colorScheme.onSurfaceVariant;
            case 19:
                return colorScheme.onTertiary;
            case 20:
                return colorScheme.onTertiaryContainer;
            case 21:
                return colorScheme.onTertiaryFixed;
            case 22:
                return colorScheme.onTertiaryFixedVariant;
            case 23:
                return colorScheme.outline;
            case 24:
                return colorScheme.outlineVariant;
            case 25:
                return colorScheme.primary;
            case 26:
                return colorScheme.primaryContainer;
            case 27:
                return colorScheme.primaryFixed;
            case 28:
                return colorScheme.primaryFixedDim;
            case 29:
                return colorScheme.scrim;
            case 30:
                return colorScheme.secondary;
            case 31:
                return colorScheme.secondaryContainer;
            case 32:
                return colorScheme.secondaryFixed;
            case 33:
                return colorScheme.secondaryFixedDim;
            case 34:
                return colorScheme.surface;
            case 35:
                return colorScheme.surfaceBright;
            case 36:
                return colorScheme.surfaceContainer;
            case 37:
                return colorScheme.surfaceContainerHigh;
            case 38:
                return colorScheme.surfaceContainerHighest;
            case 39:
                return colorScheme.surfaceContainerLow;
            case 40:
                return colorScheme.surfaceContainerLowest;
            case 41:
                return colorScheme.surfaceDim;
            case 42:
                return colorScheme.surfaceTint;
            case 43:
                return colorScheme.surfaceVariant;
            case 44:
                return colorScheme.tertiary;
            case 45:
                return colorScheme.tertiaryContainer;
            case 46:
                return colorScheme.tertiaryFixed;
            case 47:
                return colorScheme.tertiaryFixedDim;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0L;
        }
    }

    public static final long getValue(ColorSchemeKeyTokens colorSchemeKeyTokens, Composer composer) {
        return fromToken((ColorScheme) ((GapComposer) composer).consume(LocalColorScheme), colorSchemeKeyTokens);
    }
}
