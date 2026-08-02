package com.google.android.gms.internal.ads;

import android.os.Trace;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MP f29242a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29243b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Z f29244c;

    public X(Z z6, MP mp, int i, long j6) {
        this.f29242a = mp;
        this.f29243b = i;
        Objects.requireNonNull(z6);
        this.f29244c = z6;
    }

    public final void a() {
        Z z6 = this.f29244c;
        z6.getClass();
        Trace.beginSection("dropVideoBuffer");
        this.f29242a.t(this.f29243b);
        Trace.endSection();
        z6.w0(0, 1);
    }
}
