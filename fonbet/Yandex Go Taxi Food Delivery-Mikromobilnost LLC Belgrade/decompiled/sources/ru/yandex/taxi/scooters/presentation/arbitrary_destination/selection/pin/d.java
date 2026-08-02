package ru.yandex.taxi.scooters.presentation.arbitrary_destination.selection.pin;

import defpackage.g92;
import defpackage.jqr;
import defpackage.p0c0;
import defpackage.r0c0;
import defpackage.s0c0;
import defpackage.tpr;
import defpackage.y0c0;
import defpackage.z0c0;

/* loaded from: classes6.dex */
public final class d extends y0c0 {
    public final r0c0 a;
    public final s0c0 b;
    public final ScootersPinStateRepository c;

    public d(r0c0 r0c0Var, s0c0 s0c0Var, ScootersPinStateRepository scootersPinStateRepository) {
        this.a = r0c0Var;
        this.b = s0c0Var;
        this.c = scootersPinStateRepository;
    }

    @Override // defpackage.y0c0
    public final tpr a() {
        return this.c.c;
    }

    @Override // defpackage.y0c0
    public final tpr b() {
        return new g92(2, null);
    }

    @Override // defpackage.y0c0
    public final tpr c() {
        return new g92(2, "");
    }

    @Override // defpackage.y0c0
    public final tpr d(tpr tprVar) {
        return kotlinx.coroutines.flow.e.X(new jqr(tprVar, new ScootersPinV1DataRepository$stateFlow$1(null, this), 3), new ScootersPinV1DataRepository$stateFlow$$inlined$flatMapLatest$1(null, this));
    }

    @Override // defpackage.y0c0
    public final tpr e() {
        p0c0 b = ((ru.yandex.taxi.styling.f) this.b).b(false);
        r0c0 r0c0Var = this.a;
        r0c0Var.getClass();
        z0c0 e = r0c0.e(false, b);
        if (e == null) {
            e = r0c0Var.a();
        }
        return new g92(2, e);
    }

    @Override // defpackage.y0c0
    public final tpr f() {
        return this.c.d;
    }
}
