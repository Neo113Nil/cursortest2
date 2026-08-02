package com.fillr.analytics.util;

/* loaded from: classes4.dex */
public final class RemoteService$ServiceUnavailableException extends Exception {
    public final int mRetryAfter;

    public RemoteService$ServiceUnavailableException(String str) {
        super("Service Unavailable");
        int i;
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            i = 0;
        }
        this.mRetryAfter = i;
    }
}
