package com.netcetera.threeds.sdk.infrastructure;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
class cancelled implements setAcsTransactionID {
    public static final cancelled ThreeDS2ServiceInstance = new cancelled();

    @Override // com.netcetera.threeds.sdk.infrastructure.setAcsTransactionID
    public Object ThreeDS2ServiceInstance() {
        try {
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(-2019404038);
            if (obj == null) {
                obj = ((Class) removeParam.initialize(57 - MotionEvent.axisFromString(""), (char) TextUtils.indexOf("", "", 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 9762)).getMethod("ThreeDS2ServiceInstance", null);
                map.put(-2019404038, obj);
            }
            return ((Method) obj).invoke(null, null);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
