package com.yandex.plus.core.graphql.fragment;

import com.connectsdk.service.airplay.PListParser;
import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class zl implements defpackage.pj {
    public static final zl a = new zl();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        xl xlVar = (xl) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        xlVar.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, xlVar.a);
        List list = ym.a;
        mm mmVar = xlVar.b;
        r7fVar.getClass();
        fx6Var.getClass();
        mmVar.getClass();
        r7fVar.Z("__typename");
        defpackage.tj tjVar = defpackage.uj.a;
        tjVar.a(r7fVar, fx6Var, mmVar.a);
        r7fVar.Z("altText");
        tjVar.a(r7fVar, fx6Var, mmVar.b);
        r7fVar.Z(PListParser.TAG_KEY);
        tjVar.a(r7fVar, fx6Var, mmVar.c);
        hm hmVar = mmVar.d;
        if (hmVar != null) {
            tm.d(r7fVar, fx6Var, hmVar);
        }
        im imVar = mmVar.e;
        if (imVar != null) {
            List list2 = um.a;
            r7fVar.Z("text");
            tjVar.a(r7fVar, fx6Var, imVar.a);
        }
        jm jmVar = mmVar.f;
        if (jmVar != null) {
            List list3 = vm.a;
            r7fVar.Z("image");
            qm qmVar = qm.a;
            em emVar = jmVar.a;
            r7fVar.j();
            qmVar.a(r7fVar, fx6Var, emVar);
            r7fVar.p();
        }
        km kmVar = mmVar.g;
        if (kmVar != null) {
            wm.d(r7fVar, fx6Var, kmVar);
        }
        lm lmVar = mmVar.h;
        if (lmVar != null) {
            List list4 = xm.a;
            r7fVar.Z("text");
            tjVar.a(r7fVar, fx6Var, lmVar.a);
        }
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        while (a7fVar.z0(b) == 0) {
            str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
        }
        a7fVar.k();
        mm c = ym.c(a7fVar, fx6Var);
        str.getClass();
        return new xl(str, c);
    }
}
