package com.gamericefishpro.space.i9;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class w9 extends h {
    public final v5 i;
    public final HashMap v;

    public w9(v5 v5Var) {
        super("require");
        this.v = new HashMap();
        this.i = v5Var;
    }

    @Override // com.gamericefishpro.space.i9.h
    public final n a(com.gamericefishpro.space.u6.n nVar, List list) {
        n nVar2;
        a4.K("require", list, 1);
        String strM = ((t) nVar.e).c(nVar, (n) list.get(0)).m();
        HashMap map = this.v;
        if (map.containsKey(strM)) {
            return (n) map.get(strM);
        }
        HashMap map2 = (HashMap) this.i.d;
        if (map2.containsKey(strM)) {
            try {
                nVar2 = (n) ((Callable) map2.get(strM)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(strM)));
            }
        } else {
            nVar2 = n.j;
        }
        if (nVar2 instanceof h) {
            map.put(strM, (h) nVar2);
        }
        return nVar2;
    }
}
