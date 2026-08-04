package com.gamericefishpro.space.i9;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements n {
    @Override // com.gamericefishpro.space.i9.n
    public final Boolean b() {
        return Boolean.FALSE;
    }

    @Override // com.gamericefishpro.space.i9.n
    public final Double c() {
        return Double.valueOf(Double.NaN);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof r;
    }

    @Override // com.gamericefishpro.space.i9.n
    public final Iterator h() {
        return null;
    }

    @Override // com.gamericefishpro.space.i9.n
    public final n l(String str, com.gamericefishpro.space.u6.n nVar, ArrayList arrayList) {
        throw new IllegalStateException("Undefined has no function ".concat(str));
    }

    @Override // com.gamericefishpro.space.i9.n
    public final String m() {
        return "undefined";
    }

    @Override // com.gamericefishpro.space.i9.n
    public final n o() {
        return n.j;
    }
}
