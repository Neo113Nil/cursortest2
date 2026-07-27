package com.google.android.gms.internal.ads;

import android.os.Trace;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ YP f28194a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28195b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ X f28196c;

    public V(X x3, YP yp, int i, long j9) {
        this.f28194a = yp;
        this.f28195b = i;
        Objects.requireNonNull(x3);
        this.f28196c = x3;
    }

    public final void a() {
        X x3 = this.f28196c;
        x3.getClass();
        Trace.beginSection("dropVideoBuffer");
        this.f28194a.D(this.f28195b);
        Trace.endSection();
        x3.v0(0, 1);
    }
}
