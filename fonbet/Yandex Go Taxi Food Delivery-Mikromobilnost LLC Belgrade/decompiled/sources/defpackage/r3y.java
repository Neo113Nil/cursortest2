package defpackage;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import ru.domesticroots.bouncycastle.asn1.ASN1ParsingException;

/* loaded from: classes4.dex */
public final class r3y extends h3 {
    public byte[] c;

    public r3y(byte[] bArr) {
        this.c = bArr;
    }

    @Override // defpackage.h3, defpackage.a3, defpackage.n2
    public final int hashCode() {
        z();
        return super.hashCode();
    }

    @Override // defpackage.a3
    public final void i(g191 g191Var, boolean z) {
        byte[] bArr;
        synchronized (this) {
            bArr = this.c;
        }
        if (bArr != null) {
            g191Var.Y(48, bArr, z);
        } else {
            super.o().i(g191Var, z);
        }
    }

    @Override // defpackage.h3, java.lang.Iterable
    public final Iterator iterator() {
        z();
        return super.iterator();
    }

    @Override // defpackage.a3
    public final int k(boolean z) {
        byte[] bArr;
        synchronized (this) {
            bArr = this.c;
        }
        return bArr != null ? g191.M(bArr.length, z) : super.o().k(z);
    }

    @Override // defpackage.h3, defpackage.a3
    public final a3 n() {
        z();
        return super.n();
    }

    @Override // defpackage.h3, defpackage.a3
    public final a3 o() {
        z();
        return super.o();
    }

    @Override // defpackage.h3
    public final z1 s(int i) {
        z();
        return this.a[i];
    }

    @Override // defpackage.h3
    public final int size() {
        z();
        return this.a.length;
    }

    @Override // defpackage.h3
    public final Enumeration t() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.c;
        }
        if (bArr == null) {
            return new e3(this);
        }
        o3y o3yVar = new o3y(0);
        o3yVar.b = new i2(bArr, 0);
        o3yVar.c = o3yVar.a();
        return o3yVar;
    }

    @Override // defpackage.h3
    public final r1 u() {
        return ((h3) o()).u();
    }

    @Override // defpackage.h3
    public final v2 x() {
        return ((h3) o()).x();
    }

    @Override // defpackage.h3
    public final l3 y() {
        return ((h3) o()).y();
    }

    public final synchronized void z() {
        b2 b2Var;
        if (this.c != null) {
            i2 i2Var = new i2(this.c, 0);
            try {
                a3 k = i2Var.k();
                if (k == null) {
                    b2Var = new b2(0);
                } else {
                    b2 b2Var2 = new b2();
                    do {
                        b2Var2.a(k);
                        k = i2Var.k();
                    } while (k != null);
                    b2Var = b2Var2;
                }
                i2Var.close();
                this.a = b2Var.d();
                this.c = null;
            } catch (IOException e) {
                throw new ASN1ParsingException("malformed ASN.1: " + e, e);
            }
        }
    }
}
