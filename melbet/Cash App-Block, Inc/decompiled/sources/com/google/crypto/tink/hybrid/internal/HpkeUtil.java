package com.google.crypto.tink.hybrid.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.hybrid.HpkeParameters;
import com.google.crypto.tink.internal.Util;
import com.google.crypto.tink.subtle.EllipticCurves$CurveType;
import com.plaid.internal.EnumC0170g;
import java.nio.charset.Charset;

/* loaded from: classes4.dex */
public abstract class HpkeUtil {
    public static final byte[] AES_128_GCM_AEAD_ID;
    public static final byte[] AES_256_GCM_AEAD_ID;
    public static final byte[] BASE_MODE = intToByteArray(1, 0);
    public static final byte[] CHACHA20_POLY1305_AEAD_ID;
    public static final byte[] EMPTY_SALT;
    public static final byte[] HKDF_SHA256_KDF_ID;
    public static final byte[] HKDF_SHA384_KDF_ID;
    public static final byte[] HKDF_SHA512_KDF_ID;
    public static final byte[] HPKE;
    public static final byte[] HPKE_V1;
    public static final byte[] KEM;
    public static final byte[] P256_HKDF_SHA256_KEM_ID;
    public static final byte[] P384_HKDF_SHA384_KEM_ID;
    public static final byte[] P521_HKDF_SHA512_KEM_ID;
    public static final byte[] X25519_HKDF_SHA256_KEM_ID;

    static {
        intToByteArray(1, 2);
        X25519_HKDF_SHA256_KEM_ID = intToByteArray(2, 32);
        P256_HKDF_SHA256_KEM_ID = intToByteArray(2, 16);
        P384_HKDF_SHA384_KEM_ID = intToByteArray(2, 17);
        P521_HKDF_SHA512_KEM_ID = intToByteArray(2, 18);
        HKDF_SHA256_KDF_ID = intToByteArray(2, 1);
        HKDF_SHA384_KDF_ID = intToByteArray(2, 2);
        HKDF_SHA512_KDF_ID = intToByteArray(2, 3);
        AES_128_GCM_AEAD_ID = intToByteArray(2, 1);
        AES_256_GCM_AEAD_ID = intToByteArray(2, 2);
        CHACHA20_POLY1305_AEAD_ID = intToByteArray(2, 3);
        EMPTY_SALT = new byte[0];
        Charset charset = Util.UTF_8;
        KEM = "KEM".getBytes(charset);
        HPKE = "HPKE".getBytes(charset);
        HPKE_V1 = "HPKE-v1".getBytes(charset);
    }

    public static int getEncodedPrivateKeyLength(HpkeParameters.KemId kemId) {
        if (kemId == HpkeParameters.KemId.DHKEM_X25519_HKDF_SHA256 || kemId == HpkeParameters.KemId.DHKEM_P256_HKDF_SHA256) {
            return 32;
        }
        if (kemId == HpkeParameters.KemId.DHKEM_P384_HKDF_SHA384) {
            return 48;
        }
        if (kemId == HpkeParameters.KemId.DHKEM_P521_HKDF_SHA512) {
            return 66;
        }
        a$$ExternalSyntheticBUOutline0.m$6("Unrecognized HPKE KEM identifier");
        return 0;
    }

    public static int getEncodedPublicKeyLength(HpkeParameters.KemId kemId) {
        if (kemId == HpkeParameters.KemId.DHKEM_X25519_HKDF_SHA256) {
            return 32;
        }
        if (kemId == HpkeParameters.KemId.DHKEM_P256_HKDF_SHA256) {
            return 65;
        }
        if (kemId == HpkeParameters.KemId.DHKEM_P384_HKDF_SHA384) {
            return 97;
        }
        if (kemId == HpkeParameters.KemId.DHKEM_P521_HKDF_SHA512) {
            return EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE;
        }
        a$$ExternalSyntheticBUOutline0.m$6("Unrecognized HPKE KEM identifier");
        return 0;
    }

    public static byte[] intToByteArray(int i, int i2) {
        if (i > 4 || i < 0) {
            a$$ExternalSyntheticBUOutline0.m$3("capacity must be between 0 and 4");
            return null;
        }
        if (i2 < 0 || (i < 4 && i2 >= (1 << (i * 8)))) {
            a$$ExternalSyntheticBUOutline0.m$3("value too large");
            return null;
        }
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) ((i2 >> (((i - i3) - 1) * 8)) & 255);
        }
        return bArr;
    }

    public static EllipticCurves$CurveType nistHpkeKemToCurve(HpkeParameters.KemId kemId) {
        if (kemId == HpkeParameters.KemId.DHKEM_P256_HKDF_SHA256) {
            return EllipticCurves$CurveType.NIST_P256;
        }
        if (kemId == HpkeParameters.KemId.DHKEM_P384_HKDF_SHA384) {
            return EllipticCurves$CurveType.NIST_P384;
        }
        if (kemId == HpkeParameters.KemId.DHKEM_P521_HKDF_SHA512) {
            return EllipticCurves$CurveType.NIST_P521;
        }
        a$$ExternalSyntheticBUOutline0.m$6("Unrecognized NIST HPKE KEM identifier");
        return null;
    }
}
