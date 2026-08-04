package com.appsflyer.internal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes.dex */
public final class AFe1zSDK {
    public static final String AFAdRevenueData(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return "[Exception Manager]: " + str;
    }

    public static final Pair<Integer, Integer> getCurrencyIso4217Code(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Intrinsics.checkNotNullParameter(str, "");
        kotlin.text.f fVarA = new Regex("(\\d+).(\\d+).(\\d+)-(\\d+).(\\d+).(\\d+)").a(str);
        if (fVarA != null) {
            kotlin.text.e eVar = fVarA.f204b;
            MatchGroup matchGroupB = eVar.b(1);
            Integer intOrNull = (matchGroupB == null || (str7 = matchGroupB.f187a) == null) ? null : kotlin.text.o.toIntOrNull(str7);
            MatchGroup matchGroupB2 = eVar.b(2);
            Integer intOrNull2 = (matchGroupB2 == null || (str6 = matchGroupB2.f187a) == null) ? null : kotlin.text.o.toIntOrNull(str6);
            MatchGroup matchGroupB3 = eVar.b(3);
            Integer intOrNull3 = (matchGroupB3 == null || (str5 = matchGroupB3.f187a) == null) ? null : kotlin.text.o.toIntOrNull(str5);
            MatchGroup matchGroupB4 = eVar.b(4);
            Integer intOrNull4 = (matchGroupB4 == null || (str4 = matchGroupB4.f187a) == null) ? null : kotlin.text.o.toIntOrNull(str4);
            MatchGroup matchGroupB5 = eVar.b(5);
            Integer intOrNull5 = (matchGroupB5 == null || (str3 = matchGroupB5.f187a) == null) ? null : kotlin.text.o.toIntOrNull(str3);
            MatchGroup matchGroupB6 = eVar.b(6);
            Integer intOrNull6 = (matchGroupB6 == null || (str2 = matchGroupB6.f187a) == null) ? null : kotlin.text.o.toIntOrNull(str2);
            if (AFAdRevenueData(intOrNull, intOrNull2, intOrNull3, intOrNull4, intOrNull5, intOrNull6)) {
                Intrinsics.b(intOrNull);
                int iIntValue = intOrNull.intValue() * 1000000;
                Intrinsics.b(intOrNull2);
                int iIntValue2 = (intOrNull2.intValue() * 1000) + iIntValue;
                Intrinsics.b(intOrNull3);
                Integer numValueOf = Integer.valueOf(intOrNull3.intValue() + iIntValue2);
                Intrinsics.b(intOrNull4);
                int iIntValue3 = intOrNull4.intValue() * 1000000;
                Intrinsics.b(intOrNull5);
                int iIntValue4 = (intOrNull5.intValue() * 1000) + iIntValue3;
                Intrinsics.b(intOrNull6);
                return new Pair<>(numValueOf, Integer.valueOf(intOrNull6.intValue() + iIntValue4));
            }
        }
        return null;
    }

    public static final String getRevenue(String str, String str2) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str2);
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "");
        String str3 = "";
        for (byte b2 : bArrDigest) {
            String str4 = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b2)}, 1));
            Intrinsics.checkNotNullExpressionValue(str4, "");
            str3 = str3 + str4;
        }
        return str3;
    }

    private static boolean AFAdRevenueData(Object... objArr) {
        Intrinsics.checkNotNullParameter(objArr, "");
        return !kotlin.collections.m.a(objArr, null);
    }

    public static final Pair<Integer, Integer> getRevenue(String str) {
        String str2;
        String str3;
        String str4;
        Intrinsics.checkNotNullParameter(str, "");
        kotlin.text.f fVarA = new Regex("^(\\d+).(\\+)$|^(\\d+).(\\d+).(\\+)$").a(str);
        if (fVarA != null) {
            kotlin.text.e eVar = fVarA.f204b;
            MatchGroup matchGroupB = eVar.b(1);
            Integer intOrNull = (matchGroupB == null || (str4 = matchGroupB.f187a) == null) ? null : kotlin.text.o.toIntOrNull(str4);
            MatchGroup matchGroupB2 = eVar.b(3);
            Integer intOrNull2 = (matchGroupB2 == null || (str3 = matchGroupB2.f187a) == null) ? null : kotlin.text.o.toIntOrNull(str3);
            MatchGroup matchGroupB3 = eVar.b(4);
            Integer intOrNull3 = (matchGroupB3 == null || (str2 = matchGroupB3.f187a) == null) ? null : kotlin.text.o.toIntOrNull(str2);
            if (intOrNull != null) {
                return new Pair<>(Integer.valueOf(intOrNull.intValue() * 1000000), Integer.valueOf(((intOrNull.intValue() + 1) * 1000000) - 1));
            }
            if (intOrNull2 != null && intOrNull3 != null) {
                return new Pair<>(Integer.valueOf((intOrNull3.intValue() * 1000) + (intOrNull2.intValue() * 1000000)), Integer.valueOf((((intOrNull3.intValue() + 1) * 1000) + (intOrNull2.intValue() * 1000000)) - 1));
            }
        }
        return null;
    }
}
