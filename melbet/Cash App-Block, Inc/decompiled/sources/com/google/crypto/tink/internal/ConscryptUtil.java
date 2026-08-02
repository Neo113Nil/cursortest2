package com.google.crypto.tink.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.math.BigInteger;
import java.security.Provider;
import java.security.Security;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class ConscryptUtil {
    public static final String[] conscryptProviderNames = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};

    public static BigInteger fromUnsignedBigEndianBytes(byte[] bArr) {
        return new BigInteger(1, bArr);
    }

    public static Provider providerOrNull() {
        for (int i = 0; i < 3; i++) {
            Provider provider = Security.getProvider(conscryptProviderNames[i]);
            if (provider != null) {
                return provider;
            }
        }
        return null;
    }

    public static byte[] toBigEndianBytes(BigInteger bigInteger) {
        if (bigInteger.signum() != -1) {
            return bigInteger.toByteArray();
        }
        a$$ExternalSyntheticBUOutline0.m$3("n must not be negative");
        return null;
    }

    public static byte[] toBigEndianBytesOfFixedLength(int i, BigInteger bigInteger) {
        if (bigInteger.signum() == -1) {
            a$$ExternalSyntheticBUOutline0.m$3("integer must be nonnegative");
            return null;
        }
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == i) {
            return byteArray;
        }
        int i2 = i + 1;
        if (byteArray.length > i2) {
            a$$ExternalSyntheticBUOutline0.m$6("integer too large");
            return null;
        }
        if (byteArray.length != i2) {
            byte[] bArr = new byte[i];
            System.arraycopy(byteArray, 0, bArr, i - byteArray.length, byteArray.length);
            return bArr;
        }
        if (byteArray[0] == 0) {
            return Arrays.copyOfRange(byteArray, 1, byteArray.length);
        }
        a$$ExternalSyntheticBUOutline0.m$6("integer too large");
        return null;
    }
}
