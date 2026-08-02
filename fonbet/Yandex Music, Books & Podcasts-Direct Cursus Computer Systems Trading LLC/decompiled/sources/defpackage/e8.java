package defpackage;

import com.google.common.cache.b;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class e8 extends AbstractCollection {
    public final /* synthetic */ int a;
    public final Object b;

    public e8(p7 p7Var) {
        this.a = 3;
        this.b = p7Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.a) {
            case 0:
                ((y7) this.b).c();
                break;
            case 1:
                ((xk5) this.b).clear();
                break;
            case 2:
                ((b) this.b).clear();
                break;
            default:
                ((p7) this.b).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                return ((y7) this.b).b(obj);
            case 1:
            default:
                return super.contains(obj);
            case 2:
                return ((b) this.b).containsValue(obj);
            case 3:
                return ((p7) this.b).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.a) {
            case 2:
                return ((b) this.b).isEmpty();
            case 3:
                return ((p7) this.b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new m7((y7) this.b);
            case 1:
                xk5 xk5Var = (xk5) this.b;
                Map c = xk5Var.c();
                return c != null ? c.values().iterator() : new uk5(xk5Var, 2);
            case 2:
                return new whg((b) this.b, 2);
            default:
                return new rah(((p7) this.b).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.a) {
            case 3:
                p7 p7Var = (p7) this.b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    for (Map.Entry entry : p7Var.entrySet()) {
                        if (hdg.S(obj, entry.getValue())) {
                            p7Var.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.a) {
            case 3:
                p7 p7Var = (p7) this.b;
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : p7Var.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return p7Var.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.a) {
            case 3:
                p7 p7Var = (p7) this.b;
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : p7Var.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return p7Var.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.a) {
            case 0:
                return ((y7) this.b).e;
            case 1:
                return ((xk5) this.b).size();
            case 2:
                return ((b) this.b).size();
            default:
                return ((p7) this.b).c.size();
        }
    }

    public /* synthetic */ e8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
