package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.t75;
import defpackage.vgj;
import io.appmetrica.analytics.impl.C0479n3;
import java.util.List;

/* loaded from: classes4.dex */
public final class mn implements defpackage.pj {
    public static final mn a = new mn();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        gn gnVar = (gn) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        gnVar.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, gnVar.a);
        List list = kb.a;
        hb hbVar = gnVar.b;
        r7fVar.getClass();
        fx6Var.getClass();
        hbVar.getClass();
        r7fVar.Z("text");
        vgj vgjVar = defpackage.uj.i;
        vgjVar.a(r7fVar, fx6Var, hbVar.a);
        r7fVar.Z("textColor");
        vgjVar.a(r7fVar, fx6Var, hbVar.b);
        r7fVar.Z("textColors");
        qhj qhjVar = new qhj(lb.a, true);
        gb gbVar = hbVar.c;
        if (gbVar == null) {
            r7fVar.B0();
        } else {
            qhjVar.a(r7fVar, fx6Var, gbVar);
        }
        r7fVar.Z("shape");
        vgjVar.a(r7fVar, fx6Var, hbVar.d);
        r7fVar.Z("imageUrl");
        vgjVar.a(r7fVar, fx6Var, hbVar.e);
        r7fVar.Z(C0479n3.g);
        qhj qhjVar2 = new qhj(jb.a, false);
        fb fbVar = hbVar.f;
        if (fbVar == null) {
            r7fVar.B0();
        } else {
            qhjVar2.a(r7fVar, fx6Var, fbVar);
        }
        r7fVar.Z("attributedText");
        qhj qhjVar3 = new qhj(ib.a, true);
        eb ebVar = hbVar.g;
        if (ebVar == null) {
            r7fVar.B0();
        } else {
            qhjVar3.a(r7fVar, fx6Var, ebVar);
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
        hb c = kb.c(a7fVar, fx6Var);
        str.getClass();
        return new gn(str, c);
    }
}
