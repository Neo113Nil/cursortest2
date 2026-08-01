package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.view.Surface;

/* renamed from: com.google.android.gms.internal.ads.p0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3704p0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f32987a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC3542m0 f32988b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f32989c;

    /* renamed from: d, reason: collision with root package name */
    public Surface f32990d;

    /* renamed from: e, reason: collision with root package name */
    public float f32991e;

    /* renamed from: f, reason: collision with root package name */
    public float f32992f;

    /* renamed from: g, reason: collision with root package name */
    public float f32993g = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    public int f32994h = 0;
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public long f32995j;

    /* renamed from: k, reason: collision with root package name */
    public long f32996k;

    /* renamed from: l, reason: collision with root package name */
    public long f32997l;

    /* renamed from: m, reason: collision with root package name */
    public long f32998m;

    /* renamed from: n, reason: collision with root package name */
    public long f32999n;

    /* renamed from: o, reason: collision with root package name */
    public long f33000o;

    /* renamed from: p, reason: collision with root package name */
    public long f33001p;

    public C3704p0(Context context) {
        this.f32987a = context;
    }

    public final void a() {
        this.f32999n = -1L;
        this.f32996k = -1L;
        this.f32998m = com.anythink.basead.exoplayer.b.f6382b;
        this.i = 0L;
        this.f32995j = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(boolean z3) {
        Surface surface;
        float f3;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.f32990d) == null || this.f32994h == Integer.MIN_VALUE || !surface.isValid()) {
            return;
        }
        try {
            if (this.f32989c) {
                float f9 = this.f32991e;
                if (f9 != -1.0f) {
                    f3 = f9 * this.f32993g;
                    if (z3 && this.f32992f == f3) {
                        return;
                    }
                    this.f32992f = f3;
                    this.f32990d.setFrameRate(f3, f3 != 0.0f ? 0 : 1);
                    return;
                }
            }
            this.f32990d.setFrameRate(f3, f3 != 0.0f ? 0 : 1);
            return;
        } catch (IllegalStateException e9) {
            AbstractC2968bG.J("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e9);
            return;
        }
        f3 = 0.0f;
        if (z3) {
        }
        this.f32992f = f3;
    }

    public final void c() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.f32990d) == null || this.f32994h == Integer.MIN_VALUE || this.f32992f == 0.0f || !surface.isValid()) {
            return;
        }
        this.f32992f = 0.0f;
        try {
            this.f32990d.setFrameRate(0.0f, 0);
        } catch (IllegalStateException e9) {
            AbstractC2968bG.J("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e9);
        }
    }
}
