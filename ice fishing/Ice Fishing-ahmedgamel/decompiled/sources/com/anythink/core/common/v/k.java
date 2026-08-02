package com.anythink.core.common.v;

import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f17559a = "czZQYTNDVjhJUWZMTmNPWUR4aWVXKzFuRzRGRW1iNS8yTVhKd2g3UlNvenZyQXFCWlVqOXlIbGcwa3VwS2R0VA==";

    /* renamed from: c, reason: collision with root package name */
    public static final String f17561c = "+3MtanYVQs8GK7W/rSpiz9FCBUEDdbqxmhgcIRH4loTvuZw20XfO51JPN6jeLkyA";

    /* renamed from: d, reason: collision with root package name */
    private static final String f17562d = "k";

    /* renamed from: g, reason: collision with root package name */
    private static final String f17565g = "ZE1XbmhiZXlLcjBKSXZMTk94M0JGa0V1bWw5Mlk1ZmpTcUdUN1I4cFpWY2lQSEFzdEM0VVhhNlFEdzFnb3orLw==";

    /* renamed from: e, reason: collision with root package name */
    private static final char[] f17563e = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* renamed from: f, reason: collision with root package name */
    private static final byte[] f17564f = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, com.anythink.core.common.s.a.c.f17105c, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    /* renamed from: h, reason: collision with root package name */
    private static String f17566h = "";

    /* renamed from: b, reason: collision with root package name */
    static HashMap<String, HashMap<Character, Character>> f17560b = new HashMap<>();
    private static Map<Character, Character> i = null;

    /* renamed from: j, reason: collision with root package name */
    private static String f17567j = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

    private k() {
    }

    public static String a(String str) {
        return TextUtils.isEmpty(str) ? "" : a(str.getBytes());
    }

    public static String b(String str) {
        return TextUtils.isEmpty(str) ? "" : new String(e(str));
    }

    public static String c(String str) {
        return a(str, (String) null);
    }

    public static String d(String str) {
        char[] charArray;
        try {
            if (TextUtils.isEmpty(str) || (charArray = a(str.getBytes()).toCharArray()) == null || charArray.length <= 0) {
                return "";
            }
            char[] cArr = new char[charArray.length];
            for (int i4 = 0; i4 < charArray.length; i4++) {
                char c9 = charArray[i4];
                if (i == null) {
                    i = new HashMap();
                    for (int i6 = 0; i6 < f17567j.length(); i6++) {
                        i.put(Character.valueOf(f17567j.charAt(i6)), Character.valueOf(f17561c.charAt(i6)));
                    }
                }
                cArr[i4] = (i.containsKey(Character.valueOf(c9)) ? i.get(Character.valueOf(c9)) : Character.valueOf(c9)).charValue();
            }
            return new String(cArr);
        } catch (Exception e9) {
            e9.printStackTrace();
            return "";
        }
    }

    private static byte[] e(String str) {
        int i4;
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
                i4 = i11 + 1;
                b9 = f17564f[bytes[i11]];
                if (i4 >= length || b9 != -1) {
                    break;
                }
                i11 = i4;
            }
            if (b9 == -1) {
                break;
            }
            while (true) {
                i6 = i4 + 1;
                b10 = f17564f[bytes[i4]];
                if (i6 >= length || b10 != -1) {
                    break;
                }
                i4 = i6;
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
                b11 = f17564f[b13];
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
                b12 = f17564f[b14];
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

    public static String a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                break;
            }
            int i6 = i4 + 1;
            byte b9 = bArr[i4];
            int i9 = b9 & 255;
            if (i6 == length) {
                char[] cArr = f17563e;
                stringBuffer.append(cArr[i9 >>> 2]);
                stringBuffer.append(cArr[(b9 & 3) << 4]);
                stringBuffer.append("==");
                break;
            }
            int i10 = i4 + 2;
            byte b10 = bArr[i6];
            if (i10 == length) {
                char[] cArr2 = f17563e;
                stringBuffer.append(cArr2[i9 >>> 2]);
                stringBuffer.append(cArr2[((b9 & 3) << 4) | ((b10 & 240) >>> 4)]);
                stringBuffer.append(cArr2[(b10 & 15) << 2]);
                stringBuffer.append("=");
                break;
            }
            i4 += 3;
            byte b11 = bArr[i10];
            char[] cArr3 = f17563e;
            stringBuffer.append(cArr3[i9 >>> 2]);
            stringBuffer.append(cArr3[((b9 & 3) << 4) | ((b10 & 240) >>> 4)]);
            stringBuffer.append(cArr3[((b10 & 15) << 2) | ((b11 & 192) >>> 6)]);
            stringBuffer.append(cArr3[b11 & com.anythink.core.common.s.a.c.f17105c]);
        }
        return stringBuffer.toString();
    }

    private static synchronized Character a(char c9, String str) {
        synchronized (k.class) {
            try {
                if (TextUtils.isEmpty(str)) {
                    if (TextUtils.isEmpty(f17566h)) {
                        f17566h = b(f17565g);
                    }
                    str = f17566h;
                }
                HashMap<Character, Character> hashMap = f17560b.get(str);
                if (hashMap == null) {
                    hashMap = new HashMap<>();
                    if (str.length() >= f17563e.length) {
                        int i4 = 0;
                        while (true) {
                            char[] cArr = f17563e;
                            if (i4 >= cArr.length) {
                                break;
                            }
                            hashMap.put(Character.valueOf(str.charAt(i4)), Character.valueOf(cArr[i4]));
                            i4++;
                        }
                        f17560b.put(str, hashMap);
                    }
                }
                if (hashMap.containsKey(Character.valueOf(c9))) {
                    return hashMap.get(Character.valueOf(c9));
                }
                return Character.valueOf(c9);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String a(String str, String str2) {
        String str3 = "";
        try {
            if (!TextUtils.isEmpty(str)) {
                char[] charArray = str.toCharArray();
                if (charArray != null && charArray.length > 0) {
                    char[] cArr = new char[charArray.length];
                    for (int i4 = 0; i4 < charArray.length; i4++) {
                        cArr[i4] = a(charArray[i4], str2).charValue();
                    }
                    str3 = new String(cArr);
                }
                return new String(e(str3));
            }
        } catch (Exception unused) {
        }
        return str3;
    }

    private static Character a(char c9) {
        if (i == null) {
            i = new HashMap();
            for (int i4 = 0; i4 < f17567j.length(); i4++) {
                i.put(Character.valueOf(f17567j.charAt(i4)), Character.valueOf(f17561c.charAt(i4)));
            }
        }
        if (i.containsKey(Character.valueOf(c9))) {
            return i.get(Character.valueOf(c9));
        }
        return Character.valueOf(c9);
    }
}
