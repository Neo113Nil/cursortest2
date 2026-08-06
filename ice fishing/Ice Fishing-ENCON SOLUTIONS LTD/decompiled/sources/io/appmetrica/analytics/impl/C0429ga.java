package io.appmetrica.analytics.impl;

import android.os.Bundle;

/* renamed from: io.appmetrica.analytics.impl.ga, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0429ga extends A4 {
    public C0429ga(C0863x4 c0863x4) {
        super(c0863x4);
    }

    @Override // io.appmetrica.analytics.impl.A4
    public final boolean a(P5 p5, C0785u4 c0785u4) {
        Bundle bundle = p5.f4916m;
        Xa xa = bundle != null ? (Xa) bundle.getParcelable("io.appmetrica.analytics.impl.IdentifiersData") : null;
        if (xa != null) {
            if (xa.f5389d) {
                C0630o4 c0630o4 = c0785u4.f6967b.f7176d.f7280a;
                Boolean bool = c0630o4.f6657n;
                Boolean bool2 = c0630o4.f6652i;
                C0610na.f6575I.c().c(bool != null ? bool.booleanValue() : true);
                C0610na.f6575I.h().b(bool2);
            }
        }
        this.f4122a.a(xa);
        return false;
    }
}
