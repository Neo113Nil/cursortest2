package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.view.ViewConfiguration;
import java.lang.reflect.Constructor;
import java.util.Map;

/* loaded from: classes5.dex */
class protocolError implements setAcsTransactionID {
    public static final protocolError get = new protocolError();

    @Override // com.netcetera.threeds.sdk.infrastructure.setAcsTransactionID
    public Object ThreeDS2ServiceInstance() {
        try {
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(-1339212343);
            if (obj == null) {
                obj = ((Class) removeParam.initialize(Color.green(0) + 68, (char) (42174 - (ViewConfiguration.getLongPressTimeout() >> 16)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 10191)).getDeclaredConstructor(null);
                map.put(-1339212343, obj);
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
