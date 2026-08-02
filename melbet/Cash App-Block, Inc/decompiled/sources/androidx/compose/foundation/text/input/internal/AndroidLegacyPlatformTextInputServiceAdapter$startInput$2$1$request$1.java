package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes3.dex */
public final /* synthetic */ class AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1 extends FunctionReferenceImpl implements Function1 {
    public final /* synthetic */ LegacyAdaptingPlatformTextInputModifierNode $node;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1(LegacyAdaptingPlatformTextInputModifierNode legacyAdaptingPlatformTextInputModifierNode) {
        super(1, ArrayIteratorKt.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.$node = legacyAdaptingPlatformTextInputModifierNode;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float[] fArr = ((Matrix) obj).values;
        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) this.$node.layoutCoordinates$delegate.getValue();
        if (layoutCoordinates != null) {
            if (!layoutCoordinates.isAttached()) {
                layoutCoordinates = null;
            }
            if (layoutCoordinates != null) {
                layoutCoordinates.mo846transformToScreen58bKbWc(fArr);
            }
        }
        return Unit.INSTANCE;
    }
}
