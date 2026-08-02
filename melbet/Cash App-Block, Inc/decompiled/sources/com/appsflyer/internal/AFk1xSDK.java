package com.appsflyer.internal;

import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.MatcherMatchResult;
import kotlin.text.MatcherMatchResult$groups$1;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes.dex */
public final class AFk1xSDK {
    public static final int getMediationNetwork(String str) {
        String str2;
        Integer intOrNull;
        String str3;
        Integer intOrNull2;
        String str4;
        Integer intOrNull3;
        str.getClass();
        MatcherMatchResult matchEntire = new Regex("(\\d+).(\\d+).(\\d+).*").matchEntire(str);
        if (matchEntire == null) {
            return -1;
        }
        MatcherMatchResult$groups$1 matcherMatchResult$groups$1 = matchEntire.groups;
        MatchGroup matchGroup = matcherMatchResult$groups$1.get(1);
        int i = 0;
        int intValue = ((matchGroup == null || (str4 = matchGroup.value) == null || (intOrNull3 = StringsKt.toIntOrNull(str4)) == null) ? 0 : intOrNull3.intValue()) * 1000000;
        MatchGroup matchGroup2 = matcherMatchResult$groups$1.get(2);
        int intValue2 = (((matchGroup2 == null || (str3 = matchGroup2.value) == null || (intOrNull2 = StringsKt.toIntOrNull(str3)) == null) ? 0 : intOrNull2.intValue()) * IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO) + intValue;
        MatchGroup matchGroup3 = matcherMatchResult$groups$1.get(3);
        if (matchGroup3 != null && (str2 = matchGroup3.value) != null && (intOrNull = StringsKt.toIntOrNull(str2)) != null) {
            i = intOrNull.intValue();
        }
        return intValue2 + i;
    }

    public static final String getMediationNetwork(String str, String str2) {
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
