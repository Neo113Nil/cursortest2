package ru.CryptoPro.JCP.tools.CPVerify;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/* loaded from: classes4.dex */
public class ListDigest extends BufferDigest {
    public final byte[] a;

    public ListDigest(byte[] bArr) {
        this.a = bArr;
    }

    public byte[] getDigest() throws IOException {
        ByteArrayInputStream byteArrayInputStream = null;
        try {
            ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(this.a);
            try {
                byte[] digest = BufferDigest.getDigest(byteArrayInputStream2);
                byteArrayInputStream2.close();
                return digest;
            } catch (Throwable th) {
                th = th;
                byteArrayInputStream = byteArrayInputStream2;
                if (byteArrayInputStream != null) {
                    byteArrayInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public boolean verifyDigest(byte[] bArr) throws IOException {
        ByteArrayInputStream byteArrayInputStream = null;
        try {
            ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(this.a);
            try {
                boolean verifyDigest = BufferDigest.verifyDigest(byteArrayInputStream2, bArr);
                byteArrayInputStream2.close();
                return verifyDigest;
            } catch (Throwable th) {
                th = th;
                byteArrayInputStream = byteArrayInputStream2;
                if (byteArrayInputStream != null) {
                    byteArrayInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
