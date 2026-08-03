package v1;

import x1.c1;
import x1.y1;
import x1.z1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class z implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final s.v f7180a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f7181b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7182c;

    public z(a0 a0Var, Object obj) {
        this.f7181b = a0Var;
        this.f7182c = obj;
        int[] iArr = s.m.f6304a;
        this.f7180a = new s.v();
    }

    @Override // v1.q0
    public final void a() {
        a0 a0Var = this.f7181b;
        x1.g0 g0Var = a0Var.f7052g;
        a0Var.d();
        x1.g0 g0Var2 = (x1.g0) a0Var.f7061p.k(this.f7182c);
        if (g0Var2 != null) {
            if (a0Var.f7066u <= 0) {
                u1.a.b("No pre-composed items to dispose");
            }
            int i10 = ((o0.b) g0Var.n()).f5128g.i(g0Var2);
            if (i10 < ((o0.b) g0Var.n()).f5128g.f5136i - a0Var.f7066u) {
                u1.a.b("Item is not in pre-composed item range");
            }
            a0Var.f7065t++;
            a0Var.f7066u--;
            t tVar = (t) a0Var.f7057l.g(g0Var2);
            if (tVar != null) {
                tVar.getClass();
            }
            int i11 = (((o0.b) g0Var.n()).f5128g.f5136i - a0Var.f7066u) - a0Var.f7065t;
            g0Var.f8055u = true;
            g0Var.K(i10, i11, 1);
            g0Var.f8055u = false;
            a0Var.c(i11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [b0.t0] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // v1.q0
    public final void b(b0.t0 t0Var) {
        c1 c1Var;
        y0.m mVar;
        y1 y1Var;
        x1.g0 g0Var = (x1.g0) this.f7181b.f7061p.g(this.f7182c);
        if (g0Var == null || (c1Var = g0Var.I) == null || (mVar = c1Var.f7991f) == null) {
            return;
        }
        if (!mVar.f8443g.f8456t) {
            u1.a.b("visitSubtreeIf called on an unattached node");
        }
        o0.e eVar = new o0.e(new y0.m[16]);
        y0.m mVar2 = mVar.f8443g;
        y0.m mVar3 = mVar2.f8448l;
        if (mVar3 == null) {
            x1.f.b(eVar, mVar2);
        } else {
            eVar.b(mVar3);
        }
        while (true) {
            int i10 = eVar.f5136i;
            if (i10 == 0) {
                return;
            }
            y0.m mVar4 = (y0.m) eVar.k(i10 - 1);
            if ((mVar4.f8446j & 262144) != 0) {
                for (y0.m mVar5 = mVar4; mVar5 != null; mVar5 = mVar5.f8448l) {
                    if ((mVar5.f8445i & 262144) != 0) {
                        x1.m mVar6 = mVar5;
                        ?? r72 = 0;
                        while (mVar6 != 0) {
                            if (mVar6 instanceof z1) {
                                z1 z1Var = (z1) mVar6;
                                boolean equals = "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode".equals(z1Var.r());
                                y1 y1Var2 = y1.f8219h;
                                if (equals) {
                                    t0Var.invoke(z1Var);
                                    y1Var = y1Var2;
                                } else {
                                    y1Var = y1.f8218g;
                                }
                                if (y1Var == y1.f8220i) {
                                    return;
                                }
                                if (y1Var == y1Var2) {
                                    break;
                                }
                            } else if ((mVar6.f8445i & 262144) != 0 && (mVar6 instanceof x1.m)) {
                                y0.m mVar7 = mVar6.f8110v;
                                int i11 = 0;
                                mVar6 = mVar6;
                                r72 = r72;
                                while (mVar7 != null) {
                                    if ((mVar7.f8445i & 262144) != 0) {
                                        i11++;
                                        r72 = r72;
                                        if (i11 == 1) {
                                            mVar6 = mVar7;
                                        } else {
                                            if (r72 == 0) {
                                                r72 = new o0.e(new y0.m[16]);
                                            }
                                            if (mVar6 != 0) {
                                                r72.b(mVar6);
                                                mVar6 = 0;
                                            }
                                            r72.b(mVar7);
                                        }
                                    }
                                    mVar7 = mVar7.f8448l;
                                    mVar6 = mVar6;
                                    r72 = r72;
                                }
                                if (i11 == 1) {
                                }
                            }
                            mVar6 = x1.f.f(r72);
                        }
                    }
                }
            }
            x1.f.b(eVar, mVar4);
        }
    }

    @Override // v1.q0
    public final int c() {
        x1.g0 g0Var = (x1.g0) this.f7181b.f7061p.g(this.f7182c);
        if (g0Var != null) {
            return ((o0.b) g0Var.m()).f5128g.f5136i;
        }
        return 0;
    }

    @Override // v1.q0
    public final void d(int i10, long j3) {
        a0 a0Var = this.f7181b;
        x1.g0 g0Var = (x1.g0) a0Var.f7061p.g(this.f7182c);
        if (g0Var == null || !g0Var.G()) {
            return;
        }
        int i11 = ((o0.b) g0Var.m()).f5128g.f5136i;
        if (i10 < 0 || i10 >= i11) {
            u1.a.d("Index (" + i10 + ") is out of bound of [0, " + i11 + ')');
        }
        if (g0Var.H()) {
            u1.a.a("Pre-measure called on node that is not placed");
        }
        x1.g0 g0Var2 = a0Var.f7052g;
        g0Var2.f8055u = true;
        ((y1.r) x1.j0.a(g0Var)).u((x1.g0) ((o0.b) g0Var.m()).get(i10), j3);
        g0Var2.f8055u = false;
        this.f7180a.a(i10);
    }
}
