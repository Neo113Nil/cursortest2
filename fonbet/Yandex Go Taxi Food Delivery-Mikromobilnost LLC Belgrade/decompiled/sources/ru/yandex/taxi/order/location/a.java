package ru.yandex.taxi.order.location;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.r;
import com.yandex.go.coroutines.b;
import defpackage.l1t;
import defpackage.mth;
import defpackage.no21;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.interactors.c;
import ru.yandex.taxi.order.d;

/* loaded from: classes6.dex */
public final class a {
    public final Lifecycle a;
    public final l1t b;
    public final d c;
    public final no21 d;

    public a(Lifecycle lifecycle, l1t l1tVar, d dVar, no21 no21Var) {
        this.a = lifecycle;
        this.b = l1tVar;
        this.c = dVar;
        this.d = no21Var;
    }

    public final void a() {
        mth mthVar = new mth(this.c.k, 6);
        no21 no21Var = this.d;
        b.h(r.a(this.a), new m0(mthVar, new c(no21Var.a.c(), no21Var), new UserPlaceAppearanceController$init$1(this, null)));
    }
}
