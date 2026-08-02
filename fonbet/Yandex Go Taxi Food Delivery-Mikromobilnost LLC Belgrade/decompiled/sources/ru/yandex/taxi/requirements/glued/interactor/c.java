package ru.yandex.taxi.requirements.glued.interactor;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.gvd;
import defpackage.vfx0;
import defpackage.wiq0;
import defpackage.yfx0;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.requirements.interactor.x;

/* loaded from: classes6.dex */
public final class c {
    public final wiq0 a;
    public final x b;
    public final gvd c;
    public final yfx0 d;
    public final vfx0 e;

    public c(wiq0 wiq0Var, x xVar, gvd gvdVar, yfx0 yfx0Var, vfx0 vfx0Var) {
        this.a = wiq0Var;
        this.b = xVar;
        this.c = gvdVar;
        this.d = yfx0Var;
        this.e = vfx0Var;
    }

    public final m0 a() {
        return new m0(new b(e.t(((k) this.a).j.b()), this), this.b.b(), new GluedRequirementsInteractor$gluedRequirementsFlow$1(this, null));
    }
}
