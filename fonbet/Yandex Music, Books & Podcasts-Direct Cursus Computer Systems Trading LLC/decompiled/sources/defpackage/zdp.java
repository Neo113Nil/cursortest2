package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class zdp {
    public final /* synthetic */ int a;

    public /* synthetic */ zdp(int i) {
        this.a = i;
    }

    public final ydp a(qep qepVar) {
        xdp o;
        xdp xdpVar;
        boolean z;
        ydp a;
        switch (this.a) {
            case 0:
                return new ydp(qepVar.j().a(qepVar.j().c), qepVar.i().a(qepVar.i().d), qepVar.e() == iu6.a);
            case 1:
                return ocg.l(qepVar, b2c.v);
            case 2:
                return ocg.l(qepVar, hs4.l);
            default:
                ydp h = qepVar.h();
                if (h == null) {
                    return ocg.l(qepVar, b2c.v);
                }
                xdp xdpVar2 = h.b;
                xdp xdpVar3 = h.a;
                if (qepVar.a()) {
                    xdpVar = ocg.o(qepVar, qepVar.j(), xdpVar3);
                    o = xdpVar2;
                    xdpVar2 = xdpVar3;
                    xdpVar3 = xdpVar;
                } else {
                    o = ocg.o(qepVar, qepVar.i(), xdpVar2);
                    xdpVar = o;
                }
                if (Intrinsics.d(xdpVar, xdpVar2)) {
                    return h;
                }
                ydp ydpVar = new ydp(xdpVar3, o, qepVar.e() == iu6.a || (qepVar.e() == iu6.c && xdpVar3.b > o.b));
                boolean z2 = false;
                xdp xdpVar4 = ydpVar.a;
                long j = xdpVar4.c;
                xdp xdpVar5 = ydpVar.b;
                if (j == xdpVar5.c) {
                    if (xdpVar4.b == xdpVar5.b) {
                        z = true;
                    }
                    z = false;
                } else {
                    boolean z3 = ydpVar.c;
                    if ((z3 ? xdpVar4 : xdpVar5).b == 0) {
                        if (z3) {
                            xdpVar4 = xdpVar5;
                        }
                        if (qepVar.c().f.a.a.b.length() == xdpVar4.b) {
                            tqn tqnVar = new tqn();
                            tqnVar.a = true;
                            qepVar.g(new ln4(tqnVar, 3));
                            z = tqnVar.a;
                        }
                    }
                    z = false;
                }
                if (z) {
                    String str = qepVar.b().f.a.a.b;
                    if (qepVar.f() <= 1 && qepVar.h() != null) {
                        if (!(str.length() == 0)) {
                            idp b = qepVar.b();
                            String str2 = b.f.a.a.b;
                            int i = b.c;
                            int length = str2.length();
                            if (i == 0) {
                                int L = qgg.L(0, str2);
                                a = qepVar.a() ? ydp.a(ydpVar, ocg.r(ydpVar.a, b, L), null, true, 2) : ydp.a(ydpVar, null, ocg.r(ydpVar.b, b, L), false, 1);
                            } else if (i == length) {
                                int M = qgg.M(length, str2);
                                a = qepVar.a() ? ydp.a(ydpVar, ocg.r(ydpVar.a, b, M), null, false, 2) : ydp.a(ydpVar, null, ocg.r(ydpVar.b, b, M), true, 1);
                            } else {
                                ydp h2 = qepVar.h();
                                if (h2 != null && h2.c) {
                                    z2 = true;
                                }
                                int M2 = qepVar.a() ^ z2 ? qgg.M(i, str2) : qgg.L(i, str2);
                                a = qepVar.a() ? ydp.a(ydpVar, ocg.r(ydpVar.a, b, M2), null, z2, 2) : ydp.a(ydpVar, null, ocg.r(ydpVar.b, b, M2), z2, 1);
                            }
                            return a;
                        }
                    }
                }
                return ydpVar;
        }
    }
}
