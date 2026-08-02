package ru.yandex.taxi.preorder.map.interactor;

import com.yandex.go.summary.branding_pin.i;
import defpackage.e6l0;
import defpackage.fji;
import defpackage.nj6;
import defpackage.p0c0;
import defpackage.q5z;
import defpackage.wiq0;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.delivery.pin.k;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes6.dex */
public final class c {
    public final wiq0 a;
    public final ru.yandex.taxi.address.interactor.a b;
    public final e c;
    public final nj6 d;
    public final k e;

    public c(nj6 nj6Var, wiq0 wiq0Var, ru.yandex.taxi.address.interactor.a aVar, k kVar, e eVar) {
        this.a = wiq0Var;
        this.b = aVar;
        this.c = eVar;
        this.d = nj6Var;
        this.e = kVar;
    }

    public static final e6l0 a(c cVar, e6l0 e6l0Var, fji fjiVar) {
        cVar.getClass();
        Integer num = fjiVar != null ? fjiVar.g : null;
        Integer num2 = fjiVar != null ? fjiVar.f : null;
        return (num == null || num2 == null) ? e6l0Var : new e6l0(new p0c0(q5z.s(num.intValue()), "", "", q5z.s(num2.intValue())), e6l0Var.b);
    }

    public final g b(r0 r0Var) {
        return kotlinx.coroutines.flow.e.I(new m0(r0Var, this.e.a(), new RouteOverlayAppearanceInteractor$destinationAppearanceFlow$1(3, null)), new RouteOverlayAppearanceInteractor$destinationAppearanceFlow$2(this, null));
    }

    public final g c(r0 r0Var) {
        return kotlinx.coroutines.flow.e.I(kotlinx.coroutines.flow.e.m(r0Var, kotlinx.coroutines.flow.e.t(((com.yandex.go.taxi.tariffs.internal.repository.k) this.a).j.b()), ((i) this.d).c(), this.e.a(), new RouteOverlayAppearanceInteractor$sourceAppearanceFlow$1(5, null)), new RouteOverlayAppearanceInteractor$sourceAppearanceFlow$2(this, null));
    }
}
