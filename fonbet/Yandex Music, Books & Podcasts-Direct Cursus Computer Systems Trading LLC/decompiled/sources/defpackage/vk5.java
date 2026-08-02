package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class vk5 extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ xk5 b;

    public /* synthetic */ vk5(xk5 xk5Var, int i) {
        this.a = i;
        this.b = xk5Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.a) {
            case 0:
                this.b.clear();
                break;
            default:
                this.b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                xk5 xk5Var = this.b;
                Map c = xk5Var.c();
                if (c != null) {
                    return c.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int e = xk5Var.e(entry.getKey());
                    if (e != -1 && hdg.S(xk5Var.l()[e], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                xk5 xk5Var = this.b;
                Map c = xk5Var.c();
                return c != null ? c.entrySet().iterator() : new uk5(xk5Var, 1);
            default:
                xk5 xk5Var2 = this.b;
                Map c2 = xk5Var2.c();
                return c2 != null ? c2.keySet().iterator() : new uk5(xk5Var2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                xk5 xk5Var = this.b;
                Map c = xk5Var.c();
                if (c != null) {
                    return c.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!xk5Var.h()) {
                        int d = xk5Var.d();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = xk5Var.a;
                        Objects.requireNonNull(obj2);
                        int U = vwb.U(key, value, d, obj2, xk5Var.j(), xk5Var.k(), xk5Var.l());
                        if (U != -1) {
                            xk5Var.g(U, d);
                            xk5Var.f--;
                            xk5Var.e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                xk5 xk5Var2 = this.b;
                Map c2 = xk5Var2.c();
                return c2 != null ? c2.keySet().remove(obj) : xk5Var2.i(obj) != xk5.j;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.a) {
        }
        return this.b.size();
    }
}
