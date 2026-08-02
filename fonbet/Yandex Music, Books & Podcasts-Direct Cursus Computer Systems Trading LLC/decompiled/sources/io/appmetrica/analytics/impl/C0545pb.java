package io.appmetrica.analytics.impl;

import android.os.Bundle;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.pb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0545pb extends AbstractC0596r5 {
    public C0545pb(@NotNull C0510o5 c0510o5) {
        super(c0510o5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0596r5
    public final boolean a(@NotNull H6 h6, @NotNull C0423l5 c0423l5) {
        Bundle bundle = h6.m;
        C0401kc c0401kc = bundle != null ? (C0401kc) bundle.getParcelable("io.appmetrica.analytics.impl.IdentifiersData") : null;
        if (c0401kc != null) {
            if (c0401kc.d) {
                C0250f5 c0250f5 = c0423l5.b.d.a;
                Boolean bool = c0250f5.n;
                Boolean bool2 = c0250f5.i;
                C0747wb.I.c().c(bool != null ? bool.booleanValue() : true);
                C0747wb.I.h().b(bool2);
            }
        }
        this.a.a(c0401kc);
        return false;
    }
}
