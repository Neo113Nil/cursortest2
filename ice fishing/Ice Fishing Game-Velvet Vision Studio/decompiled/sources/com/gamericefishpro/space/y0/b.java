package com.gamericefishpro.space.y0;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class b extends com.gamericefishpro.space.ph.i {
    public static final b y = new b(i.e, 0);
    public final i v;
    public final int w;

    public b(i iVar, int i) {
        this.v = iVar;
        this.w = i;
    }

    @Override // com.gamericefishpro.space.ph.i
    public final Set a() {
        return new g(this, 0);
    }

    @Override // com.gamericefishpro.space.ph.i
    public final Set b() {
        return new g(this, 1);
    }

    @Override // com.gamericefishpro.space.ph.i
    public final int c() {
        return this.w;
    }

    @Override // com.gamericefishpro.space.ph.i, java.util.Map
    public boolean containsKey(Object obj) {
        return this.v.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // com.gamericefishpro.space.ph.i
    public final Collection d() {
        return new com.gamericefishpro.space.mi.d(2, this);
    }

    @Override // com.gamericefishpro.space.ph.i, java.util.Map
    public Object get(Object obj) {
        return this.v.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final b h(Object obj, com.gamericefishpro.space.z0.a aVar) {
        com.gamericefishpro.space.c2.c cVarU = this.v.u(obj != null ? obj.hashCode() : 0, 0, obj, aVar);
        return cVarU == null ? this : new b((i) cVarU.e, this.w + cVarU.d);
    }
}
