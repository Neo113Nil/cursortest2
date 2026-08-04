package com.gamericefishpro.space.z0;

import com.gamericefishpro.space.li.e;
import com.gamericefishpro.space.ph.o;
import com.gamericefishpro.space.w0.c;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends o implements c {
    public static final b w;
    public final Object e;
    public final Object i;
    public final com.gamericefishpro.space.y0.b v;

    static {
        com.gamericefishpro.space.a1.b bVar = com.gamericefishpro.space.a1.b.a;
        w = new b(bVar, bVar, com.gamericefishpro.space.y0.b.y);
    }

    public b(Object obj, Object obj2, com.gamericefishpro.space.y0.b bVar) {
        this.e = obj;
        this.i = obj2;
        this.v = bVar;
    }

    @Override // com.gamericefishpro.space.ph.a
    public final int b() {
        return this.v.c();
    }

    @Override // com.gamericefishpro.space.ph.a, java.util.Collection
    public final boolean contains(Object obj) {
        return this.v.containsKey(obj);
    }

    @Override // com.gamericefishpro.space.ph.o, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new e(this.e, this.v);
    }
}
