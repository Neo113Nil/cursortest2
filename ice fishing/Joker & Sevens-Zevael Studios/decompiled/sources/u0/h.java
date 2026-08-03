package u0;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import m0.u1;
import m0.z2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h extends AbstractMap implements Map, qc.e {

    /* renamed from: g, reason: collision with root package name */
    public t0.b f6672g = new t0.b();

    /* renamed from: h, reason: collision with root package name */
    public r0.k f6673h;

    /* renamed from: i, reason: collision with root package name */
    public Object f6674i;

    /* renamed from: j, reason: collision with root package name */
    public int f6675j;

    /* renamed from: k, reason: collision with root package name */
    public int f6676k;

    /* renamed from: l, reason: collision with root package name */
    public i f6677l;

    public h(i iVar) {
        this.f6673h = iVar.f5902g;
        this.f6676k = iVar.f5903h;
        this.f6677l = iVar;
    }

    public final i a() {
        r0.k kVar = this.f6673h;
        i iVar = this.f6677l;
        if (kVar != iVar.f5902g) {
            this.f6672g = new t0.b();
            iVar = new i(this.f6673h, this.f6676k);
        }
        this.f6677l = iVar;
        return iVar;
    }

    public final boolean b(Object obj) {
        return this.f6673h.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final Object c(Object obj) {
        return this.f6673h.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f6673h = r0.k.f5916e;
        e(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof u1) {
            return b((u1) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof z2) {
            return super.containsValue((z2) obj);
        }
        return false;
    }

    public final Object d(Object obj) {
        this.f6674i = null;
        r0.k n7 = this.f6673h.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (n7 == null) {
            n7 = r0.k.f5916e;
        }
        this.f6673h = n7;
        return this.f6674i;
    }

    public final void e(int i10) {
        this.f6676k = i10;
        this.f6675j++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new r0.f(0, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof u1) {
            return (z2) c((u1) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof u1) ? obj2 : (z2) super.getOrDefault((u1) obj, (z2) obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new r0.f(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f6674i = null;
        this.f6673h = this.f6673h.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f6674i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [r0.c] */
    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        i iVar = null;
        i iVar2 = map instanceof r0.c ? (r0.c) map : null;
        if (iVar2 == null) {
            h hVar = map instanceof h ? (h) map : null;
            if (hVar != null) {
                iVar = hVar.a();
            }
        } else {
            iVar = iVar2;
        }
        if (iVar == null) {
            super.putAll(map);
            return;
        }
        t0.a aVar = new t0.a();
        aVar.f6510a = 0;
        int i10 = this.f6676k;
        r0.k kVar = this.f6673h;
        r0.k kVar2 = iVar.f5902g;
        pc.j.c(kVar2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f6673h = kVar.m(kVar2, 0, aVar, this);
        int i11 = (iVar.f5903h + i10) - aVar.f6510a;
        if (i10 != i11) {
            e(i11);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i10 = this.f6676k;
        r0.k o7 = this.f6673h.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (o7 == null) {
            o7 = r0.k.f5916e;
        }
        this.f6673h = o7;
        return i10 != this.f6676k;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f6676k;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new cc.i(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof u1) {
            return (z2) d((u1) obj);
        }
        return null;
    }
}
