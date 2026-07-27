package w7;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import v7.AbstractC5125f;

/* renamed from: w7.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5162i extends AbstractC5125f implements Serializable {

    /* renamed from: u, reason: collision with root package name */
    public static final C5162i f41691u;

    /* renamed from: n, reason: collision with root package name */
    public final C5159f f41692n;

    static {
        C5159f c5159f = C5159f.f41674G;
        f41691u = new C5162i(C5159f.f41674G);
    }

    public C5162i(C5159f backing) {
        kotlin.jvm.internal.h.e(backing, "backing");
        this.f41692n = backing;
    }

    @Override // v7.AbstractC5125f
    public final int a() {
        return this.f41692n.f41676B;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f41692n.a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        this.f41692n.d();
        return super.addAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f41692n.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f41692n.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f41692n.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C5159f c5159f = this.f41692n;
        c5159f.getClass();
        return new C5157d(c5159f, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C5159f c5159f = this.f41692n;
        c5159f.d();
        int i = c5159f.i(obj);
        if (i < 0) {
            return false;
        }
        c5159f.m(i);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        this.f41692n.d();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        this.f41692n.d();
        return super.retainAll(elements);
    }

    public C5162i() {
        this(new C5159f());
    }
}
