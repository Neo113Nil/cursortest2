package androidx.compose.animation;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class SharedBoundsNode$draw$2 extends Lambda implements Function1 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ LayoutNodeDrawScope $this_draw;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedBoundsNode$draw$2(LayoutNodeDrawScope layoutNodeDrawScope, Rect rect, SharedElement sharedElement) {
        super(1);
        this.$this_draw = layoutNodeDrawScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        LayoutNodeDrawScope layoutNodeDrawScope = this.$this_draw;
        switch (i) {
            case 0:
                layoutNodeDrawScope.drawContent();
                break;
            default:
                layoutNodeDrawScope.drawContent();
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedBoundsNode$draw$2(LayoutNodeDrawScope layoutNodeDrawScope) {
        super(1);
        this.$this_draw = layoutNodeDrawScope;
    }
}
