package androidx.compose.animation;

import ac.o;
import b0.l0;
import java.util.LinkedHashMap;
import java.util.Map;
import m0.d1;
import m0.l;
import m0.l1;
import m0.r;
import m0.r1;
import m0.t2;
import m0.x1;
import m0.z;
import oc.c;
import oc.e;
import pc.j;
import u.a0;
import u.b0;
import u.f0;
import u.g0;
import u.h0;
import u.o0;
import u.p;
import u.s;
import u.v;
import u.w;
import u0.d;
import v.e1;
import v.g1;
import v.i1;
import v.y0;
import x1.h;
import x1.i;
import y0.k;
import y0.n;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:120:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(e1 e1Var, c cVar, n nVar, f0 f0Var, g0 g0Var, e eVar, d dVar, r rVar, int i10) {
        l1 l1Var;
        f0 f0Var2;
        boolean f10;
        Object M;
        g0 g0Var2;
        o0 o0Var;
        o0 o0Var2;
        e1 e1Var2;
        boolean z10;
        y0 y0Var;
        boolean h10;
        Object M2;
        f0 f0Var3;
        g0 g0Var3;
        boolean f11;
        Object M3;
        Object M4;
        int hashCode;
        d dVar2;
        boolean z11;
        x1 s10;
        l1 l1Var2 = e1Var.f6826d;
        rVar.Z(-891967166);
        int i11 = i10 | (rVar.f(e1Var) ? 4 : 2) | (rVar.h(cVar) ? 32 : 16) | (rVar.f(nVar) ? 256 : 128) | (rVar.f(f0Var) ? 2048 : 1024) | (rVar.f(g0Var) ? 16384 : 8192) | (rVar.h(eVar) ? 131072 : 65536) | 1572864;
        if ((4793491 & i11) == 4793490 && rVar.B()) {
            rVar.S();
        } else {
            if (((Boolean) cVar.invoke(l1Var2.getValue())).booleanValue() || ((Boolean) cVar.invoke(e1Var.c())).booleanValue() || e1Var.g() || e1Var.d()) {
                rVar.X(1787977937);
                int i12 = i11 & 14;
                int i13 = i12 | 48;
                int i14 = i13 & 14;
                boolean z12 = ((i14 ^ 6) > 4 && rVar.f(e1Var)) || (i13 & 6) == 4;
                Object M5 = rVar.M();
                Object obj = l.f4646a;
                if (z12 || M5 == obj) {
                    M5 = e1Var.c();
                    rVar.i0(M5);
                }
                if (e1Var.g()) {
                    M5 = e1Var.c();
                }
                rVar.X(-466616829);
                v b2 = b(e1Var, cVar, M5, rVar);
                rVar.q(false);
                Object value = l1Var2.getValue();
                rVar.X(-466616829);
                v b10 = b(e1Var, cVar, value, rVar);
                rVar.q(false);
                int i15 = i14 | 3072;
                int i16 = g1.f6851a;
                int i17 = (i15 & 14) ^ 6;
                boolean z13 = (i17 > 4 && rVar.f(e1Var)) || (i15 & 6) == 4;
                Object M6 = rVar.M();
                if (z13 || M6 == obj) {
                    M6 = new e1(new x4.l(b2), e1Var, e1Var.f6825c + " > EnterExitTransition");
                    rVar.i0(M6);
                }
                e1 e1Var3 = (e1) M6;
                boolean f12 = ((i17 > 4 && rVar.f(e1Var)) || (i15 & 6) == 4) | rVar.f(e1Var3);
                Object M7 = rVar.M();
                if (f12 || M7 == obj) {
                    M7 = new l0(10, e1Var, e1Var3);
                    rVar.i0(M7);
                }
                z.d(e1Var3, (c) M7, rVar);
                if (e1Var.g()) {
                    e1Var3.k(b2, b10);
                } else {
                    e1Var3.l(b10);
                    e1Var3.f6833k.setValue(Boolean.FALSE);
                }
                Object u10 = z.u(eVar, rVar);
                Object c3 = e1Var3.c();
                l1 l1Var3 = e1Var3.f6826d;
                Object invoke = eVar.invoke(c3, l1Var3.getValue());
                boolean f13 = rVar.f(e1Var3) | rVar.f(u10);
                Object M8 = rVar.M();
                if (f13 || M8 == obj) {
                    M8 = new c0.c(e1Var3, u10, (fc.d) null, 7);
                    rVar.i0(M8);
                }
                e eVar2 = (e) M8;
                Object M9 = rVar.M();
                if (M9 == obj) {
                    M9 = z.s(invoke);
                    rVar.i0(M9);
                }
                d1 d1Var = (d1) M9;
                boolean h11 = rVar.h(eVar2);
                Object M10 = rVar.M();
                if (h11 || M10 == obj) {
                    M10 = new t2(eVar2, d1Var, null, 0);
                    rVar.i0(M10);
                }
                z.f(o.f277a, rVar, (e) M10);
                Object c7 = e1Var3.c();
                v vVar = v.f6647i;
                if (c7 == vVar && l1Var3.getValue() == vVar && ((Boolean) d1Var.getValue()).booleanValue()) {
                    rVar.X(1790256282);
                    z11 = false;
                    rVar.q(false);
                    dVar2 = dVar;
                } else {
                    rVar.X(1788869559);
                    boolean z14 = i12 == 4;
                    Object M11 = rVar.M();
                    if (z14 || M11 == obj) {
                        M11 = new s(e1Var3);
                        rVar.i0(M11);
                    }
                    s sVar = (s) M11;
                    x4.s sVar2 = b0.f6566a;
                    boolean f14 = rVar.f(e1Var3);
                    Object M12 = rVar.M();
                    if (f14 || M12 == obj) {
                        M12 = z.s(f0Var);
                        rVar.i0(M12);
                    }
                    d1 d1Var2 = (d1) M12;
                    Object c10 = e1Var3.c();
                    Object value2 = l1Var3.getValue();
                    v vVar2 = v.f6646h;
                    if (c10 == value2 && e1Var3.c() == vVar2) {
                        if (e1Var3.g()) {
                            d1Var2.setValue(f0Var);
                        } else {
                            d1Var2.setValue(f0.f6596b);
                        }
                    } else if (l1Var3.getValue() == vVar2) {
                        o0 o0Var3 = ((f0) d1Var2.getValue()).f6597a;
                        o0 o0Var4 = f0Var.f6597a;
                        h0 h0Var = o0Var4.f6626a;
                        if (h0Var == null) {
                            h0Var = o0Var3.f6626a;
                        }
                        Map map = o0Var3.f6628c;
                        Map map2 = o0Var4.f6628c;
                        j.e(map, "<this>");
                        j.e(map2, "map");
                        l1Var = l1Var3;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                        linkedHashMap.putAll(map2);
                        d1Var2.setValue(new f0(new o0(h0Var, (u.l0) null, linkedHashMap, 16)));
                        f0Var2 = (f0) d1Var2.getValue();
                        f10 = rVar.f(e1Var3);
                        M = rVar.M();
                        if (!f10 || M == obj) {
                            M = z.s(g0Var);
                            rVar.i0(M);
                        }
                        d1 d1Var3 = (d1) M;
                        if (e1Var3.c() == l1Var.getValue() || e1Var3.c() != vVar2) {
                            if (l1Var.getValue() != vVar2) {
                                o0 o0Var5 = ((g0) d1Var3.getValue()).f6601a;
                                o0 o0Var6 = g0Var.f6601a;
                                h0 h0Var2 = o0Var6.f6626a;
                                if (h0Var2 == null) {
                                    h0Var2 = o0Var5.f6626a;
                                }
                                boolean z15 = o0Var6.f6627b || o0Var5.f6627b;
                                Map map3 = o0Var5.f6628c;
                                Map map4 = o0Var6.f6628c;
                                j.e(map3, "<this>");
                                j.e(map4, "map");
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap(map3);
                                linkedHashMap2.putAll(map4);
                                d1Var3.setValue(new g0(new o0(h0Var2, (u.l0) null, z15, linkedHashMap2)));
                            }
                        } else if (e1Var3.g()) {
                            d1Var3.setValue(g0Var);
                        } else {
                            d1Var3.setValue(g0.f6599b);
                        }
                        g0Var2 = (g0) d1Var3.getValue();
                        o0Var = f0Var2.f6597a;
                        o0Var2 = g0Var2.f6601a;
                        rVar.X(-821278096);
                        rVar.q(false);
                        rVar.X(-821099041);
                        rVar.q(false);
                        rVar.X(-820883777);
                        rVar.q(false);
                        if (o0Var.f6626a == null || o0Var2.f6626a != null) {
                            e1Var2 = e1Var3;
                            z10 = false;
                            rVar.X(-675252433);
                            rVar.q(false);
                            y0Var = null;
                        } else {
                            rVar.X(-675389204);
                            x4.s sVar3 = i1.f6863a;
                            Object M13 = rVar.M();
                            if (M13 == obj) {
                                M13 = "Built-in alpha";
                                rVar.i0("Built-in alpha");
                            }
                            e1Var2 = e1Var3;
                            y0Var = g1.a(e1Var2, sVar3, (String) M13, rVar, 384, 0);
                            z10 = false;
                            rVar.q(false);
                        }
                        rVar.X(-675057009);
                        rVar.q(z10);
                        rVar.X(-674835793);
                        rVar.q(z10);
                        h10 = rVar.h(y0Var) | rVar.f(f0Var2) | rVar.f(g0Var2) | rVar.h(null) | rVar.f(e1Var2) | rVar.h(null);
                        M2 = rVar.M();
                        if (!h10 || M2 == obj) {
                            f0Var3 = f0Var2;
                            M2 = new w(y0Var, null, e1Var2, f0Var3, g0Var2, null);
                            g0Var3 = g0Var2;
                            rVar.i0(M2);
                        } else {
                            f0Var3 = f0Var2;
                            g0Var3 = g0Var2;
                        }
                        w wVar = (w) M2;
                        boolean g8 = rVar.g(true);
                        u.z zVar = u.z.f6662g;
                        f11 = g8 | rVar.f(zVar);
                        M3 = rVar.M();
                        if (!f11 || M3 == obj) {
                            M3 = new a0(true, zVar);
                            rVar.i0(M3);
                        }
                        k kVar = k.f8442a;
                        n d10 = androidx.compose.ui.graphics.a.a(kVar, (c) M3).d(new EnterExitTransitionElement(e1Var2, f0Var3, g0Var3, zVar, wVar));
                        rVar.X(1581766416);
                        rVar.q(false);
                        n d11 = nVar.d(d10.d(kVar));
                        M4 = rVar.M();
                        if (M4 == obj) {
                            M4 = new u.o(sVar);
                            rVar.i0(M4);
                        }
                        u.o oVar = (u.o) M4;
                        hashCode = Long.hashCode(rVar.T);
                        r1 l10 = rVar.l();
                        n o7 = uc.e.o(rVar, d11);
                        x1.j.f8084f.getClass();
                        oc.a aVar = i.f8076b;
                        rVar.b0();
                        if (rVar.S) {
                            rVar.l0();
                        } else {
                            rVar.k(aVar);
                        }
                        z.w(oVar, rVar, i.f8079e);
                        z.w(l10, rVar, i.f8078d);
                        h hVar = i.f8080f;
                        if (!rVar.S || !j.a(rVar.M(), Integer.valueOf(hashCode))) {
                            a4.d.p(hashCode, rVar, hashCode, hVar);
                        }
                        z.w(o7, rVar, i.f8077c);
                        dVar2 = dVar;
                        dVar2.b(sVar, rVar, 48);
                        rVar.q(true);
                        z11 = false;
                        rVar.q(false);
                    }
                    l1Var = l1Var3;
                    f0Var2 = (f0) d1Var2.getValue();
                    f10 = rVar.f(e1Var3);
                    M = rVar.M();
                    if (!f10) {
                    }
                    M = z.s(g0Var);
                    rVar.i0(M);
                    d1 d1Var32 = (d1) M;
                    if (e1Var3.c() == l1Var.getValue()) {
                    }
                    if (l1Var.getValue() != vVar2) {
                    }
                    g0Var2 = (g0) d1Var32.getValue();
                    o0Var = f0Var2.f6597a;
                    o0Var2 = g0Var2.f6601a;
                    rVar.X(-821278096);
                    rVar.q(false);
                    rVar.X(-821099041);
                    rVar.q(false);
                    rVar.X(-820883777);
                    rVar.q(false);
                    if (o0Var.f6626a == null || o0Var2.f6626a != null) {
                    }
                    rVar.X(-675057009);
                    rVar.q(z10);
                    rVar.X(-674835793);
                    rVar.q(z10);
                    h10 = rVar.h(y0Var) | rVar.f(f0Var2) | rVar.f(g0Var2) | rVar.h(null) | rVar.f(e1Var2) | rVar.h(null);
                    M2 = rVar.M();
                    if (h10) {
                    }
                    f0Var3 = f0Var2;
                    M2 = new w(y0Var, null, e1Var2, f0Var3, g0Var2, null);
                    g0Var3 = g0Var2;
                    rVar.i0(M2);
                    w wVar2 = (w) M2;
                    boolean g82 = rVar.g(true);
                    u.z zVar2 = u.z.f6662g;
                    f11 = g82 | rVar.f(zVar2);
                    M3 = rVar.M();
                    if (!f11) {
                    }
                    M3 = new a0(true, zVar2);
                    rVar.i0(M3);
                    k kVar2 = k.f8442a;
                    n d102 = androidx.compose.ui.graphics.a.a(kVar2, (c) M3).d(new EnterExitTransitionElement(e1Var2, f0Var3, g0Var3, zVar2, wVar2));
                    rVar.X(1581766416);
                    rVar.q(false);
                    n d112 = nVar.d(d102.d(kVar2));
                    M4 = rVar.M();
                    if (M4 == obj) {
                    }
                    u.o oVar2 = (u.o) M4;
                    hashCode = Long.hashCode(rVar.T);
                    r1 l102 = rVar.l();
                    n o72 = uc.e.o(rVar, d112);
                    x1.j.f8084f.getClass();
                    oc.a aVar2 = i.f8076b;
                    rVar.b0();
                    if (rVar.S) {
                    }
                    z.w(oVar2, rVar, i.f8079e);
                    z.w(l102, rVar, i.f8078d);
                    h hVar2 = i.f8080f;
                    if (!rVar.S) {
                    }
                    a4.d.p(hashCode, rVar, hashCode, hVar2);
                    z.w(o72, rVar, i.f8077c);
                    dVar2 = dVar;
                    dVar2.b(sVar, rVar, 48);
                    rVar.q(true);
                    z11 = false;
                    rVar.q(false);
                }
                rVar.q(z11);
                s10 = rVar.s();
                if (s10 == null) {
                    s10.f4809d = new p(e1Var, cVar, nVar, f0Var, g0Var, eVar, dVar2, i10);
                    return;
                }
                return;
            }
            rVar.X(1790262234);
            rVar.q(false);
        }
        dVar2 = dVar;
        s10 = rVar.s();
        if (s10 == null) {
        }
    }

    public static final v b(e1 e1Var, c cVar, Object obj, r rVar) {
        rVar.T(-902048200, 0, e1Var, null);
        boolean g8 = e1Var.g();
        v vVar = v.f6645g;
        v vVar2 = v.f6647i;
        v vVar3 = v.f6646h;
        if (g8) {
            rVar.X(2101296683);
            rVar.q(false);
            if (((Boolean) cVar.invoke(obj)).booleanValue()) {
                vVar = vVar3;
            } else if (((Boolean) cVar.invoke(e1Var.c())).booleanValue()) {
                vVar = vVar2;
            }
        } else {
            rVar.X(2101530516);
            Object M = rVar.M();
            if (M == l.f4646a) {
                M = z.s(Boolean.FALSE);
                rVar.i0(M);
            }
            d1 d1Var = (d1) M;
            if (((Boolean) cVar.invoke(e1Var.c())).booleanValue()) {
                d1Var.setValue(Boolean.TRUE);
            }
            if (((Boolean) cVar.invoke(obj)).booleanValue()) {
                vVar = vVar3;
            } else if (((Boolean) d1Var.getValue()).booleanValue()) {
                vVar = vVar2;
            }
            rVar.q(false);
        }
        rVar.q(false);
        return vVar;
    }
}
