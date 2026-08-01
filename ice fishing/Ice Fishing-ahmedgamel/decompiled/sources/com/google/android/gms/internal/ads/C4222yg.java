package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.yg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4222yg {

    /* renamed from: b, reason: collision with root package name */
    public long f35192b;

    /* renamed from: a, reason: collision with root package name */
    public final long f35191a = TimeUnit.MILLISECONDS.toNanos(((Long) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32315n0)).longValue());

    /* renamed from: c, reason: collision with root package name */
    public boolean f35193c = true;

    public final void a(SurfaceTexture surfaceTexture, C4114wg c4114wg) {
        if (c4114wg == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (!this.f35193c) {
            long j6 = timestamp - this.f35192b;
            if (Math.abs(j6) < this.f35191a) {
                return;
            }
        }
        this.f35193c = false;
        this.f35192b = timestamp;
        u2.D.f41237l.post(new RunnableC4006ug(3, c4114wg, false));
    }
}
