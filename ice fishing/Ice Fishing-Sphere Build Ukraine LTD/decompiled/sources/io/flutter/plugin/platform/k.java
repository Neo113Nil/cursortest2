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

    /* renamed from: f, reason: collision with root package name */
    public Activity f2474f;

    /* renamed from: g, reason: collision with root package name */
    public c0.r f2475g;

    /* renamed from: i, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.h f2477i;

    /* renamed from: j, reason: collision with root package name */
    public io.flutter.plugin.editing.l f2478j;

    /* renamed from: k, reason: collision with root package name */
    public C0200c f2479k;

    /* renamed from: x, reason: collision with root package name */
    public final Q f2491x;

    /* renamed from: h, reason: collision with root package name */
    public FlutterJNI f2476h = null;

    /* renamed from: s, reason: collision with root package name */
    public int f2486s = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2487t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2488u = true;

    /* renamed from: y, reason: collision with root package name */
    public final A.j f2492y = new A.j(26, this);

    /* renamed from: e, reason: collision with root package name */
    public final C0120j f2473e = new C0120j(2);

    /* renamed from: m, reason: collision with root package name */
    public final HashMap f2481m = new HashMap();

    /* renamed from: l, reason: collision with root package name */
    public final a f2480l = new a();

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f2482n = new HashMap();

    /* renamed from: q, reason: collision with root package name */
    public final SparseArray f2485q = new SparseArray();

    /* renamed from: v, reason: collision with root package name */
    public final HashSet f2489v = new HashSet();

    /* renamed from: w, reason: collision with root package name */
    public final HashSet f2490w = new HashSet();
    public final SparseArray r = new SparseArray();

    /* renamed from: o, reason: collision with root package name */
    public final SparseArray f2483o = new SparseArray();

    /* renamed from: p, reason: collision with root package name */
    public final SparseArray f2484p = new SparseArray();

    public k() {
        if (Q.f516h == null) {
            Q.f516h = new Q(8);
        }
        this.f2491x = Q.f516h;
    }

    public static void b(k kVar, C0174s c0174s) {
        kVar.getClass();
        int i2 = c0174s.f2268b;
        if (i2 == 0 || i2 == 1) {
            return;
        }
        throw new IllegalStateException("Trying to create a view with unknown direction value: " + i2 + "(view id: " + c0174s.f2267a + ")");
    }

    @Override // io.flutter.plugin.platform.h
    public final void a() {
        this.f2480l.f2448a = null;
    }

    public final void c() {
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f2485q;
            if (i2 >= sparseArray.size()) {
                return;
            }
            b bVar = (b) sparseArray.valueAt(i2);
            bVar.d();
            bVar.f1710e.close();
            i2++;
        }
    }

    @Override // io.flutter.plugin.platform.h
    public final void d(io.flutter.view.h hVar) {
        this.f2480l.f2448a = hVar;
    }

    public final void e(boolean z2) {
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f2485q;
            if (i2 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i2);
            b bVar = (b) sparseArray.valueAt(i2);
            if (this.f2489v.contains(Integer.valueOf(keyAt))) {
                C0113c c0113c = this.f2475g.f1747m;
                if (c0113c != null) {
                    bVar.a(c0113c.f1785b);
                }
                z2 &= bVar.e();
            } else {
                if (!this.f2487t) {
                    bVar.d();
                }
                bVar.setVisibility(8);
                this.f2475g.removeView(bVar);
            }
            i2++;
        }
        int i3 = 0;
        while (true) {
            SparseArray sparseArray2 = this.f2484p;
            if (i3 >= sparseArray2.size()) {
                return;
            }
            int keyAt2 = sparseArray2.keyAt(i3);
            View view = (View) sparseArray2.get(keyAt2);
            if (!this.f2490w.contains(Integer.valueOf(keyAt2)) || (!z2 && this.f2488u)) {
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
            ((q) this.f2481m.get(Integer.valueOf(i2))).getClass();
        } else if (this.f2483o.get(i2) != null) {
            throw new ClassCastException();
        }
    }

    @Override // io.flutter.plugin.platform.h
    public final boolean g(int i2) {
        return this.f2481m.containsKey(Integer.valueOf(i2));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.k] */
    public final void h() {
        if (!this.f2488u || this.f2487t) {
            return;
        }
        c0.r rVar = this.f2475g;
        rVar.f1743i.c();
        C0108j c0108j = rVar.f1742h;
        if (c0108j == null) {
            C0108j c0108j2 = new C0108j(rVar.getContext(), rVar.getWidth(), rVar.getHeight(), 1);
            rVar.f1742h = c0108j2;
            rVar.addView(c0108j2);
        } else {
            c0108j.g(rVar.getWidth(), rVar.getHeight());
        }
        rVar.f1744j = rVar.f1743i;
        C0108j c0108j3 = rVar.f1742h;
        rVar.f1743i = c0108j3;
        C0113c c0113c = rVar.f1747m;
        if (c0113c != null) {
            c0108j3.a(c0113c.f1785b);
        }
        this.f2487t = true;
    }

    public final int i(double d2) {
        return (int) Math.round(d2 * this.f2474f.getResources().getDisplayMetrics().density);
    }
}
