package io.appmetrica.analytics.locationinternal.impl;

import android.content.Context;
import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.text.Charsets;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.f2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0871f2 {
    public static byte[] a(Context context, byte[] bArr) {
        try {
            String packageName = context.getPackageName();
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(packageName.getBytes(Charsets.UTF_8));
            byte[] digest = messageDigest.digest();
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            for (int i = 0; i < length; i++) {
                bArr2[i] = (byte) (bArr[i] ^ digest[i % digest.length]);
            }
            return bArr2;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String b(Context context, String str) {
        String compressBase64String = Base64Utils.compressBase64String(str);
        if (compressBase64String != null) {
            return Base64.encodeToString(a(context, compressBase64String.getBytes(Charsets.UTF_8)), 0);
        }
        return null;
    }

    public static String a(Context context, String str) {
        Charset charset = Charsets.UTF_8;
        byte[] a = a(context, Base64.decode(str.getBytes(charset), 0));
        if (a != null) {
            return Base64Utils.decompressBase64GzipAsString(new String(a, charset));
        }
        return null;
    }
}
