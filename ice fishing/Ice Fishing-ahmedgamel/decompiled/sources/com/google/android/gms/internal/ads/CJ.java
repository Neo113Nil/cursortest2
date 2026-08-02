package com.google.android.gms.internal.ads;

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
public final class CJ implements InterfaceC4064vE {

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f24851g = new byte[0];

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f24852h = {0};
    public static final S0.e i;

    /* renamed from: j, reason: collision with root package name */
    public static final S0.e f24853j;

    /* renamed from: k, reason: collision with root package name */
    public static final S0.e f24854k;

    /* renamed from: a, reason: collision with root package name */
    public final ECPublicKey f24855a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24856b;

    /* renamed from: c, reason: collision with root package name */
    public final TJ f24857c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f24858d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f24859e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider f24860f;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        ZJ zj = ZJ.f29650n;
        C3579mE c3579mE = C3579mE.f32699G;
        hashMap.put(zj, c3579mE);
        hashMap2.put(c3579mE, zj);
        ZJ zj2 = ZJ.f29651u;
        C3579mE c3579mE2 = C3579mE.f32700H;
        hashMap.put(zj2, c3579mE2);
        hashMap2.put(c3579mE2, zj2);
        ZJ zj3 = ZJ.f29652v;
        C3579mE c3579mE3 = C3579mE.f32701I;
        hashMap.put(zj3, c3579mE3);
        hashMap2.put(c3579mE3, zj3);
        i = new S0.e(26, Collections.unmodifiableMap(hashMap), Collections.unmodifiableMap(hashMap2));
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        TJ tj = TJ.f28500n;
        C3902sE c3902sE = C3902sE.f34689p;
        hashMap3.put(tj, c3902sE);
        hashMap4.put(c3902sE, tj);
        TJ tj2 = TJ.f28501u;
        C3902sE c3902sE2 = C3902sE.f34690q;
        hashMap3.put(tj2, c3902sE2);
        hashMap4.put(c3902sE2, tj2);
        f24853j = new S0.e(26, Collections.unmodifiableMap(hashMap3), Collections.unmodifiableMap(hashMap4));
        HashMap hashMap5 = new HashMap();
        HashMap hashMap6 = new HashMap();
        SJ sj = SJ.f28141n;
        YI yi = YI.f29441c;
        hashMap5.put(sj, yi);
        hashMap6.put(yi, sj);
        SJ sj2 = SJ.f28142u;
        YI yi2 = YI.f29442d;
        hashMap5.put(sj2, yi2);
        hashMap6.put(yi2, sj2);
        SJ sj3 = SJ.f28143v;
        YI yi3 = YI.f29443e;
        hashMap5.put(sj3, yi3);
        hashMap6.put(yi3, sj3);
        f24854k = new S0.e(26, Collections.unmodifiableMap(hashMap5), Collections.unmodifiableMap(hashMap6));
    }

    public CJ(ECPublicKey eCPublicKey, ZJ zj, TJ tj, byte[] bArr, byte[] bArr2, Provider provider) {
        if (!WC.c(2)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        AbstractC3364iD.i(zj);
        this.f24856b = zj.toString().concat("withECDSA");
        this.f24855a = eCPublicKey;
        this.f24857c = tj;
        this.f24858d = bArr;
        this.f24859e = bArr2;
        this.f24860f = provider;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4064vE
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f24858d;
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
        int i4;
        byte[] bArr3;
        int i6;
        int i9;
        int i10;
        int i11;
        int i12;
        byte b9;
        int i13;
        byte b10;
        Signature signature;
        byte[] bArr4;
        int i14;
        TJ tj = TJ.f28500n;
        TJ tj2 = this.f24857c;
        ECPublicKey eCPublicKey = this.f24855a;
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
            int i15 = length2 >> 1;
            byte[] n9 = QC.n(Arrays.copyOf(bArr, i15));
            byte[] n10 = QC.n(Arrays.copyOfRange(bArr, i15, length2));
            int length3 = n9.length;
            int length4 = n10.length;
            int i16 = length3 + 4 + length4;
            if (i16 >= 128) {
                bArr3 = new byte[i16 + 3];
                bArr3[0] = 48;
                bArr3[1] = -127;
                bArr3[2] = (byte) i16;
                i14 = 3;
            } else {
                bArr3 = new byte[i16 + 2];
                bArr3[0] = 48;
                bArr3[1] = (byte) i16;
                i14 = 2;
            }
            int i17 = i14 + 1;
            bArr3[i14] = 2;
            int i18 = i14 + 2;
            i4 = 1;
            bArr3[i17] = (byte) length3;
            System.arraycopy(n9, 0, bArr3, i18, length3);
            int i19 = i18 + length3;
            bArr3[i19] = 2;
            bArr3[i19 + 1] = (byte) length4;
            System.arraycopy(n10, 0, bArr3, i19 + 2, length4);
        } else {
            i4 = 1;
            bArr3 = bArr;
        }
        int length5 = bArr3.length;
        if (length5 >= 8 && bArr3[0] == 48) {
            int i20 = bArr3[i4] & 255;
            if (i20 == 129) {
                i20 = bArr3[2] & 255;
                if (i20 >= 128) {
                    i6 = 2;
                    if (i20 == (length5 - 1) - i6 && bArr3[i6 + 1] == 2 && (i12 = (i11 = (i10 = i6 + 3) + (i9 = bArr3[i6 + 2] & 255)) + 1) < length5 && i9 != 0) {
                        b9 = bArr3[i10];
                        if ((b9 & 255) < 128 && ((i9 <= i4 || b9 != 0 || (bArr3[i6 + 4] & 255) >= 128) && bArr3[i11] == 2)) {
                            i13 = bArr3[i12] & 255;
                            if (i11 + 2 + i13 == length5 && i13 != 0) {
                                b10 = bArr3[i6 + 5 + i9];
                                if ((b10 & 255) < 128 && (i13 <= 1 || b10 != 0 || (bArr3[i6 + 6 + i9] & 255) >= 128)) {
                                    String str = this.f24856b;
                                    Provider provider = this.f24860f;
                                    signature = provider == null ? Signature.getInstance(str, provider) : (Signature) WJ.f29140d.f29144a.b(str);
                                    signature.initVerify(eCPublicKey);
                                    signature.update(bArr2);
                                    bArr4 = this.f24859e;
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
            } else if (i20 != 128 && i20 <= 129) {
                i6 = i4;
                if (i20 == (length5 - 1) - i6) {
                    b9 = bArr3[i10];
                    if ((b9 & 255) < 128) {
                        i13 = bArr3[i12] & 255;
                        if (i11 + 2 + i13 == length5) {
                            b10 = bArr3[i6 + 5 + i9];
                            if ((b10 & 255) < 128) {
                                String str2 = this.f24856b;
                                Provider provider2 = this.f24860f;
                                if (provider2 == null) {
                                }
                                signature.initVerify(eCPublicKey);
                                signature.update(bArr2);
                                bArr4 = this.f24859e;
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
