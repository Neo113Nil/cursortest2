package com.anythink.expressad.foundation.h;

import android.text.TextUtils;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* loaded from: classes.dex */
public final class s implements com.anythink.expressad.g.b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f20481a = "MD5";

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder(digest.length * 2);
            for (byte b9 : digest) {
                sb.append(Integer.toHexString((b9 & 240) >>> 4));
                sb.append(Integer.toHexString(b9 & 15));
            }
            return sb.toString().toLowerCase(Locale.US);
        } catch (NoSuchAlgorithmException e9) {
            e9.printStackTrace();
            return "";
        }
    }

    private static String b(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder(digest.length * 2);
            for (byte b9 : digest) {
                sb.append(Integer.toHexString((b9 & 240) >>> 4));
                sb.append(Integer.toHexString(b9 & 15));
            }
            return sb.toString().toUpperCase(Locale.US);
        } catch (NoSuchAlgorithmException e9) {
            e9.printStackTrace();
            return "";
        }
    }

    private static String c(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b9 : bArr) {
            sb.append(Integer.toHexString((b9 & 240) >>> 4));
            sb.append(Integer.toHexString(b9 & 15));
        }
        return sb.toString().toUpperCase(Locale.US);
    }

    private static byte[] d(String str) {
        int length = str.length();
        byte[] bytes = str.getBytes("UTF-16LE");
        a(bytes);
        byte[] bArr = new byte[length];
        int i = 0;
        for (int i4 = 0; i4 < bytes.length; i4 += 2) {
            byte b9 = bytes[i4];
            if (b9 != -1 && b9 != -2) {
                bArr[i] = b9;
                i++;
                if (i == length) {
                    break;
                }
            }
        }
        a(bArr);
        return bArr;
    }

    private static String c(String str) {
        try {
            int length = str.length();
            byte[] bytes = str.getBytes("UTF-16LE");
            a(bytes);
            byte[] bArr = new byte[length];
            int i = 0;
            for (int i4 = 0; i4 < bytes.length; i4 += 2) {
                byte b9 = bytes[i4];
                if (b9 != -1 && b9 != -2) {
                    bArr[i] = b9;
                    i++;
                    if (i == length) {
                        break;
                    }
                }
            }
            a(bArr);
            char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            byte[] digest = messageDigest.digest();
            char[] cArr2 = new char[digest.length * 2];
            int i6 = 0;
            for (byte b10 : digest) {
                int i9 = i6 + 1;
                cArr2[i6] = cArr[(b10 >>> 4) & 15];
                i6 += 2;
                cArr2[i9] = cArr[b10 & 15];
            }
            return new String(cArr2);
        } catch (Exception e9) {
            e9.printStackTrace();
            return "";
        }
    }

    private static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b9 : bArr) {
            sb.append(Integer.toHexString((b9 & 240) >>> 4));
            sb.append(Integer.toHexString(b9 & 15));
        }
        return sb.toString().toLowerCase(Locale.US);
    }

    private static String a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        int length = bArr.length * 2;
        byte[] bArr2 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr2[i] = 48;
        }
        byte[] bArr3 = new byte[bArr.length + 1];
        bArr3[0] = 0;
        System.arraycopy(bArr, 0, bArr3, 1, bArr.length);
        byte[] bytes = new BigInteger(bArr3).toString(16).getBytes();
        System.arraycopy(bytes, 0, bArr2, length - bytes.length, bytes.length);
        return new String(bArr2);
    }
}
