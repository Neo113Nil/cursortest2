package com.gamericefishpro.space.i9;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements Comparator {
    public final /* synthetic */ h a;
    public final /* synthetic */ com.gamericefishpro.space.u6.n b;

    public u(h hVar, com.gamericefishpro.space.u6.n nVar) {
        this.a = hVar;
        this.b = nVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        n nVar = (n) obj;
        n nVar2 = (n) obj2;
        if (nVar instanceof r) {
            return !(nVar2 instanceof r) ? 1 : 0;
        }
        if (nVar2 instanceof r) {
            return -1;
        }
        h hVar = this.a;
        return hVar == null ? nVar.m().compareTo(nVar2.m()) : (int) a4.R(hVar.a(this.b, Arrays.asList(nVar, nVar2)).c().doubleValue());
    }
}
