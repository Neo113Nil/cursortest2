package com.google.android.gms.internal.ads;

import android.os.Trace;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LP f28462a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28463b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Z f28464c;

    public X(Z z3, LP lp, int i, long j6) {
        this.f28462a = lp;
        this.f28463b = i;
        Objects.requireNonNull(z3);
        this.f28464c = z3;
    }

    public final void a() {
        Z z3 = this.f28464c;
        z3.getClass();
        Trace.beginSection("dropVideoBuffer");
        this.f28462a.q(this.f28463b);
        Trace.endSection();
        z3.w0(0, 1);
    }
}
