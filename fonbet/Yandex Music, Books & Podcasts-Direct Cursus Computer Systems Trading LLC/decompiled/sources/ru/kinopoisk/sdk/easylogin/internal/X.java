package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.d85;
import defpackage.gq5;
import defpackage.hq5;
import defpackage.oq5;
import defpackage.pyc;
import defpackage.u7g;
import defpackage.ugo;
import defpackage.uif;
import defpackage.xp3;
import defpackage.yci;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class X extends uif implements pyc {
    public static final X a = new X();

    public X() {
        super(3);
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        yci yciVar = (yci) obj;
        ((Number) obj3).intValue();
        yciVar.getClass();
        oq5 oq5Var = (oq5) ((hq5) obj2);
        oq5Var.a0(358407899);
        Pair<Float, d85>[] pairArr = ((C1009d6) ((Vb) oq5Var.j(Wb.a)).d0.getValue()).e;
        yci u = xp3.u(yciVar, ugo.a(u7g.E(C0989c0.a, oq5Var)));
        oq5Var.a0(-819225549);
        boolean h = oq5Var.h(pairArr);
        Object K = oq5Var.K();
        if (h || K == gq5.a) {
            K = new W(pairArr);
            oq5Var.k0(K);
        }
        oq5Var.p(false);
        yci b = androidx.compose.ui.draw.a.b(u, (Function1) K);
        oq5Var.p(false);
        return b;
    }
}
