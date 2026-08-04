package com.appsflyer.internal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class AFk1xSDK {
    public static final String getMediationNetwork(String str, String str2) throws NoSuchAlgorithmException {
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

    public static final int getMediationNetwork(String str) {
        String str2;
        Integer intOrNull;
        String str3;
        Integer intOrNull2;
        String str4;
        Integer intOrNull3;
        Intrinsics.checkNotNullParameter(str, "");
        com.gamericefishpro.space.a8.c cVarB = new Regex("(\\d+).(\\d+).(\\d+).*").b(str);
        if (cVarB == null) {
            return -1;
        }
        com.gamericefishpro.space.mi.d dVar = (com.gamericefishpro.space.mi.d) cVarB.v;
        MatchGroup matchGroupC = dVar.c(1);
        int iIntValue = 0;
        int iIntValue2 = ((matchGroupC == null || (str4 = matchGroupC.a) == null || (intOrNull3 = StringsKt.toIntOrNull(str4)) == null) ? 0 : intOrNull3.intValue()) * 1000000;
        MatchGroup matchGroupC2 = dVar.c(2);
        int iIntValue3 = (((matchGroupC2 == null || (str3 = matchGroupC2.a) == null || (intOrNull2 = StringsKt.toIntOrNull(str3)) == null) ? 0 : intOrNull2.intValue()) * 1000) + iIntValue2;
        MatchGroup matchGroupC3 = dVar.c(3);
        if (matchGroupC3 != null && (str2 = matchGroupC3.a) != null && (intOrNull = StringsKt.toIntOrNull(str2)) != null) {
            iIntValue = intOrNull.intValue();
        }
        return iIntValue3 + iIntValue;
    }
}
