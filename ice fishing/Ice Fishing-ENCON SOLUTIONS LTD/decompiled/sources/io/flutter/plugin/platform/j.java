package io.flutter.plugin.platform;

import P0.t;
import android.app.Activity;
import android.util.SparseArray;
import android.view.Surface;
import android.view.SurfaceControl;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class j implements h {

    /* renamed from: a, reason: collision with root package name */
    public Q0.i f7843a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f7844b;

    /* renamed from: c, reason: collision with root package name */
    public t f7845c;

    /* renamed from: e, reason: collision with root package name */
    public Z0.i f7847e;

    /* renamed from: d, reason: collision with root package name */
    public FlutterJNI f7846d = null;

    /* renamed from: k, reason: collision with root package name */
    public Surface f7853k = null;

    /* renamed from: l, reason: collision with root package name */
    public SurfaceControl f7854l = null;

    /* renamed from: m, reason: collision with root package name */
    public final HashSet f7855m = new HashSet();

    /* renamed from: n, reason: collision with root package name */
    public final Z0.i f7856n = new Z0.i(24, this);

    /* renamed from: f, reason: collision with root package name */
    public final a f7848f = new a();

    /* renamed from: g, reason: collision with root package name */
    public final SparseArray f7849g = new SparseArray();

    /* renamed from: h, reason: collision with root package name */
    public final SparseArray f7850h = new SparseArray();

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f7851i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f7852j = new ArrayList();

    public j() {
        if (x0.e.f8527e == null) {
            x0.e.f8527e = new x0.e(8);
        }
    }

    @Override // io.flutter.plugin.platform.h
    public final void a() {
        this.f7848f.f7831a = null;
    }

    @Override // io.flutter.plugin.platform.h
    public final void c(io.flutter.view.h hVar) {
        this.f7848f.f7831a = hVar;
    }

    @Override // io.flutter.plugin.platform.h
    public final boolean d(int i2) {
        return false;
    }

    @Override // io.flutter.plugin.platform.h
    public final void g(int i2) {
        if (this.f7849g.get(i2) != null) {
            throw new ClassCastException();
        }
    }
}
