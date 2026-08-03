package s;

import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f extends q0 implements Map {

    /* renamed from: j, reason: collision with root package name */
    public a f6258j;

    /* renamed from: k, reason: collision with root package name */
    public c f6259k;

    /* renamed from: l, reason: collision with root package name */
    public e f6260l;

    @Override // java.util.Map
    public final Set entrySet() {
        a aVar = this.f6258j;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(this);
        this.f6258j = aVar2;
        return aVar2;
    }

    public final boolean i(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean j(Collection collection) {
        int i10 = this.f6325i;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i10 != this.f6325i;
    }

    @Override // java.util.Map
    public final Set keySet() {
        c cVar = this.f6259k;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c(this);
        this.f6259k = cVar2;
        return cVar2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.f6325i;
        int i10 = this.f6325i;
        int[] iArr = this.f6323g;
        if (iArr.length < size) {
            int[] copyOf = Arrays.copyOf(iArr, size);
            pc.j.d(copyOf, "copyOf(...)");
            this.f6323g = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f6324h, size * 2);
            pc.j.d(copyOf2, "copyOf(...)");
            this.f6324h = copyOf2;
        }
        if (this.f6325i != i10) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        e eVar = this.f6260l;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(this);
        this.f6260l = eVar2;
        return eVar2;
    }
}
