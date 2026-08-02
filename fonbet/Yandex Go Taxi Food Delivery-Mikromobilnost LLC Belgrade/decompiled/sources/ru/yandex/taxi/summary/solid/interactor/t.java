package ru.yandex.taxi.summary.solid.interactor;

import defpackage.c6l0;
import defpackage.ha2;
import defpackage.mkv0;
import defpackage.npv0;
import defpackage.yj0;

/* loaded from: classes6.dex */
public final class t {
    public final c6l0 a;
    public final mkv0 b;
    public final npv0 c;
    public final yj0 d;

    public t(c6l0 c6l0Var, mkv0 mkv0Var, npv0 npv0Var, yj0 yj0Var) {
        this.a = c6l0Var;
        this.b = mkv0Var;
        this.c = npv0Var;
        this.d = yj0Var;
    }

    public final ha2 a() {
        return kotlinx.coroutines.flow.e.m(this.a.a, this.d.a, com.yandex.go.coroutines.b.d(kotlinx.coroutines.flow.e.p(this.b.b, 50L), new SummaryMarginsStateInteractor$summaryPlusOffsetFlow$$inlined$start$1(0, null)), this.c.b, new SummaryMarginsStateInteractor$marginsStateFlow$1(5, null));
    }
}
