package io.flutter.view;

import android.hardware.display.DisplayManager;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class q implements DisplayManager.DisplayListener {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayManager f8009a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N1.l f8010b;

    public q(N1.l lVar, DisplayManager displayManager) {
        this.f8010b = lVar;
        this.f8009a = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i2) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i2) {
        if (i2 == 0) {
            float refreshRate = this.f8009a.getDisplay(0).getRefreshRate();
            N1.l lVar = this.f8010b;
            lVar.f1217a = (long) (1.0E9d / refreshRate);
            ((FlutterJNI) lVar.f1218b).setRefreshRateFPS(refreshRate);
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i2) {
    }
}
