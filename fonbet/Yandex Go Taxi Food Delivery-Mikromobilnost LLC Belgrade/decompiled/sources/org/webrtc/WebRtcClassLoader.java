package org.webrtc;

import defpackage.kbs;

/* loaded from: classes4.dex */
class WebRtcClassLoader {
    public static Object getClassLoader() {
        ClassLoader classLoader = WebRtcClassLoader.class.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        kbs.g("Failed to get WebRTC class loader.");
        return null;
    }
}
