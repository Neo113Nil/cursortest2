package com.netcetera.threeds.sdk.infrastructure;

import android.widget.TextView;

/* loaded from: classes5.dex */
public class bl implements isEmpty {
    private static int ThreeDS2ServiceInstance = 0;
    private static int get = 1;

    @Override // com.netcetera.threeds.sdk.infrastructure.isEmpty
    public void aU_(TextView textView, String str) {
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 43;
        int i3 = i2 + ((i ^ 43) | i2);
        get = i3 % 128;
        if (i3 % 2 == 0) {
            textView.setText(str);
            throw null;
        }
        textView.setText(str);
        int i4 = get;
        ThreeDS2ServiceInstance = ((-2) - (((i4 & 68) + (i4 | 68)) ^ (-1))) % 128;
    }
}
