package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.eK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3155eK implements InterfaceC4064vE {

    /* renamed from: a, reason: collision with root package name */
    public final RSAPublicKey f30700a;

    /* renamed from: b, reason: collision with root package name */
    public final ZJ f30701b;

    /* renamed from: c, reason: collision with root package name */
    public final ZJ f30702c;

    /* renamed from: d, reason: collision with root package name */
    public final int f30703d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f30704e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f30705f;

    public /* synthetic */ C3155eK(RSAPublicKey rSAPublicKey, ZJ zj, ZJ zj2, int i, byte[] bArr, byte[] bArr2) {
        if (HF.a()) {
            throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        AbstractC3364iD.i(zj);
        if (!zj.equals(zj2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        AbstractC3364iD.k(rSAPublicKey.getModulus().bitLength());
        AbstractC3364iD.n(rSAPublicKey.getPublicExponent());
        this.f30700a = rSAPublicKey;
        this.f30701b = zj;
        this.f30702c = zj2;
        this.f30703d = i;
        this.f30704e = bArr;
        this.f30705f = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4064vE
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f30704e;
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
        RSAPublicKey rSAPublicKey = this.f30700a;
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
        byte[] h3 = AbstractC4117wD.h(bigInteger.modPow(publicExponent, modulus), bitLength2 / 8);
        int bitLength3 = modulus.bitLength() - 1;
        ZJ zj = this.f30701b;
        AbstractC3364iD.i(zj);
        WJ wj = WJ.f29141e;
        MessageDigest messageDigest = (MessageDigest) wj.f29144a.b(WC.f(zj));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.f30705f;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] digest = messageDigest.digest();
        int digestLength = messageDigest.getDigestLength();
        int length = h3.length;
        int i = this.f30703d;
        if (length < digestLength + i + 2) {
            throw new GeneralSecurityException("inconsistent");
        }
        if (h3[length - 1] != -68) {
            throw new GeneralSecurityException("inconsistent");
        }
        int i4 = length - digestLength;
        int i6 = i4 - 1;
        byte[] copyOf = Arrays.copyOf(h3, i6);
        int length2 = copyOf.length;
        byte[] copyOfRange = Arrays.copyOfRange(h3, length2, length2 + digestLength);
        int i9 = 0;
        while (true) {
            long j6 = (length * 8) - bitLength3;
            if (i9 < j6) {
                if (((copyOf[i9 / 8] >> (7 - (i9 % 8))) & 1) != 0) {
                    throw new GeneralSecurityException("inconsistent");
                }
                i9++;
            } else {
                MessageDigest messageDigest2 = (MessageDigest) wj.f29144a.b(WC.f(this.f30702c));
                int digestLength2 = messageDigest2.getDigestLength();
                byte[] bArr4 = new byte[i6];
                int i10 = 0;
                int i11 = 0;
                while (i10 <= (i4 - 2) / digestLength2) {
                    messageDigest2.reset();
                    messageDigest2.update(copyOfRange);
                    int i12 = i;
                    messageDigest2.update(AbstractC4117wD.h(BigInteger.valueOf(i10), 4));
                    byte[] digest2 = messageDigest2.digest();
                    int length3 = digest2.length;
                    System.arraycopy(digest2, 0, bArr4, i11, Math.min(length3, i6 - i11));
                    i11 += length3;
                    i10++;
                    i = i12;
                    messageDigest2 = messageDigest2;
                }
                int i13 = i;
                byte[] bArr5 = new byte[i6];
                for (int i14 = 0; i14 < i6; i14++) {
                    bArr5[i14] = (byte) (bArr4[i14] ^ copyOf[i14]);
                }
                for (int i15 = 0; i15 <= j6; i15++) {
                    int i16 = i15 / 8;
                    bArr5[i16] = (byte) ((~(1 << (7 - (i15 % 8)))) & bArr5[i16]);
                }
                int i17 = 0;
                while (true) {
                    int i18 = (i4 - i13) - 2;
                    if (i17 >= i18) {
                        if (bArr5[i18] != 1) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        byte[] copyOfRange2 = Arrays.copyOfRange(bArr5, i6 - i13, i6);
                        int i19 = digestLength + 8;
                        byte[] bArr6 = new byte[i19 + i13];
                        System.arraycopy(digest, 0, bArr6, 8, digest.length);
                        System.arraycopy(copyOfRange2, 0, bArr6, i19, copyOfRange2.length);
                        if (!MessageDigest.isEqual(messageDigest.digest(bArr6), copyOfRange)) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        return;
                    }
                    if (bArr5[i17] != 0) {
                        throw new GeneralSecurityException("inconsistent");
                    }
                    i17++;
                }
            }
        }
    }
}
