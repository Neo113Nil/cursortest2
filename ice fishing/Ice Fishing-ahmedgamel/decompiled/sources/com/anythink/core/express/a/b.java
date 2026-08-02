package com.anythink.core.express.a;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f18302a = 256;

    /* renamed from: b, reason: collision with root package name */
    private static Map<Character, Character> f18303b = null;

    /* renamed from: c, reason: collision with root package name */
    private static Map<Character, Character> f18304c = null;

    /* renamed from: d, reason: collision with root package name */
    private static final char[] f18305d;

    /* renamed from: e, reason: collision with root package name */
    private static char[] f18306e = null;

    /* renamed from: f, reason: collision with root package name */
    private static final char f18307f = '=';

    /* renamed from: g, reason: collision with root package name */
    private static final byte[] f18308g;

    static {
        char[] cArr = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
        f18305d = cArr;
        HashMap hashMap = new HashMap();
        f18303b = hashMap;
        hashMap.put('A', 'v');
        f18303b.put('B', 'S');
        f18303b.put('C', 'o');
        f18303b.put('D', 'a');
        f18303b.put('E', 'j');
        f18303b.put('F', 'c');
        f18303b.put('G', '7');
        f18303b.put('H', 'd');
        f18303b.put('I', 'R');
        f18303b.put('J', 'z');
        f18303b.put('K', 'p');
        f18303b.put('L', 'W');
        f18303b.put('M', 'i');
        f18303b.put('N', 'f');
        f18303b.put('O', 'G');
        f18303b.put('P', 'y');
        f18303b.put('Q', 'N');
        f18303b.put('R', 'x');
        f18303b.put('S', 'Z');
        f18303b.put('T', 'n');
        f18303b.put('U', 'V');
        f18303b.put('V', '5');
        f18303b.put('W', 'k');
        f18303b.put('X', '+');
        f18303b.put('Y', 'D');
        f18303b.put('Z', 'H');
        f18303b.put('a', 'L');
        f18303b.put('b', 'Y');
        f18303b.put('c', 'h');
        f18303b.put('d', 'J');
        f18303b.put('e', '4');
        f18303b.put('f', '6');
        f18303b.put('g', 'l');
        f18303b.put('h', 't');
        f18303b.put('i', '0');
        f18303b.put('j', 'U');
        f18303b.put('k', '3');
        f18303b.put('l', 'Q');
        f18303b.put('m', 'r');
        f18303b.put('n', 'g');
        f18303b.put('o', 'E');
        f18303b.put('p', 'u');
        f18303b.put('q', 'q');
        f18303b.put('r', '8');
        f18303b.put('s', 's');
        f18303b.put('t', 'w');
        f18303b.put('u', '/');
        f18303b.put('v', 'X');
        f18303b.put('w', 'M');
        f18303b.put('x', 'e');
        f18303b.put('y', 'B');
        f18303b.put('z', 'A');
        f18303b.put('0', 'T');
        f18303b.put('1', '2');
        f18303b.put('2', 'F');
        f18303b.put('3', 'b');
        f18303b.put('4', '9');
        f18303b.put('5', 'P');
        f18303b.put('6', '1');
        f18303b.put('7', 'O');
        f18303b.put('8', 'I');
        f18303b.put('9', 'K');
        f18303b.put('+', 'm');
        f18303b.put('/', 'C');
        f18306e = new char[cArr.length];
        int i = 0;
        int i4 = 0;
        while (true) {
            char[] cArr2 = f18305d;
            if (i4 >= cArr2.length) {
                break;
            }
            f18306e[i4] = f18303b.get(Character.valueOf(cArr2[i4])).charValue();
            i4++;
        }
        f18308g = new byte[128];
        int i6 = 0;
        while (true) {
            byte[] bArr = f18308g;
            if (i6 >= bArr.length) {
                break;
            }
            bArr[i6] = Byte.MAX_VALUE;
            i6++;
        }
        while (true) {
            char[] cArr3 = f18306e;
            if (i >= cArr3.length) {
                return;
            }
            f18308g[cArr3[i]] = (byte) i;
            i++;
        }
    }

    private static int a(char[] cArr, byte[] bArr, int i) {
        try {
            char c9 = cArr[3];
            char c10 = c9 == '=' ? (char) 2 : (char) 3;
            char c11 = cArr[2];
            if (c11 == '=') {
                c10 = 1;
            }
            byte[] bArr2 = f18308g;
            byte b9 = bArr2[cArr[0]];
            byte b10 = bArr2[cArr[1]];
            byte b11 = bArr2[c11];
            byte b12 = bArr2[c9];
            if (c10 == 2) {
                bArr[i] = (byte) ((3 & (b10 >> 4)) | ((b9 << 2) & 252));
                bArr[i + 1] = (byte) (((b10 << 4) & 240) | ((b11 >> 2) & 15));
                return 2;
            }
            if (c10 != 3) {
                bArr[i] = (byte) (((b10 >> 4) & 3) | ((b9 << 2) & 252));
                return 1;
            }
            bArr[i] = (byte) (((b9 << 2) & 252) | ((b10 >> 4) & 3));
            bArr[i + 1] = (byte) (((b10 << 4) & 240) | ((b11 >> 2) & 15));
            bArr[i + 2] = (byte) (((b11 << 6) & 192) | (b12 & com.anythink.core.common.s.a.c.f17105c));
            return 3;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String b(String str) {
        byte[] bytes = str.getBytes();
        return a(bytes, bytes.length);
    }

    private static byte[] c(String str) {
        int i;
        try {
            int length = str.length();
            char[] cArr = new char[length < 259 ? length : 259];
            int i4 = ((length >> 2) * 3) + 3;
            byte[] bArr = new byte[i4];
            int i6 = 0;
            int i9 = 0;
            int i10 = 0;
            while (i6 < length) {
                int i11 = i6 + 256;
                if (i11 <= length) {
                    str.getChars(i6, i11, cArr, i10);
                    i = i10 + 256;
                } else {
                    str.getChars(i6, length, cArr, i10);
                    i = (length - i6) + i10;
                }
                int i12 = i10;
                while (i10 < i) {
                    char c9 = cArr[i10];
                    if (c9 != '=') {
                        byte[] bArr2 = f18308g;
                        if (c9 < bArr2.length) {
                            if (bArr2[c9] == Byte.MAX_VALUE) {
                            }
                        }
                        i10++;
                    }
                    int i13 = i12 + 1;
                    cArr[i12] = c9;
                    if (i13 == 4) {
                        i9 += a(cArr, bArr, i9);
                        i12 = 0;
                    } else {
                        i12 = i13;
                    }
                    i10++;
                }
                i6 = i11;
                i10 = i12;
            }
            if (i9 == i4) {
                return bArr;
            }
            byte[] bArr3 = new byte[i9];
            System.arraycopy(bArr, 0, bArr3, 0, i9);
            return bArr3;
        } catch (Exception unused) {
            return null;
        }
    }

    private static byte[] a(char[] cArr, int i, int i4) {
        try {
            char[] cArr2 = new char[4];
            int i6 = ((i4 >> 2) * 3) + 3;
            byte[] bArr = new byte[i6];
            int i9 = 0;
            int i10 = 0;
            for (int i11 = i; i11 < i + i4; i11++) {
                char c9 = cArr[i11];
                if (c9 != '=') {
                    byte[] bArr2 = f18308g;
                    if (c9 < bArr2.length) {
                        if (bArr2[c9] == Byte.MAX_VALUE) {
                        }
                    }
                }
                int i12 = i10 + 1;
                cArr2[i10] = c9;
                if (i12 == 4) {
                    i9 += a(cArr2, bArr, i9);
                    i10 = 0;
                } else {
                    i10 = i12;
                }
            }
            if (i9 == i6) {
                return bArr;
            }
            byte[] bArr3 = new byte[i9];
            System.arraycopy(bArr, 0, bArr3, 0, i9);
            return bArr3;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String a(String str) {
        byte[] c9 = c(str);
        if (c9 == null || c9.length <= 0) {
            return null;
        }
        return new String(c9);
    }

    private static String a(byte[] bArr) {
        return a(bArr, bArr.length);
    }

    private static String a(byte[] bArr, int i) {
        if (i <= 0) {
            return "";
        }
        try {
            char[] cArr = new char[((i / 3) << 2) + 4];
            int i4 = 0;
            int i6 = 0;
            while (i >= 3) {
                int i9 = ((bArr[i4] & 255) << 16) + ((bArr[i4 + 1] & 255) << 8) + (bArr[i4 + 2] & 255);
                char[] cArr2 = f18306e;
                cArr[i6] = cArr2[i9 >> 18];
                cArr[i6 + 1] = cArr2[(i9 >> 12) & 63];
                int i10 = i6 + 3;
                cArr[i6 + 2] = cArr2[(i9 >> 6) & 63];
                i6 += 4;
                cArr[i10] = cArr2[i9 & 63];
                i4 += 3;
                i -= 3;
            }
            if (i == 1) {
                int i11 = bArr[i4] & 255;
                char[] cArr3 = f18306e;
                cArr[i6] = cArr3[i11 >> 2];
                cArr[i6 + 1] = cArr3[(i11 << 4) & 63];
                int i12 = i6 + 3;
                cArr[i6 + 2] = f18307f;
                i6 += 4;
                cArr[i12] = f18307f;
            } else if (i == 2) {
                int i13 = ((bArr[i4] & 255) << 8) + (bArr[i4 + 1] & 255);
                char[] cArr4 = f18306e;
                cArr[i6] = cArr4[i13 >> 10];
                cArr[i6 + 1] = cArr4[(i13 >> 4) & 63];
                int i14 = i6 + 3;
                cArr[i6 + 2] = cArr4[(i13 << 2) & 63];
                i6 += 4;
                cArr[i14] = f18307f;
            }
            return new String(cArr, 0, i6);
        } catch (Exception unused) {
            return null;
        }
    }
}
