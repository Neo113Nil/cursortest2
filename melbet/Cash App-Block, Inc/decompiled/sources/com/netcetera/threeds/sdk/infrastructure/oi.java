package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public class oi {
    public static void getWarnings(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }
}
