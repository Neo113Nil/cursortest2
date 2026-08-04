package com.gamericefishpro.space.i9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class v9 extends h {
    public final boolean i;
    public final boolean v;
    public final /* synthetic */ h4 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v9(h4 h4Var, boolean z, boolean z2) {
        super("log");
        this.w = h4Var;
        this.i = z;
        this.v = z2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0081  */
    /* JADX WARN: Code duplicated, block: B:22:0x0092  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a1 A[LOOP:0: B:23:0x0097->B:25:0x00a1, LOOP_END] */
    @Override // com.gamericefishpro.space.i9.h
    public final n a(com.gamericefishpro.space.u6.n nVar, List list) {
        int i;
        int i2;
        String strM;
        ArrayList arrayList;
        a4.L("log", list, 1);
        int size = list.size();
        r rVar = n.j;
        h4 h4Var = this.w;
        if (size == 1) {
            ((com.gamericefishpro.space.m.d) h4Var.v).E(3, ((t) nVar.e).c(nVar, (n) list.get(0)).m(), Collections.EMPTY_LIST, this.i, this.v);
            return rVar;
        }
        n nVar2 = (n) list.get(0);
        t tVar = (t) nVar.e;
        t tVar2 = (t) nVar.e;
        int iQ = a4.Q(tVar.c(nVar, nVar2).c().doubleValue());
        if (iQ != 2) {
            i = 3;
            if (iQ == 3) {
                i2 = 1;
            } else if (iQ == 5) {
                i2 = 5;
            } else if (iQ == 6) {
                i2 = 2;
            }
            strM = tVar2.c(nVar, (n) list.get(1)).m();
            if (list.size() == 2) {
                ((com.gamericefishpro.space.m.d) h4Var.v).E(i2, strM, Collections.EMPTY_LIST, this.i, this.v);
                return rVar;
            }
            arrayList = new ArrayList();
            for (int i3 = 2; i3 < Math.min(list.size(), 5); i3++) {
                arrayList.add(tVar2.c(nVar, (n) list.get(i3)).m());
            }
            ((com.gamericefishpro.space.m.d) h4Var.v).E(i2, strM, arrayList, this.i, this.v);
            return rVar;
        }
        i = 4;
        i2 = i;
        strM = tVar2.c(nVar, (n) list.get(1)).m();
        if (list.size() == 2) {
            ((com.gamericefishpro.space.m.d) h4Var.v).E(i2, strM, Collections.EMPTY_LIST, this.i, this.v);
            return rVar;
        }
        arrayList = new ArrayList();
        while (i3 < Math.min(list.size(), 5)) {
            arrayList.add(tVar2.c(nVar, (n) list.get(i3)).m());
        }
        ((com.gamericefishpro.space.m.d) h4Var.v).E(i2, strM, arrayList, this.i, this.v);
        return rVar;
    }
}
