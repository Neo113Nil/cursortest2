package com.yandex.plus.pay.ui.core.debug.internal.ui.log;

import com.yandex.plus.home.internal.di.y;
import defpackage.bfu;
import defpackage.fkn;
import defpackage.lbq;
import defpackage.ot0;
import defpackage.xdr;
import defpackage.ydr;
import defpackage.zsd;
import java.util.List;

/* loaded from: classes5.dex */
public final class k extends bfu {
    public final List k;
    public final y l;
    public final com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.b m;
    public final xdr n;
    public final fkn o;

    public k(List list, y yVar, com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.b bVar) {
        list.getClass();
        bVar.getClass();
        this.k = list;
        this.l = yVar;
        this.m = bVar;
        xdr a = ydr.a(com.yandex.plus.log.api.a.a);
        this.n = a;
        this.o = zsd.F0(new com.yandex.passport.common.mvi.d(a, this, 20), ot0.F(this), lbq.b, new i((com.yandex.plus.log.api.a) a.getValue(), list));
    }
}
