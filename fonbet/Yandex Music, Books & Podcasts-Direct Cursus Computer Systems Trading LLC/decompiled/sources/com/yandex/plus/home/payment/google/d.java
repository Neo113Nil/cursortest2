package com.yandex.plus.home.payment.google;

import com.yandex.passport.internal.ui.social.i;
import com.yandex.plus.pay.adapter.api.g0;
import com.yandex.plus.pay.adapter.api.r;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.jyr;
import defpackage.msa;
import defpackage.nm6;
import defpackage.nsa;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.ssa;
import defpackage.tyf;
import defpackage.xq0;
import defpackage.yd5;
import defpackage.z7o;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class d {
    public final g0 a;
    public final com.yandex.plus.home.api.payment.google.c b;
    public final g c;

    public d(g0 g0Var, com.yandex.plus.home.api.payment.google.c cVar, g gVar) {
        g0Var.getClass();
        gVar.getClass();
        this.a = g0Var;
        this.b = cVar;
        this.c = gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        if (r6 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(d dVar, cg6 cg6Var) {
        c cVar;
        int i;
        if (cg6Var instanceof c) {
            cVar = (c) cg6Var;
            int i2 = cVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.l = i2 - Integer.MIN_VALUE;
                Object obj = cVar.j;
                Object obj2 = nm6.a;
                i = cVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.plus.home.api.payment.google.c cVar2 = dVar.b;
                    if (cVar2 instanceof com.yandex.plus.home.api.payment.google.b) {
                        cVar.l = 1;
                        Object b = dVar.b(cVar);
                        if (b != obj2) {
                            return b;
                        }
                    } else {
                        if (!(cVar2 instanceof com.yandex.plus.home.api.payment.google.a)) {
                            b6e.s();
                            return null;
                        }
                        cVar.l = 2;
                        obj = dVar.b(cVar);
                    }
                    return obj2;
                }
                if (i == 1) {
                    qgg.h0(obj);
                    return obj;
                }
                if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                String str = ((com.yandex.plus.home.feature.webviews.internalapi.payment.a) obj).a;
                str.getClass();
                return new com.yandex.plus.home.feature.webviews.internalapi.payment.a(str, true);
            }
        }
        cVar = new c(dVar, cg6Var);
        Object obj3 = cVar.j;
        Object obj22 = nm6.a;
        i = cVar.l;
        if (i != 0) {
        }
        String str2 = ((com.yandex.plus.home.feature.webviews.internalapi.payment.a) obj3).a;
        str2.getClass();
        return new com.yandex.plus.home.feature.webviews.internalapi.payment.a(str2, true);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:20|21))(3:22|23|(1:25))|11|12|(2:14|15)(2:17|18)))|33|6|7|(0)(0)|11|12|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002c, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        r0 = defpackage.z7o.b;
        r0 = new defpackage.t7o(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        r8 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x002a, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005e, code lost:
    
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0028, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0055, code lost:
    
        r0 = defpackage.z7o.b;
        r0 = new defpackage.t7o(r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var) {
        b bVar;
        int i;
        Throwable a;
        if (cg6Var instanceof b) {
            bVar = (b) cg6Var;
            int i2 = bVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.l = i2 - Integer.MIN_VALUE;
                Object obj = bVar.j;
                nm6 nm6Var = nm6.a;
                i = bVar.l;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    r7o r7oVar = z7o.b;
                    msa msaVar = nsa.b;
                    long M = yd5.M(3, ssa.SECONDS);
                    i iVar = new i(this, continuation, 22);
                    bVar.l = 1;
                    obj = tyf.K(M, iVar, bVar);
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
                r7o r7oVar2 = z7o.b;
                a = z7o.a(obj);
                if (a != null) {
                    r rVar = (r) obj;
                    return new com.yandex.plus.home.feature.webviews.internalapi.payment.a(rVar.a, rVar.b);
                }
                com.yandex.plus.core.analytics.logging.b bVar2 = com.yandex.plus.core.analytics.logging.b.f;
                String valueOf = String.valueOf(a);
                jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
                com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.e, bVar2, valueOf, null);
                return new com.yandex.plus.home.feature.webviews.internalapi.payment.a("UNDEFINED", true);
            }
        }
        bVar = new b(this, cg6Var);
        Object obj2 = bVar.j;
        nm6 nm6Var2 = nm6.a;
        i = bVar.l;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        r7o r7oVar22 = z7o.b;
        a = z7o.a(obj2);
        if (a != null) {
        }
    }
}
