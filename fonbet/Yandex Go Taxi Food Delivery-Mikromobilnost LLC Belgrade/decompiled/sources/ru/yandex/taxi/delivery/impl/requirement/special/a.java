package ru.yandex.taxi.delivery.impl.requirement.special;

import android.view.ViewGroup;
import com.yandex.go.delivery.rental_duration_selector.requirement.b;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.czo0;
import defpackage.h3y;
import defpackage.hbp0;
import defpackage.k3i;
import defpackage.tpr;
import defpackage.yli;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes5.dex */
public final class a {
    public final yli a;
    public final h3y b;
    public final k3i c;
    public final h3y d;
    public final hbp0 e = new hbp0(new czo0(14), "", null);
    public ViewGroup f;

    public a(yli yliVar, h3y h3yVar, k3i k3iVar, h3y h3yVar2) {
        this.a = yliVar;
        this.b = h3yVar;
        this.c = k3iVar;
        this.d = h3yVar2;
    }

    public final void a(ViewGroup viewGroup) {
        this.f = viewGroup;
        hbp0 hbp0Var = this.e;
        hbp0Var.a();
        yli yliVar = this.a;
        tpr t = e.t(new b(((k) yliVar.c).j.b(), yliVar));
        k3i k3iVar = this.c;
        e.H(hbp0Var.c(), new m0(t, e.t(new ru.yandex.taxi.delivery.impl.requirement.door_to_door.b(((k) k3iVar.a).j.b(), k3iVar)), new DeliverySpecialRequirementsViewBinderImpl$attach$1(this, viewGroup, null)));
    }
}
