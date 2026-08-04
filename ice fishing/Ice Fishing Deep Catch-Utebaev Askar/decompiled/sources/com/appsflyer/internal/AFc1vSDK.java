package com.appsflyer.internal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1vSDK {
    public static final String getCurrencyIso4217Code(String str) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(str, "");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "");
        String str2 = "";
        for (byte b2 : bArrDigest) {
            String str3 = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b2)}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "");
            str2 = str2 + str3;
        }
        return str2;
    }

    public static final int getMonetizationNetwork(String str) {
        String str2;
        Integer intOrNull;
        String str3;
        Integer intOrNull2;
        String str4;
        Integer intOrNull3;
        Intrinsics.checkNotNullParameter(str, "");
        kotlin.text.f fVarA = new Regex("(\\d+).(\\d+).(\\d+).*").a(str);
        if (fVarA == null) {
            return -1;
        }
        kotlin.text.e eVar = fVarA.f204b;
        MatchGroup matchGroupB = eVar.b(1);
        int iIntValue = 0;
        int iIntValue2 = ((matchGroupB == null || (str4 = matchGroupB.f187a) == null || (intOrNull3 = kotlin.text.o.toIntOrNull(str4)) == null) ? 0 : intOrNull3.intValue()) * 1000000;
        MatchGroup matchGroupB2 = eVar.b(2);
        int iIntValue3 = (((matchGroupB2 == null || (str3 = matchGroupB2.f187a) == null || (intOrNull2 = kotlin.text.o.toIntOrNull(str3)) == null) ? 0 : intOrNull2.intValue()) * 1000) + iIntValue2;
        MatchGroup matchGroupB3 = eVar.b(3);
        if (matchGroupB3 != null && (str2 = matchGroupB3.f187a) != null && (intOrNull = kotlin.text.o.toIntOrNull(str2)) != null) {
            iIntValue = intOrNull.intValue();
        }
        return iIntValue3 + iIntValue;
    }
}
