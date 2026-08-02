package ru.CryptoPro.JCP.Cipher;

import android.R;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCSP.CStructReader.BlobHeaderStructure;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes4.dex */
public class InGostCipher {
    public static final int[] ZERO_KEY = {0, 0, 0, 0, 0, 0, 0, 0};
    public static final int[] Ccons = {577896553, 587516260, -1764017523, -1003820730, -1800602088, 302509312, -1025734976, 732515567};
    public static final int[] test_syncro = {1358476015, 1832923536};
    public static final int[] test_key = {857763156, 845964648, 543519593, 1651405683, 2036818208, 1953785705, 1701340531, 1933388832};
    public static final byte[] test_text = {84, 104, 105, 115, BlobHeaderStructure.BLOB_VERSION, 105, 115, BlobHeaderStructure.BLOB_VERSION, 109, 101, 115, 115, 97, 103, 101, Alerts.alert_certificate_revoked, BlobHeaderStructure.BLOB_VERSION, 108, 101, Alerts.alert_unsupported_extension, 103, 116, 104, 61, Alerts.alert_decrypt_error, Alerts.alert_decode_error, BlobHeaderStructure.BLOB_VERSION, 98, 121, 116, 101, 115};
    public static final byte[] simm_test_uz = {-52, Alerts.alert_internal_error, -68, -89, -42, 108, 19, PKIBody._CCR, 4, -2, 104, 48, 31, 72, 123, 122, 83, -63, 52, -62, 117, PKIBody._RP, -121, -24, DerValue.TAG_APPLICATION, -23, -16, -12, -99, -70, 69, Alerts.alert_unsupported_certificate, 56, -124, -98, 22, -7, -109, 1, 69, -18, -33, -42, -125, 39, 118, Alerts.alert_bad_certificate, Alerts.alert_certificate_unobtainable, -118, -89, -23, 93, 97, 34, -62, -36, -85, 21, -83, -111, -78, 59, 95, -71};
    public static final byte[] simm_test_rezult = {83, 121, -122, Alerts.alert_bad_certificate, PKIBody._RP, -77, DerValue.TAG_PRIVATE, 39, 48, Alerts.alert_protocol_version, 1, 115, DerValue.TAG_PRIVATE, 119, -81, 37, -22, DerValue.TAG_CONTEXT, -32, 67, PKIBody._CCR, 5, -113, 68, 125, -112, 73, -43, -100, -31, 4, 108};
    public static final int[] simm_H_TEST = {-2140075048, -315881027, 1091169585, 816472081, -1632904061, 602465670, 171552929, -379467200};
    public static final byte[] asimm_test_rezult = {-45, -65, 124, -48, -10, -106, 69, 37, -39, Alerts.alert_decrypt_error, -69, -90, 58, 26, Alerts.alert_bad_certificate_hash_value, -20, -47, -23, 39, -103, -70, -27, -49, -9, -22, 108, 67, -89, -7, -109, 91, -68};

    public static void cbc_decrypt(int[] iArr, int[] iArr2, int[] iArr3, int i, int[] iArr4, int i2, int[] iArr5) {
        int i3 = iArr2[0];
        int i4 = iArr2[1];
        simple_decrypt(iArr2, iArr3, i, iArr4, i2, iArr5);
        iArr2[0] = iArr2[0] ^ iArr[0];
        iArr2[1] = iArr2[1] ^ iArr[1];
        iArr[0] = i3;
        iArr[1] = i4;
    }

    public static void cbc_encrypt(int[] iArr, int[] iArr2, int[] iArr3, int i, int[] iArr4, int i2, int[] iArr5) {
        iArr[0] = iArr[0] ^ iArr2[0];
        iArr[1] = iArr[1] ^ iArr2[1];
        simple_encrypt(iArr, iArr3, i, iArr4, i2, iArr5);
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
    }

