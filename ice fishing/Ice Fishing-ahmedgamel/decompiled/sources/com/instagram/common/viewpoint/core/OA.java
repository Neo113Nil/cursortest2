package com.instagram.common.viewpoint.core;

import com.anythink.core.common.s.a.c;
import com.facebook.ads.AdSettings;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class OA {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 43);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-121, -122, c.f17103a, -109, 125, -126, -120, 121, 123, -122, 117, -120, 125, -125, -126, -109, 121, -122, -122, -125, -122, -109, -127, -125, 120, 121, -109, Byte.MAX_VALUE, 121, -115};
    }

    public static AdSettings.IntegrationErrorMode A00(C1860gi c1860gi) {
        AdSettings.IntegrationErrorMode integrationErrorMode = (AdSettings.IntegrationErrorMode) AdInternalSettings.sSettingsBundle.getSerializable(A01(0, 30, 9));
        if (integrationErrorMode == null) {
            integrationErrorMode = AdSettings.IntegrationErrorMode.INTEGRATION_ERROR_CRASH_DEBUG_MODE;
        }
        AdSettings.IntegrationErrorMode integrationErrorMode2 = AdSettings.IntegrationErrorMode.INTEGRATION_ERROR_CRASH_DEBUG_MODE;
        if (integrationErrorMode == integrationErrorMode2 && !A03(c1860gi)) {
            return AdSettings.IntegrationErrorMode.INTEGRATION_ERROR_CALLBACK_MODE;
        }
        return integrationErrorMode;
    }

    public static boolean A03(C1860gi c1860gi) {
        return (c1860gi.getApplicationInfo().flags & 2) != 0;
    }
}
