package ru.yandex.taxi.map_common.map.process;

import defpackage.bvf0;
import defpackage.ike;
import defpackage.jse;
import defpackage.rby;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wnb0;

/* loaded from: classes9.dex */
public final class b {
    public final tt2 a;
    public final ike b = bvf0.M(bvf0.b(), new rby("Error in map computations processor scope", 0));
    public final jse c;

    public b(tt2 tt2Var) {
        this.a = tt2Var;
        tt2Var.getClass();
        this.c = uyj.a.P(1);
    }

    public final void a(MapComputationsProcessor$ExecuteOn mapComputationsProcessor$ExecuteOn, wnb0 wnb0Var) {
        a.a(mapComputationsProcessor$ExecuteOn, this.b, this.a, this.c, new MapComputationsProcessor$postTaskAtTheEnd$1(wnb0Var, null));
    }
}
