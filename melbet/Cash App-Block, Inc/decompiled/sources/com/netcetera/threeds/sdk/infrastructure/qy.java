package com.netcetera.threeds.sdk.infrastructure;

import java.math.BigInteger;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes5.dex */
public class qy {
    public static BigInteger ThreeDS2ServiceInstance(String str) {
        return ThreeDS2ServiceInstance(new oq().getWarnings(str));
    }

    public static String get(BigInteger bigInteger, int i) {
        return new oq().ThreeDS2ServiceInstance(getWarnings(bigInteger, i));
    }

    public static byte[] getWarnings(BigInteger bigInteger, int i) {
        byte[] initialize = initialize(bigInteger);
        return i > initialize.length ? rf.ThreeDS2ServiceInstance(new byte[i - initialize.length], initialize) : initialize;
    }

    public static byte[] initialize(BigInteger bigInteger) {
        if (bigInteger.signum() >= 0) {
            byte[] byteArray = bigInteger.toByteArray();
            return (bigInteger.bitLength() % 8 == 0 && byteArray[0] == 0 && byteArray.length > 1) ? rf.ThreeDS2ServiceInstance(byteArray, 1, byteArray.length - 1) : byteArray;
        }
        Path$$ExternalSyntheticBUOutline0.m(bigInteger, "Cannot convert negative values to an unsigned magnitude byte array: ");
        return null;
    }

    public static BigInteger ThreeDS2ServiceInstance(byte[] bArr) {
        return new BigInteger(1, bArr);
    }

    public static String ThreeDS2ServiceInstance(BigInteger bigInteger) {
        return new oq().ThreeDS2ServiceInstance(initialize(bigInteger));
    }
}
