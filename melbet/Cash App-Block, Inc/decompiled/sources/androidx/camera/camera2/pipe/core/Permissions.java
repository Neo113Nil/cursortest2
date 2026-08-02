package androidx.camera.camera2.pipe.core;

import android.content.Context;

/* loaded from: classes3.dex */
public final class Permissions {
    public volatile boolean _hasCameraPermission;
    public final Context cameraPipeContext;

    public Permissions(Context context) {
        this.cameraPipeContext = context;
    }
}