    public static void gamm_back_modul(int[] iArr, int i, int[] iArr2, int[] iArr3, int[] iArr4) {
        int i2 = 0;
        while (i2 < (i & (-2))) {
            gamm_encrypt_back_int(iArr2, iArr, i2, iArr3, iArr4);
            i2 += 2;
        }
        if ((i & 1) != 0) {
            int[] iArr5 = {iArr[i2], 0};
            gamm_encrypt_back_int(iArr2, iArr5, 0, iArr3, iArr4);
            iArr[i2] = iArr5[0];
            iArr5[1] = 0;
            iArr5[0] = 0;
        }
    }

    public static void gamm_crypt(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i, int[] iArr5, int i2, int[] iArr6) {
        int[] iArr7 = new int[2];
        get_gamma(iArr7, iArr, iArr4, i, iArr5, i2, iArr6);
        iArr3[0] = iArr2[0] ^ iArr7[0];
        iArr3[1] = iArr2[1] ^ iArr7[1];
    }

    public static void gamm_decrypt_back_int(int[] iArr, int[] iArr2, int[] iArr3, int i, int[] iArr4, int i2, int[] iArr5) {
        simple_encrypt(iArr, iArr3, i, iArr4, i2, iArr5);
        int i3 = iArr2[0];
        int i4 = iArr2[1];
        iArr2[0] = iArr[0] ^ i3;
        iArr2[1] = iArr[1] ^ i4;
        iArr[0] = i3;
        iArr[1] = i4;
    }

    public static void gamm_encrypt_back_int(int[] iArr, int[] iArr2, int i, int[] iArr3, int i2, int[] iArr4, int i3, int[] iArr5) {
        simple_encrypt(iArr, iArr3, i2, iArr4, i3, iArr5);
        iArr2[i] = iArr2[i] ^ iArr[0];
        int i4 = i + 1;
        iArr2[i4] = iArr2[i4] ^ iArr[1];
        iArr[0] = iArr2[i];
        iArr[1] = iArr2[i4];
    }

    public static void get_gamma(int[] iArr, int[] iArr2, int[] iArr3, int i, int[] iArr4, int i2, int[] iArr5) {
        int i3 = iArr2[0] + R.attr.cacheColorHint;
        iArr2[0] = i3;
        long j = (iArr2[1] << 32) >>> 32;
        long j2 = 16843012 + j;
        if ((4294967296L & j2) != 0) {
            j2 = 16843013 + j;
        }
        int i4 = (int) j2;
        iArr2[1] = i4;
        iArr[1] = i4;
        iArr[0] = i3;
        simple_encrypt(iArr, iArr3, i, iArr4, i2, iArr5);
    }

    public static void imita(int[] iArr, int[] iArr2, int i, int[] iArr3, int i2, int[] iArr4) {
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr2[i];
        int i6 = iArr2[i + 1];
        int i7 = iArr2[i + 2];
        int i8 = iArr2[i + 3];
        int i9 = iArr2[i + 4];
        int i10 = iArr2[i + 5];
        int i11 = iArr2[i + 6];
        int i12 = iArr2[i + 7];
        for (int i13 = 0; i13 < 2; i13++) {
            int i14 = (i3 + i5) - iArr3[i2];
            int i15 = (((i4 ^ iArr4[i14 & 255]) ^ iArr4[((i14 >>> 8) & 255) + 256]) ^ iArr4[((i14 >>> 16) & 255) + 512]) ^ iArr4[((i14 >>> 24) & 255) + 768];
            int i16 = (i15 + i6) - iArr3[i2 + 1];
            int i17 = (((i3 ^ iArr4[i16 & 255]) ^ iArr4[((i16 >>> 8) & 255) + 256]) ^ iArr4[((i16 >>> 16) & 255) + 512]) ^ iArr4[((i16 >>> 24) & 255) + 768];
            int i18 = (i17 + i7) - iArr3[i2 + 2];
            int i19 = (((i15 ^ iArr4[i18 & 255]) ^ iArr4[((i18 >>> 8) & 255) + 256]) ^ iArr4[((i18 >>> 16) & 255) + 512]) ^ iArr4[((i18 >>> 24) & 255) + 768];
            int i20 = (i19 + i8) - iArr3[i2 + 3];
            int i21 = (((i17 ^ iArr4[i20 & 255]) ^ iArr4[((i20 >>> 8) & 255) + 256]) ^ iArr4[((i20 >>> 16) & 255) + 512]) ^ iArr4[((i20 >>> 24) & 255) + 768];
            int i22 = (i21 + i9) - iArr3[i2 + 4];
            int i23 = (((i19 ^ iArr4[i22 & 255]) ^ iArr4[((i22 >>> 8) & 255) + 256]) ^ iArr4[((i22 >>> 16) & 255) + 512]) ^ iArr4[((i22 >>> 24) & 255) + 768];
            int i24 = (i23 + i10) - iArr3[i2 + 5];
            int i25 = (((i21 ^ iArr4[i24 & 255]) ^ iArr4[((i24 >>> 8) & 255) + 256]) ^ iArr4[((i24 >>> 16) & 255) + 512]) ^ iArr4[((i24 >>> 24) & 255) + 768];
            int i26 = (i25 + i11) - iArr3[i2 + 6];
            i4 = (((i23 ^ iArr4[i26 & 255]) ^ iArr4[((i26 >>> 8) & 255) + 256]) ^ iArr4[((i26 >>> 16) & 255) + 512]) ^ iArr4[((i26 >>> 24) & 255) + 768];
            int i27 = (i4 + i12) - iArr3[i2 + 7];
            i3 = (((i25 ^ iArr4[i27 & 255]) ^ iArr4[((i27 >>> 8) & 255) + 256]) ^ iArr4[((i27 >>> 16) & 255) + 512]) ^ iArr4[((i27 >>> 24) & 255) + 768];
        }
        iArr[0] = i3;
        iArr[1] = i4;
    }

