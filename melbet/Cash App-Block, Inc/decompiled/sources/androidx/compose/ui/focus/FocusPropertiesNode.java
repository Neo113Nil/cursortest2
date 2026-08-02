package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;

/* loaded from: classes3.dex */
public final class FocusPropertiesNode extends Modifier.Node implements FocusPropertiesModifierNode {
    public FocusPropertiesKt$sam$androidx_compose_ui_focus_FocusPropertiesScope$0 focusPropertiesScope;

    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public final void applyFocusProperties(FocusProperties focusProperties) {
        this.focusPropertiesScope.function.invoke(focusProperties);
    }
}
