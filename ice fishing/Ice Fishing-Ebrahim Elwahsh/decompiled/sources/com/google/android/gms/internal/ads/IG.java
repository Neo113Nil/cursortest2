package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class IG {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f25546a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static final C3791qK a(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < '!' || charAt > '~') {
                StringBuilder sb = new StringBuilder(String.valueOf(charAt).length() + 33);
                sb.append("Not a printable ASCII character: ");
                sb.append(charAt);
                throw new B0.c(sb.toString());
            }
            bArr[i] = (byte) charAt;
        }
        return C3791qK.a(bArr);
    }

    public static final C3791qK b(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < '!' || charAt > '~') {
                StringBuilder sb = new StringBuilder(String.valueOf(charAt).length() + 33);
                sb.append("Not a printable ASCII character: ");
                sb.append(charAt);
                throw new GeneralSecurityException(sb.toString());
            }
            bArr[i] = (byte) charAt;
        }
        return C3791qK.a(bArr);
    }

    public static boolean c(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (bArr2[i] != bArr[i]) {
                return false;
            }
        }
        return true;
    }
}
