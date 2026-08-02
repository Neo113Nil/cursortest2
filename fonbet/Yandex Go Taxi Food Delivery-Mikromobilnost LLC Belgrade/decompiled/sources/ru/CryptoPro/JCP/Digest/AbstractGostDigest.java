package ru.CryptoPro.JCP.Digest;

import defpackage.av61;
import java.security.MessageDigest;
import java.security.SignatureException;
import ru.CryptoPro.JCP.params.OID;

/* loaded from: classes4.dex */
public abstract class AbstractGostDigest extends MessageDigest implements Cloneable, av61 {
    public void a(int[] iArr, int[] iArr2) {
        boolean z = false;
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
        int i11 = 0;
        while (true) {
            int[] iArr3 = av61.r5;
            if (i11 >= 3) {
                boolean z2 = z;
                int i12 = i10 + i;
                int i13 = (((iArr3[i12 & 255] ^ i2) ^ iArr3[((i12 >>> 8) & 255) + 256]) ^ iArr3[((i12 >>> 16) & 255) + 512]) ^ iArr3[((i12 >>> 24) & 255) + 768];
                int i14 = i9 + i13;
                int i15 = (((i ^ iArr3[i14 & 255]) ^ iArr3[((i14 >>> 8) & 255) + 256]) ^ iArr3[((i14 >>> 16) & 255) + 512]) ^ iArr3[((i14 >>> 24) & 255) + 768];
                int i16 = i8 + i15;
                int i17 = (((i13 ^ iArr3[i16 & 255]) ^ iArr3[((i16 >>> 8) & 255) + 256]) ^ iArr3[((i16 >>> 16) & 255) + 512]) ^ iArr3[((i16 >>> 24) & 255) + 768];
                int i18 = i7 + i17;
                int i19 = (((i15 ^ iArr3[i18 & 255]) ^ iArr3[((i18 >>> 8) & 255) + 256]) ^ iArr3[((i18 >>> 16) & 255) + 512]) ^ iArr3[((i18 >>> 24) & 255) + 768];
                int i20 = i6 + i19;
                int i21 = (((i17 ^ iArr3[i20 & 255]) ^ iArr3[((i20 >>> 8) & 255) + 256]) ^ iArr3[((i20 >>> 16) & 255) + 512]) ^ iArr3[((i20 >>> 24) & 255) + 768];
                int i22 = i5 + i21;
                int i23 = (((i19 ^ iArr3[i22 & 255]) ^ iArr3[((i22 >>> 8) & 255) + 256]) ^ iArr3[((i22 >>> 16) & 255) + 512]) ^ iArr3[((i22 >>> 24) & 255) + 768];
                int i24 = i4 + i23;
                int i25 = (((i21 ^ iArr3[i24 & 255]) ^ iArr3[((i24 >>> 8) & 255) + 256]) ^ iArr3[((i24 >>> 16) & 255) + 512]) ^ iArr3[((i24 >>> 24) & 255) + 768];
                int i26 = i3 + i25;
                int i27 = (((i23 ^ iArr3[i26 & 255]) ^ iArr3[((i26 >>> 8) & 255) + 256]) ^ iArr3[((i26 >>> 16) & 255) + 512]) ^ iArr3[((i26 >>> 24) & 255) + 768];
                iArr[z2 ? 1 : 0] = i25;
                iArr[1] = i27;
                return;
            }
            int i28 = i + i3;
            boolean z3 = z;
            int i29 = (((iArr3[i28 & 255] ^ i2) ^ iArr3[((i28 >>> 8) & 255) + 256]) ^ iArr3[((i28 >>> 16) & 255) + 512]) ^ iArr3[((i28 >>> 24) & 255) + 768];
            int i30 = i29 + i4;
            int i31 = (((i ^ iArr3[i30 & 255]) ^ iArr3[((i30 >>> 8) & 255) + 256]) ^ iArr3[((i30 >>> 16) & 255) + 512]) ^ iArr3[((i30 >>> 24) & 255) + 768];
            int i32 = i31 + i5;
            int i33 = (((i29 ^ iArr3[i32 & 255]) ^ iArr3[((i32 >>> 8) & 255) + 256]) ^ iArr3[((i32 >>> 16) & 255) + 512]) ^ iArr3[((i32 >>> 24) & 255) + 768];
            int i34 = i33 + i6;
            int i35 = (((i31 ^ iArr3[i34 & 255]) ^ iArr3[((i34 >>> 8) & 255) + 256]) ^ iArr3[((i34 >>> 16) & 255) + 512]) ^ iArr3[((i34 >>> 24) & 255) + 768];
            int i36 = i35 + i7;
            int i37 = (((i33 ^ iArr3[i36 & 255]) ^ iArr3[((i36 >>> 8) & 255) + 256]) ^ iArr3[((i36 >>> 16) & 255) + 512]) ^ iArr3[((i36 >>> 24) & 255) + 768];
            int i38 = i37 + i8;
            int i39 = (((i35 ^ iArr3[i38 & 255]) ^ iArr3[((i38 >>> 8) & 255) + 256]) ^ iArr3[((i38 >>> 16) & 255) + 512]) ^ iArr3[((i38 >>> 24) & 255) + 768];
            int i40 = i39 + i9;
            i2 = iArr3[((i40 >>> 24) & 255) + 768] ^ (((i37 ^ iArr3[i40 & 255]) ^ iArr3[((i40 >>> 8) & 255) + 256]) ^ iArr3[((i40 >>> 16) & 255) + 512]);
            int i41 = i2 + i10;
            i = (((i39 ^ iArr3[i41 & 255]) ^ iArr3[((i41 >>> 8) & 255) + 256]) ^ iArr3[((i41 >>> 16) & 255) + 512]) ^ iArr3[((i41 >>> 24) & 255) + 768];
            i11++;
            z = z3;
        }
    }

