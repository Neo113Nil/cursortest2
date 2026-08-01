package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import q2.AbstractBinderC4918y0;

/* renamed from: com.google.android.gms.internal.ads.Ih, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2606Ih extends AbstractBinderC4918y0 {

    /* renamed from: B, reason: collision with root package name */
    public float f25545B;

    /* renamed from: C, reason: collision with root package name */
    public float f25546C;

    /* renamed from: D, reason: collision with root package name */
    public float f25547D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f25548E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f25549F;

    /* renamed from: G, reason: collision with root package name */
    public C2634Kb f25550G;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC4061vh f25551n;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f25553v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f25554w;

    /* renamed from: x, reason: collision with root package name */
    public int f25555x;

    /* renamed from: y, reason: collision with root package name */
    public q2.C0 f25556y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f25557z;

    /* renamed from: u, reason: collision with root package name */
    public final Object f25552u = new Object();

    /* renamed from: A, reason: collision with root package name */
    public boolean f25544A = true;

    public BinderC2606Ih(InterfaceC4061vh interfaceC4061vh, float f3, boolean z3, boolean z6) {
        this.f25551n = interfaceC4061vh;
        this.f25545B = f3;
        this.f25553v = z3;
        this.f25554w = z6;
    }

    public final void V3(q2.Z0 z02) {
        Object obj = this.f25552u;
        boolean z3 = z02.f40087u;
        boolean z6 = z02.f40088v;
        synchronized (obj) {
            this.f25548E = z3;
            this.f25549F = z6;
        }
        boolean z9 = z02.f40086n;
        String str = true != z3 ? "0" : "1";
        String str2 = true != z6 ? "0" : "1";
        String str3 = true != z9 ? "0" : "1";
        s.b bVar = new s.b(3);
        bVar.put("muteStart", str3);
        bVar.put("customControlsRequested", str);
        bVar.put("clickToExpandRequested", str2);
        X3("initialState", Collections.unmodifiableMap(bVar));
    }

    public final void W3(float f3, float f9, int i, boolean z3, float f10) {
        boolean z6;
        boolean z9;
        int i6;
        synchronized (this.f25552u) {
            try {
                z6 = true;
                if (f9 == this.f25545B && f10 == this.f25547D) {
                    z6 = false;
                }
                this.f25545B = f9;
                if (!((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.le)).booleanValue()) {
                    this.f25546C = f3;
                }
                z9 = this.f25544A;
                this.f25544A = z3;
                i6 = this.f25555x;
                this.f25555x = i;
                float f11 = this.f25547D;
                this.f25547D = f10;
                if (Math.abs(f10 - f11) > 1.0E-4f) {
                    this.f25551n.V().invalidate();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z6) {
            try {
                C2634Kb c2634Kb = this.f25550G;
                if (c2634Kb != null) {
                    c2634Kb.f1(c2634Kb.H0(), 2);
                }
            } catch (RemoteException e9) {
                v2.i.i("#007 Could not call remote method.", e9);
            }
        }
        AbstractC3413jg.f31273f.execute(new RunnableC2589Hh(this, i6, i, z9, z3));
    }

    public final void X3(String str, Map map) {
        HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put(NativeAdvancedJsUtils.f17906p, str);
        AbstractC3413jg.f31273f.execute(new RunnableC3973u0(17, this, hashMap));
    }

    @Override // q2.A0
    public final void d() {
        X3("play", null);
    }

    @Override // q2.A0
    public final void e() {
        X3(com.anythink.expressad.foundation.d.d.co, null);
    }

    @Override // q2.A0
    public final void e2(q2.C0 c02) {
        synchronized (this.f25552u) {
            this.f25556y = c02;
        }
    }

    @Override // q2.A0
    public final boolean g() {
        boolean z3;
        synchronized (this.f25552u) {
            z3 = this.f25544A;
        }
        return z3;
    }

    @Override // q2.A0
    public final float j() {
        float f3;
        synchronized (this.f25552u) {
            f3 = this.f25545B;
        }
        return f3;
    }

    @Override // q2.A0
    public final float k() {
        float f3;
        synchronized (this.f25552u) {
            f3 = this.f25546C;
        }
        return f3;
    }

    @Override // q2.A0
    public final void l0(boolean z3) {
        X3(true != z3 ? com.anythink.expressad.foundation.d.d.cm : "mute", null);
    }

    @Override // q2.A0
    public final void m() {
        X3("stop", null);
    }

    @Override // q2.A0
    public final int n() {
        int i;
        synchronized (this.f25552u) {
            i = this.f25555x;
        }
        return i;
    }

    @Override // q2.A0
    public final boolean p() {
        boolean z3;
        synchronized (this.f25552u) {
            try {
                z3 = false;
                if (this.f25553v && this.f25548E) {
                    z3 = true;
                }
            } finally {
            }
        }
        return z3;
    }

    @Override // q2.A0
    public final float q() {
        float f3;
        synchronized (this.f25552u) {
            f3 = this.f25547D;
        }
        return f3;
    }

    @Override // q2.A0
    public final boolean r() {
        boolean z3;
        Object obj = this.f25552u;
        boolean p9 = p();
        synchronized (obj) {
            z3 = false;
            if (!p9) {
                try {
                    if (this.f25549F && this.f25554w) {
                        z3 = true;
                    }
                } finally {
                }
            }
        }
        return z3;
    }

    @Override // q2.A0
    public final q2.C0 s() {
        q2.C0 c02;
        synchronized (this.f25552u) {
            c02 = this.f25556y;
        }
        return c02;
    }
}
