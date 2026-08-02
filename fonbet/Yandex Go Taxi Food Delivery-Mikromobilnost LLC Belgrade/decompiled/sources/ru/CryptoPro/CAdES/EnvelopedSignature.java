package ru.CryptoPro.CAdES;

import defpackage.et61;
import defpackage.jq61;
import defpackage.m87;
import defpackage.n87;
import defpackage.no6;
import defpackage.o87;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.cms.CMSException;
import ru.CryptoPro.CAdES.exception.EnvelopedException;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public final class EnvelopedSignature extends jq61 {
    public m87 h;

    public EnvelopedSignature(EncryptionKeyAlgorithm encryptionKeyAlgorithm) {
        super(encryptionKeyAlgorithm);
        this.h = null;
        this.a = new n87();
    }

    public void close() throws EnvelopedException {
        o87 o87Var;
        JCPLogger.subEnter();
        et61 et61Var = this.b;
        if (et61Var != null && et61Var.b && (o87Var = this.a) != null) {
            o87Var.b = et61Var;
        }
        m87 m87Var = this.h;
        if (m87Var == null) {
            throw new EnvelopedException("Encryption output stream  not set. Did you forget to open and update?");
        }
        try {
            m87Var.close();
            this.h = null;
            JCPLogger.subExit();
        } catch (IOException e) {
            throw new EnvelopedException("Closing of output context failed.", e);
        }
    }

    public void open(OutputStream outputStream) throws EnvelopedException {
        JCPLogger.subEnter();
        if (this.a == null) {
            throw new EnvelopedException("Enveloped generator not set.");
        }
        if (outputStream == null) {
            throw new EnvelopedException("Enveloped output stream not set.");
        }
        try {
            this.h = ((n87) this.a).b(outputStream, new no6(this.d, this.e, this.b, true));
            JCPLogger.subExit();
        } catch (IOException e) {
            throw new EnvelopedException("Opening of output context failed.", e);
        } catch (CMSException e2) {
            throw new EnvelopedException("Opening of output context failed.", e2);
        }
    }

    public void update(byte[] bArr) throws EnvelopedException {
        try {
            this.h.write(bArr, 0, bArr.length);
        } catch (IOException e) {
            throw new EnvelopedException("Encryption failed.", e);
        }
    }

    public EnvelopedSignature(InputStream inputStream) throws EnvelopedException {
        super(inputStream);
        this.h = null;
    }

    public EnvelopedSignature() {
        this((EncryptionKeyAlgorithm) null);
    }

    public void update(byte[] bArr, int i, int i2) throws EnvelopedException {
        try {
            this.h.write(bArr, i, i2);
        } catch (IOException e) {
            throw new EnvelopedException("Encryption failed.", e);
        }
    }
}
