package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeStatusReceiver;

/* loaded from: classes5.dex */
class setIsCredential extends setFrameContentVelocity {
    private static int ThreeDS2ServiceInstance = 1;
    private static int get;
    private final ChallengeStatusReceiver initialize;

    public setIsCredential(ChallengeStatusReceiver challengeStatusReceiver, setLayoutTransition setlayouttransition) {
        super(setlayouttransition);
        this.initialize = challengeStatusReceiver;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setFrameContentVelocity
    public void get(com.netcetera.threeds.sdk.api.transaction.challenge.events.RuntimeErrorEvent runtimeErrorEvent) {
        int i = get;
        int i2 = i & 51;
        int i3 = -(-((i ^ 51) | i2));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        ThreeDS2ServiceInstance = i4 % 128;
        int i5 = i4 % 2;
        ChallengeStatusReceiver challengeStatusReceiver = this.initialize;
        if (i5 != 0) {
            challengeStatusReceiver.runtimeError(runtimeErrorEvent);
        } else {
            challengeStatusReceiver.runtimeError(runtimeErrorEvent);
            throw null;
        }
    }
}
