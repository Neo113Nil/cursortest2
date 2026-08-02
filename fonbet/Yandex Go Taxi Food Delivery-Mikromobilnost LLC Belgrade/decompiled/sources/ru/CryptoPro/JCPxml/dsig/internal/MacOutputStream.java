package ru.CryptoPro.JCPxml.dsig.internal;

import java.io.ByteArrayOutputStream;
import javax.crypto.Mac;

/* loaded from: classes4.dex */
public class MacOutputStream extends ByteArrayOutputStream {
    private final Mac mac;

    public MacOutputStream(Mac mac) {
        this.mac = mac;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public void write(int i) {
        super.write(i);
        this.mac.update((byte) i);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        super.write(bArr, i, i2);
        this.mac.update(bArr, i, i2);
    }
}
