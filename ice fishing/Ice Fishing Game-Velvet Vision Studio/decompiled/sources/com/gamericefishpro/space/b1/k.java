package com.gamericefishpro.space.b1;

import com.gamericefishpro.space.t0.o1;
import com.gamericefishpro.space.t0.v2;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends com.gamericefishpro.space.ph.l {
    public com.gamericefishpro.space.a1.b d = new com.gamericefishpro.space.a1.b();
    public com.gamericefishpro.space.y0.i e;
    public Object i;
    public int v;
    public int w;
    public l y;

    public k(l lVar) {
        this.e = lVar.v;
        this.w = lVar.w;
        this.y = lVar;
    }

    @Override // com.gamericefishpro.space.ph.l
    public final Set a() {
        return new com.gamericefishpro.space.y0.e(0, this);
    }

    @Override // com.gamericefishpro.space.ph.l
    public final Set b() {
        return new com.gamericefishpro.space.y0.e(1, this);
    }

    @Override // com.gamericefishpro.space.ph.l
    public final int c() {
        return this.w;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.e = com.gamericefishpro.space.y0.i.e;
        k(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof o1) {
            return h((o1) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof v2) {
            return super.containsValue((v2) obj);
        }
        return false;
    }

    @Override // com.gamericefishpro.space.ph.l
    public final Collection d() {
        return new com.gamericefishpro.space.qh.k(this);
    }

    public final l f() {
        com.gamericefishpro.space.y0.i iVar = this.e;
        l lVar = this.y;
        if (iVar != lVar.v) {
            this.d = new com.gamericefishpro.space.a1.b();
            lVar = new l(this.e, c());
        }
        this.y = lVar;
        return lVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof o1) {
            return (v2) i((o1) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof o1) ? obj2 : (v2) super.getOrDefault((o1) obj, (v2) obj2);
    }

    public final boolean h(Object obj) {
        return this.e.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final Object i(Object obj) {
        return this.e.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final Object j(Object obj) {
        this.i = null;
        com.gamericefishpro.space.y0.i iVarN = this.e.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (iVarN == null) {
            iVarN = com.gamericefishpro.space.y0.i.e;
        }
        this.e = iVarN;
        return this.i;
    }

    public final void k(int i) {
        this.w = i;
        this.v++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.i = null;
        this.e = this.e.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        com.gamericefishpro.space.y0.b bVarF = null;
        com.gamericefishpro.space.y0.b bVar = map instanceof com.gamericefishpro.space.y0.b ? (com.gamericefishpro.space.y0.b) map : null;
        if (bVar == null) {
            k kVar = map instanceof k ? (k) map : null;
            if (kVar != null) {
                bVarF = kVar.f();
            }
        } else {
            bVarF = bVar;
        }
        if (bVarF == null) {
            super.putAll(map);
            return;
        }
        com.gamericefishpro.space.a1.a aVar = new com.gamericefishpro.space.a1.a();
        aVar.a = 0;
        int i = this.w;
        com.gamericefishpro.space.y0.i iVar = this.e;
        com.gamericefishpro.space.y0.i iVar2 = bVarF.v;
        Intrinsics.c(iVar2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.e = iVar.m(iVar2, 0, aVar, this);
        int i2 = (bVarF.w + i) - aVar.a;
        if (i != i2) {
            k(i2);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int iC = c();
        com.gamericefishpro.space.y0.i iVarO = this.e.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (iVarO == null) {
            iVarO = com.gamericefishpro.space.y0.i.e;
        }
        this.e = iVarO;
        return iC != c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof o1) {
            return (v2) j((o1) obj);
        }
        return null;
    }
}
