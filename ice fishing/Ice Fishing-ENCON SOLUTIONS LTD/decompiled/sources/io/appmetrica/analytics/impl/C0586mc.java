package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.mc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0586mc extends AbstractC0392f {
    public C0586mc(Context context, Bg bg) {
        super(context, bg);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0392f
    public final void b(P5 p5, C0656p4 c0656p4) {
        boolean booleanValue = ((Boolean) WrapUtils.getOrDefault(c0656p4.f6721b.f6645b, Boolean.FALSE)).booleanValue();
        Kb m2 = C0610na.f6575I.m();
        m2.a(booleanValue);
        m2.a(c0656p4.f6721b.f6646c);
        Boolean bool = c0656p4.f6721b.f6657n;
        if (bool != null) {
            C0610na.f6575I.c().b(bool.booleanValue());
        }
        this.f5957b.a(p5, c0656p4);
    }
}
