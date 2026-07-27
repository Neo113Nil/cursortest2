package com.google.android.gms.internal.ads;

import O2.C0361k;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.ECPublicKey;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class CJ implements InterfaceC4041vE {

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f24088g = new byte[0];

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f24089h = {0};
    public static final C0361k i;

    /* renamed from: j, reason: collision with root package name */
    public static final C0361k f24090j;

    /* renamed from: k, reason: collision with root package name */
    public static final C0361k f24091k;

    /* renamed from: a, reason: collision with root package name */
    public final ECPublicKey f24092a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24093b;

    /* renamed from: c, reason: collision with root package name */
    public final TJ f24094c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f24095d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f24096e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider f24097f;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        ZJ zj = ZJ.f28870n;
        C3556mE c3556mE = C3556mE.f31919G;
        hashMap.put(zj, c3556mE);
        hashMap2.put(c3556mE, zj);
        ZJ zj2 = ZJ.f28871u;
        C3556mE c3556mE2 = C3556mE.f31920H;
        hashMap.put(zj2, c3556mE2);
        hashMap2.put(c3556mE2, zj2);
        ZJ zj3 = ZJ.f28872v;
        C3556mE c3556mE3 = C3556mE.f31921I;
        hashMap.put(zj3, c3556mE3);
        hashMap2.put(c3556mE3, zj3);
        i = new C0361k(Collections.unmodifiableMap(hashMap), Collections.unmodifiableMap(hashMap2));
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        TJ tj = TJ.f27717n;
        C3879sE c3879sE = C3879sE.f33921p;
        hashMap3.put(tj, c3879sE);
        hashMap4.put(c3879sE, tj);
        TJ tj2 = TJ.f27718u;
        C3879sE c3879sE2 = C3879sE.f33922q;
        hashMap3.put(tj2, c3879sE2);
        hashMap4.put(c3879sE2, tj2);
        f24090j = new C0361k(Collections.unmodifiableMap(hashMap3), Collections.unmodifiableMap(hashMap4));
        HashMap hashMap5 = new HashMap();
        HashMap hashMap6 = new HashMap();
        SJ sj = SJ.f27427n;
        YI yi = YI.f28664c;
        hashMap5.put(sj, yi);
        hashMap6.put(yi, sj);
        SJ sj2 = SJ.f27428u;
        YI yi2 = YI.f28665d;
        hashMap5.put(sj2, yi2);
        hashMap6.put(yi2, sj2);
        SJ sj3 = SJ.f27429v;
        YI yi3 = YI.f28666e;
        hashMap5.put(sj3, yi3);
        hashMap6.put(yi3, sj3);
        f24091k = new C0361k(Collections.unmodifiableMap(hashMap5), Collections.unmodifiableMap(hashMap6));
    }

    public CJ(ECPublicKey eCPublicKey, ZJ zj, TJ tj, byte[] bArr, byte[] bArr2, Provider provider) {
        if (!WC.c(2)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        AbstractC3341iD.i(zj);
        this.f24093b = zj.toString().concat("withECDSA");
        this.f24092a = eCPublicKey;
        this.f24094c = tj;
        this.f24095d = bArr;
        this.f24096e = bArr2;
        this.f24097f = provider;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4041vE
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f24095d;
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

    /* JADX WARN: Removed duplicated region for block: B:51:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0138 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(byte[] bArr, byte[] bArr2) {
        int i6;
        byte[] bArr3;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        byte b9;
        int i14;
        byte b10;
        Signature signature;
        byte[] bArr4;
        int i15;
        TJ tj = TJ.f27717n;
        TJ tj2 = this.f24094c;
        ECPublicKey eCPublicKey = this.f24092a;
        if (tj2 == tj) {
            EllipticCurve curve = eCPublicKey.getParams().getCurve();
            int length = bArr.length;
            int bitLength = (MF.c(curve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
            if (length != bitLength + bitLength) {
                throw new GeneralSecurityException("Invalid signature");
            }
            int length2 = bArr.length;
            if ((length2 & 1) != 0 || length2 == 0 || length2 > 132) {
                throw new GeneralSecurityException("Invalid IEEE_P1363 encoding");
            }
            int i16 = length2 >> 1;
            byte[] n9 = QC.n(Arrays.copyOf(bArr, i16));
            byte[] n10 = QC.n(Arrays.copyOfRange(bArr, i16, length2));
            int length3 = n9.length;
            int length4 = n10.length;
            int i17 = length3 + 4 + length4;
            if (i17 >= 128) {
                bArr3 = new byte[i17 + 3];
                bArr3[0] = 48;
                bArr3[1] = -127;
                bArr3[2] = (byte) i17;
                i15 = 3;
            } else {
                bArr3 = new byte[i17 + 2];
                bArr3[0] = 48;
                bArr3[1] = (byte) i17;
                i15 = 2;
            }
            int i18 = i15 + 1;
            bArr3[i15] = 2;
            int i19 = i15 + 2;
            i6 = 1;
            bArr3[i18] = (byte) length3;
            System.arraycopy(n9, 0, bArr3, i19, length3);
            int i20 = i19 + length3;
            bArr3[i20] = 2;
            bArr3[i20 + 1] = (byte) length4;
            System.arraycopy(n10, 0, bArr3, i20 + 2, length4);
        } else {
            i6 = 1;
            bArr3 = bArr;
        }
        int length5 = bArr3.length;
        if (length5 >= 8 && bArr3[0] == 48) {
            int i21 = bArr3[i6] & 255;
            if (i21 == 129) {
                i21 = bArr3[2] & 255;
                if (i21 >= 128) {
                    i9 = 2;
                    if (i21 == (length5 - 1) - i9 && bArr3[i9 + 1] == 2 && (i13 = (i12 = (i11 = i9 + 3) + (i10 = bArr3[i9 + 2] & 255)) + 1) < length5 && i10 != 0) {
                        b9 = bArr3[i11];
                        if ((b9 & 255) < 128 && ((i10 <= i6 || b9 != 0 || (bArr3[i9 + 4] & 255) >= 128) && bArr3[i12] == 2)) {
                            i14 = bArr3[i13] & 255;
                            if (i12 + 2 + i14 == length5 && i14 != 0) {
                                b10 = bArr3[i9 + 5 + i10];
                                if ((b10 & 255) < 128 && (i14 <= 1 || b10 != 0 || (bArr3[i9 + 6 + i10] & 255) >= 128)) {
                                    String str = this.f24093b;
                                    Provider provider = this.f24097f;
                                    signature = provider == null ? Signature.getInstance(str, provider) : (Signature) WJ.f28342d.f28346a.b(str);
                                    signature.initVerify(eCPublicKey);
                                    signature.update(bArr2);
                                    bArr4 = this.f24096e;
                                    if (bArr4.length > 0) {
                                        signature.update(bArr4);
                                    }
                                    try {
                                        if (signature.verify(bArr3)) {
                                            return;
                                        }
                                    } catch (RuntimeException unused) {
                                    }
                                    throw new GeneralSecurityException("Invalid signature");
                                }
                            }
                        }
                    }
                }
            } else if (i21 != 128 && i21 <= 129) {
                i9 = i6;
                if (i21 == (length5 - 1) - i9) {
                    b9 = bArr3[i11];
                    if ((b9 & 255) < 128) {
                        i14 = bArr3[i13] & 255;
                        if (i12 + 2 + i14 == length5) {
                            b10 = bArr3[i9 + 5 + i10];
                            if ((b10 & 255) < 128) {
                                String str2 = this.f24093b;
                                Provider provider2 = this.f24097f;
                                if (provider2 == null) {
                                }
                                signature.initVerify(eCPublicKey);
                                signature.update(bArr2);
                                bArr4 = this.f24096e;
                                if (bArr4.length > 0) {
                                }
                                if (signature.verify(bArr3)) {
                                }
                                throw new GeneralSecurityException("Invalid signature");
                            }
                        }
                    }
                }
            }
        }
        throw new GeneralSecurityException("Invalid signature");
    }
}
