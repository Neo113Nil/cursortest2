package com.gamericefishpro.space.b1;

import com.gamericefishpro.space.t0.l1;
import com.gamericefishpro.space.t0.o1;
import com.gamericefishpro.space.t0.v2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends com.gamericefishpro.space.y0.b implements l1 {
    public static final l z = new l(com.gamericefishpro.space.y0.i.e, 0);

    @Override // com.gamericefishpro.space.y0.b, com.gamericefishpro.space.ph.i, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof o1) {
            return super.containsKey((o1) obj);
        }
        return false;
    }

    @Override // com.gamericefishpro.space.ph.i, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof v2) {
            return super.containsValue((v2) obj);
        }
        return false;
    }

    @Override // com.gamericefishpro.space.y0.b, com.gamericefishpro.space.ph.i, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof o1) {
            return (v2) super.get((o1) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof o1) ? obj2 : (v2) super.getOrDefault((o1) obj, (v2) obj2);
    }

    public final l i(o1 o1Var, v2 v2Var) {
        com.gamericefishpro.space.c2.c cVarU = this.v.u(o1Var.hashCode(), 0, o1Var, v2Var);
        return cVarU == null ? this : new l((com.gamericefishpro.space.y0.i) cVarU.e, this.w + cVarU.d);
    }
}
