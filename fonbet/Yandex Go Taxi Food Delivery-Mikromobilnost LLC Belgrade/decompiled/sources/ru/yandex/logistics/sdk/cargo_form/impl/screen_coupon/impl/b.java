package ru.yandex.logistics.sdk.cargo_form.impl.screen_coupon.impl;

import android.content.Context;
import defpackage.dxf0;
import defpackage.foc;
import defpackage.jl40;
import defpackage.kme0;
import defpackage.m1f;
import defpackage.n1f;
import defpackage.rle0;
import defpackage.tpg;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class b {
    public static final m1f d = new m1f();
    public static final rle0 e = jl40.I("delivery-coupon", new dxf0(new foc(29)), null, null, 12);
    public final Context a;
    public final n1f b = new n1f(0, a().getData(), this);
    public final kme0 c = new kme0("coupon");

    public b(Context context) {
        this.a = context;
    }

    public final tpg a() {
        d.getClass();
        return (tpg) e.getValue(this.a, m1f.a[0]);
    }

    public final Object b(String str, Continuation continuation) {
        Object a = androidx.datastore.preferences.core.b.a(a(), new CouponDataStore$set$2(this, str, null), continuation);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11.a;
    }
}
