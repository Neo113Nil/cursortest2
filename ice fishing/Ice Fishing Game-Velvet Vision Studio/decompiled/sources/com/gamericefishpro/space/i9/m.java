package com.gamericefishpro.space.i9;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends h {
    public final ArrayList i;
    public final ArrayList v;
    public final com.gamericefishpro.space.u6.n w;

    public m(m mVar) {
        super(mVar.d);
        ArrayList arrayList = new ArrayList(mVar.i.size());
        this.i = arrayList;
        arrayList.addAll(mVar.i);
        ArrayList arrayList2 = new ArrayList(mVar.v.size());
        this.v = arrayList2;
        arrayList2.addAll(mVar.v);
        this.w = mVar.w;
    }

    @Override // com.gamericefishpro.space.i9.h
    public final n a(com.gamericefishpro.space.u6.n nVar, List list) {
        r rVar;
        com.gamericefishpro.space.u6.n nVarE = this.w.e();
        t tVar = (t) nVarE.e;
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.i;
            int size = arrayList.size();
            rVar = n.j;
            if (i2 >= size) {
                break;
            }
            if (i2 < list.size()) {
                nVarE.i((String) arrayList.get(i2), ((t) nVar.e).c(nVar, (n) list.get(i2)));
            } else {
                nVarE.i((String) arrayList.get(i2), rVar);
            }
            i2++;
        }
        ArrayList arrayList2 = this.v;
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj = arrayList2.get(i);
            i++;
            n nVar2 = (n) obj;
            n nVarC = tVar.c(nVarE, nVar2);
            if (nVarC instanceof o) {
                nVarC = tVar.c(nVarE, nVar2);
            }
            if (nVarC instanceof f) {
                return ((f) nVarC).d;
            }
        }
        return rVar;
    }

    @Override // com.gamericefishpro.space.i9.h, com.gamericefishpro.space.i9.n
    public final n o() {
        return new m(this);
    }

    public m(String str, ArrayList arrayList, List list, com.gamericefishpro.space.u6.n nVar) {
        super(str);
        this.i = new ArrayList();
        this.w = nVar;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                this.i.add(((n) obj).m());
            }
        }
        this.v = new ArrayList(list);
    }
}
