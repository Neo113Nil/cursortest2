package com.yandex.passport.internal.network;

import com.yandex.passport.data.network.core.s;
import com.yandex.passport.internal.report.reporters.g1;
import com.yandex.passport.internal.report.ve;
import com.yandex.passport.internal.report.wc;
import com.yandex.passport.internal.report.xc;
import defpackage.cg6;
import defpackage.hmm;
import defpackage.lmm;
import defpackage.nm6;
import defpackage.q5b;
import defpackage.qgg;
import defpackage.xq0;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class l implements s {
    public final com.yandex.passport.internal.storage.datastore.a a;
    public final com.yandex.passport.common.common.a b;
    public final g1 c;

    public l(com.yandex.passport.internal.storage.datastore.a aVar, com.yandex.passport.common.common.a aVar2, g1 g1Var) {
        aVar.getClass();
        aVar2.getClass();
        g1Var.getClass();
        this.a = aVar;
        this.b = aVar2;
        this.c = g1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, cg6 cg6Var) {
        i iVar;
        nm6 nm6Var;
        int i;
        String str3;
        com.yandex.passport.internal.storage.datastore.f fVar;
        Object a;
        String str4;
        String str5;
        if (cg6Var instanceof i) {
            iVar = (i) cg6Var;
            int i2 = iVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.o = i2 - Integer.MIN_VALUE;
                Object obj = iVar.m;
                nm6Var = nm6.a;
                i = iVar.o;
                com.yandex.passport.internal.storage.datastore.a aVar = this.a;
                if (i != 0) {
                    qgg.h0(obj);
                    if (str == null) {
                        return Unit.a;
                    }
                    com.yandex.passport.internal.storage.datastore.f fVar2 = new com.yandex.passport.internal.storage.datastore.f(new hmm.a(str), q5b.a);
                    iVar.j = str;
                    iVar.k = str2;
                    iVar.l = fVar2;
                    iVar.o = 1;
                    Object a2 = ((com.yandex.passport.internal.storage.datastore.e) aVar).a(fVar2, iVar);
                    if (a2 != nm6Var) {
                        str3 = str;
                        fVar = fVar2;
                        obj = a2;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str4 = iVar.k;
                    str5 = iVar.j;
                    qgg.h0(obj);
                    g1 g1Var = this.c;
                    g1Var.getClass();
                    str4.getClass();
                    g1Var.n(wc.d, new com.yandex.passport.internal.report.c("source", str4), new ve(str5, 0));
                    return Unit.a;
                }
                fVar = iVar.l;
                str2 = iVar.k;
                str3 = iVar.j;
                qgg.h0(obj);
                LinkedHashSet z0 = CollectionsKt.z0((Iterable) obj);
                z0.add(((com.yandex.passport.internal.common.d) this.b).a());
                hmm.a aVar2 = fVar.a;
                iVar.j = str3;
                iVar.k = str2;
                iVar.l = null;
                iVar.o = 2;
                a = lmm.a(((com.yandex.passport.internal.storage.datastore.e) aVar).a, new com.yandex.passport.internal.storage.datastore.c(aVar2, z0, null), iVar);
                if (a != nm6Var) {
                    a = Unit.a;
                }
                if (a != nm6Var) {
                    str4 = str2;
                    str5 = str3;
                    g1 g1Var2 = this.c;
                    g1Var2.getClass();
                    str4.getClass();
                    g1Var2.n(wc.d, new com.yandex.passport.internal.report.c("source", str4), new ve(str5, 0));
                    return Unit.a;
                }
                return nm6Var;
            }
        }
        iVar = new i(this, cg6Var);
        Object obj2 = iVar.m;
        nm6Var = nm6.a;
        i = iVar.o;
        com.yandex.passport.internal.storage.datastore.a aVar3 = this.a;
        if (i != 0) {
        }
        LinkedHashSet z02 = CollectionsKt.z0((Iterable) obj2);
        z02.add(((com.yandex.passport.internal.common.d) this.b).a());
        hmm.a aVar22 = fVar.a;
        iVar.j = str3;
        iVar.k = str2;
        iVar.l = null;
        iVar.o = 2;
        a = lmm.a(((com.yandex.passport.internal.storage.datastore.e) aVar3).a, new com.yandex.passport.internal.storage.datastore.c(aVar22, z02, null), iVar);
        if (a != nm6Var) {
        }
        if (a != nm6Var) {
        }
        return nm6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        if (r12 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, cg6 cg6Var) {
        j jVar;
        Object obj;
        int i;
        String str3;
        String str4;
        if (cg6Var instanceof j) {
            jVar = (j) cg6Var;
            int i2 = jVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.n = i2 - Integer.MIN_VALUE;
                obj = jVar.l;
                nm6 nm6Var = nm6.a;
                i = jVar.n;
                com.yandex.passport.internal.storage.datastore.a aVar = this.a;
                if (i != 0) {
                    qgg.h0(obj);
                    if (str == null) {
                        return Unit.a;
                    }
                    com.yandex.passport.internal.storage.datastore.f fVar = new com.yandex.passport.internal.storage.datastore.f(new hmm.a(str), q5b.a);
                    jVar.j = str;
                    jVar.k = str2;
                    jVar.n = 1;
                    obj = ((com.yandex.passport.internal.storage.datastore.e) aVar).a(fVar, jVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str4 = jVar.k;
                        str3 = jVar.j;
                        qgg.h0(obj);
                        g1 g1Var = this.c;
                        g1Var.getClass();
                        str4.getClass();
                        g1Var.n(xc.d, new com.yandex.passport.internal.report.c("source", str4), new ve(str3, 0));
                        return Unit.a;
                    }
                    str2 = jVar.k;
                    str = jVar.j;
                    qgg.h0(obj);
                }
                if (!((Set) obj).isEmpty()) {
                    return Unit.a;
                }
                str.getClass();
                hmm.a aVar2 = new hmm.a(str);
                jVar.j = str;
                jVar.k = str2;
                jVar.n = 2;
                Object a = lmm.a(((com.yandex.passport.internal.storage.datastore.e) aVar).a, new com.yandex.passport.internal.storage.datastore.b(aVar2, null), jVar);
                if (a != nm6Var) {
                    a = Unit.a;
                }
                if (a != nm6Var) {
                    String str5 = str2;
                    str3 = str;
                    str4 = str5;
                    g1 g1Var2 = this.c;
                    g1Var2.getClass();
                    str4.getClass();
                    g1Var2.n(xc.d, new com.yandex.passport.internal.report.c("source", str4), new ve(str3, 0));
                    return Unit.a;
                }
                return nm6Var;
            }
        }
        jVar = new j(this, cg6Var);
        obj = jVar.l;
        nm6 nm6Var2 = nm6.a;
        i = jVar.n;
        com.yandex.passport.internal.storage.datastore.a aVar3 = this.a;
        if (i != 0) {
        }
        if (!((Set) obj).isEmpty()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, cg6 cg6Var) {
        k kVar;
        int i;
        if (cg6Var instanceof k) {
            kVar = (k) cg6Var;
            int i2 = kVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.l = i2 - Integer.MIN_VALUE;
                Object obj = kVar.j;
                nm6 nm6Var = nm6.a;
                i = kVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    if (str == null) {
                        return Boolean.FALSE;
                    }
                    com.yandex.passport.internal.storage.datastore.f fVar = new com.yandex.passport.internal.storage.datastore.f(new hmm.a(str), q5b.a);
                    kVar.l = 1;
                    obj = ((com.yandex.passport.internal.storage.datastore.e) this.a).a(fVar, kVar);
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
                return Boolean.valueOf(!((Set) obj).contains(((com.yandex.passport.internal.common.d) this.b).a()));
            }
        }
        kVar = new k(this, cg6Var);
        Object obj2 = kVar.j;
        nm6 nm6Var2 = nm6.a;
        i = kVar.l;
        if (i != 0) {
        }
        return Boolean.valueOf(!((Set) obj2).contains(((com.yandex.passport.internal.common.d) this.b).a()));
    }
}
