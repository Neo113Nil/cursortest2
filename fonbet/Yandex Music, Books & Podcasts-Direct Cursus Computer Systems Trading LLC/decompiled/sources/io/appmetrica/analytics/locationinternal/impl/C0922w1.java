package io.appmetrica.analytics.locationinternal.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.w1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0922w1 {
    public final C0872g a;
    public final C0872g b;
    public final C0893m1 c;
    public final C0921w0 d;

    public C0922w1(Context context, C0872g c0872g, C0872g c0872g2) {
        this(c0872g, c0872g2, new C0865e0(context), new C0866e1(), new C0915u0());
    }

    public C0922w1(C0872g c0872g, C0872g c0872g2, C0865e0 c0865e0, C0866e1 c0866e1, C0915u0 c0915u0) {
        this(c0872g, c0872g2, new C0893m1(c0865e0, c0866e1), new C0921w0(c0865e0, c0915u0));
    }

    public C0922w1(C0872g c0872g, C0872g c0872g2, C0893m1 c0893m1, C0921w0 c0921w0) {
        this.a = c0872g;
        this.b = c0872g2;
        this.c = c0893m1;
        this.d = c0921w0;
    }
}
