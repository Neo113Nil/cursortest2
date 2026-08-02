package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.view.Surface;

/* renamed from: com.google.android.gms.internal.ads.p0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3727p0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f33777a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC3565m0 f33778b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f33779c;

    /* renamed from: d, reason: collision with root package name */
    public Surface f33780d;

    /* renamed from: e, reason: collision with root package name */
    public float f33781e;

    /* renamed from: f, reason: collision with root package name */
    public float f33782f;

    /* renamed from: g, reason: collision with root package name */
    public float f33783g = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    public int f33784h = 0;
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public long f33785j;

    /* renamed from: k, reason: collision with root package name */
    public long f33786k;

    /* renamed from: l, reason: collision with root package name */
    public long f33787l;

    /* renamed from: m, reason: collision with root package name */
    public long f33788m;

    /* renamed from: n, reason: collision with root package name */
    public long f33789n;

    /* renamed from: o, reason: collision with root package name */
    public long f33790o;

    /* renamed from: p, reason: collision with root package name */
    public long f33791p;

    public C3727p0(Context context) {
        this.f33777a = context;
    }

    public final void a() {
        this.f33789n = -1L;
        this.f33786k = -1L;
        this.f33788m = com.anythink.basead.exoplayer.b.f7168b;
        this.i = 0L;
        this.f33785j = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(boolean z6) {
        Surface surface;
        float f2;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.f33780d) == null || this.f33784h == Integer.MIN_VALUE || !surface.isValid()) {
            return;
        }
        try {
            if (this.f33779c) {
                float f9 = this.f33781e;
                if (f9 != -1.0f) {
                    f2 = f9 * this.f33783g;
                    if (z6 && this.f33782f == f2) {
                        return;
                    }
                    this.f33782f = f2;
                    this.f33780d.setFrameRate(f2, f2 != 0.0f ? 0 : 1);
                    return;
                }
            }
            this.f33780d.setFrameRate(f2, f2 != 0.0f ? 0 : 1);
            return;
        } catch (IllegalStateException e9) {
            AbstractC2991bG.J("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e9);
            return;
        }
        f2 = 0.0f;
        if (z6) {
        }
        this.f33782f = f2;
    }

    public final void c() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.f33780d) == null || this.f33784h == Integer.MIN_VALUE || this.f33782f == 0.0f || !surface.isValid()) {
            return;
        }
        this.f33782f = 0.0f;
        try {
            this.f33780d.setFrameRate(0.0f, 0);
        } catch (IllegalStateException e9) {
            AbstractC2991bG.J("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e9);
        }
    }
}
