package com.netcetera.threeds.sdk.infrastructure;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.ExpandableListView;
import java.lang.reflect.Constructor;
import java.util.Map;

/* loaded from: classes5.dex */
class Transaction implements setAcsTransactionID {
    public static final Transaction ThreeDS2ServiceInstance = new Transaction();

    @Override // com.netcetera.threeds.sdk.infrastructure.setAcsTransactionID
    public Object ThreeDS2ServiceInstance() {
        try {
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(459489700);
            if (obj == null) {
                obj = ((Class) removeParam.initialize(57 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) KeyEvent.normalizeMetaState(0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 4822)).getDeclaredConstructor(null);
                map.put(459489700, obj);
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
