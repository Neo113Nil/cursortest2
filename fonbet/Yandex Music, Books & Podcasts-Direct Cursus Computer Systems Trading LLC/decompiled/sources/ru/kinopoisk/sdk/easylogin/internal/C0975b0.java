package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.gq5;
import defpackage.hq5;
import defpackage.oq5;
import defpackage.pyc;
import defpackage.u7g;
import defpackage.ugo;
import defpackage.uif;
import defpackage.xp3;
import defpackage.yci;
import kotlin.jvm.functions.Function1;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.b0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0975b0 extends uif implements pyc {
    public static final C0975b0 a = new C0975b0();

    public C0975b0() {
        super(3);
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        yci yciVar = (yci) obj;
        ((Number) obj3).intValue();
        yciVar.getClass();
        oq5 oq5Var = (oq5) ((hq5) obj2);
        oq5Var.a0(-339300405);
        Vb vb = (Vb) oq5Var.j(Wb.a);
        vb.getClass();
        Xb xb = new Xb(vb);
        yci u = xp3.u(yciVar, ugo.a(u7g.E(C0989c0.a, oq5Var)));
        oq5Var.a0(-838127857);
        boolean f = oq5Var.f(xb);
        Object K = oq5Var.K();
        if (f || K == gq5.a) {
            K = new C0961a0(xb);
            oq5Var.k0(K);
        }
        oq5Var.p(false);
        yci b = androidx.compose.ui.draw.a.b(u, (Function1) K);
        oq5Var.p(false);
        return b;
    }
}
