package ru.CryptoPro.JCP.tools;

import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;

/* loaded from: classes4.dex */
public class Base64InputStream extends InputStream {
    public static final int EOF = -1;
    private final InputStream delegateInputStream;
    private final byte[] byteBuffer = new byte[4096];
    private int bufferIndex = 0;
    private int bufferSize = 0;
    private Base64.Decoder decoder = Base64.getDecoder();
    private boolean isBase64 = true;
    private boolean isInProgress = false;

    public Base64InputStream(InputStream inputStream) {
        this.delegateInputStream = inputStream;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegateInputStream.close();
    }

    public boolean isBase64() {
        return this.isBase64;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.bufferIndex >= this.bufferSize) {
            byte[] bArr = new byte[4];
            int i = 0;
            int i2 = 0;
            while (i < 4 && i2 != -1) {
                i2 = this.delegateInputStream.read();
                if (i2 != -1 && ((i2 != 13 && i2 != 10) || !this.isBase64 || !this.isInProgress)) {
                    bArr[i] = (byte) i2;
                    i++;
                }
            }
            if (i == 0) {
                return -1;
            }
            if (this.isBase64) {
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, 0, bArr2, 0, i);
                try {
                    byte[] decode = this.decoder.decode(bArr2);
                    System.arraycopy(decode, 0, this.byteBuffer, 0, decode.length);
                    this.bufferSize = decode.length;
                    this.bufferIndex = 0;
                } catch (IllegalArgumentException e) {
                    if (this.isInProgress) {
                        throw e;
                    }
                    this.isBase64 = false;
                    System.arraycopy(bArr2, 0, this.byteBuffer, 0, i);
                    this.bufferSize = i;
                    this.bufferIndex = 0;
                }
                this.isInProgress = true;
            } else {
                System.arraycopy(bArr, 0, this.byteBuffer, 0, i);
                this.bufferSize = i;
                this.bufferIndex = 0;
            }
        }
        byte[] bArr3 = this.byteBuffer;
        int i3 = this.bufferIndex;
        this.bufferIndex = i3 + 1;
        return bArr3[i3] & 255;
    }

    public void setDecoder(Base64.Decoder decoder) {
        this.decoder = decoder;
    }
}
