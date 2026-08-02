package defpackage;

/* loaded from: classes.dex */
public final class ymc {
    public final void a(ffh ffhVar, ffh ffhVar2, long j) {
        long n = o8g.n(j, dqf.a);
        if (ffhVar != null) {
            int G = ffhVar.G(ga6.h(n));
            new qpe(qpe.a(G, ffhVar.z(G)));
        }
        if (ffhVar2 != null) {
            int G2 = ffhVar2.G(ga6.h(n));
            new qpe(qpe.a(G2, ffhVar2.z(G2)));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ymc)) {
            return false;
        }
        tmc tmcVar = tmc.a;
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + f1d.a(0, tmc.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "FlowLayoutOverflowState(type=" + tmc.a + ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }
}
