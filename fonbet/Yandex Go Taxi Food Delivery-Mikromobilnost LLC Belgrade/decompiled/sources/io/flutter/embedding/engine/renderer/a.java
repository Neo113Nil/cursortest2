package io.flutter.embedding.engine.renderer;

import androidx.lifecycle.DefaultLifecycleObserver;
import defpackage.pey;
import defpackage.wuy0;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class a implements DefaultLifecycleObserver {
    public final /* synthetic */ f a;

    public a(f fVar) {
        this.a = fVar;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(pey peyVar) {
        wuy0 wuy0Var;
        boolean z;
        wuy0 wuy0Var2;
        Iterator it = this.a.g.iterator();
        while (it.hasNext()) {
            FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer = (FlutterRenderer$ImageReaderSurfaceProducer) it.next();
            wuy0Var = flutterRenderer$ImageReaderSurfaceProducer.callback;
            if (wuy0Var != null) {
                z = flutterRenderer$ImageReaderSurfaceProducer.notifiedDestroy;
                if (z) {
                    flutterRenderer$ImageReaderSurfaceProducer.notifiedDestroy = false;
                    wuy0Var2 = flutterRenderer$ImageReaderSurfaceProducer.callback;
                    wuy0Var2.onSurfaceAvailable();
                }
            }
        }
    }
}
