package io.flutter.embedding.engine.renderer;

import android.os.Handler;
import android.view.Surface;
import c0.C0105g;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f2373a;

    /* renamed from: b, reason: collision with root package name */
    public Surface f2374b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2375c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f2376d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f2377e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2378f;

    /* renamed from: g, reason: collision with root package name */
    public final C0105g f2379g;

    public h(FlutterJNI flutterJNI) {
        new AtomicLong(0L);
        this.f2375c = false;
        this.f2376d = new Handler();
        this.f2377e = new HashSet();
        this.f2378f = new ArrayList();
        C0105g c0105g = new C0105g(3, this);
        this.f2379g = c0105g;
        this.f2373a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(c0105g);
    }

    public final void a(i iVar) {
        this.f2373a.addIsDisplayingFlutterUiListener(iVar);
        if (this.f2375c) {
            iVar.a();
        }
    }

    public final void b(int i2) {
        Iterator it = this.f2377e.iterator();
        while (it.hasNext()) {
            o oVar = (o) ((WeakReference) it.next()).get();
            if (oVar != null) {
                oVar.onTrimMemory(i2);
            } else {
                it.remove();
            }
        }
    }

    public final void c(i iVar) {
        this.f2373a.removeIsDisplayingFlutterUiListener(iVar);
    }

    public final void d() {
        Iterator it = this.f2378f.iterator();
        while (it.hasNext()) {
            ((FlutterRenderer$ImageReaderSurfaceProducer) it.next()).getClass();
        }
    }

    public final void e() {
        if (this.f2374b != null) {
            this.f2373a.onSurfaceDestroyed();
            if (this.f2375c) {
                this.f2379g.b();
            }
            this.f2375c = false;
            this.f2374b = null;
        }
    }
}
