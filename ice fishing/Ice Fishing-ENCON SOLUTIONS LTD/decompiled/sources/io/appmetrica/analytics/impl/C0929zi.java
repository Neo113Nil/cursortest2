package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.ResultReceiver;

/* renamed from: io.appmetrica.analytics.impl.zi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0929zi extends A4 {
    public C0929zi(C0863x4 c0863x4) {
        super(c0863x4);
    }

    @Override // io.appmetrica.analytics.impl.A4
    public final boolean a(P5 p5, C0785u4 c0785u4) {
        Bundle bundle = p5.f4916m;
        this.f4122a.f7183k.a(new C0837w4(bundle != null ? (ResultReceiver) bundle.getParcelable("io.appmetrica.analytics.impl.referrer.common.ReferrerResultReceiver") : null));
        return false;
    }
}
