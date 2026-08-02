package com.netcetera.threeds.sdk.infrastructure;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Constructor;
import java.util.Map;

/* loaded from: classes5.dex */
class getSDKTransactionID implements setAcsTransactionID {
    public static final getSDKTransactionID ThreeDS2Service = new getSDKTransactionID();

    @Override // com.netcetera.threeds.sdk.infrastructure.setAcsTransactionID
    public Object ThreeDS2ServiceInstance() {
        try {
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(-1722705018);
            if (obj == null) {
                obj = ((Class) removeParam.initialize(72 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) TextUtils.getOffsetBefore("", 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 6854)).getDeclaredConstructor(null);
                map.put(-1722705018, obj);
            }
            return ((Constructor) obj).newInstance(null);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
