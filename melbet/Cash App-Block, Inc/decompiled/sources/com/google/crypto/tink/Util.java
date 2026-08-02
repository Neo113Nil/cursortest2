package com.google.crypto.tink;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class Util {
    public static final /* synthetic */ int $r8$clinit = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static byte[] readAll(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }
}
