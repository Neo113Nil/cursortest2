package com.gamericefishpro.space.b1;

import com.gamericefishpro.space.t0.x1;
import com.gamericefishpro.space.t0.y1;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements x1 {
    public final Set d;
    public final com.gamericefishpro.space.v0.e e = new com.gamericefishpro.space.v0.e(new y1[16]);

    public j(Set set) {
        this.d = set;
    }

    @Override // com.gamericefishpro.space.t0.x1
    public final void a() {
        com.gamericefishpro.space.v0.e eVar = this.e;
        Object[] objArr = eVar.d;
        int i = eVar.i;
        for (int i2 = 0; i2 < i; i2++) {
            x1 x1Var = ((y1) objArr[i2]).a;
            this.d.remove(x1Var);
            x1Var.a();
        }
    }

    @Override // com.gamericefishpro.space.t0.x1
    public final void d() {
    }

    @Override // com.gamericefishpro.space.t0.x1
    public final void e() {
    }
}
