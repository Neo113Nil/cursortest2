package io.flutter.view;

import android.hardware.display.DisplayManager;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Objects;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: e, reason: collision with root package name */
    public static s f2631e;

    /* renamed from: f, reason: collision with root package name */
    public static q f2632f;

    /* renamed from: b, reason: collision with root package name */
    public final FlutterJNI f2634b;

    /* renamed from: a, reason: collision with root package name */
    public long f2633a = -1;

    /* renamed from: c, reason: collision with root package name */
    public r f2635c = new r(this, 0);

    /* renamed from: d, reason: collision with root package name */
    public final b f2636d = new b(this);

    public s(FlutterJNI flutterJNI) {
        this.f2634b = flutterJNI;
    }

    public static s a(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (f2631e == null) {
            f2631e = new s(flutterJNI);
        }
        if (f2632f == null) {
            s sVar = f2631e;
            Objects.requireNonNull(sVar);
            q qVar = new q(sVar, displayManager);
            f2632f = qVar;
            displayManager.registerDisplayListener(qVar, null);
        }
        if (f2631e.f2633a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            f2631e.f2633a = (long) (1.0E9d / refreshRate);
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return f2631e;
    }
}
