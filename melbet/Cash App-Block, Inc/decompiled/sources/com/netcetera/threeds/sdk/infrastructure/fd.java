package com.netcetera.threeds.sdk.infrastructure;

import android.app.Activity;
import android.graphics.Color;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeStatusReceiver;
import com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class fd implements setScrollCaptureHint.ThreeDS2Service {
    private final com.netcetera.threeds.sdk.api.transaction.Transaction ThreeDS2Service;
    private final Activity ThreeDS2ServiceInstance;
    private final com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeParameters get;
    private final int getWarnings;
    private final ChallengeStatusReceiver initialize;

    public fd(com.netcetera.threeds.sdk.api.transaction.Transaction transaction, Activity activity, com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeParameters challengeParameters, ChallengeStatusReceiver challengeStatusReceiver, int i) {
        this.ThreeDS2Service = transaction;
        this.ThreeDS2ServiceInstance = activity;
        this.get = challengeParameters;
        this.initialize = challengeStatusReceiver;
        this.getWarnings = i;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint.ThreeDS2Service
    public void getWarnings() {
        try {
            Object[] objArr = {this.ThreeDS2Service, this.ThreeDS2ServiceInstance, this.get, this.initialize, Integer.valueOf(this.getWarnings)};
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(1296526611);
            if (obj == null) {
                obj = ((Class) removeParam.initialize(49 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) TextUtils.indexOf("", ""), (ViewConfiguration.getFadingEdgeLength() >> 16) + 11188)).getDeclaredMethod("getWarnings", (Class) removeParam.initialize('a' - AndroidCharacter.getMirror('0'), (char) Color.green(0), TextUtils.indexOf("", "", 0, 0) + 11188), Activity.class, com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeParameters.class, ChallengeStatusReceiver.class, Integer.TYPE);
                map.put(1296526611, obj);
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