    public void b(int[] iArr, int[] iArr2) {
        boolean z = false;
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
        int i11 = 0;
        while (true) {
            int[] iArr3 = av61.q5;
            if (i11 >= 3) {
                boolean z2 = z;
                int i12 = i10 + i;
                int i13 = (((iArr3[i12 & 255] ^ i2) ^ iArr3[((i12 >>> 8) & 255) + 256]) ^ iArr3[((i12 >>> 16) & 255) + 512]) ^ iArr3[((i12 >>> 24) & 255) + 768];
                int i14 = i9 + i13;
                int i15 = (((i ^ iArr3[i14 & 255]) ^ iArr3[((i14 >>> 8) & 255) + 256]) ^ iArr3[((i14 >>> 16) & 255) + 512]) ^ iArr3[((i14 >>> 24) & 255) + 768];
                int i16 = i8 + i15;
                int i17 = (((i13 ^ iArr3[i16 & 255]) ^ iArr3[((i16 >>> 8) & 255) + 256]) ^ iArr3[((i16 >>> 16) & 255) + 512]) ^ iArr3[((i16 >>> 24) & 255) + 768];
                int i18 = i7 + i17;
                int i19 = (((i15 ^ iArr3[i18 & 255]) ^ iArr3[((i18 >>> 8) & 255) + 256]) ^ iArr3[((i18 >>> 16) & 255) + 512]) ^ iArr3[((i18 >>> 24) & 255) + 768];
                int i20 = i6 + i19;
                int i21 = (((i17 ^ iArr3[i20 & 255]) ^ iArr3[((i20 >>> 8) & 255) + 256]) ^ iArr3[((i20 >>> 16) & 255) + 512]) ^ iArr3[((i20 >>> 24) & 255) + 768];
                int i22 = i5 + i21;
                int i23 = (((i19 ^ iArr3[i22 & 255]) ^ iArr3[((i22 >>> 8) & 255) + 256]) ^ iArr3[((i22 >>> 16) & 255) + 512]) ^ iArr3[((i22 >>> 24) & 255) + 768];
                int i24 = i4 + i23;
                int i25 = (((i21 ^ iArr3[i24 & 255]) ^ iArr3[((i24 >>> 8) & 255) + 256]) ^ iArr3[((i24 >>> 16) & 255) + 512]) ^ iArr3[((i24 >>> 24) & 255) + 768];
                int i26 = i3 + i25;
                int i27 = (((i23 ^ iArr3[i26 & 255]) ^ iArr3[((i26 >>> 8) & 255) + 256]) ^ iArr3[((i26 >>> 16) & 255) + 512]) ^ iArr3[((i26 >>> 24) & 255) + 768];
                iArr[z2 ? 1 : 0] = i25;
                iArr[1] = i27;
                return;
            }
            int i28 = i + i3;
            boolean z3 = z;
            int i29 = (((iArr3[i28 & 255] ^ i2) ^ iArr3[((i28 >>> 8) & 255) + 256]) ^ iArr3[((i28 >>> 16) & 255) + 512]) ^ iArr3[((i28 >>> 24) & 255) + 768];
            int i30 = i29 + i4;
            int i31 = (((i ^ iArr3[i30 & 255]) ^ iArr3[((i30 >>> 8) & 255) + 256]) ^ iArr3[((i30 >>> 16) & 255) + 512]) ^ iArr3[((i30 >>> 24) & 255) + 768];
            int i32 = i31 + i5;
            int i33 = (((i29 ^ iArr3[i32 & 255]) ^ iArr3[((i32 >>> 8) & 255) + 256]) ^ iArr3[((i32 >>> 16) & 255) + 512]) ^ iArr3[((i32 >>> 24) & 255) + 768];
            int i34 = i33 + i6;
            int i35 = (((i31 ^ iArr3[i34 & 255]) ^ iArr3[((i34 >>> 8) & 255) + 256]) ^ iArr3[((i34 >>> 16) & 255) + 512]) ^ iArr3[((i34 >>> 24) & 255) + 768];
            int i36 = i35 + i7;
            int i37 = (((i33 ^ iArr3[i36 & 255]) ^ iArr3[((i36 >>> 8) & 255) + 256]) ^ iArr3[((i36 >>> 16) & 255) + 512]) ^ iArr3[((i36 >>> 24) & 255) + 768];
            int i38 = i37 + i8;
            int i39 = (((i35 ^ iArr3[i38 & 255]) ^ iArr3[((i38 >>> 8) & 255) + 256]) ^ iArr3[((i38 >>> 16) & 255) + 512]) ^ iArr3[((i38 >>> 24) & 255) + 768];
            int i40 = i39 + i9;
            i2 = iArr3[((i40 >>> 24) & 255) + 768] ^ (((i37 ^ iArr3[i40 & 255]) ^ iArr3[((i40 >>> 8) & 255) + 256]) ^ iArr3[((i40 >>> 16) & 255) + 512]);
            int i41 = i2 + i10;
            i = (((i39 ^ iArr3[i41 & 255]) ^ iArr3[((i41 >>> 8) & 255) + 256]) ^ iArr3[((i41 >>> 16) & 255) + 512]) ^ iArr3[((i41 >>> 24) & 255) + 768];
            i11++;
            z = z3;
        }
    }

