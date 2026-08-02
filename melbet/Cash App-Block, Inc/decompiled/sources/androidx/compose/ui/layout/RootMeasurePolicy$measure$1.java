package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class RootMeasurePolicy$measure$1 extends Lambda implements Function1 {
    public static final RootMeasurePolicy$measure$1 INSTANCE;
    public static final RootMeasurePolicy$measure$1 INSTANCE$1;
    public static final RootMeasurePolicy$measure$1 INSTANCE$2;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 1;
        INSTANCE$1 = new RootMeasurePolicy$measure$1(i, 1);
        INSTANCE$2 = new RootMeasurePolicy$measure$1(i, 2);
        INSTANCE = new RootMeasurePolicy$measure$1(i, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RootMeasurePolicy$measure$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                break;
            case 1:
                ((LayoutNode) obj).isVirtualLookaheadRoot = true;
                break;
            default:
                break;
        }
        return Unit.INSTANCE;
    }
}
