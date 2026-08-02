package com.yandex.plus.home.graphql.experiments;

import com.yandex.plus.core.graphql.type.a1;
import com.yandex.plus.core.openapi.a;
import com.yandex.plus.home.datasource.openapi.apis.CommonExperimentsControllerApi;
import com.yandex.plus.home.datasource.openapi.models.j2;
import com.yandex.plus.home.datasource.openapi.models.m2;
import com.yandex.plus.home.datasource.openapi.models.p2;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.v75;
import defpackage.wop;
import defpackage.x7j;
import defpackage.xq0;
import defpackage.xz0;
import defpackage.z7o;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes5.dex */
public final class k implements com.yandex.plus.experiments.api.providers.a {
    public final CommonExperimentsControllerApi a;
    public final com.yandex.plus.home.feature.webviews.internal.stories.i b;
    public final com.yandex.plus.home.feature.webviews.internal.stories.i c;
    public final com.yandex.plus.core.openapi.g d;
    public final Map e;
    public final a1 f;

    public k(CommonExperimentsControllerApi commonExperimentsControllerApi, com.yandex.plus.home.feature.webviews.internal.stories.i iVar, com.yandex.plus.home.feature.webviews.internal.stories.i iVar2, com.yandex.plus.core.openapi.g gVar, Map map) {
        gVar.getClass();
        map.getClass();
        this.a = commonExperimentsControllerApi;
        this.b = iVar;
        this.c = iVar2;
        this.d = gVar;
        this.e = map;
        this.f = new a1(21);
    }

