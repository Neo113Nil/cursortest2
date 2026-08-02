package com.yandex.auth;

import androidx.annotation.NonNull;
import defpackage.xy0;
import java.util.Map;

/* loaded from: classes3.dex */
public final class LegacyAccountType {
    private static final Map<Integer, String> INTEGER_TO_STRING;
    static final int LOGIN = 2;
    static final int MAILISH = 32;
    static final int PHONISH = 16;
    static final int SOCIAL = 8;
    public static final String STRING_LOGIN = "login";
    public static final String STRING_MAILISH = "external_mail";
    public static final String STRING_PHONISH = "phone";
    public static final String STRING_SOCIAL = "social";
    public static final String STRING_TEAM = "team";
    private static final Map<String, Integer> STRING_TO_INTEGER;
    public static final int TEAM = 4;

    static {
        xy0 xy0Var = new xy0(0);
        STRING_TO_INTEGER = xy0Var;
        xy0 xy0Var2 = new xy0(0);
        INTEGER_TO_STRING = xy0Var2;
        xy0Var.put(STRING_LOGIN, 2);
        xy0Var.put(STRING_TEAM, 4);
        xy0Var.put(STRING_SOCIAL, 8);
        xy0Var.put("phone", 16);
        xy0Var.put(STRING_MAILISH, 32);
        xy0Var2.put(2, STRING_LOGIN);
        xy0Var2.put(4, STRING_TEAM);
        xy0Var2.put(8, STRING_SOCIAL);
        xy0Var2.put(16, "phone");
        xy0Var2.put(32, STRING_MAILISH);
    }

    public static int from(String str) {
        Integer num;
        if (str == null || str.isEmpty() || (num = STRING_TO_INTEGER.get(str)) == null) {
            return 2;
        }
        return num.intValue();
    }

    public static boolean isAllowed(int i, int i2) {
        return (i & i2) == i2;
    }

    public static boolean isOnlyAllowed(int i, int i2) {
        return i == i2;
    }

    @NonNull
    public static String toString(int i) {
        String str = INTEGER_TO_STRING.get(Integer.valueOf(i));
        return str == null ? STRING_LOGIN : str;
    }
}
