package io.flutter.view;

import android.view.accessibility.AccessibilityManager;

/* loaded from: classes.dex */
public final class d implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AccessibilityManager f2497a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f2498b;

    public d(h hVar, AccessibilityManager accessibilityManager) {
        this.f2498b = hVar;
        this.f2497a = accessibilityManager;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z2) {
        h hVar = this.f2498b;
        if (hVar.f2603t) {
            return;
        }
        boolean z3 = false;
        if (!z2) {
            hVar.i(false);
            g gVar = hVar.f2599o;
            if (gVar != null) {
                hVar.g(gVar.f2555b, 256);
                hVar.f2599o = null;
            }
        }
        A.j jVar = hVar.r;
        if (jVar != null) {
            boolean isEnabled = this.f2497a.isEnabled();
            c0.r rVar = (c0.r) jVar.f30g;
            if (rVar.f1740n.f1777b.f2373a.getIsSoftwareRenderingEnabled()) {
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
