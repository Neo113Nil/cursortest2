package androidx.compose.ui.semantics;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class SemanticsSortKt$UnmergedConfigComparator$1 extends Lambda implements Function2 {
    public static final SemanticsSortKt$UnmergedConfigComparator$1 INSTANCE;
    public static final SemanticsSortKt$UnmergedConfigComparator$1 INSTANCE$1;
    public static final SemanticsSortKt$UnmergedConfigComparator$1 INSTANCE$2;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 2;
        INSTANCE$1 = new SemanticsSortKt$UnmergedConfigComparator$1(i, 1);
        INSTANCE$2 = new SemanticsSortKt$UnmergedConfigComparator$1(i, 2);
        INSTANCE = new SemanticsSortKt$UnmergedConfigComparator$1(i, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SemanticsSortKt$UnmergedConfigComparator$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                SemanticsNode semanticsNode = (SemanticsNode) obj2;
                Object valueOf = Float.valueOf(RecyclerView.DECELERATION_RATE);
                SemanticsConfiguration semanticsConfiguration = ((SemanticsNode) obj).unmergedConfig;
                SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.TraversalIndex;
                Object obj3 = semanticsConfiguration.props.get(semanticsPropertyKey);
                if (obj3 == null) {
                    obj3 = valueOf;
                }
                float floatValue = ((Number) obj3).floatValue();
                Object obj4 = semanticsNode.unmergedConfig.props.get(semanticsPropertyKey);
                if (obj4 != null) {
                    valueOf = obj4;
                }
                return Integer.valueOf(Float.compare(floatValue, ((Number) valueOf).floatValue()));
            case 1:
                return (String) obj;
            default:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
        }
    }
}
