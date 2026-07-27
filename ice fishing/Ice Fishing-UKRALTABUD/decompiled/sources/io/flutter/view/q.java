package io.flutter.view;

import android.hardware.display.DisplayManager;

/* loaded from: classes.dex */
public final class q implements DisplayManager.DisplayListener {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayManager f2619a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f2620b;

    public q(s sVar, DisplayManager displayManager) {
        this.f2620b = sVar;
        this.f2619a = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i2) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i2) {
        if (i2 == 0) {
            float refreshRate = this.f2619a.getDisplay(0).getRefreshRate();
            s sVar = this.f2620b;
            sVar.f2625a = (long) (1.0E9d / refreshRate);
            sVar.f2626b.setRefreshRateFPS(refreshRate);
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i2) {
    }
}
