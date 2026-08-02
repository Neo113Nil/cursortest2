package com.google.android.filament;

import android.opengl.EGL14;
import android.view.Surface;

/* loaded from: classes.dex */
public final class AndroidPlatform extends Platform {
    public static final /* synthetic */ int $r8$clinit = 0;

    static {
        EGL14.eglGetDisplay(0);
    }

    @Override // com.google.android.filament.Platform
    public final boolean validateSurface(Object obj) {
        return obj instanceof Surface;
    }
}
