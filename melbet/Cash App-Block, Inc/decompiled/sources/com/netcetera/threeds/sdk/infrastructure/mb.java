package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

/* loaded from: classes5.dex */
public class mb extends LinearLayout {
    private static int ThreeDS2ServiceInstance = 1;
    private static int get;
    private final int ThreeDS2Service;

    public mb(Context context, int i) {
        super(context);
        this.ThreeDS2Service = i;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = ThreeDS2ServiceInstance;
        int i4 = i3 ^ 103;
        int i5 = ((i3 & 103) | i4) << 1;
        int i6 = -i4;
        get = ((i5 ^ i6) + ((i5 & i6) << 1)) % 128;
        if (this.ThreeDS2Service < View.MeasureSpec.getSize(i)) {
            int i7 = ThreeDS2ServiceInstance;
            int i8 = i7 & 3;
            int i9 = -(-((i7 ^ 3) | i8));
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            get = i10 % 128;
            if (i10 % 2 != 0) {
                View.MeasureSpec.makeMeasureSpec(this.ThreeDS2Service, View.MeasureSpec.getMode(i));
                throw null;
            }
            i = View.MeasureSpec.makeMeasureSpec(this.ThreeDS2Service, View.MeasureSpec.getMode(i));
            int i11 = ThreeDS2ServiceInstance;
            get = (((i11 | 91) << 1) - (((~i11) & 91) | (i11 & (-92)))) % 128;
        }
        super.onMeasure(i, i2);
        int i12 = ThreeDS2ServiceInstance;
        int i13 = (i12 & 27) + (i12 | 27);
        get = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }
}
