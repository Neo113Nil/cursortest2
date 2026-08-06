package io.flutter.embedding.engine.renderer;

import P0.C0073f;
import android.os.Handler;
import android.view.Surface;
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
    public final FlutterJNI f7767a;

    /* renamed from: b, reason: collision with root package name */
    public Surface f7768b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7769c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f7770d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f7771e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f7772f;

    /* renamed from: g, reason: collision with root package name */
    public final C0073f f7773g;

    public h(FlutterJNI flutterJNI) {
        new AtomicLong(0L);
        this.f7769c = false;
        this.f7770d = new Handler();
        this.f7771e = new HashSet();
        this.f7772f = new ArrayList();
        C0073f c0073f = new C0073f(3, this);
        this.f7773g = c0073f;
        this.f7767a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(c0073f);
    }

    public final void a(i iVar) {
        this.f7767a.addIsDisplayingFlutterUiListener(iVar);
        if (this.f7769c) {
            iVar.b();
        }
    }

    public final void b(int i2) {
        Iterator it = this.f7771e.iterator();
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
        this.f7767a.removeIsDisplayingFlutterUiListener(iVar);
    }

    public final void d() {
        Iterator it = this.f7772f.iterator();
        while (it.hasNext()) {
            ((FlutterRenderer$ImageReaderSurfaceProducer) it.next()).getClass();
        }
    }

    public final void e() {
        if (this.f7768b != null) {
            this.f7767a.onSurfaceDestroyed();
            if (this.f7769c) {
                this.f7773g.a();
            }
            this.f7769c = false;
            this.f7768b = null;
        }
    }
}
