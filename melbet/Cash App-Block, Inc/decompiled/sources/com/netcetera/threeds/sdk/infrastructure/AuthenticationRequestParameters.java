package com.netcetera.threeds.sdk.infrastructure;

import android.text.TextUtils;
import android.view.View;
import java.lang.reflect.Constructor;
import java.util.Map;

/* loaded from: classes5.dex */
class AuthenticationRequestParameters implements setAcsTransactionID {
    public static final AuthenticationRequestParameters ThreeDS2ServiceInstance = new AuthenticationRequestParameters();

    @Override // com.netcetera.threeds.sdk.infrastructure.setAcsTransactionID
    public Object ThreeDS2ServiceInstance() {
        try {
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(-1772788695);
            if (obj == null) {
                obj = ((Class) removeParam.initialize(63 - View.resolveSizeAndState(0, 0, 0), (char) View.resolveSize(0, 0), 6790 - TextUtils.indexOf((CharSequence) "", '0', 0, 0))).getDeclaredConstructor(null);
                map.put(-1772788695, obj);
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
