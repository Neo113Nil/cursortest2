package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.netcetera.threeds.sdk.api.transaction.Transaction;
import com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class fe implements setScrollCaptureHint.ThreeDS2Service {
    private final Transaction.BridgingMessageExtensionVersion ThreeDS2ServiceInstance;
    private final com.netcetera.threeds.sdk.api.transaction.Transaction getWarnings;

    public fe(com.netcetera.threeds.sdk.api.transaction.Transaction transaction, Transaction.BridgingMessageExtensionVersion bridgingMessageExtensionVersion) {
        this.getWarnings = transaction;
        this.ThreeDS2ServiceInstance = bridgingMessageExtensionVersion;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint.ThreeDS2Service
    public void getWarnings() {
        try {
            Object[] objArr = {this.getWarnings, this.ThreeDS2ServiceInstance};
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(-986861654);
            if (obj == null) {
                obj = ((Class) removeParam.initialize(TextUtils.getOffsetAfter("", 0) + 49, (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 11188 - (ViewConfiguration.getMaximumFlingVelocity() >> 16))).getDeclaredMethod("initialize", (Class) removeParam.initialize(Color.blue(0) + 49, (char) Color.red(0), TextUtils.indexOf("", "", 0) + 11188), Transaction.BridgingMessageExtensionVersion.class);
                map.put(-986861654, obj);
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
