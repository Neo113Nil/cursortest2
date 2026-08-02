package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.os.Process;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class setCompoundDrawablesRelative implements setScrollCaptureHint.ThreeDS2Service {
    private final com.netcetera.threeds.sdk.api.ThreeDS2Service ThreeDS2Service;
    private final Map ThreeDS2ServiceInstance;
    private final com.netcetera.threeds.sdk.api.configparameters.ConfigParameters get;
    private final String getWarnings;
    private final Context initialize;

    public setCompoundDrawablesRelative(com.netcetera.threeds.sdk.api.ThreeDS2Service threeDS2Service, Context context, com.netcetera.threeds.sdk.api.configparameters.ConfigParameters configParameters, String str, Map map) {
        this.ThreeDS2Service = threeDS2Service;
        this.initialize = context;
        this.get = configParameters;
        this.getWarnings = str;
        this.ThreeDS2ServiceInstance = map;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint.ThreeDS2Service
    public void getWarnings() {
        try {
            Object[] objArr = {this.ThreeDS2Service, this.initialize, this.get, this.getWarnings, this.ThreeDS2ServiceInstance};
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(572439799);
            if (obj == null) {
                obj = ((Class) removeParam.initialize((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 58, (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), View.getDefaultSize(0, 0) + 9762)).getDeclaredMethod("ThreeDS2Service", (Class) removeParam.initialize(58 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), ((Process.getThreadPriority(0) + 20) >> 6) + 9762), Context.class, com.netcetera.threeds.sdk.api.configparameters.ConfigParameters.class, String.class, Map.class);
                map.put(572439799, obj);
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
