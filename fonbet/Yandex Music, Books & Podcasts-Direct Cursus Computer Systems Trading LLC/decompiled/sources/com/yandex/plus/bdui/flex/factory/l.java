package com.yandex.plus.bdui.flex.factory;

import defpackage.apo;
import defpackage.cg6;
import defpackage.f0q;
import defpackage.k4a;
import defpackage.l4a;
import defpackage.m4a;
import defpackage.nm6;
import defpackage.ps;
import defpackage.q2a;
import defpackage.qgg;
import defpackage.t4a;
import defpackage.t5a;
import defpackage.tzi;
import defpackage.xq0;

/* loaded from: classes4.dex */
public final class l implements t4a {
    public final tzi a;
    public final ps b;
    public final com.yandex.plus.bdui.flex.ui.content.c c;

    public l(com.yandex.plus.bdui.flex.utils.b bVar, tzi tziVar, ps psVar, com.yandex.plus.bdui.flex.ui.content.c cVar) {
        this.a = tziVar;
        this.b = psVar;
        this.c = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // defpackage.t4a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(t5a t5aVar, q2a q2aVar, boolean z, boolean z2, boolean z3, apo apoVar, cg6 cg6Var) {
        k kVar;
        int i;
        q2a q2aVar2;
        l4a l4aVar;
        f0q f0qVar;
        if (cg6Var instanceof k) {
            kVar = (k) cg6Var;
            int i2 = kVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.m = i2 - Integer.MIN_VALUE;
                k kVar2 = kVar;
                Object obj = kVar2.k;
                nm6 nm6Var = nm6.a;
                i = kVar2.m;
                if (i != 0) {
                    qgg.h0(obj);
                    kVar2.j = q2aVar;
                    kVar2.m = 1;
                    obj = t4a.b(this.a, t5aVar, q2aVar, z, z2, z3, kVar2, 32);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    q2aVar2 = q2aVar;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    q2aVar2 = kVar2.j;
                    qgg.h0(obj);
                }
                l4aVar = (l4a) obj;
                if ((l4aVar instanceof k4a) || ((Boolean) this.b.invoke()).booleanValue()) {
                    return l4aVar;
                }
                com.yandex.plus.bdui.flex.content.a aVar = new com.yandex.plus.bdui.flex.content.a((com.yandex.plus.bdui.plus.content.j) this.c.invoke(new com.yandex.plus.bdui.failure.c(((k4a) l4aVar).a)));
                if (q2aVar2 == null || (f0qVar = q2aVar2.c) == null) {
                    f0qVar = f0q.b;
                }
                return new m4a(new q2a(aVar, null, f0qVar, null, null, q2aVar2 != null ? q2aVar2.f : null));
            }
        }
        kVar = new k(this, cg6Var);
        k kVar22 = kVar;
        Object obj2 = kVar22.k;
        nm6 nm6Var2 = nm6.a;
        i = kVar22.m;
        if (i != 0) {
        }
        l4aVar = (l4a) obj2;
        if (l4aVar instanceof k4a) {
        }
        return l4aVar;
    }
}
