package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;

/* renamed from: com.google.android.gms.internal.ads.b0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2952b0 extends Surface {

    /* renamed from: w, reason: collision with root package name */
    public static int f29176w;

    /* renamed from: x, reason: collision with root package name */
    public static boolean f29177x;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f29178n;

    /* renamed from: u, reason: collision with root package name */
    public final HandlerThreadC2898a0 f29179u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f29180v;

    public /* synthetic */ C2952b0(HandlerThreadC2898a0 handlerThreadC2898a0, SurfaceTexture surfaceTexture, boolean z3) {
        super(surfaceTexture);
        this.f29179u = handlerThreadC2898a0;
        this.f29178n = z3;
    }

    public static synchronized boolean a(Context context) {
        int i;
        int i6;
        synchronized (C2952b0.class) {
            if (!f29177x) {
                try {
                } catch (C2561Fn e9) {
                    AbstractC2968bG.H("PlaceholderSurface", "Failed to determine secure mode due to GL error: ".concat(String.valueOf(e9.getMessage())));
                }
                if (AbstractC2772Sd.k(context)) {
                    i = AbstractC2772Sd.E("EGL_KHR_surfaceless_context") ? 1 : 2;
                    f29176w = i;
                    f29177x = true;
                }
                i = 0;
                f29176w = i;
                f29177x = true;
            }
            i6 = f29176w;
        }
        return i6 != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        HandlerThreadC2898a0 handlerThreadC2898a0 = this.f29179u;
        synchronized (handlerThreadC2898a0) {
            try {
                if (!this.f29180v) {
                    Handler handler = handlerThreadC2898a0.f28991u;
                    handler.getClass();
                    handler.sendEmptyMessage(2);
                    this.f29180v = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
