package com.netcetera.threeds.sdk.infrastructure;

import android.content.ContentResolver;
import android.provider.Settings;

/* loaded from: classes5.dex */
public class setVerticalFadingEdgeEnabled extends setVerticalScrollBarEnabled {
    private static int ThreeDS2Service = 0;
    private static int initialize = 1;

    public setVerticalFadingEdgeEnabled(ContentResolver contentResolver) {
        super(contentResolver);
    }

    public String ThreeDS2ServiceInstance(String str) {
        int i = initialize;
        ThreeDS2Service = (((i | 105) << 1) - (i ^ 105)) % 128;
        String string2 = Settings.Global.getString(m_(), str);
        int i2 = initialize + 87;
        ThreeDS2Service = i2 % 128;
        if (i2 % 2 == 0) {
            return string2;
        }
        throw null;
    }
}
