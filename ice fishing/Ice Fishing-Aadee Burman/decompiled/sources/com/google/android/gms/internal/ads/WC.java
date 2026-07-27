package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.logging.Level;

/* loaded from: classes2.dex */
public abstract class WC {

    /* renamed from: a, reason: collision with root package name */
    public static Boolean f28324a;

    public static byte a(long j6) {
        AbstractC2772Sd.A((j6 >> 8) == 0, "out of range: %s", j6);
        return (byte) j6;
    }

    public static boolean c(int i) {
        Boolean bool;
        if (i - 1 != 0) {
            if (!HF.a()) {
                return true;
            }
            try {
                bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception unused) {
                HF.f25248a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
                bool = Boolean.FALSE;
            }
            if (bool.booleanValue()) {
                return true;
            }
        } else if (!HF.a()) {
            return true;
        }
        return false;
    }

    public static byte[] d(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 16) {
            int i6 = i + 1;
            byte b9 = bArr[i];
            byte b10 = (byte) ((b9 + b9) & 254);
            bArr2[i] = b10;
            if (i < 15) {
                bArr2[i] = (byte) (((bArr[i6] >> 7) & 1) | b10);
            }
            i = i6;
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }

    public static String f(ZJ zj) {
        int ordinal = zj.ordinal();
        if (ordinal == 0) {
            return "SHA-1";
        }
        if (ordinal == 1) {
            return "SHA-224";
        }
        if (ordinal == 2) {
            return "SHA-256";
        }
        if (ordinal == 3) {
            return "SHA-384";
        }
        if (ordinal == 4) {
            return "SHA-512";
        }
        throw new GeneralSecurityException("Unsupported hash ".concat(zj.toString()));
    }

    public static final void g(JK jk, ArrayDeque arrayDeque) {
        if (!jk.q()) {
            if (!(jk instanceof CL)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(jk.getClass())));
            }
            CL cl = (CL) jk;
            g(cl.f24104w, arrayDeque);
            g(cl.f24105x, arrayDeque);
            return;
        }
        int binarySearch = Arrays.binarySearch(CL.f24102A, jk.f());
        if (binarySearch < 0) {
            binarySearch = (-(binarySearch + 1)) - 1;
        }
        int v9 = CL.v(binarySearch + 1);
        if (arrayDeque.isEmpty() || ((JK) arrayDeque.peek()).f() >= v9) {
            arrayDeque.push(jk);
            return;
        }
        int v10 = CL.v(binarySearch);
        JK jk2 = (JK) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((JK) arrayDeque.peek()).f() < v10) {
            jk2 = new CL((JK) arrayDeque.pop(), jk2);
        }
        CL cl2 = new CL(jk2, jk);
        while (!arrayDeque.isEmpty()) {
            int binarySearch2 = Arrays.binarySearch(CL.f24102A, cl2.f24103v);
            if (binarySearch2 < 0) {
                binarySearch2 = (-(binarySearch2 + 1)) - 1;
            }
            if (((JK) arrayDeque.peek()).f() >= CL.v(binarySearch2 + 1)) {
                break;
            } else {
                cl2 = new CL((JK) arrayDeque.pop(), cl2);
            }
        }
        arrayDeque.push(cl2);
    }

    public static LinkedHashMap h(int i) {
        return new LinkedHashMap(i < 3 ? i + 1 : i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : Integer.MAX_VALUE);
    }

    public abstract AbstractC3825rE b();

    public abstract Integer e();
}
