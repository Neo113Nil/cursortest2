package com.netcetera.threeds.sdk.api.transaction.challenge.events;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes5.dex */
public class RuntimeErrorEvent {
    private static int ThreeDS2Service = 0;
    private static int ThreeDS2ServiceInstance = 1;
    private String get;
    private String getWarnings;

    public RuntimeErrorEvent(String str, String str2) {
        this.getWarnings = str;
        this.get = str2;
    }

    public String getErrorCode() {
        int i = (ThreeDS2ServiceInstance + 117) % 128;
        ThreeDS2Service = i;
        String str = this.getWarnings;
        int i2 = i + 111;
        ThreeDS2ServiceInstance = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public String getErrorMessage() {
        int i = (ThreeDS2Service + 69) % 128;
        ThreeDS2ServiceInstance = i;
        String str = this.get;
        ThreeDS2Service = (i + 89) % 128;
        return str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RuntimeErrorEvent{errorCode='");
        sb.append(this.getWarnings);
        sb.append("', errorMessage='");
        String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.get, "'}");
        int i = ThreeDS2Service + 101;
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 == 0) {
            int i2 = 91 / 0;
        }
        return m;
    }
}
