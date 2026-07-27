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

    /* renamed from: e, reason: collision with root package name */
    public C0120j f2460e;

    /* renamed from: f, reason: collision with root package name */
    public Activity f2461f;

    /* renamed from: g, reason: collision with root package name */
    public c0.r f2462g;

    /* renamed from: i, reason: collision with root package name */
    public C0200c f2464i;

    /* renamed from: h, reason: collision with root package name */
    public FlutterJNI f2463h = null;

    /* renamed from: o, reason: collision with root package name */
    public Surface f2470o = null;

    /* renamed from: p, reason: collision with root package name */
    public SurfaceControl f2471p = null;

    /* renamed from: q, reason: collision with root package name */
    public final HashSet f2472q = new HashSet();
    public final A.j r = new A.j(27, this);

    /* renamed from: j, reason: collision with root package name */
    public final a f2465j = new a();

    /* renamed from: k, reason: collision with root package name */
    public final SparseArray f2466k = new SparseArray();

    /* renamed from: l, reason: collision with root package name */
    public final SparseArray f2467l = new SparseArray();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f2468m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f2469n = new ArrayList();

    public j() {
        if (Q.f516h == null) {
            Q.f516h = new Q(8);
        }
    }

    @Override // io.flutter.plugin.platform.h
    public final void a() {
        this.f2465j.f2448a = null;
    }

    @Override // io.flutter.plugin.platform.h
    public final void d(io.flutter.view.h hVar) {
        this.f2465j.f2448a = hVar;
    }

    @Override // io.flutter.plugin.platform.h
    public final void f(int i2) {
        if (this.f2466k.get(i2) != null) {
            throw new ClassCastException();
        }
    }

    @Override // io.flutter.plugin.platform.h
    public final boolean g(int i2) {
        return false;
    }
}
