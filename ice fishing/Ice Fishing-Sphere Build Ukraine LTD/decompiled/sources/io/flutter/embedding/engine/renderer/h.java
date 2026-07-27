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
    public final FlutterJNI f2381a;

    /* renamed from: b, reason: collision with root package name */
    public Surface f2382b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2383c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f2384d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f2385e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2386f;

    /* renamed from: g, reason: collision with root package name */
    public final C0105g f2387g;

    public h(FlutterJNI flutterJNI) {
        new AtomicLong(0L);
        this.f2383c = false;
        this.f2384d = new Handler();
        this.f2385e = new HashSet();
        this.f2386f = new ArrayList();
        C0105g c0105g = new C0105g(3, this);
        this.f2387g = c0105g;
        this.f2381a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(c0105g);
    }

    public final void a(i iVar) {
        this.f2381a.addIsDisplayingFlutterUiListener(iVar);
        if (this.f2383c) {
            iVar.a();
        }
    }

    public final void b(int i2) {
        Iterator it = this.f2385e.iterator();
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
        this.f2381a.removeIsDisplayingFlutterUiListener(iVar);
    }

    public final void d() {
        Iterator it = this.f2386f.iterator();
        while (it.hasNext()) {
            ((FlutterRenderer$ImageReaderSurfaceProducer) it.next()).getClass();
        }
    }

    public final void e() {
        if (this.f2382b != null) {
            this.f2381a.onSurfaceDestroyed();
            if (this.f2383c) {
                this.f2387g.b();
            }
            this.f2383c = false;
            this.f2382b = null;
        }
    }
}
