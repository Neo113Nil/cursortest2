package ru.CryptoPro.JCP.VMInspector;

import java.io.FileOutputStream;
import ru.CryptoPro.JCP.Random.AbstractBioRandom;

/* loaded from: classes4.dex */
public class BioStatistics {
    public static final String DEFAULT_FILE_NAME = "/bio_stat.dat";
    public static final int DEFAULT_LENGTH = 32768;

    public static void main(String[] strArr) {
        FileOutputStream fileOutputStream;
        Throwable th;
        System.out.getClass();
        String str = "/bio_stat.dat";
        if (strArr != null) {
            try {
                if (strArr.length != 0) {
                    str = strArr[0];
                }
            } catch (Exception unused) {
                System.out.getClass();
            }
        }
        int parseInt = (strArr == null || strArr.length == 0) ? 32768 : Integer.parseInt(strArr[1]);
        byte[] bArr = new byte[parseInt];
        AbstractBioRandom.getBioRandomObject().getBioRandom(parseInt).makeRandom(bArr, 0, parseInt);
        try {
            fileOutputStream = new FileOutputStream(str);
        } catch (Throwable th2) {
            fileOutputStream = null;
            th = th2;
        }
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.close();
            System.out.getClass();
            System.out.getClass();
        } catch (Throwable th3) {
            th = th3;
            if (fileOutputStream == null) {
                throw th;
            }
            fileOutputStream.close();
            throw th;
        }
    }
}
