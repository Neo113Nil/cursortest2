package w7;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import v7.AbstractC5125f;

/* renamed from: w7.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5160g extends AbstractC5125f {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f41688n;

    /* renamed from: u, reason: collision with root package name */
    public final C5159f f41689u;

    public /* synthetic */ C5160g(C5159f c5159f, int i) {
        this.f41688n = i;
        this.f41689u = c5159f;
    }

    @Override // v7.AbstractC5125f
    public final int a() {
        switch (this.f41688n) {
        }
        return this.f41689u.f41676B;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f41688n) {
            case 0:
                Map.Entry element = (Map.Entry) obj;
                kotlin.jvm.internal.h.e(element, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        switch (this.f41688n) {
            case 0:
                kotlin.jvm.internal.h.e(elements, "elements");
                throw new UnsupportedOperationException();
            default:
                kotlin.jvm.internal.h.e(elements, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f41688n) {
            case 0:
                this.f41689u.clear();
                break;
            default:
                this.f41689u.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f41688n) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry element = (Map.Entry) obj;
                kotlin.jvm.internal.h.e(element, "element");
                return this.f41689u.g(element);
            default:
                return this.f41689u.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        switch (this.f41688n) {
            case 0:
                kotlin.jvm.internal.h.e(elements, "elements");
                return this.f41689u.f(elements);
            default:
                return super.containsAll(elements);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f41688n) {
        }
        return this.f41689u.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f41688n) {
            case 0:
                C5159f c5159f = this.f41689u;
                c5159f.getClass();
                return new C5157d(c5159f, 0);
            default:
                C5159f c5159f2 = this.f41689u;
                c5159f2.getClass();
                return new C5157d(c5159f2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f41688n) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry element = (Map.Entry) obj;
                    kotlin.jvm.internal.h.e(element, "element");
                    C5159f c5159f = this.f41689u;
                    c5159f.getClass();
                    c5159f.d();
                    int i = c5159f.i(element.getKey());
                    if (i >= 0) {
                        Object[] objArr = c5159f.f41682u;
                        kotlin.jvm.internal.h.b(objArr);
                        if (kotlin.jvm.internal.h.a(objArr[i], element.getValue())) {
                            c5159f.m(i);
                            break;
                        }
                    }
                }
                break;
            default:
                C5159f c5159f2 = this.f41689u;
                c5159f2.d();
                int i6 = c5159f2.i(obj);
                if (i6 >= 0) {
                    c5159f2.m(i6);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        switch (this.f41688n) {
            case 0:
                kotlin.jvm.internal.h.e(elements, "elements");
                this.f41689u.d();
                break;
            default:
                kotlin.jvm.internal.h.e(elements, "elements");
                this.f41689u.d();
                break;
        }
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        switch (this.f41688n) {
            case 0:
                kotlin.jvm.internal.h.e(elements, "elements");
                this.f41689u.d();
                break;
            default:
                kotlin.jvm.internal.h.e(elements, "elements");
                this.f41689u.d();
                break;
        }
        return super.retainAll(elements);
    }
}
