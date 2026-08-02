package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.er, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0243er extends AbstractC0596r5 {
    public final C0772x7 b;

    public C0243er(@NonNull C0510o5 c0510o5, @NonNull C0772x7 c0772x7) {
        super(c0510o5);
        this.b = c0772x7;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0596r5
    public final boolean a(@NonNull H6 h6, @NonNull C0423l5 c0423l5) {
        C0250f5 c0250f5 = c0423l5.b.d.a;
        this.b.a(c0250f5.i);
        InterfaceC0402kd m = C0747wb.I.m();
        if (Boolean.TRUE.equals(c0250f5.b)) {
            m.a(true);
        } else {
            if (Boolean.FALSE.equals(c0250f5.b)) {
                m.a(false);
            }
        }
        m.a(c0250f5.c);
        Boolean bool = c0250f5.n;
        C0747wb.I.c().b(bool != null ? bool.booleanValue() : true);
        return false;
    }
}
