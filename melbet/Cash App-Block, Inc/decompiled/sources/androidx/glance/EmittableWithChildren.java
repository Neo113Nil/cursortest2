package androidx.glance;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt__IndentKt;

/* loaded from: classes3.dex */
public abstract class EmittableWithChildren implements Emittable {
    public final ArrayList children;
    public int maxDepth;

    public EmittableWithChildren(int i, int i2) {
        this.maxDepth = (i2 & 1) != 0 ? Integer.MAX_VALUE : i;
        this.children = new ArrayList();
    }

    public final String childrenToString() {
        return StringsKt__IndentKt.prependIndent(CollectionsKt.joinToString$default(this.children, ",\n", null, null, 0, null, null, 62), "  ");
    }
}
