package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.ImageFormat;
import android.view.View;
import com.netcetera.threeds.sdk.infrastructure.setMinEms;

/* loaded from: classes5.dex */
public class eo implements replace {
    private static int cleanup = 0;
    private static int getSDKInfo = 1;
    private final no ThreeDS2Service = (no) nu.initialize(new Object[]{eo.class}, -1889553984, 1889553984, (int) System.currentTimeMillis());
    private final replace getWarnings;
    private final putIfAbsent initialize;

    public eo(replace replaceVar, putIfAbsent putifabsent) {
        this.getWarnings = replaceVar;
        this.initialize = putifabsent;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.replace
    public void ThreeDS2Service(setMinEms.initialize initializeVar) {
        int i = cleanup + 25;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            View.MeasureSpec.getMode(1);
            ImageFormat.getBitsPerPixel(0);
            putIfAbsent putifabsent = this.initialize;
            new Object[1][1] = putifabsent;
            initializeVar.get(putifabsent);
        } else {
            View.MeasureSpec.getMode(0);
            ImageFormat.getBitsPerPixel(0);
            initializeVar.get(this.initialize);
        }
        this.getWarnings.ThreeDS2Service(initializeVar);
    }
}
