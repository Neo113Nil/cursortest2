package com.yandex.passport.internal.storage.datastore;

import defpackage.cg6;
import defpackage.hmm;
import defpackage.lpi;
import defpackage.nm6;
import defpackage.pjc;
import defpackage.qgg;
import defpackage.wb7;
import defpackage.xq0;
import defpackage.zsd;

/* loaded from: classes4.dex */
public final class e implements a {
    public final wb7 a;
    public final pjc b;

    public e(wb7 wb7Var) {
        wb7Var.getClass();
        this.a = wb7Var;
        this.b = wb7Var.getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(f fVar, cg6 cg6Var) {
        d dVar;
        int i;
        if (cg6Var instanceof d) {
            dVar = (d) cg6Var;
            int i2 = dVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.m = i2 - Integer.MIN_VALUE;
                Object obj = dVar.k;
                nm6 nm6Var = nm6.a;
                i = dVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    dVar.j = fVar;
                    dVar.m = 1;
                    obj = zsd.g0(this.b, dVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fVar = dVar.j;
                    qgg.h0(obj);
                }
                hmm.a aVar = fVar.a;
                lpi lpiVar = (lpi) ((hmm) obj);
                lpiVar.getClass();
                Object obj2 = lpiVar.a.get(aVar);
                return obj2 != null ? fVar.b : obj2;
            }
        }
        dVar = new d(this, cg6Var);
        Object obj3 = dVar.k;
        nm6 nm6Var2 = nm6.a;
        i = dVar.m;
        if (i != 0) {
        }
        hmm.a aVar2 = fVar.a;
        lpi lpiVar2 = (lpi) ((hmm) obj3);
        lpiVar2.getClass();
        Object obj22 = lpiVar2.a.get(aVar2);
        if (obj22 != null) {
        }
    }
}
