package androidx.compose.ui.viewinterop;

import android.view.View;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusInteropUtils_androidKt;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;

/* loaded from: classes.dex */
public final class FocusTargetPropertiesNode extends Modifier.Node implements FocusPropertiesModifierNode {
    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public final void applyFocusProperties(FocusProperties focusProperties) {
        View access$getEmbeddedView = AndroidView_androidKt.access$getEmbeddedView(this);
        focusProperties.setCanFocus(getNode().isAttached() && AndroidView_androidKt.access$getEmbeddedView(this).hasFocusable());
        View findFocus = access$getEmbeddedView.findFocus();
        if (findFocus != null) {
            focusProperties.setFocusRect(FocusInteropUtils_androidKt.calculateFocusRectRelativeTo(findFocus, access$getEmbeddedView));
        }
    }
}
