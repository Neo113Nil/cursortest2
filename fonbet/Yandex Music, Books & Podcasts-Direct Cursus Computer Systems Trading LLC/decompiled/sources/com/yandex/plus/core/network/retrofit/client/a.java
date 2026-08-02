package com.yandex.plus.core.network.retrofit.client;

import com.yandex.plus.analytics.dwh.internal.network.DwhEventsApi;
import com.yandex.plus.bdui.plus.checkout.content.controller.w;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.core.network.call.c;
import com.yandex.plus.core.network.error.b;
import com.yandex.plus.core.network.interceptor.e;
import com.yandex.plus.core.network.okhttp.client.f;
import com.yandex.plus.core.network.okhttp.client.g;
import com.yandex.plus.home.feature.webviews.internal.stories.m;
import com.yandex.plus.pay.internal.di.d;
import defpackage.b6e;
import defpackage.btf;
import defpackage.cg6;
import defpackage.d0o;
import defpackage.ern;
import defpackage.izm;
import defpackage.jyr;
import defpackage.k5r;
import defpackage.l3o;
import defpackage.nm6;
import defpackage.o3o;
import defpackage.ocu;
import defpackage.pv9;
import defpackage.pyc;
import defpackage.qgg;
import defpackage.uao;
import defpackage.ukn;
import defpackage.v75;
import defpackage.wb8;
import defpackage.x3f;
import defpackage.x97;
import defpackage.xq0;
import defpackage.ywf;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class a {
    public final com.yandex.plus.core.network.error.a a;
    public final b b;
    public final jyr c;
    public final jyr d;
    public final String e;
    public final x3f f;
    public final Class g;
    public final m h;
    public final jyr i;

    public a(String str, x3f x3fVar, com.yandex.plus.core.network.error.a aVar, b bVar, m mVar) {
        int i = d.a;
        int i2 = d.a;
        this.a = aVar;
        this.b = bVar;
        this.c = btf.b(new w(0, this, a.class, "createCallFactory", "createCallFactory()Lcom/yandex/plus/core/network/api/CallFactoryWithContext;", 0, 22));
        final int i3 = 0;
        this.d = btf.b(new Function0(this) { // from class: com.yandex.plus.core.network.okhttp.client.a
            public final /* synthetic */ com.yandex.plus.core.network.retrofit.client.a b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        com.yandex.plus.core.network.retrofit.client.a aVar2 = this.b;
                        com.yandex.plus.core.network.impl.c cVar = (com.yandex.plus.core.network.impl.c) aVar2.c.getValue();
                        cVar.getClass();
                        uao uaoVar = new uao();
                        uaoVar.b = cVar;
                        uaoVar.b(aVar2.e);
                        uaoVar.a((com.yandex.plus.core.network.c) aVar2.i.getValue());
                        aVar2.h.invoke(uaoVar);
                        Object b = uaoVar.c().b(aVar2.g);
                        b.getClass();
                        return b;
                    default:
                        return new com.yandex.plus.core.network.c(this.b.f);
                }
            }
        });
        this.e = str;
        this.f = x3fVar;
        this.g = DwhEventsApi.class;
        this.h = mVar;
        final int i4 = 1;
        this.i = btf.b(new Function0(this) { // from class: com.yandex.plus.core.network.okhttp.client.a
            public final /* synthetic */ com.yandex.plus.core.network.retrofit.client.a b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        com.yandex.plus.core.network.retrofit.client.a aVar2 = this.b;
                        com.yandex.plus.core.network.impl.c cVar = (com.yandex.plus.core.network.impl.c) aVar2.c.getValue();
                        cVar.getClass();
                        uao uaoVar = new uao();
                        uaoVar.b = cVar;
                        uaoVar.b(aVar2.e);
                        uaoVar.a((com.yandex.plus.core.network.c) aVar2.i.getValue());
                        aVar2.h.invoke(uaoVar);
                        Object b = uaoVar.c().b(aVar2.g);
                        b.getClass();
                        return b;
                    default:
                        return new com.yandex.plus.core.network.c(this.b.f);
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, com.yandex.plus.core.network.context.a aVar2, com.yandex.plus.core.network.request.b bVar, pyc pycVar, cg6 cg6Var) {
        g gVar;
        int i;
        c cVar;
        Object obj;
        if (cg6Var instanceof g) {
            gVar = (g) cg6Var;
            int i2 = gVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.m = i2 - Integer.MIN_VALUE;
                Object obj2 = gVar.k;
                Object obj3 = nm6.a;
                i = gVar.m;
                if (i != 0) {
                    qgg.h0(obj2);
                    aVar2.getClass();
                    aVar2.a(ern.a(com.yandex.plus.core.network.request.b.class), bVar);
                    gVar.j = aVar2;
                    gVar.m = 1;
                    obj2 = pycVar.invoke(aVar2, bVar, gVar);
                    if (obj2 == obj3) {
                        return obj3;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar2 = gVar.j;
                    qgg.h0(obj2);
                }
                cVar = (c) obj2;
                cVar.getClass();
                if (!(cVar instanceof com.yandex.plus.core.network.call.b)) {
                    obj = ((com.yandex.plus.core.network.call.b) cVar).a;
                } else {
                    if (!(cVar instanceof com.yandex.plus.core.network.call.a)) {
                        b6e.s();
                        return null;
                    }
                    obj = null;
                }
                aVar2.getClass();
                aVar2.a(ern.a(com.yandex.plus.core.network.response.b.class), (com.yandex.plus.core.network.response.b) obj);
                return cVar;
            }
        }
        gVar = new g(aVar, cg6Var);
        Object obj22 = gVar.k;
        Object obj32 = nm6.a;
        i = gVar.m;
        if (i != 0) {
        }
        cVar = (c) obj22;
        cVar.getClass();
        if (!(cVar instanceof com.yandex.plus.core.network.call.b)) {
        }
        aVar2.getClass();
        aVar2.a(ern.a(com.yandex.plus.core.network.response.b.class), (com.yandex.plus.core.network.response.b) obj);
        return cVar;
    }

    public final l3o b(com.yandex.plus.core.network.context.a aVar, ArrayList arrayList, ukn uknVar, boolean z) {
        com.yandex.plus.core.network.request.b I = r1.I((d0o) uknVar.i);
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new f(this, (com.yandex.plus.core.network.interceptor.a) it.next(), 0));
        }
        c cVar = (c) x97.D(kotlin.coroutines.g.a, new ocu(aVar, uknVar, new e(aVar, I, CollectionsKt.h0(arrayList2, new f(this, uknVar, 1)), 0, new com.yandex.plus.core.network.okhttp.client.c(this, 0), z), I, (Continuation) null, 27));
        cVar.getClass();
        if (!(cVar instanceof com.yandex.plus.core.network.call.b)) {
            if (cVar instanceof com.yandex.plus.core.network.call.a) {
                throw ((com.yandex.plus.core.network.call.a) cVar).a;
            }
            b6e.s();
            return null;
        }
        com.yandex.plus.core.network.response.b bVar = (com.yandex.plus.core.network.response.b) ((com.yandex.plus.core.network.call.b) cVar).a;
        bVar.getClass();
        new ArrayList(20);
        d0o J = r1.J(bVar.a);
        izm x = ywf.x(bVar.b.a);
        int i = bVar.c;
        String str = bVar.d;
        str.getClass();
        com.yandex.plus.core.insets.d dVar = bVar.e;
        pv9 pv9Var = new pv9(9);
        u.c(pv9Var, dVar);
        pv9 m = pv9Var.r().m();
        o3o o3oVar = (o3o) bVar.f;
        if (i >= 0) {
            return new l3o(J, x, str, i, null, m.r(), o3oVar, null, null, null, 0L, 0L, null);
        }
        wb8.h(k5r.i(i, "code < 0: "));
        return null;
    }
}
