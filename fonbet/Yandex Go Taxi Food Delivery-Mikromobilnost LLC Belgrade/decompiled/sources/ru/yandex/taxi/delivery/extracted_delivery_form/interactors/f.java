package ru.yandex.taxi.delivery.extracted_delivery_form.interactors;

import defpackage.ffx;
import defpackage.ivi;
import defpackage.jvi;
import defpackage.nji0;
import defpackage.swh;
import defpackage.vsi;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.delivery.extracted_delivery_form.ui.unitedsummary.states.DeliveryShowNotificationState;
import ru.yandex.taxi.delivery.extracted_form_common_data.extra.DeliveryBubblePosition;

/* loaded from: classes5.dex */
public final class f {
    public final jvi a;
    public final ru.yandex.taxi.delivery.interactors.e b;
    public final nji0 c;
    public final swh e;
    public final n0 d = ffx.c(0, 0, null, 7);
    public boolean f = true;

    public f(vsi vsiVar, jvi jviVar, ru.yandex.taxi.delivery.interactors.e eVar, nji0 nji0Var) {
        this.a = jviVar;
        this.b = eVar;
        this.c = nji0Var;
        this.e = vsiVar.f;
    }

    public final void a(int i, boolean z) {
        this.f = false;
        this.d.g(new DeliveryShowNotificationState(DeliveryShowNotificationState.ShowState.SHOWN, null, i, this.c.a(i).a(), ((ivi) this.a.a.getValue()).b, DeliveryBubblePosition.CENTER, z, 2));
    }

    public final c b() {
        return new c(kotlinx.coroutines.flow.e.K(this.d, new m0(new e(kotlinx.coroutines.flow.e.d(this.a.a)), this.b.a(this.e.a), new DeliveryNotificationInteractor$observeNotificationState$2(this, null))));
    }
}
