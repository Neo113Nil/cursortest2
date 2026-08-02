package ru.cprocsp.ACSP.util;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;
import ru.cprocsp.ACSP.tools.log.LogConstants;

/* loaded from: classes4.dex */
public class UtilFile implements LogConstants {
    public static long crc32(InputStream inputStream) {
        if (inputStream == null) {
            return 0L;
        }
        byte[] bArr = new byte[1024];
        CRC32 crc32 = new CRC32();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            try {
                try {
                    int read = inputStream.read(bArr, 0, 1024);
                    if (read > 0) {
                        crc32.update(bArr, 0, read);
                    }
                } catch (Exception e) {
                    Log.e(LogConstants.APP_LOGGER_TAG, "Error occurred.", e);
                }
                try {
                    break;
                } catch (IOException unused) {
                }
            } finally {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused2) {
                }
            }
        }
        return crc32.getValue();
    }

    public static String extractFileExtension(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            return str.substring(lastIndexOf + 1);
        }
        return null;
    }
}
