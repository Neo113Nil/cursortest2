package androidx.compose.ui.platform;

import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsNode;
import java.util.List;

/* loaded from: classes.dex */
public final class SemanticsNodeCopy {
    public final MutableIntSet children;
    public final SemanticsConfiguration unmergedConfig;

    public SemanticsNodeCopy(SemanticsNode semanticsNode, MutableIntObjectMap mutableIntObjectMap) {
        this.unmergedConfig = semanticsNode.unmergedConfig;
        List children$ui$default = SemanticsNode.getChildren$ui$default(semanticsNode, false, 4);
        this.children = new MutableIntSet(children$ui$default.size());
        int size = children$ui$default.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode2 = (SemanticsNode) children$ui$default.get(i);
            if (mutableIntObjectMap.containsKey(semanticsNode2.id)) {
                this.children.add(semanticsNode2.id);
            }
        }
    }
}
