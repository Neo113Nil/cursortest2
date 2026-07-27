package com.zennvvarroo.pealkkk.ui.theme;

import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Theme.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0002\u001a\u00020\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0002\u0010\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"AppColorScheme", "Landroidx/compose/material3/ColorScheme;", "ZenvaroPeakTheme", "", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ThemeKt {
    private static final ColorScheme AppColorScheme = ColorSchemeKt.m1395darkColorSchemeCXl9yA$default(ColorKt.getPeakCyan(), ColorKt.getPeakBlack(), 0, 0, 0, ColorKt.getPeakBlue(), ColorKt.getPeakWhite(), 0, 0, 0, 0, 0, 0, ColorKt.getPeakBlack(), ColorKt.getPeakWhite(), ColorKt.getPeakPanel(), ColorKt.getPeakWhite(), ColorKt.getPeakPanelLight(), ColorKt.getPeakMuted(), 0, 0, 0, ColorKt.getPeakRed(), ColorKt.getPeakWhite(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -13099108, 15, null);

    public static final void ZenvaroPeakTheme(final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1483305593);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changedInstance(content) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1483305593, i2, -1, "com.zennvvarroo.pealkkk.ui.theme.ZenvaroPeakTheme (Theme.kt:26)");
            }
            MaterialThemeKt.MaterialTheme(AppColorScheme, null, TypeKt.getAppTypography(), content, startRestartGroup, ((i2 << 9) & 7168) | 390, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.theme.ThemeKt$ZenvaroPeakTheme$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    ThemeKt.ZenvaroPeakTheme(content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
