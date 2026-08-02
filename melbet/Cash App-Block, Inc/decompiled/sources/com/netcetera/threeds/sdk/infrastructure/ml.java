package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Insets;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.netcetera.threeds.sdk.infrastructure.mq;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;

/* loaded from: classes5.dex */
class ml implements mg, mk {
    private static int ThreeDS2ServiceInstance = 1;
    private static int initialize;

    public static /* synthetic */ WindowInsets bF_(mq mqVar, mq mqVar2, mq mqVar3, mq mqVar4, View view, WindowInsets windowInsets) {
        return (WindowInsets) initialize(new Object[]{mqVar, mqVar2, mqVar3, mqVar4, view, windowInsets}, -386930910, 386930910, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object initialize(Object[] objArr, int i, int i2, int i3) {
        int initialize2;
        int initialize3;
        int initialize4;
        int initialize5;
        int i4;
        mq mqVar = (mq) objArr[0];
        mq mqVar2 = (mq) objArr[1];
        mq mqVar3 = (mq) objArr[2];
        mq mqVar4 = (mq) objArr[3];
        View view = (View) objArr[4];
        WindowInsets windowInsets = (WindowInsets) objArr[5];
        ThreeDS2ServiceInstance = (initialize + 61) % 128;
        Insets insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.systemBars());
        mq.getWarnings getwarnings = mqVar.get();
        mq.getWarnings getwarnings2 = mq.getWarnings.ThreeDS2ServiceInstance;
        if (getwarnings == getwarnings2) {
            int i5 = initialize;
            int i6 = (i5 & (-20)) | ((~i5) & 19);
            int i7 = (i5 & 19) << 1;
            int i8 = ((i6 ^ i7) + ((i7 & i6) << 1)) % 128;
            ThreeDS2ServiceInstance = i8;
            initialize2 = insetsIgnoringVisibility.left;
            initialize = Thread$State$EnumUnboxingLocalUtility.m(i8 ^ 100, (i8 & 100) << 1, 1, 128);
        } else {
            initialize2 = mqVar.initialize();
            int i9 = ThreeDS2ServiceInstance;
            initialize = ((i9 & 45) + (i9 | 45)) % 128;
        }
        if (mqVar2.get() == getwarnings2) {
            int i10 = initialize;
            int i11 = i10 ^ 85;
            int i12 = ((((i10 & 85) | i11) << 1) - i11) % 128;
            ThreeDS2ServiceInstance = i12;
            initialize3 = insetsIgnoringVisibility.top;
            initialize = (i12 + 101) % 128;
        } else {
            initialize3 = mqVar2.initialize();
            int i13 = ThreeDS2ServiceInstance;
            initialize = ((i13 ^ 53) + ((i13 & 53) << 1)) % 128;
        }
        if (mqVar3.get() == getwarnings2) {
            int i14 = ThreeDS2ServiceInstance;
            int i15 = i14 ^ 3;
            int i16 = ((i14 & 3) | i15) << 1;
            int i17 = -i15;
            initialize = ((i16 & i17) + (i17 | i16)) % 128;
            initialize4 = insetsIgnoringVisibility.right;
            initialize = (((i14 | 9) << 1) - (i14 ^ 9)) % 128;
        } else {
            initialize4 = mqVar3.initialize();
            int i18 = initialize;
            int i19 = i18 & 13;
            ThreeDS2ServiceInstance = SVG$Unit$EnumUnboxingLocalUtility.m$1(i19, ~((i18 ^ 13) | i19), 1, 128);
        }
        if (mqVar4.get() == getwarnings2) {
            System.currentTimeMillis();
            System.currentTimeMillis();
            initialize5 = insetsIgnoringVisibility.bottom;
            int i20 = ThreeDS2ServiceInstance;
            i4 = SVG$Unit$EnumUnboxingLocalUtility.m$1((i20 | 38) << 1, i20 ^ 38, 1, 128);
        } else {
            initialize5 = mqVar4.initialize();
            i4 = (ThreeDS2ServiceInstance + 121) % 128;
        }
        initialize = i4;
        view.setPadding(initialize2, initialize3, initialize4, initialize5);
        ThreeDS2ServiceInstance = (initialize + 7) % 128;
        return windowInsets;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.mk
    public void bG_(Window window) {
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 101;
        int i3 = ((i ^ 101) | i2) << 1;
        int i4 = -((i | 101) & (~i2));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        initialize = i5 % 128;
        int i6 = i5 % 2;
        window.setDecorFitsSystemWindows(false);
        int i7 = initialize;
        int i8 = (-2) - (((i7 & 50) + (i7 | 50)) ^ (-1));
        ThreeDS2ServiceInstance = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.mg
    public void getWarnings(View view, mq mqVar, mq mqVar2, mq mqVar3, mq mqVar4) {
        view.setOnApplyWindowInsetsListener(new mo(mqVar, mqVar2, mqVar3, mqVar4));
        int i = initialize;
        int i2 = (i ^ 79) + ((i & 79) << 1);
        ThreeDS2ServiceInstance = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }
}
