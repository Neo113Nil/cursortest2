package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.payment_button;

import defpackage.osq;
import defpackage.yuj0;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes5.dex */
public final class a {
    public final yuj0 a;
    public final m0 b;

    public a(ru.yandex.taxi.logistics.payment.a aVar, osq osqVar, yuj0 yuj0Var) {
        this.a = yuj0Var;
        this.b = new m0(aVar.a, osqVar.c, new PaymentButtonStateHolder$widgetModelFlow$1(this, null));
    }
}
