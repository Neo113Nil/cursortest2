package io.flutter.view;

import L.C0026b;
import android.view.accessibility.AccessibilityManager;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class c implements AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f2504a;

    public c(h hVar) {
        this.f2504a = hVar;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z2) {
        h hVar = this.f2504a;
        if (hVar.f2611t) {
            return;
        }
        boolean z3 = false;
        C0026b c0026b = hVar.f2594b;
        if (z2) {
            ((FlutterJNI) c0026b.f524f).setSemanticsEnabled(true);
        } else {
            hVar.i(false);
            ((FlutterJNI) c0026b.f524f).setSemanticsEnabled(false);
        }
        A.j jVar = hVar.r;
        if (jVar != null) {
            boolean isTouchExplorationEnabled = hVar.f2595c.isTouchExplorationEnabled();
            c0.r rVar = (c0.r) jVar.f30f;
            if (rVar.f1747m.f1785b.f2381a.getIsSoftwareRenderingEnabled()) {
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
