package defpackage;

/* loaded from: classes3.dex */
public final class vmc {
    public final void a(ffh ffhVar, ffh ffhVar2, long j) {
        long q = v7g.q(j, aqf.a);
        if (ffhVar != null) {
            int h = ga6.h(q);
            eu6 eu6Var = lnc.a;
            int G = ffhVar.G(h);
            new qpe(qpe.a(G, ffhVar.z(G)));
        }
        if (ffhVar2 != null) {
            int h2 = ga6.h(q);
            eu6 eu6Var2 = lnc.a;
            int G2 = ffhVar2.G(h2);
            new qpe(qpe.a(G2, ffhVar2.z(G2)));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vmc)) {
            return false;
        }
        qmc qmcVar = qmc.a;
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + f1d.a(0, qmc.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "FlowLayoutOverflowState(type=" + qmc.a + ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }
}
