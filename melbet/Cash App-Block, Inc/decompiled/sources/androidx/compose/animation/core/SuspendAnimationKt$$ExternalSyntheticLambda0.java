package androidx.compose.animation.core;

import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final /* synthetic */ class SuspendAnimationKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function2 f$0;

    public /* synthetic */ SuspendAnimationKt$$ExternalSyntheticLambda0(int i, Function2 function2) {
        this.$r8$classId = i;
        this.f$0 = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Function2 function2 = this.f$0;
        switch (i) {
            case 0:
                AnimationScope animationScope = (AnimationScope) obj;
                function2.invoke(animationScope.value$delegate.getValue(), AnimatableKt.FloatToVector.convertFromVector.invoke(animationScope.velocityVector));
                break;
            default:
                PointerInputChange pointerInputChange = (PointerInputChange) obj;
                function2.invoke(pointerInputChange, Float.valueOf(Float.intBitsToFloat((int) (PointerEventKt.positionChangeInternal(pointerInputChange, false) & BodyPartID.bodyIdMax))));
                pointerInputChange.consume();
                break;
        }
        return Unit.INSTANCE;
    }
}
