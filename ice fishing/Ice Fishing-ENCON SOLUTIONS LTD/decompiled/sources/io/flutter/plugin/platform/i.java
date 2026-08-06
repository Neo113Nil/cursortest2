package io.flutter.plugin.platform;

import android.view.Surface;
import android.view.SurfaceControl;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract /* synthetic */ class i {
    public static /* synthetic */ Surface b(SurfaceControl surfaceControl) {
        return new Surface(surfaceControl);
    }

    public static /* synthetic */ SurfaceControl.Builder c() {
        return new SurfaceControl.Builder();
    }

    public static /* synthetic */ SurfaceControl.Transaction d() {
        return new SurfaceControl.Transaction();
    }

    public static /* synthetic */ WindowInsets.Builder g() {
        return new WindowInsets.Builder();
    }
}
