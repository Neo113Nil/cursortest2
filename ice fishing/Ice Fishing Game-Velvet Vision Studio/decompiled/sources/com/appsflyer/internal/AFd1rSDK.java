package com.appsflyer.internal;

import com.gamericefishpro.space.ph.v;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class AFd1rSDK {
    public static final String AFAdRevenueData(String str, String str2) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str2);
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "");
        String strH = "";
        for (byte b : bArrDigest) {
            String str3 = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "");
            strH = com.gamericefishpro.space.m5.a.h(strH, str3);
        }
        return strH;
    }

    public static final String getCurrencyIso4217Code(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return "[Exception Manager]: " + str;
    }

    public static final Pair<Integer, Integer> getMonetizationNetwork(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Intrinsics.checkNotNullParameter(str, "");
        com.gamericefishpro.space.a8.c cVarB = new Regex("(\\d+).(\\d+).(\\d+)-(\\d+).(\\d+).(\\d+)").b(str);
        if (cVarB != null) {
            com.gamericefishpro.space.mi.d dVar = (com.gamericefishpro.space.mi.d) cVarB.v;
            MatchGroup matchGroupC = dVar.c(1);
            Integer intOrNull = (matchGroupC == null || (str7 = matchGroupC.a) == null) ? null : StringsKt.toIntOrNull(str7);
            MatchGroup matchGroupC2 = dVar.c(2);
            Integer intOrNull2 = (matchGroupC2 == null || (str6 = matchGroupC2.a) == null) ? null : StringsKt.toIntOrNull(str6);
            MatchGroup matchGroupC3 = dVar.c(3);
            Integer intOrNull3 = (matchGroupC3 == null || (str5 = matchGroupC3.a) == null) ? null : StringsKt.toIntOrNull(str5);
            MatchGroup matchGroupC4 = dVar.c(4);
            Integer intOrNull4 = (matchGroupC4 == null || (str4 = matchGroupC4.a) == null) ? null : StringsKt.toIntOrNull(str4);
            MatchGroup matchGroupC5 = dVar.c(5);
            Integer intOrNull5 = (matchGroupC5 == null || (str3 = matchGroupC5.a) == null) ? null : StringsKt.toIntOrNull(str3);
            MatchGroup matchGroupC6 = dVar.c(6);
            Integer intOrNull6 = (matchGroupC6 == null || (str2 = matchGroupC6.a) == null) ? null : StringsKt.toIntOrNull(str2);
            Integer num = intOrNull6;
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
                Intrinsics.b(num);
                return new Pair<>(numValueOf, Integer.valueOf(num.intValue() + iIntValue4));
            }
        }
        return null;
    }

    public static final Pair<Integer, Integer> AFAdRevenueData(String str) {
        String str2;
        String str3;
        String str4;
        Intrinsics.checkNotNullParameter(str, "");
        com.gamericefishpro.space.a8.c cVarB = new Regex("^(\\d+).(\\+)$|^(\\d+).(\\d+).(\\+)$").b(str);
        if (cVarB != null) {
            com.gamericefishpro.space.mi.d dVar = (com.gamericefishpro.space.mi.d) cVarB.v;
            MatchGroup matchGroupC = dVar.c(1);
            Integer intOrNull = (matchGroupC == null || (str4 = matchGroupC.a) == null) ? null : StringsKt.toIntOrNull(str4);
            MatchGroup matchGroupC2 = dVar.c(3);
            Integer intOrNull2 = (matchGroupC2 == null || (str3 = matchGroupC2.a) == null) ? null : StringsKt.toIntOrNull(str3);
            MatchGroup matchGroupC3 = dVar.c(4);
            Integer intOrNull3 = (matchGroupC3 == null || (str2 = matchGroupC3.a) == null) ? null : StringsKt.toIntOrNull(str2);
            if (intOrNull != null) {
                return new Pair<>(Integer.valueOf(intOrNull.intValue() * 1000000), Integer.valueOf(((intOrNull.intValue() + 1) * 1000000) - 1));
            }
            if (intOrNull2 != null && intOrNull3 != null) {
                return new Pair<>(Integer.valueOf((intOrNull3.intValue() * 1000) + (intOrNull2.intValue() * 1000000)), Integer.valueOf((((intOrNull3.intValue() + 1) * 1000) + (intOrNull2.intValue() * 1000000)) - 1));
            }
        }
        return null;
    }

    private static boolean AFAdRevenueData(Object... objArr) {
        Intrinsics.checkNotNullParameter(objArr, "");
        return !v.n(objArr, null);
    }
}
