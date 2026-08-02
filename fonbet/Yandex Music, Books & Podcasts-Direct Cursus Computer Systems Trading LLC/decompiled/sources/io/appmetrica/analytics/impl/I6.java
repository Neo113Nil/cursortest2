package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* loaded from: classes5.dex */
public final class I6 extends AbstractC0394k5 {
    public I6(@NonNull String str, double d) {
        super(2, str, Double.valueOf(d), new Pc(), new C0365j5(new C0287gd(new C0193d5(100))));
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0394k5
    public final void a(@NonNull C0561pr c0561pr) {
        C0618rr c0618rr = c0561pr.d;
        c0618rr.c = ((Double) this.f).doubleValue() + c0618rr.c;
    }
}
