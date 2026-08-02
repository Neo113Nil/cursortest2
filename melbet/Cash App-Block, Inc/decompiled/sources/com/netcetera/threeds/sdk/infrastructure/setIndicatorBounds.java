package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.netcetera.threeds.sdk.infrastructure.mv;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class setIndicatorBounds implements mv.initialize {
    private final boolean initialize;

    public setIndicatorBounds(boolean z) {
        this.initialize = z;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.mv.initialize
    public boolean ThreeDS2ServiceInstance(Object obj) {
        try {
            Object[] objArr = {Boolean.valueOf(this.initialize), obj};
            Map map = removeParam.visaSchemeConfiguration;
            Object obj2 = map.get(-68477915);
            if (obj2 == null) {
                obj2 = ((Class) removeParam.initialize(64 - KeyEvent.getDeadChar(0, 0), (char) TextUtils.indexOf("", ""), 7648 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))).getDeclaredMethod("ThreeDS2ServiceInstance", Boolean.TYPE, (Class) removeParam.initialize(78 - (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) (10196 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 7935));
                map.put(-68477915, obj2);
            }
            return ((Boolean) ((Method) obj2).invoke(null, objArr)).booleanValue();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
