package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class setCompoundDrawableTintList implements setScrollCaptureHint.ThreeDS2Service {
    private final com.netcetera.threeds.sdk.api.ui.logic.UiCustomization ThreeDS2Service;
    private final String ThreeDS2ServiceInstance;
    private final com.netcetera.threeds.sdk.api.configparameters.ConfigParameters get;
    private final com.netcetera.threeds.sdk.api.ThreeDS2Service getWarnings;
    private final Context initialize;

    public setCompoundDrawableTintList(com.netcetera.threeds.sdk.api.ThreeDS2Service threeDS2Service, Context context, com.netcetera.threeds.sdk.api.configparameters.ConfigParameters configParameters, String str, com.netcetera.threeds.sdk.api.ui.logic.UiCustomization uiCustomization) {
        this.getWarnings = threeDS2Service;
        this.initialize = context;
        this.get = configParameters;
        this.ThreeDS2ServiceInstance = str;
        this.ThreeDS2Service = uiCustomization;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint.ThreeDS2Service
    public void getWarnings() {
        try {
            Object[] objArr = {this.getWarnings, this.initialize, this.get, this.ThreeDS2ServiceInstance, this.ThreeDS2Service};
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(-769366845);
            if (obj == null) {
                obj = ((Class) removeParam.initialize(ImageFormat.getBitsPerPixel(0) + 59, (char) (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)), Process.getGidForName("") + 9763)).getDeclaredMethod("getWarnings", (Class) removeParam.initialize(58 - View.resolveSize(0, 0), (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (ViewConfiguration.getLongPressTimeout() >> 16) + 9762), Context.class, com.netcetera.threeds.sdk.api.configparameters.ConfigParameters.class, String.class, com.netcetera.threeds.sdk.api.ui.logic.UiCustomization.class);
                map.put(-769366845, obj);
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
