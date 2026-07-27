package io.flutter.view;

import android.hardware.display.DisplayManager;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Objects;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: e, reason: collision with root package name */
    public static s f2623e;

    /* renamed from: f, reason: collision with root package name */
    public static q f2624f;

    /* renamed from: b, reason: collision with root package name */
    public final FlutterJNI f2626b;

    /* renamed from: a, reason: collision with root package name */
    public long f2625a = -1;

    /* renamed from: c, reason: collision with root package name */
    public r f2627c = new r(this, 0);

    /* renamed from: d, reason: collision with root package name */
    public final b f2628d = new b(this);

    public s(FlutterJNI flutterJNI) {
        this.f2626b = flutterJNI;
    }

    public static s a(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (f2623e == null) {
            f2623e = new s(flutterJNI);
        }
        if (f2624f == null) {
            s sVar = f2623e;
            Objects.requireNonNull(sVar);
            q qVar = new q(sVar, displayManager);
            f2624f = qVar;
            displayManager.registerDisplayListener(qVar, null);
        }
        if (f2623e.f2625a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            f2623e.f2625a = (long) (1.0E9d / refreshRate);
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return f2623e;
    }
}
