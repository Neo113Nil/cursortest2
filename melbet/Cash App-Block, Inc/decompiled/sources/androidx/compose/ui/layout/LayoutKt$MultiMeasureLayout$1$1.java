package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class LayoutKt$MultiMeasureLayout$1$1 extends Lambda implements Function1 {
    public static final LayoutKt$MultiMeasureLayout$1$1 INSTANCE = new LayoutKt$MultiMeasureLayout$1$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((LayoutNode) obj).canMultiMeasure = true;
        return Unit.INSTANCE;
    }
}
