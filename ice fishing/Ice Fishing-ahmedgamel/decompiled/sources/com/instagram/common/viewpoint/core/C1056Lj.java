package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.util.Log;
import android.webkit.MimeTypeMap;
import java.io.Closeable;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.Lj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1056Lj {
    public static byte[] A00;
    public static final String A01;

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 17);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{91, 78, 76, 6, 52, 3, 3, 30, 3, 81, 18, 29, 30, 2, 24, 31, 22, 81, 3, 20, 2, 30, 4, 3, 18, 20, 107, 98, 19};
    }

    static {
        A04();
        A01 = C1056Lj.class.getSimpleName();
    }

    public static String A01(String str) {
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String extension = MimeTypeMap.getFileExtensionFromUrl(str);
        if (TextUtils.isEmpty(extension)) {
            return null;
        }
        return singleton.getMimeTypeFromExtension(extension);
    }

    public static String A02(String str) {
        try {
            return A03(MessageDigest.getInstance(A00(26, 3, 55)).digest(str.getBytes()));
        } catch (NoSuchAlgorithmException e9) {
            throw new IllegalStateException(e9);
        }
    }

    public static String A03(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b9 : bArr) {
            stringBuffer.append(String.format(Locale.US, A00(0, 4, 111), Byte.valueOf(b9)));
        }
        return stringBuffer.toString();
    }

    public static void A05(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e9) {
                Log.e(A01, A00(4, 22, 96), e9);
            }
        }
    }
}
