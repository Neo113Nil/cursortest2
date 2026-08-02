package com.appsflyer.internal;

import defpackage.jch;
import defpackage.l7;
import defpackage.xz0;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFd1pSDK {
    @NotNull
    public static final String AFAdRevenueData(@NotNull String str) {
        str.getClass();
        return "[Exception Manager]: " + str;
    }

    public static final Pair<Integer, Integer> getCurrencyIso4217Code(@NotNull String str) {
        String str2;
        String str3;
        String str4;
        str.getClass();
        jch d = new Regex("^(\\d+).(\\+)$|^(\\d+).(\\d+).(\\+)$").d(str);
        if (d != null) {
            l7 l7Var = d.c;
            MatchGroup a = l7Var.a(1);
            Integer intOrNull = (a == null || (str4 = a.a) == null) ? null : StringsKt.toIntOrNull(str4);
            MatchGroup a2 = l7Var.a(3);
            Integer intOrNull2 = (a2 == null || (str3 = a2.a) == null) ? null : StringsKt.toIntOrNull(str3);
            MatchGroup a3 = l7Var.a(4);
            Integer intOrNull3 = (a3 == null || (str2 = a3.a) == null) ? null : StringsKt.toIntOrNull(str2);
            if (intOrNull != null) {
                return new Pair<>(Integer.valueOf(intOrNull.intValue() * 1000000), Integer.valueOf(((intOrNull.intValue() + 1) * 1000000) - 1));
            }
            if (intOrNull2 != null && intOrNull3 != null) {
                return new Pair<>(Integer.valueOf((intOrNull3.intValue() * 1000) + (intOrNull2.intValue() * 1000000)), Integer.valueOf((((intOrNull3.intValue() + 1) * 1000) + (intOrNull2.intValue() * 1000000)) - 1));
            }
        }
        return null;
    }

    public static final Pair<Integer, Integer> getRevenue(@NotNull String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        str.getClass();
        jch d = new Regex("(\\d+).(\\d+).(\\d+)-(\\d+).(\\d+).(\\d+)").d(str);
        if (d != null) {
            l7 l7Var = d.c;
            MatchGroup a = l7Var.a(1);
            Integer intOrNull = (a == null || (str7 = a.a) == null) ? null : StringsKt.toIntOrNull(str7);
            MatchGroup a2 = l7Var.a(2);
            Integer intOrNull2 = (a2 == null || (str6 = a2.a) == null) ? null : StringsKt.toIntOrNull(str6);
            MatchGroup a3 = l7Var.a(3);
            Integer intOrNull3 = (a3 == null || (str5 = a3.a) == null) ? null : StringsKt.toIntOrNull(str5);
            MatchGroup a4 = l7Var.a(4);
            Integer intOrNull4 = (a4 == null || (str4 = a4.a) == null) ? null : StringsKt.toIntOrNull(str4);
            MatchGroup a5 = l7Var.a(5);
            Integer intOrNull5 = (a5 == null || (str3 = a5.a) == null) ? null : StringsKt.toIntOrNull(str3);
            MatchGroup a6 = l7Var.a(6);
            Integer intOrNull6 = (a6 == null || (str2 = a6.a) == null) ? null : StringsKt.toIntOrNull(str2);
            Integer num = intOrNull6;
            if (getRevenue(intOrNull, intOrNull2, intOrNull3, intOrNull4, intOrNull5, intOrNull6)) {
                intOrNull.getClass();
                int intValue = intOrNull.intValue() * 1000000;
                intOrNull2.getClass();
                int intValue2 = (intOrNull2.intValue() * 1000) + intValue;
                intOrNull3.getClass();
                Integer valueOf = Integer.valueOf(intOrNull3.intValue() + intValue2);
                intOrNull4.getClass();
                int intValue3 = intOrNull4.intValue() * 1000000;
                intOrNull5.getClass();
                int intValue4 = (intOrNull5.intValue() * 1000) + intValue3;
                num.getClass();
                return new Pair<>(valueOf, Integer.valueOf(num.intValue() + intValue4));
            }
        }
        return null;
    }

    public static final String getCurrencyIso4217Code(String str, String str2) {
        MessageDigest messageDigest = MessageDigest.getInstance(str2);
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        bytes.getClass();
        byte[] digest = messageDigest.digest(bytes);
        digest.getClass();
        String str3 = "";
        for (byte b : digest) {
            str3 = str3.concat(String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1)));
        }
        return str3;
    }

    private static boolean getRevenue(@NotNull Object... objArr) {
        objArr.getClass();
        return !xz0.u(objArr, null);
    }
}
