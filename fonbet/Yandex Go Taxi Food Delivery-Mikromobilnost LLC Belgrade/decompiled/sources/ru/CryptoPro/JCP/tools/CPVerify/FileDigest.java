package ru.CryptoPro.JCP.tools.CPVerify;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: classes4.dex */
public class FileDigest extends BufferDigest {
    public final File a;

    public FileDigest(File file) {
        this.a = file;
    }

    public byte[] getDigest() throws IOException {
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(this.a);
            try {
                byte[] digest = BufferDigest.getDigest(fileInputStream2);
                fileInputStream2.close();
                return digest;
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public boolean verifyDigest(byte[] bArr) throws IOException {
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(this.a);
            try {
                boolean verifyDigest = BufferDigest.verifyDigest(fileInputStream2, bArr);
                fileInputStream2.close();
                return verifyDigest;
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
