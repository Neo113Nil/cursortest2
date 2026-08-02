package ru.yandex.taxi.badge;

import com.yandex.go.yb.qr.domain.c;
import defpackage.f1d0;
import defpackage.f2t;
import defpackage.hay0;
import defpackage.jm4;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.yc00;
import defpackage.ynj;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.persuggest.source.j;

/* loaded from: classes9.dex */
public final class a {
    public final tt2 a;
    public final jm4 b;
    public final c c;
    public final f1d0 d;
    public final ynj e;
    public final hay0 f;
    public final com.yandex.go.payments_widgets.mini.widgets.data.a g;
    public final yc00 h;

    public a(tt2 tt2Var, jm4 jm4Var, c cVar, f1d0 f1d0Var, ynj ynjVar, hay0 hay0Var, com.yandex.go.payments_widgets.mini.widgets.data.a aVar, yc00 yc00Var) {
        this.a = tt2Var;
        this.b = jm4Var;
        this.c = cVar;
        this.d = f1d0Var;
        this.e = ynjVar;
        this.f = hay0Var;
        this.g = aVar;
        this.h = yc00Var;
    }

    public final tpr a() {
        tpr t = e.t(e.X(new m0(e.t(new j(((f2t) this.f.a).h)), this.h.b, new BadgeAvailabilityInteractorImpl$currentBadgeTypeFlow$1(3, null)), new BadgeAvailabilityInteractorImpl$currentBadgeTypeFlow$$inlined$flatMapLatest$1(null, this)));
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return e.F(t, mdh.b);
    }
}
