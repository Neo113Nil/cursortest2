package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes2.dex */
public final class Fu {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f25652a;

    /* renamed from: b, reason: collision with root package name */
    public final long f25653b;

    /* renamed from: c, reason: collision with root package name */
    public ScheduledFuture f25654c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Gu f25655d;

    public Fu(Gu gu, Runnable runnable, long j6) {
        Objects.requireNonNull(gu);
        this.f25655d = gu;
        this.f25652a = runnable;
        this.f25653b = j6;
    }
}
