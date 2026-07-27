package com.google.android.gms.internal.ads;

import android.os.Build;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Date;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.xD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4161xD {
    public static /* synthetic */ String a(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            default:
                return "END_DOCUMENT";
        }
    }

    public static Date b(long j9) {
        return new Date((j9 - 2082844800) * 1000);
    }

    public static boolean d(int i) {
        if (i == 8 || i == 7) {
            return true;
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 31 || !(i == 26 || i == 27)) {
            return i4 >= 33 && i == 30;
        }
        return true;
    }

    public static byte[] e(String str) {
        if ((str.length() & 1) != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() >> 1;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i4 = i + i;
            int digit = Character.digit(str.charAt(i4), 16);
            int digit2 = Character.digit(str.charAt(i4 + 1), 16);
            if (digit == -1 || digit2 == -1) {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i] = (byte) ((digit * 16) + digit2);
        }
        return bArr;
    }

    public static byte[] f(BigInteger bigInteger) {
        if (bigInteger.signum() != -1) {
            return bigInteger.toByteArray();
        }
        throw new IllegalArgumentException("n must not be negative");
    }

    public static AbstractC4000uE h(byte[] bArr) {
        try {
            YK yk = YK.f28820a;
            int i = KK.f25952a;
            C3573mI D8 = C3573mI.D(bArr, YK.f28821b);
            C3517lG c3517lG = C3517lG.f32558b;
            C3791qK b9 = IG.b(D8.A());
            CG cg = new CG(D8, b9);
            HG hg = (HG) c3517lG.f32559a.get();
            hg.getClass();
            return !hg.f25343d.containsKey(new FG(CG.class, b9)) ? new C3139eG(cg) : c3517lG.g(cg);
        } catch (IOException e6) {
            throw new GeneralSecurityException("Failed to parse proto", e6);
        }
    }

    public static byte[] i(BigInteger bigInteger, int i) {
        if (bigInteger.signum() == -1) {
            throw new IllegalArgumentException("integer must be nonnegative");
        }
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        if (length == i) {
            return byteArray;
        }
        int i4 = i + 1;
        if (length > i4) {
            throw new GeneralSecurityException("integer too large");
        }
        if (length == i4) {
            if (byteArray[0] == 0) {
                return Arrays.copyOfRange(byteArray, 1, length);
            }
            throw new GeneralSecurityException("integer too large");
        }
        byte[] bArr = new byte[i];
        System.arraycopy(byteArray, 0, bArr, i - length, length);
        return bArr;
    }

    public abstract void c(AbstractC4107wD abstractC4107wD, Set set);

    public abstract int g(AbstractC4107wD abstractC4107wD);
}
