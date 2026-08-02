package com.netcetera.threeds.sdk.api.transaction.challenge;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes5.dex */
public class ErrorMessage {
    private static int ThreeDS2ServiceInitializationCallback = 1;
    private static int cleanup;
    private final String ThreeDS2Service;
    private final String ThreeDS2ServiceInstance;
    private final String get;
    private final String getSDKInfo;
    private final String getSDKVersion;
    private final String getWarnings;
    private final String initialize;

    public ErrorMessage(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.ThreeDS2Service = str;
        this.get = str2;
        this.getWarnings = str3;
        this.ThreeDS2ServiceInstance = str4;
        this.initialize = str5;
        this.getSDKVersion = str6;
        this.getSDKInfo = str7;
    }

    public String getErrorCode() {
        int i = ThreeDS2ServiceInitializationCallback + 69;
        int i2 = i % 128;
        cleanup = i2;
        int i3 = i % 2;
        String str = this.get;
        if (i3 != 0) {
            int i4 = 5 / 0;
        }
        ThreeDS2ServiceInitializationCallback = (i2 + 53) % 128;
        return str;
    }

    public String getErrorComponent() {
        int i = cleanup + 113;
        int i2 = i % 128;
        ThreeDS2ServiceInitializationCallback = i2;
        int i3 = i % 2;
        String str = this.initialize;
        if (i3 == 0) {
            throw null;
        }
        cleanup = (i2 + 27) % 128;
        return str;
    }

    public String getErrorDescription() {
        int i = cleanup;
        String str = this.getWarnings;
        ThreeDS2ServiceInitializationCallback = (i + 49) % 128;
        return str;
    }

    public String getErrorDetails() {
        int i = ThreeDS2ServiceInitializationCallback + 89;
        int i2 = i % 128;
        cleanup = i2;
        int i3 = i % 2;
        String str = this.ThreeDS2ServiceInstance;
        if (i3 != 0) {
            throw null;
        }
        ThreeDS2ServiceInitializationCallback = (i2 + 59) % 128;
        return str;
    }

    public String getErrorMessageType() {
        int i = ThreeDS2ServiceInitializationCallback + 27;
        cleanup = i % 128;
        int i2 = i % 2;
        String str = this.getSDKVersion;
        if (i2 == 0) {
            return str;
        }
        throw null;
    }

    public String getMessageVersionNumber() {
        int i = (cleanup + 89) % 128;
        ThreeDS2ServiceInitializationCallback = i;
        String str = this.getSDKInfo;
        int i2 = i + 67;
        cleanup = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 14 / 0;
        }
        return str;
    }

    public String getTransactionID() {
        int i = cleanup + 83;
        int i2 = i % 128;
        ThreeDS2ServiceInitializationCallback = i2;
        int i3 = i % 2;
        String str = this.ThreeDS2Service;
        if (i3 == 0) {
            throw null;
        }
        cleanup = (i2 + 113) % 128;
        return str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ErrorMessage{transactionID='");
        sb.append(this.ThreeDS2Service);
        sb.append("'\n, errorCode='");
        sb.append(this.get);
        sb.append("'\n, errorDescription='");
        sb.append(this.getWarnings);
        sb.append("'\n, errorDetail='");
        sb.append(this.ThreeDS2ServiceInstance);
        sb.append("'\n, errorComponent='");
        sb.append(this.initialize);
        sb.append("'\n, errorMessageType='");
        sb.append(this.getSDKVersion);
        sb.append("'\n, messageVersionNumber='");
        String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.getSDKInfo, "'}");
        cleanup = (ThreeDS2ServiceInitializationCallback + 119) % 128;
        return m;
    }
}
