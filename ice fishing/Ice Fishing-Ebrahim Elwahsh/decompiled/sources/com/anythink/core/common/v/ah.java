package com.anythink.core.common.v;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class ah {
    private static String a(String str, String str2) {
        int length = str.length();
        int length2 = str2.length();
        if (length == length2) {
            return str;
        }
        int abs = Math.abs(length2 - length);
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < abs; i++) {
            sb.append(" ");
        }
        return sb.toString();
    }

    private static boolean b(String str) {
        return str.matches("[\\u4e00-\\u9fa5]+");
    }

    public static boolean a(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isDigit(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static String a(String str) {
        byte[] bytes = str.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) (bytes[i] - 3);
        }
        return new String(bytes);
    }
}
