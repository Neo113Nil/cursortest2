package org.bouncycastle.cert;

import defpackage.ayo;
import defpackage.b3;
import defpackage.dy31;
import defpackage.fxs;
import defpackage.gxs;
import defpackage.gzo;
import defpackage.j2;
import defpackage.m79;
import defpackage.s0x;
import defpackage.zgb1;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class X509CRLHolder implements Serializable {
    private static final long serialVersionUID = 20170722001L;
    public transient m79 a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public X509CRLHolder(byte[] bArr) {
        this(m79.m(r0));
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            b3 n = new j2(byteArrayInputStream, zgb1.c(byteArrayInputStream), true).n();
            if (n == null) {
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
        a(m79.m(objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.a.getEncoded());
    }

    public final void a(m79 m79Var) {
        this.a = m79Var;
        gzo gzoVar = m79Var.a.z;
        if (gzoVar != null) {
            ayo ayoVar = (ayo) gzoVar.a.get(ayo.F);
            if (ayoVar != null) {
                boolean z = s0x.n(ayoVar.m()).x;
            }
        }
        new gxs(new fxs(m79Var.a.c));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof X509CRLHolder) {
            return this.a.equals(((X509CRLHolder) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public X509CRLHolder(m79 m79Var) {
        a(m79Var);
    }
}
