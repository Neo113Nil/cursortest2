package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fah;
import defpackage.fx6;
import defpackage.irf;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.u75;
import defpackage.vgj;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class fg implements defpackage.pj {
    public static final List a = u75.h("plaqueId", "priority", "widgetsLevelIds", "contentDescription", "condition", "displayRules", "strictAction", "metricContext", "params", "seenContext", "notification", "serviceMeta");

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        r5 = r3;
        r4.getClass();
        r5.getClass();
        r5 = r5.intValue();
        r6.getClass();
        r8.getClass();
        r9.getClass();
        r15.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003c, code lost:
    
        return new com.yandex.plus.core.graphql.fragment.zc(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zc c(a7f a7fVar, fx6 fx6Var) {
        Integer num;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        a7fVar.getClass();
        fx6Var.getClass();
        Integer num2 = null;
        String str = null;
        ArrayList arrayList = null;
        tc tcVar = null;
        sc scVar = null;
        uc ucVar = null;
        yc ycVar = null;
        vc vcVar = null;
        xc xcVar = null;
        String str2 = null;
        wc wcVar = null;
        Map map = null;
        while (true) {
            switch (a7fVar.z0(a)) {
                case 0:
                    str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
                    continue;
                case 1:
                    num2 = (Integer) defpackage.uj.b.b(a7fVar, fx6Var);
                    continue;
                case 2:
                    arrayList = defpackage.uj.a(defpackage.uj.i).c(a7fVar, fx6Var);
                    continue;
                case 3:
                    num = num2;
                    ag agVar = ag.a;
                    defpackage.tj tjVar = defpackage.uj.a;
                    qhj qhjVar = new qhj(agVar, true);
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj = null;
                    } else {
                        obj = qhjVar.b(a7fVar, fx6Var);
                    }
                    tcVar = (tc) obj;
                    break;
                case 4:
                    num = num2;
                    zf zfVar = zf.a;
                    defpackage.tj tjVar2 = defpackage.uj.a;
                    scVar = (sc) new qhj(zfVar, true).b(a7fVar, fx6Var);
                    break;
                case 5:
                    num = num2;
                    bg bgVar = bg.a;
                    defpackage.tj tjVar3 = defpackage.uj.a;
                    ucVar = (uc) new qhj(bgVar, true).b(a7fVar, fx6Var);
                    break;
                case 6:
                    num = num2;
                    gg ggVar = gg.a;
                    defpackage.tj tjVar4 = defpackage.uj.a;
                    qhj qhjVar2 = new qhj(ggVar, true);
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj2 = null;
                    } else {
                        obj2 = qhjVar2.b(a7fVar, fx6Var);
                    }
                    ycVar = (yc) obj2;
                    break;
                case 7:
                    num = num2;
                    cg cgVar = cg.a;
                    defpackage.tj tjVar5 = defpackage.uj.a;
                    qhj qhjVar3 = new qhj(cgVar, true);
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj3 = null;
                    } else {
                        obj3 = qhjVar3.b(a7fVar, fx6Var);
                    }
                    vcVar = (vc) obj3;
                    break;
                case 8:
                    num = num2;
                    eg egVar = eg.a;
                    defpackage.tj tjVar6 = defpackage.uj.a;
                    qhj qhjVar4 = new qhj(egVar, false);
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj4 = null;
                    } else {
                        obj4 = qhjVar4.b(a7fVar, fx6Var);
                    }
                    xcVar = (xc) obj4;
                    break;
                case 9:
                    str2 = (String) defpackage.uj.i.b(a7fVar, fx6Var);
                    continue;
                case 10:
                    num = num2;
                    dg dgVar = dg.a;
                    defpackage.tj tjVar7 = defpackage.uj.a;
                    qhj qhjVar5 = new qhj(dgVar, true);
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj5 = null;
                    } else {
                        obj5 = qhjVar5.b(a7fVar, fx6Var);
                    }
                    wcVar = (wc) obj5;
                    break;
                case 11:
                    map = (Map) fx6Var.e(com.yandex.plus.core.graphql.type.z.c).b(a7fVar, fx6Var);
                    continue;
            }
            num2 = num;
        }
    }

    public static void d(r7f r7fVar, fx6 fx6Var, zc zcVar) {
        r7fVar.getClass();
        fx6Var.getClass();
        zcVar.getClass();
        r7fVar.Z("plaqueId");
        defpackage.uj.a.a(r7fVar, fx6Var, zcVar.a);
        r7fVar.Z("priority");
        defpackage.uj.b.a(r7fVar, fx6Var, Integer.valueOf(zcVar.b));
        r7fVar.Z("widgetsLevelIds");
        vgj vgjVar = defpackage.uj.i;
        defpackage.uj.a(vgjVar).e(r7fVar, fx6Var, zcVar.c);
        r7fVar.Z("contentDescription");
        qhj qhjVar = new qhj(ag.a, true);
        tc tcVar = zcVar.d;
        if (tcVar == null) {
            r7fVar.B0();
        } else {
            qhjVar.a(r7fVar, fx6Var, tcVar);
        }
        r7fVar.Z("condition");
        zf zfVar = zf.a;
        sc scVar = zcVar.e;
        boolean z = r7fVar instanceof fah;
        if (z) {
            r7fVar.j();
            zfVar.a(r7fVar, fx6Var, scVar);
            r7fVar.p();
        } else {
            fah fahVar = new fah();
            fahVar.j();
            zfVar.a(fahVar, fx6Var, scVar);
            fahVar.p();
            Object b = fahVar.b();
            b.getClass();
            irf.V(r7fVar, b);
        }
        r7fVar.Z("displayRules");
        bg bgVar = bg.a;
        uc ucVar = zcVar.f;
        if (z) {
            r7fVar.j();
            bgVar.a(r7fVar, fx6Var, ucVar);
            r7fVar.p();
        } else {
            fah fahVar2 = new fah();
            fahVar2.j();
            bgVar.a(fahVar2, fx6Var, ucVar);
            fahVar2.p();
            Object b2 = fahVar2.b();
            b2.getClass();
            irf.V(r7fVar, b2);
        }
        r7fVar.Z("strictAction");
        qhj qhjVar2 = new qhj(gg.a, true);
        yc ycVar = zcVar.g;
        if (ycVar == null) {
            r7fVar.B0();
        } else {
            qhjVar2.a(r7fVar, fx6Var, ycVar);
        }
        r7fVar.Z("metricContext");
        qhj qhjVar3 = new qhj(cg.a, true);
        vc vcVar = zcVar.h;
        if (vcVar == null) {
            r7fVar.B0();
        } else {
            qhjVar3.a(r7fVar, fx6Var, vcVar);
        }
        r7fVar.Z("params");
        qhj qhjVar4 = new qhj(eg.a, false);
        xc xcVar = zcVar.i;
        if (xcVar == null) {
            r7fVar.B0();
        } else {
            qhjVar4.a(r7fVar, fx6Var, xcVar);
        }
        r7fVar.Z("seenContext");
        vgjVar.a(r7fVar, fx6Var, zcVar.j);
        r7fVar.Z("notification");
        qhj qhjVar5 = new qhj(dg.a, true);
        wc wcVar = zcVar.k;
        if (wcVar == null) {
            r7fVar.B0();
        } else {
            qhjVar5.a(r7fVar, fx6Var, wcVar);
        }
        r7fVar.Z("serviceMeta");
        fx6Var.e(com.yandex.plus.core.graphql.type.z.c).a(r7fVar, fx6Var, zcVar.l);
    }
}
