package org.bouncycastle.cert;

import defpackage.b3;
import defpackage.dy31;
import defpackage.f79;
import defpackage.gzo;
import defpackage.h79;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class X509CertificateHolder implements Serializable {
    private static final long serialVersionUID = 20170722001L;
    public transient h79 a;
    public transient gzo b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public X509CertificateHolder(byte[] bArr) {
        this(h79.m(r4));
        try {
            int i = f79.a;
            b3 r = b3.r(bArr);
            if (r == null) {
                throw new IOException("no content found");
            }
        } catch (ClassCastException e) {
            dy31.n("malformed data: ", e.getMessage(), e);
            throw null;
        } catch (IllegalArgumentException e2) {
            dy31.n("malformed data: ", e2.getMessage(), e2);
            throw null;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        h79 m = h79.m(objectInputStream.readObject());
        this.a = m;
        this.b = m.b.E;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.a.getEncoded());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof X509CertificateHolder) {
            return this.a.equals(((X509CertificateHolder) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public X509CertificateHolder(h79 h79Var) {
        this.a = h79Var;
        this.b = h79Var.b.E;
    }
}
