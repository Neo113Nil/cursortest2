package defpackage;

/* loaded from: classes4.dex */
public final class wmc {
    public final void a(ffh ffhVar, ffh ffhVar2, long j) {
        long r = y7g.r(j, bqf.a);
        if (ffhVar != null) {
            int h = ga6.h(r);
            fu6 fu6Var = jnc.a;
            int G = ffhVar.G(h);
            new qpe(qpe.a(G, ffhVar.z(G)));
        }
        if (ffhVar2 != null) {
            int h2 = ga6.h(r);
            fu6 fu6Var2 = jnc.a;
            int G2 = ffhVar2.G(h2);
            new qpe(qpe.a(G2, ffhVar2.z(G2)));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wmc)) {
            return false;
        }
        rmc rmcVar = rmc.a;
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + f1d.a(0, rmc.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "FlowLayoutOverflowState(type=" + rmc.a + ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }
}
