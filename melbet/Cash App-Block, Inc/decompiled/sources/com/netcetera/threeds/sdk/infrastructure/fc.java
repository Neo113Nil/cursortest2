package com.netcetera.threeds.sdk.infrastructure;

import android.app.Activity;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ExpandableListView;
import com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class fc implements setScrollCaptureHint.ThreeDS2ServiceInstance {
    private final Activity ThreeDS2Service;
    private final com.netcetera.threeds.sdk.api.transaction.Transaction getWarnings;

    public fc(com.netcetera.threeds.sdk.api.transaction.Transaction transaction, Activity activity) {
        this.getWarnings = transaction;
        this.ThreeDS2Service = activity;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint.ThreeDS2ServiceInstance
    public Object initialize() {
        try {
            Object[] objArr = {this.getWarnings, this.ThreeDS2Service};
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(-7725736);
            if (obj == null) {
                obj = ((Class) removeParam.initialize(49 - KeyEvent.keyCodeFromString(""), (char) View.MeasureSpec.getSize(0), 11189 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))).getDeclaredMethod("ThreeDS2Service", (Class) removeParam.initialize(49 - (KeyEvent.getMaxKeyCode() >> 16), (char) ExpandableListView.getPackedPositionType(0L), TextUtils.getTrimmedLength("") + 11188), Activity.class);
                map.put(-7725736, obj);
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
