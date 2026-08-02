package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes3.dex */
public class u7 extends p7 implements SortedMap {
    public SortedSet e;
    public final /* synthetic */ ygi f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(ygi ygiVar, SortedMap sortedMap) {
        super(ygiVar, sortedMap);
        this.f = ygiVar;
    }

    public SortedSet b() {
        return new v7(this.f, d());
    }

    @Override // defpackage.p7, java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.e;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet b = b();
        this.e = b;
        return b;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.c;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new u7(this.f, d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new u7(this.f, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new u7(this.f, d().tailMap(obj));
    }
}
