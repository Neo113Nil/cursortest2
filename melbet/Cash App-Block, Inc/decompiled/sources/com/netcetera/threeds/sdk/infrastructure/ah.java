package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

/* loaded from: classes5.dex */
public class ah extends loadFromXML<View> {
    private static final int getWarnings = ((Integer) nj.ThreeDS2Service(new Object[]{32}, 256526108, -256526107, 32)).intValue();
    private static int ThreeDS2Service = 0;
    private static int ThreeDS2ServiceInstance = (ThreeDS2Service + 3) % 128;

    public ah(Context context) {
        super(context);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.writeReplace
    public void ThreeDS2Service(setScroller setscroller) {
        int i = ThreeDS2ServiceInstance;
        ThreeDS2Service = (((i & (-88)) | ((~i) & 87)) + ((i & 87) << 1)) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.loadFromXML
    public View ThreeDS2ServiceInstance(Context context) {
        View view = new View(context);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, getWarnings));
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 19;
        int i3 = i2 + ((i ^ 19) | i2);
        ThreeDS2Service = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 32 / 0;
        }
        return view;
    }
}
