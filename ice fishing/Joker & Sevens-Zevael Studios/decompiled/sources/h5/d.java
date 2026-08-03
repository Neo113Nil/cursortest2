package h5;

import a0.g;
import a1.f;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.k;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import androidx.lifecycle.o;
import androidx.lifecycle.p;
import androidx.lifecycle.q0;
import androidx.lifecycle.u;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import androidx.lifecycle.w;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import b0.l0;
import e4.e;
import j5.j;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;
import m0.l1;
import m0.r;
import m0.x1;
import m0.z;
import x4.l;
import x4.s;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d implements j, u, y0, e, k {

    /* renamed from: m, reason: collision with root package name */
    public static final o[] f2853m = {o.ON_CREATE};

    /* renamed from: n, reason: collision with root package name */
    public static final o[] f2854n = {o.ON_START, o.ON_RESUME};

    /* renamed from: o, reason: collision with root package name */
    public static final o[] f2855o = {o.ON_PAUSE, o.ON_STOP};

    /* renamed from: p, reason: collision with root package name */
    public static final o[] f2856p = {o.ON_DESTROY};

    /* renamed from: g, reason: collision with root package name */
    public final w f2857g = new w(this, true);

    /* renamed from: h, reason: collision with root package name */
    public final x0 f2858h = new x0();

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReference f2859i = new AtomicReference();

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReference f2860j = new AtomicReference();

    /* renamed from: k, reason: collision with root package name */
    public final s f2861k;

    /* renamed from: l, reason: collision with root package name */
    public final l1 f2862l;

    public d() {
        s sVar = new s(new g4.a(this, new n0(1, this)));
        this.f2861k = sVar;
        this.f2862l = z.s(Boolean.FALSE);
        sVar.g();
        m0.d(this);
    }

    public static final void i(d dVar, r rVar, int i10) {
        rVar.Z(248653203);
        Bundle bundle = (Bundle) v0.k.b(new Object[0], null, null, b.f2848h, rVar, 3080, 6);
        l1 l1Var = dVar.f2862l;
        if (!((Boolean) l1Var.getValue()).booleanValue()) {
            if (((Boolean) l1Var.getValue()).booleanValue()) {
                throw new IllegalStateException("onCreate already called");
            }
            l1Var.setValue(Boolean.TRUE);
            dVar.f2861k.h(bundle);
            for (o oVar : f2853m) {
                j(dVar.f2857g, oVar);
            }
        }
        z.d(dVar, new l0(3, dVar, bundle), rVar);
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new g(i10, 1, dVar);
        }
    }

    public static void j(w wVar, o oVar) {
        if (wVar.f723c.compareTo(p.f698h) >= 0) {
            wVar.d(oVar);
        }
    }

    @Override // e4.e
    public final l b() {
        return (l) this.f2861k.f8357i;
    }

    @Override // j5.j
    public final void c(u0.d dVar, u0.d dVar2, r rVar, int i10) {
        rVar.Z(271793937);
        dVar.d("lifecycle", u0.e.b(rVar, -1252663061, new f(4, this, dVar2)), rVar, Integer.valueOf(((i10 << 6) & 896) | 54));
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new b0.m0(this, dVar, dVar2, i10, 1);
        }
    }

    @Override // androidx.lifecycle.k
    public final v0 d() {
        Context context = (Context) this.f2859i.get();
        return new q0((context == null || !(context instanceof Application)) ? null : (Application) context, this, null);
    }

    @Override // androidx.lifecycle.k
    public final x3.b e() {
        x3.c cVar = new x3.c(0);
        Context context = (Context) this.f2859i.get();
        Application application = null;
        if (context != null && (context instanceof Application)) {
            application = (Application) context;
        }
        LinkedHashMap linkedHashMap = cVar.f8286a;
        if (application != null) {
            linkedHashMap.put(u0.f717d, application);
        }
        linkedHashMap.put(m0.f686a, this);
        linkedHashMap.put(m0.f687b, this);
        return cVar;
    }

    @Override // j5.j
    public final void f(k5.a aVar) {
        pc.j.e(aVar, "screen");
        this.f2858h.a();
        for (o oVar : f2856p) {
            j(this.f2857g, oVar);
        }
    }

    @Override // androidx.lifecycle.y0
    public final x0 g() {
        return this.f2858h;
    }

    @Override // androidx.lifecycle.u
    public final w h() {
        return this.f2857g;
    }
}
