package com.netcetera.threeds.sdk.api.security;

/* loaded from: classes7.dex */
public class Warning {
    private static int get = 0;
    private static int getWarnings = 1;
    private final String ThreeDS2Service;
    private final Severity ThreeDS2ServiceInstance;
    private final String initialize;

    public Warning(String str, String str2, Severity severity) {
        this.initialize = str;
        this.ThreeDS2Service = str2;
        this.ThreeDS2ServiceInstance = severity;
    }

    public String getId() {
        int i = (getWarnings + 81) % 128;
        get = i;
        String str = this.initialize;
        getWarnings = (i + 83) % 128;
        return str;
    }

    public String getMessage() {
        int i = getWarnings + 35;
        get = i % 128;
        int i2 = i % 2;
        String str = this.ThreeDS2Service;
        if (i2 == 0) {
            return str;
        }
        throw null;
    }

    public Severity getSeverity() {
        int i = getWarnings;
        Severity severity = this.ThreeDS2ServiceInstance;
        int i2 = i + 49;
        get = i2 % 128;
        if (i2 % 2 == 0) {
            return severity;
        }
        throw null;
    }
}
