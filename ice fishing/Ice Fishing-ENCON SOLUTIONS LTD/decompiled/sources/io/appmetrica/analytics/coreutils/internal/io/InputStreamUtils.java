package io.appmetrica.analytics.coreutils.internal.io;

import a.AbstractC0083a;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import t1.InterfaceC1046a;

/* loaded from: classes.dex */
public final class InputStreamUtils {
    public static final InputStreamUtils INSTANCE = new InputStreamUtils();

    private InputStreamUtils() {
    }

    public final byte[] readSafelyApprox(int i2, InterfaceC1046a interfaceC1046a) {
        try {
            InputStream inputStream = (InputStream) interfaceC1046a.invoke();
            if (inputStream != null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[8192];
                        int i3 = 0;
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (-1 == read || i3 > i2) {
                                break;
                            }
                            if (read > 0) {
                                byteArrayOutputStream.write(bArr, 0, read);
                                i3 += read;
                            }
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        AbstractC0083a.e(byteArrayOutputStream, null);
                        AbstractC0083a.e(inputStream, null);
                        return byteArray;
                    } catch (Throwable unused) {
                        AbstractC0083a.e(byteArrayOutputStream, null);
                        AbstractC0083a.e(inputStream, null);
                    }
                } finally {
                }
            }
        } catch (Throwable unused2) {
        }
        return new byte[0];
    }
}
