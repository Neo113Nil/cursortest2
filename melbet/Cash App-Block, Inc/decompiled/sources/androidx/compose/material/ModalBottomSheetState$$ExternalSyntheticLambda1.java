package androidx.compose.material;

import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class ModalBottomSheetState$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Density f$0;

    public /* synthetic */ ModalBottomSheetState$$ExternalSyntheticLambda1(Density density, int i) {
        this.$r8$classId = i;
        this.f$0 = density;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float mo236toPx0680j_4;
        int i = this.$r8$classId;
        Density density = this.f$0;
        switch (i) {
            case 0:
                mo236toPx0680j_4 = density.mo236toPx0680j_4(125.0f);
                break;
            case 1:
                mo236toPx0680j_4 = density.mo236toPx0680j_4(125.0f);
                break;
            case 2:
                mo236toPx0680j_4 = density.mo236toPx0680j_4(125.0f);
                break;
            default:
                mo236toPx0680j_4 = density.mo236toPx0680j_4(125.0f);
                break;
        }
        return Float.valueOf(mo236toPx0680j_4);
    }
}
