package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.material3.SliderState$dragScope$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$FloatRef;

/* loaded from: classes3.dex */
public final /* synthetic */ class SliderKt$animateToTarget$2$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SliderState$dragScope$1 f$0;
    public final /* synthetic */ Ref$FloatRef f$1;

    public /* synthetic */ SliderKt$animateToTarget$2$$ExternalSyntheticLambda0(SliderState$dragScope$1 sliderState$dragScope$1, Ref$FloatRef ref$FloatRef, int i) {
        this.$r8$classId = i;
        this.f$0 = sliderState$dragScope$1;
        this.f$1 = ref$FloatRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Ref$FloatRef ref$FloatRef = this.f$1;
        SliderState$dragScope$1 sliderState$dragScope$1 = this.f$0;
        Animatable animatable = (Animatable) obj;
        switch (i) {
            case 0:
                sliderState$dragScope$1.dragBy(((Number) animatable.getValue()).floatValue() - ref$FloatRef.element);
                ref$FloatRef.element = ((Number) animatable.getValue()).floatValue();
                break;
            default:
                sliderState$dragScope$1.dragBy(((Number) animatable.getValue()).floatValue() - ref$FloatRef.element);
                ref$FloatRef.element = ((Number) animatable.getValue()).floatValue();
                break;
        }
        return Unit.INSTANCE;
    }
}
