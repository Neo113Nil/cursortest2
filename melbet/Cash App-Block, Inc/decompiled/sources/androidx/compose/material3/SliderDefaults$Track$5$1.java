package androidx.compose.material3;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* loaded from: classes3.dex */
public final class SliderDefaults$Track$5$1 implements Function3 {
    public static final SliderDefaults$Track$5$1 INSTANCE = new SliderDefaults$Track$5$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DrawScope drawScope = (DrawScope) obj;
        long j = ((Offset) obj2).packedValue;
        long j2 = ((Color) obj3).value;
        SliderDefaults sliderDefaults = SliderDefaults.INSTANCE;
        DrawScope.m738drawCircleVaOC9Bg$default(drawScope, j2, drawScope.mo236toPx0680j_4(SliderDefaults.TickSize) / 2.0f, j, null, 0, 120);
        return Unit.INSTANCE;
    }
}
