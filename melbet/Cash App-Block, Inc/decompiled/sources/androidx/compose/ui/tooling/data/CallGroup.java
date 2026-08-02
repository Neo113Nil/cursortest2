package androidx.compose.ui.tooling.data;

import androidx.compose.ui.unit.IntRect;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class CallGroup extends Group {
    public final List parameters;

    public CallGroup(Object obj, String str, IntRect intRect, SourceLocation sourceLocation, Object obj2, List list, ArrayList arrayList, ArrayList arrayList2) {
        super(obj, str, sourceLocation, obj2, intRect, arrayList, arrayList2);
        this.parameters = list;
    }
}
