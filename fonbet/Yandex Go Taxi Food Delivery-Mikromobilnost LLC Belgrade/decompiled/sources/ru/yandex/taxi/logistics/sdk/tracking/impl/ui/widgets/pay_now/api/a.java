package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.pay_now.api;

import defpackage.acu;
import defpackage.at20;
import defpackage.bvf0;
import defpackage.fzw;
import defpackage.ha2;
import defpackage.hwy0;
import defpackage.mea0;
import defpackage.phi;
import defpackage.qt90;
import defpackage.st2;
import defpackage.tje;
import defpackage.yj70;
import defpackage.z9h;
import kotlinx.coroutines.flow.e;

/* loaded from: classes5.dex */
public final class a {
    public final String a;
    public final at20 b;
    public final ru.yandex.taxi.logistics.sdk.pay_on_delivery.a c;
    public final z9h d;
    public final st2 e;
    public volatile mea0 f;
    public final ha2 g;

    public a(String str, yj70 yj70Var, phi phiVar, ru.yandex.taxi.logistics.payment.a aVar, hwy0 hwy0Var, at20 at20Var, ru.yandex.taxi.logistics.sdk.pay_on_delivery.a aVar2, z9h z9hVar, st2 st2Var) {
        this.a = str;
        this.b = at20Var;
        this.c = aVar2;
        this.d = z9hVar;
        this.e = st2Var;
        qt90 qt90Var = (qt90) yj70Var.a;
        this.g = e.m(new fzw(16, new acu(qt90Var.b.e, 8), qt90Var), aVar.a, phiVar.b, hwy0Var.b, new PayNowStateHolder$uiModelFlow$1(this, null));
    }

    public final void a() {
        tje.N(bvf0.a(this.e.b), null, null, new PayNowStateHolder$payNow$1(this, null), 3);
    }
}
