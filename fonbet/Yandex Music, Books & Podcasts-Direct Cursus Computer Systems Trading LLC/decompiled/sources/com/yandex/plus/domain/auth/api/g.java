package com.yandex.plus.domain.auth.api;

import com.yandex.plus.domain.auth.impl.i;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;

/* loaded from: classes4.dex */
public final class g {
    public static final /* synthetic */ g a = new g();

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(i iVar, cg6 cg6Var) {
        f fVar;
        int i;
        if (cg6Var instanceof f) {
            fVar = (f) cg6Var;
            int i2 = fVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.l = i2 - Integer.MIN_VALUE;
                Object obj = fVar.j;
                Object obj2 = nm6.a;
                i = fVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    fVar.l = 1;
                    obj = iVar.e(fVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Boolean.valueOf(obj instanceof b);
            }
        }
        fVar = new f(this, cg6Var);
        Object obj3 = fVar.j;
        Object obj22 = nm6.a;
        i = fVar.l;
        if (i != 0) {
        }
        return Boolean.valueOf(obj3 instanceof b);
    }
}
