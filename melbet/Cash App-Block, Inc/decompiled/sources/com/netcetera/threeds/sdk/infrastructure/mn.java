package com.netcetera.threeds.sdk.infrastructure;

import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import com.netcetera.threeds.sdk.infrastructure.mq;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;

/* loaded from: classes5.dex */
class mn implements mg, mk {
    private static int get = 0;
    private static int getWarnings = 1;

    public static /* synthetic */ WindowInsets bI_(mq mqVar, mq mqVar2, mq mqVar3, mq mqVar4, View view, WindowInsets windowInsets) {
        return (WindowInsets) getWarnings(new Object[]{mqVar, mqVar2, mqVar3, mqVar4, view, windowInsets}, -1266620811, 1266620811, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
    
        r0 = com.netcetera.threeds.sdk.infrastructure.mn.get;
        r1 = r0 & 125;
        r0 = (r0 | 125) & (~r1);
        r1 = -(-(r1 << 1));
        r10 = ((r0 | r1) << 1) - (r0 ^ r1);
        com.netcetera.threeds.sdk.infrastructure.mn.getWarnings = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        if ((r10 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
    
        r0 = r13.getSystemWindowInsetLeft();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        r13.getSystemWindowInsetLeft();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0048, code lost:
    
        if (r1.get() == com.netcetera.threeds.sdk.infrastructure.mq.getWarnings.ThreeDS2ServiceInstance) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x003f, code lost:
    
        if (r1.get() == com.netcetera.threeds.sdk.infrastructure.mq.getWarnings.ThreeDS2ServiceInstance) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x006a, code lost:
    
        r0 = r1.initialize();
        r1 = com.netcetera.threeds.sdk.infrastructure.mn.get;
        r10 = (r1 | 53) << 1;
        r1 = -(r1 ^ 53);
        com.netcetera.threeds.sdk.infrastructure.mn.getWarnings = ((r10 & r1) + (r1 | r10)) % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object getWarnings(Object[] objArr) {
        int systemWindowInsetLeft;
        int initialize;
        int initialize2;
        int initialize3;
        int i;
        int i2;
        mq mqVar = (mq) objArr[0];
        mq mqVar2 = (mq) objArr[1];
        mq mqVar3 = (mq) objArr[2];
        mq mqVar4 = (mq) objArr[3];
        View view = (View) objArr[4];
        WindowInsets windowInsets = (WindowInsets) objArr[5];
        int i3 = getWarnings;
        int i4 = i3 & 91;
        int i5 = -(-((i3 ^ 91) | i4));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        get = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 70 / 0;
        }
        mq.getWarnings getwarnings = mqVar2.get();
        mq.getWarnings getwarnings2 = mq.getWarnings.ThreeDS2ServiceInstance;
        if (getwarnings == getwarnings2) {
            int i8 = get;
            int i9 = i8 & 65;
            int i10 = -(-((i8 ^ 65) | i9));
            getWarnings = (((i9 | i10) << 1) - (i10 ^ i9)) % 128;
            initialize = windowInsets.getSystemWindowInsetTop();
            int i11 = get;
            int i12 = i11 & 121;
            getWarnings = ((((i11 ^ 121) | i12) << 1) - ((i11 | 121) & (~i12))) % 128;
        } else {
            initialize = mqVar2.initialize();
            int i13 = getWarnings;
            int i14 = i13 ^ 39;
            int i15 = (i13 & 39) << 1;
            get = ((i14 & i15) + (i15 | i14)) % 128;
        }
        if (mqVar3.get() == getwarnings2) {
            int i16 = get;
            int i17 = i16 & 39;
            getWarnings = (i17 + ((i16 ^ 39) | i17)) % 128;
            initialize2 = windowInsets.getSystemWindowInsetRight();
            int i18 = get;
            getWarnings = ((i18 & 7) + (i18 | 7)) % 128;
        } else {
            initialize2 = mqVar3.initialize();
            int i19 = getWarnings;
            get = SVG$Unit$EnumUnboxingLocalUtility.m$1(i19 ^ 109, ~(-(-((i19 & 109) << 1))), 1, 128);
        }
        if (mqVar4.get() == getwarnings2) {
            int i20 = getWarnings;
            int i21 = i20 & 41;
            int i22 = -(-((i20 ^ 41) | i21));
            get = (((i21 | i22) << 1) - (i22 ^ i21)) % 128;
            initialize3 = windowInsets.getSystemWindowInsetBottom();
            int i23 = get;
            i = ((i23 ^ 119) | (i23 & 119)) << 1;
            i2 = -(((~i23) & 119) | (i23 & (-120)));
        } else {
            initialize3 = mqVar4.initialize();
            int i24 = get;
            i = i24 & 75;
            i2 = (i24 ^ 75) | i;
        }
        getWarnings = ((i ^ i2) + ((i2 & i) << 1)) % 128;
        view.setPadding(systemWindowInsetLeft, initialize, initialize2, initialize3);
        int i25 = get;
        int i26 = (i25 & 121) + (i25 | 121);
        getWarnings = i26 % 128;
        if (i26 % 2 != 0) {
            return windowInsets;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.mk
    public void bG_(Window window) {
        int i = getWarnings;
        int i2 = (i & (-86)) | ((~i) & 85);
        int i3 = -(-((i & 85) << 1));
        get = ((i2 & i3) + (i3 | i2)) % 128;
        window.getDecorView().setSystemUiVisibility(1792);
        int i4 = get;
        int i5 = (i4 & (-114)) | ((~i4) & 113);
        int i6 = -(-((i4 & 113) << 1));
        getWarnings = (((i5 | i6) << 1) - (i6 ^ i5)) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.mg
    public void getWarnings(View view, mq mqVar, mq mqVar2, mq mqVar3, mq mqVar4) {
        view.setOnApplyWindowInsetsListener(new mm(mqVar, mqVar2, mqVar3, mqVar4));
        int i = get + 113;
        getWarnings = i % 128;
        if (i % 2 == 0) {
            int i2 = 14 / 0;
        }
    }

    public static /* synthetic */ Object getWarnings(Object[] objArr, int i, int i2, int i3) {
        return getWarnings(objArr);
    }
}
