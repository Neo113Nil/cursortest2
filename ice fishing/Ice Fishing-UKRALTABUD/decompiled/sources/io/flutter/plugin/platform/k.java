package io.flutter.plugin.platform;

import L.Q;
import android.app.Activity;
import android.util.SparseArray;
import android.view.View;
import c0.C0108j;
import d0.C0113c;
import d0.C0120j;
import h.C0174s;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.HashMap;
import java.util.HashSet;
import l0.C0200c;

/* loaded from: classes.dex */
public final class k implements h {

    /* renamed from: g, reason: collision with root package name */
    public Activity f2466g;

    /* renamed from: h, reason: collision with root package name */
    public c0.r f2467h;

    /* renamed from: j, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.h f2469j;

    /* renamed from: k, reason: collision with root package name */
    public io.flutter.plugin.editing.l f2470k;

    /* renamed from: l, reason: collision with root package name */
    public C0200c f2471l;

    /* renamed from: y, reason: collision with root package name */
    public final Q f2483y;

    /* renamed from: i, reason: collision with root package name */
    public FlutterJNI f2468i = null;

    /* renamed from: t, reason: collision with root package name */
    public int f2478t = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2479u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2480v = true;

    /* renamed from: z, reason: collision with root package name */
    public final A.j f2484z = new A.j(26, this);

    /* renamed from: f, reason: collision with root package name */
    public final C0120j f2465f = new C0120j(2);

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f2473n = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final a f2472m = new a();

    /* renamed from: o, reason: collision with root package name */
    public final HashMap f2474o = new HashMap();
    public final SparseArray r = new SparseArray();

    /* renamed from: w, reason: collision with root package name */
    public final HashSet f2481w = new HashSet();

    /* renamed from: x, reason: collision with root package name */
    public final HashSet f2482x = new HashSet();

    /* renamed from: s, reason: collision with root package name */
    public final SparseArray f2477s = new SparseArray();

    /* renamed from: p, reason: collision with root package name */
    public final SparseArray f2475p = new SparseArray();

    /* renamed from: q, reason: collision with root package name */
    public final SparseArray f2476q = new SparseArray();

    public k() {
        if (Q.f594i == null) {
            Q.f594i = new Q(8);
        }
        this.f2483y = Q.f594i;
    }

    public static void b(k kVar, C0174s c0174s) {
        kVar.getClass();
        int i2 = c0174s.f2260b;
        if (i2 == 0 || i2 == 1) {
            return;
        }
        throw new IllegalStateException("Trying to create a view with unknown direction value: " + i2 + "(view id: " + c0174s.f2259a + ")");
    }

    @Override // io.flutter.plugin.platform.h
    public final void a() {
        this.f2472m.f2440a = null;
    }

    public final void c() {
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.r;
            if (i2 >= sparseArray.size()) {
                return;
            }
            b bVar = (b) sparseArray.valueAt(i2);
            bVar.d();
            bVar.f1702f.close();
            i2++;
        }
    }

    @Override // io.flutter.plugin.platform.h
    public final void d(io.flutter.view.h hVar) {
        this.f2472m.f2440a = hVar;
    }

    public final void e(boolean z2) {
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.r;
            if (i2 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i2);
            b bVar = (b) sparseArray.valueAt(i2);
            if (this.f2481w.contains(Integer.valueOf(keyAt))) {
                C0113c c0113c = this.f2467h.f1740n;
                if (c0113c != null) {
                    bVar.a(c0113c.f1777b);
                }
                z2 &= bVar.e();
            } else {
                if (!this.f2479u) {
                    bVar.d();
                }
                bVar.setVisibility(8);
                this.f2467h.removeView(bVar);
            }
            i2++;
        }
        int i3 = 0;
        while (true) {
            SparseArray sparseArray2 = this.f2476q;
            if (i3 >= sparseArray2.size()) {
                return;
            }
            int keyAt2 = sparseArray2.keyAt(i3);
            View view = (View) sparseArray2.get(keyAt2);
            if (!this.f2482x.contains(Integer.valueOf(keyAt2)) || (!z2 && this.f2480v)) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
            i3++;
        }
    }

    @Override // io.flutter.plugin.platform.h
    public final void f(int i2) {
        if (g(i2)) {
            ((q) this.f2473n.get(Integer.valueOf(i2))).getClass();
        } else if (this.f2475p.get(i2) != null) {
            throw new ClassCastException();
        }
    }

    @Override // io.flutter.plugin.platform.h
    public final boolean g(int i2) {
        return this.f2473n.containsKey(Integer.valueOf(i2));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.k] */
    public final void h() {
        if (!this.f2480v || this.f2479u) {
            return;
        }
        c0.r rVar = this.f2467h;
        rVar.f1736j.c();
        C0108j c0108j = rVar.f1735i;
        if (c0108j == null) {
            C0108j c0108j2 = new C0108j(rVar.getContext(), rVar.getWidth(), rVar.getHeight(), 1);
            rVar.f1735i = c0108j2;
            rVar.addView(c0108j2);
        } else {
            c0108j.g(rVar.getWidth(), rVar.getHeight());
        }
        rVar.f1737k = rVar.f1736j;
        C0108j c0108j3 = rVar.f1735i;
        rVar.f1736j = c0108j3;
        C0113c c0113c = rVar.f1740n;
        if (c0113c != null) {
            c0108j3.a(c0113c.f1777b);
        }
        this.f2479u = true;
    }

    public final int i(double d2) {
        return (int) Math.round(d2 * this.f2466g.getResources().getDisplayMetrics().density);
    }
}
