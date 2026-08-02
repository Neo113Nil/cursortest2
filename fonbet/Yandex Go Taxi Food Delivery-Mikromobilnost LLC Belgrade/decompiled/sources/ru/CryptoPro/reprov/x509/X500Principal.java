package ru.CryptoPro.reprov.x509;

import defpackage.ny61;
import java.io.IOException;
import java.io.InputStream;
import java.io.NotActiveException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.security.Principal;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes4.dex */
public final class X500Principal implements Serializable, Principal {
    public static final String CANONICAL = "CANONICAL";
    public static final String RFC1779 = "RFC1779";
    public static final String RFC2253 = "RFC2253";
    private static final long serialVersionUID = -500463348111345721L;
    private transient X500Name thisX500Name;

    public X500Principal(InputStream inputStream) {
        if (inputStream == null) {
            ny61.t("provided null input stream");
            throw null;
        }
        try {
            if (inputStream.markSupported()) {
                inputStream.mark(inputStream.available() + 1);
            }
            this.thisX500Name = new X500Name(new DerValue(inputStream).data);
        } catch (Exception e) {
            if (inputStream.markSupported()) {
                try {
                    inputStream.reset();
                } catch (IOException unused) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("improperly specified input stream and unable to reset input stream");
                    illegalArgumentException.initCause(e);
                    throw illegalArgumentException;
                }
            }
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("improperly specified input stream");
            illegalArgumentException2.initCause(e);
            throw illegalArgumentException2;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, NotActiveException, ClassNotFoundException {
        this.thisX500Name = new X500Name((byte[]) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(this.thisX500Name.getEncodedInternal());
    }

    @Override // java.security.Principal
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof X500Principal) {
            return this.thisX500Name.equals(((X500Principal) obj).thisX500Name);
        }
        return false;
    }

    public byte[] getEncoded() {
        try {
            return this.thisX500Name.getEncoded();
        } catch (IOException e) {
            ny61.n("unable to get encoding", e);
            return null;
        }
    }

    public String getName(String str) {
        if (str != null) {
            if (str.equalsIgnoreCase(RFC1779)) {
                return this.thisX500Name.getRFC1779Name();
            }
            if (str.equalsIgnoreCase(RFC2253)) {
                return this.thisX500Name.getRFC2253Name();
            }
            if (str.equalsIgnoreCase(CANONICAL)) {
                return this.thisX500Name.getRFC2253CanonicalName();
            }
        }
        ny61.g("invalid format specified");
        return null;
    }

    @Override // java.security.Principal
    public int hashCode() {
        return this.thisX500Name.hashCode();
    }

    @Override // java.security.Principal
    public String toString() {
        return this.thisX500Name.toString();
    }

    @Override // java.security.Principal
    public String getName() {
        return getName(RFC2253);
    }

    public X500Principal(String str) {
        if (str == null) {
            ny61.t("provided null name");
            throw null;
        }
        try {
            this.thisX500Name = new X500Name(str);
        } catch (Exception e) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("improperly specified input name: ".concat(str));
            illegalArgumentException.initCause(e);
            throw illegalArgumentException;
        }
    }

    public X500Principal(X500Name x500Name) {
        this.thisX500Name = x500Name;
    }

    public X500Principal(byte[] bArr) {
        try {
            this.thisX500Name = new X500Name(bArr);
        } catch (Exception e) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("improperly specified input name");
            illegalArgumentException.initCause(e);
            throw illegalArgumentException;
        }
    }
}
