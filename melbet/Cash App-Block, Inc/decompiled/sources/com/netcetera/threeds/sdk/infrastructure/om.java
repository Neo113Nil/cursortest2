package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public class om {
    public static final Integer initialize = 0;
    public static final Long ThreeDS2Service = -1L;

    private static boolean get(String str, int i) {
        int i2 = 0;
        while (i < str.length()) {
            boolean z = str.charAt(i) == '.';
            if (z) {
                i2++;
            }
            if (i2 > 1) {
                return false;
            }
            if (!z && !Character.isDigit(str.charAt(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean getWarnings(String str) {
        if (oj.getWarnings((CharSequence) str) || str.charAt(str.length() - 1) == '.') {
            return false;
        }
        if (str.charAt(0) != '-') {
            return get(str, 0);
        }
        if (str.length() == 1) {
            return false;
        }
        return get(str, 1);
    }
}
