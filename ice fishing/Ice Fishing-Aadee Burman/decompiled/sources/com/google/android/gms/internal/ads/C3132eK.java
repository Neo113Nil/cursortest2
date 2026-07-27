package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.eK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3132eK implements InterfaceC4041vE {

    /* renamed from: a, reason: collision with root package name */
    public final RSAPublicKey f29908a;

    /* renamed from: b, reason: collision with root package name */
    public final ZJ f29909b;

    /* renamed from: c, reason: collision with root package name */
    public final ZJ f29910c;

    /* renamed from: d, reason: collision with root package name */
    public final int f29911d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f29912e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f29913f;

    public /* synthetic */ C3132eK(RSAPublicKey rSAPublicKey, ZJ zj, ZJ zj2, int i, byte[] bArr, byte[] bArr2) {
        if (HF.a()) {
            throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        AbstractC3341iD.i(zj);
        if (!zj.equals(zj2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        AbstractC3341iD.k(rSAPublicKey.getModulus().bitLength());
        AbstractC3341iD.n(rSAPublicKey.getPublicExponent());
        this.f29908a = rSAPublicKey;
        this.f29909b = zj;
        this.f29910c = zj2;
        this.f29911d = i;
        this.f29912e = bArr;
        this.f29913f = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4041vE
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f29912e;
        int length = bArr3.length;
        if (length == 0) {
            b(bArr, bArr2);
        } else {
            if (!DG.c(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            b(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }

    public final void b(byte[] bArr, byte[] bArr2) {
        RSAPublicKey rSAPublicKey = this.f29908a;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int bitLength = modulus.bitLength() + 7;
        int bitLength2 = modulus.bitLength() + 6;
        if (bitLength / 8 != bArr.length) {
            throw new GeneralSecurityException("invalid signature's length");
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("signature out of range");
        }
        byte[] h9 = AbstractC4094wD.h(bigInteger.modPow(publicExponent, modulus), bitLength2 / 8);
        int bitLength3 = modulus.bitLength() - 1;
        ZJ zj = this.f29909b;
        AbstractC3341iD.i(zj);
        WJ wj = WJ.f28343e;
        MessageDigest messageDigest = (MessageDigest) wj.f28346a.b(WC.f(zj));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.f29913f;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] digest = messageDigest.digest();
        int digestLength = messageDigest.getDigestLength();
        int length = h9.length;
        int i = this.f29911d;
        if (length < digestLength + i + 2) {
            throw new GeneralSecurityException("inconsistent");
        }
        if (h9[length - 1] != -68) {
            throw new GeneralSecurityException("inconsistent");
        }
        int i6 = length - digestLength;
        int i9 = i6 - 1;
        byte[] copyOf = Arrays.copyOf(h9, i9);
        int length2 = copyOf.length;
        byte[] copyOfRange = Arrays.copyOfRange(h9, length2, length2 + digestLength);
        int i10 = 0;
        while (true) {
            long j6 = (length * 8) - bitLength3;
            if (i10 < j6) {
                if (((copyOf[i10 / 8] >> (7 - (i10 % 8))) & 1) != 0) {
                    throw new GeneralSecurityException("inconsistent");
                }
                i10++;
            } else {
                MessageDigest messageDigest2 = (MessageDigest) wj.f28346a.b(WC.f(this.f29910c));
                int digestLength2 = messageDigest2.getDigestLength();
                byte[] bArr4 = new byte[i9];
                int i11 = 0;
                int i12 = 0;
                while (i11 <= (i6 - 2) / digestLength2) {
                    messageDigest2.reset();
                    messageDigest2.update(copyOfRange);
                    int i13 = i;
                    messageDigest2.update(AbstractC4094wD.h(BigInteger.valueOf(i11), 4));
                    byte[] digest2 = messageDigest2.digest();
                    int length3 = digest2.length;
                    System.arraycopy(digest2, 0, bArr4, i12, Math.min(length3, i9 - i12));
                    i12 += length3;
                    i11++;
                    i = i13;
                    messageDigest2 = messageDigest2;
                }
                int i14 = i;
                byte[] bArr5 = new byte[i9];
                for (int i15 = 0; i15 < i9; i15++) {
                    bArr5[i15] = (byte) (bArr4[i15] ^ copyOf[i15]);
                }
                for (int i16 = 0; i16 <= j6; i16++) {
                    int i17 = i16 / 8;
                    bArr5[i17] = (byte) ((~(1 << (7 - (i16 % 8)))) & bArr5[i17]);
                }
                int i18 = 0;
                while (true) {
                    int i19 = (i6 - i14) - 2;
                    if (i18 >= i19) {
                        if (bArr5[i19] != 1) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        byte[] copyOfRange2 = Arrays.copyOfRange(bArr5, i9 - i14, i9);
                        int i20 = digestLength + 8;
                        byte[] bArr6 = new byte[i20 + i14];
                        System.arraycopy(digest, 0, bArr6, 8, digest.length);
                        System.arraycopy(copyOfRange2, 0, bArr6, i20, copyOfRange2.length);
                        if (!MessageDigest.isEqual(messageDigest.digest(bArr6), copyOfRange)) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        return;
                    }
                    if (bArr5[i18] != 0) {
                        throw new GeneralSecurityException("inconsistent");
                    }
                    i18++;
                }
            }
        }
    }
}
