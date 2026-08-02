package defpackage;

/* loaded from: classes5.dex */
public final class rsa implements t9f {
    public static final rsa a = new rsa();
    public static final gsm b = new gsm("kotlin.time.Duration", csm.j);

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        eg7Var.getClass();
        msa msaVar = nsa.b;
        String A = eg7Var.A();
        msaVar.getClass();
        A.getClass();
        try {
            return new nsa(yd5.n(A));
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(hrg.q("Invalid ISO duration string format: '", A, "'."), e);
        }
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return b;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        long j = ((nsa) obj).a;
        l6bVar.getClass();
        msa msaVar = nsa.b;
        StringBuilder sb = new StringBuilder();
        if (j < 0) {
            sb.append('-');
        }
        sb.append("PT");
        long u = j < 0 ? nsa.u(j) : j;
        long s = nsa.s(u, ssa.HOURS);
        int g = nsa.g(u);
        int i = nsa.i(u);
        int h = nsa.h(u);
        if (nsa.l(j)) {
            s = 9999999999999L;
        }
        boolean z = false;
        boolean z2 = s != 0;
        boolean z3 = (i == 0 && h == 0) ? false : true;
        if (g != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(s);
            sb.append('H');
        }
        if (z) {
            sb.append(g);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            nsa.b(sb, i, h, 9, "S", true);
        }
        l6bVar.E(sb.toString());
    }
}
