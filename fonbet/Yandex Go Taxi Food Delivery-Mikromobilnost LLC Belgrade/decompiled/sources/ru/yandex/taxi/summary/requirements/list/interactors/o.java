package ru.yandex.taxi.summary.requirements.list.interactors;

import defpackage.d9w;
import defpackage.e9w;
import defpackage.vfx0;
import defpackage.wiq0;

/* loaded from: classes6.dex */
public final class o {
    public final d9w a;
    public final wiq0 b;
    public final vfx0 c;

    public o(d9w d9wVar, wiq0 wiq0Var, vfx0 vfx0Var) {
        this.a = d9wVar;
        this.b = wiq0Var;
        this.c = vfx0Var;
    }

    public final kotlinx.coroutines.flow.m0 a() {
        return new kotlinx.coroutines.flow.m0(((e9w) this.a).d, new n(kotlinx.coroutines.flow.e.t(new l(((com.yandex.go.taxi.tariffs.internal.repository.k) this.b).j.b())), this), new IntercityRequirementsContactInteractor$contactStateFlow$1(this, null));
    }
}
