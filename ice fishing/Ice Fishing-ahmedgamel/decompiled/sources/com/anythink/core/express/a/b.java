package com.anythink.core.express.a;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f17515a = 256;

    /* renamed from: b, reason: collision with root package name */
    private static Map<Character, Character> f17516b = null;

    /* renamed from: c, reason: collision with root package name */
    private static Map<Character, Character> f17517c = null;

    /* renamed from: d, reason: collision with root package name */
    private static final char[] f17518d;

    /* renamed from: e, reason: collision with root package name */
    private static char[] f17519e = null;

    /* renamed from: f, reason: collision with root package name */
    private static final char f17520f = '=';

    /* renamed from: g, reason: collision with root package name */
    private static final byte[] f17521g;

    static {
        char[] cArr = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
        f17518d = cArr;
        HashMap hashMap = new HashMap();
        f17516b = hashMap;
        hashMap.put('A', 'v');
        f17516b.put('B', 'S');
        f17516b.put('C', 'o');
        f17516b.put('D', 'a');
        f17516b.put('E', 'j');
        f17516b.put('F', 'c');
        f17516b.put('G', '7');
        f17516b.put('H', 'd');
        f17516b.put('I', 'R');
        f17516b.put('J', 'z');
        f17516b.put('K', 'p');
        f17516b.put('L', 'W');
        f17516b.put('M', 'i');
        f17516b.put('N', 'f');
        f17516b.put('O', 'G');
        f17516b.put('P', 'y');
        f17516b.put('Q', 'N');
        f17516b.put('R', 'x');
        f17516b.put('S', 'Z');
        f17516b.put('T', 'n');
        f17516b.put('U', 'V');
        f17516b.put('V', '5');
        f17516b.put('W', 'k');
        f17516b.put('X', '+');
        f17516b.put('Y', 'D');
        f17516b.put('Z', 'H');
        f17516b.put('a', 'L');
        f17516b.put('b', 'Y');
        f17516b.put('c', 'h');
        f17516b.put('d', 'J');
        f17516b.put('e', '4');
        f17516b.put('f', '6');
        f17516b.put('g', 'l');
        f17516b.put('h', 't');
        f17516b.put('i', '0');
        f17516b.put('j', 'U');
        f17516b.put('k', '3');
        f17516b.put('l', 'Q');
        f17516b.put('m', 'r');
        f17516b.put('n', 'g');
        f17516b.put('o', 'E');
        f17516b.put('p', 'u');
        f17516b.put('q', 'q');
        f17516b.put('r', '8');
        f17516b.put('s', 's');
        f17516b.put('t', 'w');
        f17516b.put('u', '/');
        f17516b.put('v', 'X');
        f17516b.put('w', 'M');
        f17516b.put('x', 'e');
        f17516b.put('y', 'B');
        f17516b.put('z', 'A');
        f17516b.put('0', 'T');
        f17516b.put('1', '2');
        f17516b.put('2', 'F');
        f17516b.put('3', 'b');
        f17516b.put('4', '9');
        f17516b.put('5', 'P');
        f17516b.put('6', '1');
        f17516b.put('7', 'O');
        f17516b.put('8', 'I');
        f17516b.put('9', 'K');
        f17516b.put('+', 'm');
        f17516b.put('/', 'C');
        f17519e = new char[cArr.length];
        int i = 0;
        int i6 = 0;
        while (true) {
            char[] cArr2 = f17518d;
            if (i6 >= cArr2.length) {
                break;
            }
            f17519e[i6] = f17516b.get(Character.valueOf(cArr2[i6])).charValue();
            i6++;
        }
        f17521g = new byte[128];
        int i9 = 0;
        while (true) {
            byte[] bArr = f17521g;
            if (i9 >= bArr.length) {
                break;
            }
            bArr[i9] = Byte.MAX_VALUE;
            i9++;
        }
        while (true) {
            char[] cArr3 = f17519e;
            if (i >= cArr3.length) {
                return;
            }
            f17521g[cArr3[i]] = (byte) i;
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
            byte[] bArr2 = f17521g;
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
            bArr[i + 2] = (byte) (((b11 << 6) & 192) | (b12 & com.anythink.core.common.s.a.c.f16318c));
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
            int i6 = ((length >> 2) * 3) + 3;
            byte[] bArr = new byte[i6];
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
                    char c9 = cArr[i11];
                    if (c9 != '=') {
                        byte[] bArr2 = f17521g;
                        if (c9 < bArr2.length) {
                            if (bArr2[c9] == Byte.MAX_VALUE) {
                            }
                        }
                        i11++;
                    }
                    int i14 = i13 + 1;
                    cArr[i13] = c9;
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
            if (i10 == i6) {
                return bArr;
            }
            byte[] bArr3 = new byte[i10];
            System.arraycopy(bArr, 0, bArr3, 0, i10);
            return bArr3;
        } catch (Exception unused) {
            return null;
        }
    }

    private static byte[] a(char[] cArr, int i, int i6) {
        try {
            char[] cArr2 = new char[4];
            int i9 = ((i6 >> 2) * 3) + 3;
            byte[] bArr = new byte[i9];
            int i10 = 0;
            int i11 = 0;
            for (int i12 = i; i12 < i + i6; i12++) {
                char c9 = cArr[i12];
                if (c9 != '=') {
                    byte[] bArr2 = f17521g;
                    if (c9 < bArr2.length) {
                        if (bArr2[c9] == Byte.MAX_VALUE) {
                        }
                    }
                }
                int i13 = i11 + 1;
                cArr2[i11] = c9;
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
            int i6 = 0;
            int i9 = 0;
            while (i >= 3) {
                int i10 = ((bArr[i6] & 255) << 16) + ((bArr[i6 + 1] & 255) << 8) + (bArr[i6 + 2] & 255);
                char[] cArr2 = f17519e;
                cArr[i9] = cArr2[i10 >> 18];
                cArr[i9 + 1] = cArr2[(i10 >> 12) & 63];
                int i11 = i9 + 3;
                cArr[i9 + 2] = cArr2[(i10 >> 6) & 63];
                i9 += 4;
                cArr[i11] = cArr2[i10 & 63];
                i6 += 3;
                i -= 3;
            }
            if (i == 1) {
                int i12 = bArr[i6] & 255;
                char[] cArr3 = f17519e;
                cArr[i9] = cArr3[i12 >> 2];
                cArr[i9 + 1] = cArr3[(i12 << 4) & 63];
                int i13 = i9 + 3;
                cArr[i9 + 2] = f17520f;
                i9 += 4;
                cArr[i13] = f17520f;
            } else if (i == 2) {
                int i14 = ((bArr[i6] & 255) << 8) + (bArr[i6 + 1] & 255);
                char[] cArr4 = f17519e;
                cArr[i9] = cArr4[i14 >> 10];
                cArr[i9 + 1] = cArr4[(i14 >> 4) & 63];
                int i15 = i9 + 3;
                cArr[i9 + 2] = cArr4[(i14 << 2) & 63];
                i9 += 4;
                cArr[i15] = f17520f;
            }
            return new String(cArr, 0, i9);
        } catch (Exception unused) {
            return null;
        }
    }
}
