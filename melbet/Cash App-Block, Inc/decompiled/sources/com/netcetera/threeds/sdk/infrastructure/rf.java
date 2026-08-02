package com.netcetera.threeds.sdk.infrastructure;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.Arrays;

/* loaded from: classes5.dex */
public class rf {
    public static final byte[] initialize = new byte[0];

    public static int ThreeDS2Service(byte b) {
        return b >= 0 ? b : 256 - (~(b - 1));
    }

    public static byte[] ThreeDS2ServiceInstance(byte[]... bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (byte[] bArr2 : bArr) {
                byteArrayOutputStream.write(bArr2);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            a$$ExternalSyntheticBUOutline0.m("IOEx from ByteArrayOutputStream?!", e);
            return null;
        }
    }

    public static int get(int i) {
        if (i > 268435455 || i < 0) {
            throw new rt(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Invalid byte length (", ") for converting to bit length"));
        }
        return i * 8;
    }

    public static boolean getWarnings(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            bArr = initialize;
        }
        if (bArr2 == null) {
            bArr2 = initialize;
        }
        int min = Math.min(bArr.length, bArr2.length);
        int max = Math.max(bArr.length, bArr2.length);
        int i = 0;
        for (int i2 = 0; i2 < min; i2++) {
            i |= bArr[i2] ^ bArr2[i2];
        }
        return i == 0 && min == max;
    }

    public static String initialize(byte[] bArr) {
        String ThreeDS2ServiceInstance = new oq().ThreeDS2ServiceInstance(bArr);
        int[] iArr = get(bArr);
        return Arrays.toString(iArr) + "(" + iArr.length + "bytes/" + get(iArr.length) + "bits) | base64url encoded: " + ThreeDS2ServiceInstance;
    }

    public static byte[] ThreeDS2Service(byte[] bArr) {
        return ThreeDS2ServiceInstance(bArr, 0, bArr.length / 2);
    }

    public static byte[] ThreeDS2Service(int i) {
        return initialize(i, null);
    }

    public static byte[] get(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putLong(j);
        return allocate.array();
    }

    public static int[] get(byte[] bArr) {
        int[] iArr = new int[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            iArr[i] = ThreeDS2Service(bArr[i]);
        }
        return iArr;
    }

    public static byte[] ThreeDS2ServiceInstance(int i) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i);
        return allocate.array();
    }

    public static byte[] ThreeDS2ServiceInstance(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    public static int ThreeDS2ServiceInstance(byte[] bArr) {
        return get(bArr.length);
    }

    public static byte[] getWarnings(byte[] bArr) {
        int length = bArr.length / 2;
        return ThreeDS2ServiceInstance(bArr, length, length);
    }

    public static int getWarnings(int i) {
        return i / 8;
    }

    public static byte[] initialize(int i, SecureRandom secureRandom) {
        if (secureRandom == null) {
            secureRandom = new SecureRandom();
        }
        byte[] bArr = new byte[i];
        secureRandom.nextBytes(bArr);
        return bArr;
    }
}
