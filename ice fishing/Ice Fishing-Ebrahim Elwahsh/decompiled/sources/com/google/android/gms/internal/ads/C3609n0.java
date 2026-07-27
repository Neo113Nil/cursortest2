package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.view.Surface;

/* renamed from: com.google.android.gms.internal.ads.n0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3609n0 {

    /* renamed from: a, reason: collision with root package name */
    public final S f32785a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f32786b;

    /* renamed from: c, reason: collision with root package name */
    public AbstractC3447k0 f32787c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f32788d;

    /* renamed from: e, reason: collision with root package name */
    public Surface f32789e;

    /* renamed from: f, reason: collision with root package name */
    public float f32790f;

    /* renamed from: g, reason: collision with root package name */
    public float f32791g;

    /* renamed from: h, reason: collision with root package name */
    public float f32792h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public int f32793j;

    /* renamed from: k, reason: collision with root package name */
    public long f32794k;

    /* renamed from: l, reason: collision with root package name */
    public long f32795l;

    /* renamed from: m, reason: collision with root package name */
    public long f32796m;

    /* renamed from: n, reason: collision with root package name */
    public long f32797n;

    /* renamed from: o, reason: collision with root package name */
    public long f32798o;

    /* renamed from: p, reason: collision with root package name */
    public long f32799p;

    /* renamed from: q, reason: collision with root package name */
    public long f32800q;

    /* renamed from: r, reason: collision with root package name */
    public long f32801r;

    /* renamed from: s, reason: collision with root package name */
    public long f32802s;

    public C3609n0(Context context) {
        this.f32786b = context;
        S s3 = new S();
        s3.f27462a = new Q();
        s3.f27463b = new Q();
        s3.f27465d = com.anythink.basead.exoplayer.b.f6539b;
        this.f32785a = s3;
        this.f32790f = -1.0f;
        this.i = 1.0f;
        this.f32793j = 0;
    }

    public final void a() {
        this.f32796m = 0L;
        this.f32800q = -1L;
        this.f32797n = -1L;
        this.f32794k = 0L;
        this.f32795l = 0L;
    }

    public final void b() {
        float f6;
        if (Build.VERSION.SDK_INT < 30 || this.f32789e == null) {
            return;
        }
        S s3 = this.f32785a;
        if (!s3.f27462a.b()) {
            f6 = this.f32790f;
        } else if (s3.f27462a.b()) {
            f6 = (float) (1.0E9d / (s3.f27462a.f27094e != 0 ? r2.f27095f / r4 : 0L));
        } else {
            f6 = -1.0f;
        }
        float f9 = this.f32791g;
        if (f6 != f9) {
            if (f6 != -1.0f && f9 != -1.0f) {
                float f10 = 1.0f;
                if (s3.f27462a.b()) {
                    if ((s3.f27462a.b() ? s3.f27462a.f27095f : com.anythink.basead.exoplayer.b.f6539b) >= 5000000000L) {
                        f10 = 0.1f;
                    }
                }
                if (Math.abs(f6 - this.f32791g) < f10) {
                    return;
                }
            } else if (f6 == -1.0f && s3.f27466e < 30) {
                return;
            }
            this.f32791g = f6;
            c(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(boolean z8) {
        Surface surface;
        float f6;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.f32789e) == null || this.f32793j == Integer.MIN_VALUE || !surface.isValid()) {
            return;
        }
        try {
            if (this.f32788d) {
                float f9 = this.f32791g;
                if (f9 != -1.0f) {
                    f6 = f9 * this.i;
                    if (z8 && this.f32792h == f6) {
                        return;
                    }
                    this.f32792h = f6;
                    this.f32789e.setFrameRate(f6, f6 != 0.0f ? 0 : 1);
                    return;
                }
            }
            this.f32789e.setFrameRate(f6, f6 != 0.0f ? 0 : 1);
            return;
        } catch (IllegalStateException e6) {
            AbstractC3217fl.X("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e6);
            return;
        }
        f6 = 0.0f;
        if (z8) {
        }
        this.f32792h = f6;
    }

    public final void d() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.f32789e) == null || this.f32793j == Integer.MIN_VALUE || this.f32792h == 0.0f || !surface.isValid()) {
            return;
        }
        this.f32792h = 0.0f;
        try {
            this.f32789e.setFrameRate(0.0f, 0);
        } catch (IllegalStateException e6) {
            AbstractC3217fl.X("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e6);
        }
    }
}
