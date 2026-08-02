package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* loaded from: classes5.dex */
public class bf extends ac {
    private static int ThreeDS2Service = 0;
    private static int ThreeDS2ServiceInstance = 1;

    public bf(Context context) {
        super(context);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.ac
    public Drawable aG_() {
        int i = ThreeDS2ServiceInstance;
        int i2 = i + 115;
        ThreeDS2Service = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        ThreeDS2Service = ((i & 57) + (i | 57)) % 128;
        return null;
    }
}
