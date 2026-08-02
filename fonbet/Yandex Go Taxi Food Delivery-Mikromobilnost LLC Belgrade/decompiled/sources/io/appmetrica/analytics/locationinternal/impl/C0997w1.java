package io.appmetrica.analytics.locationinternal.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.w1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0997w1 {
    public final C0948g a;
    public final C0948g b;
    public final C0968m1 c;
    public final C0996w0 d;

    public C0997w1(Context context, C0948g c0948g, C0948g c0948g2) {
        this(c0948g, c0948g2, new C0942e0(context), new C0943e1(), new C0990u0());
    }

    public C0997w1(C0948g c0948g, C0948g c0948g2, C0942e0 c0942e0, C0943e1 c0943e1, C0990u0 c0990u0) {
        this(c0948g, c0948g2, new C0968m1(c0942e0, c0943e1), new C0996w0(c0942e0, c0990u0));
    }

    public C0997w1(C0948g c0948g, C0948g c0948g2, C0968m1 c0968m1, C0996w0 c0996w0) {
        this.a = c0948g;
        this.b = c0948g2;
        this.c = c0968m1;
        this.d = c0996w0;
    }
}
