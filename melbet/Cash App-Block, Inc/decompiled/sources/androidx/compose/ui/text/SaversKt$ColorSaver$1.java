package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class SaversKt$ColorSaver$1 implements Function2 {
    public static final SaversKt$ColorSaver$1 INSTANCE = new SaversKt$ColorSaver$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long j = ((Color) obj2).value;
        return j == 16 ? Boolean.FALSE : Integer.valueOf(ColorKt.m694toArgb8_81llA(j));
    }
}
