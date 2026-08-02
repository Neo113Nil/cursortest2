package com.netcetera.threeds.sdk.infrastructure;

import android.widget.LinearLayout;

/* loaded from: classes5.dex */
public final class eu {
    private static int ThreeDS2Service = 0;
    private static int getWarnings = 1;

    public static /* synthetic */ Object ThreeDS2Service(Object[] objArr, int i, int i2, int i3) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = es.get;
        getWarnings = (ThreeDS2Service + 59) % 128;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams bs_() {
        return (LinearLayout.LayoutParams) ThreeDS2Service(new Object[0], -691514327, 691514327, (int) System.currentTimeMillis());
    }
}
