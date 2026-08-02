package defpackage;

import java.io.IOException;

/* loaded from: classes5.dex */
public abstract class s0 extends k0 {
    public static s0 y(byte[] bArr) {
        i0 i0Var = new i0(bArr);
        try {
            s0 z = i0Var.z();
            if (i0Var.available() == 0) {
                return z;
            }
            throw new IOException("Extra data detected in stream");
        } catch (ClassCastException unused) {
            kac.f("cannot recognise object in stream");
            return null;
        }
    }

    @Override // defpackage.k0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && t(((d0) obj).n());
    }

    @Override // defpackage.k0
    public abstract int hashCode();

    public abstract boolean t(s0 s0Var);

    public abstract void u(qxp qxpVar, boolean z);

    public abstract boolean v();

    public abstract int w(boolean z);

    public final boolean x(s0 s0Var) {
        return this == s0Var || t(s0Var);
    }

    public s0 A() {
        return this;
    }

    @Override // defpackage.d0
    public final s0 n() {
        return this;
    }

    public s0 z() {
        return this;
    }
}
