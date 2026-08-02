package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class FocusChangedNode extends Modifier.Node implements FocusEventModifierNode {
    public FocusStateImpl focusState;
    public Function1 onFocusChanged;

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public final void onFocusEvent(FocusStateImpl focusStateImpl) {
        if (Intrinsics.areEqual(this.focusState, focusStateImpl)) {
            return;
        }
        this.focusState = focusStateImpl;
        this.onFocusChanged.invoke(focusStateImpl);
    }
}
