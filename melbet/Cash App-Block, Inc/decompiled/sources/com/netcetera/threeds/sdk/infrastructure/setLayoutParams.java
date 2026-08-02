package com.netcetera.threeds.sdk.infrastructure;

import android.content.ContentResolver;
import android.provider.Settings;

/* loaded from: classes5.dex */
public class setLayoutParams extends setVerticalScrollBarEnabled {
    private static int ThreeDS2ServiceInstance = 1;
    private static int getWarnings;

    public setLayoutParams(ContentResolver contentResolver) {
        super(contentResolver);
    }

    public String initialize(String str) {
        int i = getWarnings;
        int i2 = i ^ 83;
        int i3 = (i & 83) << 1;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        ThreeDS2ServiceInstance = i4 % 128;
        int i5 = i4 % 2;
        String string2 = Settings.System.getString(m_(), str);
        if (i5 == 0) {
            int i6 = 31 / 0;
        }
        return string2;
    }
}
