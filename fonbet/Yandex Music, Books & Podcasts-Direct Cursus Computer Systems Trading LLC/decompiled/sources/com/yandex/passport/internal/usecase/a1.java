package com.yandex.passport.internal.usecase;

import com.yandex.passport.data.network.d4;
import com.yandex.passport.data.network.h4;
import com.yandex.passport.data.network.i4;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.rhw;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class a1 extends com.yandex.passport.common.domain.a {
    public final com.yandex.passport.internal.properties.x b;
    public final i4 c;
    public final com.yandex.passport.internal.network.mappers.b d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.properties.x xVar, i4 i4Var, com.yandex.passport.internal.network.mappers.b bVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        aVar.getClass();
        xVar.getClass();
        i4Var.getClass();
        bVar.getClass();
        this.b = xVar;
        this.c = i4Var;
        this.d = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Serializable u(a1 a1Var, y0 y0Var, cg6 cg6Var) {
        z0 z0Var;
        int i;
        a1 a1Var2;
        com.yandex.passport.internal.credentials.f fVar;
        Object obj;
        if (cg6Var instanceof z0) {
            z0Var = (z0) cg6Var;
            int i2 = z0Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z0Var.n = i2 - Integer.MIN_VALUE;
                Object obj2 = z0Var.l;
                nm6 nm6Var = nm6.a;
                i = z0Var.n;
                String str = null;
                if (i != 0) {
                    qgg.h0(obj2);
                    com.yandex.passport.internal.credentials.f fVar2 = y0Var.b;
                    fVar2.getClass();
                    i4 i4Var = a1Var.c;
                    com.yandex.passport.internal.network.mappers.b bVar = a1Var.d;
                    com.yandex.passport.common.core.b bVar2 = y0Var.c;
                    bVar.getClass();
                    com.yandex.passport.data.models.g a = com.yandex.passport.internal.network.mappers.b.a(bVar2);
                    long j = y0Var.d;
                    com.yandex.passport.common.account.a aVar = y0Var.a;
                    String str2 = fVar2.c;
                    String str3 = fVar2.d;
                    com.yandex.passport.internal.properties.x xVar = a1Var.b;
                    d4 d4Var = new d4(a, j, aVar, str2, str3, xVar.c, xVar.d);
                    z0Var.j = a1Var;
                    z0Var.k = fVar2;
                    z0Var.n = 1;
                    Object g = i4Var.g(d4Var, z0Var);
                    if (g == nm6Var) {
                        return nm6Var;
                    }
                    a1Var2 = a1Var;
                    fVar = fVar2;
                    obj2 = g;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fVar = z0Var.k;
                    a1Var2 = z0Var.j;
                    qgg.h0(obj2);
                }
                obj = ((z7o) obj2).a;
                if (!(obj instanceof t7o)) {
                    try {
                        r7o r7oVar = z7o.b;
                        obj = new com.yandex.passport.internal.entities.e(((h4) obj).a, fVar.c);
                    } catch (Throwable th) {
                        r7o r7oVar2 = z7o.b;
                        obj = new t7o(th);
                    }
                }
                if (!(obj instanceof t7o)) {
                    r7o r7oVar3 = z7o.b;
                    a1Var2.getClass();
                    String str4 = ((com.yandex.passport.internal.entities.e) obj).a;
                    if (str4 != null && str4.length() > 0 && !str4.equals("-")) {
                        str = str4;
                    }
                    obj = new com.yandex.passport.common.account.a(str);
                }
                return new z7o(obj);
            }
        }
        z0Var = new z0(a1Var, cg6Var);
        Object obj22 = z0Var.l;
        nm6 nm6Var2 = nm6.a;
        i = z0Var.n;
        String str5 = null;
        if (i != 0) {
        }
        obj = ((z7o) obj22).a;
        if (!(obj instanceof t7o)) {
        }
        if (!(obj instanceof t7o)) {
        }
        return new z7o(obj);
    }

    @Override // androidx.core.app.n0
    /* renamed from: s */
    public final Object x(Object obj, rhw rhwVar) {
        return u(this, (y0) obj, rhwVar);
    }
}
