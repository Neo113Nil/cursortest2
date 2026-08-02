package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

/* loaded from: classes5.dex */
public class ap extends stringPropertyNames {
    private static int ThreeDS2ServiceInstance = 0;
    private static int getWarnings = 1;

    public ap(Context context, loadFromXML loadfromxml, loadFromXML loadfromxml2) {
        super(context, loadfromxml, loadfromxml2);
    }

    public void ThreeDS2Service(boolean z) {
        int i;
        int i2 = getWarnings;
        int i3 = i2 & 31;
        int i4 = -(-((i2 ^ 31) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        ThreeDS2ServiceInstance = i6;
        if (i5 % 2 != 0) {
            throw null;
        }
        if (z) {
            getWarnings = ((i6 & 95) + (i6 | 95)) % 128;
            i = 0;
        } else {
            int i7 = i6 ^ 119;
            int i8 = -(-((i6 & 119) << 1));
            getWarnings = ((i7 & i8) + (i7 | i8)) % 128;
            i = 8;
        }
        ThreeDS2Service().getChildAt(1).setVisibility(i);
        int i9 = getWarnings;
        ThreeDS2ServiceInstance = ((i9 ^ 81) + ((i9 & 81) << 1)) % 128;
    }

    public void ThreeDS2ServiceInstance(boolean z) {
        int i;
        int i2 = ThreeDS2ServiceInstance;
        int i3 = i2 & 101;
        getWarnings = (i3 + ((i2 ^ 101) | i3)) % 128;
        if (z) {
            getWarnings = ((((i2 ^ 91) | (i2 & 91)) << 1) - (((~i2) & 91) | (i2 & (-92)))) % 128;
            i = 0;
        } else {
            int i4 = i2 ^ 49;
            int i5 = (i2 & 49) << 1;
            getWarnings = ((i4 & i5) + (i4 | i5)) % 128;
            i = 8;
        }
        ThreeDS2Service().getChildAt(0).setVisibility(i);
        int i6 = getWarnings;
        ThreeDS2ServiceInstance = ((i6 ^ 57) + ((i6 & 57) << 1)) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.stringPropertyNames
    public LinearLayout aV_(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(0);
        int i = getWarnings;
        int i2 = i & 71;
        int i3 = -(-((i ^ 71) | i2));
        ThreeDS2ServiceInstance = ((i2 & i3) + (i3 | i2)) % 128;
        return linearLayout;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.stringPropertyNames
    public LinearLayout aW_(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 1.0f;
        linearLayout.setLayoutParams(layoutParams);
        int i = getWarnings;
        int i2 = ((i | 109) << 1) - (((~i) & 109) | (i & (-110)));
        ThreeDS2ServiceInstance = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 73 / 0;
        }
        return linearLayout;
    }

    public boolean getWarnings() {
        int i = getWarnings;
        int i2 = i & 101;
        int i3 = (i2 - (~(-(-((i ^ 101) | i2))))) - 1;
        ThreeDS2ServiceInstance = i3 % 128;
        int i4 = i3 % 2;
        loadFromXML<View> loadfromxml = ((stringPropertyNames) this).ThreeDS2Service;
        if (i4 == 0) {
            return ThreeDS2ServiceInstance(loadfromxml);
        }
        ThreeDS2ServiceInstance(loadfromxml);
        throw null;
    }

    public boolean ThreeDS2ServiceInstance() {
        int i = ThreeDS2ServiceInstance;
        getWarnings = ((i ^ 45) + ((i & 45) << 1)) % 128;
        boolean ThreeDS2ServiceInstance2 = ThreeDS2ServiceInstance(this.get);
        int i2 = ThreeDS2ServiceInstance;
        int i3 = (i2 ^ 53) + ((i2 & 53) << 1);
        getWarnings = i3 % 128;
        if (i3 % 2 != 0) {
            return ThreeDS2ServiceInstance2;
        }
        throw null;
    }
}
