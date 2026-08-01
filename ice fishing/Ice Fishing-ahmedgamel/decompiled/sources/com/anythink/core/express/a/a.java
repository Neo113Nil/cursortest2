package com.anythink.core.express.a;

import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f17510a = "a";

    /* renamed from: b, reason: collision with root package name */
    private static Map<Character, Character> f17511b;

    /* renamed from: c, reason: collision with root package name */
    private static Map<Character, Character> f17512c;

    /* renamed from: d, reason: collision with root package name */
    private static char[] f17513d = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* renamed from: e, reason: collision with root package name */
    private static byte[] f17514e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, com.anythink.core.common.s.a.c.f16318c, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    static {
        HashMap hashMap = new HashMap();
        f17512c = hashMap;
        hashMap.put('v', 'A');
        f17512c.put('S', 'B');
        f17512c.put('o', 'C');
        f17512c.put('a', 'D');
        f17512c.put('j', 'E');
        f17512c.put('c', 'F');
        f17512c.put('7', 'G');
        f17512c.put('d', 'H');
        f17512c.put('R', 'I');
        f17512c.put('z', 'J');
        f17512c.put('p', 'K');
        f17512c.put('W', 'L');
        f17512c.put('i', 'M');
        f17512c.put('f', 'N');
        f17512c.put('G', 'O');
        f17512c.put('y', 'P');
        f17512c.put('N', 'Q');
        f17512c.put('x', 'R');
        f17512c.put('Z', 'S');
        f17512c.put('n', 'T');
        f17512c.put('V', 'U');
        f17512c.put('5', 'V');
        f17512c.put('k', 'W');
        f17512c.put('+', 'X');
        f17512c.put('D', 'Y');
        f17512c.put('H', 'Z');
        f17512c.put('L', 'a');
        f17512c.put('Y', 'b');
        f17512c.put('h', 'c');
        f17512c.put('J', 'd');
        f17512c.put('4', 'e');
        f17512c.put('6', 'f');
        f17512c.put('l', 'g');
        f17512c.put('t', 'h');
        f17512c.put('0', 'i');
        f17512c.put('U', 'j');
        f17512c.put('3', 'k');
        f17512c.put('Q', 'l');
        f17512c.put('r', 'm');
        f17512c.put('g', 'n');
        f17512c.put('E', 'o');
        f17512c.put('u', 'p');
        f17512c.put('q', 'q');
        f17512c.put('8', 'r');
        f17512c.put('s', 's');
        f17512c.put('w', 't');
        f17512c.put('/', 'u');
        f17512c.put('X', 'v');
        f17512c.put('M', 'w');
        f17512c.put('e', 'x');
        f17512c.put('B', 'y');
        f17512c.put('A', 'z');
        f17512c.put('T', '0');
        f17512c.put('2', '1');
        f17512c.put('F', '2');
        f17512c.put('b', '3');
        f17512c.put('9', '4');
        f17512c.put('P', '5');
        f17512c.put('1', '6');
        f17512c.put('O', '7');
        f17512c.put('I', '8');
        f17512c.put('K', '9');
        f17512c.put('m', '+');
        f17512c.put('C', '/');
        HashMap hashMap2 = new HashMap();
        f17511b = hashMap2;
        hashMap2.put('A', 'v');
        f17511b.put('B', 'S');
        f17511b.put('C', 'o');
        f17511b.put('D', 'a');
        f17511b.put('E', 'j');
        f17511b.put('F', 'c');
        f17511b.put('G', '7');
        f17511b.put('H', 'd');
        f17511b.put('I', 'R');
        f17511b.put('J', 'z');
        f17511b.put('K', 'p');
        f17511b.put('L', 'W');
        f17511b.put('M', 'i');
        f17511b.put('N', 'f');
        f17511b.put('O', 'G');
        f17511b.put('P', 'y');
        f17511b.put('Q', 'N');
        f17511b.put('R', 'x');
        f17511b.put('S', 'Z');
        f17511b.put('T', 'n');
        f17511b.put('U', 'V');
        f17511b.put('V', '5');
        f17511b.put('W', 'k');
        f17511b.put('X', '+');
        f17511b.put('Y', 'D');
        f17511b.put('Z', 'H');
        f17511b.put('a', 'L');
        f17511b.put('b', 'Y');
        f17511b.put('c', 'h');
        f17511b.put('d', 'J');
        f17511b.put('e', '4');
        f17511b.put('f', '6');
        f17511b.put('g', 'l');
        f17511b.put('h', 't');
        f17511b.put('i', '0');
        f17511b.put('j', 'U');
        f17511b.put('k', '3');
        f17511b.put('l', 'Q');
        f17511b.put('m', 'r');
        f17511b.put('n', 'g');
        f17511b.put('o', 'E');
        f17511b.put('p', 'u');
        f17511b.put('q', 'q');
        f17511b.put('r', '8');
        f17511b.put('s', 's');
        f17511b.put('t', 'w');
        f17511b.put('u', '/');
        f17511b.put('v', 'X');
        f17511b.put('w', 'M');
        f17511b.put('x', 'e');
        f17511b.put('y', 'B');
        f17511b.put('z', 'A');
        f17511b.put('0', 'T');
        f17511b.put('1', '2');
        f17511b.put('2', 'F');
        f17511b.put('3', 'b');
        f17511b.put('4', '9');
        f17511b.put('5', 'P');
        f17511b.put('6', '1');
        f17511b.put('7', 'O');
        f17511b.put('8', 'I');
        f17511b.put('9', 'K');
        f17511b.put('+', 'm');
        f17511b.put('/', 'C');
    }

    private a() {
    }

    private static String a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            int i6 = i + 1;
            byte b9 = bArr[i];
            int i9 = b9 & 255;
            if (i6 == length) {
                stringBuffer.append(f17513d[i9 >>> 2]);
                stringBuffer.append(f17513d[(b9 & 3) << 4]);
                stringBuffer.append("==");
                break;
            }
            int i10 = i + 2;
            byte b10 = bArr[i6];
            if (i10 == length) {
                stringBuffer.append(f17513d[i9 >>> 2]);
                stringBuffer.append(f17513d[((b9 & 3) << 4) | ((b10 & 240) >>> 4)]);
                stringBuffer.append(f17513d[(b10 & 15) << 2]);
                stringBuffer.append("=");
                break;
            }
            i += 3;
            byte b11 = bArr[i10];
            stringBuffer.append(f17513d[i9 >>> 2]);
            stringBuffer.append(f17513d[((b9 & 3) << 4) | ((b10 & 240) >>> 4)]);
            stringBuffer.append(f17513d[((b10 & 15) << 2) | ((b11 & 192) >>> 6)]);
            stringBuffer.append(f17513d[b11 & com.anythink.core.common.s.a.c.f16318c]);
        }
        return stringBuffer.toString();
    }

    public static String b(String str) {
        return b.a(str);
    }

    private static byte[] c(String str) {
        int i;
        byte b9;
        int i6;
        byte b10;
        int i9;
        byte b11;
        int i10;
        byte b12;
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        int i11 = 0;
        while (i11 < length) {
            while (true) {
                i = i11 + 1;
                b9 = f17514e[bytes[i11]];
                if (i >= length || b9 != -1) {
                    break;
                }
                i11 = i;
            }
            if (b9 == -1) {
                break;
            }
            while (true) {
                i6 = i + 1;
                b10 = f17514e[bytes[i]];
                if (i6 >= length || b10 != -1) {
                    break;
                }
                i = i6;
            }
            if (b10 == -1) {
                break;
            }
            byteArrayOutputStream.write((b9 << 2) | ((b10 & 48) >>> 4));
            while (true) {
                i9 = i6 + 1;
                byte b13 = bytes[i6];
                if (b13 == 61) {
                    return byteArrayOutputStream.toByteArray();
                }
                b11 = f17514e[b13];
                if (i9 >= length || b11 != -1) {
                    break;
                }
                i6 = i9;
            }
            if (b11 == -1) {
                break;
            }
            byteArrayOutputStream.write(((b10 & 15) << 4) | ((b11 & 60) >>> 2));
            while (true) {
                i10 = i9 + 1;
                byte b14 = bytes[i9];
                if (b14 == 61) {
                    return byteArrayOutputStream.toByteArray();
                }
                b12 = f17514e[b14];
                if (i10 >= length || b12 != -1) {
                    break;
                }
                i9 = i10;
            }
            if (b12 == -1) {
                break;
            }
            byteArrayOutputStream.write(b12 | ((b11 & 3) << 6));
            i11 = i10;
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return b.b(str);
    }
}
