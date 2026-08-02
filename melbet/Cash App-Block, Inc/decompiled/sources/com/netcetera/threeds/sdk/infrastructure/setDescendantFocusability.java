package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
class setDescendantFocusability extends setFrameContentVelocity {
    private static int ThreeDS2ServiceInstance = 0;
    private static int initialize = 1;
    private final setJustificationMode getWarnings;

    public setDescendantFocusability(setJustificationMode setjustificationmode, setLayoutTransition setlayouttransition) {
        super(setlayouttransition);
        this.getWarnings = setjustificationmode;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setFrameContentVelocity
    public void get(com.netcetera.threeds.sdk.api.transaction.challenge.events.RuntimeErrorEvent runtimeErrorEvent) {
        int i = initialize;
        int i2 = i & 45;
        int i3 = (i | 45) & (~i2);
        int i4 = -(-(i2 << 1));
        ThreeDS2ServiceInstance = ((i3 & i4) + (i3 | i4)) % 128;
        this.getWarnings.ThreeDS2ServiceInstance(runtimeErrorEvent);
        int i5 = ThreeDS2ServiceInstance + 117;
        initialize = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }
}
