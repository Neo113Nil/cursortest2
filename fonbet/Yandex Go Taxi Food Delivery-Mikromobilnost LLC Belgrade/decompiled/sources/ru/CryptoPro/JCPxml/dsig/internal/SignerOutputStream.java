package ru.CryptoPro.JCPxml.dsig.internal;

import defpackage.ny61;
import java.io.ByteArrayOutputStream;
import java.security.Signature;
import java.security.SignatureException;

/* loaded from: classes4.dex */
public class SignerOutputStream extends ByteArrayOutputStream {
    private final Signature sig;

    public SignerOutputStream(Signature signature) {
        this.sig = signature;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public void write(int i) {
        super.write(i);
        try {
            this.sig.update((byte) i);
        } catch (SignatureException e) {
            ny61.j(e);
        }
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        super.write(bArr, i, i2);
        try {
            this.sig.update(bArr, i, i2);
        } catch (SignatureException e) {
            ny61.j(e);
        }
    }
}