    public static void simple_crypt_key(int[] iArr, int i, int i2, int[] iArr2, int[] iArr3, int i3, int[] iArr4, int i4, int[] iArr5) {
        for (int i5 = 0; i5 < i2; i5 += 2) {
            int i6 = i + i5;
            int[] iArr6 = {iArr[i6], iArr[i6 + 1]};
            simple_encrypt(iArr6, iArr3, i3, iArr4, i4, iArr5);
            iArr2[i5] = iArr6[0];
            iArr2[i5 + 1] = iArr6[1];
        }
    }

    public static void simple_decrypt(int[] iArr, int[] iArr2, int i, int[] iArr3, int i2, int[] iArr4) {
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr2[i];
        int i6 = iArr2[i + 1];
        int i7 = iArr2[i + 2];
        int i8 = iArr2[i + 3];
        int i9 = iArr2[i + 4];
        int i10 = iArr2[i + 5];
        int i11 = iArr2[i + 6];
        int i12 = iArr2[i + 7];
        int i13 = (i3 + i5) - iArr3[i2];
        int i14 = (((i4 ^ iArr4[i13 & 255]) ^ iArr4[((i13 >>> 8) & 255) + 256]) ^ iArr4[((i13 >>> 16) & 255) + 512]) ^ iArr4[((i13 >>> 24) & 255) + 768];
        int i15 = i2 + 1;
        int i16 = (i14 + i6) - iArr3[i15];
        int i17 = (((i3 ^ iArr4[i16 & 255]) ^ iArr4[((i16 >>> 8) & 255) + 256]) ^ iArr4[((i16 >>> 16) & 255) + 512]) ^ iArr4[((i16 >>> 24) & 255) + 768];
        int i18 = i2 + 2;
        int i19 = (i17 + i7) - iArr3[i18];
        int i20 = (((i14 ^ iArr4[i19 & 255]) ^ iArr4[((i19 >>> 8) & 255) + 256]) ^ iArr4[((i19 >>> 16) & 255) + 512]) ^ iArr4[((i19 >>> 24) & 255) + 768];
        int i21 = i2 + 3;
        int i22 = (i20 + i8) - iArr3[i21];
        int i23 = (((iArr4[i22 & 255] ^ i17) ^ iArr4[((i22 >>> 8) & 255) + 256]) ^ iArr4[((i22 >>> 16) & 255) + 512]) ^ iArr4[((i22 >>> 24) & 255) + 768];
        int i24 = i2 + 4;
        int i25 = (i23 + i9) - iArr3[i24];
        int i26 = iArr4[((i25 >>> 24) & 255) + 768] ^ (((iArr4[i25 & 255] ^ i20) ^ iArr4[((i25 >>> 8) & 255) + 256]) ^ iArr4[((i25 >>> 16) & 255) + 512]);
        int i27 = i2 + 5;
        int i28 = (i26 + i10) - iArr3[i27];
        int i29 = (((i23 ^ iArr4[i28 & 255]) ^ iArr4[((i28 >>> 8) & 255) + 256]) ^ iArr4[((i28 >>> 16) & 255) + 512]) ^ iArr4[((i28 >>> 24) & 255) + 768];
        int i30 = i2 + 6;
        int i31 = (i29 + i11) - iArr3[i30];
        int i32 = (((iArr4[i31 & 255] ^ i26) ^ iArr4[((i31 >>> 8) & 255) + 256]) ^ iArr4[((i31 >>> 16) & 255) + 512]) ^ iArr4[((i31 >>> 24) & 255) + 768];
        int i33 = i2 + 7;
        int i34 = (i32 + i12) - iArr3[i33];
        int i35 = i32;
        int i36 = (((i29 ^ iArr4[i34 & 255]) ^ iArr4[((i34 >>> 8) & 255) + 256]) ^ iArr4[((i34 >>> 16) & 255) + 512]) ^ iArr4[((i34 >>> 24) & 255) + 768];
        int i37 = 0;
        while (i37 < 3) {
            int i38 = (i36 + i12) - iArr3[i33];
            int i39 = i37;
            int i40 = (((i35 ^ iArr4[i38 & 255]) ^ iArr4[((i38 >>> 8) & 255) + 256]) ^ iArr4[((i38 >>> 16) & 255) + 512]) ^ iArr4[((i38 >>> 24) & 255) + 768];
            int i41 = (i40 + i11) - iArr3[i30];
            int i42 = (((i36 ^ iArr4[i41 & 255]) ^ iArr4[((i41 >>> 8) & 255) + 256]) ^ iArr4[((i41 >>> 16) & 255) + 512]) ^ iArr4[((i41 >>> 24) & 255) + 768];
            int i43 = (i42 + i10) - iArr3[i27];
            int i44 = (((i40 ^ iArr4[i43 & 255]) ^ iArr4[((i43 >>> 8) & 255) + 256]) ^ iArr4[((i43 >>> 16) & 255) + 512]) ^ iArr4[((i43 >>> 24) & 255) + 768];
            int i45 = (i44 + i9) - iArr3[i24];
            int i46 = (((i42 ^ iArr4[i45 & 255]) ^ iArr4[((i45 >>> 8) & 255) + 256]) ^ iArr4[((i45 >>> 16) & 255) + 512]) ^ iArr4[((i45 >>> 24) & 255) + 768];
            int i47 = (i46 + i8) - iArr3[i21];
            int i48 = (((i44 ^ iArr4[i47 & 255]) ^ iArr4[((i47 >>> 8) & 255) + 256]) ^ iArr4[((i47 >>> 16) & 255) + 512]) ^ iArr4[((i47 >>> 24) & 255) + 768];
            int i49 = (i48 + i7) - iArr3[i18];
            int i50 = (((i46 ^ iArr4[i49 & 255]) ^ iArr4[((i49 >>> 8) & 255) + 256]) ^ iArr4[((i49 >>> 16) & 255) + 512]) ^ iArr4[((i49 >>> 24) & 255) + 768];
            int i51 = (i50 + i6) - iArr3[i15];
            int i52 = (((i48 ^ iArr4[i51 & 255]) ^ iArr4[((i51 >>> 8) & 255) + 256]) ^ iArr4[((i51 >>> 16) & 255) + 512]) ^ iArr4[((i51 >>> 24) & 255) + 768];
            int i53 = (i52 + i5) - iArr3[i2];
            i35 = i52;
            i36 = (((i50 ^ iArr4[i53 & 255]) ^ iArr4[((i53 >>> 8) & 255) + 256]) ^ iArr4[((i53 >>> 16) & 255) + 512]) ^ iArr4[((i53 >>> 24) & 255) + 768];
            i37 = i39 + 1;
        }
        iArr[0] = i35;
        iArr[1] = i36;
    }

