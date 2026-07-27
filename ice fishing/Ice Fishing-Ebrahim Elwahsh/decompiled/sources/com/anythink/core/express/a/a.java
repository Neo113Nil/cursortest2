package com.anythink.core.express.a;

import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f17668a = "a";

    /* renamed from: b, reason: collision with root package name */
    private static Map<Character, Character> f17669b;

    /* renamed from: c, reason: collision with root package name */
    private static Map<Character, Character> f17670c;

    /* renamed from: d, reason: collision with root package name */
    private static char[] f17671d = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* renamed from: e, reason: collision with root package name */
    private static byte[] f17672e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, com.anythink.core.common.s.a.c.f16476c, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    static {
        HashMap hashMap = new HashMap();
        f17670c = hashMap;
        hashMap.put('v', 'A');
        f17670c.put('S', 'B');
        f17670c.put('o', 'C');
        f17670c.put('a', 'D');
        f17670c.put('j', 'E');
        f17670c.put('c', 'F');
        f17670c.put('7', 'G');
        f17670c.put('d', 'H');
        f17670c.put('R', 'I');
        f17670c.put('z', 'J');
        f17670c.put('p', 'K');
        f17670c.put('W', 'L');
        f17670c.put('i', 'M');
        f17670c.put('f', 'N');
        f17670c.put('G', 'O');
        f17670c.put('y', 'P');
        f17670c.put('N', 'Q');
        f17670c.put('x', 'R');
        f17670c.put('Z', 'S');
        f17670c.put('n', 'T');
        f17670c.put('V', 'U');
        f17670c.put('5', 'V');
        f17670c.put('k', 'W');
        f17670c.put('+', 'X');
        f17670c.put('D', 'Y');
        f17670c.put('H', 'Z');
        f17670c.put('L', 'a');
        f17670c.put('Y', 'b');
        f17670c.put('h', 'c');
        f17670c.put('J', 'd');
        f17670c.put('4', 'e');
        f17670c.put('6', 'f');
        f17670c.put('l', 'g');
        f17670c.put('t', 'h');
        f17670c.put('0', 'i');
        f17670c.put('U', 'j');
        f17670c.put('3', 'k');
        f17670c.put('Q', 'l');
        f17670c.put('r', 'm');
        f17670c.put('g', 'n');
        f17670c.put('E', 'o');
        f17670c.put('u', 'p');
        f17670c.put('q', 'q');
        f17670c.put('8', 'r');
        f17670c.put('s', 's');
        f17670c.put('w', 't');
        f17670c.put('/', 'u');
        f17670c.put('X', 'v');
        f17670c.put('M', 'w');
        f17670c.put('e', 'x');
        f17670c.put('B', 'y');
        f17670c.put('A', 'z');
        f17670c.put('T', '0');
        f17670c.put('2', '1');
        f17670c.put('F', '2');
        f17670c.put('b', '3');
        f17670c.put('9', '4');
        f17670c.put('P', '5');
        f17670c.put('1', '6');
        f17670c.put('O', '7');
        f17670c.put('I', '8');
        f17670c.put('K', '9');
        f17670c.put('m', '+');
        f17670c.put('C', '/');
        HashMap hashMap2 = new HashMap();
        f17669b = hashMap2;
        hashMap2.put('A', 'v');
        f17669b.put('B', 'S');
        f17669b.put('C', 'o');
        f17669b.put('D', 'a');
        f17669b.put('E', 'j');
        f17669b.put('F', 'c');
        f17669b.put('G', '7');
        f17669b.put('H', 'd');
        f17669b.put('I', 'R');
        f17669b.put('J', 'z');
        f17669b.put('K', 'p');
        f17669b.put('L', 'W');
        f17669b.put('M', 'i');
        f17669b.put('N', 'f');
        f17669b.put('O', 'G');
        f17669b.put('P', 'y');
        f17669b.put('Q', 'N');
        f17669b.put('R', 'x');
        f17669b.put('S', 'Z');
        f17669b.put('T', 'n');
        f17669b.put('U', 'V');
        f17669b.put('V', '5');
        f17669b.put('W', 'k');
        f17669b.put('X', '+');
        f17669b.put('Y', 'D');
        f17669b.put('Z', 'H');
        f17669b.put('a', 'L');
        f17669b.put('b', 'Y');
        f17669b.put('c', 'h');
        f17669b.put('d', 'J');
        f17669b.put('e', '4');
        f17669b.put('f', '6');
        f17669b.put('g', 'l');
        f17669b.put('h', 't');
        f17669b.put('i', '0');
        f17669b.put('j', 'U');
        f17669b.put('k', '3');
        f17669b.put('l', 'Q');
        f17669b.put('m', 'r');
        f17669b.put('n', 'g');
        f17669b.put('o', 'E');
        f17669b.put('p', 'u');
        f17669b.put('q', 'q');
        f17669b.put('r', '8');
        f17669b.put('s', 's');
        f17669b.put('t', 'w');
        f17669b.put('u', '/');
        f17669b.put('v', 'X');
        f17669b.put('w', 'M');
        f17669b.put('x', 'e');
        f17669b.put('y', 'B');
        f17669b.put('z', 'A');
        f17669b.put('0', 'T');
        f17669b.put('1', '2');
        f17669b.put('2', 'F');
        f17669b.put('3', 'b');
        f17669b.put('4', '9');
        f17669b.put('5', 'P');
        f17669b.put('6', '1');
        f17669b.put('7', 'O');
        f17669b.put('8', 'I');
        f17669b.put('9', 'K');
        f17669b.put('+', 'm');
        f17669b.put('/', 'C');
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
            int i4 = i + 1;
            byte b9 = bArr[i];
            int i9 = b9 & 255;
            if (i4 == length) {
                stringBuffer.append(f17671d[i9 >>> 2]);
                stringBuffer.append(f17671d[(b9 & 3) << 4]);
                stringBuffer.append("==");
                break;
            }
            int i10 = i + 2;
            byte b10 = bArr[i4];
            if (i10 == length) {
                stringBuffer.append(f17671d[i9 >>> 2]);
                stringBuffer.append(f17671d[((b9 & 3) << 4) | ((b10 & 240) >>> 4)]);
                stringBuffer.append(f17671d[(b10 & 15) << 2]);
                stringBuffer.append("=");
                break;
            }
            i += 3;
            byte b11 = bArr[i10];
            stringBuffer.append(f17671d[i9 >>> 2]);
            stringBuffer.append(f17671d[((b9 & 3) << 4) | ((b10 & 240) >>> 4)]);
            stringBuffer.append(f17671d[((b10 & 15) << 2) | ((b11 & 192) >>> 6)]);
            stringBuffer.append(f17671d[b11 & com.anythink.core.common.s.a.c.f16476c]);
        }
        return stringBuffer.toString();
    }

    public static String b(String str) {
        return b.a(str);
    }

    private static byte[] c(String str) {
        int i;
        byte b9;
        int i4;
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
                b9 = f17672e[bytes[i11]];
                if (i >= length || b9 != -1) {
                    break;
                }
                i11 = i;
            }
            if (b9 == -1) {
                break;
            }
            while (true) {
                i4 = i + 1;
                b10 = f17672e[bytes[i]];
                if (i4 >= length || b10 != -1) {
                    break;
                }
                i = i4;
            }
            if (b10 == -1) {
                break;
            }
            byteArrayOutputStream.write((b9 << 2) | ((b10 & 48) >>> 4));
            while (true) {
                i9 = i4 + 1;
                byte b13 = bytes[i4];
                if (b13 == 61) {
                    return byteArrayOutputStream.toByteArray();
                }
                b11 = f17672e[b13];
                if (i9 >= length || b11 != -1) {
                    break;
                }
                i4 = i9;
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
                b12 = f17672e[b14];
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
