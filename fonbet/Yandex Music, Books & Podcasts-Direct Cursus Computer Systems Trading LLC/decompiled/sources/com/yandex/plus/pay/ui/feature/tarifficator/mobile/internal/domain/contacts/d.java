package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.contacts.e;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.contacts.f;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;

/* loaded from: classes5.dex */
public final class d {
    public final com.yandex.plus.pay.ui.core.tarifficator.api.data.common.b a;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.contacts.a b;

    public d(com.yandex.plus.pay.ui.core.tarifficator.api.data.common.b bVar, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.contacts.a aVar) {
        bVar.getClass();
        aVar.getClass();
        this.a = bVar;
        this.b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        c cVar;
        int i;
        f fVar;
        if (cg6Var instanceof c) {
            cVar = (c) cg6Var;
            int i2 = cVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.l = i2 - Integer.MIN_VALUE;
                Object obj = cVar.j;
                nm6 nm6Var = nm6.a;
                i = cVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    cVar.l = 1;
                    obj = ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.contacts.c) this.b).a(cVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                fVar = (f) obj;
                if (!(fVar instanceof e)) {
                    e eVar = (e) fVar;
                    return new a(com.yandex.plus.bdui.plus.analytics.b.b(eVar.a, this.a.a().a), eVar.b);
                }
                if ((fVar instanceof com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.contacts.d) || fVar == null) {
                    return null;
                }
                b6e.s();
                return null;
            }
        }
        cVar = new c(this, cg6Var);
        Object obj2 = cVar.j;
        nm6 nm6Var2 = nm6.a;
        i = cVar.l;
        if (i != 0) {
        }
        fVar = (f) obj2;
        if (!(fVar instanceof e)) {
        }
    }
}
