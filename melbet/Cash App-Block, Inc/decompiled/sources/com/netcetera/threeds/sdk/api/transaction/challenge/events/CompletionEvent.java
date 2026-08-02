package com.netcetera.threeds.sdk.api.transaction.challenge.events;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes5.dex */
public class CompletionEvent {
    private static int ThreeDS2Service = 1;
    private static int ThreeDS2ServiceInstance;
    private String get;
    private String initialize;

    public CompletionEvent(String str, String str2) {
        this.initialize = str;
        this.get = str2;
    }

    public String getSDKTransactionID() {
        int i = ThreeDS2ServiceInstance;
        String str = this.initialize;
        int i2 = i + 29;
        ThreeDS2Service = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public String getTransactionStatus() {
        int i = (ThreeDS2ServiceInstance + 117) % 128;
        ThreeDS2Service = i;
        String str = this.get;
        int i2 = i + 53;
        ThreeDS2ServiceInstance = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CompletionEvent{sdkTransactionID='");
        sb.append(this.initialize);
        sb.append("'\n, transactionStatus='");
        String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.get, "'}");
        ThreeDS2Service = (ThreeDS2ServiceInstance + 3) % 128;
        return m;
    }
}
