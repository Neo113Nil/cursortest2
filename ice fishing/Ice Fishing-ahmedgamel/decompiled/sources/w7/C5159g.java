package w7;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import v7.AbstractC5115f;

/* renamed from: w7.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5159g extends AbstractC5115f {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f41745n;

    /* renamed from: u, reason: collision with root package name */
    public final C5158f f41746u;

    public /* synthetic */ C5159g(C5158f c5158f, int i) {
        this.f41745n = i;
        this.f41746u = c5158f;
    }

    @Override // v7.AbstractC5115f
    public final int a() {
        switch (this.f41745n) {
        }
        return this.f41746u.f41733B;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f41745n) {
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
        switch (this.f41745n) {
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
        switch (this.f41745n) {
            case 0:
                this.f41746u.clear();
                break;
            default:
                this.f41746u.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f41745n) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry element = (Map.Entry) obj;
                kotlin.jvm.internal.h.e(element, "element");
                return this.f41746u.g(element);
            default:
                return this.f41746u.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        switch (this.f41745n) {
            case 0:
                kotlin.jvm.internal.h.e(elements, "elements");
                return this.f41746u.f(elements);
            default:
                return super.containsAll(elements);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f41745n) {
        }
        return this.f41746u.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f41745n) {
            case 0:
                C5158f c5158f = this.f41746u;
                c5158f.getClass();
                return new C5156d(c5158f, 0);
            default:
                C5158f c5158f2 = this.f41746u;
                c5158f2.getClass();
                return new C5156d(c5158f2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f41745n) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry element = (Map.Entry) obj;
                    kotlin.jvm.internal.h.e(element, "element");
                    C5158f c5158f = this.f41746u;
                    c5158f.getClass();
                    c5158f.d();
                    int i = c5158f.i(element.getKey());
                    if (i >= 0) {
                        Object[] objArr = c5158f.f41739u;
                        kotlin.jvm.internal.h.b(objArr);
                        if (kotlin.jvm.internal.h.a(objArr[i], element.getValue())) {
                            c5158f.m(i);
                            break;
                        }
                    }
                }
                break;
            default:
                C5158f c5158f2 = this.f41746u;
                c5158f2.d();
                int i4 = c5158f2.i(obj);
                if (i4 >= 0) {
                    c5158f2.m(i4);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        switch (this.f41745n) {
            case 0:
                kotlin.jvm.internal.h.e(elements, "elements");
                this.f41746u.d();
                break;
            default:
                kotlin.jvm.internal.h.e(elements, "elements");
                this.f41746u.d();
                break;
        }
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        switch (this.f41745n) {
            case 0:
                kotlin.jvm.internal.h.e(elements, "elements");
                this.f41746u.d();
                break;
            default:
                kotlin.jvm.internal.h.e(elements, "elements");
                this.f41746u.d();
                break;
        }
        return super.retainAll(elements);
    }
}
