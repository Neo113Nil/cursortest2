package defpackage;

/* loaded from: classes5.dex */
public final class iwt implements t9f {
    public static final iwt a = new iwt();
    public static final gsm b = new gsm("kotlin.uuid.Uuid", csm.j);

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        eg7Var.getClass();
        String A = eg7Var.A();
        A.getClass();
        int length = A.length();
        if (length == 32) {
            long d = jxd.d(0, 16, A);
            long d2 = jxd.d(16, 32, A);
            if (d != 0 || d2 != 0) {
                return new fwt(d, d2);
            }
        } else {
            if (length != 36) {
                StringBuilder sb = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                sb.append(A.length() <= 64 ? A : A.substring(0, 64).concat("..."));
                sb.append("\" of length ");
                sb.append(A.length());
                throw new IllegalArgumentException(sb.toString());
            }
            long d3 = jxd.d(0, 8, A);
            ixf.q(8, A);
            long d4 = jxd.d(9, 13, A);
            ixf.q(13, A);
            long d5 = jxd.d(14, 18, A);
            ixf.q(18, A);
            long d6 = jxd.d(19, 23, A);
            ixf.q(23, A);
            long j = (d4 << 16) | (d3 << 32) | d5;
            long d7 = jxd.d(24, 36, A) | (d6 << 48);
            if (j != 0 || d7 != 0) {
                return new fwt(j, d7);
            }
        }
        return fwt.c;
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return b;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        fwt fwtVar = (fwt) obj;
        l6bVar.getClass();
        fwtVar.getClass();
        l6bVar.E(fwtVar.toString());
    }
}
