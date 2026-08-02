package defpackage;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class wrf extends v0 {
    public byte[] c;

    @Override // defpackage.v0, defpackage.s0
    public final s0 A() {
        M();
        return super.A();
    }

    @Override // defpackage.v0
    public final d0 F(int i) {
        M();
        return this.a[i];
    }

    @Override // defpackage.v0
    public final Enumeration G() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.c;
        }
        if (bArr == null) {
            return new u0(this);
        }
        srf srfVar = new srf();
        srfVar.a = new i0(bArr, 0);
        srfVar.b = srfVar.a();
        return srfVar;
    }

    @Override // defpackage.v0
    public final z H() {
        return ((v0) A()).H();
    }

    @Override // defpackage.v0
    public final o0 K() {
        return ((v0) A()).K();
    }

    @Override // defpackage.v0
    public final w0 L() {
        return ((v0) A()).L();
    }

    public final synchronized void M() {
        e0 e0Var;
        if (this.c != null) {
            i0 i0Var = new i0(this.c, 0);
            try {
                s0 z = i0Var.z();
                if (z == null) {
                    e0Var = new e0(0);
                } else {
                    e0 e0Var2 = new e0(0, (byte) 0);
                    do {
                        e0Var2.e(z);
                        z = i0Var.z();
                    } while (z != null);
                    e0Var = e0Var2;
                }
                i0Var.close();
                this.a = e0Var.k();
                this.c = null;
            } catch (IOException e) {
                throw new q0("malformed ASN.1: " + e, e);
            }
        }
    }

    @Override // defpackage.v0, defpackage.s0, defpackage.k0
    public final int hashCode() {
        M();
        return super.hashCode();
    }

    @Override // defpackage.v0, java.lang.Iterable
    public final Iterator iterator() {
        M();
        return super.iterator();
    }

    @Override // defpackage.v0
    public final int size() {
        M();
        return this.a.length;
    }

    @Override // defpackage.s0
    public final void u(qxp qxpVar, boolean z) {
        byte[] bArr;
        synchronized (this) {
            bArr = this.c;
        }
        if (bArr != null) {
            qxpVar.v(48, z, bArr);
        } else {
            super.A().u(qxpVar, z);
        }
    }

    @Override // defpackage.s0
    public final int w(boolean z) {
        byte[] bArr;
        synchronized (this) {
            bArr = this.c;
        }
        return bArr != null ? qxp.n(bArr.length, z) : super.A().w(z);
    }

    @Override // defpackage.v0, defpackage.s0
    public final s0 z() {
        M();
        return super.z();
    }
}
