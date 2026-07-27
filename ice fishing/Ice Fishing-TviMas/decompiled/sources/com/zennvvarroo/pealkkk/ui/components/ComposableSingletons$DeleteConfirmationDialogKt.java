package com.zennvvarroo.pealkkk.ui.components;

import androidx.compose.foundation.layout.RowScope;
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
import com.zennvvarroo.pealkkk.ui.theme.ColorKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeleteConfirmationDialog.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$DeleteConfirmationDialogKt {
    public static final ComposableSingletons$DeleteConfirmationDialogKt INSTANCE = new ComposableSingletons$DeleteConfirmationDialogKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f59lambda1 = ComposableLambdaKt.composableLambdaInstance(-39248225, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.components.ComposableSingletons$DeleteConfirmationDialogKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope TextButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
            if ((i & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-39248225, i, -1, "com.zennvvarroo.pealkkk.ui.components.ComposableSingletons$DeleteConfirmationDialogKt.lambda-1.<anonymous> (DeleteConfirmationDialog.kt:27)");
            }
            TextKt.m2125Text4IGK_g("Delete", (Modifier) null, ColorKt.getPeakRed(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 196998, 0, 131034);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f60lambda2 = ComposableLambdaKt.composableLambdaInstance(1364620961, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.components.ComposableSingletons$DeleteConfirmationDialogKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope TextButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
            if ((i & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1364620961, i, -1, "com.zennvvarroo.pealkkk.ui.components.ComposableSingletons$DeleteConfirmationDialogKt.lambda-2.<anonymous> (DeleteConfirmationDialog.kt:30)");
            }
            TextKt.m2125Text4IGK_g("Cancel", (Modifier) null, ColorKt.getPeakMuted(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 390, 0, 131066);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$app_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m6207getLambda1$app_release() {
        return f59lambda1;
    }

    /* renamed from: getLambda-2$app_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m6208getLambda2$app_release() {
        return f60lambda2;
    }
}
