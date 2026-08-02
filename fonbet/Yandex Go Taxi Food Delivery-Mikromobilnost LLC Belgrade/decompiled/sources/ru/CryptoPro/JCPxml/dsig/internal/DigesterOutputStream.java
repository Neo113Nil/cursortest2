package ru.CryptoPro.JCPxml.dsig.internal;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.utils.UnsyncByteArrayOutputStream;

/* loaded from: classes4.dex */
public class DigesterOutputStream extends OutputStream {
    private static Log log = LogFactory.getLog(DigesterOutputStream.class);
    private UnsyncByteArrayOutputStream bos;
    private final boolean buffer;
    private final MessageDigest md;

    public DigesterOutputStream(MessageDigest messageDigest, boolean z) {
        this.md = messageDigest;
        this.buffer = z;
        if (z) {
            this.bos = new UnsyncByteArrayOutputStream();
        }
    }

    public byte[] getDigestValue() {
        return this.md.digest();
    }

    public InputStream getInputStream() {
        if (this.buffer) {
            return new ByteArrayInputStream(this.bos.toByteArray());
        }
        return null;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        if (this.buffer) {
            this.bos.write(bArr, i, i2);
        }
        if (log.isDebugEnabled()) {
            log.debug("Pre-digested input:");
            StringBuilder sb = new StringBuilder(i2);
            for (int i3 = i; i3 < i + i2; i3++) {
                sb.append((char) bArr[i3]);
            }
            log.debug(sb.toString());
        }
        this.md.update(bArr, i, i2);
    }

    public DigesterOutputStream(MessageDigest messageDigest) {
        this(messageDigest, false);
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        if (this.buffer) {
            this.bos.write(i);
        }
        this.md.update((byte) i);
    }
}
