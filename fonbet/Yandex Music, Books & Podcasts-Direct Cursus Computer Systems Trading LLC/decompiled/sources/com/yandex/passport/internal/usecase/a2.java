package com.yandex.passport.internal.usecase;

import com.yandex.passport.data.network.fa;
import com.yandex.passport.data.network.ha;
import com.yandex.passport.internal.report.d9;
import com.yandex.passport.internal.report.e9;
import com.yandex.passport.internal.report.ue;
import com.yandex.passport.internal.report.ve;
import com.yandex.passport.internal.report.ze;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.rhw;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class a2 extends com.yandex.passport.common.domain.a {
    public final ha b;
    public final q2 c;
    public final com.yandex.passport.internal.credentials.g d;
    public final com.yandex.passport.internal.report.reporters.f1 e;
    public final com.yandex.passport.internal.network.mappers.b f;
    public final com.yandex.passport.internal.core.tokens.a g;
    public final com.yandex.passport.internal.push.s0 h;
    public final com.yandex.passport.internal.push.u0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(com.yandex.passport.common.coroutine.a aVar, ha haVar, q2 q2Var, com.yandex.passport.internal.credentials.g gVar, com.yandex.passport.internal.report.reporters.f1 f1Var, com.yandex.passport.internal.network.mappers.b bVar, com.yandex.passport.internal.core.tokens.a aVar2, com.yandex.passport.internal.push.s0 s0Var, com.yandex.passport.internal.push.u0 u0Var) {
        super(((com.yandex.passport.common.coroutine.b) aVar).d);
        aVar.getClass();
        haVar.getClass();
        q2Var.getClass();
        gVar.getClass();
        f1Var.getClass();
        bVar.getClass();
        aVar2.getClass();
        s0Var.getClass();
        u0Var.getClass();
        this.b = haVar;
        this.c = q2Var;
        this.d = gVar;
        this.e = f1Var;
        this.f = bVar;
        this.g = aVar2;
        this.h = s0Var;
        this.i = u0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object u(a2 a2Var, com.yandex.passport.internal.l lVar, com.yandex.passport.common.account.a aVar, w1 w1Var, com.yandex.passport.common.core.f fVar, com.yandex.passport.internal.report.reporters.x0 x0Var, cg6 cg6Var) {
        y1 y1Var;
        int i;
        if (cg6Var instanceof y1) {
            y1Var = (y1) cg6Var;
            int i2 = y1Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y1Var.l = i2 - Integer.MIN_VALUE;
                Object obj = y1Var.j;
                Object obj2 = nm6.a;
                i = y1Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Object v1Var = new v1(lVar, aVar, w1Var, fVar, x0Var, true);
                    y1Var.l = 1;
                    obj = a2Var.g(v1Var, y1Var);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return ((z7o) obj).a;
            }
        }
        y1Var = new y1(a2Var, cg6Var);
        Object obj3 = y1Var.j;
        Object obj22 = nm6.a;
        i = y1Var.l;
        if (i != 0) {
        }
        return ((z7o) obj3).a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0097 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Serializable v(a2 a2Var, v1 v1Var, cg6 cg6Var) {
        z1 z1Var;
        nm6 nm6Var;
        int i;
        Object obj;
        int i2;
        com.yandex.passport.internal.credentials.f c;
        int i3;
        boolean z;
        com.yandex.passport.internal.l lVar;
        char c2;
        Object g;
        a2 a2Var2;
        v1 v1Var2;
        Object obj2;
        char c3;
        char c4;
        char c5;
        Throwable a;
        a2 a2Var3 = a2Var;
        v1 v1Var3 = v1Var;
        if (cg6Var instanceof z1) {
            z1Var = (z1) cg6Var;
            int i4 = z1Var.o;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                z1Var.o = i4 - Integer.MIN_VALUE;
                Object obj3 = z1Var.m;
                nm6Var = nm6.a;
                i = z1Var.o;
                if (i != 0) {
                    qgg.h0(obj3);
                    com.yandex.plus.core.locale.b bVar = v1Var3.c;
                    com.yandex.passport.common.core.f fVar = v1Var3.d;
                    if (!(bVar instanceof x1)) {
                        if (!(bVar instanceof w1)) {
                            b6e.s();
                            return null;
                        }
                        q2 q2Var = a2Var3.c;
                        p2 p2Var = new p2(((w1) bVar).a, fVar.a);
                        z1Var.j = a2Var3;
                        z1Var.k = v1Var3;
                        z1Var.l = 0;
                        z1Var.o = 1;
                        Object g2 = q2Var.g(p2Var, z1Var);
                        if (g2 != nm6Var) {
                            obj = g2;
                            i2 = 0;
                        }
                        return nm6Var;
                    }
                    c = a2Var3.d.c(fVar.a, ((x1) bVar).a);
                    i3 = 0;
                    z = v1Var3.f;
                    lVar = v1Var3.a;
                    if (z && lVar != null) {
                        com.yandex.passport.common.core.f fVar2 = lVar.b;
                        a2Var3.h.a(fVar2, false);
                        a2Var3.i.b(fVar2);
                    }
                    ha haVar = a2Var3.b;
                    com.yandex.passport.internal.network.mappers.b bVar2 = a2Var3.f;
                    com.yandex.passport.common.core.b bVar3 = v1Var3.d.a;
                    bVar2.getClass();
                    com.yandex.passport.data.models.g a2 = com.yandex.passport.internal.network.mappers.b.a(bVar3);
                    String str = c.c;
                    String str2 = c.d;
                    c2 = true;
                    fa faVar = new fa(a2, str, str2, v1Var3.b.e(), lVar != null ? new Long(lVar.h()) : null);
                    z1Var.j = a2Var3;
                    z1Var.k = v1Var3;
                    z1Var.l = i3;
                    z1Var.o = 2;
                    g = haVar.g(faVar, z1Var);
                    if (g != nm6Var) {
                        v1 v1Var4 = v1Var3;
                        a2Var2 = a2Var3;
                        v1Var2 = v1Var4;
                        obj2 = ((z7o) g).a;
                        if (obj2 instanceof t7o) {
                        }
                        a = z7o.a(obj2);
                        if (a != null) {
                        }
                        return new z7o(obj2);
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    v1Var2 = z1Var.k;
                    a2Var2 = z1Var.j;
                    qgg.h0(obj3);
                    g = obj3;
                    c2 = true;
                    obj2 = ((z7o) g).a;
                    if (obj2 instanceof t7o) {
                        com.yandex.passport.internal.report.reporters.f1 f1Var = a2Var2.e;
                        com.yandex.passport.internal.report.reporters.x0 x0Var = v1Var2.e;
                        com.yandex.passport.internal.l lVar2 = v1Var2.a;
                        com.yandex.passport.common.core.f fVar3 = v1Var2.d;
                        com.yandex.passport.common.core.f fVar4 = lVar2 != null ? lVar2.c : null;
                        String e = v1Var2.b.e();
                        f1Var.getClass();
                        x0Var.getClass();
                        fVar3.getClass();
                        c3 = c2;
                        e9 e9Var = e9.d;
                        c5 = 3;
                        ve veVar = new ve(e, 0);
                        c4 = 2;
                        ve veVar2 = new ve(x0Var.a(), 17);
                        com.yandex.passport.internal.report.c cVar = new com.yandex.passport.internal.report.c(Long.valueOf(fVar3.b));
                        ve veVar3 = new ve(fVar4 != null ? Long.valueOf(fVar4.b) : null);
                        ze[] zeVarArr = new ze[4];
                        zeVarArr[0] = veVar;
                        zeVarArr[c3 == true ? 1 : 0] = veVar2;
                        zeVarArr[2] = cVar;
                        zeVarArr[3] = veVar3;
                        f1Var.n(e9Var, zeVarArr);
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, x0Var.a(), 8);
                        }
                        if (lVar2 != null) {
                            a2Var2.g.a(lVar2);
                        }
                    } else {
                        c3 = c2;
                        c4 = 2;
                        c5 = 3;
                    }
                    a = z7o.a(obj2);
                    if (a != null) {
                        com.yandex.passport.internal.report.reporters.f1 f1Var2 = a2Var2.e;
                        com.yandex.passport.internal.report.reporters.x0 x0Var2 = v1Var2.e;
                        com.yandex.passport.common.core.f fVar5 = v1Var2.d;
                        com.yandex.passport.internal.l lVar3 = v1Var2.a;
                        com.yandex.passport.common.core.f fVar6 = lVar3 != null ? lVar3.c : null;
                        String e2 = v1Var2.b.e();
                        f1Var2.getClass();
                        x0Var2.getClass();
                        fVar5.getClass();
                        d9 d9Var = d9.d;
                        ve veVar4 = new ve(e2, 0);
                        ve veVar5 = new ve(x0Var2.a(), 17);
                        com.yandex.passport.internal.report.c cVar2 = new com.yandex.passport.internal.report.c(Long.valueOf(fVar5.b));
                        ve veVar6 = new ve(fVar6 != null ? Long.valueOf(fVar6.b) : null);
                        ue ueVar = new ue(a);
                        ze[] zeVarArr2 = new ze[5];
                        zeVarArr2[0] = veVar4;
                        zeVarArr2[c3] = veVar5;
                        zeVarArr2[c4] = cVar2;
                        zeVarArr2[c5] = veVar6;
                        zeVarArr2[4] = ueVar;
                        f1Var2.n(d9Var, zeVarArr2);
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, x0Var2.a(), 8);
                        }
                    }
                    return new z7o(obj2);
                }
                int i5 = z1Var.l;
                v1Var3 = z1Var.k;
                a2 a2Var4 = z1Var.j;
                qgg.h0(obj3);
                i2 = i5;
                a2Var3 = a2Var4;
                obj = obj3;
                com.yandex.passport.internal.credentials.f fVar7 = (com.yandex.passport.internal.credentials.f) obj;
                i3 = i2;
                c = fVar7;
                z = v1Var3.f;
                lVar = v1Var3.a;
                if (z) {
                    com.yandex.passport.common.core.f fVar22 = lVar.b;
                    a2Var3.h.a(fVar22, false);
                    a2Var3.i.b(fVar22);
                }
                ha haVar2 = a2Var3.b;
                com.yandex.passport.internal.network.mappers.b bVar22 = a2Var3.f;
                com.yandex.passport.common.core.b bVar32 = v1Var3.d.a;
                bVar22.getClass();
                com.yandex.passport.data.models.g a22 = com.yandex.passport.internal.network.mappers.b.a(bVar32);
                String str3 = c.c;
                String str22 = c.d;
                c2 = true;
                fa faVar2 = new fa(a22, str3, str22, v1Var3.b.e(), lVar != null ? new Long(lVar.h()) : null);
                z1Var.j = a2Var3;
                z1Var.k = v1Var3;
                z1Var.l = i3;
                z1Var.o = 2;
                g = haVar2.g(faVar2, z1Var);
                if (g != nm6Var) {
                }
                return nm6Var;
            }
        }
        z1Var = new z1(a2Var3, cg6Var);
        Object obj32 = z1Var.m;
        nm6Var = nm6.a;
        i = z1Var.o;
        if (i != 0) {
        }
        com.yandex.passport.internal.credentials.f fVar72 = (com.yandex.passport.internal.credentials.f) obj;
        i3 = i2;
        c = fVar72;
        z = v1Var3.f;
        lVar = v1Var3.a;
        if (z) {
        }
        ha haVar22 = a2Var3.b;
        com.yandex.passport.internal.network.mappers.b bVar222 = a2Var3.f;
        com.yandex.passport.common.core.b bVar322 = v1Var3.d.a;
        bVar222.getClass();
        com.yandex.passport.data.models.g a222 = com.yandex.passport.internal.network.mappers.b.a(bVar322);
        String str32 = c.c;
        String str222 = c.d;
        c2 = true;
        fa faVar22 = new fa(a222, str32, str222, v1Var3.b.e(), lVar != null ? new Long(lVar.h()) : null);
        z1Var.j = a2Var3;
        z1Var.k = v1Var3;
        z1Var.l = i3;
        z1Var.o = 2;
        g = haVar22.g(faVar22, z1Var);
        if (g != nm6Var) {
        }
        return nm6Var;
    }

    @Override // androidx.core.app.n0
    /* renamed from: s */
    public final Object x(Object obj, rhw rhwVar) {
        return v(this, (v1) obj, rhwVar);
    }
}
