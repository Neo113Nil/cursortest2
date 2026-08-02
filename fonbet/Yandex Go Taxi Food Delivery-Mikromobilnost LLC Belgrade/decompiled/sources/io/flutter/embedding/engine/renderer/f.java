package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import androidx.lifecycle.y;
import defpackage.jrr;
import defpackage.vuy0;
import defpackage.wsr;
import defpackage.xuy0;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry$SurfaceLifecycle;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public final class f implements xuy0 {
    public final FlutterJNI a;
    public Surface c;
    public final jrr h;
    public final AtomicLong b = new AtomicLong(0);
    public boolean d = false;
    public final Handler e = new Handler();
    public final HashSet f = new HashSet();
    public final ArrayList g = new ArrayList();

    public f(FlutterJNI flutterJNI) {
        jrr jrrVar = new jrr(1, this);
        this.h = jrrVar;
        this.a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(jrrVar);
        y.A.y.a(new a(this));
    }

    public final void a(vuy0 vuy0Var) {
        HashSet hashSet = this.f;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((vuy0) ((WeakReference) it.next()).get()) == null) {
                it.remove();
            }
        }
        hashSet.add(new WeakReference(vuy0Var));
    }

    public final TextureRegistry$SurfaceProducer b(TextureRegistry$SurfaceLifecycle textureRegistry$SurfaceLifecycle) {
        long andIncrement = this.b.getAndIncrement();
        FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer = new FlutterRenderer$ImageReaderSurfaceProducer(this, andIncrement);
        boolean z = textureRegistry$SurfaceLifecycle == TextureRegistry$SurfaceLifecycle.resetInBackground;
        this.a.registerImageTexture(andIncrement, flutterRenderer$ImageReaderSurfaceProducer, z);
        if (z) {
            a(flutterRenderer$ImageReaderSurfaceProducer);
        }
        this.g.add(flutterRenderer$ImageReaderSurfaceProducer);
        return flutterRenderer$ImageReaderSurfaceProducer;
    }

    public final wsr c() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        long andIncrement = this.b.getAndIncrement();
        surfaceTexture.detachFromGLContext();
        wsr wsrVar = new wsr(this, andIncrement, surfaceTexture);
        this.a.registerTexture(wsrVar.a, wsrVar.b);
        a(wsrVar);
        return wsrVar;
    }

    public final void d(int i) {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            vuy0 vuy0Var = (vuy0) ((WeakReference) it.next()).get();
            if (vuy0Var != null) {
                vuy0Var.onTrimMemory(i);
            } else {
                it.remove();
            }
        }
    }

    public final void e(vuy0 vuy0Var) {
        HashSet hashSet = this.f;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == vuy0Var) {
                hashSet.remove(weakReference);
                return;
            }
        }
    }

    public final void f() {
        if (this.c != null) {
            this.a.onSurfaceDestroyed();
            if (this.d) {
                this.h.onFlutterUiNoLongerDisplayed();
            }
            this.d = false;
            this.c = null;
        }
    }
}
