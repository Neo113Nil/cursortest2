package com.zennvvarroo.pealkkk.ui.screens.overview;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.zennvvarroo.pealkkk.ui.components.CommonKt;
import com.zennvvarroo.pealkkk.ui.theme.ColorKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OverviewScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$OverviewScreenKt {
    public static final ComposableSingletons$OverviewScreenKt INSTANCE = new ComposableSingletons$OverviewScreenKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function3<LazyItemScope, Composer, Integer, Unit> f73lambda1 = ComposableLambdaKt.composableLambdaInstance(-2031995440, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.overview.ComposableSingletons$OverviewScreenKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2031995440, i, -1, "com.zennvvarroo.pealkkk.ui.screens.overview.ComposableSingletons$OverviewScreenKt.lambda-1.<anonymous> (OverviewScreen.kt:52)");
            }
            CommonKt.ScreenHeader("Zenvaro Peak", "Simple shelf organization.", composer, 54);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function3<ColumnScope, Composer, Integer, Unit> f74lambda2 = ComposableLambdaKt.composableLambdaInstance(1703459031, false, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.overview.ComposableSingletons$OverviewScreenKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            invoke(columnScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(ColumnScope GlassCard, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(GlassCard, "$this$GlassCard");
            if ((i & 81) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1703459031, i, -1, "com.zennvvarroo.pealkkk.ui.screens.overview.ComposableSingletons$OverviewScreenKt.lambda-2.<anonymous> (OverviewScreen.kt:92)");
                }
                TextKt.m2125Text4IGK_g("Shelf preview", (Modifier) null, ColorKt.getPeakWhite(), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 200070, 0, 131026);
                SpacerKt.Spacer(SizeKt.m597height3ABfNKs(Modifier.INSTANCE, Dp.m5734constructorimpl(12)), composer, 6);
                ShelfPreviewKt.ShelfPreview(composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: getLambda-1$app_release, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m6223getLambda1$app_release() {
        return f73lambda1;
    }

    /* renamed from: getLambda-2$app_release, reason: not valid java name */
    public final Function3<ColumnScope, Composer, Integer, Unit> m6224getLambda2$app_release() {
        return f74lambda2;
    }
}
