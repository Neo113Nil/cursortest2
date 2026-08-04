package com.gamericefishpro.space.k3;

import com.gamericefishpro.space.l3.n;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i extends d {
    public d[] p0 = new d[4];
    public int q0 = 0;

    public final void M(int i, n nVar, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.q0; i2++) {
            d dVar = this.p0[i2];
            ArrayList arrayList2 = nVar.a;
            if (!arrayList2.contains(dVar)) {
                arrayList2.add(dVar);
            }
        }
        for (int i3 = 0; i3 < this.q0; i3++) {
            com.gamericefishpro.space.l3.h.b(this.p0[i3], i, arrayList, nVar);
        }
    }

    public void N() {
    }
}
