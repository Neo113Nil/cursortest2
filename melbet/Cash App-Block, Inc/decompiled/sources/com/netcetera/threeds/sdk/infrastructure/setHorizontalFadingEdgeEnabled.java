package com.netcetera.threeds.sdk.infrastructure;

import android.content.ContentResolver;
import android.provider.Settings;

/* loaded from: classes5.dex */
public class setHorizontalFadingEdgeEnabled extends setVerticalScrollBarEnabled {
    private static int ThreeDS2Service = 0;
    private static int getWarnings = 1;

    public setHorizontalFadingEdgeEnabled(ContentResolver contentResolver) {
        super(contentResolver);
    }

    public String ThreeDS2Service(String str) {
        System.identityHashCode(this);
        System.identityHashCode(this);
        String string2 = Settings.Secure.getString(m_(), str);
        int i = ThreeDS2Service;
        int i2 = i & 17;
        int i3 = i | 17;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        getWarnings = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 51 / 0;
        }
        return string2;
    }
}