    public static String b(String str, String str2) {
        List split$default;
        List split$default2;
        split$default = StringsKt__StringsKt.split$default(str, new String[]{";"}, false, 0, 6, null);
        split$default2 = StringsKt__StringsKt.split$default(str2, new String[]{";"}, false, 0, 6, null);
        return CollectionsKt.X(CollectionsKt.w0(CollectionsKt.z0(v75.p(xz0.w(new List[]{split$default, split$default2})))), ";", null, null, null, 62);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(12:5|6|(1:(1:(13:10|11|12|13|(2:15|(1:17)(2:49|50))(2:51|(1:53)(2:54|55))|18|(1:20)(2:45|(2:47|48))|21|(1:23)(1:44)|24|(1:26)|27|(1:(1:43)(3:(3:37|(1:41)|42)|35|36))(2:30|31))(2:59|60))(1:61))(3:90|(1:92)|74)|62|63|64|(2:66|(1:68)(2:80|81))(2:82|(1:84)(2:85|86))|69|(1:71)(2:76|(2:78|79))|72|(14:75|11|12|13|(0)(0)|18|(0)(0)|21|(0)(0)|24|(0)|27|(0)|(0)(0))|74))|93|6|(0)(0)|62|63|64|(0)(0)|69|(0)(0)|72|(0)|74) */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x008f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00a2, code lost:
    
        r13 = new com.yandex.plus.core.openapi.a.AbstractC0017a.c(r13.getB(), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00f6 A[Catch: all -> 0x010d, TryCatch #0 {all -> 0x010d, blocks: (B:13:0x00f2, B:15:0x00f6, B:17:0x0101, B:49:0x010f, B:50:0x0114, B:51:0x0115, B:54:0x011a, B:55:0x011f), top: B:12:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0115 A[Catch: all -> 0x010d, TryCatch #0 {all -> 0x010d, blocks: (B:13:0x00f2, B:15:0x00f6, B:17:0x0101, B:49:0x010f, B:50:0x0114, B:51:0x0115, B:54:0x011a, B:55:0x011f), top: B:12:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0078 A[Catch: all -> 0x008f, TryCatch #1 {all -> 0x008f, blocks: (B:64:0x0074, B:66:0x0078, B:68:0x0083, B:80:0x0091, B:81:0x0096, B:82:0x0097, B:85:0x009c, B:86:0x00a1), top: B:63:0x0074 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0097 A[Catch: all -> 0x008f, TryCatch #1 {all -> 0x008f, blocks: (B:64:0x0074, B:66:0x0078, B:68:0x0083, B:80:0x0091, B:81:0x0096, B:82:0x0097, B:85:0x009c, B:86:0x00a1), top: B:63:0x0074 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x004e  */
    @Override // com.yandex.plus.experiments.api.providers.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        j jVar;
        nm6 nm6Var;
        int i;
        m2 m2Var;
        com.yandex.plus.core.openapi.f fVar;
        com.yandex.plus.core.openapi.a aVar;
        Object a;
        Object obj;
        com.yandex.plus.core.openapi.a aVar2;
        boolean z;
        com.yandex.plus.experiments.api.a aVar3;
        if (cg6Var instanceof j) {
            jVar = (j) cg6Var;
            int i2 = jVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.o = i2 - Integer.MIN_VALUE;
                Object obj2 = jVar.m;
                nm6Var = nm6.a;
                i = jVar.o;
                a1 a1Var = this.f;
                com.yandex.plus.core.openapi.g gVar = this.d;
                CommonExperimentsControllerApi commonExperimentsControllerApi = this.a;
                com.yandex.plus.core.openapi.f fVar2 = com.yandex.plus.core.openapi.f.a;
                if (i != 0) {
                    qgg.h0(obj2);
                    m2 m2Var2 = new m2(this.e);
                    String str = (String) this.b.invoke();
                    jVar.j = m2Var2;
                    jVar.k = fVar2;
                    jVar.o = 1;
                    Object a2 = commonExperimentsControllerApi.a(str, m2Var2, jVar);
                    if (a2 != nm6Var) {
                        m2Var = m2Var2;
                        obj2 = a2;
                        fVar = fVar2;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fVar2 = jVar.l;
                    obj = jVar.k;
                    qgg.h0(obj2);
                    aVar2 = (com.yandex.plus.core.openapi.a) obj2;
                    try {
                        if (!(aVar2 instanceof a.b)) {
                            j2 j2Var = ((p2) ((a.b) aVar2).a).b;
                            if (j2Var == null) {
                                throw new IllegalArgumentException("mapNotNullCatching failed!");
                            }
                            aVar2 = new a.b(j2Var, ((a.b) aVar2).b);
                        } else if (!(aVar2 instanceof a.AbstractC0017a)) {
                            throw new x7j();
                        }
                    } catch (Throwable th) {
                        aVar2 = new a.AbstractC0017a.c(aVar2.getB(), th);
                    }
                    fVar2.getClass();
                    gVar.getClass();
                    gVar.a(aVar2);
                    if (!(aVar2 instanceof a.b)) {
                        a.b bVar = (a.b) aVar2;
                        aVar2 = new a.b(a1Var.e((j2) bVar.a), bVar.b);
                    } else if (!(aVar2 instanceof a.AbstractC0017a)) {
                        b6e.s();
                        return null;
                    }
                    Object a3 = com.yandex.plus.core.openapi.c.a(aVar2);
                    r7o r7oVar = z7o.b;
                    z = obj instanceof t7o;
                    aVar3 = (com.yandex.plus.experiments.api.a) (!z ? null : obj);
                    boolean z2 = a3 instanceof t7o;
                    com.yandex.plus.experiments.api.a aVar4 = (com.yandex.plus.experiments.api.a) (z2 ? null : a3);
                    if (aVar3 == null && aVar4 != null) {
                        return new com.yandex.plus.experiments.api.a(b(aVar3.a, aVar4.a), b(aVar3.b, aVar4.b), CollectionsKt.w0(CollectionsKt.z0(CollectionsKt.g0(aVar3.c, aVar4.c))), wop.i(aVar3.d, aVar4.d));
                    }
                    if (z) {
                        return obj;
                    }
                    if (z2) {
                        Throwable a4 = z7o.a(obj);
                        if (a4 == null && (a4 = z7o.a(a3)) == null) {
                            a4 = new IllegalStateException("Failed to load experiments");
                        }
                        a3 = new t7o(a4);
                    }
                    return a3;
                }
                fVar = (com.yandex.plus.core.openapi.f) jVar.k;
                m2Var = jVar.j;
                qgg.h0(obj2);
                aVar = (com.yandex.plus.core.openapi.a) obj2;
                if (!(aVar instanceof a.b)) {
                    j2 j2Var2 = ((p2) ((a.b) aVar).a).b;
                    if (j2Var2 == null) {
                        throw new IllegalArgumentException("mapNotNullCatching failed!");
                    }
                    aVar = new a.b(j2Var2, ((a.b) aVar).b);
                } else if (!(aVar instanceof a.AbstractC0017a)) {
                    throw new x7j();
                }
                fVar.getClass();
                gVar.getClass();
                gVar.a(aVar);
                if (!(aVar instanceof a.b)) {
                    a.b bVar2 = (a.b) aVar;
                    aVar = new a.b(a1Var.e((j2) bVar2.a), bVar2.b);
                } else if (!(aVar instanceof a.AbstractC0017a)) {
                    b6e.s();
                    return null;
                }
                Object a5 = com.yandex.plus.core.openapi.c.a(aVar);
                String str2 = (String) this.c.invoke();
                jVar.j = null;
                jVar.k = a5;
                jVar.l = fVar2;
                jVar.o = 2;
                a = commonExperimentsControllerApi.a(str2, m2Var, jVar);
                if (a != nm6Var) {
                    obj = a5;
                    obj2 = a;
                    aVar2 = (com.yandex.plus.core.openapi.a) obj2;
                    if (!(aVar2 instanceof a.b)) {
                    }
                    fVar2.getClass();
                    gVar.getClass();
                    gVar.a(aVar2);
                    if (!(aVar2 instanceof a.b)) {
                    }
                    Object a32 = com.yandex.plus.core.openapi.c.a(aVar2);
                    r7o r7oVar2 = z7o.b;
                    z = obj instanceof t7o;
                    aVar3 = (com.yandex.plus.experiments.api.a) (!z ? null : obj);
                    boolean z22 = a32 instanceof t7o;
                    com.yandex.plus.experiments.api.a aVar42 = (com.yandex.plus.experiments.api.a) (z22 ? null : a32);
                    if (aVar3 == null) {
                    }
                    if (z) {
                    }
                }
                return nm6Var;
            }
        }
        jVar = new j(this, cg6Var);
        Object obj22 = jVar.m;
        nm6Var = nm6.a;
        i = jVar.o;
        a1 a1Var2 = this.f;
        com.yandex.plus.core.openapi.g gVar2 = this.d;
        CommonExperimentsControllerApi commonExperimentsControllerApi2 = this.a;
        com.yandex.plus.core.openapi.f fVar22 = com.yandex.plus.core.openapi.f.a;
        if (i != 0) {
        }
        aVar = (com.yandex.plus.core.openapi.a) obj22;
        if (!(aVar instanceof a.b)) {
        }
        fVar.getClass();
        gVar2.getClass();
        gVar2.a(aVar);
        if (!(aVar instanceof a.b)) {
        }
        Object a52 = com.yandex.plus.core.openapi.c.a(aVar);
        String str22 = (String) this.c.invoke();
        jVar.j = null;
        jVar.k = a52;
        jVar.l = fVar22;
        jVar.o = 2;
        a = commonExperimentsControllerApi2.a(str22, m2Var, jVar);
        if (a != nm6Var) {
        }
        return nm6Var;
    }
}
