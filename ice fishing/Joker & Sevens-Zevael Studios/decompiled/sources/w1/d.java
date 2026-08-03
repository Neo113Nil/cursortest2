package w1;

import x1.c1;
import x1.g0;
import x1.l;
import y0.m;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public interface d extends f, l {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [oc.a, pc.k] */
    /* JADX WARN: Type inference failed for: r2v10, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [w1.d, x1.l] */
    @Override // w1.f
    default Object f(g gVar) {
        c1 c1Var;
        m mVar = (m) this;
        if (!mVar.f8443g.f8456t) {
            u1.a.a("ModifierLocal accessed from an unattached node");
        }
        if (!mVar.f8443g.f8456t) {
            u1.a.b("visitAncestors called on an unattached node");
        }
        m mVar2 = mVar.f8443g.f8447k;
        g0 v10 = x1.f.v(this);
        while (v10 != null) {
            if ((v10.I.f7991f.f8446j & 32) != 0) {
                while (mVar2 != null) {
                    if ((mVar2.f8445i & 32) != 0) {
                        x1.m mVar3 = mVar2;
                        ?? r42 = 0;
                        while (mVar3 != 0) {
                            if (mVar3 instanceof d) {
                                d dVar = (d) mVar3;
                                if (dVar.i().e(gVar)) {
                                    return dVar.i().f(gVar);
                                }
                            } else if ((mVar3.f8445i & 32) != 0 && (mVar3 instanceof x1.m)) {
                                m mVar4 = mVar3.f8110v;
                                int i10 = 0;
                                mVar3 = mVar3;
                                r42 = r42;
                                while (mVar4 != null) {
                                    if ((mVar4.f8445i & 32) != 0) {
                                        i10++;
                                        r42 = r42;
                                        if (i10 == 1) {
                                            mVar3 = mVar4;
                                        } else {
                                            if (r42 == 0) {
                                                r42 = new o0.e(new m[16]);
                                            }
                                            if (mVar3 != 0) {
                                                r42.b(mVar3);
                                                mVar3 = 0;
                                            }
                                            r42.b(mVar4);
                                        }
                                    }
                                    mVar4 = mVar4.f8448l;
                                    mVar3 = mVar3;
                                    r42 = r42;
                                }
                                if (i10 == 1) {
                                }
                            }
                            mVar3 = x1.f.f(r42);
                        }
                    }
                    mVar2 = mVar2.f8447k;
                }
            }
            v10 = v10.s();
            mVar2 = (v10 == null || (c1Var = v10.I) == null) ? null : c1Var.f7990e;
        }
        return gVar.f7640a.invoke();
    }

    default u5.d i() {
        return b.f7633a;
    }
}
