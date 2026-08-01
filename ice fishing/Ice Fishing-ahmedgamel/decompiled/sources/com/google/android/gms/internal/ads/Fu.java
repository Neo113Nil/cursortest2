package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes2.dex */
public final class Fu {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f24862a;

    /* renamed from: b, reason: collision with root package name */
    public final long f24863b;

    /* renamed from: c, reason: collision with root package name */
    public ScheduledFuture f24864c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Gu f24865d;

    public Fu(Gu gu, Runnable runnable, long j6) {
        Objects.requireNonNull(gu);
        this.f24865d = gu;
        this.f24862a = runnable;
        this.f24863b = j6;
    }
}
