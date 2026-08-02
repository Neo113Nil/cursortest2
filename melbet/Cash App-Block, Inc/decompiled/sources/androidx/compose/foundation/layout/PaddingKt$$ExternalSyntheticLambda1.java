package androidx.compose.foundation.layout;

import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class PaddingKt$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ float f$0;
    public final /* synthetic */ float f$1;

    public /* synthetic */ PaddingKt$$ExternalSyntheticLambda1(float f, float f2, int i) {
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
                inspectorInfo.setName("padding");
                inspectorInfo.getProperties().set(new Dp(f2), "horizontal");
                inspectorInfo.getProperties().set(new Dp(f), "vertical");
                break;
            default:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope.getClass();
                reusableGraphicsLayerScope.setTranslationY(reusableGraphicsLayerScope.graphicsDensity.getDensity() * f2);
                reusableGraphicsLayerScope.setAlpha(f);
                break;
        }
        return Unit.INSTANCE;
    }
}
