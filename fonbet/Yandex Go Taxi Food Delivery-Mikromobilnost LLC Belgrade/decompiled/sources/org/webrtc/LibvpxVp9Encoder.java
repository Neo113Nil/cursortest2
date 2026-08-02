package org.webrtc;

import java.util.List;

/* loaded from: classes4.dex */
public class LibvpxVp9Encoder extends WrappedNativeVideoEncoder {
    public static native long nativeCreate(long j);

    public static native List<String> nativeGetSupportedScalabilityModes();

    public static native boolean nativeIsSupported();

    public static List<String> scalabilityModes() {
        return nativeGetSupportedScalabilityModes();
    }

    @Override // org.webrtc.WrappedNativeVideoEncoder, org.webrtc.VideoEncoder
    public long createNative(long j) {
        return nativeCreate(j);
    }

    @Override // org.webrtc.WrappedNativeVideoEncoder, org.webrtc.VideoEncoder
    public boolean isHardwareEncoder() {
        return false;
    }
}
