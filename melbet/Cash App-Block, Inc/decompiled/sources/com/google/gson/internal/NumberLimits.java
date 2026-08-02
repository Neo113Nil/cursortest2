package com.google.gson.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes4.dex */
public class NumberLimits {
    private static final int MAX_NUMBER_STRING_LENGTH = 10000;

    private NumberLimits() {
    }

    private static void checkNumberStringLength(String str) {
        if (str.length() <= 10000) {
            return;
        }
        AesGcmSiv$$ExternalSyntheticLambda0.m("Number string too large: ", (Object) str.substring(0, 30), (Object) "...");
    }

    public static BigDecimal parseBigDecimal(String str) {
        checkNumberStringLength(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException(Recorder$$ExternalSyntheticOutline2.m("Number has unsupported scale: ", str));
    }

    public static BigInteger parseBigInteger(String str) {
        checkNumberStringLength(str);
        return new BigInteger(str);
    }
}