    public void c(int[] iArr, int[] iArr2) {
        boolean z = false;
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
        int i11 = 0;
        while (true) {
            int[] iArr3 = av61.s5;
            if (i11 >= 3) {
                boolean z2 = z;
                int i12 = i10 + i;
                int i13 = (((iArr3[i12 & 255] ^ i2) ^ iArr3[((i12 >>> 8) & 255) + 256]) ^ iArr3[((i12 >>> 16) & 255) + 512]) ^ iArr3[((i12 >>> 24) & 255) + 768];
                int i14 = i9 + i13;
                int i15 = (((i ^ iArr3[i14 & 255]) ^ iArr3[((i14 >>> 8) & 255) + 256]) ^ iArr3[((i14 >>> 16) & 255) + 512]) ^ iArr3[((i14 >>> 24) & 255) + 768];
                int i16 = i8 + i15;
                int i17 = (((i13 ^ iArr3[i16 & 255]) ^ iArr3[((i16 >>> 8) & 255) + 256]) ^ iArr3[((i16 >>> 16) & 255) + 512]) ^ iArr3[((i16 >>> 24) & 255) + 768];
                int i18 = i7 + i17;
                int i19 = (((i15 ^ iArr3[i18 & 255]) ^ iArr3[((i18 >>> 8) & 255) + 256]) ^ iArr3[((i18 >>> 16) & 255) + 512]) ^ iArr3[((i18 >>> 24) & 255) + 768];
                int i20 = i6 + i19;
                int i21 = (((i17 ^ iArr3[i20 & 255]) ^ iArr3[((i20 >>> 8) & 255) + 256]) ^ iArr3[((i20 >>> 16) & 255) + 512]) ^ iArr3[((i20 >>> 24) & 255) + 768];
                int i22 = i5 + i21;
                int i23 = (((i19 ^ iArr3[i22 & 255]) ^ iArr3[((i22 >>> 8) & 255) + 256]) ^ iArr3[((i22 >>> 16) & 255) + 512]) ^ iArr3[((i22 >>> 24) & 255) + 768];
                int i24 = i4 + i23;
                int i25 = (((i21 ^ iArr3[i24 & 255]) ^ iArr3[((i24 >>> 8) & 255) + 256]) ^ iArr3[((i24 >>> 16) & 255) + 512]) ^ iArr3[((i24 >>> 24) & 255) + 768];
                int i26 = i3 + i25;
                int i27 = (((i23 ^ iArr3[i26 & 255]) ^ iArr3[((i26 >>> 8) & 255) + 256]) ^ iArr3[((i26 >>> 16) & 255) + 512]) ^ iArr3[((i26 >>> 24) & 255) + 768];
                iArr[z2 ? 1 : 0] = i25;
                iArr[1] = i27;
                return;
            }
            int i28 = i + i3;
            boolean z3 = z;
            int i29 = (((iArr3[i28 & 255] ^ i2) ^ iArr3[((i28 >>> 8) & 255) + 256]) ^ iArr3[((i28 >>> 16) & 255) + 512]) ^ iArr3[((i28 >>> 24) & 255) + 768];
            int i30 = i29 + i4;
            int i31 = (((i ^ iArr3[i30 & 255]) ^ iArr3[((i30 >>> 8) & 255) + 256]) ^ iArr3[((i30 >>> 16) & 255) + 512]) ^ iArr3[((i30 >>> 24) & 255) + 768];
            int i32 = i31 + i5;
            int i33 = (((i29 ^ iArr3[i32 & 255]) ^ iArr3[((i32 >>> 8) & 255) + 256]) ^ iArr3[((i32 >>> 16) & 255) + 512]) ^ iArr3[((i32 >>> 24) & 255) + 768];
            int i34 = i33 + i6;
            int i35 = (((i31 ^ iArr3[i34 & 255]) ^ iArr3[((i34 >>> 8) & 255) + 256]) ^ iArr3[((i34 >>> 16) & 255) + 512]) ^ iArr3[((i34 >>> 24) & 255) + 768];
            int i36 = i35 + i7;
            int i37 = (((i33 ^ iArr3[i36 & 255]) ^ iArr3[((i36 >>> 8) & 255) + 256]) ^ iArr3[((i36 >>> 16) & 255) + 512]) ^ iArr3[((i36 >>> 24) & 255) + 768];
            int i38 = i37 + i8;
            int i39 = (((i35 ^ iArr3[i38 & 255]) ^ iArr3[((i38 >>> 8) & 255) + 256]) ^ iArr3[((i38 >>> 16) & 255) + 512]) ^ iArr3[((i38 >>> 24) & 255) + 768];
            int i40 = i39 + i9;
            i2 = iArr3[((i40 >>> 24) & 255) + 768] ^ (((i37 ^ iArr3[i40 & 255]) ^ iArr3[((i40 >>> 8) & 255) + 256]) ^ iArr3[((i40 >>> 16) & 255) + 512]);
            int i41 = i2 + i10;
            i = (((i39 ^ iArr3[i41 & 255]) ^ iArr3[((i41 >>> 8) & 255) + 256]) ^ iArr3[((i41 >>> 16) & 255) + 512]) ^ iArr3[((i41 >>> 24) & 255) + 768];
            i11++;
            z = z3;
        }
    }

