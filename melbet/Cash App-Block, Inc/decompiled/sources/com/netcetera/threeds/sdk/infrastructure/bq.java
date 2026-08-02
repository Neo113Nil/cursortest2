package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.netcetera.threeds.sdk.api.ui.logic.UiCustomization;

/* loaded from: classes5.dex */
public class bq extends bs<FrameLayout> {
    private static int getSDKVersion = 1;
    private static int getWarnings;
    private final compute ThreeDS2Service;
    private final mg ThreeDS2ServiceInstance;
    private final ju get;
    private final fj initialize;

    public bq(ju juVar, compute computeVar, mg mgVar, fj fjVar) {
        this.get = juVar;
        this.ThreeDS2Service = computeVar;
        this.ThreeDS2ServiceInstance = mgVar;
        this.initialize = fjVar;
    }

    private static /* synthetic */ Object ThreeDS2Service(Object[] objArr) {
        bq bqVar = (bq) objArr[0];
        int i = (-2) - ((getWarnings + 26) ^ (-1));
        getSDKVersion = i % 128;
        if (i % 2 == 0) {
            bqVar.ThreeDS2Service.ThreeDS2Service(bqVar.initialize.getWarnings(getCause.ThreeDS2ServiceInstance));
            throw null;
        }
        bqVar.ThreeDS2Service.ThreeDS2Service(bqVar.initialize.getWarnings(getCause.ThreeDS2ServiceInstance));
        int i2 = getSDKVersion;
        int i3 = (((i2 | 114) << 1) - (i2 ^ 114)) - 1;
        getWarnings = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr, int i, int i2, int i3) {
        return ThreeDS2Service(objArr);
    }

    public FrameLayout aY_(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        storeToXML storetoxml = new storeToXML(context, this.get.get(), this.get.get(UiCustomization.ButtonType.CANCEL));
        storetoxml.ThreeDS2ServiceInstance(new bz(this));
        this.ThreeDS2ServiceInstance.getWarnings(frameLayout, (mq) mq.get(new Object[0], 1015662037, -1015662036, (int) System.currentTimeMillis()), (mq) mq.get(new Object[0], 1015662037, -1015662036, (int) System.currentTimeMillis()), (mq) mq.get(new Object[0], 1015662037, -1015662036, (int) System.currentTimeMillis()), (mq) mq.get(new Object[]{0}, 385114565, -385114565, 0));
        et.getWarnings(frameLayout, this.get.get().getSDKInfo());
        frameLayout.addView(storetoxml.ThreeDS2Service());
        int i = getSDKVersion;
        int i2 = ((i | 70) << 1) - (i ^ 70);
        getWarnings = ((i2 ^ (-1)) + (i2 << 1)) % 128;
        return frameLayout;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.bs
    public /* synthetic */ FrameLayout initialize(Context context) {
        int i = getWarnings;
        int i2 = i & 3;
        getSDKVersion = (((i | 3) & (~i2)) + (i2 << 1)) % 128;
        FrameLayout aY_ = aY_(context);
        int i3 = getWarnings;
        int i4 = (((i3 | 116) << 1) - (i3 ^ 116)) - 1;
        getSDKVersion = i4 % 128;
        if (i4 % 2 != 0) {
            return aY_;
        }
        throw null;
    }
}
