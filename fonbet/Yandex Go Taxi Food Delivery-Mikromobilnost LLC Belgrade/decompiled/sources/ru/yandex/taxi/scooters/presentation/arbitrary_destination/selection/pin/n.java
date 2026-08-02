package ru.yandex.taxi.scooters.presentation.arbitrary_destination.selection.pin;

import defpackage.b1c0;
import defpackage.g92;
import defpackage.i1c0;
import defpackage.jqr;
import defpackage.p0c0;
import defpackage.r0c0;
import defpackage.s0c0;
import defpackage.tpr;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class n extends b1c0 {
    public final r0c0 a;
    public final s0c0 b;
    public final ScootersPinStateRepository c;

    public n(r0c0 r0c0Var, s0c0 s0c0Var, ScootersPinStateRepository scootersPinStateRepository) {
        this.a = r0c0Var;
        this.b = s0c0Var;
        this.c = scootersPinStateRepository;
    }

    @Override // defpackage.b1c0
    public final tpr a(tpr tprVar) {
        return kotlinx.coroutines.flow.e.K((tpr[]) Arrays.copyOf(new tpr[]{new i(new jqr(tprVar, new ScootersPinV2DataRepository$positionFlow$1(this, null), 3)), new k(new g(this.c.c))}, 2));
    }

    @Override // defpackage.b1c0
    public final tpr b(tpr tprVar) {
        return new m(this.c.b, this);
    }

    @Override // defpackage.b1c0
    public final tpr c() {
        p0c0 b = ((ru.yandex.taxi.styling.f) this.b).b(false);
        r0c0 r0c0Var = this.a;
        i1c0 f = r0c0Var.f(b);
        if (f == null) {
            f = r0c0Var.c();
        }
        return new g92(2, f);
    }

    @Override // defpackage.b1c0
    public final tpr d() {
        return this.c.d;
    }
}
