package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class setCompoundDrawableTintBlendMode implements setScrollCaptureHint.ThreeDS2Service {
    private final Context ThreeDS2ServiceInstance;
    private final com.netcetera.threeds.sdk.api.ThreeDS2Service getWarnings;

    public setCompoundDrawableTintBlendMode(com.netcetera.threeds.sdk.api.ThreeDS2Service threeDS2Service, Context context) {
        this.getWarnings = threeDS2Service;
        this.ThreeDS2ServiceInstance = context;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint.ThreeDS2Service
    public void getWarnings() {
        try {
            Object[] objArr = {this.getWarnings, this.ThreeDS2ServiceInstance};
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(-74631251);
            if (obj == null) {
                obj = ((Class) removeParam.initialize((ViewConfiguration.getWindowTouchSlop() >> 8) + 58, (char) Color.argb(0, 0, 0, 0), 9762 - (ViewConfiguration.getLongPressTimeout() >> 16))).getDeclaredMethod("ThreeDS2ServiceInstance", (Class) removeParam.initialize(57 - TextUtils.lastIndexOf("", '0'), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) + 9762), Context.class);
                map.put(-74631251, obj);
            }
            ((Method) obj).invoke(null, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
