package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import yads.nx;

/* loaded from: classes7.dex */
public final class rh71 extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ nx b;

    public /* synthetic */ rh71(nx nxVar, int i) {
        this.a = i;
        this.b = nxVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.a;
        nx nxVar = this.b;
        switch (i) {
            case 0:
                nxVar.clear();
                break;
            default:
                nxVar.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.a;
        nx nxVar = this.b;
        switch (i) {
            case 0:
                Map f = nxVar.f();
                if (f != null) {
                    return f.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int b = nxVar.b(entry.getKey());
                    if (b != -1 && tja1.a(nxVar.h(b), entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return nxVar.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.a;
        nx nxVar = this.b;
        switch (i) {
            case 0:
                Map f = nxVar.f();
                return f != null ? f.entrySet().iterator() : new d871(nxVar, 1);
            default:
                Map f2 = nxVar.f();
                return f2 != null ? f2.keySet().iterator() : new d871(nxVar, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.a;
        nx nxVar = this.b;
        switch (i) {
            case 0:
                Map f = nxVar.f();
                if (f == null) {
                    if (obj instanceof Map.Entry) {
                        Map.Entry entry = (Map.Entry) obj;
                        if (!nxVar.j()) {
                            int i2 = (1 << (nxVar.x & 31)) - 1;
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            Object obj2 = nxVar.a;
                            Objects.requireNonNull(obj2);
                            int[] iArr = nxVar.b;
                            Objects.requireNonNull(iArr);
                            Object[] objArr = nxVar.c;
                            Objects.requireNonNull(objArr);
                            Object[] objArr2 = nxVar.w;
                            Objects.requireNonNull(objArr2);
                            int b = jha1.b(key, value, i2, obj2, iArr, objArr, objArr2);
                            if (b != -1) {
                                nxVar.g(b, i2);
                                nxVar.y--;
                                nxVar.x += 32;
                                break;
                            }
                        }
                    }
                } else {
                    break;
                }
                break;
            default:
                Map f2 = nxVar.f();
                if (f2 == null) {
                    if (nxVar.i(obj) != nx.C) {
                        break;
                    }
                } else {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.a;
        nx nxVar = this.b;
        switch (i) {
        }
        return nxVar.size();
    }
}
