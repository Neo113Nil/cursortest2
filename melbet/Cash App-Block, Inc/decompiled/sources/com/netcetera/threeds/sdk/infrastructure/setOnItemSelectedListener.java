package com.netcetera.threeds.sdk.infrastructure;

import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class setOnItemSelectedListener implements Runnable {
    public static final setOnItemSelectedListener getWarnings = new setOnItemSelectedListener();

    @Override // java.lang.Runnable
    public void run() {
        try {
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(1385842854);
            if (obj == null) {
                obj = ((Class) removeParam.initialize(58 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) KeyEvent.keyCodeFromString(""), 6414 - (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)))).getDeclaredMethod("ThreeDS2ServiceInstance", null);
                map.put(1385842854, obj);
            }
            ((Method) obj).invoke(null, null);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
