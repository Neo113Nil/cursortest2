package com.appsflyer.internal;

import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.MatcherMatchResult;
import kotlin.text.MatcherMatchResult$groups$1;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes3.dex */
public final class AFd1rSDK {
    public static final Pair<Integer, Integer> AFAdRevenueData(String str) {
        String str2;
        String str3;
        String str4;
        str.getClass();
        MatcherMatchResult matchEntire = new Regex("^(\\d+).(\\+)$|^(\\d+).(\\d+).(\\+)$").matchEntire(str);
        if (matchEntire != null) {
            MatcherMatchResult$groups$1 matcherMatchResult$groups$1 = matchEntire.groups;
            MatchGroup matchGroup = matcherMatchResult$groups$1.get(1);
            Integer intOrNull = (matchGroup == null || (str4 = matchGroup.value) == null) ? null : StringsKt.toIntOrNull(str4);
            MatchGroup matchGroup2 = matcherMatchResult$groups$1.get(3);
            Integer intOrNull2 = (matchGroup2 == null || (str3 = matchGroup2.value) == null) ? null : StringsKt.toIntOrNull(str3);
            MatchGroup matchGroup3 = matcherMatchResult$groups$1.get(4);
            Integer intOrNull3 = (matchGroup3 == null || (str2 = matchGroup3.value) == null) ? null : StringsKt.toIntOrNull(str2);
            if (intOrNull != null) {
                return new Pair<>(Integer.valueOf(intOrNull.intValue() * 1000000), Integer.valueOf(((intOrNull.intValue() + 1) * 1000000) - 1));
            }
            if (intOrNull2 != null && intOrNull3 != null) {
                return new Pair<>(Integer.valueOf((intOrNull3.intValue() * IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO) + (intOrNull2.intValue() * 1000000)), Integer.valueOf((((intOrNull3.intValue() + 1) * IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO) + (intOrNull2.intValue() * 1000000)) - 1));
            }
        }
        return null;
    }

    public static final String getCurrencyIso4217Code(String str) {
        str.getClass();
        return "[Exception Manager]: " + str;
    }

    public static final Pair<Integer, Integer> getMonetizationNetwork(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        str.getClass();
        MatcherMatchResult matchEntire = new Regex("(\\d+).(\\d+).(\\d+)-(\\d+).(\\d+).(\\d+)").matchEntire(str);
        if (matchEntire != null) {
            MatcherMatchResult$groups$1 matcherMatchResult$groups$1 = matchEntire.groups;
            MatchGroup matchGroup = matcherMatchResult$groups$1.get(1);
            Integer intOrNull = (matchGroup == null || (str7 = matchGroup.value) == null) ? null : StringsKt.toIntOrNull(str7);
            MatchGroup matchGroup2 = matcherMatchResult$groups$1.get(2);
            Integer intOrNull2 = (matchGroup2 == null || (str6 = matchGroup2.value) == null) ? null : StringsKt.toIntOrNull(str6);
            MatchGroup matchGroup3 = matcherMatchResult$groups$1.get(3);
            Integer intOrNull3 = (matchGroup3 == null || (str5 = matchGroup3.value) == null) ? null : StringsKt.toIntOrNull(str5);
            MatchGroup matchGroup4 = matcherMatchResult$groups$1.get(4);
            Integer intOrNull4 = (matchGroup4 == null || (str4 = matchGroup4.value) == null) ? null : StringsKt.toIntOrNull(str4);
            MatchGroup matchGroup5 = matcherMatchResult$groups$1.get(5);
            Integer intOrNull5 = (matchGroup5 == null || (str3 = matchGroup5.value) == null) ? null : StringsKt.toIntOrNull(str3);
            MatchGroup matchGroup6 = matcherMatchResult$groups$1.get(6);
            Integer intOrNull6 = (matchGroup6 == null || (str2 = matchGroup6.value) == null) ? null : StringsKt.toIntOrNull(str2);
            Integer num = intOrNull6;
            if (AFAdRevenueData(intOrNull, intOrNull2, intOrNull3, intOrNull4, intOrNull5, intOrNull6)) {
                intOrNull.getClass();
                int intValue = intOrNull.intValue() * 1000000;
                intOrNull2.getClass();
                int intValue2 = (intOrNull2.intValue() * IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO) + intValue;
                intOrNull3.getClass();
                Integer valueOf = Integer.valueOf(intOrNull3.intValue() + intValue2);
                intOrNull4.getClass();
                int intValue3 = intOrNull4.intValue() * 1000000;
                intOrNull5.getClass();
                int intValue4 = (intOrNull5.intValue() * IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO) + intValue3;
                num.getClass();
                return new Pair<>(valueOf, Integer.valueOf(num.intValue() + intValue4));
            }
        }
        return null;
    }

    public static final String AFAdRevenueData(String str, String str2) {
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

    private static boolean AFAdRevenueData(Object... objArr) {
        objArr.getClass();
        return !ArraysKt___ArraysKt.contains(objArr, (Object) null);
    }
}
