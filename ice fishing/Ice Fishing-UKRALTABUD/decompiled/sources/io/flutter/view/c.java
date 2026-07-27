package io.flutter.view;

import L.C0051b;
import android.view.accessibility.AccessibilityManager;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class c implements AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f2496a;

    public c(h hVar) {
        this.f2496a = hVar;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z2) {
        h hVar = this.f2496a;
        if (hVar.f2603t) {
            return;
        }
        boolean z3 = false;
        C0051b c0051b = hVar.f2586b;
        if (z2) {
            ((FlutterJNI) c0051b.f602g).setSemanticsEnabled(true);
        } else {
            hVar.i(false);
            ((FlutterJNI) c0051b.f602g).setSemanticsEnabled(false);
        }
        A.j jVar = hVar.r;
        if (jVar != null) {
            boolean isTouchExplorationEnabled = hVar.f2587c.isTouchExplorationEnabled();
            c0.r rVar = (c0.r) jVar.f30g;
            if (rVar.f1740n.f1777b.f2373a.getIsSoftwareRenderingEnabled()) {
                rVar.setWillNotDraw(false);
                return;
            }
            if (!z2 && !isTouchExplorationEnabled) {
                z3 = true;
            }
            rVar.setWillNotDraw(z3);
        }
    }
}
