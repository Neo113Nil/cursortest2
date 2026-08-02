package ru.yandex.taxi.delivery.interactors;

import defpackage.cpi;
import defpackage.g580;
import defpackage.jqr;
import defpackage.omi;
import defpackage.x8;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class e {
    public final g580 a;
    public final cpi b;
    public final omi c;

    public e(g580 g580Var, cpi cpiVar, omi omiVar) {
        this.a = g580Var;
        this.b = cpiVar;
        this.c = omiVar;
    }

    public final jqr a(ArrayList arrayList) {
        return new jqr(new d(new kotlinx.coroutines.flow.n(((x8) this.a).b, new DeliveryEffectsInteractorImpl$observeRequirementSelectionByRules$1(2, null)), arrayList, this), new DeliveryEffectsInteractorImpl$observeRequirementSelectionByRules$3(this, null), 3);
    }
}
