package com.netcetera.threeds.sdk.infrastructure;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import javax.crypto.Mac;

/* loaded from: classes5.dex */
public class rq {
    public static void ThreeDS2Service(Mac mac, Key key) {
        try {
            mac.init(key);
        } catch (InvalidKeyException e) {
            throw new rn("Key is not valid for " + mac.getAlgorithm(), e);
        }
    }

    public static Mac get(String str, String str2) {
        try {
            return str2 == null ? Mac.getInstance(str) : Mac.getInstance(str, str2);
        } catch (NoSuchAlgorithmException e) {
            throw new ro(Recorder$$ExternalSyntheticOutline2.m("Unable to get a MAC implementation of algorithm name: ", str), e);
        } catch (NoSuchProviderException e2) {
            throw new ro(CameraSelector$$ExternalSyntheticOutline0.m("Unable to get a MAC implementation of algorithm name: ", str, " using provider ", str2), e2);
        }
    }

    public static Mac ThreeDS2Service(String str, Key key, String str2) {
        Mac mac = get(str, str2);
        ThreeDS2Service(mac, key);
        return mac;
    }
}
