package androidx.compose.material3;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/MinimumInteractiveModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/material3/MinimumInteractiveModifierNode;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MinimumInteractiveModifier extends ModifierNodeElement {
    public static final MinimumInteractiveModifier INSTANCE = new MinimumInteractiveModifier();

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new MinimumInteractiveModifierNode();
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.name = "minimumInteractiveComponentSize";
        inspectorInfo.properties.set("Reserves at least 48.dp in size to disambiguate touch interactions if the element would measure smaller", "README");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final /* bridge */ /* synthetic */ void update(Modifier.Node node) {
    }
}
