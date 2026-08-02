package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;

/* loaded from: classes5.dex */
public class cb extends bt<FrameLayout> {
    private static int ThreeDS2ServiceInitializationCallback = 0;
    private static int getSDKInfo = 1;
    private final mg ThreeDS2Service;
    private final ju ThreeDS2ServiceInstance;
    private final compute get;
    remove getWarnings;
    private final ce initialize;

    public cb(ce ceVar, compute computeVar, ju juVar, mg mgVar) {
        this.initialize = ceVar;
        this.get = computeVar;
        this.ThreeDS2ServiceInstance = juVar;
        this.ThreeDS2Service = mgVar;
    }

    public static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr, int i, int i2, int i3) {
        cb cbVar = (cb) objArr[0];
        setScroller setscroller = (setScroller) objArr[1];
        FrameLayout frameLayout = (FrameLayout) objArr[2];
        int i4 = ThreeDS2ServiceInitializationCallback + 12;
        getSDKInfo = ((i4 ^ (-1)) + (i4 << 1)) % 128;
        frameLayout.removeAllViews();
        remove ThreeDS2Service = cbVar.initialize.ThreeDS2Service(setscroller, frameLayout.getContext());
        cbVar.getWarnings = ThreeDS2Service;
        frameLayout.addView(ThreeDS2Service.ThreeDS2ServiceInstance());
        cbVar.getWarnings.ThreeDS2Service(cbVar.get, setscroller);
        ThreeDS2ServiceInitializationCallback = (getSDKInfo + 85) % 128;
        return null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.bs
    public void ThreeDS2Service() {
        int i = getSDKInfo;
        this.getWarnings = null;
        int i2 = ((i | 115) << 1) - (i ^ 115);
        ThreeDS2ServiceInitializationCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public FrameLayout be_(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.ThreeDS2Service.getWarnings(frameLayout, (mq) mq.get(new Object[0], 1015662037, -1015662036, (int) System.currentTimeMillis()), (mq) mq.get(new Object[]{0}, 385114565, -385114565, 0), (mq) mq.get(new Object[0], 1015662037, -1015662036, (int) System.currentTimeMillis()), (mq) mq.get(new Object[0], 1015662037, -1015662036, (int) System.currentTimeMillis()));
        et.getWarnings(frameLayout, this.ThreeDS2ServiceInstance.getWarnings().get());
        int i = ThreeDS2ServiceInitializationCallback;
        int i2 = i ^ 55;
        int i3 = ((((i & 55) | i2) << 1) - (~(-i2))) - 1;
        getSDKInfo = i3 % 128;
        if (i3 % 2 != 0) {
            return frameLayout;
        }
        throw null;
    }

    public void get(er erVar) {
        int i = getSDKInfo;
        int i2 = i & 51;
        int i3 = (~i2) & (i | 51);
        int i4 = i2 << 1;
        ThreeDS2ServiceInitializationCallback = ((i3 & i4) + (i4 | i3)) % 128;
        remove removeVar = this.getWarnings;
        if (removeVar != null) {
            int i5 = (((i ^ 91) | (i & 91)) << 1) - (((~i) & 91) | (i & (-92)));
            ThreeDS2ServiceInitializationCallback = i5 % 128;
            if (i5 % 2 != 0) {
                removeVar.ThreeDS2ServiceInstance(erVar);
                throw null;
            }
            removeVar.ThreeDS2ServiceInstance(erVar);
            int i6 = ThreeDS2ServiceInitializationCallback;
            getSDKInfo = SVG$Unit$EnumUnboxingLocalUtility.m$1((i6 | 6) << 1, i6 ^ 6, 1, 128);
        }
        int i7 = getSDKInfo;
        int i8 = i7 ^ 105;
        int i9 = (((i7 & 105) | i8) << 1) - i8;
        ThreeDS2ServiceInitializationCallback = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
    }

    public void getWarnings() {
        int i = getSDKInfo;
        int i2 = ((i ^ 13) + ((i & 13) << 1)) % 128;
        ThreeDS2ServiceInitializationCallback = i2;
        remove removeVar = this.getWarnings;
        if (removeVar != null) {
            int i3 = ((i2 ^ 67) | (i2 & 67)) << 1;
            int i4 = -(((~i2) & 67) | (i2 & (-68)));
            getSDKInfo = ((i3 ^ i4) + ((i3 & i4) << 1)) % 128;
            removeVar.ThreeDS2Service();
            int i5 = getSDKInfo;
            int i6 = i5 & 25;
            int i7 = (i5 | 25) & (~i6);
            int i8 = i6 << 1;
            ThreeDS2ServiceInitializationCallback = ((i7 & i8) + (i7 | i8)) % 128;
        }
        int i9 = ThreeDS2ServiceInitializationCallback;
        int i10 = (i9 ^ 41) + ((i9 & 41) << 1);
        getSDKInfo = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public void initialize(eq eqVar) {
        int i = ThreeDS2ServiceInitializationCallback;
        int i2 = ((i & 5) - (~(i | 5))) - 1;
        getSDKInfo = i2 % 128;
        int i3 = i2 % 2;
        remove removeVar = this.getWarnings;
        if (i3 == 0) {
            throw null;
        }
        if (removeVar != null) {
            removeVar.get(eqVar);
            int i4 = ThreeDS2ServiceInitializationCallback;
            getSDKInfo = SVG$Unit$EnumUnboxingLocalUtility.m(i4 & 56, i4 | 56, -1, 128);
        }
        getSDKInfo = (ThreeDS2ServiceInitializationCallback + 125) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.bs
    public /* synthetic */ View initialize(Context context) {
        int i = getSDKInfo;
        int i2 = i & 47;
        int i3 = -(-((i ^ 47) | i2));
        ThreeDS2ServiceInitializationCallback = ((i2 & i3) + (i3 | i2)) % 128;
        FrameLayout be_ = be_(context);
        int i4 = getSDKInfo + 113;
        ThreeDS2ServiceInitializationCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return be_;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.bt
    public /* synthetic */ void getWarnings(setScroller setscroller, FrameLayout frameLayout) {
        int i = getSDKInfo;
        int i2 = (i & 29) + (i | 29);
        ThreeDS2ServiceInitializationCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this, setscroller, frameLayout};
        int identityHashCode = System.identityHashCode(this);
        if (i3 == 0) {
            ThreeDS2ServiceInstance(objArr, 86719439, -86719439, identityHashCode);
        } else {
            ThreeDS2ServiceInstance(objArr, 86719439, -86719439, identityHashCode);
            throw null;
        }
    }

    public void get(keys keysVar) {
        int i = getSDKInfo;
        ThreeDS2ServiceInitializationCallback = SVG$Unit$EnumUnboxingLocalUtility.m$1((i | 100) << 1, i ^ 100, 1, 128);
        remove removeVar = this.getWarnings;
        if (removeVar != null) {
            ThreeDS2ServiceInitializationCallback = (i + 35) % 128;
            removeVar.get(keysVar);
            ThreeDS2ServiceInitializationCallback = (getSDKInfo + 17) % 128;
        }
        int i2 = getSDKInfo + 99;
        ThreeDS2ServiceInitializationCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public computeIfPresent get() {
        int i = getSDKInfo;
        int i2 = i & 103;
        int i3 = i2 + ((i ^ 103) | i2);
        ThreeDS2ServiceInitializationCallback = i3 % 128;
        int i4 = i3 % 2;
        remove removeVar = this.getWarnings;
        if (i4 == 0) {
            return removeVar;
        }
        throw null;
    }
}
