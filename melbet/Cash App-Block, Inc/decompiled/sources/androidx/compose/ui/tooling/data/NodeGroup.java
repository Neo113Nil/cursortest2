package androidx.compose.ui.tooling.data;

import androidx.compose.ui.unit.IntRect;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class NodeGroup extends Group {
    public final List modifierInfo;
    public final Object node;

    public NodeGroup(Object obj, Object obj2, IntRect intRect, ArrayList arrayList, List list, ArrayList arrayList2) {
        super(obj, null, null, null, intRect, arrayList, arrayList2);
        this.node = obj2;
        this.modifierInfo = list;
    }
}
