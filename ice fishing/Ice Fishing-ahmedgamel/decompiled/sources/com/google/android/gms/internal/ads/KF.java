package com.google.android.gms.internal.ads;

import java.lang.reflect.Array;
import java.math.BigInteger;

/* loaded from: classes2.dex */
public abstract class KF {

    /* renamed from: a, reason: collision with root package name */
    public static final long[] f26634a;

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f26635b;

    /* renamed from: c, reason: collision with root package name */
    public static final long[] f26636c;

    /* renamed from: d, reason: collision with root package name */
    public static final IF[][] f26637d;

    /* renamed from: e, reason: collision with root package name */
    public static final IF[] f26638e;

    /* renamed from: f, reason: collision with root package name */
    public static final BigInteger f26639f;

    /* renamed from: g, reason: collision with root package name */
    public static final BigInteger f26640g;

    /* renamed from: h, reason: collision with root package name */
    public static final BigInteger f26641h;

    static {
        BigInteger subtract = BigInteger.valueOf(2L).pow(com.anythink.basead.exoplayer.k.p.f9259b).subtract(BigInteger.valueOf(19L));
        f26639f = subtract;
        BigInteger mod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(subtract)).mod(subtract);
        f26640g = mod;
        BigInteger mod2 = BigInteger.valueOf(2L).multiply(mod).mod(subtract);
        f26641h = mod2;
        BigInteger valueOf = BigInteger.valueOf(2L);
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger modPow = valueOf.modPow(subtract.subtract(bigInteger).divide(BigInteger.valueOf(4L)), subtract);
        S0.c cVar = new S0.c(26, false);
        BigInteger mod3 = BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(subtract)).mod(subtract);
        cVar.f2903v = mod3;
        BigInteger multiply = mod3.pow(2).subtract(bigInteger).multiply(mod.multiply(mod3.pow(2)).add(bigInteger).modInverse(subtract));
        BigInteger modPow2 = multiply.modPow(subtract.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), subtract);
        if (!modPow2.pow(2).subtract(multiply).mod(subtract).equals(BigInteger.ZERO)) {
            modPow2 = modPow2.multiply(modPow).mod(subtract);
        }
        if (modPow2.testBit(0)) {
            modPow2 = subtract.subtract(modPow2);
        }
        cVar.f2902u = modPow2;
        f26634a = AbstractC2991bG.N(b(mod));
        f26635b = AbstractC2991bG.N(b(mod2));
        f26636c = AbstractC2991bG.N(b(modPow));
        f26637d = (IF[][]) Array.newInstance((Class<?>) IF.class, 32, 8);
        S0.c cVar2 = cVar;
        for (int i = 0; i < 32; i++) {
            S0.c cVar3 = cVar2;
            for (int i4 = 0; i4 < 8; i4++) {
                f26637d[i][i4] = c(cVar3);
                cVar3 = a(cVar3, cVar2);
            }
            for (int i6 = 0; i6 < 8; i6++) {
                cVar2 = a(cVar2, cVar2);
            }
        }
        S0.c a9 = a(cVar, cVar);
        f26638e = new IF[8];
        for (int i9 = 0; i9 < 8; i9++) {
            f26638e[i9] = c(cVar);
            cVar = a(cVar, a9);
        }
    }

    public static S0.c a(S0.c cVar, S0.c cVar2) {
        S0.c cVar3 = new S0.c(26, false);
        BigInteger multiply = f26640g.multiply(((BigInteger) cVar.f2902u).multiply((BigInteger) cVar2.f2902u).multiply((BigInteger) cVar.f2903v).multiply((BigInteger) cVar2.f2903v));
        BigInteger bigInteger = f26639f;
        BigInteger mod = multiply.mod(bigInteger);
        BigInteger add = ((BigInteger) cVar.f2902u).multiply((BigInteger) cVar2.f2903v).add(((BigInteger) cVar2.f2902u).multiply((BigInteger) cVar.f2903v));
        BigInteger bigInteger2 = BigInteger.ONE;
        cVar3.f2902u = add.multiply(bigInteger2.add(mod).modInverse(bigInteger)).mod(bigInteger);
        cVar3.f2903v = ((BigInteger) cVar.f2903v).multiply((BigInteger) cVar2.f2903v).add(((BigInteger) cVar.f2902u).multiply((BigInteger) cVar2.f2902u)).multiply(bigInteger2.subtract(mod).modInverse(bigInteger)).mod(bigInteger);
        return cVar3;
    }

    public static byte[] b(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        System.arraycopy(byteArray, 0, bArr, 32 - length, length);
        for (int i = 0; i < 16; i++) {
            byte b9 = bArr[i];
            int i4 = 31 - i;
            bArr[i] = bArr[i4];
            bArr[i4] = b9;
        }
        return bArr;
    }

    public static IF c(S0.c cVar) {
        BigInteger add = ((BigInteger) cVar.f2903v).add((BigInteger) cVar.f2902u);
        BigInteger bigInteger = f26639f;
        return new IF(AbstractC2991bG.N(b(add.mod(bigInteger))), AbstractC2991bG.N(b(((BigInteger) cVar.f2903v).subtract((BigInteger) cVar.f2902u).mod(bigInteger))), AbstractC2991bG.N(b(f26641h.multiply((BigInteger) cVar.f2902u).multiply((BigInteger) cVar.f2903v).mod(bigInteger))));
    }
}
