package ru.yandex.taxi.logistics.sdk.deliverydashboard.ui;

import defpackage.flg;
import defpackage.g2q0;
import defpackage.ha2;
import defpackage.hwy0;
import defpackage.lw;
import defpackage.mth;
import defpackage.q4i;
import defpackage.qkg;
import defpackage.tls0;
import defpackage.vng;
import defpackage.wth;
import defpackage.zch;
import java.util.Collections;
import kotlinx.coroutines.flow.e;

/* loaded from: classes5.dex */
public final class c {
    public final ru.yandex.taxi.logistics.sdk.deliverydashboard.ui.mapper.a a;
    public final q4i b;
    public final ru.yandex.taxi.logistics.sdk.deliverydashboard.interactors.a c;
    public final lw d;
    public final qkg e = new qkg(Collections.singletonList(new g2q0(Collections.singletonList(new tls0(0)), null, null, null, false, null, null, null, null, 1022)), null, null, null, 30);
    public final ha2 f;

    public c(ru.yandex.taxi.logistics.sdk.deliverydashboard.ui.mapper.a aVar, hwy0 hwy0Var, flg flgVar, q4i q4iVar, zch zchVar, ru.yandex.taxi.logistics.sdk.deliverydashboard.interactors.a aVar2, lw lwVar) {
        this.a = aVar;
        this.b = q4iVar;
        this.c = aVar2;
        this.d = lwVar;
        this.f = e.m(q4iVar.c, hwy0Var.b, vng.l(new mth((ru.yandex.taxi.delivery.d) zchVar.a, 6), new wth(16), vng.c), flgVar.a, new DeliveryDashboardStateProvider$dashboardStateFlow$2(this, null));
    }
}
