package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.e4;
import com.yandex.passport.internal.methods.v5;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class g0 implements z0 {
    public final com.yandex.passport.data.network.p0 a;
    public final com.yandex.passport.data.network.token.i b;
    public final com.yandex.passport.internal.core.accounts.e c;
    public final com.yandex.passport.internal.credentials.g d;
    public final com.yandex.passport.internal.network.mappers.b e;

    public g0(com.yandex.passport.data.network.p0 p0Var, com.yandex.passport.data.network.token.i iVar, com.yandex.passport.internal.core.accounts.e eVar, com.yandex.passport.internal.credentials.g gVar, com.yandex.passport.internal.network.mappers.b bVar) {
        p0Var.getClass();
        eVar.getClass();
        gVar.getClass();
        bVar.getClass();
        this.a = p0Var;
        this.b = iVar;
        this.c = eVar;
        this.d = gVar;
        this.e = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(g0 g0Var, com.yandex.passport.common.core.f fVar, com.yandex.passport.common.core.f fVar2, cg6 cg6Var) {
        f0 f0Var;
        int i;
        Object obj;
        if (cg6Var instanceof f0) {
            f0Var = (f0) cg6Var;
            int i2 = f0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f0Var.l = i2 - Integer.MIN_VALUE;
                Object obj2 = f0Var.j;
                nm6 nm6Var = nm6.a;
                i = f0Var.l;
                if (i != 0) {
                    qgg.h0(obj2);
                    com.yandex.passport.internal.d a = g0Var.c.a();
                    com.yandex.passport.internal.l e = a.e(fVar);
                    if (e == null) {
                        throw new com.yandex.passport.api.exception.b(fVar);
                    }
                    com.yandex.passport.common.core.f fVar3 = e.b;
                    com.yandex.passport.internal.l e2 = a.e(fVar2);
                    if (e2 == null) {
                        throw new com.yandex.passport.api.exception.b(fVar2);
                    }
                    com.yandex.passport.data.network.p0 p0Var = g0Var.a;
                    String d = e.d.d();
                    String d2 = e2.d.d();
                    long h = e.h();
                    String str = g0Var.d.b(fVar3.a).c;
                    com.yandex.passport.internal.network.mappers.b bVar = g0Var.e;
                    com.yandex.passport.common.core.b bVar2 = fVar3.a;
                    bVar.getClass();
                    com.yandex.passport.data.network.k0 k0Var = new com.yandex.passport.data.network.k0(d, d2, str, com.yandex.passport.internal.network.mappers.b.a(bVar2), h);
                    f0Var.l = 1;
                    obj2 = p0Var.g(k0Var, f0Var);
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                }
                obj = ((z7o) obj2).a;
                if (!(obj instanceof t7o)) {
                    try {
                        r7o r7oVar = z7o.b;
                        com.yandex.passport.data.network.o0 o0Var = (com.yandex.passport.data.network.o0) obj;
                        int i3 = o0Var.b ? 4 : o0Var.c ? 3 : 2;
                        Pattern pattern = com.yandex.passport.internal.h.e;
                        obj = new com.yandex.passport.internal.h(i3, CollectionsKt.y0(o0Var.d), new ArrayList(), new HashSet());
                    } catch (Throwable th) {
                        r7o r7oVar2 = z7o.b;
                        obj = new t7o(th);
                    }
                }
                if (!(obj instanceof t7o)) {
                    return obj;
                }
                r7o r7oVar3 = z7o.b;
                return ((com.yandex.passport.internal.h) obj).a();
            }
        }
        f0Var = new f0(g0Var, cg6Var);
        Object obj22 = f0Var.j;
        nm6 nm6Var2 = nm6.a;
        i = f0Var.l;
        if (i != 0) {
        }
        obj = ((z7o) obj22).a;
        if (!(obj instanceof t7o)) {
        }
        if (!(obj instanceof t7o)) {
        }
    }

    @Override // com.yandex.passport.internal.methods.performer.z0
    public final Object u(v5 v5Var) {
        Object A = com.yandex.passport.internal.ui.a.A(new b((e4) v5Var, this, null, 13));
        Throwable a = z7o.a(A);
        if (a == null) {
            return A;
        }
        try {
            throw com.yandex.passport.data.network.token.i.j(this.b, a, null, null, null, null, new com.yandex.passport.api.exception.k(String.valueOf(a.getMessage())), 30);
        } catch (Throwable th) {
            r7o r7oVar = z7o.b;
            return new t7o(th);
        }
    }
}
