package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.timeline;

import defpackage.b801;
import defpackage.cdz0;
import defpackage.cjw0;
import defpackage.hwy0;
import defpackage.j00;
import defpackage.kcz0;
import defpackage.mj31;
import defpackage.tpr;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e;

/* loaded from: classes5.dex */
public final class b implements b801 {
    public final cjw0 a;
    public final mj31 b;
    public final kcz0 c;
    public final j00 d;
    public final m0 e;
    public final String f = "timeline-key";

    public b(e eVar, hwy0 hwy0Var, cjw0 cjw0Var, mj31 mj31Var, kcz0 kcz0Var, j00 j00Var) {
        this.a = cjw0Var;
        this.b = mj31Var;
        this.c = kcz0Var;
        this.d = j00Var;
        this.e = new m0(hwy0Var.b, new cdz0(eVar.e, 0), new TimelineStateHolder$widgetModelFlow$1(this, null));
    }

    @Override // defpackage.b801
    public final tpr a() {
        return this.e;
    }

    @Override // defpackage.b801
    public final String getKey() {
        return this.f;
    }
}
