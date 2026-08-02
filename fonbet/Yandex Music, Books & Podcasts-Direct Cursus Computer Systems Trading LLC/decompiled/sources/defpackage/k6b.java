package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
public abstract class k6b {
    public static final int[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};
    public static final Charset b = StandardCharsets.ISO_8859_1;

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b A[LOOP:0: B:11:0x0020->B:18:0x004b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(String str, fci fciVar, w23 w23Var, Charset charset) {
        int i;
        int ordinal = fciVar.ordinal();
        int i2 = 0;
        if (ordinal == 1) {
            int length = str.length();
            while (i2 < length) {
                int charAt = str.charAt(i2) - '0';
                int i3 = i2 + 2;
                if (i3 < length) {
                    w23Var.c(((str.charAt(i2 + 1) - '0') * 10) + (charAt * 100) + (str.charAt(i3) - '0'), 10);
                    i2 += 3;
                } else {
                    i2++;
                    if (i2 < length) {
                        w23Var.c((charAt * 10) + (str.charAt(i2) - '0'), 7);
                        i2 = i3;
                    } else {
                        w23Var.c(charAt, 4);
                    }
                }
            }
            return;
        }
        if (ordinal == 2) {
            int length2 = str.length();
            while (i2 < length2) {
                char charAt2 = str.charAt(i2);
                int[] iArr = a;
                int i4 = charAt2 < '`' ? iArr[charAt2] : -1;
                if (i4 == -1) {
                    throw new k6w();
                }
                int i5 = i2 + 1;
                if (i5 < length2) {
                    char charAt3 = str.charAt(i5);
                    int i6 = charAt3 < '`' ? iArr[charAt3] : -1;
                    if (i6 == -1) {
                        throw new k6w();
                    }
                    w23Var.c((i4 * 45) + i6, 11);
                    i2 += 2;
                } else {
                    w23Var.c(i4, 6);
                    i2 = i5;
                }
            }
            return;
        }
        if (ordinal == 4) {
            byte[] bytes = str.getBytes(charset);
            int length3 = bytes.length;
            while (i2 < length3) {
                w23Var.c(bytes[i2], 8);
                i2++;
            }
            return;
        }
        if (ordinal != 6) {
            throw new k6w("Invalid mode: " + fciVar);
        }
        byte[] bytes2 = str.getBytes(blr.b);
        if (bytes2.length % 2 != 0) {
            throw new k6w("Kanji byte size not even");
        }
        int length4 = bytes2.length - 1;
        while (i2 < length4) {
            int i7 = ((bytes2[i2] & 255) << 8) | (bytes2[i2 + 1] & 255);
            int i8 = 33088;
            if (i7 < 33088 || i7 > 40956) {
                if (i7 < 57408 || i7 > 60351) {
                    i = -1;
                    if (i != -1) {
                        throw new k6w("Invalid byte sequence");
                    }
                    w23Var.c(((i >> 8) * 192) + (i & KotlinVersion.MAX_COMPONENT_VALUE), 13);
                    i2 += 2;
                } else {
                    i8 = 49472;
                }
            }
            i = i7 - i8;
            if (i != -1) {
            }
        }
    }

    public static boolean b(String str) {
        byte[] bytes = str.getBytes(blr.b);
        int length = bytes.length;
        if (length % 2 != 0) {
            return false;
        }
        for (int i = 0; i < length; i += 2) {
            int i2 = bytes[i] & 255;
            if ((i2 < 129 || i2 > 159) && (i2 < 224 || i2 > 235)) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(int i, q0u q0uVar, int i2) {
        int i3 = q0uVar.c;
        j4x j4xVar = q0uVar.b[ouj.D(i2)];
        int i4 = j4xVar.b;
        int i5 = 0;
        for (c9n c9nVar : (c9n[]) j4xVar.c) {
            i5 += c9nVar.b;
        }
        return i3 - (i5 * i4) >= (i + 7) / 8;
    }
}
