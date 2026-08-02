package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* loaded from: classes5.dex */
public abstract class o0 extends s0 implements p0 {
    public static final y b = new y(6, o0.class);
    public static final byte[] c = new byte[0];
    public final byte[] a;

    public o0(byte[] bArr) {
        if (bArr != null) {
            this.a = bArr;
        } else {
            jj4.j("'string' cannot be null");
            throw null;
        }
    }

    public static o0 B(Object obj) {
        if (obj == null || (obj instanceof o0)) {
            return (o0) obj;
        }
        if (obj instanceof d0) {
            s0 n = ((d0) obj).n();
            if (n instanceof o0) {
                return (o0) n;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (o0) b.c((byte[]) obj);
            } catch (IOException e) {
                kac.l(e.getMessage(), "failed to construct OCTET STRING from byte[]: ");
                return null;
            }
        }
        xq0.x("illegal object in getInstance: ".concat(obj.getClass().getName()));
        return null;
    }

    @Override // defpackage.s0
    public s0 A() {
        return new a07(this.a);
    }

    @Override // defpackage.p0
    public final InputStream a() {
        return new ByteArrayInputStream(this.a);
    }

    @Override // defpackage.s0, defpackage.k0
    public final int hashCode() {
        return j66.e0(this.a);
    }

    @Override // defpackage.s0
    public final boolean t(s0 s0Var) {
        if (s0Var instanceof o0) {
            return Arrays.equals(this.a, ((o0) s0Var).a);
        }
        return false;
    }

    public final String toString() {
        jtc jtcVar = ixd.a;
        byte[] bArr = this.a;
        return "#".concat(fxf.B(ixd.a(bArr.length, bArr)));
    }

    @Override // defpackage.s0
    public s0 z() {
        return new a07(this.a);
    }

    @Override // defpackage.xge
    public final s0 m() {
        return this;
    }
}
