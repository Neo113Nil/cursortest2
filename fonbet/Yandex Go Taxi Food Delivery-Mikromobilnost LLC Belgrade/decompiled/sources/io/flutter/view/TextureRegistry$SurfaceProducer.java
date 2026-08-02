package io.flutter.view;

import android.view.Surface;
import defpackage.wuy0;

/* loaded from: classes4.dex */
public interface TextureRegistry$SurfaceProducer {
    Surface getForcedNewSurface();

    int getHeight();

    Surface getSurface();

    int getWidth();

    boolean handlesCropAndRotation();

    /* synthetic */ long id();

    /* synthetic */ void release();

    void scheduleFrame();

    void setCallback(wuy0 wuy0Var);

    void setSize(int i, int i2);
}
