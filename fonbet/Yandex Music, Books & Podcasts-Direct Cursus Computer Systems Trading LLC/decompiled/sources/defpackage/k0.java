package defpackage;

import java.io.ByteArrayOutputStream;

/* loaded from: classes5.dex */
public abstract class k0 implements d0 {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d0) {
            return n().x(((d0) obj).n());
        }
        return false;
    }

    public int hashCode() {
        return n().hashCode();
    }

    public final byte[] r() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        s0 n = n();
        n.getClass();
        n.u(new qxp(byteArrayOutputStream), true);
        return byteArrayOutputStream.toByteArray();
    }

    public final byte[] s() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        s0 n = n();
        n.getClass();
        new b07(byteArrayOutputStream).B(n);
        return byteArrayOutputStream.toByteArray();
    }
}
