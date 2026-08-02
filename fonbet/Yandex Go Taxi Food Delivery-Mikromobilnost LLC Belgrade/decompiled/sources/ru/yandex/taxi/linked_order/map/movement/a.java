package ru.yandex.taxi.linked_order.map.movement;

import defpackage.oby0;
import defpackage.tpr;
import kotlinx.coroutines.flow.n;
import ru.yandex.taxi.net.tracker.e;

/* loaded from: classes5.dex */
public final class a extends e {
    public static final /* synthetic */ int U = 0;

    @Override // ru.yandex.taxi.net.tracker.e, defpackage.way0
    public final tpr N3(oby0 oby0Var) {
        return new n(super.N3(oby0Var), new LinkedOrderSmoothMovementTracker$startTracking$1(this, null));
    }
}
