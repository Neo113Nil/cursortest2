package io.flutter.plugin.platform;

import L.Q;
import android.app.Activity;
import android.util.SparseArray;
import android.view.Surface;
import android.view.SurfaceControl;
import d0.C0120j;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.ArrayList;
import java.util.HashSet;
import l0.C0200c;

/* loaded from: classes.dex */
public final class j implements h {

    /* renamed from: f, reason: collision with root package name */
    public C0120j f2452f;

    /* renamed from: g, reason: collision with root package name */
    public Activity f2453g;

    /* renamed from: h, reason: collision with root package name */
    public c0.r f2454h;

    /* renamed from: j, reason: collision with root package name */
    public C0200c f2456j;

    /* renamed from: i, reason: collision with root package name */
    public FlutterJNI f2455i = null;

    /* renamed from: p, reason: collision with root package name */
    public Surface f2462p = null;

    /* renamed from: q, reason: collision with root package name */
    public SurfaceControl f2463q = null;
    public final HashSet r = new HashSet();

    /* renamed from: s, reason: collision with root package name */
    public final A.j f2464s = new A.j(27, this);

    /* renamed from: k, reason: collision with root package name */
    public final a f2457k = new a();

    /* renamed from: l, reason: collision with root package name */
    public final SparseArray f2458l = new SparseArray();

    /* renamed from: m, reason: collision with root package name */
    public final SparseArray f2459m = new SparseArray();

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f2460n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f2461o = new ArrayList();

    public j() {
        if (Q.f594i == null) {
            Q.f594i = new Q(8);
        }
    }

    @Override // io.flutter.plugin.platform.h
    public final void a() {
        this.f2457k.f2440a = null;
    }

    @Override // io.flutter.plugin.platform.h
    public final void d(io.flutter.view.h hVar) {
        this.f2457k.f2440a = hVar;
    }

    @Override // io.flutter.plugin.platform.h
    public final void f(int i2) {
        if (this.f2458l.get(i2) != null) {
            throw new ClassCastException();
        }
    }

    @Override // io.flutter.plugin.platform.h
    public final boolean g(int i2) {
        return false;
    }
}
