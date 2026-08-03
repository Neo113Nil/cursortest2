package f0;

import b0.s0;
import bc.m;
import bc.s;
import bc.v;
import com.onesignal.inAppMessages.internal.display.impl.a;
import d8.t;
import f1.q;
import h2.d0;
import h2.e0;
import h2.h0;
import h2.n;
import h2.o;
import java.util.ArrayList;
import java.util.List;
import pc.j;
import pc.k;
import s2.l;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f extends k implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2204g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g f2205h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, int i10) {
        super(1);
        this.f2204g = i10;
        this.f2205h = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0287  */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // oc.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        s2.c cVar;
        e0 e0Var;
        float f10;
        int i10;
        int i11;
        int i12;
        e1.c cVar2;
        int g8;
        e0 e0Var2;
        switch (this.f2204g) {
            case 0:
                List list = (List) obj;
                g gVar = this.f2205h;
                d r02 = gVar.r0();
                h0 d10 = h0.d(gVar.f2207v, q.f2283h, 0L, 0L, 0, 0L, 16777214);
                l lVar = r02.f2198o;
                if (lVar != null && (cVar = r02.f2192i) != null) {
                    h2.e eVar = new h2.e(r02.f2184a);
                    if (r02.f2193j != null && r02.f2197n != null) {
                        long a6 = s2.a.a(r02.f2199p, 0, 0, 0, 0, 10);
                        int i13 = r02.f2189f;
                        boolean z10 = r02.f2188e;
                        int i14 = r02.f2187d;
                        k2.d dVar = r02.f2186c;
                        v vVar = v.f1067g;
                        d0 d0Var = new d0(eVar, d10, vVar, i13, z10, i14, cVar, lVar, dVar, a6);
                        t tVar = new t(eVar, d10, vVar, cVar, dVar);
                        int i15 = r02.f2189f;
                        int i16 = r02.f2187d == 2 ? 2 : 1;
                        s0 s0Var = new s0();
                        s0Var.f890c = tVar;
                        s0Var.f888a = i15;
                        if (s2.a.j(a6) != 0 || s2.a.i(a6) != 0) {
                            m2.a.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
                        }
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = (ArrayList) tVar.f1820e;
                        int size = arrayList2.size();
                        int i17 = 0;
                        float f11 = 0.0f;
                        int i18 = 0;
                        while (true) {
                            if (i17 < size) {
                                o oVar = (o) arrayList2.get(i17);
                                o2.d dVar2 = oVar.f2693a;
                                int h10 = s2.a.h(a6);
                                if (s2.a.c(a6)) {
                                    f10 = 0.0f;
                                    g8 = s2.a.g(a6) - ((int) Math.ceil(f11));
                                    if (g8 < 0) {
                                        g8 = 0;
                                    }
                                } else {
                                    f10 = 0.0f;
                                    g8 = s2.a.g(a6);
                                }
                                h2.a aVar = new h2.a(dVar2, s0Var.f888a - i18, i16, s2.b.b(h10, g8, 5));
                                float b2 = aVar.b() + f11;
                                i2.k kVar = aVar.f2609d;
                                int i19 = i18 + kVar.f3138f;
                                n nVar = new n(aVar, oVar.f2694b, oVar.f2695c, i18, i19, f11, b2);
                                i10 = i19;
                                arrayList.add(nVar);
                                if (!kVar.f3136d && (i10 != s0Var.f888a || i17 == bc.n.K((ArrayList) ((t) s0Var.f890c).f1820e))) {
                                    i17++;
                                    i18 = i10;
                                    f11 = b2;
                                }
                            } else {
                                f10 = 0.0f;
                                i10 = i18;
                            }
                        }
                        s0Var.f889b = i10;
                        s0Var.f892e = arrayList;
                        ArrayList arrayList3 = new ArrayList(arrayList.size());
                        int size2 = arrayList.size();
                        int i20 = 0;
                        while (i20 < size2) {
                            ?? r12 = ((n) arrayList.get(i20)).f2686a.f2611f;
                            ArrayList arrayList4 = new ArrayList(r12.size());
                            int size3 = r12.size();
                            int i21 = 0;
                            while (i21 < size3) {
                                e1.c cVar3 = (e1.c) r12.get(i21);
                                if (cVar3 != null) {
                                    i11 = size2;
                                    i12 = i20;
                                    cVar2 = cVar3.e((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(r11.f2691f) & 4294967295L));
                                } else {
                                    i11 = size2;
                                    i12 = i20;
                                    cVar2 = null;
                                }
                                arrayList4.add(cVar2);
                                i21++;
                                size2 = i11;
                                i20 = i12;
                            }
                            s.Q(arrayList4, arrayList3);
                            i20++;
                        }
                        if (arrayList3.size() < ((List) ((t) s0Var.f890c).f1817b).size()) {
                            int size4 = ((List) ((t) s0Var.f890c).f1817b).size() - arrayList3.size();
                            ArrayList arrayList5 = new ArrayList(size4);
                            for (int i22 = 0; i22 < size4; i22++) {
                                arrayList5.add(null);
                            }
                            arrayList3 = m.a0(arrayList3, arrayList5);
                        }
                        s0Var.f891d = arrayList3;
                        e0Var = new e0(d0Var, s0Var, r02.f2195l);
                        if (e0Var == null) {
                            list.add(e0Var);
                            e0Var2 = e0Var;
                        } else {
                            e0Var2 = null;
                        }
                        break;
                    }
                }
                e0Var = null;
                if (e0Var == null) {
                }
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                String str = ((h2.e) obj).f2648h;
                g gVar2 = this.f2205h;
                e eVar2 = gVar2.E;
                if (eVar2 == null) {
                    e eVar3 = new e(gVar2.f2206u, str);
                    d dVar3 = new d(str, gVar2.f2207v, gVar2.f2208w, gVar2.f2209x, gVar2.f2210y, gVar2.f2211z, gVar2.A);
                    dVar3.b(gVar2.r0().f2192i);
                    eVar3.f2203d = dVar3;
                    gVar2.E = eVar3;
                } else if (!j.a(str, eVar2.f2201b)) {
                    eVar2.f2201b = str;
                    d dVar4 = eVar2.f2203d;
                    if (dVar4 != null) {
                        h0 h0Var = gVar2.f2207v;
                        k2.d dVar5 = gVar2.f2208w;
                        int i23 = gVar2.f2209x;
                        boolean z11 = gVar2.f2210y;
                        int i24 = gVar2.f2211z;
                        int i25 = gVar2.A;
                        dVar4.f2184a = str;
                        dVar4.f2185b = h0Var;
                        dVar4.f2186c = dVar5;
                        dVar4.f2187d = i23;
                        dVar4.f2188e = z11;
                        dVar4.f2189f = i24;
                        dVar4.f2190g = i25;
                        dVar4.a();
                    }
                }
                x1.f.o(gVar2);
                x1.f.n(gVar2);
                x1.f.m(gVar2);
                break;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                g gVar3 = this.f2205h;
                e eVar4 = gVar3.E;
                if (eVar4 == null) {
                    break;
                } else {
                    eVar4.f2202c = booleanValue;
                    x1.f.o(gVar3);
                    x1.f.n(gVar3);
                    x1.f.m(gVar3);
                    break;
                }
        }
        return Boolean.TRUE;
    }
}
