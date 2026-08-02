package androidx.compose.ui.platform;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/TestTagElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/platform/TestTagNode;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class TestTagElement extends ModifierNodeElement {
    public final String tag;

    public TestTagElement(String str) {
        this.tag = str;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        TestTagNode testTagNode = new TestTagNode();
        testTagNode.tag = this.tag;
        return testTagNode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TestTagElement)) {
            return false;
        }
        return Intrinsics.areEqual(this.tag, ((TestTagElement) obj).tag);
    }

    public final int hashCode() {
        return this.tag.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("testTag");
        inspectorInfo.getProperties().set(this.tag, "tag");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        ((TestTagNode) node).tag = this.tag;
    }
}
