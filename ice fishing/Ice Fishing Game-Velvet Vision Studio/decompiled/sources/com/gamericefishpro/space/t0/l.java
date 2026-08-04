package com.gamericefishpro.space.t0;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends RuntimeException {
    public final com.gamericefishpro.space.t.d0 d;
    public final com.gamericefishpro.space.t.d0 e;
    public final com.gamericefishpro.space.t.v i;
    public final int v;

    public l(com.gamericefishpro.space.t.d0 d0Var, com.gamericefishpro.space.t.d0 d0Var2, com.gamericefishpro.space.t.v vVar, int i, Exception exc) {
        super(exc);
        this.d = d0Var;
        this.e = d0Var2;
        this.i = vVar;
        this.v = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        List listL;
        StringBuilder sb = new StringBuilder("\n            |Failed to execute op number ");
        sb.append(this.v);
        sb.append(":\n            |");
        k block = new k(this, null);
        Intrinsics.checkNotNullParameter(block, "block");
        List listE = com.gamericefishpro.space.li.m.e(new com.gamericefishpro.space.ai.n(block));
        Intrinsics.checkNotNullParameter(listE, "<this>");
        int size = listE.size();
        if (50 >= size) {
            listL = CollectionsKt.L(listE);
        } else {
            ArrayList arrayList = new ArrayList(50);
            if (listE instanceof RandomAccess) {
                for (int i = size - 50; i < size; i++) {
                    arrayList.add(listE.get(i));
                }
            } else {
                ListIterator listIterator = listE.listIterator(size - 50);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
            }
            listL = arrayList;
        }
        sb.append(CollectionsKt.A(listL, "\n", null, null, null, 62));
        sb.append("\n            ");
        return com.gamericefishpro.space.mi.h.d(sb.toString());
    }
}
