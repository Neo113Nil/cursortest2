package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class LookaheadScopeKt$LookaheadScope$1$1 extends Lambda implements Function0 {
    public static final LookaheadScopeKt$LookaheadScope$1$1 INSTANCE;
    public static final LookaheadScopeKt$LookaheadScope$1$1 INSTANCE$1;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 0;
        INSTANCE = new LookaheadScopeKt$LookaheadScope$1$1(i, 0);
        INSTANCE$1 = new LookaheadScopeKt$LookaheadScope$1$1(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LookaheadScopeKt$LookaheadScope$1$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return new LayoutNode(2);
            default:
                return null;
        }
    }
}