    public static void simple_decrypt_key(int[] iArr, int[] iArr2, int i, int[] iArr3, int i2, int[] iArr4, int i3, int[] iArr5) {
        for (int i4 = 0; i4 < iArr.length; i4 += 2) {
            int[] iArr6 = {iArr[i4], iArr[i4 + 1]};
            simple_decrypt(iArr6, iArr3, i2, iArr4, i3, iArr5);
            int i5 = i + i4;
            iArr2[i5] = iArr6[0];
            iArr2[i5 + 1] = iArr6[1];
        }
    }

    public static void simple_encrypt(int[] iArr, int[] iArr2, int i, int[] iArr3, int i2, int[] iArr4) {
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr2[i];
        int i6 = iArr2[i + 1];
        int i7 = iArr2[i + 2];
        int i8 = iArr2[i + 3];
        int i9 = iArr2[i + 4];
        int i10 = iArr2[i + 5];
        int i11 = iArr2[i + 6];
        int i12 = iArr2[i + 7];
        for (int i13 = 0; i13 < 3; i13++) {
            int i14 = (i3 + i5) - iArr3[i2];
            int i15 = (((i4 ^ iArr4[i14 & 255]) ^ iArr4[((i14 >>> 8) & 255) + 256]) ^ iArr4[((i14 >>> 16) & 255) + 512]) ^ iArr4[((i14 >>> 24) & 255) + 768];
            int i16 = (i15 + i6) - iArr3[i2 + 1];
            int i17 = (((i3 ^ iArr4[i16 & 255]) ^ iArr4[((i16 >>> 8) & 255) + 256]) ^ iArr4[((i16 >>> 16) & 255) + 512]) ^ iArr4[((i16 >>> 24) & 255) + 768];
            int i18 = (i17 + i7) - iArr3[i2 + 2];
            int i19 = (((i15 ^ iArr4[i18 & 255]) ^ iArr4[((i18 >>> 8) & 255) + 256]) ^ iArr4[((i18 >>> 16) & 255) + 512]) ^ iArr4[((i18 >>> 24) & 255) + 768];
            int i20 = (i19 + i8) - iArr3[i2 + 3];
            int i21 = (((i17 ^ iArr4[i20 & 255]) ^ iArr4[((i20 >>> 8) & 255) + 256]) ^ iArr4[((i20 >>> 16) & 255) + 512]) ^ iArr4[((i20 >>> 24) & 255) + 768];
            int i22 = (i21 + i9) - iArr3[i2 + 4];
            int i23 = (((i19 ^ iArr4[i22 & 255]) ^ iArr4[((i22 >>> 8) & 255) + 256]) ^ iArr4[((i22 >>> 16) & 255) + 512]) ^ iArr4[((i22 >>> 24) & 255) + 768];
            int i24 = (i23 + i10) - iArr3[i2 + 5];
            int i25 = (((i21 ^ iArr4[i24 & 255]) ^ iArr4[((i24 >>> 8) & 255) + 256]) ^ iArr4[((i24 >>> 16) & 255) + 512]) ^ iArr4[((i24 >>> 24) & 255) + 768];
            int i26 = (i25 + i11) - iArr3[i2 + 6];
            i4 = (((i23 ^ iArr4[i26 & 255]) ^ iArr4[((i26 >>> 8) & 255) + 256]) ^ iArr4[((i26 >>> 16) & 255) + 512]) ^ iArr4[((i26 >>> 24) & 255) + 768];
            int i27 = (i4 + i12) - iArr3[i2 + 7];
            i3 = (((i25 ^ iArr4[i27 & 255]) ^ iArr4[((i27 >>> 8) & 255) + 256]) ^ iArr4[((i27 >>> 16) & 255) + 512]) ^ iArr4[((i27 >>> 24) & 255) + 768];
        }
        int i28 = (i12 + i3) - iArr3[i2 + 7];
        int i29 = (((i4 ^ iArr4[i28 & 255]) ^ iArr4[((i28 >>> 8) & 255) + 256]) ^ iArr4[((i28 >>> 16) & 255) + 512]) ^ iArr4[((i28 >>> 24) & 255) + 768];
        int i30 = (i11 + i29) - iArr3[i2 + 6];
        int i31 = (((i3 ^ iArr4[i30 & 255]) ^ iArr4[((i30 >>> 8) & 255) + 256]) ^ iArr4[((i30 >>> 16) & 255) + 512]) ^ iArr4[((i30 >>> 24) & 255) + 768];
        int i32 = (i10 + i31) - iArr3[i2 + 5];
        int i33 = (((i29 ^ iArr4[i32 & 255]) ^ iArr4[((i32 >>> 8) & 255) + 256]) ^ iArr4[((i32 >>> 16) & 255) + 512]) ^ iArr4[((i32 >>> 24) & 255) + 768];
        int i34 = (i9 + i33) - iArr3[i2 + 4];
        int i35 = (((i31 ^ iArr4[i34 & 255]) ^ iArr4[((i34 >>> 8) & 255) + 256]) ^ iArr4[((i34 >>> 16) & 255) + 512]) ^ iArr4[((i34 >>> 24) & 255) + 768];
        int i36 = (i8 + i35) - iArr3[i2 + 3];
        int i37 = (((i33 ^ iArr4[i36 & 255]) ^ iArr4[((i36 >>> 8) & 255) + 256]) ^ iArr4[((i36 >>> 16) & 255) + 512]) ^ iArr4[((i36 >>> 24) & 255) + 768];
        int i38 = (i7 + i37) - iArr3[i2 + 2];
        int i39 = (((i35 ^ iArr4[i38 & 255]) ^ iArr4[((i38 >>> 8) & 255) + 256]) ^ iArr4[((i38 >>> 16) & 255) + 512]) ^ iArr4[((i38 >>> 24) & 255) + 768];
        int i40 = (i6 + i39) - iArr3[i2 + 1];
        int i41 = (((i37 ^ iArr4[i40 & 255]) ^ iArr4[((i40 >>> 8) & 255) + 256]) ^ iArr4[((i40 >>> 16) & 255) + 512]) ^ iArr4[((i40 >>> 24) & 255) + 768];
        int i42 = (i5 + i41) - iArr3[i2];
        int i43 = (((i39 ^ iArr4[i42 & 255]) ^ iArr4[((i42 >>> 8) & 255) + 256]) ^ iArr4[((i42 >>> 16) & 255) + 512]) ^ iArr4[((i42 >>> 24) & 255) + 768];
        iArr[0] = i41;
        iArr[1] = i43;
    }

