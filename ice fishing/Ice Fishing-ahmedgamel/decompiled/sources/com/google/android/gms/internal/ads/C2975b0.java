package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;

/* renamed from: com.google.android.gms.internal.ads.b0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2975b0 extends Surface {

    /* renamed from: w, reason: collision with root package name */
    public static int f29964w;

    /* renamed from: x, reason: collision with root package name */
    public static boolean f29965x;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f29966n;

    /* renamed from: u, reason: collision with root package name */
    public final HandlerThreadC2921a0 f29967u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f29968v;

    public /* synthetic */ C2975b0(HandlerThreadC2921a0 handlerThreadC2921a0, SurfaceTexture surfaceTexture, boolean z6) {
        super(surfaceTexture);
        this.f29967u = handlerThreadC2921a0;
        this.f29966n = z6;
    }

    public static synchronized boolean a(Context context) {
        int i;
        int i4;
        synchronized (C2975b0.class) {
            if (!f29965x) {
                try {
                } catch (C2598Gn e9) {
                    AbstractC2991bG.H("PlaceholderSurface", "Failed to determine secure mode due to GL error: ".concat(String.valueOf(e9.getMessage())));
                }
                if (AbstractC2792Sd.k(context)) {
                    i = AbstractC2792Sd.E("EGL_KHR_surfaceless_context") ? 1 : 2;
                    f29964w = i;
                    f29965x = true;
                }
                i = 0;
                f29964w = i;
                f29965x = true;
            }
            i4 = f29964w;
        }
        return i4 != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        HandlerThreadC2921a0 handlerThreadC2921a0 = this.f29967u;
        synchronized (handlerThreadC2921a0) {
            try {
                if (!this.f29968v) {
                    Handler handler = handlerThreadC2921a0.f29761u;
                    handler.getClass();
                    handler.sendEmptyMessage(2);
                    this.f29968v = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
