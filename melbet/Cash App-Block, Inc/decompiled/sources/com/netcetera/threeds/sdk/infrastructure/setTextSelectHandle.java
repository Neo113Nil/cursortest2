package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import androidx.recyclerview.widget.RecyclerView;
import com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class setTextSelectHandle implements setScrollCaptureHint.ThreeDS2ServiceInstance {
    private final String ThreeDS2Service;
    private final com.netcetera.threeds.sdk.api.ThreeDS2Service ThreeDS2ServiceInstance;
    private final String getWarnings;

    public setTextSelectHandle(com.netcetera.threeds.sdk.api.ThreeDS2Service threeDS2Service, String str, String str2) {
        this.ThreeDS2ServiceInstance = threeDS2Service;
        this.ThreeDS2Service = str;
        this.getWarnings = str2;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint.ThreeDS2ServiceInstance
    public Object initialize() {
        try {
            Object[] objArr = {this.ThreeDS2ServiceInstance, this.ThreeDS2Service, this.getWarnings};
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(909509047);
            if (obj == null) {
                obj = ((Class) removeParam.initialize((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 57, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 9762 - Color.green(0))).getDeclaredMethod("ThreeDS2ServiceInstance", (Class) removeParam.initialize(58 - (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), TextUtils.indexOf("", "", 0, 0) + 9762), String.class, String.class);
                map.put(909509047, obj);
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
