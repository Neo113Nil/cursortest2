package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.yg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4245yg {

    /* renamed from: b, reason: collision with root package name */
    public long f35982b;

    /* renamed from: a, reason: collision with root package name */
    public final long f35981a = TimeUnit.MILLISECONDS.toNanos(((Long) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33095n0)).longValue());

    /* renamed from: c, reason: collision with root package name */
    public boolean f35983c = true;

    public final void a(SurfaceTexture surfaceTexture, C4137wg c4137wg) {
        if (c4137wg == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (!this.f35983c) {
            long j6 = timestamp - this.f35982b;
            if (Math.abs(j6) < this.f35981a) {
                return;
            }
        }
        this.f35983c = false;
        this.f35982b = timestamp;
        w2.D.f41627l.post(new RunnableC4029ug(3, c4137wg, false));
    }
}
