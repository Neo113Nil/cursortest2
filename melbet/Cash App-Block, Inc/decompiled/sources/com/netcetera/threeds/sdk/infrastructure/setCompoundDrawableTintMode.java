package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.text.AndroidCharacter;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class setCompoundDrawableTintMode implements setScrollCaptureHint.ThreeDS2ServiceInstance {
    private final Map ThreeDS2Service;
    private final String get;
    private final com.netcetera.threeds.sdk.api.ThreeDS2Service getWarnings;
    private final String initialize;

    public setCompoundDrawableTintMode(com.netcetera.threeds.sdk.api.ThreeDS2Service threeDS2Service, String str, String str2, Map map) {
        this.getWarnings = threeDS2Service;
        this.initialize = str;
        this.get = str2;
        this.ThreeDS2Service = map;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint.ThreeDS2ServiceInstance
    public Object initialize() {
        try {
            Object[] objArr = {this.getWarnings, this.initialize, this.get, this.ThreeDS2Service};
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(-812320500);
            if (obj == null) {
                obj = ((Class) removeParam.initialize((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 58, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 9762 - (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)))).getDeclaredMethod("ThreeDS2ServiceInstance", (Class) removeParam.initialize(58 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) Color.argb(0, 0, 0, 0), 9810 - AndroidCharacter.getMirror('0')), String.class, String.class, Map.class);
                map.put(-812320500, obj);
            }
            return ((Method) obj).invoke(null, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
