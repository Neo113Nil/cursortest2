package io.flutter.plugin.platform;

import P0.C0077j;
import P0.t;
import Q1.A;
import android.app.Activity;
import android.util.SparseArray;
import android.view.View;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class k implements h {

    /* renamed from: b, reason: collision with root package name */
    public Activity f7858b;

    /* renamed from: c, reason: collision with root package name */
    public t f7859c;

    /* renamed from: e, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.h f7861e;

    /* renamed from: f, reason: collision with root package name */
    public io.flutter.plugin.editing.j f7862f;

    /* renamed from: g, reason: collision with root package name */
    public Z0.i f7863g;
    public final x0.e t;

    /* renamed from: d, reason: collision with root package name */
    public FlutterJNI f7860d = null;

    /* renamed from: o, reason: collision with root package name */
    public int f7871o = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7872p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f7873q = true;

    /* renamed from: u, reason: collision with root package name */
    public final Z0.i f7876u = new Z0.i(23, this);

    /* renamed from: a, reason: collision with root package name */
    public final Q0.i f7857a = new Q0.i(2);

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f7865i = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final a f7864h = new a();

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f7866j = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final SparseArray f7869m = new SparseArray();

    /* renamed from: r, reason: collision with root package name */
    public final HashSet f7874r = new HashSet();

    /* renamed from: s, reason: collision with root package name */
    public final HashSet f7875s = new HashSet();

    /* renamed from: n, reason: collision with root package name */
    public final SparseArray f7870n = new SparseArray();

    /* renamed from: k, reason: collision with root package name */
    public final SparseArray f7867k = new SparseArray();

    /* renamed from: l, reason: collision with root package name */
    public final SparseArray f7868l = new SparseArray();

    public k() {
        if (x0.e.f8527e == null) {
            x0.e.f8527e = new x0.e(8);
        }
        this.t = x0.e.f8527e;
    }

    public static void b(k kVar, A a2) {
        kVar.getClass();
        int i2 = a2.f1555b;
        if (i2 == 0 || i2 == 1) {
            return;
        }
        throw new IllegalStateException("Trying to create a view with unknown direction value: " + i2 + "(view id: " + a2.f1554a + ")");
    }

    @Override // io.flutter.plugin.platform.h
    public final void a() {
        this.f7864h.f7831a = null;
    }

    @Override // io.flutter.plugin.platform.h
    public final void c(io.flutter.view.h hVar) {
        this.f7864h.f7831a = hVar;
    }

    @Override // io.flutter.plugin.platform.h
    public final boolean d(int i2) {
        return this.f7865i.containsKey(Integer.valueOf(i2));
    }

    public final void e() {
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f7869m;
            if (i2 >= sparseArray.size()) {
                return;
            }
            b bVar = (b) sparseArray.valueAt(i2);
            bVar.c();
            bVar.f1429a.close();
            i2++;
        }
    }

    public final void f(boolean z2) {
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f7869m;
            if (i2 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i2);
            b bVar = (b) sparseArray.valueAt(i2);
            if (this.f7874r.contains(Integer.valueOf(keyAt))) {
                FlutterEngine flutterEngine = this.f7859c.f1464i;
                if (flutterEngine != null) {
                    bVar.a(flutterEngine.f7707b);
                }
                z2 &= bVar.e();
            } else {
                if (!this.f7872p) {
                    bVar.c();
                }
                bVar.setVisibility(8);
                this.f7859c.removeView(bVar);
            }
            i2++;
        }
        int i3 = 0;
        while (true) {
            SparseArray sparseArray2 = this.f7868l;
            if (i3 >= sparseArray2.size()) {
                return;
            }
            int keyAt2 = sparseArray2.keyAt(i3);
            View view = (View) sparseArray2.get(keyAt2);
            if (!this.f7875s.contains(Integer.valueOf(keyAt2)) || (!z2 && this.f7873q)) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
            i3++;
        }
    }

    @Override // io.flutter.plugin.platform.h
    public final void g(int i2) {
        if (d(i2)) {
            ((q) this.f7865i.get(Integer.valueOf(i2))).getClass();
        } else if (this.f7867k.get(i2) != null) {
            throw new ClassCastException();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.k] */
    public final void h() {
        if (!this.f7873q || this.f7872p) {
            return;
        }
        t tVar = this.f7859c;
        tVar.f1460e.b();
        C0077j c0077j = tVar.f1459d;
        if (c0077j == null) {
            C0077j c0077j2 = new C0077j(tVar.getContext(), tVar.getWidth(), tVar.getHeight(), 1);
            tVar.f1459d = c0077j2;
            tVar.addView(c0077j2);
        } else {
            c0077j.g(tVar.getWidth(), tVar.getHeight());
        }
        tVar.f1461f = tVar.f1460e;
        C0077j c0077j3 = tVar.f1459d;
        tVar.f1460e = c0077j3;
        FlutterEngine flutterEngine = tVar.f1464i;
        if (flutterEngine != null) {
            c0077j3.a(flutterEngine.f7707b);
        }
        this.f7872p = true;
    }

    public final int i(double d2) {
        return (int) Math.round(d2 * this.f7858b.getResources().getDisplayMetrics().density);
    }
}
