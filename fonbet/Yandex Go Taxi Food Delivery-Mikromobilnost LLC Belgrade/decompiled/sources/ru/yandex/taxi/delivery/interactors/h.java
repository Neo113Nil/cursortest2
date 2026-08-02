package ru.yandex.taxi.delivery.interactors;

import defpackage.g580;
import defpackage.o3i;
import defpackage.omi;
import defpackage.vsi;
import defpackage.wiq0;
import defpackage.x8;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes5.dex */
public final class h {
    public final g580 a;
    public final vsi b;
    public final omi c;
    public final o3i d;
    public final wiq0 e;

    public h(g580 g580Var, vsi vsiVar, omi omiVar, o3i o3iVar, wiq0 wiq0Var) {
        this.a = g580Var;
        this.b = vsiVar;
        this.c = omiVar;
        this.d = o3iVar;
        this.e = wiq0Var;
    }

    public final m0 a() {
        return new m0(new g(new kotlinx.coroutines.flow.n(((x8) this.a).b, new DeliveryFormTypeInteractor$formTypeByRequirementsFlow$1(2, null)), this.b.g.a, this), new m0(((com.yandex.go.taxi.tariffs.internal.repository.k) this.e).j.b(), this.d.b, new DeliveryFormTypeInteractor$formTypeByD2dFlow$1(3, null)), new DeliveryFormTypeInteractor$observeFormType$1(3, null));
    }
}
