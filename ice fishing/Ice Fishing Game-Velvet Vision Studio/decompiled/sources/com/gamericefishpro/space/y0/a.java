package com.gamericefishpro.space.y0;

import com.gamericefishpro.space.t.s;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends s implements com.gamericefishpro.space.fi.d {
    public final com.gamericefishpro.space.ph.h v;
    public Object w;

    public a(com.gamericefishpro.space.ph.h hVar, Object obj, Object obj2) {
        super(1, obj, obj2);
        this.v = hVar;
        this.w = obj2;
    }

    @Override // com.gamericefishpro.space.t.s, java.util.Map.Entry
    public final Object getValue() {
        return this.w;
    }

    @Override // com.gamericefishpro.space.t.s, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.w;
        this.w = obj;
        d dVar = (d) this.v.e;
        com.gamericefishpro.space.b1.k kVar = dVar.v;
        Object obj3 = this.e;
        if (!kVar.containsKey(obj3)) {
            return obj2;
        }
        boolean z = dVar.i;
        if (!z) {
            kVar.put(obj3, obj);
        } else {
            if (!z) {
                throw new NoSuchElementException();
            }
            j jVar = dVar.d[dVar.e];
            Object obj4 = jVar.d[jVar.i];
            kVar.put(obj3, obj);
            dVar.c(obj4 != null ? obj4.hashCode() : 0, kVar.e, obj4, 0);
        }
        dVar.z = kVar.v;
        return obj2;
    }
}
