package defpackage;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import org.bouncycastle.asn1.ASN1ParsingException;

/* loaded from: classes4.dex */
public final class s3y extends i3 {
    public byte[] c;

    @Override // defpackage.i3
    public final a2 A(int i) {
        I();
        return this.a[i];
    }

    @Override // defpackage.i3
    public final Enumeration B() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.c;
        }
        if (bArr == null) {
            return new f3(this);
        }
        o3y o3yVar = new o3y(1);
        o3yVar.b = new j2(bArr, 0);
        o3yVar.c = o3yVar.b();
        return o3yVar;
    }

    @Override // defpackage.i3
    public final s1 C() {
        return ((i3) t()).C();
    }

    @Override // defpackage.i3
    public final opf E() {
        return ((i3) t()).E();
    }

    @Override // defpackage.i3
    public final w2 F() {
        return ((i3) t()).F();
    }

    @Override // defpackage.i3
    public final m3 G() {
        return ((i3) t()).G();
    }

    @Override // defpackage.i3
    public final a2[] H() {
        I();
        return c2.b(this.a);
    }

    public final synchronized void I() {
        c2 c2Var;
        if (this.c != null) {
            j2 j2Var = new j2(this.c, 0);
            try {
                b3 n = j2Var.n();
                if (n == null) {
                    c2Var = new c2(0);
                } else {
                    c2 c2Var2 = new c2();
                    do {
                        c2Var2.a(n);
                        n = j2Var.n();
                    } while (n != null);
                    c2Var = c2Var2;
                }
                j2Var.close();
                this.a = c2Var.d();
                this.c = null;
            } catch (IOException e) {
                throw new ASN1ParsingException("malformed ASN.1: " + e, e);
            }
        }
    }

    @Override // defpackage.i3, defpackage.b3, defpackage.o2
    public final int hashCode() {
        I();
        return super.hashCode();
    }

    @Override // defpackage.i3, java.lang.Iterable
    public final Iterator iterator() {
        I();
        return super.iterator();
    }

    @Override // defpackage.b3
    public final void n(ryh ryhVar, boolean z) {
        byte[] bArr;
        synchronized (this) {
            bArr = this.c;
        }
        if (bArr != null) {
            ryhVar.I(48, bArr, z);
        } else {
            super.t().n(ryhVar, z);
        }
    }

    @Override // defpackage.b3
    public final int p(boolean z) {
        byte[] bArr;
        synchronized (this) {
            bArr = this.c;
        }
        return bArr != null ? ryh.w(bArr.length, z) : super.t().p(z);
    }

    @Override // defpackage.i3, defpackage.b3
    public final b3 s() {
        I();
        return super.s();
    }

    @Override // defpackage.i3
    public final int size() {
        I();
        return this.a.length;
    }

    @Override // defpackage.i3, defpackage.b3
    public final b3 t() {
        I();
        return super.t();
    }
}
