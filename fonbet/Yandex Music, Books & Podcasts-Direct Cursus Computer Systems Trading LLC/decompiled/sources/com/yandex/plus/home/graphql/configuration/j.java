package com.yandex.plus.home.graphql.configuration;

import com.yandex.plus.core.graphql.type.a1;
import com.yandex.plus.core.openapi.a;
import com.yandex.plus.home.datasource.openapi.apis.SdkConfigurationControllerApi;
import com.yandex.plus.home.datasource.openapi.models.a7;
import com.yandex.plus.home.datasource.openapi.models.x6;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.mu7;
import defpackage.nm6;
import defpackage.nsa;
import defpackage.ou7;
import defpackage.qgg;
import defpackage.qqi;
import defpackage.r7o;
import defpackage.rqi;
import defpackage.rsa;
import defpackage.t7o;
import defpackage.t9f;
import defpackage.tf6;
import defpackage.wis;
import defpackage.x7j;
import defpackage.x97;
import defpackage.xdr;
import defpackage.xq0;
import defpackage.ydr;
import defpackage.z7o;
import java.util.concurrent.CancellationException;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class j {
    public final SdkConfigurationControllerApi a;
    public final com.yandex.plus.core.openapi.g b;
    public final com.yandex.plus.core.android.extensions.c c;
    public final long d;
    public final tf6 e;
    public final kotlinx.coroutines.a f;
    public final com.yandex.plus.core.analytics.logging.d g;
    public final com.yandex.plus.home.datasource.local.preferences.j h;
    public final com.yandex.plus.home.datasource.local.preferences.j i;
    public final a1 j;
    public final qqi k;
    public final xdr l;
    public ou7 m;

    public j(com.yandex.plus.home.datasource.local.preferences.a aVar, com.yandex.plus.core.config.a aVar2, SdkConfigurationControllerApi sdkConfigurationControllerApi, com.yandex.plus.core.openapi.g gVar, com.yandex.plus.core.android.extensions.c cVar, long j, tf6 tf6Var, kotlinx.coroutines.a aVar3, com.yandex.plus.core.analytics.logging.d dVar) {
        aVar.getClass();
        gVar.getClass();
        cVar.getClass();
        aVar3.getClass();
        this.a = sdkConfigurationControllerApi;
        this.b = gVar;
        this.c = cVar;
        this.d = j;
        this.e = tf6Var;
        this.f = aVar3;
        this.g = dVar;
        String name = aVar2.name();
        t9f serializer = d.Companion.serializer();
        name.getClass();
        serializer.getClass();
        this.h = aVar.a(serializer, name);
        nsa.b.getClass();
        this.i = aVar.a(rsa.a, "RECHANGE_END");
        this.j = new a1(20);
        this.k = rqi.a();
        this.l = ydr.a(null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(11:5|6|(1:(1:9)(2:37|38))(2:39|(1:41))|10|11|12|(2:14|(1:16)(2:27|28))(2:29|(1:31)(2:32|33))|17|(1:19)(2:23|(2:25|26))|20|21))|42|6|(0)(0)|10|11|12|(0)(0)|17|(0)(0)|20|21) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0060, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0075, code lost:
    
        r12 = new com.yandex.plus.core.openapi.a.AbstractC0017a.c(r12.getB(), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:12:0x0045, B:14:0x0049, B:16:0x0054, B:27:0x0062, B:28:0x0069, B:29:0x006a, B:32:0x006f, B:33:0x0074), top: B:11:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:12:0x0045, B:14:0x0049, B:16:0x0054, B:27:0x0062, B:28:0x0069, B:29:0x006a, B:32:0x006f, B:33:0x0074), top: B:11:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(j jVar, cg6 cg6Var) {
        i iVar;
        int i;
        com.yandex.plus.core.openapi.f fVar;
        com.yandex.plus.core.openapi.a aVar;
        if (cg6Var instanceof i) {
            iVar = (i) cg6Var;
            int i2 = iVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.m = i2 - Integer.MIN_VALUE;
                Object obj = iVar.k;
                nm6 nm6Var = nm6.a;
                i = iVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    SdkConfigurationControllerApi sdkConfigurationControllerApi = jVar.a;
                    fVar = com.yandex.plus.core.openapi.f.a;
                    iVar.j = fVar;
                    iVar.m = 1;
                    obj = sdkConfigurationControllerApi.a(iVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    com.yandex.plus.core.openapi.f fVar2 = iVar.j;
                    qgg.h0(obj);
                    fVar = fVar2;
                }
                aVar = (com.yandex.plus.core.openapi.a) obj;
                if (!(aVar instanceof a.b)) {
                    x6 x6Var = ((a7) ((a.b) aVar).a).b;
                    if (x6Var == null) {
                        throw new IllegalArgumentException("mapNotNullCatching failed!");
                    }
                    aVar = new a.b(x6Var, ((a.b) aVar).b);
                } else if (!(aVar instanceof a.AbstractC0017a)) {
                    throw new x7j();
                }
                com.yandex.plus.core.openapi.g gVar = jVar.b;
                fVar.getClass();
                gVar.getClass();
                gVar.a(aVar);
                a1 a1Var = jVar.j;
                if (!(aVar instanceof a.b)) {
                    a.b bVar = (a.b) aVar;
                    x6 x6Var2 = (x6) bVar.a;
                    a1Var.getClass();
                    x6Var2.getClass();
                    aVar = new a.b(new com.yandex.plus.home.repository.api.model.configuration.a(null, null, CollectionsKt.A0(x6Var2.a), CollectionsKt.A0(x6Var2.b), CollectionsKt.A0(x6Var2.c), CollectionsKt.A0(x6Var2.d), Integer.valueOf(x6Var2.e), Integer.valueOf(x6Var2.f), null), bVar.b);
                } else if (!(aVar instanceof a.AbstractC0017a)) {
                    b6e.s();
                    return null;
                }
                return com.yandex.plus.core.openapi.c.a(aVar);
            }
        }
        iVar = new i(jVar, cg6Var);
        Object obj2 = iVar.k;
        nm6 nm6Var2 = nm6.a;
        i = iVar.m;
        if (i != 0) {
        }
        aVar = (com.yandex.plus.core.openapi.a) obj2;
        if (!(aVar instanceof a.b)) {
        }
        com.yandex.plus.core.openapi.g gVar2 = jVar.b;
        fVar.getClass();
        gVar2.getClass();
        gVar2.a(aVar);
        a1 a1Var2 = jVar.j;
        if (!(aVar instanceof a.b)) {
        }
        return com.yandex.plus.core.openapi.c.a(aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (r6 != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
    
        if (r6 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var) {
        f fVar;
        int i;
        try {
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
                        obj = d(fVar);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj);
                            r7o r7oVar = z7o.b;
                            return obj;
                        }
                        qgg.h0(obj);
                    }
                    mu7 mu7Var = (mu7) obj;
                    r7o r7oVar2 = z7o.b;
                    fVar.l = 2;
                    obj = mu7Var.H(fVar);
                }
            }
            if (i != 0) {
            }
            mu7 mu7Var2 = (mu7) obj;
            r7o r7oVar22 = z7o.b;
            fVar.l = 2;
            obj = mu7Var2.H(fVar);
        } catch (wis e) {
            r7o r7oVar3 = z7o.b;
            return new t7o(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            r7o r7oVar4 = z7o.b;
            return new t7o(th);
        }
        fVar = new f(this, cg6Var);
        Object obj3 = fVar.j;
        Object obj22 = nm6.a;
        i = fVar.l;
    }

    public final Object c() {
        com.yandex.plus.home.repository.api.model.configuration.a aVar;
        x97.y(this.e, this.f, null, new com.yandex.passport.internal.ui.social.i(this, null, 21), 2);
        try {
            r7o r7oVar = z7o.b;
            com.yandex.plus.core.d dVar = (com.yandex.plus.core.d) this.l.getValue();
            if (dVar == null || (aVar = (com.yandex.plus.home.repository.api.model.configuration.a) dVar.getValue()) == null) {
                throw new IllegalStateException("Sdk config is absent");
            }
            return aVar;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            return new t7o(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0046 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:12:0x0042, B:14:0x0046, B:23:0x0053), top: B:11:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(cg6 cg6Var) {
        g gVar;
        int i;
        qqi qqiVar;
        ou7 ou7Var;
        try {
            if (cg6Var instanceof g) {
                gVar = (g) cg6Var;
                int i2 = gVar.m;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    gVar.m = i2 - Integer.MIN_VALUE;
                    Object obj = gVar.k;
                    nm6 nm6Var = nm6.a;
                    i = gVar.m;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqi qqiVar2 = this.k;
                        gVar.j = qqiVar2;
                        gVar.m = 1;
                        if (qqiVar2.a(gVar) == nm6Var) {
                            return nm6Var;
                        }
                        qqiVar = qqiVar2;
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qqiVar = gVar.j;
                        qgg.h0(obj);
                    }
                    ou7Var = this.m;
                    if (ou7Var != null) {
                        if (!ou7Var.b()) {
                            ou7Var = null;
                        }
                        if (ou7Var == null) {
                        }
                        qqiVar.b(null);
                        return ou7Var;
                    }
                    ou7Var = x97.p(this.e, this.f, null, new h(this, null), 2);
                    this.m = ou7Var;
                    qqiVar.b(null);
                    return ou7Var;
                }
            }
            ou7Var = this.m;
            if (ou7Var != null) {
            }
            ou7Var = x97.p(this.e, this.f, null, new h(this, null), 2);
            this.m = ou7Var;
            qqiVar.b(null);
            return ou7Var;
        } catch (Throwable th) {
            qqiVar.b(null);
            throw th;
        }
        gVar = new g(this, cg6Var);
        Object obj2 = gVar.k;
        nm6 nm6Var2 = nm6.a;
        i = gVar.m;
        if (i != 0) {
        }
    }
}
