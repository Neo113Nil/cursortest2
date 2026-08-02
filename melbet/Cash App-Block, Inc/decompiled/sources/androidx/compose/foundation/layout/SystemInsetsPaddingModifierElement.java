package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/SystemInsetsPaddingModifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/SystemInsetsPaddingModifierNode;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class SystemInsetsPaddingModifierElement extends ModifierNodeElement {
    public final Function1 insetsGetter;

    public SystemInsetsPaddingModifierElement(Function1 function1) {
        this.insetsGetter = function1;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        SystemInsetsPaddingModifierNode systemInsetsPaddingModifierNode = new SystemInsetsPaddingModifierNode(SpacerKt.EmptyWindowInsets);
        systemInsetsPaddingModifierNode.insetsGetter = this.insetsGetter;
        return systemInsetsPaddingModifierNode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SystemInsetsPaddingModifierElement) {
            return this.insetsGetter == ((SystemInsetsPaddingModifierElement) obj).insetsGetter;
        }
        return false;
    }

    public final int hashCode() {
        return this.insetsGetter.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        SystemInsetsPaddingModifierNode systemInsetsPaddingModifierNode = (SystemInsetsPaddingModifierNode) node;
        Function1 function1 = systemInsetsPaddingModifierNode.insetsGetter;
        Function1 function12 = this.insetsGetter;
        if (function1 != function12) {
            systemInsetsPaddingModifierNode.insetsGetter = function12;
            WindowInsetsHolder windowInsetsHolder = systemInsetsPaddingModifierNode.windowInsetsHolder;
            if (windowInsetsHolder != null) {
                WindowInsets windowInsets = (WindowInsets) function12.invoke(windowInsetsHolder);
                if (Intrinsics.areEqual(windowInsets, systemInsetsPaddingModifierNode.insets)) {
                    return;
                }
                systemInsetsPaddingModifierNode.insets = windowInsets;
                systemInsetsPaddingModifierNode.insetsInvalidated();
            }
        }
    }
}
