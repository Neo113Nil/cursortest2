package androidx.compose.ui.tooling.data;

import androidx.compose.ui.unit.IntRect;
import java.util.Collection;

/* loaded from: classes3.dex */
public abstract class Group {
    public final IntRect box;
    public final Collection children;
    public final Collection data;
    public final Object identity;
    public final Object key;
    public final SourceLocation location;
    public final String name;

    public Group(Object obj, String str, SourceLocation sourceLocation, Object obj2, IntRect intRect, Collection collection, Collection collection2) {
        this.key = obj;
        this.name = str;
        this.location = sourceLocation;
        this.identity = obj2;
        this.box = intRect;
        this.data = collection;
        this.children = collection2;
    }
}
