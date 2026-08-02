package com.netcetera.threeds.sdk.infrastructure;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Constructor;
import java.util.Map;

/* loaded from: classes5.dex */
class getValue implements setAcsTransactionID {
    public static final getValue ThreeDS2ServiceInstance = new getValue();

    @Override // com.netcetera.threeds.sdk.infrastructure.setAcsTransactionID
    public Object ThreeDS2ServiceInstance() {
        try {
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(630110404);
            if (obj == null) {
                obj = ((Class) removeParam.initialize(TextUtils.indexOf((CharSequence) "", '0', 0) + 79, (char) (59653 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), ExpandableListView.getPackedPositionType(0L) + 7711)).getDeclaredConstructor(null);
                map.put(630110404, obj);
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
