package com.yandex.passport.internal.ui.bouncer;

import com.yandex.passport.internal.report.gf;
import com.yandex.passport.internal.ui.bouncer.model.a1;
import com.yandex.passport.internal.ui.bouncer.model.z0;
import defpackage.bfu;
import defpackage.mm6;
import defpackage.ot0;
import defpackage.rhw;
import defpackage.u75;
import defpackage.ub7;
import defpackage.v75;
import defpackage.w4i;
import defpackage.x0q;
import defpackage.xdr;
import defpackage.xpi;
import defpackage.zsd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes4.dex */
public final class i extends bfu implements mm6 {
    public final gf k;
    public final a1 l;

    public i() {
        gf gfVar = new gf();
        this.k = gfVar;
        a1 createLoginModelComponent = com.yandex.passport.internal.di.a.a().createLoginModelComponent(new h(this, gfVar));
        this.l = createLoginModelComponent;
        z0 model = createLoginModelComponent.getModel();
        model.getClass();
        x0q x0qVar = (x0q) model.e;
        zsd.r0(this, new ub7(12, x0qVar, new rhw(model, (Continuation) null, 10)));
        com.yandex.passport.internal.ui.bouncer.model.middleware.a aVar = (com.yandex.passport.internal.ui.bouncer.model.middleware.a) model.a;
        int i = 0;
        List h = u75.h(aVar.a, aVar.b, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g, aVar.h, aVar.i, aVar.j);
        ArrayList arrayList = new ArrayList(v75.o(h, 10));
        Iterator it = h.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.yandex.passport.common.mvi.a) it.next()).a(x0qVar, (xdr) model.d));
        }
        zsd.r0(this, new ub7(12, zsd.t0(arrayList), new w4i(2, x0qVar, xpi.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 26)));
        com.yandex.passport.internal.ui.bouncer.model.middleware.c cVar = (com.yandex.passport.internal.ui.bouncer.model.middleware.c) model.b;
        List h2 = u75.h(cVar.a, cVar.b, cVar.c, cVar.d, cVar.e, cVar.f, cVar.g, cVar.h, cVar.i, cVar.j, cVar.k);
        ArrayList arrayList2 = new ArrayList(v75.o(h2, 10));
        Iterator it2 = h2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((com.yandex.passport.common.mvi.e) it2.next()).a(x0qVar));
        }
        int i2 = 0;
        zsd.r0(this, new ub7(12, zsd.t0(arrayList2), new w4i(2, x0qVar, xpi.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", i2, 27)));
        zsd.r0(this, new ub7(12, new com.yandex.passport.common.mvi.d(model.f, model.g, i), new w4i(2, x0qVar, xpi.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", i2, 25)));
    }

    @Override // defpackage.mm6
    public final CoroutineContext getCoroutineContext() {
        return ot0.F(this).a;
    }
}
