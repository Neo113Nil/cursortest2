package com.netcetera.threeds.sdk.api.exceptions;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes5.dex */
public class SDKRuntimeException extends RuntimeException {
    private static int ThreeDS2Service = 0;
    private static int initialize = 1;
    private final String getWarnings;

    public SDKRuntimeException(String str, String str2, Throwable th) {
        super(str, th);
        this.getWarnings = str2;
    }

    public String getErrorCode() {
        int i = (initialize + 125) % 128;
        ThreeDS2Service = i;
        String str = this.getWarnings;
        initialize = (i + 67) % 128;
        return str;
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder("SDKRuntimeException{");
        sb.append(super.toString());
        sb.append("message='");
        sb.append(getMessage());
        sb.append("'errorCode='");
        String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.getWarnings, "'}");
        initialize = (ThreeDS2Service + 15) % 128;
        return m;
    }

    public SDKRuntimeException(String str, String str2) {
        this(str, str2, null);
    }
}
