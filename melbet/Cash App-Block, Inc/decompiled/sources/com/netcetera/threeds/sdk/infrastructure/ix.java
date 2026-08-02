package com.netcetera.threeds.sdk.infrastructure;

import android.app.Activity;
import com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeStatusReceiver;
import com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint;

/* loaded from: classes5.dex */
class ix implements setScrollCaptureHint.ThreeDS2Service {
    private final com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeParameters ThreeDS2Service;
    private final Activity ThreeDS2ServiceInstance;
    private final iv get;
    private final int getWarnings;
    private final ChallengeStatusReceiver initialize;

    public ix(iv ivVar, Activity activity, com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeParameters challengeParameters, ChallengeStatusReceiver challengeStatusReceiver, int i) {
        this.get = ivVar;
        this.ThreeDS2ServiceInstance = activity;
        this.ThreeDS2Service = challengeParameters;
        this.initialize = challengeStatusReceiver;
        this.getWarnings = i;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint.ThreeDS2Service
    public void getWarnings() {
        iv.getWarnings(new Object[]{this.get, this.ThreeDS2ServiceInstance, this.ThreeDS2Service, this.initialize, Integer.valueOf(r4)}, -982371011, 982371011, this.getWarnings);
    }
}