    public static void gamm_encrypt_back_int(int[] iArr, int[] iArr2, int i, int[] iArr3, int[] iArr4) {
        simple_encrypt(iArr, iArr3, iArr4);
        iArr2[i] = iArr2[i] ^ iArr[0];
        int i2 = i + 1;
        iArr2[i2] = iArr2[i2] ^ iArr[1];
        iArr[0] = iArr2[i];
        iArr[1] = iArr2[i2];
    }

    public static void simple_encrypt(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr2[0];
        int i4 = iArr2[1];
        int i5 = iArr2[2];
        int i6 = iArr2[3];
        int i7 = iArr2[4];
        int i8 = iArr2[5];
        int i9 = iArr2[6];
        int i10 = iArr2[7];
        for (int i11 = 0; i11 < 3; i11++) {
            int i12 = i + i3;
            int i13 = (((i2 ^ iArr3[i12 & 255]) ^ iArr3[((i12 >>> 8) & 255) + 256]) ^ iArr3[((i12 >>> 16) & 255) + 512]) ^ iArr3[((i12 >>> 24) & 255) + 768];
            int i14 = i13 + i4;
            int i15 = (((i ^ iArr3[i14 & 255]) ^ iArr3[((i14 >>> 8) & 255) + 256]) ^ iArr3[((i14 >>> 16) & 255) + 512]) ^ iArr3[((i14 >>> 24) & 255) + 768];
            int i16 = i15 + i5;
            int i17 = (((i13 ^ iArr3[i16 & 255]) ^ iArr3[((i16 >>> 8) & 255) + 256]) ^ iArr3[((i16 >>> 16) & 255) + 512]) ^ iArr3[((i16 >>> 24) & 255) + 768];
            int i18 = i17 + i6;
            int i19 = (((i15 ^ iArr3[i18 & 255]) ^ iArr3[((i18 >>> 8) & 255) + 256]) ^ iArr3[((i18 >>> 16) & 255) + 512]) ^ iArr3[((i18 >>> 24) & 255) + 768];
            int i20 = i19 + i7;
            int i21 = (((i17 ^ iArr3[i20 & 255]) ^ iArr3[((i20 >>> 8) & 255) + 256]) ^ iArr3[((i20 >>> 16) & 255) + 512]) ^ iArr3[((i20 >>> 24) & 255) + 768];
            int i22 = i21 + i8;
            int i23 = (((i19 ^ iArr3[i22 & 255]) ^ iArr3[((i22 >>> 8) & 255) + 256]) ^ iArr3[((i22 >>> 16) & 255) + 512]) ^ iArr3[((i22 >>> 24) & 255) + 768];
            int i24 = i23 + i9;
            i2 = (((i21 ^ iArr3[i24 & 255]) ^ iArr3[((i24 >>> 8) & 255) + 256]) ^ iArr3[((i24 >>> 16) & 255) + 512]) ^ iArr3[((i24 >>> 24) & 255) + 768];
            int i25 = i2 + i10;
            i = (((i23 ^ iArr3[i25 & 255]) ^ iArr3[((i25 >>> 8) & 255) + 256]) ^ iArr3[((i25 >>> 16) & 255) + 512]) ^ iArr3[((i25 >>> 24) & 255) + 768];
        }
        int i26 = i10 + i;
        int i27 = (((i2 ^ iArr3[i26 & 255]) ^ iArr3[((i26 >>> 8) & 255) + 256]) ^ iArr3[((i26 >>> 16) & 255) + 512]) ^ iArr3[((i26 >>> 24) & 255) + 768];
        int i28 = i9 + i27;
        int i29 = (((i ^ iArr3[i28 & 255]) ^ iArr3[((i28 >>> 8) & 255) + 256]) ^ iArr3[((i28 >>> 16) & 255) + 512]) ^ iArr3[((i28 >>> 24) & 255) + 768];
        int i30 = i8 + i29;
        int i31 = (((i27 ^ iArr3[i30 & 255]) ^ iArr3[((i30 >>> 8) & 255) + 256]) ^ iArr3[((i30 >>> 16) & 255) + 512]) ^ iArr3[((i30 >>> 24) & 255) + 768];
        int i32 = i7 + i31;
        int i33 = (((i29 ^ iArr3[i32 & 255]) ^ iArr3[((i32 >>> 8) & 255) + 256]) ^ iArr3[((i32 >>> 16) & 255) + 512]) ^ iArr3[((i32 >>> 24) & 255) + 768];
        int i34 = i6 + i33;
        int i35 = (((i31 ^ iArr3[i34 & 255]) ^ iArr3[((i34 >>> 8) & 255) + 256]) ^ iArr3[((i34 >>> 16) & 255) + 512]) ^ iArr3[((i34 >>> 24) & 255) + 768];
        int i36 = i5 + i35;
        int i37 = (((i33 ^ iArr3[i36 & 255]) ^ iArr3[((i36 >>> 8) & 255) + 256]) ^ iArr3[((i36 >>> 16) & 255) + 512]) ^ iArr3[((i36 >>> 24) & 255) + 768];
        int i38 = i4 + i37;
        int i39 = (((i35 ^ iArr3[i38 & 255]) ^ iArr3[((i38 >>> 8) & 255) + 256]) ^ iArr3[((i38 >>> 16) & 255) + 512]) ^ iArr3[((i38 >>> 24) & 255) + 768];
        int i40 = i3 + i39;
        int i41 = (((i37 ^ iArr3[i40 & 255]) ^ iArr3[((i40 >>> 8) & 255) + 256]) ^ iArr3[((i40 >>> 16) & 255) + 512]) ^ iArr3[((i40 >>> 24) & 255) + 768];
        iArr[0] = i39;
        iArr[1] = i41;
    }
}
