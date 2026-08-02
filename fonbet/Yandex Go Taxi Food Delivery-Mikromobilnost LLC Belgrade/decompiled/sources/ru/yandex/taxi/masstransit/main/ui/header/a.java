package ru.yandex.taxi.masstransit.main.ui.header;

import defpackage.dz00;
import defpackage.ha2;
import defpackage.mdh;
import defpackage.pwy0;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.tu30;
import defpackage.uyj;
import defpackage.zuj0;
import ru.yandex.taxi.experiments.d;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes6.dex */
public final class a {
    public final dz00 a;
    public final tt2 b;
    public final zuj0 c;
    public final e d;
    public final tu30 e;
    public final pwy0 f;

    public a(dz00 dz00Var, tt2 tt2Var, zuj0 zuj0Var, e eVar, tu30 tu30Var, pwy0 pwy0Var) {
        this.a = dz00Var;
        this.b = tt2Var;
        this.c = zuj0Var;
        this.d = eVar;
        this.e = tu30Var;
        this.f = pwy0Var;
    }

    public final tpr a() {
        ha2 n = kotlinx.coroutines.flow.e.n(d.b(this.a.a), kotlinx.coroutines.flow.e.d(this.e.b), this.f.a(), new MtMainHeaderInteractor$stateFlow$1(this, null));
        this.b.getClass();
        sjh sjhVar = uyj.a;
        return kotlinx.coroutines.flow.e.F(n, mdh.b);
    }
}
