package w7;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import v7.AbstractC5115f;

/* renamed from: w7.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5161i extends AbstractC5115f implements Serializable {

    /* renamed from: u, reason: collision with root package name */
    public static final C5161i f41748u;

    /* renamed from: n, reason: collision with root package name */
    public final C5158f f41749n;

    static {
        C5158f c5158f = C5158f.f41731G;
        f41748u = new C5161i(C5158f.f41731G);
    }

    public C5161i(C5158f backing) {
        kotlin.jvm.internal.h.e(backing, "backing");
        this.f41749n = backing;
    }

    @Override // v7.AbstractC5115f
    public final int a() {
        return this.f41749n.f41733B;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f41749n.a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        this.f41749n.d();
        return super.addAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f41749n.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f41749n.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f41749n.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C5158f c5158f = this.f41749n;
        c5158f.getClass();
        return new C5156d(c5158f, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C5158f c5158f = this.f41749n;
        c5158f.d();
        int i = c5158f.i(obj);
        if (i < 0) {
            return false;
        }
        c5158f.m(i);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        this.f41749n.d();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        this.f41749n.d();
        return super.retainAll(elements);
    }

    public C5161i() {
        this(new C5158f());
    }
}
