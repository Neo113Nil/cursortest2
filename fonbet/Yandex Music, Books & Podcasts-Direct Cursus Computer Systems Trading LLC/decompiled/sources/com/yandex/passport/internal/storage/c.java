package com.yandex.passport.internal.storage;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.pjc;
import defpackage.qgg;
import defpackage.wb7;
import defpackage.xq0;
import defpackage.zsd;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c {
    public final wb7 a;

    public c(wb7 wb7Var) {
        wb7Var.getClass();
        this.a = wb7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(com.yandex.passport.common.core.f fVar, cg6 cg6Var) {
        b bVar;
        int i;
        Iterable iterable;
        Iterator it;
        if (cg6Var instanceof b) {
            bVar = (b) cg6Var;
            int i2 = bVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.m = i2 - Integer.MIN_VALUE;
                Object obj = bVar.k;
                nm6 nm6Var = nm6.a;
                i = bVar.m;
                boolean z = true;
                if (i != 0) {
                    qgg.h0(obj);
                    pjc data = this.a.getData();
                    bVar.j = fVar;
                    bVar.m = 1;
                    obj = zsd.g0(data, bVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fVar = bVar.j;
                    qgg.h0(obj);
                }
                iterable = (Iterable) obj;
                if ((iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    it = iterable.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.d(((p) it.next()).a, fVar)) {
                            break;
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            }
        }
        bVar = new b(this, cg6Var);
        Object obj2 = bVar.k;
        nm6 nm6Var2 = nm6.a;
        i = bVar.m;
        boolean z2 = true;
        if (i != 0) {
        }
        iterable = (Iterable) obj2;
        if (iterable instanceof Collection) {
        }
        it = iterable.iterator();
        while (it.hasNext()) {
        }
        z2 = false;
        return Boolean.valueOf(z2);
    }
}
