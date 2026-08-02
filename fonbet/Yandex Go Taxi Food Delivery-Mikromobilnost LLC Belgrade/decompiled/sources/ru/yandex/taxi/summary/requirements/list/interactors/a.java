package ru.yandex.taxi.summary.requirements.list.interactors;

import defpackage.amc;
import defpackage.dj3;
import defpackage.ga0;
import defpackage.roj0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vfx0;
import defpackage.yiy0;

/* loaded from: classes6.dex */
public final class a {
    public final roj0 a;
    public final dj3 b;
    public final ga0 c;
    public final tt2 d;
    public final amc e;
    public final vfx0 f;

    public a(roj0 roj0Var, dj3 dj3Var, ga0 ga0Var, tt2 tt2Var, amc amcVar, yiy0 yiy0Var, vfx0 vfx0Var) {
        this.a = roj0Var;
        this.b = dj3Var;
        this.c = ga0Var;
        this.d = tt2Var;
        this.e = amcVar;
        this.f = vfx0Var;
    }

    public final tpr a() {
        tpr t = kotlinx.coroutines.flow.e.t(this.a.e());
        amc amcVar = this.e;
        com.yandex.go.requirements.comment.repositories.b bVar = new com.yandex.go.requirements.comment.repositories.b(amcVar.c);
        String g = amcVar.g();
        if (g == null) {
            g = "";
        }
        kotlinx.coroutines.flow.m0 m0Var = new kotlinx.coroutines.flow.m0(t, kotlinx.coroutines.flow.e.t(com.yandex.go.coroutines.b.d(bVar, new CommentStateInteractor$commentStateFlow$$inlined$start$1(g, null))), new CommentStateInteractor$commentStateFlow$1(this, null));
        this.d.getClass();
        return kotlinx.coroutines.flow.e.F(m0Var, uyj.a);
    }
}
