package io.flutter.view;

import android.view.accessibility.AccessibilityManager;

/* loaded from: classes.dex */
public final class d implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AccessibilityManager f2505a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f2506b;

    public d(h hVar, AccessibilityManager accessibilityManager) {
        this.f2506b = hVar;
        this.f2505a = accessibilityManager;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z2) {
        h hVar = this.f2506b;
        if (hVar.f2611t) {
            return;
        }
        boolean z3 = false;
        if (!z2) {
            hVar.i(false);
            g gVar = hVar.f2607o;
            if (gVar != null) {
                hVar.g(gVar.f2563b, 256);
                hVar.f2607o = null;
            }
        }
        A.j jVar = hVar.r;
        if (jVar != null) {
            boolean isEnabled = this.f2505a.isEnabled();
            c0.r rVar = (c0.r) jVar.f30f;
            if (rVar.f1747m.f1785b.f2381a.getIsSoftwareRenderingEnabled()) {
                rVar.setWillNotDraw(false);
                return;
            }
            if (!isEnabled && !z2) {
                z3 = true;
            }
            rVar.setWillNotDraw(z3);
        }
    }
}
