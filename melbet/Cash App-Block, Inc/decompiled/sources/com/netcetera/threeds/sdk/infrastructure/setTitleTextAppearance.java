package com.netcetera.threeds.sdk.infrastructure;

import android.util.Base64;
import java.nio.charset.Charset;

/* loaded from: classes5.dex */
class setTitleTextAppearance implements setSubtitle<String, String> {
    private static int ThreeDS2Service = 0;
    private static int getWarnings = 1;

    @Override // com.netcetera.threeds.sdk.infrastructure.setSubtitle
    public /* synthetic */ String ThreeDS2ServiceInstance(String str) {
        int i = getWarnings;
        int i2 = (i ^ 59) + ((i & 59) << 1);
        ThreeDS2Service = i2 % 128;
        String str2 = str;
        if (i2 % 2 == 0) {
            return initialize(str2);
        }
        initialize(str2);
        throw null;
    }

    public String initialize(String str) {
        String str2 = new String(Base64.decode(((String) oj.getWarnings(str, "")).getBytes(Charset.defaultCharset()), 8), Charset.defaultCharset());
        int i = ThreeDS2Service;
        int i2 = i & 63;
        int i3 = (i ^ 63) | i2;
        getWarnings = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        return str2;
    }
}