    public void d(int[] iArr, int[] iArr2) {
        boolean z = false;
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
        int i11 = 0;
        while (true) {
            int[] iArr3 = av61.t5;
            if (i11 >= 3) {
                boolean z2 = z;
                int i12 = i10 + i;
                int i13 = (((iArr3[i12 & 255] ^ i2) ^ iArr3[((i12 >>> 8) & 255) + 256]) ^ iArr3[((i12 >>> 16) & 255) + 512]) ^ iArr3[((i12 >>> 24) & 255) + 768];
                int i14 = i9 + i13;
                int i15 = (((i ^ iArr3[i14 & 255]) ^ iArr3[((i14 >>> 8) & 255) + 256]) ^ iArr3[((i14 >>> 16) & 255) + 512]) ^ iArr3[((i14 >>> 24) & 255) + 768];
                int i16 = i8 + i15;
                int i17 = (((i13 ^ iArr3[i16 & 255]) ^ iArr3[((i16 >>> 8) & 255) + 256]) ^ iArr3[((i16 >>> 16) & 255) + 512]) ^ iArr3[((i16 >>> 24) & 255) + 768];
                int i18 = i7 + i17;
                int i19 = (((i15 ^ iArr3[i18 & 255]) ^ iArr3[((i18 >>> 8) & 255) + 256]) ^ iArr3[((i18 >>> 16) & 255) + 512]) ^ iArr3[((i18 >>> 24) & 255) + 768];
                int i20 = i6 + i19;
                int i21 = (((i17 ^ iArr3[i20 & 255]) ^ iArr3[((i20 >>> 8) & 255) + 256]) ^ iArr3[((i20 >>> 16) & 255) + 512]) ^ iArr3[((i20 >>> 24) & 255) + 768];
                int i22 = i5 + i21;
                int i23 = (((i19 ^ iArr3[i22 & 255]) ^ iArr3[((i22 >>> 8) & 255) + 256]) ^ iArr3[((i22 >>> 16) & 255) + 512]) ^ iArr3[((i22 >>> 24) & 255) + 768];
                int i24 = i4 + i23;
                int i25 = (((i21 ^ iArr3[i24 & 255]) ^ iArr3[((i24 >>> 8) & 255) + 256]) ^ iArr3[((i24 >>> 16) & 255) + 512]) ^ iArr3[((i24 >>> 24) & 255) + 768];
                int i26 = i3 + i25;
                int i27 = (((i23 ^ iArr3[i26 & 255]) ^ iArr3[((i26 >>> 8) & 255) + 256]) ^ iArr3[((i26 >>> 16) & 255) + 512]) ^ iArr3[((i26 >>> 24) & 255) + 768];
                iArr[z2 ? 1 : 0] = i25;
                iArr[1] = i27;
                return;
            }
            int i28 = i + i3;
            boolean z3 = z;
            int i29 = (((iArr3[i28 & 255] ^ i2) ^ iArr3[((i28 >>> 8) & 255) + 256]) ^ iArr3[((i28 >>> 16) & 255) + 512]) ^ iArr3[((i28 >>> 24) & 255) + 768];
            int i30 = i29 + i4;
            int i31 = (((i ^ iArr3[i30 & 255]) ^ iArr3[((i30 >>> 8) & 255) + 256]) ^ iArr3[((i30 >>> 16) & 255) + 512]) ^ iArr3[((i30 >>> 24) & 255) + 768];
            int i32 = i31 + i5;
            int i33 = (((i29 ^ iArr3[i32 & 255]) ^ iArr3[((i32 >>> 8) & 255) + 256]) ^ iArr3[((i32 >>> 16) & 255) + 512]) ^ iArr3[((i32 >>> 24) & 255) + 768];
            int i34 = i33 + i6;
            int i35 = (((i31 ^ iArr3[i34 & 255]) ^ iArr3[((i34 >>> 8) & 255) + 256]) ^ iArr3[((i34 >>> 16) & 255) + 512]) ^ iArr3[((i34 >>> 24) & 255) + 768];
            int i36 = i35 + i7;
            int i37 = (((i33 ^ iArr3[i36 & 255]) ^ iArr3[((i36 >>> 8) & 255) + 256]) ^ iArr3[((i36 >>> 16) & 255) + 512]) ^ iArr3[((i36 >>> 24) & 255) + 768];
            int i38 = i37 + i8;
            int i39 = (((i35 ^ iArr3[i38 & 255]) ^ iArr3[((i38 >>> 8) & 255) + 256]) ^ iArr3[((i38 >>> 16) & 255) + 512]) ^ iArr3[((i38 >>> 24) & 255) + 768];
            int i40 = i39 + i9;
            i2 = iArr3[((i40 >>> 24) & 255) + 768] ^ (((i37 ^ iArr3[i40 & 255]) ^ iArr3[((i40 >>> 8) & 255) + 256]) ^ iArr3[((i40 >>> 16) & 255) + 512]);
            int i41 = i2 + i10;
            i = (((i39 ^ iArr3[i41 & 255]) ^ iArr3[((i41 >>> 8) & 255) + 256]) ^ iArr3[((i41 >>> 16) & 255) + 512]) ^ iArr3[((i41 >>> 24) & 255) + 768];
            i11++;
            z = z3;
        }
    }

