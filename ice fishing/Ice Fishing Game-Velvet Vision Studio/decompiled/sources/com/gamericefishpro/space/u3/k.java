package com.gamericefishpro.space.u3;

import com.gamericefishpro.space.h0.w0;
import com.gamericefishpro.space.w.o;
import com.gamericefishpro.space.w.r1;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements kotlin.coroutines.f, r1, com.gamericefishpro.space.c5.b {
    public List c(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (com.gamericefishpro.space.bb.b bVar : componentRegistrar.getComponents()) {
            String str = bVar.a;
            if (str != null) {
                bVar = new com.gamericefishpro.space.bb.b(str, bVar.b, bVar.c, bVar.d, bVar.e, new w0(7, str, bVar), bVar.g);
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }

    @Override // com.gamericefishpro.space.w.r1
    public int m() {
        return 0;
    }

    @Override // com.gamericefishpro.space.w.r1
    public int o() {
        return 0;
    }

    @Override // com.gamericefishpro.space.w.p1
    public o r(long j, o oVar, o oVar2, o oVar3) {
        return j < ((long) 0) * 1000000 ? oVar : oVar2;
    }

    @Override // com.gamericefishpro.space.w.p1
    public o f(long j, o oVar, o oVar2, o oVar3) {
        return oVar3;
    }
}
