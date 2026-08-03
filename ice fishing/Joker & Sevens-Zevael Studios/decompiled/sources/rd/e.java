package rd;

import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import androidx.lifecycle.t0;
import androidx.lifecycle.y0;
import java.util.ArrayList;
import java.util.Iterator;
import m0.d1;
import m0.y1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e implements k5.a {

    /* renamed from: g, reason: collision with root package name */
    public static final e f6134g = new e();

    @Override // k5.a
    public final void c(m0.r rVar) {
        rVar.X(2072626747);
        Object obj = (m5.c) m5.h.c(m5.h.f4895a, rVar);
        rVar.Y(1890788296);
        y0 a6 = y3.a.a(rVar);
        if (a6 == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        ub.f r5 = i7.b.r(a6, rVar);
        rVar.Y(1729797275);
        t0 j3 = ud.g.j(d0.class, a6, r5, a6 instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) a6).e() : x3.a.f8285b, rVar);
        rVar.q(false);
        rVar.q(false);
        final d0 d0Var = (d0) j3;
        d1 k3 = m0.z.k(d0Var.f6132e, rVar);
        rVar.X(1330743913);
        boolean z10 = ((y) k3.getValue()).f6211g;
        Object obj2 = m0.l.f4646a;
        if (z10 && ((y) k3.getValue()).f6212h) {
            rVar.X(1330746445);
            boolean h10 = rVar.h(obj) | rVar.f(k3);
            Object M = rVar.M();
            if (h10 || M == obj2) {
                M = new ae.c(obj, k3, null, 2);
                rVar.i0(M);
            }
            rVar.q(false);
            m0.z.f(ac.o.f277a, rVar, (oc.e) M);
        }
        rVar.q(false);
        y yVar = (y) k3.getValue();
        rVar.X(1330752050);
        boolean h11 = rVar.h(d0Var);
        Object M2 = rVar.M();
        if (h11 || M2 == obj2) {
            M2 = new n0(5, d0Var);
            rVar.i0(M2);
        }
        oc.a aVar = (oc.a) M2;
        rVar.q(false);
        rVar.X(1330753702);
        boolean h12 = rVar.h(d0Var);
        Object M3 = rVar.M();
        if (h12 || M3 == obj2) {
            final int i10 = 0;
            M3 = new oc.c() { // from class: rd.c
                @Override // oc.c
                public final Object invoke(Object obj3) {
                    Object obj4;
                    switch (i10) {
                        case 0:
                            String str = (String) obj3;
                            pc.j.e(str, "cardId");
                            d0 d0Var2 = d0Var;
                            pd.a aVar2 = d0Var2.f6130c;
                            bd.e0 e0Var = aVar2.f5689d;
                            bd.e0 e0Var2 = aVar2.f5687b;
                            qd.h hVar = (qd.h) e0Var2.getValue();
                            boolean z11 = hVar.f5856l;
                            int i11 = hVar.f5853i;
                            int i12 = hVar.f5851g;
                            fc.d dVar = null;
                            if (!z11) {
                                Iterator it = ((Iterable) e0Var.getValue()).iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj4 = it.next();
                                        if (pc.j.a(((qd.b) obj4).f5823a, str)) {
                                        }
                                    } else {
                                        obj4 = null;
                                    }
                                }
                                qd.b bVar = (qd.b) obj4;
                                if (bVar != null) {
                                    Iterable iterable = (Iterable) e0Var.getValue();
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj5 : iterable) {
                                        if (!pc.j.a(((qd.b) obj5).f5823a, str)) {
                                            arrayList.add(obj5);
                                        }
                                    }
                                    e0Var.h(null, arrayList);
                                    int ordinal = bVar.f5824b.ordinal();
                                    if (ordinal == 0) {
                                        int i13 = i12 + 1;
                                        e0Var2.h(null, qd.h.a(hVar, i13, 0, i11 + (i13 % 5 == 0 ? 1 : 0), 0, false, null, false, 250));
                                    } else if (ordinal == 1) {
                                        int i14 = i12 + 2;
                                        e0Var2.h(null, qd.h.a(hVar, i14, 0, (i14 % 5 == 0 ? 1 : 0) + 1 + i11, hVar.f5854j + 1, false, null, false, 242));
                                    } else {
                                        if (ordinal != 2) {
                                            throw new ac.d();
                                        }
                                        if (hVar.f5858n) {
                                            e0Var2.h(null, qd.h.a(hVar, 0, 0, 0, 0, false, null, false, 127));
                                        } else {
                                            int i15 = hVar.f5852h - 1;
                                            e0Var2.h(null, qd.h.a(hVar, 0, i15, 0, 0, i15 <= 0, null, false, 221));
                                        }
                                    }
                                    r8 = 1;
                                }
                            }
                            bd.e0 e0Var3 = d0Var2.f6131d;
                            e0Var3.h(null, y.a((y) e0Var3.getValue(), null, null, null, null, false, false, false, str, r8 != 0 ? e0.f6135g : e0.f6136h, 255));
                            yc.a0.q(m0.h(d0Var2), null, new z(d0Var2, dVar, 4), 3);
                            break;
                        default:
                            qd.l lVar = (qd.l) obj3;
                            pc.j.e(lVar, com.onesignal.inAppMessages.internal.display.impl.n.EVENT_TYPE_KEY);
                            d0 d0Var3 = d0Var;
                            yc.a0.q(m0.h(d0Var3), null, new c0.d(d0Var3, lVar, null, 7), 3);
                            break;
                    }
                    return ac.o.f277a;
                }
            };
            rVar.i0(M3);
        }
        oc.c cVar = (oc.c) M3;
        rVar.q(false);
        rVar.X(1330756174);
        boolean f10 = rVar.f(k3) | rVar.h(d0Var);
        Object M4 = rVar.M();
        if (f10 || M4 == obj2) {
            M4 = new y1(1, d0Var, k3);
            rVar.i0(M4);
        }
        oc.a aVar2 = (oc.a) M4;
        rVar.q(false);
        rVar.X(1330760767);
        boolean h13 = rVar.h(d0Var);
        Object M5 = rVar.M();
        if (h13 || M5 == obj2) {
            final int i11 = 1;
            M5 = new oc.c() { // from class: rd.c
                @Override // oc.c
                public final Object invoke(Object obj3) {
                    Object obj4;
                    switch (i11) {
                        case 0:
                            String str = (String) obj3;
                            pc.j.e(str, "cardId");
                            d0 d0Var2 = d0Var;
                            pd.a aVar22 = d0Var2.f6130c;
                            bd.e0 e0Var = aVar22.f5689d;
                            bd.e0 e0Var2 = aVar22.f5687b;
                            qd.h hVar = (qd.h) e0Var2.getValue();
                            boolean z11 = hVar.f5856l;
                            int i112 = hVar.f5853i;
                            int i12 = hVar.f5851g;
                            fc.d dVar = null;
                            if (!z11) {
                                Iterator it = ((Iterable) e0Var.getValue()).iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj4 = it.next();
                                        if (pc.j.a(((qd.b) obj4).f5823a, str)) {
                                        }
                                    } else {
                                        obj4 = null;
                                    }
                                }
                                qd.b bVar = (qd.b) obj4;
                                if (bVar != null) {
                                    Iterable iterable = (Iterable) e0Var.getValue();
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj5 : iterable) {
                                        if (!pc.j.a(((qd.b) obj5).f5823a, str)) {
                                            arrayList.add(obj5);
                                        }
                                    }
                                    e0Var.h(null, arrayList);
                                    int ordinal = bVar.f5824b.ordinal();
                                    if (ordinal == 0) {
                                        int i13 = i12 + 1;
                                        e0Var2.h(null, qd.h.a(hVar, i13, 0, i112 + (i13 % 5 == 0 ? 1 : 0), 0, false, null, false, 250));
                                    } else if (ordinal == 1) {
                                        int i14 = i12 + 2;
                                        e0Var2.h(null, qd.h.a(hVar, i14, 0, (i14 % 5 == 0 ? 1 : 0) + 1 + i112, hVar.f5854j + 1, false, null, false, 242));
                                    } else {
                                        if (ordinal != 2) {
                                            throw new ac.d();
                                        }
                                        if (hVar.f5858n) {
                                            e0Var2.h(null, qd.h.a(hVar, 0, 0, 0, 0, false, null, false, 127));
                                        } else {
                                            int i15 = hVar.f5852h - 1;
                                            e0Var2.h(null, qd.h.a(hVar, 0, i15, 0, 0, i15 <= 0, null, false, 221));
                                        }
                                    }
                                    r8 = 1;
                                }
                            }
                            bd.e0 e0Var3 = d0Var2.f6131d;
                            e0Var3.h(null, y.a((y) e0Var3.getValue(), null, null, null, null, false, false, false, str, r8 != 0 ? e0.f6135g : e0.f6136h, 255));
                            yc.a0.q(m0.h(d0Var2), null, new z(d0Var2, dVar, 4), 3);
                            break;
                        default:
                            qd.l lVar = (qd.l) obj3;
                            pc.j.e(lVar, com.onesignal.inAppMessages.internal.display.impl.n.EVENT_TYPE_KEY);
                            d0 d0Var3 = d0Var;
                            yc.a0.q(m0.h(d0Var3), null, new c0.d(d0Var3, lVar, null, 7), 3);
                            break;
                    }
                    return ac.o.f277a;
                }
            };
            rVar.i0(M5);
        }
        oc.c cVar2 = (oc.c) M5;
        rVar.q(false);
        rVar.X(1330763114);
        boolean h14 = rVar.h(d0Var);
        Object M6 = rVar.M();
        if (h14 || M6 == obj2) {
            M6 = new oc.f() { // from class: rd.d
                @Override // oc.f
                public final Object b(Object obj3, Object obj4, Object obj5) {
                    float floatValue = ((Float) obj3).floatValue();
                    float floatValue2 = ((Float) obj4).floatValue();
                    float floatValue3 = ((Float) obj5).floatValue();
                    pd.a aVar3 = d0.this.f6130c;
                    aVar3.f5692g = floatValue;
                    aVar3.f5693h = floatValue2;
                    aVar3.f5694i = floatValue3;
                    return ac.o.f277a;
                }
            };
            rVar.i0(M6);
        }
        rVar.q(false);
        x4.f.g(yVar, aVar, cVar, aVar2, cVar2, (oc.f) M6, rVar, 0);
        rVar.q(false);
    }

    @Override // k5.a
    public String getKey() {
        return i7.b.x(this);
    }
}
