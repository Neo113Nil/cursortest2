package w1;

import b0.p0;
import java.util.HashSet;
import s.a0;
import x1.g0;
import y0.m;
import y1.r;
import z.x;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final r f7634a;

    /* renamed from: b, reason: collision with root package name */
    public final o0.e f7635b = new o0.e(new x1.c[16]);

    /* renamed from: c, reason: collision with root package name */
    public final o0.e f7636c = new o0.e(new g[16]);

    /* renamed from: d, reason: collision with root package name */
    public final o0.e f7637d = new o0.e(new g0[16]);

    /* renamed from: e, reason: collision with root package name */
    public final o0.e f7638e = new o0.e(new g[16]);

    /* renamed from: f, reason: collision with root package name */
    public boolean f7639f;

    public c(r rVar) {
        this.f7634a = rVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static void b(m mVar, g gVar, HashSet hashSet) {
        if (!mVar.f8443g.f8456t) {
            u1.a.b("visitSubtreeIf called on an unattached node");
        }
        o0.e eVar = new o0.e(new m[16]);
        m mVar2 = mVar.f8443g;
        m mVar3 = mVar2.f8448l;
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
            m mVar4 = (m) eVar.k(i10 - 1);
            if ((mVar4.f8446j & 32) != 0) {
                for (m mVar5 = mVar4; mVar5 != null; mVar5 = mVar5.f8448l) {
                    if ((mVar5.f8445i & 32) != 0) {
                        x1.m mVar6 = mVar5;
                        ?? r5 = 0;
                        while (mVar6 != 0) {
                            if (mVar6 instanceof d) {
                                d dVar = (d) mVar6;
                                if (dVar instanceof x1.c) {
                                    x1.c cVar = (x1.c) dVar;
                                    if ((cVar.f7977u instanceof x) && cVar.f7979w.contains(gVar)) {
                                        hashSet.add(dVar);
                                    }
                                }
                                if (dVar.i().e(gVar)) {
                                    break;
                                }
                            } else if ((mVar6.f8445i & 32) != 0 && (mVar6 instanceof x1.m)) {
                                m mVar7 = mVar6.f8110v;
                                int i11 = 0;
                                mVar6 = mVar6;
                                r5 = r5;
                                while (mVar7 != null) {
                                    if ((mVar7.f8445i & 32) != 0) {
                                        i11++;
                                        r5 = r5;
                                        if (i11 == 1) {
                                            mVar6 = mVar7;
                                        } else {
                                            if (r5 == 0) {
                                                r5 = new o0.e(new m[16]);
                                            }
                                            if (mVar6 != 0) {
                                                r5.b(mVar6);
                                                mVar6 = 0;
                                            }
                                            r5.b(mVar7);
                                        }
                                    }
                                    mVar7 = mVar7.f8448l;
                                    mVar6 = mVar6;
                                    r5 = r5;
                                }
                                if (i11 == 1) {
                                }
                            }
                            mVar6 = x1.f.f(r5);
                        }
                    }
                }
            }
            x1.f.b(eVar, mVar4);
        }
    }

    public final void a() {
        if (this.f7639f) {
            return;
        }
        this.f7639f = true;
        p0 p0Var = new p0(19, this);
        a0 a0Var = this.f7634a.f8645z0;
        if (a0Var.f(p0Var) >= 0) {
            return;
        }
        a0Var.a(p0Var);
    }
}
