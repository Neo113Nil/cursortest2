package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;

/* loaded from: classes2.dex */
public final class Z extends Surface {

    /* renamed from: w, reason: collision with root package name */
    public static int f28934w;

    /* renamed from: x, reason: collision with root package name */
    public static boolean f28935x;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f28936n;

    /* renamed from: u, reason: collision with root package name */
    public final Y f28937u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f28938v;

    public /* synthetic */ Z(Y y6, SurfaceTexture surfaceTexture, boolean z8) {
        super(surfaceTexture);
        this.f28937u = y6;
        this.f28936n = z8;
    }

    public static synchronized boolean a(Context context) {
        int i;
        int i4;
        synchronized (Z.class) {
            if (!f28935x) {
                try {
                } catch (C2696Nn e6) {
                    AbstractC3217fl.T("PlaceholderSurface", "Failed to determine secure mode due to GL error: ".concat(String.valueOf(e6.getMessage())));
                }
                if (AbstractC3194fG.m(context)) {
                    i = AbstractC3194fG.C("EGL_KHR_surfaceless_context") ? 1 : 2;
                    f28934w = i;
                    f28935x = true;
                }
                i = 0;
                f28934w = i;
                f28935x = true;
            }
            i4 = f28934w;
        }
        return i4 != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        Y y6 = this.f28937u;
        synchronized (y6) {
            try {
                if (!this.f28938v) {
                    Handler handler = y6.f28753u;
                    handler.getClass();
                    handler.sendEmptyMessage(2);
                    this.f28938v = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
