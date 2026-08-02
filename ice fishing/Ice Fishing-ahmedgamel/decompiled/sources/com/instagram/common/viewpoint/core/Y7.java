package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.media.AudioManager;
import java.util.Arrays;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class Y7 {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 5);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{100, 92, 111, 123, 106, 103, 97, 121, 109, 108, 119, 104, 116, 121, 97, 7, 0, 2, 7, 0, 11};
    }

    public static float A00(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService(A01(2, 5, 11));
        if (audioManager != null) {
            int streamVolume = audioManager.getStreamVolume(3);
            int volume = audioManager.getStreamMaxVolume(3);
            if (volume > 0) {
                return (streamVolume * 1.0f) / volume;
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public static void A03(Map<String, String> map, boolean z6, boolean z9) {
        String A01 = A01(1, 1, 104);
        String A012 = A01(0, 1, 81);
        map.put(A01(7, 8, 29), z6 ? A01 : A012);
        if (!z9) {
            A01 = A012;
        }
        map.put(A01(15, 6, 107), A01);
    }
}
