package ru.yandex.taxi.logistics.sdk.show_modalview_action.ui;

import defpackage.bvf0;
import defpackage.ds31;
import defpackage.gci0;
import defpackage.hwy0;
import defpackage.i030;
import defpackage.lhg;
import defpackage.tje;
import defpackage.yr31;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes5.dex */
public final class c extends yr31 {
    public final gci0 A;
    public final i030 b;
    public final ru.yandex.taxi.logistics.sdk.show_modalview_action.a c;
    public final ru.yandex.taxi.logistics.sdk.show_modalview_action.ui.state.a w;
    public final lhg x;
    public final hwy0 y;
    public final r0 z;

    public c(i030 i030Var, ru.yandex.taxi.logistics.sdk.show_modalview_action.a aVar, ru.yandex.taxi.logistics.sdk.show_modalview_action.ui.state.a aVar2, lhg lhgVar, hwy0 hwy0Var) {
        this.b = i030Var;
        this.c = aVar;
        this.w = aVar2;
        this.x = lhgVar;
        this.y = hwy0Var;
        r0 c = bvf0.c(null);
        this.z = c;
        this.A = e.d(c);
        tje.N(ds31.a(this), null, null, new ShowModalViewActionViewModel$1(this, null), 3);
    }
}
