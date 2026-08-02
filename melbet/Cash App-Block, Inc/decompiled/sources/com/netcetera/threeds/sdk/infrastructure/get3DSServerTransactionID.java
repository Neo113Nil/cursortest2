package com.netcetera.threeds.sdk.infrastructure;

import android.text.TextUtils;
import android.view.View;
import java.lang.reflect.Constructor;
import java.util.Map;

/* loaded from: classes5.dex */
class get3DSServerTransactionID implements setAcsTransactionID {
    public static final get3DSServerTransactionID getWarnings = new get3DSServerTransactionID();

    @Override // com.netcetera.threeds.sdk.infrastructure.setAcsTransactionID
    public Object ThreeDS2ServiceInstance() {
        try {
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(80127389);
            if (obj == null) {
                obj = ((Class) removeParam.initialize(View.MeasureSpec.getMode(0) + 68, (char) ((-1) - TextUtils.lastIndexOf("", '0')), TextUtils.indexOf((CharSequence) "", '0', 0) + 10683)).getDeclaredConstructor(null);
                map.put(80127389, obj);
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
