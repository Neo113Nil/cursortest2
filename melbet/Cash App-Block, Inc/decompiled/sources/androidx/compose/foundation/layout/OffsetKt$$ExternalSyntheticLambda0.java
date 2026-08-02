package androidx.compose.foundation.layout;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.io.LinesSequence;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final /* synthetic */ class OffsetKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ float f$0;
    public final /* synthetic */ float f$1;

    public /* synthetic */ OffsetKt$$ExternalSyntheticLambda0(float f, float f2, int i) {
        this.$r8$classId = i;
        this.f$0 = f;
        this.f$1 = f2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        float f = this.f$1;
        float f2 = this.f$0;
        switch (i) {
            case 0:
                InspectorInfo inspectorInfo = (InspectorInfo) obj;
                inspectorInfo.name = "offset";
                LinesSequence linesSequence = inspectorInfo.properties;
                linesSequence.set(new Dp(f2), "x");
                linesSequence.set(new Dp(f), "y");
                break;
            case 1:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope.getClass();
                reusableGraphicsLayerScope.setTranslationY(f2 * f);
                break;
            case 2:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope2 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope2.getClass();
                reusableGraphicsLayerScope2.setTranslationY(f2 * f);
                break;
            default:
                LayoutNodeDrawScope layoutNodeDrawScope = (LayoutNodeDrawScope) obj;
                layoutNodeDrawScope.getClass();
                layoutNodeDrawScope.drawContent();
                CanvasDrawScope canvasDrawScope = layoutNodeDrawScope.canvasDrawScope;
                float intBitsToFloat = f2 - Float.intBitsToFloat((int) (canvasDrawScope.mo752getCenterF1C5BW0() >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (canvasDrawScope.mo752getCenterF1C5BW0() & BodyPartID.bodyIdMax));
                DrawScope.m738drawCircleVaOC9Bg$default(layoutNodeDrawScope, Color.Transparent, Float.intBitsToFloat((int) (canvasDrawScope.mo752getCenterF1C5BW0() >> 32)) + f, (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & BodyPartID.bodyIdMax), null, 7, 56);
                break;
        }
        return Unit.INSTANCE;
    }
}
