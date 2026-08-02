package org.freedesktop.gstreamer;

import android.content.Context;

/* loaded from: classes5.dex */
public abstract class GStreamer {
    public static void a(Context context) {
        nativeInit(context);
    }

    private static native void nativeInit(Context context) throws Exception;
}
