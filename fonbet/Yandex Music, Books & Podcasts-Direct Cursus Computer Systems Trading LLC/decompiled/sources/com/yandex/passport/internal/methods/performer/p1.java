package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.q5;
import com.yandex.passport.internal.methods.v5;
import defpackage.cg6;
import defpackage.inr;
import defpackage.j9w;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.x97;
import defpackage.xq0;
import defpackage.z7o;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class p1 implements z0 {
    public final com.yandex.passport.internal.database.auth_cookie.b a;
    public final com.yandex.passport.data.network.token.i b;
    public final com.yandex.passport.internal.usecase.w0 c;

    public p1(com.yandex.passport.internal.database.auth_cookie.b bVar, com.yandex.passport.data.network.token.i iVar, com.yandex.passport.internal.usecase.w0 w0Var) {
        bVar.getClass();
        w0Var.getClass();
        this.a = bVar;
        this.b = iVar;
        this.c = w0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0080, code lost:
    
        if (r5 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0082, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(p1 p1Var, com.yandex.passport.common.core.f fVar, String str, cg6 cg6Var) {
        o1 o1Var;
        Object obj;
        int i;
        Object u;
        Object V;
        if (cg6Var instanceof o1) {
            o1Var = (o1) cg6Var;
            int i2 = o1Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o1Var.n = i2 - Integer.MIN_VALUE;
                Object obj2 = o1Var.l;
                obj = nm6.a;
                i = o1Var.n;
                if (i != 0) {
                    qgg.h0(obj2);
                    com.yandex.passport.internal.usecase.w0 w0Var = p1Var.c;
                    String k0 = StringsKt.k0(str, "://", str);
                    o1Var.j = fVar;
                    o1Var.k = str;
                    o1Var.n = 1;
                    u = w0Var.u(o1Var, fVar, k0);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj2);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = o1Var.k;
                    fVar = o1Var.j;
                    qgg.h0(obj2);
                    u = ((z7o) obj2).a;
                }
                qgg.h0(u);
                List list = ((com.yandex.passport.internal.entities.c) u).b;
                com.yandex.passport.internal.database.auth_cookie.b bVar = p1Var.a;
                o1Var.j = null;
                o1Var.k = null;
                o1Var.n = 2;
                V = x97.V(((com.yandex.passport.common.coroutine.b) bVar.b).f, new j9w(bVar, new com.yandex.passport.internal.database.auth_cookie.e(fVar, list, str), null, 14), o1Var);
                if (V != obj) {
                    V = Unit.a;
                }
            }
        }
        o1Var = new o1(p1Var, cg6Var);
        Object obj22 = o1Var.l;
        obj = nm6.a;
        i = o1Var.n;
        if (i != 0) {
        }
        qgg.h0(u);
        List list2 = ((com.yandex.passport.internal.entities.c) u).b;
        com.yandex.passport.internal.database.auth_cookie.b bVar2 = p1Var.a;
        o1Var.j = null;
        o1Var.k = null;
        o1Var.n = 2;
        V = x97.V(((com.yandex.passport.common.coroutine.b) bVar2.b).f, new j9w(bVar2, new com.yandex.passport.internal.database.auth_cookie.e(fVar, list2, str), null, 14), o1Var);
        if (V != obj) {
        }
    }

    @Override // com.yandex.passport.internal.methods.performer.z0
    public final Object u(v5 v5Var) {
        Object z = com.yandex.passport.internal.ui.a.z(new inr((q5) v5Var, this, (Continuation) null, 19));
        Throwable a = z7o.a(z);
        if (a == null) {
            return z;
        }
        try {
            if (a instanceof com.yandex.passport.api.exception.c) {
                throw new com.yandex.passport.api.exception.a();
            }
            throw com.yandex.passport.data.network.token.i.j(this.b, a, null, null, null, null, null, 62);
        } catch (Throwable th) {
            r7o r7oVar = z7o.b;
            return new t7o(th);
        }
    }
}
