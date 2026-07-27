package com.google.android.gms.internal.ads;

import java.lang.reflect.Array;
import java.math.BigInteger;

/* loaded from: classes2.dex */
public abstract class KF {

    /* renamed from: a, reason: collision with root package name */
    public static final long[] f25882a;

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f25883b;

    /* renamed from: c, reason: collision with root package name */
    public static final long[] f25884c;

    /* renamed from: d, reason: collision with root package name */
    public static final IF[][] f25885d;

    /* renamed from: e, reason: collision with root package name */
    public static final IF[] f25886e;

    /* renamed from: f, reason: collision with root package name */
    public static final BigInteger f25887f;

    /* renamed from: g, reason: collision with root package name */
    public static final BigInteger f25888g;

    /* renamed from: h, reason: collision with root package name */
    public static final BigInteger f25889h;

    static {
        BigInteger subtract = BigInteger.valueOf(2L).pow(com.anythink.basead.exoplayer.k.p.f8473b).subtract(BigInteger.valueOf(19L));
        f25887f = subtract;
        BigInteger mod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(subtract)).mod(subtract);
        f25888g = mod;
        BigInteger mod2 = BigInteger.valueOf(2L).multiply(mod).mod(subtract);
        f25889h = mod2;
        BigInteger valueOf = BigInteger.valueOf(2L);
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger modPow = valueOf.modPow(subtract.subtract(bigInteger).divide(BigInteger.valueOf(4L)), subtract);
        S0.c cVar = new S0.c(23, false);
        BigInteger mod3 = BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(subtract)).mod(subtract);
        cVar.f2776v = mod3;
        BigInteger multiply = mod3.pow(2).subtract(bigInteger).multiply(mod.multiply(mod3.pow(2)).add(bigInteger).modInverse(subtract));
        BigInteger modPow2 = multiply.modPow(subtract.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), subtract);
        if (!modPow2.pow(2).subtract(multiply).mod(subtract).equals(BigInteger.ZERO)) {
            modPow2 = modPow2.multiply(modPow).mod(subtract);
        }
        if (modPow2.testBit(0)) {
            modPow2 = subtract.subtract(modPow2);
        }
        cVar.f2775u = modPow2;
        f25882a = AbstractC2968bG.N(b(mod));
        f25883b = AbstractC2968bG.N(b(mod2));
        f25884c = AbstractC2968bG.N(b(modPow));
        f25885d = (IF[][]) Array.newInstance((Class<?>) IF.class, 32, 8);
        S0.c cVar2 = cVar;
        for (int i = 0; i < 32; i++) {
            S0.c cVar3 = cVar2;
            for (int i6 = 0; i6 < 8; i6++) {
                f25885d[i][i6] = c(cVar3);
                cVar3 = a(cVar3, cVar2);
            }
            for (int i9 = 0; i9 < 8; i9++) {
                cVar2 = a(cVar2, cVar2);
            }
        }
        S0.c a9 = a(cVar, cVar);
        f25886e = new IF[8];
        for (int i10 = 0; i10 < 8; i10++) {
            f25886e[i10] = c(cVar);
            cVar = a(cVar, a9);
        }
    }

    public static S0.c a(S0.c cVar, S0.c cVar2) {
        S0.c cVar3 = new S0.c(23, false);
        BigInteger multiply = f25888g.multiply(((BigInteger) cVar.f2775u).multiply((BigInteger) cVar2.f2775u).multiply((BigInteger) cVar.f2776v).multiply((BigInteger) cVar2.f2776v));
        BigInteger bigInteger = f25887f;
        BigInteger mod = multiply.mod(bigInteger);
        BigInteger add = ((BigInteger) cVar.f2775u).multiply((BigInteger) cVar2.f2776v).add(((BigInteger) cVar2.f2775u).multiply((BigInteger) cVar.f2776v));
        BigInteger bigInteger2 = BigInteger.ONE;
        cVar3.f2775u = add.multiply(bigInteger2.add(mod).modInverse(bigInteger)).mod(bigInteger);
        cVar3.f2776v = ((BigInteger) cVar.f2776v).multiply((BigInteger) cVar2.f2776v).add(((BigInteger) cVar.f2775u).multiply((BigInteger) cVar2.f2775u)).multiply(bigInteger2.subtract(mod).modInverse(bigInteger)).mod(bigInteger);
        return cVar3;
    }

    public static byte[] b(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        System.arraycopy(byteArray, 0, bArr, 32 - length, length);
        for (int i = 0; i < 16; i++) {
            byte b9 = bArr[i];
            int i6 = 31 - i;
            bArr[i] = bArr[i6];
            bArr[i6] = b9;
        }
        return bArr;
    }

    public static IF c(S0.c cVar) {
        BigInteger add = ((BigInteger) cVar.f2776v).add((BigInteger) cVar.f2775u);
        BigInteger bigInteger = f25887f;
        return new IF(AbstractC2968bG.N(b(add.mod(bigInteger))), AbstractC2968bG.N(b(((BigInteger) cVar.f2776v).subtract((BigInteger) cVar.f2775u).mod(bigInteger))), AbstractC2968bG.N(b(f25889h.multiply((BigInteger) cVar.f2775u).multiply((BigInteger) cVar.f2776v).mod(bigInteger))));
    }
}
