package ru.yandex.logistics.sdk.cargo_form.impl.screen_coupon.impl.ui;

import defpackage.bvf0;
import defpackage.ds31;
import defpackage.ffx;
import defpackage.gyc;
import defpackage.gzv;
import defpackage.qzh0;
import defpackage.r1f;
import defpackage.tje;
import defpackage.u1f;
import defpackage.v1f;
import defpackage.w1f;
import defpackage.yr31;
import defpackage.yuj0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes5.dex */
public final class b extends yr31 {
    public final r1f b;
    public final ru.yandex.logistics.sdk.cargo_form.impl.screen_coupon.impl.b c;
    public final r0 w;
    public final n0 x;

    public b(r1f r1fVar, gyc gycVar, ru.yandex.logistics.sdk.cargo_form.impl.screen_coupon.impl.b bVar) {
        this.b = r1fVar;
        this.c = bVar;
        yuj0 yuj0Var = (yuj0) gycVar.a;
        this.w = bvf0.c(new w1f(yuj0Var.a(qzh0.cargoform_coupon_promocode, new Object[0]), new v1f(yuj0Var.a(qzh0.cargoform_coupon_promocode_activate_hint, new Object[0]), new gzv("", 0)), new u1f(yuj0Var.a(qzh0.cargoform_coupon_activate_promocode, new Object[0]), false)));
        this.x = ffx.b(1, 1, BufferOverflow.DROP_OLDEST);
        tje.N(ds31.a(this), null, null, new CouponViewModel$focusInputField$1(this, null), 3);
    }
}
