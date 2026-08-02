package com.yandex.passport.internal.util;

import android.util.Base64;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
public final class k {
    public static String a(String str) {
        str.getClass();
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        Charset forName = Charset.forName("utf8");
        forName.getClass();
        byte[] bytes = str.getBytes(forName);
        bytes.getClass();
        byte[] digest = messageDigest.digest(bytes);
        digest.getClass();
        String encodeToString = Base64.encodeToString(digest, 11);
        encodeToString.getClass();
        return encodeToString;
    }
}
