package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes5.dex */
class cm extends bv {
    private static int getWarnings = 1;
    private static int initialize;
    private final fo get;

    public cm(Context context, fo foVar) {
        super(context);
        this.get = foVar;
    }

    public static /* synthetic */ Object initialize(Object[] objArr, int i, int i2, int i3) {
        int i4 = (i2 * (-344)) + (i * (-344));
        int i5 = ~i;
        int i6 = ~i2;
        int i7 = i5 | i6;
        if (((~(i7 | i3)) * 345) + (((~(i | i6)) | (~(i5 | (~i3)))) * 345) + (((~i7) | (~(i5 | i3))) * 345) + i4 == 1) {
            return initialize(objArr);
        }
        ((cm) objArr[0]).ThreeDS2Service(new co((size) objArr[1]));
        int i8 = getWarnings;
        int i9 = (i8 & (-46)) | ((~i8) & 45);
        int i10 = (i8 & 45) << 1;
        initialize = ((i9 & i10) + (i10 | i9)) % 128;
        return null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.bv
    public final ViewGroup bl_(Context context) {
        return (ViewGroup) initialize(new Object[]{this, context}, -15957663, 15957664, System.identityHashCode(this));
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.bv
    public void getWarnings(Context context) {
        aw ThreeDS2Service = this.get.ThreeDS2Service(context);
        ThreeDS2Service.ThreeDS2Service(new cr(this));
        getWarnings(ThreeDS2Service);
        int i = initialize;
        int i2 = i & 27;
        int i3 = (i | 27) & (~i2);
        int i4 = i2 << 1;
        getWarnings = (((i3 | i4) << 1) - (i3 ^ i4)) % 128;
    }

    private static /* synthetic */ Object initialize(Object[] objArr) {
        FrameLayout frameLayout = new FrameLayout((Context) objArr[1]);
        int i = getWarnings;
        int i2 = i & 87;
        int i3 = (i ^ 87) | i2;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        initialize = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 42 / 0;
        }
        return frameLayout;
    }
}
