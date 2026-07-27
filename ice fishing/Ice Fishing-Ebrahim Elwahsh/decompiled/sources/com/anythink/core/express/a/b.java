package com.anythink.core.express.a;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f17673a = 256;

    /* renamed from: b, reason: collision with root package name */
    private static Map<Character, Character> f17674b = null;

    /* renamed from: c, reason: collision with root package name */
    private static Map<Character, Character> f17675c = null;

    /* renamed from: d, reason: collision with root package name */
    private static final char[] f17676d;

    /* renamed from: e, reason: collision with root package name */
    private static char[] f17677e = null;

    /* renamed from: f, reason: collision with root package name */
    private static final char f17678f = '=';

    /* renamed from: g, reason: collision with root package name */
    private static final byte[] f17679g;

    static {
        char[] cArr = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
        f17676d = cArr;
        HashMap hashMap = new HashMap();
        f17674b = hashMap;
        hashMap.put('A', 'v');
        f17674b.put('B', 'S');
        f17674b.put('C', 'o');
        f17674b.put('D', 'a');
        f17674b.put('E', 'j');
        f17674b.put('F', 'c');
        f17674b.put('G', '7');
        f17674b.put('H', 'd');
        f17674b.put('I', 'R');
        f17674b.put('J', 'z');
        f17674b.put('K', 'p');
        f17674b.put('L', 'W');
        f17674b.put('M', 'i');
        f17674b.put('N', 'f');
        f17674b.put('O', 'G');
        f17674b.put('P', 'y');
        f17674b.put('Q', 'N');
        f17674b.put('R', 'x');
        f17674b.put('S', 'Z');
        f17674b.put('T', 'n');
        f17674b.put('U', 'V');
        f17674b.put('V', '5');
        f17674b.put('W', 'k');
        f17674b.put('X', '+');
        f17674b.put('Y', 'D');
        f17674b.put('Z', 'H');
        f17674b.put('a', 'L');
        f17674b.put('b', 'Y');
        f17674b.put('c', 'h');
        f17674b.put('d', 'J');
        f17674b.put('e', '4');
        f17674b.put('f', '6');
        f17674b.put('g', 'l');
        f17674b.put('h', 't');
        f17674b.put('i', '0');
        f17674b.put('j', 'U');
        f17674b.put('k', '3');
        f17674b.put('l', 'Q');
        f17674b.put('m', 'r');
        f17674b.put('n', 'g');
        f17674b.put('o', 'E');
        f17674b.put('p', 'u');
        f17674b.put('q', 'q');
        f17674b.put('r', '8');
        f17674b.put('s', 's');
        f17674b.put('t', 'w');
        f17674b.put('u', '/');
        f17674b.put('v', 'X');
        f17674b.put('w', 'M');
        f17674b.put('x', 'e');
        f17674b.put('y', 'B');
        f17674b.put('z', 'A');
        f17674b.put('0', 'T');
        f17674b.put('1', '2');
        f17674b.put('2', 'F');
        f17674b.put('3', 'b');
        f17674b.put('4', '9');
        f17674b.put('5', 'P');
        f17674b.put('6', '1');
        f17674b.put('7', 'O');
        f17674b.put('8', 'I');
        f17674b.put('9', 'K');
        f17674b.put('+', 'm');
        f17674b.put('/', 'C');
        f17677e = new char[cArr.length];
        int i = 0;
        int i4 = 0;
        while (true) {
            char[] cArr2 = f17676d;
            if (i4 >= cArr2.length) {
                break;
            }
            f17677e[i4] = f17674b.get(Character.valueOf(cArr2[i4])).charValue();
            i4++;
        }
        f17679g = new byte[128];
        int i9 = 0;
        while (true) {
            byte[] bArr = f17679g;
            if (i9 >= bArr.length) {
                break;
            }
            bArr[i9] = Byte.MAX_VALUE;
            i9++;
        }
        while (true) {
            char[] cArr3 = f17677e;
            if (i >= cArr3.length) {
                return;
            }
            f17679g[cArr3[i]] = (byte) i;
            i++;
        }
    }

    private static int a(char[] cArr, byte[] bArr, int i) {
        try {
            char c4 = cArr[3];
            char c9 = c4 == '=' ? (char) 2 : (char) 3;
            char c10 = cArr[2];
            if (c10 == '=') {
                c9 = 1;
            }
            byte[] bArr2 = f17679g;
            byte b9 = bArr2[cArr[0]];
            byte b10 = bArr2[cArr[1]];
            byte b11 = bArr2[c10];
            byte b12 = bArr2[c4];
            if (c9 == 2) {
                bArr[i] = (byte) ((3 & (b10 >> 4)) | ((b9 << 2) & 252));
                bArr[i + 1] = (byte) (((b10 << 4) & 240) | ((b11 >> 2) & 15));
                return 2;
            }
            if (c9 != 3) {
                bArr[i] = (byte) (((b10 >> 4) & 3) | ((b9 << 2) & 252));
                return 1;
            }
            bArr[i] = (byte) (((b9 << 2) & 252) | ((b10 >> 4) & 3));
            bArr[i + 1] = (byte) (((b10 << 4) & 240) | ((b11 >> 2) & 15));
            bArr[i + 2] = (byte) (((b11 << 6) & 192) | (b12 & com.anythink.core.common.s.a.c.f16476c));
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
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            while (i9 < length) {
                int i12 = i9 + 256;
                if (i12 <= length) {
                    str.getChars(i9, i12, cArr, i11);
                    i = i11 + 256;
                } else {
                    str.getChars(i9, length, cArr, i11);
                    i = (length - i9) + i11;
                }
                int i13 = i11;
                while (i11 < i) {
                    char c4 = cArr[i11];
                    if (c4 != '=') {
                        byte[] bArr2 = f17679g;
                        if (c4 < bArr2.length) {
                            if (bArr2[c4] == Byte.MAX_VALUE) {
                            }
                        }
                        i11++;
                    }
                    int i14 = i13 + 1;
                    cArr[i13] = c4;
                    if (i14 == 4) {
                        i10 += a(cArr, bArr, i10);
                        i13 = 0;
                    } else {
                        i13 = i14;
                    }
                    i11++;
                }
                i9 = i12;
                i11 = i13;
            }
            if (i10 == i4) {
                return bArr;
            }
            byte[] bArr3 = new byte[i10];
            System.arraycopy(bArr, 0, bArr3, 0, i10);
            return bArr3;
        } catch (Exception unused) {
            return null;
        }
    }

    private static byte[] a(char[] cArr, int i, int i4) {
        try {
            char[] cArr2 = new char[4];
            int i9 = ((i4 >> 2) * 3) + 3;
            byte[] bArr = new byte[i9];
            int i10 = 0;
            int i11 = 0;
            for (int i12 = i; i12 < i + i4; i12++) {
                char c4 = cArr[i12];
                if (c4 != '=') {
                    byte[] bArr2 = f17679g;
                    if (c4 < bArr2.length) {
                        if (bArr2[c4] == Byte.MAX_VALUE) {
                        }
                    }
                }
                int i13 = i11 + 1;
                cArr2[i11] = c4;
                if (i13 == 4) {
                    i10 += a(cArr2, bArr, i10);
                    i11 = 0;
                } else {
                    i11 = i13;
                }
            }
            if (i10 == i9) {
                return bArr;
            }
            byte[] bArr3 = new byte[i10];
            System.arraycopy(bArr, 0, bArr3, 0, i10);
            return bArr3;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String a(String str) {
        byte[] c4 = c(str);
        if (c4 == null || c4.length <= 0) {
            return null;
        }
        return new String(c4);
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
            int i9 = 0;
            while (i >= 3) {
                int i10 = ((bArr[i4] & 255) << 16) + ((bArr[i4 + 1] & 255) << 8) + (bArr[i4 + 2] & 255);
                char[] cArr2 = f17677e;
                cArr[i9] = cArr2[i10 >> 18];
                cArr[i9 + 1] = cArr2[(i10 >> 12) & 63];
                int i11 = i9 + 3;
                cArr[i9 + 2] = cArr2[(i10 >> 6) & 63];
                i9 += 4;
                cArr[i11] = cArr2[i10 & 63];
                i4 += 3;
                i -= 3;
            }
            if (i == 1) {
                int i12 = bArr[i4] & 255;
                char[] cArr3 = f17677e;
                cArr[i9] = cArr3[i12 >> 2];
                cArr[i9 + 1] = cArr3[(i12 << 4) & 63];
                int i13 = i9 + 3;
                cArr[i9 + 2] = f17678f;
                i9 += 4;
                cArr[i13] = f17678f;
            } else if (i == 2) {
                int i14 = ((bArr[i4] & 255) << 8) + (bArr[i4 + 1] & 255);
                char[] cArr4 = f17677e;
                cArr[i9] = cArr4[i14 >> 10];
                cArr[i9 + 1] = cArr4[(i14 >> 4) & 63];
                int i15 = i9 + 3;
                cArr[i9 + 2] = cArr4[(i14 << 2) & 63];
                i9 += 4;
                cArr[i15] = f17678f;
            }
            return new String(cArr, 0, i9);
        } catch (Exception unused) {
            return null;
        }
    }
}
