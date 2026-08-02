package androidx.compose.ui.platform;

import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.input.pointer.HoverIconModifierNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes3.dex */
public final class AndroidComposeView$focusSearch$searchResult$1 extends Lambda implements Function1 {
    public final /* synthetic */ Ref$ObjectRef $focusTarget;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AndroidComposeView$focusSearch$searchResult$1(int i, Ref$ObjectRef ref$ObjectRef) {
        super(1);
        this.$r8$classId = i;
        this.$focusTarget = ref$ObjectRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Ref$ObjectRef ref$ObjectRef = this.$focusTarget;
        switch (i) {
            case 0:
                ref$ObjectRef.element = (FocusTargetNode) obj;
                break;
            default:
                HoverIconModifierNode hoverIconModifierNode = (HoverIconModifierNode) obj;
                Object obj2 = ref$ObjectRef.element;
                if (obj2 == null && hoverIconModifierNode.cursorInBoundsOfNode) {
                    ref$ObjectRef.element = hoverIconModifierNode;
                } else if (obj2 != null) {
                    hoverIconModifierNode.getClass();
                }
                break;
        }
        return Boolean.TRUE;
    }
}
