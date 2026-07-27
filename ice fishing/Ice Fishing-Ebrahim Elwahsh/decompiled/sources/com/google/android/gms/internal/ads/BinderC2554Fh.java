package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import q2.AbstractBinderC4925y0;

/* renamed from: com.google.android.gms.internal.ads.Fh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2554Fh extends AbstractBinderC4925y0 {

    /* renamed from: B, reason: collision with root package name */
    public float f24993B;

    /* renamed from: C, reason: collision with root package name */
    public float f24994C;

    /* renamed from: D, reason: collision with root package name */
    public float f24995D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f24996E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f24997F;

    /* renamed from: G, reason: collision with root package name */
    public C2565Gb f24998G;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC3858rh f24999n;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f25001v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f25002w;

    /* renamed from: x, reason: collision with root package name */
    public int f25003x;

    /* renamed from: y, reason: collision with root package name */
    public q2.C0 f25004y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f25005z;

    /* renamed from: u, reason: collision with root package name */
    public final Object f25000u = new Object();

    /* renamed from: A, reason: collision with root package name */
    public boolean f24992A = true;

    public BinderC2554Fh(InterfaceC3858rh interfaceC3858rh, float f6, boolean z8, boolean z9) {
        this.f24999n = interfaceC3858rh;
        this.f24993B = f6;
        this.f25001v = z8;
        this.f25002w = z9;
    }

    public final void H3(q2.a1 a1Var) {
        Object obj = this.f25000u;
        boolean z8 = a1Var.f39996u;
        boolean z9 = a1Var.f39997v;
        synchronized (obj) {
            this.f24996E = z8;
            this.f24997F = z9;
        }
        boolean z10 = a1Var.f39995n;
        String str = true != z8 ? "0" : "1";
        String str2 = true != z9 ? "0" : "1";
        String str3 = true != z10 ? "0" : "1";
        s.b bVar = new s.b(3);
        bVar.put("muteStart", str3);
        bVar.put("customControlsRequested", str);
        bVar.put("clickToExpandRequested", str2);
        J3("initialState", Collections.unmodifiableMap(bVar));
    }

    public final void I3(float f6, float f9, int i, boolean z8, float f10) {
        boolean z9;
        boolean z10;
        int i4;
        synchronized (this.f25000u) {
            try {
                z9 = true;
                if (f9 == this.f24993B && f10 == this.f24995D) {
                    z9 = false;
                }
                this.f24993B = f9;
                if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.le)).booleanValue()) {
                    this.f24994C = f6;
                }
                z10 = this.f24992A;
                this.f24992A = z8;
                i4 = this.f25003x;
                this.f25003x = i;
                float f11 = this.f24995D;
                this.f24995D = f10;
                if (Math.abs(f10 - f11) > 1.0E-4f) {
                    this.f24999n.b0().invalidate();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z9) {
            try {
                C2565Gb c2565Gb = this.f24998G;
                if (c2565Gb != null) {
                    c2565Gb.G0(c2565Gb.A0(), 2);
                }
            } catch (RemoteException e6) {
                u2.i.i("#007 Could not call remote method.", e6);
            }
        }
        AbstractC3212fg.f30743f.execute(new RunnableC2537Eh(this, i4, i, z10, z8));
    }

    public final void J3(String str, Map map) {
        HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put(NativeAdvancedJsUtils.f18064p, str);
        AbstractC3212fg.f30743f.execute(new MD(18, this, hashMap));
    }

    @Override // q2.A0
    public final void c() {
        J3("play", null);
    }

    @Override // q2.A0
    public final void d2(q2.C0 c02) {
        synchronized (this.f25000u) {
            this.f25004y = c02;
        }
    }

    @Override // q2.A0
    public final void f() {
        J3(com.anythink.expressad.foundation.d.d.co, null);
    }

    @Override // q2.A0
    public final boolean g() {
        boolean z8;
        synchronized (this.f25000u) {
            z8 = this.f24992A;
        }
        return z8;
    }

    @Override // q2.A0
    public final float h() {
        float f6;
        synchronized (this.f25000u) {
            f6 = this.f24993B;
        }
        return f6;
    }

    @Override // q2.A0
    public final float j() {
        float f6;
        synchronized (this.f25000u) {
            f6 = this.f24994C;
        }
        return f6;
    }

    @Override // q2.A0
    public final int l() {
        int i;
        synchronized (this.f25000u) {
            i = this.f25003x;
        }
        return i;
    }

    @Override // q2.A0
    public final float m() {
        float f6;
        synchronized (this.f25000u) {
            f6 = this.f24995D;
        }
        return f6;
    }

    @Override // q2.A0
    public final void o0(boolean z8) {
        J3(true != z8 ? com.anythink.expressad.foundation.d.d.cm : "mute", null);
    }

    @Override // q2.A0
    public final boolean p() {
        boolean z8;
        synchronized (this.f25000u) {
            try {
                z8 = false;
                if (this.f25001v && this.f24996E) {
                    z8 = true;
                }
            } finally {
            }
        }
        return z8;
    }

    @Override // q2.A0
    public final q2.C0 q() {
        q2.C0 c02;
        synchronized (this.f25000u) {
            c02 = this.f25004y;
        }
        return c02;
    }

    @Override // q2.A0
    public final boolean r() {
        boolean z8;
        Object obj = this.f25000u;
        boolean p6 = p();
        synchronized (obj) {
            z8 = false;
            if (!p6) {
                try {
                    if (this.f24997F && this.f25002w) {
                        z8 = true;
                    }
                } finally {
                }
            }
        }
        return z8;
    }

    @Override // q2.A0
    public final void y() {
        J3("stop", null);
    }
}
