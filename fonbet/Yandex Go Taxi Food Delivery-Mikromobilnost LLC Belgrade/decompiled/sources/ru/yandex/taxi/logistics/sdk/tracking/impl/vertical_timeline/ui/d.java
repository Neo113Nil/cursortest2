package ru.yandex.taxi.logistics.sdk.tracking.impl.vertical_timeline.ui;

import defpackage.cdz0;
import defpackage.cjw0;
import defpackage.ds31;
import defpackage.gci0;
import defpackage.hwy0;
import defpackage.j00;
import defpackage.jj31;
import defpackage.kcz0;
import defpackage.lj31;
import defpackage.wsr0;
import defpackage.xsr0;
import defpackage.yr31;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e;

/* loaded from: classes5.dex */
public final class d extends yr31 {
    public final jj31 b;
    public final lj31 c;
    public final kcz0 w;
    public final j00 x;
    public final cjw0 y;
    public final gci0 z;

    public d(jj31 jj31Var, lj31 lj31Var, kcz0 kcz0Var, j00 j00Var, cjw0 cjw0Var, e eVar, hwy0 hwy0Var) {
        this.b = jj31Var;
        this.c = lj31Var;
        this.w = kcz0Var;
        this.x = j00Var;
        this.y = cjw0Var;
        this.z = kotlinx.coroutines.flow.e.R(new m0(hwy0Var.b, new cdz0(eVar.e, 9), new VerticalTimelineViewModel$timelineStateFlow$1(this, null)), ds31.a(this), wsr0.a(xsr0.a, 3), jj31Var.a);
    }
}
