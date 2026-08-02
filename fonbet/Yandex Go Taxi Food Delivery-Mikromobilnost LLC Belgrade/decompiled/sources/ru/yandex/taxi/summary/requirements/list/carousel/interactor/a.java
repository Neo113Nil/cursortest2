package ru.yandex.taxi.summary.requirements.list.carousel.interactor;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.ha2;
import defpackage.mth;
import defpackage.oxu0;
import defpackage.sk7;
import defpackage.tpr;
import defpackage.unj0;
import defpackage.wiq0;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.n;
import ru.yandex.taxi.requirements.interactor.x;

/* loaded from: classes6.dex */
public final class a {
    public final sk7 a;
    public final wiq0 b;
    public final x c;
    public final unj0 d;
    public final oxu0 e;

    public a(sk7 sk7Var, wiq0 wiq0Var, x xVar, unj0 unj0Var, oxu0 oxu0Var) {
        this.a = sk7Var;
        this.b = wiq0Var;
        this.c = xVar;
        this.d = unj0Var;
        this.e = oxu0Var;
    }

    public final ha2 a(tpr tprVar) {
        tpr d = ((ru.yandex.taxi.styling.g) this.e).d();
        n b = this.c.b();
        mth b2 = ((k) this.b).j.b();
        unj0 unj0Var = this.d;
        unj0Var.getClass();
        return kotlinx.coroutines.flow.e.m(tprVar, d, b, new m0(b2, new ru.yandex.taxi.summary.requirements.list.experiment.b(ru.yandex.taxi.experiments.d.a(unj0Var), unj0Var), new GroupRequirementsCarouselItemInteractor$requirementsOverridesFlow$1(3, null)), new GroupRequirementsCarouselItemInteractor$groupRequirementsCarouselItemsFlow$1(this, null));
    }
}
