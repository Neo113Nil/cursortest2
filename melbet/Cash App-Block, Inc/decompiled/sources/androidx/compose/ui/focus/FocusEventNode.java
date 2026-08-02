package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class FocusEventNode extends Modifier.Node implements FocusEventModifierNode {
    public Function1 onFocusEvent;

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public final void onFocusEvent(FocusStateImpl focusStateImpl) {
        this.onFocusEvent.invoke(focusStateImpl);
    }
}
