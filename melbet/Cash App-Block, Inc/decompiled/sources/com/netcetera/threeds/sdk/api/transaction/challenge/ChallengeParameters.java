package com.netcetera.threeds.sdk.api.transaction.challenge;

/* loaded from: classes5.dex */
public class ChallengeParameters {
    private static int ThreeDS2ServiceInitializationCallback = 1;
    private static int createTransaction;
    private String ThreeDS2Service;
    private String ThreeDS2ServiceInstance;
    private String get;
    private String getWarnings;
    private String initialize;

    public String get3DSServerTransactionID() {
        int i = createTransaction + 97;
        int i2 = i % 128;
        ThreeDS2ServiceInitializationCallback = i2;
        int i3 = i % 2;
        String str = this.ThreeDS2ServiceInstance;
        if (i3 == 0) {
            int i4 = 89 / 0;
        }
        createTransaction = (i2 + 5) % 128;
        return str;
    }

    public String getAcsRefNumber() {
        int i = createTransaction + 9;
        ThreeDS2ServiceInitializationCallback = i % 128;
        int i2 = i % 2;
        String str = this.ThreeDS2Service;
        if (i2 != 0) {
            return str;
        }
        throw null;
    }

    public String getAcsSignedContent() {
        int i = ThreeDS2ServiceInitializationCallback;
        String str = this.initialize;
        createTransaction = (i + 55) % 128;
        return str;
    }

    public String getAcsTransactionID() {
        int i = ThreeDS2ServiceInitializationCallback + 73;
        createTransaction = i % 128;
        int i2 = i % 2;
        String str = this.get;
        if (i2 == 0) {
            return str;
        }
        throw null;
    }

    public String getThreeDSRequestorAppURL() {
        int i = createTransaction + 69;
        int i2 = i % 128;
        ThreeDS2ServiceInitializationCallback = i2;
        int i3 = i % 2;
        String str = this.getWarnings;
        if (i3 == 0) {
            throw null;
        }
        int i4 = i2 + 11;
        createTransaction = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public void set3DSServerTransactionID(String str) {
        int i = createTransaction + 37;
        ThreeDS2ServiceInitializationCallback = i % 128;
        if (i % 2 != 0) {
            this.ThreeDS2ServiceInstance = str;
        } else {
            this.ThreeDS2ServiceInstance = str;
            throw null;
        }
    }

    public void setAcsRefNumber(String str) {
        int i = (ThreeDS2ServiceInitializationCallback + 61) % 128;
        createTransaction = i;
        this.ThreeDS2Service = str;
        int i2 = i + 53;
        ThreeDS2ServiceInitializationCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 78 / 0;
        }
    }

    public void setAcsSignedContent(String str) {
        int i = createTransaction + 69;
        int i2 = i % 128;
        ThreeDS2ServiceInitializationCallback = i2;
        if (i % 2 == 0) {
            this.initialize = str;
            int i3 = 93 / 0;
        } else {
            this.initialize = str;
        }
        createTransaction = (i2 + 67) % 128;
    }

    public void setAcsTransactionID(String str) {
        int i = createTransaction + 59;
        int i2 = i % 128;
        ThreeDS2ServiceInitializationCallback = i2;
        if (i % 2 == 0) {
            this.get = str;
            throw null;
        }
        this.get = str;
        int i3 = i2 + 89;
        createTransaction = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 53 / 0;
        }
    }

    public void setThreeDSRequestorAppURL(String str) {
        int i = createTransaction;
        this.getWarnings = str;
        ThreeDS2ServiceInitializationCallback = (i + 47) % 128;
    }
}
