package io.flutter.view;

import P0.t;
import android.view.accessibility.AccessibilityManager;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class c implements AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f7888a;

    public c(h hVar) {
        this.f7888a = hVar;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z2) {
        h hVar = this.f7888a;
        if (hVar.t) {
            return;
        }
        boolean z3 = false;
        I0.b bVar = hVar.f7976b;
        if (z2) {
            ((FlutterJNI) bVar.f722c).setSemanticsEnabled(true);
        } else {
            hVar.i(false);
            ((FlutterJNI) bVar.f722c).setSemanticsEnabled(false);
        }
        C.j jVar = hVar.f7992r;
        if (jVar != null) {
            boolean isTouchExplorationEnabled = hVar.f7977c.isTouchExplorationEnabled();
            t tVar = (t) jVar.f124b;
            if (tVar.f1464i.f7707b.f7767a.getIsSoftwareRenderingEnabled()) {
                tVar.setWillNotDraw(false);
                return;
            }
            if (!z2 && !isTouchExplorationEnabled) {
                z3 = true;
            }
            tVar.setWillNotDraw(z3);
        }
    }
}
