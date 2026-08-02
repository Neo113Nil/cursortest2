package com.google.android.gms.internal.ads;

import android.os.Handler;

/* renamed from: com.google.android.gms.internal.ads.lw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3560lw implements InterfaceC3292gw {

    /* renamed from: d, reason: collision with root package name */
    public static C3560lw f32645d;

    /* renamed from: a, reason: collision with root package name */
    public float f32646a;

    /* renamed from: b, reason: collision with root package name */
    public C3077cw f32647b;

    /* renamed from: c, reason: collision with root package name */
    public C3238fw f32648c;

    public static C3560lw b() {
        if (f32645d == null) {
            C3560lw c3560lw = new C3560lw();
            c3560lw.f32646a = 0.0f;
            f32645d = c3560lw;
        }
        return f32645d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3292gw
    public final void a(boolean z6) {
        if (z6) {
            C4099vw.f35529g.getClass();
            C4099vw.b();
            return;
        }
        C4099vw.f35529g.getClass();
        Handler handler = C4099vw.i;
        if (handler != null) {
            handler.removeCallbacks(C4099vw.f35532k);
            C4099vw.i = null;
        }
    }
}
