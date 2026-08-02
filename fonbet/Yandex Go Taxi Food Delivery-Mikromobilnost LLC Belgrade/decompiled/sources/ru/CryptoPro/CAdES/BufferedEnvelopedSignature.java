package ru.CryptoPro.CAdES;

import defpackage.et61;
import defpackage.ige;
import defpackage.jq61;
import defpackage.k87;
import defpackage.lq6;
import defpackage.md6;
import defpackage.no6;
import defpackage.pm5;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.cms.CMSException;
import ru.CryptoPro.CAdES.exception.EnvelopedException;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public final class BufferedEnvelopedSignature extends jq61 {
    public BufferedEnvelopedSignature(EncryptionKeyAlgorithm encryptionKeyAlgorithm) {
        super(encryptionKeyAlgorithm);
        this.a = new lq6();
    }

    public byte[] encrypt(byte[] bArr) throws EnvelopedException {
        et61 et61Var = this.b;
        JCPLogger.subEnter();
        if (this.a == null) {
            throw new EnvelopedException("Enveloped generator not set.");
        }
        if (bArr == null) {
            throw new EnvelopedException("Data not set.");
        }
        try {
            no6 no6Var = new no6(this.d, this.e, et61Var, false);
            md6 md6Var = new md6(bArr);
            if (et61Var != null) {
                this.a.b = et61Var;
            }
            pm5 b = ((k87) this.a).b(md6Var, no6Var);
            JCPLogger.subExit();
            return ((ige) b.b).getEncoded();
        } catch (IOException e) {
            throw new EnvelopedException("Enveloping failed.", e);
        } catch (CMSException e2) {
            throw new EnvelopedException("Enveloping failed.", e2);
        }
    }

    public BufferedEnvelopedSignature(InputStream inputStream) throws EnvelopedException {
        super(inputStream);
    }

    public BufferedEnvelopedSignature() {
        this((EncryptionKeyAlgorithm) null);
    }
}
