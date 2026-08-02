package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes3.dex */
public class v7 extends q7 implements SortedSet {
    public final /* synthetic */ ygi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(ygi ygiVar, SortedMap sortedMap) {
        super(ygiVar, sortedMap);
        this.c = ygiVar;
    }

    public SortedMap a() {
        return (SortedMap) this.a;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return a().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return a().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new v7(this.c, a().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return a().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new v7(this.c, a().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new v7(this.c, a().tailMap(obj));
    }
}
