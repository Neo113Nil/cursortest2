package com.yandex.passport.internal.usecase;

import com.yandex.passport.data.network.f9;
import com.yandex.passport.data.network.g9;
import com.yandex.passport.data.network.x8;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.rhw;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.xqn;
import defpackage.z7o;
import java.io.Serializable;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class z extends com.yandex.passport.common.domain.a {
    public final g9 b;
    public final com.yandex.passport.internal.core.accounts.e c;
    public final com.yandex.passport.internal.flags.i d;
    public final com.yandex.passport.internal.rotation.d e;
    public final com.yandex.passport.internal.network.mappers.b f;
    public final com.yandex.passport.data.mapper.a g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.yandex.passport.common.coroutine.a aVar, g9 g9Var, com.yandex.passport.internal.core.accounts.e eVar, com.yandex.passport.internal.flags.i iVar, com.yandex.passport.internal.rotation.d dVar, com.yandex.passport.internal.network.mappers.b bVar, com.yandex.passport.data.mapper.a aVar2) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        aVar.getClass();
        g9Var.getClass();
        eVar.getClass();
        iVar.getClass();
        dVar.getClass();
        bVar.getClass();
        aVar2.getClass();
        this.b = g9Var;
        this.c = eVar;
        this.d = iVar;
        this.e = dVar;
        this.f = bVar;
        this.g = aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0138 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Serializable u(z zVar, x xVar, cg6 cg6Var) {
        y yVar;
        int i;
        Object obj;
        int i2;
        Object obj2;
        f9 f9Var;
        com.yandex.passport.common.core.f fVar;
        xqn xqnVar;
        com.yandex.passport.common.core.g gVar;
        String str;
        com.yandex.passport.common.core.f fVar2;
        z zVar2;
        com.yandex.passport.common.core.g gVar2;
        xqn xqnVar2;
        com.yandex.passport.internal.credentials.f fVar3;
        com.yandex.passport.data.network.f1 f1Var;
        com.yandex.passport.api.o oVar;
        Object obj3;
        z zVar3 = zVar;
        x xVar2 = xVar;
        if (cg6Var instanceof y) {
            yVar = (y) cg6Var;
            int i3 = yVar.s;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                yVar.s = i3 - Integer.MIN_VALUE;
                Object obj4 = yVar.q;
                nm6 nm6Var = nm6.a;
                i = yVar.s;
                if (i != 0) {
                    qgg.h0(obj4);
                    g9 g9Var = zVar3.b;
                    com.yandex.passport.common.account.a aVar = xVar2.a;
                    com.yandex.passport.internal.network.mappers.b bVar = zVar3.f;
                    com.yandex.passport.common.core.b bVar2 = xVar2.b;
                    bVar.getClass();
                    x8 x8Var = new x8(xVar2.c, aVar, com.yandex.passport.internal.network.mappers.b.a(bVar2), xVar2.d, xVar2.e);
                    yVar.j = zVar3;
                    yVar.k = xVar2;
                    yVar.p = 0;
                    yVar.s = 1;
                    Object g = g9Var.g(x8Var, yVar);
                    if (g != nm6Var) {
                        obj = g;
                        i2 = 0;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xqnVar2 = yVar.o;
                    fVar2 = yVar.n;
                    gVar2 = yVar.m;
                    f9Var = yVar.l;
                    zVar2 = yVar.j;
                    qgg.h0(obj4);
                    obj3 = ((z7o) obj4).a;
                    if (!(obj3 instanceof t7o)) {
                        xqnVar2.a = (com.yandex.passport.internal.rotation.b) obj3;
                    }
                    r7o r7oVar = z7o.b;
                    fVar = fVar2;
                    gVar = gVar2;
                    xqnVar = xqnVar2;
                    zVar3 = zVar2;
                    com.yandex.passport.internal.rotation.b bVar3 = (com.yandex.passport.internal.rotation.b) xqnVar.a;
                    fVar3 = bVar3 != null ? bVar3.b : null;
                    zVar3.getClass();
                    if (fVar3 != null) {
                        try {
                            String str2 = fVar3.c;
                            String str3 = gVar.a;
                            str3.getClass();
                            gVar = com.yandex.passport.common.core.g.a(gVar, new JSONObject(str3).put("x_token_client_id", str2).toString(), null, 0L, -2);
                        } catch (Exception unused) {
                        }
                    }
                    f1Var = f9Var.b;
                    if (f1Var != null) {
                        com.yandex.passport.internal.l e = zVar3.c.a().e(fVar);
                        com.yandex.passport.common.time.a aVar2 = e != null ? new com.yandex.passport.common.time.a(e.l()) : null;
                        if (f1Var.e) {
                            oVar = com.yandex.passport.api.o.d;
                        } else if (f1Var.d) {
                            oVar = com.yandex.passport.api.o.b;
                        } else if (f1Var.b) {
                            oVar = com.yandex.passport.api.o.a;
                        } else if (f1Var.c) {
                            oVar = !(aVar2 == null ? false : com.yandex.passport.common.time.a.e(aVar2.a, 0L)) ? com.yandex.passport.api.o.c : com.yandex.passport.api.o.a;
                        } else {
                            oVar = com.yandex.passport.api.o.a;
                        }
                    } else {
                        oVar = null;
                    }
                    List list = f9Var.c;
                    com.yandex.passport.internal.rotation.b bVar4 = (com.yandex.passport.internal.rotation.b) xqnVar.a;
                    w wVar = new w(gVar, oVar, list, bVar4 != null ? bVar4.a : null);
                    r7o r7oVar2 = z7o.b;
                    obj2 = wVar;
                    return new z7o(obj2);
                }
                int i4 = yVar.p;
                xVar2 = yVar.k;
                z zVar4 = yVar.j;
                qgg.h0(obj4);
                i2 = i4;
                zVar3 = zVar4;
                obj = obj4;
                obj2 = ((z7o) obj).a;
                if (!(obj2 instanceof t7o)) {
                    r7o r7oVar3 = z7o.b;
                    f9Var = (f9) obj2;
                    com.yandex.passport.data.mapper.a aVar3 = zVar3.g;
                    com.yandex.passport.data.models.w wVar2 = f9Var.a;
                    aVar3.getClass();
                    com.yandex.passport.common.core.g a = com.yandex.passport.data.mapper.a.a(wVar2);
                    com.yandex.passport.common.core.b bVar5 = xVar2.b;
                    long j = a.d;
                    bVar5.getClass();
                    com.yandex.passport.common.core.f fVar4 = new com.yandex.passport.common.core.f(bVar5, j);
                    xqn xqnVar3 = new xqn();
                    boolean z = f9Var.e;
                    com.yandex.passport.common.core.b bVar6 = xVar2.b;
                    if (((Boolean) zVar3.d.b(com.yandex.passport.internal.flags.o.H)).booleanValue() && z && !com.yandex.plus.pay.ui.core.b.B(bVar6) && (str = f9Var.d) != null) {
                        com.yandex.passport.internal.rotation.d dVar = zVar3.e;
                        com.yandex.passport.internal.rotation.a aVar4 = new com.yandex.passport.internal.rotation.a(zVar3.c.a().e(fVar4), xVar2.a, xVar2.b, xVar2.c, str, fVar4);
                        fVar2 = fVar4;
                        yVar.j = zVar3;
                        yVar.k = null;
                        yVar.l = f9Var;
                        yVar.m = a;
                        yVar.n = fVar2;
                        yVar.o = xqnVar3;
                        yVar.p = i2;
                        yVar.s = 2;
                        obj4 = dVar.g(aVar4, yVar);
                        if (obj4 != nm6Var) {
                            zVar2 = zVar3;
                            gVar2 = a;
                            xqnVar2 = xqnVar3;
                            obj3 = ((z7o) obj4).a;
                            if (!(obj3 instanceof t7o)) {
                            }
                            r7o r7oVar4 = z7o.b;
                            fVar = fVar2;
                            gVar = gVar2;
                            xqnVar = xqnVar2;
                            zVar3 = zVar2;
                            com.yandex.passport.internal.rotation.b bVar32 = (com.yandex.passport.internal.rotation.b) xqnVar.a;
                            if (bVar32 != null) {
                            }
                            zVar3.getClass();
                            if (fVar3 != null) {
                            }
                            f1Var = f9Var.b;
                            if (f1Var != null) {
                            }
                            List list2 = f9Var.c;
                            com.yandex.passport.internal.rotation.b bVar42 = (com.yandex.passport.internal.rotation.b) xqnVar.a;
                            w wVar3 = new w(gVar, oVar, list2, bVar42 != null ? bVar42.a : null);
                            r7o r7oVar22 = z7o.b;
                            obj2 = wVar3;
                        }
                        return nm6Var;
                    }
                    fVar = fVar4;
                    xqnVar = xqnVar3;
                    gVar = a;
                    com.yandex.passport.internal.rotation.b bVar322 = (com.yandex.passport.internal.rotation.b) xqnVar.a;
                    if (bVar322 != null) {
                    }
                    zVar3.getClass();
                    if (fVar3 != null) {
                    }
                    f1Var = f9Var.b;
                    if (f1Var != null) {
                    }
                    List list22 = f9Var.c;
                    com.yandex.passport.internal.rotation.b bVar422 = (com.yandex.passport.internal.rotation.b) xqnVar.a;
                    w wVar32 = new w(gVar, oVar, list22, bVar422 != null ? bVar422.a : null);
                    r7o r7oVar222 = z7o.b;
                    obj2 = wVar32;
                }
                return new z7o(obj2);
            }
        }
        yVar = new y(zVar3, cg6Var);
        Object obj42 = yVar.q;
        nm6 nm6Var2 = nm6.a;
        i = yVar.s;
        if (i != 0) {
        }
        obj2 = ((z7o) obj).a;
        if (!(obj2 instanceof t7o)) {
        }
        return new z7o(obj2);
    }

    @Override // androidx.core.app.n0
    /* renamed from: s */
    public final Object x(Object obj, rhw rhwVar) {
        return u(this, (x) obj, rhwVar);
    }
}
