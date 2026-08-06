package io.flutter.view;

import P0.t;
import android.view.accessibility.AccessibilityManager;

/* loaded from: classes.dex */
public final class d implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AccessibilityManager f7889a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f7890b;

    public d(h hVar, AccessibilityManager accessibilityManager) {
        this.f7890b = hVar;
        this.f7889a = accessibilityManager;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z2) {
        h hVar = this.f7890b;
        if (hVar.t) {
            return;
        }
        boolean z3 = false;
        if (!z2) {
            hVar.i(false);
            g gVar = hVar.f7989o;
            if (gVar != null) {
                hVar.g(gVar.f7947b, 256);
                hVar.f7989o = null;
            }
        }
        C.j jVar = hVar.f7992r;
        if (jVar != null) {
            boolean isEnabled = this.f7889a.isEnabled();
            t tVar = (t) jVar.f124b;
            if (tVar.f1464i.f7707b.f7767a.getIsSoftwareRenderingEnabled()) {
                tVar.setWillNotDraw(false);
                return;
            }
            if (!isEnabled && !z2) {
                z3 = true;
            }
            tVar.setWillNotDraw(z3);
        }
    }
}
