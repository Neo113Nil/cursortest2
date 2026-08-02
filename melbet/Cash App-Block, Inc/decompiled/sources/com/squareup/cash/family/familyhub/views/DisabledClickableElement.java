package com.squareup.cash.family.familyhub.views;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/squareup/cash/family/familyhub/views/DisabledClickableElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lcom/squareup/cash/family/familyhub/views/DisabledClickableNode;", "views"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* data */ class DisabledClickableElement extends ModifierNodeElement {
    public final boolean enabled;
    public final Function0 onClick;

    public DisabledClickableElement(Function0 function0, boolean z) {
        function0.getClass();
        this.enabled = z;
        this.onClick = function0;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new DisabledClickableNode(this.onClick, this.enabled);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DisabledClickableElement)) {
            return false;
        }
        DisabledClickableElement disabledClickableElement = (DisabledClickableElement) obj;
        return this.enabled == disabledClickableElement.enabled && Intrinsics.areEqual(this.onClick, disabledClickableElement.onClick);
    }

    public final int hashCode() {
        return this.onClick.hashCode() + (Boolean.hashCode(this.enabled) * 31);
    }

    public final String toString() {
        return "DisabledClickableElement(enabled=" + this.enabled + ", onClick=" + this.onClick + ")";
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        DisabledClickableNode disabledClickableNode = (DisabledClickableNode) node;
        disabledClickableNode.getClass();
        Function0 function0 = this.onClick;
        function0.getClass();
        disabledClickableNode.enabled = this.enabled;
        disabledClickableNode.onClick = function0;
    }
}
