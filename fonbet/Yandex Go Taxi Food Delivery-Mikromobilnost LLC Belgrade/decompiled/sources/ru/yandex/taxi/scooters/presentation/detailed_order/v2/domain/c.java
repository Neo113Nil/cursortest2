package ru.yandex.taxi.scooters.presentation.detailed_order.v2.domain;

import defpackage.euo0;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.scooters.data.u;

/* loaded from: classes6.dex */
public final class c {
    public final u a;
    public final euo0 b;

    public c(u uVar, euo0 euo0Var) {
        this.a = uVar;
        this.b = euo0Var;
    }

    public final m0 a() {
        return new m0(this.a.a(), this.b.a, new ScootersOrderNavigationStateInteractor$listenToNavigationState$1(3, null));
    }
}
