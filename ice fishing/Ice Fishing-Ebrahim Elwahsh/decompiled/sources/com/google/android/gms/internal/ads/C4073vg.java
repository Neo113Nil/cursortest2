package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.vg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4073vg {

    /* renamed from: b, reason: collision with root package name */
    public long f34831b;

    /* renamed from: a, reason: collision with root package name */
    public final long f34830a = TimeUnit.MILLISECONDS.toNanos(((Long) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31734n0)).longValue());

    /* renamed from: c, reason: collision with root package name */
    public boolean f34832c = true;

    public final void a(SurfaceTexture surfaceTexture, C3965tg c3965tg) {
        if (c3965tg == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (!this.f34832c) {
            long j9 = timestamp - this.f34831b;
            if (Math.abs(j9) < this.f34830a) {
                return;
            }
        }
        this.f34832c = false;
        this.f34831b = timestamp;
        t2.G.f40858l.post(new RunnableC3857rg(3, c3965tg, false));
    }
}
