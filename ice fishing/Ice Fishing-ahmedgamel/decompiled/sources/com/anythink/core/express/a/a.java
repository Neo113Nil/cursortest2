package com.anythink.core.express.a;

import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f18297a = "a";

    /* renamed from: b, reason: collision with root package name */
    private static Map<Character, Character> f18298b;

    /* renamed from: c, reason: collision with root package name */
    private static Map<Character, Character> f18299c;

    /* renamed from: d, reason: collision with root package name */
    private static char[] f18300d = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* renamed from: e, reason: collision with root package name */
    private static byte[] f18301e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, com.anythink.core.common.s.a.c.f17105c, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    static {
        HashMap hashMap = new HashMap();
        f18299c = hashMap;
        hashMap.put('v', 'A');
        f18299c.put('S', 'B');
        f18299c.put('o', 'C');
        f18299c.put('a', 'D');
        f18299c.put('j', 'E');
        f18299c.put('c', 'F');
        f18299c.put('7', 'G');
        f18299c.put('d', 'H');
        f18299c.put('R', 'I');
        f18299c.put('z', 'J');
        f18299c.put('p', 'K');
        f18299c.put('W', 'L');
        f18299c.put('i', 'M');
        f18299c.put('f', 'N');
        f18299c.put('G', 'O');
        f18299c.put('y', 'P');
        f18299c.put('N', 'Q');
        f18299c.put('x', 'R');
        f18299c.put('Z', 'S');
        f18299c.put('n', 'T');
        f18299c.put('V', 'U');
        f18299c.put('5', 'V');
        f18299c.put('k', 'W');
        f18299c.put('+', 'X');
        f18299c.put('D', 'Y');
        f18299c.put('H', 'Z');
        f18299c.put('L', 'a');
        f18299c.put('Y', 'b');
        f18299c.put('h', 'c');
        f18299c.put('J', 'd');
        f18299c.put('4', 'e');
        f18299c.put('6', 'f');
        f18299c.put('l', 'g');
        f18299c.put('t', 'h');
        f18299c.put('0', 'i');
        f18299c.put('U', 'j');
        f18299c.put('3', 'k');
        f18299c.put('Q', 'l');
        f18299c.put('r', 'm');
        f18299c.put('g', 'n');
        f18299c.put('E', 'o');
        f18299c.put('u', 'p');
        f18299c.put('q', 'q');
        f18299c.put('8', 'r');
        f18299c.put('s', 's');
        f18299c.put('w', 't');
        f18299c.put('/', 'u');
        f18299c.put('X', 'v');
        f18299c.put('M', 'w');
        f18299c.put('e', 'x');
        f18299c.put('B', 'y');
        f18299c.put('A', 'z');
        f18299c.put('T', '0');
        f18299c.put('2', '1');
        f18299c.put('F', '2');
        f18299c.put('b', '3');
        f18299c.put('9', '4');
        f18299c.put('P', '5');
        f18299c.put('1', '6');
        f18299c.put('O', '7');
        f18299c.put('I', '8');
        f18299c.put('K', '9');
        f18299c.put('m', '+');
        f18299c.put('C', '/');
        HashMap hashMap2 = new HashMap();
        f18298b = hashMap2;
        hashMap2.put('A', 'v');
        f18298b.put('B', 'S');
        f18298b.put('C', 'o');
        f18298b.put('D', 'a');
        f18298b.put('E', 'j');
        f18298b.put('F', 'c');
        f18298b.put('G', '7');
        f18298b.put('H', 'd');
        f18298b.put('I', 'R');
        f18298b.put('J', 'z');
        f18298b.put('K', 'p');
        f18298b.put('L', 'W');
        f18298b.put('M', 'i');
        f18298b.put('N', 'f');
        f18298b.put('O', 'G');
        f18298b.put('P', 'y');
        f18298b.put('Q', 'N');
        f18298b.put('R', 'x');
        f18298b.put('S', 'Z');
        f18298b.put('T', 'n');
        f18298b.put('U', 'V');
        f18298b.put('V', '5');
        f18298b.put('W', 'k');
        f18298b.put('X', '+');
        f18298b.put('Y', 'D');
        f18298b.put('Z', 'H');
        f18298b.put('a', 'L');
        f18298b.put('b', 'Y');
        f18298b.put('c', 'h');
        f18298b.put('d', 'J');
        f18298b.put('e', '4');
        f18298b.put('f', '6');
        f18298b.put('g', 'l');
        f18298b.put('h', 't');
        f18298b.put('i', '0');
        f18298b.put('j', 'U');
        f18298b.put('k', '3');
        f18298b.put('l', 'Q');
        f18298b.put('m', 'r');
        f18298b.put('n', 'g');
        f18298b.put('o', 'E');
        f18298b.put('p', 'u');
        f18298b.put('q', 'q');
        f18298b.put('r', '8');
        f18298b.put('s', 's');
        f18298b.put('t', 'w');
        f18298b.put('u', '/');
        f18298b.put('v', 'X');
        f18298b.put('w', 'M');
        f18298b.put('x', 'e');
        f18298b.put('y', 'B');
        f18298b.put('z', 'A');
        f18298b.put('0', 'T');
        f18298b.put('1', '2');
        f18298b.put('2', 'F');
        f18298b.put('3', 'b');
        f18298b.put('4', '9');
        f18298b.put('5', 'P');
        f18298b.put('6', '1');
        f18298b.put('7', 'O');
        f18298b.put('8', 'I');
        f18298b.put('9', 'K');
        f18298b.put('+', 'm');
        f18298b.put('/', 'C');
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
            int i6 = b9 & 255;
            if (i4 == length) {
                stringBuffer.append(f18300d[i6 >>> 2]);
                stringBuffer.append(f18300d[(b9 & 3) << 4]);
                stringBuffer.append("==");
                break;
            }
            int i9 = i + 2;
            byte b10 = bArr[i4];
            if (i9 == length) {
                stringBuffer.append(f18300d[i6 >>> 2]);
                stringBuffer.append(f18300d[((b9 & 3) << 4) | ((b10 & 240) >>> 4)]);
                stringBuffer.append(f18300d[(b10 & 15) << 2]);
                stringBuffer.append("=");
                break;
            }
            i += 3;
            byte b11 = bArr[i9];
            stringBuffer.append(f18300d[i6 >>> 2]);
            stringBuffer.append(f18300d[((b9 & 3) << 4) | ((b10 & 240) >>> 4)]);
            stringBuffer.append(f18300d[((b10 & 15) << 2) | ((b11 & 192) >>> 6)]);
            stringBuffer.append(f18300d[b11 & com.anythink.core.common.s.a.c.f17105c]);
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
        int i6;
        byte b11;
        int i9;
        byte b12;
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        int i10 = 0;
        while (i10 < length) {
            while (true) {
                i = i10 + 1;
                b9 = f18301e[bytes[i10]];
                if (i >= length || b9 != -1) {
                    break;
                }
                i10 = i;
            }
            if (b9 == -1) {
                break;
            }
            while (true) {
                i4 = i + 1;
                b10 = f18301e[bytes[i]];
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
                i6 = i4 + 1;
                byte b13 = bytes[i4];
                if (b13 == 61) {
                    return byteArrayOutputStream.toByteArray();
                }
                b11 = f18301e[b13];
                if (i6 >= length || b11 != -1) {
                    break;
                }
                i4 = i6;
            }
            if (b11 == -1) {
                break;
            }
            byteArrayOutputStream.write(((b10 & 15) << 4) | ((b11 & 60) >>> 2));
            while (true) {
                i9 = i6 + 1;
                byte b14 = bytes[i6];
                if (b14 == 61) {
                    return byteArrayOutputStream.toByteArray();
                }
                b12 = f18301e[b14];
                if (i9 >= length || b12 != -1) {
                    break;
                }
                i6 = i9;
            }
            if (b12 == -1) {
                break;
            }
            byteArrayOutputStream.write(b12 | ((b11 & 3) << 6));
            i10 = i9;
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
