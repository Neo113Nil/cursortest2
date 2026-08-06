package j1;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.i;

/* renamed from: j1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0970d extends AbstractSet implements Set {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8056a;

    /* renamed from: b, reason: collision with root package name */
    public final C0969c f8057b;

    public C0970d(C0969c backing, int i2) {
        this.f8056a = i2;
        switch (i2) {
            case 1:
                i.e(backing, "backing");
                this.f8057b = backing;
                break;
            default:
                i.e(backing, "backing");
                this.f8057b = backing;
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f8056a) {
            case 0:
                Map.Entry element = (Map.Entry) obj;
                i.e(element, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        switch (this.f8056a) {
            case 0:
                i.e(elements, "elements");
                throw new UnsupportedOperationException();
            default:
                i.e(elements, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f8056a) {
            case 0:
                this.f8057b.clear();
                break;
            default:
                this.f8057b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f8056a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry element = (Map.Entry) obj;
                i.e(element, "element");
                return this.f8057b.e(element);
            default:
                return this.f8057b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        switch (this.f8056a) {
            case 0:
                i.e(elements, "elements");
                return this.f8057b.d(elements);
            default:
                return super.containsAll(elements);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f8056a) {
        }
        return this.f8057b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f8056a) {
            case 0:
                C0969c c0969c = this.f8057b;
                c0969c.getClass();
                return new C0967a(c0969c, 0);
            default:
                C0969c c0969c2 = this.f8057b;
                c0969c2.getClass();
                return new C0967a(c0969c2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f8056a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry element = (Map.Entry) obj;
                    i.e(element, "element");
                    C0969c c0969c = this.f8057b;
                    c0969c.getClass();
                    c0969c.b();
                    int g2 = c0969c.g(element.getKey());
                    if (g2 >= 0) {
                        Object[] objArr = c0969c.f8044b;
                        i.b(objArr);
                        if (i.a(objArr[g2], element.getValue())) {
                            c0969c.k(g2);
                            break;
                        }
                    }
                }
                break;
            default:
                C0969c c0969c2 = this.f8057b;
                c0969c2.b();
                int g3 = c0969c2.g(obj);
                if (g3 >= 0) {
                    c0969c2.k(g3);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        switch (this.f8056a) {
            case 0:
                i.e(elements, "elements");
                this.f8057b.b();
                break;
            default:
                i.e(elements, "elements");
                this.f8057b.b();
                break;
        }
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        switch (this.f8056a) {
            case 0:
                i.e(elements, "elements");
                this.f8057b.b();
                break;
            default:
                i.e(elements, "elements");
                this.f8057b.b();
                break;
        }
        return super.retainAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f8056a) {
        }
        return this.f8057b.f8051i;
    }
}
