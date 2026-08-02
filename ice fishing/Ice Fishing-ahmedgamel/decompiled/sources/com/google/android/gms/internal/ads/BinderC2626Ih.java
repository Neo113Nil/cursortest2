package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import s2.AbstractBinderC4967y0;

/* renamed from: com.google.android.gms.internal.ads.Ih, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2626Ih extends AbstractBinderC4967y0 {

    /* renamed from: B, reason: collision with root package name */
    public float f26294B;

    /* renamed from: C, reason: collision with root package name */
    public float f26295C;

    /* renamed from: D, reason: collision with root package name */
    public float f26296D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f26297E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f26298F;

    /* renamed from: G, reason: collision with root package name */
    public C2654Kb f26299G;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC4084vh f26300n;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f26302v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f26303w;

    /* renamed from: x, reason: collision with root package name */
    public int f26304x;

    /* renamed from: y, reason: collision with root package name */
    public s2.C0 f26305y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f26306z;

    /* renamed from: u, reason: collision with root package name */
    public final Object f26301u = new Object();

    /* renamed from: A, reason: collision with root package name */
    public boolean f26293A = true;

    public BinderC2626Ih(InterfaceC4084vh interfaceC4084vh, float f2, boolean z6, boolean z9) {
        this.f26300n = interfaceC4084vh;
        this.f26294B = f2;
        this.f26302v = z6;
        this.f26303w = z9;
    }

    public final void V3(s2.Z0 z02) {
        Object obj = this.f26301u;
        boolean z6 = z02.f40386u;
        boolean z9 = z02.f40387v;
        synchronized (obj) {
            this.f26297E = z6;
            this.f26298F = z9;
        }
        boolean z10 = z02.f40385n;
        String str = true != z6 ? "0" : "1";
        String str2 = true != z9 ? "0" : "1";
        String str3 = true != z10 ? "0" : "1";
        s.b bVar = new s.b(3);
        bVar.put("muteStart", str3);
        bVar.put("customControlsRequested", str);
        bVar.put("clickToExpandRequested", str2);
        X3("initialState", Collections.unmodifiableMap(bVar));
    }

    public final void W3(float f2, float f9, int i, boolean z6, float f10) {
        boolean z9;
        boolean z10;
        int i4;
        synchronized (this.f26301u) {
            try {
                z9 = true;
                if (f9 == this.f26294B && f10 == this.f26296D) {
                    z9 = false;
                }
                this.f26294B = f9;
                if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.le)).booleanValue()) {
                    this.f26295C = f2;
                }
                z10 = this.f26293A;
                this.f26293A = z6;
                i4 = this.f26304x;
                this.f26304x = i;
                float f11 = this.f26296D;
                this.f26296D = f10;
                if (Math.abs(f10 - f11) > 1.0E-4f) {
                    this.f26300n.V().invalidate();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z9) {
            try {
                C2654Kb c2654Kb = this.f26299G;
                if (c2654Kb != null) {
                    c2654Kb.d1(c2654Kb.F0(), 2);
                }
            } catch (RemoteException e9) {
                x2.i.i("#007 Could not call remote method.", e9);
            }
        }
        AbstractC3436jg.f32060f.execute(new RunnableC2609Hh(this, i4, i, z10, z6));
    }

    public final void X3(String str, Map map) {
        HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put(NativeAdvancedJsUtils.f18693p, str);
        AbstractC3436jg.f32060f.execute(new RunnableC3996u0(17, this, hashMap));
    }

    @Override // s2.A0
    public final void Y1(s2.C0 c02) {
        synchronized (this.f26301u) {
            this.f26305y = c02;
        }
    }

    @Override // s2.A0
    public final void d() {
        X3("play", null);
    }

    @Override // s2.A0
    public final void e() {
        X3(com.anythink.expressad.foundation.d.d.co, null);
    }

    @Override // s2.A0
    public final boolean g() {
        boolean z6;
        synchronized (this.f26301u) {
            z6 = this.f26293A;
        }
        return z6;
    }

    @Override // s2.A0
    public final float j() {
        float f2;
        synchronized (this.f26301u) {
            f2 = this.f26294B;
        }
        return f2;
    }

    @Override // s2.A0
    public final float k() {
        float f2;
        synchronized (this.f26301u) {
            f2 = this.f26295C;
        }
        return f2;
    }

    @Override // s2.A0
    public final void l0(boolean z6) {
        X3(true != z6 ? com.anythink.expressad.foundation.d.d.cm : "mute", null);
    }

    @Override // s2.A0
    public final void m() {
        X3("stop", null);
    }

    @Override // s2.A0
    public final int n() {
        int i;
        synchronized (this.f26301u) {
            i = this.f26304x;
        }
        return i;
    }

    @Override // s2.A0
    public final boolean p() {
        boolean z6;
        synchronized (this.f26301u) {
            try {
                z6 = false;
                if (this.f26302v && this.f26297E) {
                    z6 = true;
                }
            } finally {
            }
        }
        return z6;
    }

    @Override // s2.A0
    public final float q() {
        float f2;
        synchronized (this.f26301u) {
            f2 = this.f26296D;
        }
        return f2;
    }

    @Override // s2.A0
    public final boolean r() {
        boolean z6;
        Object obj = this.f26301u;
        boolean p9 = p();
        synchronized (obj) {
            z6 = false;
            if (!p9) {
                try {
                    if (this.f26298F && this.f26303w) {
                        z6 = true;
                    }
                } finally {
                }
            }
        }
        return z6;
    }

    @Override // s2.A0
    public final s2.C0 s() {
        s2.C0 c02;
        synchronized (this.f26301u) {
            c02 = this.f26305y;
        }
        return c02;
    }
}
