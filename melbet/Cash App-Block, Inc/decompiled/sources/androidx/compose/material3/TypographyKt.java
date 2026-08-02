package androidx.compose.material3;

import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.text.TextStyle;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public abstract class TypographyKt {
    public static final StaticProvidableCompositionLocal LocalTypography = new StaticProvidableCompositionLocal(new androidx.compose.material.TextKt$$ExternalSyntheticLambda0(22));

    public static final TextStyle getValue(TypographyKeyTokens typographyKeyTokens, Composer composer) {
        Typography typography = (Typography) ((GapComposer) composer).consume(LocalTypography);
        switch (typographyKeyTokens.ordinal()) {
            case 0:
                return typography.bodyLarge;
            case 1:
                return typography.bodyMedium;
            case 2:
                return typography.bodySmall;
            case 3:
                return typography.displayLarge;
            case 4:
                return typography.displayMedium;
            case 5:
                return typography.displaySmall;
            case 6:
                return typography.headlineLarge;
            case 7:
                return typography.headlineMedium;
            case 8:
                return typography.headlineSmall;
            case 9:
                return typography.labelLarge;
            case 10:
                return typography.labelMedium;
            case 11:
                return typography.labelSmall;
            case 12:
                return typography.titleLarge;
            case 13:
                return typography.titleMedium;
            case 14:
                return typography.titleSmall;
            case 15:
                return typography.bodyLargeEmphasized;
            case 16:
                return typography.bodyMediumEmphasized;
            case 17:
                return typography.bodySmallEmphasized;
            case 18:
                return typography.displayLargeEmphasized;
            case 19:
                return typography.displayMediumEmphasized;
            case 20:
                return typography.displaySmallEmphasized;
            case 21:
                return typography.headlineLargeEmphasized;
            case 22:
                return typography.headlineMediumEmphasized;
            case 23:
                return typography.headlineSmallEmphasized;
            case 24:
                return typography.labelLargeEmphasized;
            case 25:
                return typography.labelMediumEmphasized;
            case 26:
                return typography.labelSmallEmphasized;
            case 27:
                return typography.titleLargeEmphasized;
            case 28:
                return typography.titleMediumEmphasized;
            case 29:
                return typography.titleSmallEmphasized;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }
}
