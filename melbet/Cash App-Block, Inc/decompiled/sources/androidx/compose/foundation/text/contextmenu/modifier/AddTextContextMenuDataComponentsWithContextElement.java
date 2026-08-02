package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.squareup.cash.CashApp$$ExternalSyntheticLambda2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/modifier/AddTextContextMenuDataComponentsWithContextElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/contextmenu/modifier/AddTextContextMenuDataComponentsWithContextNode;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class AddTextContextMenuDataComponentsWithContextElement extends ModifierNodeElement {
    public final Function2 builder;

    public AddTextContextMenuDataComponentsWithContextElement(Function2 function2) {
        this.builder = function2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        AddTextContextMenuDataComponentsWithContextNode addTextContextMenuDataComponentsWithContextNode = new AddTextContextMenuDataComponentsWithContextNode();
        addTextContextMenuDataComponentsWithContextNode.builder = this.builder;
        CashApp$$ExternalSyntheticLambda2 cashApp$$ExternalSyntheticLambda2 = new CashApp$$ExternalSyntheticLambda2(addTextContextMenuDataComponentsWithContextNode, 7);
        AddTextContextMenuDataComponentsNode addTextContextMenuDataComponentsNode = new AddTextContextMenuDataComponentsNode();
        addTextContextMenuDataComponentsNode.builder = cashApp$$ExternalSyntheticLambda2;
        addTextContextMenuDataComponentsWithContextNode.delegate(addTextContextMenuDataComponentsNode);
        return addTextContextMenuDataComponentsWithContextNode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AddTextContextMenuDataComponentsWithContextElement) {
            return this.builder == ((AddTextContextMenuDataComponentsWithContextElement) obj).builder;
        }
        return false;
    }

    public final int hashCode() {
        return this.builder.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("addTextContextMenuDataComponentsWithResources");
        inspectorInfo.getProperties().set(this.builder, "builder");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        ((AddTextContextMenuDataComponentsWithContextNode) node).builder = this.builder;
    }
}
