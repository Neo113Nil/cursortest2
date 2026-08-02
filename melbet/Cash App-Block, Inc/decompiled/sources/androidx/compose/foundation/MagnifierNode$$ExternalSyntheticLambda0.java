package androidx.compose.foundation;

import androidx.compose.ui.geometry.Offset;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class MagnifierNode$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MagnifierNode f$0;

    public /* synthetic */ MagnifierNode$$ExternalSyntheticLambda0(MagnifierNode magnifierNode, int i) {
        this.$r8$classId = i;
        this.f$0 = magnifierNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        MagnifierNode magnifierNode = this.f$0;
        switch (i) {
            case 0:
                magnifierNode.updateMagnifier();
                return Unit.INSTANCE;
            default:
                return new Offset(magnifierNode.sourceCenterInRoot);
        }
    }
}
