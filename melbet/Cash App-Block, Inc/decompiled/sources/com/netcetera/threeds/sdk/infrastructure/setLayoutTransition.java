package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public class setLayoutTransition {
    private static int ThreeDS2ServiceInstance = 1;
    private static int initialize;
    private final setOnCapturedPointerListener get;

    public setLayoutTransition(setOnCapturedPointerListener setoncapturedpointerlistener) {
        this.get = setoncapturedpointerlistener;
    }

    public com.netcetera.threeds.sdk.api.transaction.challenge.events.RuntimeErrorEvent getWarnings(setScrollCaptureCallback setscrollcapturecallback) {
        com.netcetera.threeds.sdk.api.transaction.challenge.events.RuntimeErrorEvent runtimeErrorEvent = new com.netcetera.threeds.sdk.api.transaction.challenge.events.RuntimeErrorEvent(Integer.toString(setscrollcapturecallback.getWarnings().ThreeDS2Service()), this.get.ThreeDS2ServiceInstance(setscrollcapturecallback));
        int i = initialize;
        int i2 = i & 17;
        int i3 = ((i ^ 17) | i2) << 1;
        int i4 = -((i | 17) & (~i2));
        ThreeDS2ServiceInstance = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
        return runtimeErrorEvent;
    }
}
