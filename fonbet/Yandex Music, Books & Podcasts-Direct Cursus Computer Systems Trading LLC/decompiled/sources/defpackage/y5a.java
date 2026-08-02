package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y5a implements rqn, tqg {
    public final g06 a = new g06(new d5b(), c5b.a);

    public static final h6a c(f5a f5aVar, y5a y5aVar, int i, m4a m4aVar) {
        t5a t5aVar = f5aVar.a;
        Throwable th = f5aVar.b;
        String h = ern.a(th.getClass()).h();
        if (h == null) {
            h = "";
        }
        String message = th.getMessage();
        x3a x3aVar = x3a.a;
        return new h6a(i, m4aVar, t5aVar, new w3a(h, message));
    }

    public static final l6a d(h5a h5aVar, int i) {
        m4a m4aVar = h5aVar.b;
        t5a t5aVar = m4aVar.b;
        if (t5aVar == null) {
            t5aVar = h5aVar.a;
        }
        r2a r2aVar = r2a.d;
        return new l6a(i, m4aVar, t5aVar, r2aVar, r2aVar);
    }

    @Override // defpackage.tqg
    public final g06 a() {
        return this.a;
    }

    @Override // defpackage.rqn
    public final Object b(Object obj, ohb ohbVar) {
        m6a m6aVar = (m6a) obj;
        if (ohbVar instanceof r5a) {
            q5a q5aVar = ((r5a) ohbVar).a;
            if (q5aVar instanceof fxn) {
                fxn fxnVar = (fxn) q5aVar;
                t5a t5aVar = fxnVar.b;
                m4a m4aVar = fxnVar.a;
                r2a r2aVar = fxnVar.c;
                r2a r2aVar2 = fxnVar.d;
                if (m6aVar instanceof i6a) {
                    v3a v3aVar = ((i6a) m6aVar).a;
                    return new l6a(v3aVar != null ? 1 + v3aVar.a : 1, m4aVar, t5aVar, r2aVar, r2aVar2);
                }
                if (m6aVar instanceof k6a) {
                    return new l6a(((k6a) m6aVar).a + 1, m4aVar, t5aVar, r2aVar, r2aVar2);
                }
                if (m6aVar instanceof j6a) {
                    return new l6a(((j6a) m6aVar).a + 1, m4aVar, t5aVar, r2aVar, r2aVar2);
                }
                if (m6aVar instanceof l6a) {
                    return new l6a(((l6a) m6aVar).a + 1, m4aVar, t5aVar, r2aVar, r2aVar2);
                }
                if (m6aVar instanceof h6a) {
                    return new l6a(((h6a) m6aVar).a + 1, m4aVar, t5aVar, r2aVar, r2aVar2);
                }
                b6e.s();
                return null;
            }
        } else {
            if (ohbVar instanceof y2a) {
                y2a y2aVar = (y2a) ohbVar;
                if (m6aVar instanceof i6a) {
                    return m6aVar;
                }
                if (m6aVar instanceof j6a) {
                    return m6aVar;
                }
                if (m6aVar instanceof k6a) {
                    return m6aVar;
                }
                if (m6aVar instanceof l6a) {
                    l6a l6aVar = (l6a) m6aVar;
                    int i = l6aVar.a + 1;
                    m4a m4aVar2 = l6aVar.b;
                    return new l6a(i, m4a.a(m4aVar2, q2a.a(m4aVar2.a, y2aVar.a, null, null, 62)), l6aVar.c, l6aVar.d, l6aVar.e);
                }
                if (m6aVar instanceof h6a) {
                    return m6aVar;
                }
                b6e.s();
                return null;
            }
            if (ohbVar instanceof c6a) {
                if (m6aVar instanceof i6a) {
                    return m6aVar;
                }
                if (m6aVar instanceof j6a) {
                    return m6aVar;
                }
                if (m6aVar instanceof k6a) {
                    return m6aVar;
                }
                if (m6aVar instanceof l6a) {
                    q2a q2aVar = ((l6a) m6aVar).b.a;
                    throw null;
                }
                if (m6aVar instanceof h6a) {
                    return m6aVar;
                }
                b6e.s();
                return null;
            }
            if (ohbVar instanceof n5a) {
                n5a n5aVar = (n5a) ohbVar;
                q2a q2aVar2 = n5aVar.b;
                t5a t5aVar2 = n5aVar.a;
                if (m6aVar instanceof i6a) {
                    v3a v3aVar2 = ((i6a) m6aVar).a;
                    return new j6a(v3aVar2 != null ? 1 + v3aVar2.a : 1, null, t5aVar2, q2aVar2);
                }
                if (m6aVar instanceof j6a) {
                    j6a j6aVar = (j6a) m6aVar;
                    return !Intrinsics.d(j6aVar.c, t5aVar2) ? new j6a(j6aVar.a + 1, j6aVar.b, t5aVar2, q2aVar2) : j6aVar;
                }
                if (m6aVar instanceof k6a) {
                    k6a k6aVar = (k6a) m6aVar;
                    return !Intrinsics.d(k6aVar.c.a, t5aVar2.a) ? new j6a(k6aVar.a + 1, k6aVar.b, t5aVar2, q2aVar2) : m6aVar;
                }
                if (m6aVar instanceof l6a) {
                    l6a l6aVar2 = (l6a) m6aVar;
                    t5a t5aVar3 = l6aVar2.c;
                    boolean d = Intrinsics.d(t5aVar3 != null ? t5aVar3.a : null, t5aVar2.a);
                    int i2 = l6aVar2.a;
                    m4a m4aVar3 = l6aVar2.b;
                    return !d ? new j6a(i2 + 1, m4aVar3, t5aVar2, q2aVar2) : new k6a(i2 + 1, m4aVar3, t5aVar2, q2aVar2);
                }
                if (!(m6aVar instanceof h6a)) {
                    b6e.s();
                    return null;
                }
                h6a h6aVar = (h6a) m6aVar;
                m4a m4aVar4 = h6aVar.b;
                int i3 = h6aVar.a;
                return (!Intrinsics.d(h6aVar.c.a, t5aVar2.a) || m4aVar4 == null) ? new j6a(i3 + 1, m4aVar4, t5aVar2, q2aVar2) : new k6a(i3 + 1, m4aVar4, t5aVar2, q2aVar2);
            }
            if (ohbVar instanceof h5a) {
                h5a h5aVar = (h5a) ohbVar;
                if (m6aVar instanceof i6a) {
                    return m6aVar;
                }
                if (m6aVar instanceof j6a) {
                    return d(h5aVar, ((j6a) m6aVar).a);
                }
                if (m6aVar instanceof k6a) {
                    return d(h5aVar, ((k6a) m6aVar).a + 1);
                }
                if (m6aVar instanceof l6a) {
                    return d(h5aVar, ((l6a) m6aVar).a + 1);
                }
                if (m6aVar instanceof h6a) {
                    return d(h5aVar, ((h6a) m6aVar).a + 1);
                }
                b6e.s();
                return null;
            }
            if (ohbVar instanceof f5a) {
                f5a f5aVar = (f5a) ohbVar;
                if (m6aVar instanceof i6a) {
                    return m6aVar;
                }
                if (m6aVar instanceof j6a) {
                    j6a j6aVar2 = (j6a) m6aVar;
                    return c(f5aVar, this, j6aVar2.a, j6aVar2.b);
                }
                if (m6aVar instanceof l6a) {
                    l6a l6aVar3 = (l6a) m6aVar;
                    return c(f5aVar, this, l6aVar3.a + 1, l6aVar3.b);
                }
                if (m6aVar instanceof k6a) {
                    k6a k6aVar2 = (k6a) m6aVar;
                    return c(f5aVar, this, k6aVar2.a + 1, k6aVar2.b);
                }
                if (m6aVar instanceof h6a) {
                    h6a h6aVar2 = (h6a) m6aVar;
                    return c(f5aVar, this, h6aVar2.a + 1, h6aVar2.b);
                }
                b6e.s();
                return null;
            }
            if (ohbVar instanceof a6a) {
                if (m6aVar instanceof i6a) {
                    return m6aVar;
                }
                if (m6aVar instanceof j6a) {
                    j6a j6aVar3 = (j6a) m6aVar;
                    return new i6a(new v3a(j6aVar3.a), j6aVar3.c, 2);
                }
                if (m6aVar instanceof k6a) {
                    k6a k6aVar3 = (k6a) m6aVar;
                    return new i6a(new v3a(k6aVar3.a), k6aVar3.c, 2);
                }
                if (m6aVar instanceof l6a) {
                    l6a l6aVar4 = (l6a) m6aVar;
                    return new i6a(new v3a(l6aVar4.a), l6aVar4.c, 2);
                }
                if (m6aVar instanceof h6a) {
                    h6a h6aVar3 = (h6a) m6aVar;
                    return new i6a(new v3a(h6aVar3.a), h6aVar3.c, 2);
                }
                b6e.s();
                return null;
            }
            if (ohbVar instanceof thm) {
                thm thmVar = (thm) ohbVar;
                v3a b = m6aVar.b();
                int i4 = b != null ? 1 + b.a : 1;
                t5a t5aVar4 = thmVar.a;
                m4a m4aVar5 = thmVar.c;
                r2a r2aVar3 = r2a.d;
                return new l6a(i4, m4aVar5, t5aVar4, r2aVar3, r2aVar3);
            }
        }
        return m6aVar;
    }
}
