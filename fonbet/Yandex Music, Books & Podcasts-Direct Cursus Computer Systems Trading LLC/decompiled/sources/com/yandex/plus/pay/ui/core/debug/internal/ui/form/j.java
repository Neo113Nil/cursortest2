package com.yandex.plus.pay.ui.core.debug.internal.ui.form;

import defpackage.bfu;
import defpackage.cg6;
import defpackage.eno;
import defpackage.fkn;
import defpackage.lbq;
import defpackage.nm6;
import defpackage.ot0;
import defpackage.qgg;
import defpackage.wwd;
import defpackage.x97;
import defpackage.xq0;
import defpackage.zsd;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class j extends bfu {
    public final com.yandex.plus.home.plaque.feature.internal.presentation.b k;
    public final com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.b l;
    public final fkn m;

    public j(com.yandex.plus.home.plaque.feature.internal.presentation.b bVar, com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.b bVar2) {
        bVar2.getClass();
        this.k = bVar;
        this.l = bVar2;
        this.m = zsd.F0(new eno(new com.yandex.plus.home.api.prefetch.j(this, (Continuation) null, 25)), ot0.F(this), lbq.b, g.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(j jVar, cg6 cg6Var) {
        i iVar;
        int i;
        if (cg6Var instanceof i) {
            iVar = (i) cg6Var;
            int i2 = iVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.l = i2 - Integer.MIN_VALUE;
                Object obj = iVar.j;
                nm6 nm6Var = nm6.a;
                i = iVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.plus.home.plaque.feature.internal.presentation.b bVar = jVar.k;
                    iVar.l = 1;
                    obj = x97.V((kotlinx.coroutines.a) bVar.c, new wwd(bVar, null, 6), iVar);
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
                return new f((com.yandex.plus.pay.ui.core.debug.internal.domain.form.d) obj);
            }
        }
        iVar = new i(jVar, cg6Var);
        Object obj2 = iVar.j;
        nm6 nm6Var2 = nm6.a;
        i = iVar.l;
        if (i != 0) {
        }
        return new f((com.yandex.plus.pay.ui.core.debug.internal.domain.form.d) obj2);
    }
}
