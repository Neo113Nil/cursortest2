package defpackage;

/* loaded from: classes4.dex */
public final class xmc {
    public final void a(ffh ffhVar, ffh ffhVar2, long j) {
        long m = f8g.m(j, cqf.a);
        if (ffhVar != null) {
            int h = ga6.h(m);
            gu6 gu6Var = knc.a;
            int G = ffhVar.G(h);
            new qpe(qpe.a(G, ffhVar.z(G)));
        }
        if (ffhVar2 != null) {
            int h2 = ga6.h(m);
            gu6 gu6Var2 = knc.a;
            int G2 = ffhVar2.G(h2);
            new qpe(qpe.a(G2, ffhVar2.z(G2)));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xmc)) {
            return false;
        }
        smc smcVar = smc.a;
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + f1d.a(0, smc.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "FlowLayoutOverflowState(type=" + smc.a + ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }
}