    public abstract byte[] digestValue();

    public byte[] digestValue(boolean z) {
        return null;
    }

    public void e(int[] iArr, int[] iArr2) {
        boolean z = false;
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
        int i11 = 0;
        while (true) {
            int[] iArr3 = av61.u5;
            if (i11 >= 3) {
                boolean z2 = z;
                int i12 = i10 + i;
                int i13 = (((iArr3[i12 & 255] ^ i2) ^ iArr3[((i12 >>> 8) & 255) + 256]) ^ iArr3[((i12 >>> 16) & 255) + 512]) ^ iArr3[((i12 >>> 24) & 255) + 768];
                int i14 = i9 + i13;
                int i15 = (((i ^ iArr3[i14 & 255]) ^ iArr3[((i14 >>> 8) & 255) + 256]) ^ iArr3[((i14 >>> 16) & 255) + 512]) ^ iArr3[((i14 >>> 24) & 255) + 768];
                int i16 = i8 + i15;
                int i17 = (((i13 ^ iArr3[i16 & 255]) ^ iArr3[((i16 >>> 8) & 255) + 256]) ^ iArr3[((i16 >>> 16) & 255) + 512]) ^ iArr3[((i16 >>> 24) & 255) + 768];
                int i18 = i7 + i17;
                int i19 = (((i15 ^ iArr3[i18 & 255]) ^ iArr3[((i18 >>> 8) & 255) + 256]) ^ iArr3[((i18 >>> 16) & 255) + 512]) ^ iArr3[((i18 >>> 24) & 255) + 768];
                int i20 = i6 + i19;
                int i21 = (((i17 ^ iArr3[i20 & 255]) ^ iArr3[((i20 >>> 8) & 255) + 256]) ^ iArr3[((i20 >>> 16) & 255) + 512]) ^ iArr3[((i20 >>> 24) & 255) + 768];
                int i22 = i5 + i21;
                int i23 = (((i19 ^ iArr3[i22 & 255]) ^ iArr3[((i22 >>> 8) & 255) + 256]) ^ iArr3[((i22 >>> 16) & 255) + 512]) ^ iArr3[((i22 >>> 24) & 255) + 768];
                int i24 = i4 + i23;
                int i25 = (((i21 ^ iArr3[i24 & 255]) ^ iArr3[((i24 >>> 8) & 255) + 256]) ^ iArr3[((i24 >>> 16) & 255) + 512]) ^ iArr3[((i24 >>> 24) & 255) + 768];
                int i26 = i3 + i25;
                int i27 = (((i23 ^ iArr3[i26 & 255]) ^ iArr3[((i26 >>> 8) & 255) + 256]) ^ iArr3[((i26 >>> 16) & 255) + 512]) ^ iArr3[((i26 >>> 24) & 255) + 768];
                iArr[z2 ? 1 : 0] = i25;
                iArr[1] = i27;
                return;
            }
            int i28 = i + i3;
            boolean z3 = z;
            int i29 = (((iArr3[i28 & 255] ^ i2) ^ iArr3[((i28 >>> 8) & 255) + 256]) ^ iArr3[((i28 >>> 16) & 255) + 512]) ^ iArr3[((i28 >>> 24) & 255) + 768];
            int i30 = i29 + i4;
            int i31 = (((i ^ iArr3[i30 & 255]) ^ iArr3[((i30 >>> 8) & 255) + 256]) ^ iArr3[((i30 >>> 16) & 255) + 512]) ^ iArr3[((i30 >>> 24) & 255) + 768];
            int i32 = i31 + i5;
            int i33 = (((i29 ^ iArr3[i32 & 255]) ^ iArr3[((i32 >>> 8) & 255) + 256]) ^ iArr3[((i32 >>> 16) & 255) + 512]) ^ iArr3[((i32 >>> 24) & 255) + 768];
            int i34 = i33 + i6;
            int i35 = (((i31 ^ iArr3[i34 & 255]) ^ iArr3[((i34 >>> 8) & 255) + 256]) ^ iArr3[((i34 >>> 16) & 255) + 512]) ^ iArr3[((i34 >>> 24) & 255) + 768];
            int i36 = i35 + i7;
            int i37 = (((i33 ^ iArr3[i36 & 255]) ^ iArr3[((i36 >>> 8) & 255) + 256]) ^ iArr3[((i36 >>> 16) & 255) + 512]) ^ iArr3[((i36 >>> 24) & 255) + 768];
            int i38 = i37 + i8;
            int i39 = (((i35 ^ iArr3[i38 & 255]) ^ iArr3[((i38 >>> 8) & 255) + 256]) ^ iArr3[((i38 >>> 16) & 255) + 512]) ^ iArr3[((i38 >>> 24) & 255) + 768];
            int i40 = i39 + i9;
            i2 = iArr3[((i40 >>> 24) & 255) + 768] ^ (((i37 ^ iArr3[i40 & 255]) ^ iArr3[((i40 >>> 8) & 255) + 256]) ^ iArr3[((i40 >>> 16) & 255) + 512]);
            int i41 = i2 + i10;
            i = (((i39 ^ iArr3[i41 & 255]) ^ iArr3[((i41 >>> 8) & 255) + 256]) ^ iArr3[((i41 >>> 16) & 255) + 512]) ^ iArr3[((i41 >>> 24) & 255) + 768];
            i11++;
            z = z3;
        }
    }

    @Override // java.security.MessageDigestSpi
    public abstract byte[] engineDigest();

    public abstract byte[] engineDigestWithCheck() throws SignatureException;

    public byte[] engineDigestWithoutClean() throws SignatureException {
        return null;
    }

    @Override // java.security.MessageDigestSpi
    public abstract void engineReset();

    @Override // java.security.MessageDigestSpi
    public abstract void engineUpdate(byte b);

    @Override // java.security.MessageDigestSpi
    public abstract void engineUpdate(byte[] bArr, int i, int i2);

    public abstract int getAlgorithmIdentifier();

    public Object getHash() {
        return null;
    }

    public abstract void reset(OID oid);
}
