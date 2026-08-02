package ru.yandex.taxi.logistics.sdk.mission_details;

import defpackage.bvf0;
import defpackage.ds31;
import defpackage.gci0;
import defpackage.ij20;
import defpackage.sk7;
import defpackage.tje;
import defpackage.uj20;
import defpackage.wj20;
import defpackage.yr31;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes5.dex */
public final class b extends yr31 {
    public final r0 A;
    public final gci0 B;
    public final uj20 b;
    public final wj20 c;
    public final ij20 w;
    public final sk7 x;
    public final ru.yandex.taxi.logistics.sdk.mission_details.interactors.a y;
    public final ru.yandex.taxi.logistics.sdk.mission_details.ui.b z;

    public b(uj20 uj20Var, wj20 wj20Var, ij20 ij20Var, sk7 sk7Var, ru.yandex.taxi.logistics.sdk.mission_details.interactors.a aVar, ru.yandex.taxi.logistics.sdk.mission_details.ui.b bVar) {
        this.b = uj20Var;
        this.c = wj20Var;
        this.w = ij20Var;
        this.x = sk7Var;
        this.y = aVar;
        this.z = bVar;
        r0 c = bvf0.c(null);
        this.A = c;
        this.B = e.d(c);
        tje.N(ds31.a(this), null, null, new MissionDetailsViewModel$1(this, null), 3);
        tje.N(ds31.a(this), null, null, new MissionDetailsViewModel$2(this, null), 3);
    }
}
