package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes5.dex */
public class be extends loadFromXML<View> implements elements {
    private static int get = 1;
    private static int getWarnings;
    private boolean ThreeDS2Service;
    private final getProperty ThreeDS2ServiceInstance;

    public be(getProperty getproperty, Context context) {
        super(context);
        this.ThreeDS2ServiceInstance = getproperty;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.writeReplace
    public void ThreeDS2Service(setScroller setscroller) {
        int i = get;
        int i2 = i & 89;
        int i3 = i2 + ((i ^ 89) | i2);
        getWarnings = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 33 / 0;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.loadFromXML
    public View ThreeDS2ServiceInstance(Context context) {
        View view = new View(context);
        view.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
        view.setVisibility(8);
        int i = getWarnings;
        int i2 = i & 75;
        int i3 = (((i ^ 75) | i2) << 1) - ((i | 75) & (~i2));
        get = i3 % 128;
        if (i3 % 2 != 0) {
            return view;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.elements
    public void getWarnings(keys keysVar) {
        int i = getWarnings + 119;
        get = i % 128;
        int i2 = i % 2;
        boolean z = this.ThreeDS2Service;
        if (i2 == 0) {
            throw null;
        }
        if (z) {
            this.ThreeDS2ServiceInstance.get(keysVar);
            int i3 = get;
            int i4 = i3 & 117;
            int i5 = -(-(i3 | 117));
            getWarnings = (((i4 | i5) << 1) - (i5 ^ i4)) % 128;
        }
        int i6 = get;
        int i7 = i6 & 47;
        int i8 = (i6 ^ 47) | i7;
        getWarnings = (((i7 | i8) << 1) - (i8 ^ i7)) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.elements
    public void getWarnings() {
        int i = get;
        int i2 = (i ^ 59) + ((i & 59) << 1);
        getWarnings = i2 % 128;
        if (i2 % 2 != 0) {
            this.ThreeDS2Service = false;
        } else {
            this.ThreeDS2Service = true;
        }
    }
}
