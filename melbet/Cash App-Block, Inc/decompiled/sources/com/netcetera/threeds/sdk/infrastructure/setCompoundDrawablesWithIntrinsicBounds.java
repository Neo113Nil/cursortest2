package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.ViewConfiguration;
import com.netcetera.threeds.sdk.api.ThreeDS2Service;
import com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class setCompoundDrawablesWithIntrinsicBounds implements setScrollCaptureHint.ThreeDS2Service {
    private final com.netcetera.threeds.sdk.api.ThreeDS2Service ThreeDS2Service;
    private final com.netcetera.threeds.sdk.api.configparameters.ConfigParameters ThreeDS2ServiceInstance;
    private final Context get;
    private final ThreeDS2Service.InitializationCallback getSDKVersion;
    private final Map getWarnings;
    private final String initialize;

    public setCompoundDrawablesWithIntrinsicBounds(com.netcetera.threeds.sdk.api.ThreeDS2Service threeDS2Service, Context context, com.netcetera.threeds.sdk.api.configparameters.ConfigParameters configParameters, String str, Map map, ThreeDS2Service.InitializationCallback initializationCallback) {
        this.ThreeDS2Service = threeDS2Service;
        this.get = context;
        this.ThreeDS2ServiceInstance = configParameters;
        this.initialize = str;
        this.getWarnings = map;
        this.getSDKVersion = initializationCallback;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint.ThreeDS2Service
    public void getWarnings() {
        try {
            Object[] objArr = {this.ThreeDS2Service, this.get, this.ThreeDS2ServiceInstance, this.initialize, this.getWarnings, this.getSDKVersion};
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(643249489);
            if (obj == null) {
                obj = ((Class) removeParam.initialize(57 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) Color.alpha(0), Color.red(0) + 9762)).getDeclaredMethod("get", (Class) removeParam.initialize(58 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (ImageFormat.getBitsPerPixel(0) + 1), 9762 - Gravity.getAbsoluteGravity(0, 0)), Context.class, com.netcetera.threeds.sdk.api.configparameters.ConfigParameters.class, String.class, Map.class, ThreeDS2Service.InitializationCallback.class);
                map.put(643249489, obj);
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
