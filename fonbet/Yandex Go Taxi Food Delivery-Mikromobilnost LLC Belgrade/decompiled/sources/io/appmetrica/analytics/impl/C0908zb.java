package io.appmetrica.analytics.impl;

import android.os.Bundle;

/* renamed from: io.appmetrica.analytics.impl.zb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0908zb extends AbstractC0757u5 {
    public C0908zb(C0670r5 c0670r5) {
        super(c0670r5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0757u5
    public final boolean a(K6 k6, C0613p5 c0613p5) {
        Bundle bundle = k6.m;
        C0822wc c0822wc = bundle != null ? (C0822wc) bundle.getParcelable("io.appmetrica.analytics.impl.IdentifiersData") : null;
        if (c0822wc != null) {
            if (c0822wc.d) {
                C0439j5 c0439j5 = c0613p5.b.d.a;
                Boolean bool = c0439j5.n;
                Boolean bool2 = c0439j5.i;
                Jb.I.c().c(bool != null ? bool.booleanValue() : true);
                Jb.I.h().b(bool2);
            }
        }
        this.a.a(c0822wc);
        return false;
    }
}
