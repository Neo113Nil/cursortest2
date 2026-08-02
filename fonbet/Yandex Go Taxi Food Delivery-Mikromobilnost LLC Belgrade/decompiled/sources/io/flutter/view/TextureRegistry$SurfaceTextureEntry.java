package io.flutter.view;

import android.graphics.SurfaceTexture;
import defpackage.uuy0;
import defpackage.vuy0;

/* loaded from: classes4.dex */
public interface TextureRegistry$SurfaceTextureEntry {
    /* synthetic */ long id();

    /* synthetic */ void release();

    default void setOnFrameConsumedListener(uuy0 uuy0Var) {
    }

    default void setOnTrimMemoryListener(vuy0 vuy0Var) {
    }

    SurfaceTexture surfaceTexture();
}
