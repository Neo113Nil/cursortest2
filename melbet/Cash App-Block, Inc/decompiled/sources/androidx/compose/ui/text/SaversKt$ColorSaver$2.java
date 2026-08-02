package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class SaversKt$ColorSaver$2 implements Function1 {
    public static final SaversKt$ColorSaver$2 INSTANCE = new SaversKt$ColorSaver$2();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        if (Intrinsics.areEqual(obj, Boolean.FALSE)) {
            return new Color(Color.Unspecified);
        }
        obj.getClass();
        return new Color(ColorKt.Color(((Integer) obj).intValue()));
    }
}
