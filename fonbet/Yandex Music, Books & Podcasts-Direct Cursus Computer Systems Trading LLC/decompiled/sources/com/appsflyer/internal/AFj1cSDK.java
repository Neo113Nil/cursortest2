package com.appsflyer.internal;

import defpackage.jch;
import defpackage.l7;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFj1cSDK {
    public static final int getCurrencyIso4217Code(@NotNull String str) {
        String str2;
        Integer intOrNull;
        String str3;
        Integer intOrNull2;
        String str4;
        Integer intOrNull3;
        str.getClass();
        jch d = new Regex("(\\d+).(\\d+).(\\d+).*").d(str);
        if (d == null) {
            return -1;
        }
        l7 l7Var = d.c;
        MatchGroup a = l7Var.a(1);
        int i = 0;
        int intValue = ((a == null || (str4 = a.a) == null || (intOrNull3 = StringsKt.toIntOrNull(str4)) == null) ? 0 : intOrNull3.intValue()) * 1000000;
        MatchGroup a2 = l7Var.a(2);
        int intValue2 = (((a2 == null || (str3 = a2.a) == null || (intOrNull2 = StringsKt.toIntOrNull(str3)) == null) ? 0 : intOrNull2.intValue()) * 1000) + intValue;
        MatchGroup a3 = l7Var.a(3);
        if (a3 != null && (str2 = a3.a) != null && (intOrNull = StringsKt.toIntOrNull(str2)) != null) {
            i = intOrNull.intValue();
        }
        return intValue2 + i;
    }

    public static final String getMonetizationNetwork(String str, String str2) {
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
}
