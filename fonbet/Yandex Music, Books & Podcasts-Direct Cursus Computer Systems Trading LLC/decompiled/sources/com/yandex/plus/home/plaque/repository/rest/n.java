package com.yandex.plus.home.plaque.repository.rest;

import com.yandex.plus.core.openapi.a;
import com.yandex.plus.home.datasource.openapi.apis.CrossPlaqueControllerApi;
import com.yandex.plus.home.datasource.openapi.models.j5;
import com.yandex.plus.home.datasource.openapi.models.m4;
import com.yandex.plus.home.datasource.openapi.models.m5;
import com.yandex.plus.home.datasource.openapi.models.n5;
import com.yandex.plus.home.datasource.openapi.models.o5;
import com.yandex.plus.home.datasource.openapi.models.r5;
import defpackage.aur;
import defpackage.b6e;
import defpackage.i5f;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.x0q;
import defpackage.x7j;
import defpackage.xdr;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class n extends aur implements Function2 {
    public com.yandex.plus.home.benchmark.b j;
    public n5 k;
    public Object l;
    public int m;
    public final /* synthetic */ o n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, int i, int i2, Continuation continuation) {
        super(2, continuation);
        this.n = oVar;
        this.o = i;
        this.p = i2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new n(this.n, this.o, this.p, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00e9 A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:15:0x00e5, B:17:0x00e9, B:19:0x00f4, B:37:0x0102, B:38:0x0109, B:39:0x010a, B:42:0x010f, B:43:0x0114), top: B:14:0x00e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010a A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:15:0x00e5, B:17:0x00e9, B:19:0x00f4, B:37:0x0102, B:38:0x0109, B:39:0x010a, B:42:0x010f, B:43:0x0114), top: B:14:0x00e5 }] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        com.yandex.plus.home.benchmark.b bVar;
        m4 m4Var;
        n5 n5Var;
        com.yandex.plus.home.benchmark.b bVar2;
        com.yandex.plus.core.openapi.a aVar;
        boolean z;
        x0q x0qVar;
        Object a;
        com.yandex.plus.core.openapi.a aVar2;
        nm6 nm6Var = nm6.a;
        int i = this.m;
        o oVar = this.n;
        if (i == 0) {
            qgg.h0(obj);
            bVar = (com.yandex.plus.home.benchmark.b) oVar.i.invoke();
            oVar.d.getClass();
            n5 n5Var2 = ((Boolean) oVar.e.invoke()).booleanValue() ? n5.b : n5.a;
            oVar.s.getClass();
            m4Var = new m4();
            com.yandex.plus.home.plaque.plugin.internal.di.a aVar3 = oVar.f;
            this.j = bVar;
            this.k = n5Var2;
            this.l = m4Var;
            this.m = 1;
            Object invoke = aVar3.invoke(this);
            if (invoke != nm6Var) {
                n5Var = n5Var2;
                obj = invoke;
            }
            return nm6Var;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar2 = (com.yandex.plus.core.openapi.a) this.l;
                bVar2 = this.j;
                qgg.h0(obj);
                oVar.r.l(bVar2);
                oVar.c.a(aVar2);
                return Boolean.valueOf(aVar2 instanceof a.b);
            }
            bVar2 = this.j;
            qgg.h0(obj);
            aVar = (com.yandex.plus.core.openapi.a) obj;
            try {
                if (!(aVar instanceof a.b)) {
                    j5 j5Var = ((r5) ((a.b) aVar).a).b;
                    if (j5Var == null) {
                        throw new IllegalArgumentException("mapNotNullCatching failed!");
                    }
                    aVar = new a.b(j5Var, ((a.b) aVar).b);
                } else if (!(aVar instanceof a.AbstractC0017a)) {
                    throw new x7j();
                }
            } catch (Throwable th) {
                aVar = new a.AbstractC0017a.c(aVar.getB(), th);
            }
            z = aVar instanceof a.b;
            if (!z) {
                bVar2.a();
            } else if (!(aVar instanceof a.AbstractC0017a)) {
                b6e.s();
                return null;
            }
            if (!z) {
                if (!(aVar instanceof a.AbstractC0017a)) {
                    b6e.s();
                    return null;
                }
                bVar2.b();
            }
            xdr xdrVar = oVar.q;
            Boolean bool = Boolean.TRUE;
            xdrVar.getClass();
            xdrVar.m(null, bool);
            x0qVar = oVar.p;
            a = aVar.getA();
            this.j = bVar2;
            this.k = null;
            this.l = aVar;
            this.m = 3;
            if (x0qVar.emit(a, this) != nm6Var) {
                aVar2 = aVar;
                oVar.r.l(bVar2);
                oVar.c.a(aVar2);
                return Boolean.valueOf(aVar2 instanceof a.b);
            }
            return nm6Var;
        }
        m4Var = (m4) this.l;
        n5Var = this.k;
        bVar = this.j;
        qgg.h0(obj);
        o5 o5Var = new o5(n5Var, m4Var, ((Boolean) obj).booleanValue() ? m5.a : m5.b);
        com.yandex.plus.log.api.b bVar3 = oVar.m;
        com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.b;
        if (bVar3.b(aVar4)) {
            bVar3.c(aVar4, "RestPlaqueRepository", "updatePlaqueConfiguration() request=" + o5Var);
        }
        bVar.c();
        CrossPlaqueControllerApi crossPlaqueControllerApi = oVar.a;
        i5f i5fVar = oVar.l.a;
        com.yandex.plus.home.core.network.c cVar = new com.yandex.plus.home.core.network.c(this.o, this.p);
        i5fVar.getClass();
        String c = i5fVar.c(com.yandex.plus.home.core.network.c.Companion.serializer(), cVar);
        this.j = bVar;
        this.k = null;
        this.l = null;
        this.m = 2;
        obj = crossPlaqueControllerApi.a(c, o5Var, this);
        if (obj != nm6Var) {
            bVar2 = bVar;
            aVar = (com.yandex.plus.core.openapi.a) obj;
            if (!(aVar instanceof a.b)) {
            }
            z = aVar instanceof a.b;
            if (!z) {
            }
            if (!z) {
            }
            xdr xdrVar2 = oVar.q;
            Boolean bool2 = Boolean.TRUE;
            xdrVar2.getClass();
            xdrVar2.m(null, bool2);
            x0qVar = oVar.p;
            a = aVar.getA();
            this.j = bVar2;
            this.k = null;
            this.l = aVar;
            this.m = 3;
            if (x0qVar.emit(a, this) != nm6Var) {
            }
        }
        return nm6Var;
    }
}
