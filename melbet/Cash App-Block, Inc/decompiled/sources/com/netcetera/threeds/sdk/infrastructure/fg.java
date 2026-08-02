package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint;

/* loaded from: classes5.dex */
public class fg implements setScrollCaptureHint.ThreeDS2Service {
    private final com.netcetera.threeds.sdk.api.transaction.Transaction get;

    public fg(com.netcetera.threeds.sdk.api.transaction.Transaction transaction) {
        this.get = transaction;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint.ThreeDS2Service
    public void getWarnings() {
        this.get.close();
    }
}
