package com.netcetera.threeds.sdk.api.transaction.challenge.events;

import com.netcetera.threeds.sdk.api.transaction.challenge.ErrorMessage;
import com.plaid.internal.EnumC0170g;

/* loaded from: classes5.dex */
public class ProtocolErrorEvent {
    private static int ThreeDS2Service = 0;
    private static int ThreeDS2ServiceInstance = 1;
    private String get;
    private ErrorMessage initialize;

    public ProtocolErrorEvent(String str, ErrorMessage errorMessage) {
        this.get = str;
        this.initialize = errorMessage;
    }

    public ErrorMessage getErrorMessage() {
        int i = (ThreeDS2Service + 101) % 128;
        ThreeDS2ServiceInstance = i;
        ErrorMessage errorMessage = this.initialize;
        int i2 = i + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        ThreeDS2Service = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 25 / 0;
        }
        return errorMessage;
    }

    public String getSDKTransactionID() {
        int i = (ThreeDS2ServiceInstance + 63) % 128;
        ThreeDS2Service = i;
        String str = this.get;
        int i2 = i + 41;
        ThreeDS2ServiceInstance = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public String toString() {
        String str = "ProtocolErrorEvent{sdkTransactionID='" + this.get + "', errorMessage=" + this.initialize + '}';
        ThreeDS2ServiceInstance = (ThreeDS2Service + 47) % 128;
        return str;
    }
}
