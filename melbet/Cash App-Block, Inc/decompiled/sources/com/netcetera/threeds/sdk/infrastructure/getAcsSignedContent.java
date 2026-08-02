package com.netcetera.threeds.sdk.infrastructure;

import android.os.SystemClock;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
class getAcsSignedContent implements setAcsTransactionID {
    public static final getAcsSignedContent ThreeDS2Service = new getAcsSignedContent();

    @Override // com.netcetera.threeds.sdk.infrastructure.setAcsTransactionID
    public Object ThreeDS2ServiceInstance() {
        try {
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(-1014103849);
            if (obj == null) {
                obj = ((Class) removeParam.initialize((ViewConfiguration.getJumpTapTimeout() >> 16) + 58, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 6413)).getMethod("get", null);
                map.put(-1014103849, obj);
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
