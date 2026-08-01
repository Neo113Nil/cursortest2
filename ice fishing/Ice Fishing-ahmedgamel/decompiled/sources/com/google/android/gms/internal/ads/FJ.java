package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class FJ implements InterfaceC4041vE {

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f24781f = {48, 42, 48, 5, 6, 3, 43, 101, 112, 3, 33, 0};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24782a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f24783b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f24784c;

    /* renamed from: d, reason: collision with root package name */
    public final PublicKey f24785d;

    /* renamed from: e, reason: collision with root package name */
    public final Serializable f24786e;

    public /* synthetic */ FJ(RSAPublicKey rSAPublicKey, ZJ zj, byte[] bArr, byte[] bArr2) {
        if (HF.a()) {
            throw new GeneralSecurityException("Conscrypt is not available, and we cannot use Java Implementation of RSA-PKCS1.5 in FIPS-mode.");
        }
        AbstractC3341iD.i(zj);
        AbstractC3341iD.k(rSAPublicKey.getModulus().bitLength());
        AbstractC3341iD.n(rSAPublicKey.getPublicExponent());
        this.f24785d = rSAPublicKey;
        this.f24786e = zj;
        this.f24783b = bArr;
        this.f24784c = bArr2;
    }

    public static FJ b(C3293hJ c3293hJ) {
        Provider h9 = AbstractC3043cl.h();
        if (h9 == null) {
            throw new NoSuchProviderException("Ed25519VerifyJce requires the Conscrypt provider.");
        }
        if (WC.c(1)) {
            return new FJ(c3293hJ.f30757c.b(), c3293hJ.f30758d.b(), c3293hJ.f30756b.f29907a.equals(FE.f24768L) ? new byte[]{0} : new byte[0], h9);
        }
        throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4041vE
    public final void a(byte[] bArr, byte[] bArr2) {
        switch (this.f24782a) {
            case 0:
                byte[] bArr3 = this.f24783b;
                int length = bArr3.length;
                if (bArr.length != length + 64) {
                    throw new GeneralSecurityException("Invalid signature length: 64");
                }
                if (!DG.c(bArr3, bArr)) {
                    throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
                }
                Signature signature = Signature.getInstance("Ed25519", (Provider) this.f24786e);
                signature.initVerify(this.f24785d);
                signature.update(bArr2);
                signature.update(this.f24784c);
                try {
                    if (signature.verify(bArr, length, 64)) {
                        return;
                    }
                } catch (RuntimeException unused) {
                }
                throw new GeneralSecurityException("Signature check failed.");
            default:
                byte[] bArr4 = this.f24783b;
                int length2 = bArr4.length;
                if (length2 == 0) {
                    c(bArr, bArr2);
                    return;
                } else {
                    if (!DG.c(bArr4, bArr)) {
                        throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
                    }
                    c(Arrays.copyOfRange(bArr, length2, bArr.length), bArr2);
                    return;
                }
        }
    }

    public void c(byte[] bArr, byte[] bArr2) {
        byte[] f3;
        int i;
        RSAPublicKey rSAPublicKey = (RSAPublicKey) this.f24785d;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int bitLength = (modulus.bitLength() + 7) / 8;
        if (bitLength != bArr.length) {
            throw new GeneralSecurityException("invalid signature's length");
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("signature out of range");
        }
        byte[] h9 = AbstractC4094wD.h(bigInteger.modPow(publicExponent, modulus), bitLength);
        ZJ zj = (ZJ) this.f24786e;
        AbstractC3341iD.i(zj);
        MessageDigest messageDigest = (MessageDigest) WJ.f28343e.f28346a.b(WC.f(zj));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.f24784c;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] digest = messageDigest.digest();
        int ordinal = zj.ordinal();
        int i6 = 2;
        if (ordinal == 2) {
            f3 = UC.f("3031300d060960864801650304020105000420");
        } else if (ordinal == 3) {
            f3 = UC.f("3041300d060960864801650304020205000430");
        } else {
            if (ordinal != 4) {
                throw new GeneralSecurityException("Unsupported hash ".concat(zj.toString()));
            }
            f3 = UC.f("3051300d060960864801650304020305000440");
        }
        if (bitLength < f3.length + digest.length + 11) {
            throw new GeneralSecurityException("intended encoded message length too short");
        }
        byte[] bArr4 = new byte[bitLength];
        bArr4[0] = 0;
        bArr4[1] = 1;
        int i9 = 0;
        while (true) {
            i = i6 + 1;
            if (i9 >= (bitLength - r5) - 3) {
                break;
            }
            bArr4[i6] = -1;
            i9++;
            i6 = i;
        }
        bArr4[i6] = 0;
        int length = f3.length;
        System.arraycopy(f3, 0, bArr4, i, length);
        System.arraycopy(digest, 0, bArr4, i + length, digest.length);
        if (!MessageDigest.isEqual(h9, bArr4)) {
            throw new GeneralSecurityException("invalid signature");
        }
    }

    public FJ(byte[] bArr, byte[] bArr2, byte[] bArr3, Provider provider) {
        if (WC.c(1)) {
            if (bArr.length == 32) {
                this.f24785d = KeyFactory.getInstance("Ed25519", provider).generatePublic(new X509EncodedKeySpec(AbstractC4094wD.d(f24781f, bArr)));
                this.f24783b = bArr2;
                this.f24784c = bArr3;
                this.f24786e = provider;
                return;
            }
            throw new IllegalArgumentException("Given public key's length is not 32.");
        }
        throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
    }
}
