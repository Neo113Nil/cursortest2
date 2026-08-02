package com.netcetera.threeds.sdk.infrastructure;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

/* loaded from: classes5.dex */
public class rg {
    public static MessageDigest ThreeDS2ServiceInstance(String str) {
        return initialize(str, null);
    }

    public static MessageDigest initialize(String str, String str2) {
        try {
            return str2 == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, str2);
        } catch (NoSuchAlgorithmException unused) {
            throw new rt(Recorder$$ExternalSyntheticOutline2.m("Unable to get MessageDigest instance with ", str));
        } catch (NoSuchProviderException e) {
            throw new rt(CameraSelector$$ExternalSyntheticOutline0.m("Unable to get a MessageDigest implementation of algorithm name: ", str, " using provider ", str2), e);
        }
    }
}
