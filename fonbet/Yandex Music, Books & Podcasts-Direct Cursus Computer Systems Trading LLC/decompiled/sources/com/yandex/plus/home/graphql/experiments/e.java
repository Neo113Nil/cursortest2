package com.yandex.plus.home.graphql.experiments;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.t9f;
import defpackage.xq0;
import defpackage.z7o;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class e extends com.yandex.plus.experiments.api.cache.c {
    public final com.yandex.plus.home.internal.di.g c;
    public final com.yandex.plus.home.datasource.local.preferences.j d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.yandex.plus.core.android.extensions.c cVar, long j, com.yandex.plus.core.config.a aVar, com.yandex.plus.home.datasource.local.preferences.a aVar2, com.yandex.plus.home.internal.di.g gVar) {
        super(cVar, j);
        cVar.getClass();
        aVar2.getClass();
        this.c = gVar;
        String name = aVar.name();
        t9f serializer = com.yandex.plus.experiments.api.cache.f.Companion.serializer();
        name.getClass();
        serializer.getClass();
        this.d = aVar2.a(serializer, name);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (r5.d.d((java.lang.String) r8, null, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.yandex.plus.experiments.api.cache.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, Continuation continuation) {
        a aVar;
        int i;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.m = i2 - Integer.MIN_VALUE;
                Object obj = aVar.k;
                Object obj2 = nm6.a;
                i = aVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    aVar.j = j;
                    aVar.m = 1;
                    obj = j(aVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        ((z7o) obj).getClass();
                        return Unit.a;
                    }
                    j = aVar.j;
                    qgg.h0(obj);
                }
                aVar.j = j;
                aVar.m = 2;
            }
        }
        aVar = new a(this, (cg6) continuation);
        Object obj3 = aVar.k;
        Object obj22 = nm6.a;
        i = aVar.m;
        if (i != 0) {
        }
        aVar.j = j;
        aVar.m = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r7 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.yandex.plus.experiments.api.cache.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(cg6 cg6Var) {
        c cVar;
        int i;
        com.yandex.plus.home.datasource.local.preferences.j jVar;
        Object b;
        if (cg6Var instanceof c) {
            cVar = (c) cg6Var;
            int i2 = cVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.m = i2 - Integer.MIN_VALUE;
                Object obj = cVar.k;
                Object obj2 = nm6.a;
                i = cVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    jVar = this.d;
                    cVar.j = jVar;
                    cVar.m = 1;
                    obj = j(cVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        b = ((z7o) obj).a;
                        r7o r7oVar = z7o.b;
                        if (b instanceof t7o) {
                            return null;
                        }
                        return b;
                    }
                    jVar = cVar.j;
                    qgg.h0(obj);
                }
                cVar.j = null;
                cVar.m = 2;
                b = jVar.b((String) obj, cVar);
            }
        }
        cVar = new c(this, cg6Var);
        Object obj3 = cVar.k;
        Object obj22 = nm6.a;
        i = cVar.m;
        if (i != 0) {
        }
        cVar.j = null;
        cVar.m = 2;
        b = jVar.b((String) obj3, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        if (r7.d((java.lang.String) r8, r2, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.yandex.plus.experiments.api.cache.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(com.yandex.plus.experiments.api.cache.f fVar, cg6 cg6Var) {
        d dVar;
        int i;
        com.yandex.plus.experiments.api.cache.f fVar2;
        com.yandex.plus.home.datasource.local.preferences.j jVar;
        if (cg6Var instanceof d) {
            dVar = (d) cg6Var;
            int i2 = dVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.n = i2 - Integer.MIN_VALUE;
                Object obj = dVar.l;
                Object obj2 = nm6.a;
                i = dVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    dVar.j = fVar;
                    com.yandex.plus.home.datasource.local.preferences.j jVar2 = this.d;
                    dVar.k = jVar2;
                    dVar.n = 1;
                    Object j = j(dVar);
                    if (j != obj2) {
                        fVar2 = fVar;
                        jVar = jVar2;
                        obj = j;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    ((z7o) obj).getClass();
                    return Unit.a;
                }
                jVar = dVar.k;
                fVar2 = dVar.j;
                qgg.h0(obj);
                dVar.j = null;
                dVar.k = null;
                dVar.n = 2;
            }
        }
        dVar = new d(this, cg6Var);
        Object obj3 = dVar.l;
        Object obj22 = nm6.a;
        i = dVar.n;
        if (i != 0) {
        }
        dVar.j = null;
        dVar.k = null;
        dVar.n = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(cg6 cg6Var) {
        b bVar;
        int i;
        if (cg6Var instanceof b) {
            bVar = (b) cg6Var;
            int i2 = bVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.l = i2 - Integer.MIN_VALUE;
                Object obj = bVar.j;
                nm6 nm6Var = nm6.a;
                i = bVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    bVar.l = 1;
                    obj = this.c.invoke(bVar);
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
                return String.valueOf(obj);
            }
        }
        bVar = new b(this, cg6Var);
        Object obj2 = bVar.j;
        nm6 nm6Var2 = nm6.a;
        i = bVar.l;
        if (i != 0) {
        }
        return String.valueOf(obj2);
    }
}
