package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class jc8 implements u1f {
    public Integer a;
    public Integer b;

    /* JADX WARN: Code restructure failed: missing block: B:557:0x0856, code lost:
    
        if (r4 == null) goto L650;
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x07f1, code lost:
    
        if (r4 == null) goto L619;
     */
    /* JADX WARN: Code restructure failed: missing block: B:564:0x07ab, code lost:
    
        if (r4 == null) goto L597;
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x0765, code lost:
    
        if (r4 == null) goto L575;
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x06e8, code lost:
    
        if (r4 == null) goto L529;
     */
    /* JADX WARN: Code restructure failed: missing block: B:582:0x0690, code lost:
    
        if (r4 == null) goto L500;
     */
    /* JADX WARN: Code restructure failed: missing block: B:586:0x061e, code lost:
    
        if (r4 == null) goto L466;
     */
    /* JADX WARN: Code restructure failed: missing block: B:594:0x0570, code lost:
    
        if (r4 == null) goto L412;
     */
    /* JADX WARN: Code restructure failed: missing block: B:596:0x052a, code lost:
    
        if (r4 == null) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:604:0x048c, code lost:
    
        if (r4 == null) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:609:0x0418, code lost:
    
        if (r4 == null) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:611:0x03d2, code lost:
    
        if (r4 == null) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:613:0x0368, code lost:
    
        if (r4 == null) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:618:0x0310, code lost:
    
        if (r4 == null) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:620:0x02ca, code lost:
    
        if (r4 == null) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:622:0x0284, code lost:
    
        if (r4 == null) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:624:0x023e, code lost:
    
        if (r4 == null) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:631:0x0192, code lost:
    
        if (r4 == null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:639:0x0128, code lost:
    
        if (r4 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:646:0x008d, code lost:
    
        if (r4 == null) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r3v117 */
    /* JADX WARN: Type inference failed for: r3v118 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v120 */
    /* JADX WARN: Type inference failed for: r3v121 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v137 */
    /* JADX WARN: Type inference failed for: r3v138 */
    /* JADX WARN: Type inference failed for: r3v146 */
    /* JADX WARN: Type inference failed for: r3v147 */
    /* JADX WARN: Type inference failed for: r3v153 */
    /* JADX WARN: Type inference failed for: r3v154 */
    /* JADX WARN: Type inference failed for: r3v168 */
    /* JADX WARN: Type inference failed for: r3v169 */
    /* JADX WARN: Type inference failed for: r3v171 */
    /* JADX WARN: Type inference failed for: r3v172 */
    /* JADX WARN: Type inference failed for: r3v174 */
    /* JADX WARN: Type inference failed for: r3v175 */
    /* JADX WARN: Type inference failed for: r3v186 */
    /* JADX WARN: Type inference failed for: r3v189 */
    /* JADX WARN: Type inference failed for: r3v192 */
    /* JADX WARN: Type inference failed for: r3v198 */
    /* JADX WARN: Type inference failed for: r3v202 */
    /* JADX WARN: Type inference failed for: r3v207 */
    /* JADX WARN: Type inference failed for: r3v216 */
    /* JADX WARN: Type inference failed for: r3v219 */
    /* JADX WARN: Type inference failed for: r3v224 */
    /* JADX WARN: Type inference failed for: r3v228 */
    /* JADX WARN: Type inference failed for: r3v231 */
    /* JADX WARN: Type inference failed for: r3v234 */
    /* JADX WARN: Type inference failed for: r3v238 */
    /* JADX WARN: Type inference failed for: r3v241 */
    /* JADX WARN: Type inference failed for: r3v244 */
    /* JADX WARN: Type inference failed for: r3v247 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v253 */
    /* JADX WARN: Type inference failed for: r3v258 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v261 */
    /* JADX WARN: Type inference failed for: r3v266 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r3v61 */
    /* JADX WARN: Type inference failed for: r3v62 */
    /* JADX WARN: Type inference failed for: r3v64 */
    /* JADX WARN: Type inference failed for: r3v65 */
    /* JADX WARN: Type inference failed for: r3v67 */
    /* JADX WARN: Type inference failed for: r3v68 */
    /* JADX WARN: Type inference failed for: r3v74 */
    /* JADX WARN: Type inference failed for: r3v75 */
    /* JADX WARN: Type inference failed for: r3v83 */
    /* JADX WARN: Type inference failed for: r3v84 */
    /* JADX WARN: Type inference failed for: r3v86 */
    /* JADX WARN: Type inference failed for: r3v87 */
    /* JADX WARN: Type inference failed for: r3v98 */
    /* JADX WARN: Type inference failed for: r3v99 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(jc8 jc8Var, xzb xzbVar, xzb xzbVar2) {
        ?? r3;
        ?? r32;
        ?? r33;
        ?? r34;
        ?? r35;
        ?? r36;
        ?? r37;
        ?? r38;
        ?? r39;
        ?? r310;
        ?? r311;
        ?? r312;
        ?? r313;
        ?? r314;
        ?? r315;
        ?? r316;
        ?? r317;
        ?? r318;
        ?? r319;
        ?? r2;
        if (jc8Var != null) {
            if (!(this instanceof hb8)) {
                if (this instanceof fb8) {
                    fb8 fb8Var = (fb8) this;
                    dp8 d = jc8Var.d();
                    return fb8Var.c.F(d instanceof i19 ? (i19) d : null, xzbVar, xzbVar2);
                }
                if (this instanceof rb8) {
                    rb8 rb8Var = (rb8) this;
                    dp8 d2 = jc8Var.d();
                    return rb8Var.c.F(d2 instanceof xq9 ? (xq9) d2 : null, xzbVar, xzbVar2);
                }
                if (this instanceof mb8) {
                    mb8 mb8Var = (mb8) this;
                    dp8 d3 = jc8Var.d();
                    return mb8Var.c.F(d3 instanceof ri9 ? (ri9) d3 : null, xzbVar, xzbVar2);
                }
                if (this instanceof cb8) {
                    cb8 cb8Var = (cb8) this;
                    dp8 d4 = jc8Var.d();
                    return cb8Var.c.F(d4 instanceof jt8 ? (jt8) d4 : null, xzbVar, xzbVar2);
                }
                if (this instanceof gb8) {
                    gb8 gb8Var = (gb8) this;
                    dp8 d5 = jc8Var.d();
                    return gb8Var.c.F(d5 instanceof w19 ? (w19) d5 : null, xzbVar, xzbVar2);
                }
                if (this instanceof eb8) {
                    eb8 eb8Var = (eb8) this;
                    dp8 d6 = jc8Var.d();
                    return eb8Var.c.F(d6 instanceof s09 ? (s09) d6 : null, xzbVar, xzbVar2);
                }
                if (this instanceof kb8) {
                    kb8 kb8Var = (kb8) this;
                    dp8 d7 = jc8Var.d();
                    return kb8Var.c.F(d7 instanceof eb9 ? (eb9) d7 : null, xzbVar, xzbVar2);
                }
                if (this instanceof qb8) {
                    qb8 qb8Var = (qb8) this;
                    dp8 d8 = jc8Var.d();
                    return qb8Var.c.F(d8 instanceof vo9 ? (vo9) d8 : null, xzbVar, xzbVar2);
                }
                if (this instanceof ob8) {
                    ob8 ob8Var = (ob8) this;
                    dp8 d9 = jc8Var.d();
                    return ob8Var.c.F(d9 instanceof dm9 ? (dm9) d9 : null, xzbVar, xzbVar2);
                }
                if (this instanceof db8) {
                    db8 db8Var = (db8) this;
                    dp8 d10 = jc8Var.d();
                    return db8Var.c.F(d10 instanceof yu8 ? (yu8) d10 : null, xzbVar, xzbVar2);
                }
                if (this instanceof ib8) {
                    ib8 ib8Var = (ib8) this;
                    dp8 d11 = jc8Var.d();
                    return ib8Var.c.F(d11 instanceof k39 ? (k39) d11 : null, xzbVar, xzbVar2);
                }
                if (this instanceof nb8) {
                    nb8 nb8Var = (nb8) this;
                    dp8 d12 = jc8Var.d();
                    return nb8Var.c.F(d12 instanceof zk9 ? (zk9) d12 : null, xzbVar, xzbVar2);
                }
                if (this instanceof pb8) {
                    pb8 pb8Var = (pb8) this;
                    dp8 d13 = jc8Var.d();
                    return pb8Var.c.F(d13 instanceof jo9 ? (jo9) d13 : null, xzbVar, xzbVar2);
                }
                if (this instanceof jb8) {
                    jb8 jb8Var = (jb8) this;
                    dp8 d14 = jc8Var.d();
                    return jb8Var.c.F(d14 instanceof l49 ? (l49) d14 : null, xzbVar, xzbVar2);
                }
                if (this instanceof lb8) {
                    lb8 lb8Var = (lb8) this;
                    dp8 d15 = jc8Var.d();
                    return lb8Var.c.F(d15 instanceof ei9 ? (ei9) d15 : null, xzbVar, xzbVar2);
                }
                if (!(this instanceof sb8)) {
                    b6e.s();
                    return false;
                }
                sb8 sb8Var = (sb8) this;
                dp8 d16 = jc8Var.d();
                return sb8Var.c.F(d16 instanceof pz9 ? (pz9) d16 : null, xzbVar, xzbVar2);
            }
            hb8 hb8Var = (hb8) this;
            dp8 d17 = jc8Var.d();
            i29 i29Var = d17 instanceof i29 ? (i29) d17 : null;
            if (i29Var != null) {
                i29 i29Var2 = hb8Var.c;
                tc8 tc8Var = i29Var2.a;
                tc8 tc8Var2 = i29Var.a;
                if (tc8Var != null ? tc8Var.a(tc8Var2, xzbVar, xzbVar2) : tc8Var2 == null) {
                    bd8 bd8Var = i29Var2.b;
                    bd8 bd8Var2 = i29Var.b;
                    if ((bd8Var != null ? bd8Var.a(bd8Var2, xzbVar, xzbVar2) : bd8Var2 == null) && i29Var2.c.a(i29Var.c, xzbVar, xzbVar2)) {
                        List list = i29Var2.d;
                        List list2 = i29Var.d;
                        if (list != null) {
                            if (list2 != null) {
                                if (list.size() == list2.size()) {
                                    int i = 0;
                                    for (Object obj : list) {
                                        int i2 = i + 1;
                                        if (i < 0) {
                                            u75.n();
                                            throw null;
                                        }
                                        if (((bd8) obj).a((bd8) list2.get(i), xzbVar, xzbVar2)) {
                                            i = i2;
                                        }
                                    }
                                    r3 = true;
                                }
                                r3 = false;
                                break;
                            }
                        }
                        if (r3 != false) {
                            szb szbVar = i29Var2.e;
                            om8 om8Var = szbVar != null ? (om8) szbVar.a(xzbVar) : null;
                            szb szbVar2 = i29Var.e;
                            if (om8Var == (szbVar2 != null ? (om8) szbVar2.a(xzbVar2) : null)) {
                                szb szbVar3 = i29Var2.f;
                                pm8 pm8Var = szbVar3 != null ? (pm8) szbVar3.a(xzbVar) : null;
                                szb szbVar4 = i29Var.f;
                                if (pm8Var == (szbVar4 != null ? (pm8) szbVar4.a(xzbVar2) : null)) {
                                    if ((((Number) i29Var2.g.a(xzbVar)).doubleValue() == ((Number) i29Var.g.a(xzbVar2)).doubleValue()) != false) {
                                        List list3 = i29Var2.h;
                                        List list4 = i29Var.h;
                                        if (list3 != null) {
                                            if (list4 != null) {
                                                if (list3.size() == list4.size()) {
                                                    int i3 = 0;
                                                    for (Object obj2 : list3) {
                                                        int i4 = i3 + 1;
                                                        if (i3 < 0) {
                                                            u75.n();
                                                            throw null;
                                                        }
                                                        if (((bn8) obj2).a((bn8) list4.get(i3), xzbVar, xzbVar2)) {
                                                            i3 = i4;
                                                        }
                                                    }
                                                    r32 = true;
                                                }
                                                r32 = false;
                                                break;
                                            }
                                        }
                                        if (r32 != false) {
                                            zx8 zx8Var = i29Var2.i;
                                            zx8 zx8Var2 = i29Var.i;
                                            if (zx8Var != null ? zx8Var.a(zx8Var2, xzbVar, xzbVar2) : zx8Var2 == null) {
                                                do8 do8Var = i29Var2.j;
                                                do8 do8Var2 = i29Var.j;
                                                if (do8Var != null ? do8Var.a(do8Var2, xzbVar, xzbVar2) : do8Var2 == null) {
                                                    List list5 = i29Var2.k;
                                                    List list6 = i29Var.k;
                                                    if (list5 != null) {
                                                        if (list6 != null) {
                                                            if (list5.size() == list6.size()) {
                                                                int i5 = 0;
                                                                for (Object obj3 : list5) {
                                                                    int i6 = i5 + 1;
                                                                    if (i5 < 0) {
                                                                        u75.n();
                                                                        throw null;
                                                                    }
                                                                    if (((mo8) obj3).a((mo8) list6.get(i5), xzbVar, xzbVar2)) {
                                                                        i5 = i6;
                                                                    }
                                                                }
                                                                r33 = true;
                                                            }
                                                            r33 = false;
                                                            break;
                                                        }
                                                    }
                                                    if (r33 != false) {
                                                        op8 op8Var = i29Var2.l;
                                                        op8 op8Var2 = i29Var.l;
                                                        if ((op8Var != null ? op8Var.a(op8Var2, xzbVar, xzbVar2) : op8Var2 == null) && ((Boolean) i29Var2.m.a(xzbVar)).booleanValue() == ((Boolean) i29Var.m.a(xzbVar2)).booleanValue()) {
                                                            szb szbVar5 = i29Var2.n;
                                                            Long l = szbVar5 != null ? (Long) szbVar5.a(xzbVar) : null;
                                                            szb szbVar6 = i29Var.n;
                                                            if (Intrinsics.d(l, szbVar6 != null ? (Long) szbVar6.a(xzbVar2) : null) && i29Var2.o.a(xzbVar) == i29Var.o.a(xzbVar2) && i29Var2.p.a(xzbVar) == i29Var.p.a(xzbVar2)) {
                                                                List list7 = i29Var2.q;
                                                                List list8 = i29Var.q;
                                                                if (list7 != null) {
                                                                    if (list8 != null) {
                                                                        if (list7.size() == list8.size()) {
                                                                            int i7 = 0;
                                                                            for (Object obj4 : list7) {
                                                                                int i8 = i7 + 1;
                                                                                if (i7 < 0) {
                                                                                    u75.n();
                                                                                    throw null;
                                                                                }
                                                                                if (((tw8) obj4).f((tw8) list8.get(i7), xzbVar, xzbVar2)) {
                                                                                    i7 = i8;
                                                                                }
                                                                            }
                                                                            r34 = true;
                                                                        }
                                                                        r34 = false;
                                                                        break;
                                                                    }
                                                                }
                                                                if (r34 != false) {
                                                                    List list9 = i29Var2.r;
                                                                    List list10 = i29Var.r;
                                                                    if (list9 != null) {
                                                                        if (list10 != null) {
                                                                            if (list9.size() == list10.size()) {
                                                                                int i9 = 0;
                                                                                for (Object obj5 : list9) {
                                                                                    int i10 = i9 + 1;
                                                                                    if (i9 < 0) {
                                                                                        u75.n();
                                                                                        throw null;
                                                                                    }
                                                                                    if (((bd8) obj5).a((bd8) list10.get(i9), xzbVar, xzbVar2)) {
                                                                                        i9 = i10;
                                                                                    }
                                                                                }
                                                                                r35 = true;
                                                                            }
                                                                            r35 = false;
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (r35 != false) {
                                                                        List list11 = i29Var2.s;
                                                                        List list12 = i29Var.s;
                                                                        if (list11 != null) {
                                                                            if (list12 != null) {
                                                                                if (list11.size() == list12.size()) {
                                                                                    int i11 = 0;
                                                                                    for (Object obj6 : list11) {
                                                                                        int i12 = i11 + 1;
                                                                                        if (i11 < 0) {
                                                                                            u75.n();
                                                                                            throw null;
                                                                                        }
                                                                                        if (((rx8) obj6).a((rx8) list12.get(i11))) {
                                                                                            i11 = i12;
                                                                                        }
                                                                                    }
                                                                                    r36 = true;
                                                                                }
                                                                                r36 = false;
                                                                                break;
                                                                            }
                                                                        }
                                                                        if (r36 != false) {
                                                                            List list13 = i29Var2.t;
                                                                            List list14 = i29Var.t;
                                                                            if (list13 != null) {
                                                                                if (list14 != null) {
                                                                                    if (list13.size() == list14.size()) {
                                                                                        int i13 = 0;
                                                                                        for (Object obj7 : list13) {
                                                                                            int i14 = i13 + 1;
                                                                                            if (i13 < 0) {
                                                                                                u75.n();
                                                                                                throw null;
                                                                                            }
                                                                                            if (((hy8) obj7).a((hy8) list14.get(i13), xzbVar, xzbVar2)) {
                                                                                                i13 = i14;
                                                                                            }
                                                                                        }
                                                                                        r37 = true;
                                                                                    }
                                                                                    r37 = false;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            if (r37 != false) {
                                                                                wz8 wz8Var = i29Var2.u;
                                                                                wz8 wz8Var2 = i29Var.u;
                                                                                if (wz8Var != null ? wz8Var.a(wz8Var2, xzbVar, xzbVar2) : wz8Var2 == null) {
                                                                                    List list15 = i29Var2.v;
                                                                                    List list16 = i29Var.v;
                                                                                    if (list15 != null) {
                                                                                        if (list16 != null) {
                                                                                            if (list15.size() == list16.size()) {
                                                                                                int i15 = 0;
                                                                                                for (Object obj8 : list15) {
                                                                                                    int i16 = i15 + 1;
                                                                                                    if (i15 < 0) {
                                                                                                        u75.n();
                                                                                                        throw null;
                                                                                                    }
                                                                                                    if (((g09) obj8).a((g09) list16.get(i15))) {
                                                                                                        i15 = i16;
                                                                                                    }
                                                                                                }
                                                                                                r38 = true;
                                                                                            }
                                                                                            r38 = false;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    if (r38 != false && i29Var2.w.a(i29Var.w, xzbVar, xzbVar2) && ((Boolean) i29Var2.x.a(xzbVar)).booleanValue() == ((Boolean) i29Var.x.a(xzbVar2)).booleanValue()) {
                                                                                        List list17 = i29Var2.y;
                                                                                        List list18 = i29Var.y;
                                                                                        if (list17 != null) {
                                                                                            if (list18 != null) {
                                                                                                if (list17.size() == list18.size()) {
                                                                                                    int i17 = 0;
                                                                                                    for (Object obj9 : list17) {
                                                                                                        int i18 = i17 + 1;
                                                                                                        if (i17 < 0) {
                                                                                                            u75.n();
                                                                                                            throw null;
                                                                                                        }
                                                                                                        if (((bd8) obj9).a((bd8) list18.get(i17), xzbVar, xzbVar2)) {
                                                                                                            i17 = i18;
                                                                                                        }
                                                                                                    }
                                                                                                    r39 = true;
                                                                                                }
                                                                                                r39 = false;
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        if (r39 != false) {
                                                                                            List list19 = i29Var2.z;
                                                                                            List list20 = i29Var.z;
                                                                                            if (list19 != null) {
                                                                                                if (list20 != null) {
                                                                                                    if (list19.size() == list20.size()) {
                                                                                                        int i19 = 0;
                                                                                                        for (Object obj10 : list19) {
                                                                                                            int i20 = i19 + 1;
                                                                                                            if (i19 < 0) {
                                                                                                                u75.n();
                                                                                                                throw null;
                                                                                                            }
                                                                                                            if (((bd8) obj10).a((bd8) list20.get(i19), xzbVar, xzbVar2)) {
                                                                                                                i19 = i20;
                                                                                                            }
                                                                                                        }
                                                                                                        r310 = true;
                                                                                                    }
                                                                                                    r310 = false;
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            if (r310 != false && Intrinsics.d(i29Var2.A, i29Var.A) && Intrinsics.d(i29Var2.B.a(xzbVar), i29Var.B.a(xzbVar2))) {
                                                                                                w79 w79Var = i29Var2.C;
                                                                                                w79 w79Var2 = i29Var.C;
                                                                                                if (w79Var != null ? w79Var.a(w79Var2) : w79Var2 == null) {
                                                                                                    List list21 = i29Var2.D;
                                                                                                    List list22 = i29Var.D;
                                                                                                    if (list21 != null) {
                                                                                                        if (list22 != null) {
                                                                                                            if (list21.size() == list22.size()) {
                                                                                                                int i21 = 0;
                                                                                                                for (Object obj11 : list21) {
                                                                                                                    int i22 = i21 + 1;
                                                                                                                    if (i21 < 0) {
                                                                                                                        u75.n();
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                    if (((bd8) obj11).a((bd8) list22.get(i21), xzbVar, xzbVar2)) {
                                                                                                                        i21 = i22;
                                                                                                                    }
                                                                                                                }
                                                                                                                r311 = true;
                                                                                                            }
                                                                                                            r311 = false;
                                                                                                            break;
                                                                                                        }
                                                                                                    }
                                                                                                    if (r311 != false) {
                                                                                                        ix8 ix8Var = i29Var2.E;
                                                                                                        ix8 ix8Var2 = i29Var.E;
                                                                                                        if (ix8Var != null ? ix8Var.a(ix8Var2, xzbVar, xzbVar2) : ix8Var2 == null) {
                                                                                                            ix8 ix8Var3 = i29Var2.F;
                                                                                                            ix8 ix8Var4 = i29Var.F;
                                                                                                            if ((ix8Var3 != null ? ix8Var3.a(ix8Var4, xzbVar, xzbVar2) : ix8Var4 == null) && ((Number) i29Var2.G.a(xzbVar)).intValue() == ((Number) i29Var.G.a(xzbVar2)).intValue() && ((Boolean) i29Var2.H.a(xzbVar)).booleanValue() == ((Boolean) i29Var.H.a(xzbVar2)).booleanValue()) {
                                                                                                                List list23 = i29Var2.I;
                                                                                                                List list24 = i29Var.I;
                                                                                                                if (list23 != null) {
                                                                                                                    if (list24 != null) {
                                                                                                                        if (list23.size() == list24.size()) {
                                                                                                                            int i23 = 0;
                                                                                                                            for (Object obj12 : list23) {
                                                                                                                                int i24 = i23 + 1;
                                                                                                                                if (i23 < 0) {
                                                                                                                                    u75.n();
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                if (((bd8) obj12).a((bd8) list24.get(i23), xzbVar, xzbVar2)) {
                                                                                                                                    i23 = i24;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            r312 = true;
                                                                                                                        }
                                                                                                                        r312 = false;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                if (r312 != false) {
                                                                                                                    List list25 = i29Var2.J;
                                                                                                                    List list26 = i29Var.J;
                                                                                                                    if (list25 != null) {
                                                                                                                        if (list26 != null) {
                                                                                                                            if (list25.size() == list26.size()) {
                                                                                                                                int i25 = 0;
                                                                                                                                for (Object obj13 : list25) {
                                                                                                                                    int i26 = i25 + 1;
                                                                                                                                    if (i25 < 0) {
                                                                                                                                        u75.n();
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    if (((bd8) obj13).a((bd8) list26.get(i25), xzbVar, xzbVar2)) {
                                                                                                                                        i25 = i26;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                r313 = true;
                                                                                                                            }
                                                                                                                            r313 = false;
                                                                                                                            break;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    if (r313 != false) {
                                                                                                                        szb szbVar7 = i29Var2.K;
                                                                                                                        String str = szbVar7 != null ? (String) szbVar7.a(xzbVar) : null;
                                                                                                                        szb szbVar8 = i29Var.K;
                                                                                                                        if (Intrinsics.d(str, szbVar8 != null ? (String) szbVar8.a(xzbVar2) : null)) {
                                                                                                                            szb szbVar9 = i29Var2.L;
                                                                                                                            String str2 = szbVar9 != null ? (String) szbVar9.a(xzbVar) : null;
                                                                                                                            szb szbVar10 = i29Var.L;
                                                                                                                            if (Intrinsics.d(str2, szbVar10 != null ? (String) szbVar10.a(xzbVar2) : null)) {
                                                                                                                                szb szbVar11 = i29Var2.M;
                                                                                                                                Long l2 = szbVar11 != null ? (Long) szbVar11.a(xzbVar) : null;
                                                                                                                                szb szbVar12 = i29Var.M;
                                                                                                                                if (Intrinsics.d(l2, szbVar12 != null ? (Long) szbVar12.a(xzbVar2) : null) && i29Var2.N.a(xzbVar) == i29Var.N.a(xzbVar2)) {
                                                                                                                                    List list27 = i29Var2.O;
                                                                                                                                    List list28 = i29Var.O;
                                                                                                                                    if (list27 != null) {
                                                                                                                                        if (list28 != null) {
                                                                                                                                            if (list27.size() == list28.size()) {
                                                                                                                                                int i27 = 0;
                                                                                                                                                for (Object obj14 : list27) {
                                                                                                                                                    int i28 = i27 + 1;
                                                                                                                                                    if (i27 < 0) {
                                                                                                                                                        u75.n();
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    if (((bd8) obj14).a((bd8) list28.get(i27), xzbVar, xzbVar2)) {
                                                                                                                                                        i27 = i28;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                r314 = true;
                                                                                                                                            }
                                                                                                                                            r314 = false;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    if (r314 != false) {
                                                                                                                                        szb szbVar13 = i29Var2.P;
                                                                                                                                        Integer num = szbVar13 != null ? (Integer) szbVar13.a(xzbVar) : null;
                                                                                                                                        szb szbVar14 = i29Var.P;
                                                                                                                                        if (Intrinsics.d(num, szbVar14 != null ? (Integer) szbVar14.a(xzbVar2) : null) && i29Var2.Q.a(xzbVar) == i29Var.Q.a(xzbVar2)) {
                                                                                                                                            List list29 = i29Var2.R;
                                                                                                                                            List list30 = i29Var.R;
                                                                                                                                            if (list29 != null) {
                                                                                                                                                if (list30 != null) {
                                                                                                                                                    if (list29.size() == list30.size()) {
                                                                                                                                                        int i29 = 0;
                                                                                                                                                        for (Object obj15 : list29) {
                                                                                                                                                            int i30 = i29 + 1;
                                                                                                                                                            if (i29 < 0) {
                                                                                                                                                                u75.n();
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            if (((iu9) obj15).a((iu9) list30.get(i29), xzbVar, xzbVar2)) {
                                                                                                                                                                i29 = i30;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        r315 = true;
                                                                                                                                                    }
                                                                                                                                                    r315 = false;
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            if (r315 != false) {
                                                                                                                                                qv9 qv9Var = i29Var2.S;
                                                                                                                                                qv9 qv9Var2 = i29Var.S;
                                                                                                                                                if (qv9Var != null ? qv9Var.a(qv9Var2, xzbVar, xzbVar2) : qv9Var2 == null) {
                                                                                                                                                    List list31 = i29Var2.T;
                                                                                                                                                    List list32 = i29Var.T;
                                                                                                                                                    if (list31 != null) {
                                                                                                                                                        if (list32 != null) {
                                                                                                                                                            if (list31.size() == list32.size()) {
                                                                                                                                                                int i31 = 0;
                                                                                                                                                                for (Object obj16 : list31) {
                                                                                                                                                                    int i32 = i31 + 1;
                                                                                                                                                                    if (i31 < 0) {
                                                                                                                                                                        u75.n();
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    if (((xv9) obj16).a((xv9) list32.get(i31), xzbVar, xzbVar2)) {
                                                                                                                                                                        i31 = i32;
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                r316 = true;
                                                                                                                                                            }
                                                                                                                                                            r316 = false;
                                                                                                                                                            break;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    if (r316 != false) {
                                                                                                                                                        sq8 sq8Var = i29Var2.U;
                                                                                                                                                        sq8 sq8Var2 = i29Var.U;
                                                                                                                                                        if (sq8Var != null ? sq8Var.a(sq8Var2, xzbVar, xzbVar2) : sq8Var2 == null) {
                                                                                                                                                            un8 un8Var = i29Var2.V;
                                                                                                                                                            un8 un8Var2 = i29Var.V;
                                                                                                                                                            if (un8Var != null ? un8Var.a(un8Var2, xzbVar, xzbVar2) : un8Var2 == null) {
                                                                                                                                                                un8 un8Var3 = i29Var2.W;
                                                                                                                                                                un8 un8Var4 = i29Var.W;
                                                                                                                                                                if (un8Var3 != null ? un8Var3.a(un8Var4, xzbVar, xzbVar2) : un8Var4 == null) {
                                                                                                                                                                    List list33 = i29Var2.X;
                                                                                                                                                                    List list34 = i29Var.X;
                                                                                                                                                                    if (list33 != null) {
                                                                                                                                                                        if (list34 != null) {
                                                                                                                                                                            if (list33.size() == list34.size()) {
                                                                                                                                                                                int i33 = 0;
                                                                                                                                                                                for (Object obj17 : list33) {
                                                                                                                                                                                    int i34 = i33 + 1;
                                                                                                                                                                                    if (i33 < 0) {
                                                                                                                                                                                        u75.n();
                                                                                                                                                                                        throw null;
                                                                                                                                                                                    }
                                                                                                                                                                                    if ((((nw9) obj17) == ((nw9) list34.get(i33))) != false) {
                                                                                                                                                                                        i33 = i34;
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                r317 = true;
                                                                                                                                                                            }
                                                                                                                                                                            r317 = false;
                                                                                                                                                                            break;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    if (r317 != false) {
                                                                                                                                                                        List list35 = i29Var2.Y;
                                                                                                                                                                        List list36 = i29Var.Y;
                                                                                                                                                                        if (list35 != null) {
                                                                                                                                                                            if (list36 != null) {
                                                                                                                                                                                if (list35.size() == list36.size()) {
                                                                                                                                                                                    int i35 = 0;
                                                                                                                                                                                    for (Object obj18 : list35) {
                                                                                                                                                                                        int i36 = i35 + 1;
                                                                                                                                                                                        if (i35 < 0) {
                                                                                                                                                                                            u75.n();
                                                                                                                                                                                            throw null;
                                                                                                                                                                                        }
                                                                                                                                                                                        if (((ix9) obj18).a((ix9) list36.get(i35), xzbVar, xzbVar2)) {
                                                                                                                                                                                            i35 = i36;
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                    r318 = true;
                                                                                                                                                                                }
                                                                                                                                                                                r318 = false;
                                                                                                                                                                                break;
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        if (r318 != false) {
                                                                                                                                                                            List list37 = i29Var2.Z;
                                                                                                                                                                            List list38 = i29Var.Z;
                                                                                                                                                                            if (list37 != null) {
                                                                                                                                                                                if (list38 != null) {
                                                                                                                                                                                    if (list37.size() == list38.size()) {
                                                                                                                                                                                        int i37 = 0;
                                                                                                                                                                                        for (Object obj19 : list37) {
                                                                                                                                                                                            int i38 = i37 + 1;
                                                                                                                                                                                            if (i37 < 0) {
                                                                                                                                                                                                u75.n();
                                                                                                                                                                                                throw null;
                                                                                                                                                                                            }
                                                                                                                                                                                            if (((zy9) obj19).a((zy9) list38.get(i37), xzbVar, xzbVar2)) {
                                                                                                                                                                                                i37 = i38;
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                        r319 = true;
                                                                                                                                                                                    }
                                                                                                                                                                                    r319 = false;
                                                                                                                                                                                    break;
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            if (r319 != false && i29Var2.a0.a(xzbVar) == i29Var.a0.a(xzbVar2)) {
                                                                                                                                                                                l1a l1aVar = i29Var2.b0;
                                                                                                                                                                                l1a l1aVar2 = i29Var.b0;
                                                                                                                                                                                if (l1aVar != null ? l1aVar.f(l1aVar2, xzbVar, xzbVar2) : l1aVar2 == null) {
                                                                                                                                                                                    List list39 = i29Var2.c0;
                                                                                                                                                                                    List list40 = i29Var.c0;
                                                                                                                                                                                    if (list39 != null) {
                                                                                                                                                                                        if (list40 != null) {
                                                                                                                                                                                            if (list39.size() == list40.size()) {
                                                                                                                                                                                                int i39 = 0;
                                                                                                                                                                                                for (Object obj20 : list39) {
                                                                                                                                                                                                    int i40 = i39 + 1;
                                                                                                                                                                                                    if (i39 < 0) {
                                                                                                                                                                                                        u75.n();
                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    if (((l1a) obj20).f((l1a) list40.get(i39), xzbVar, xzbVar2)) {
                                                                                                                                                                                                        i39 = i40;
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                                r2 = true;
                                                                                                                                                                                            }
                                                                                                                                                                                            r2 = false;
                                                                                                                                                                                            break;
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                    if (r2 != false && i29Var2.d0.a(i29Var.d0, xzbVar, xzbVar2)) {
                                                                                                                                                                                        return true;
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int b() {
        int G;
        int i;
        int i2;
        int i3;
        Integer num = this.b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = ern.a(getClass()).hashCode();
        if (this instanceof hb8) {
            G = ((hb8) this).c.F();
        } else if (this instanceof fb8) {
            G = ((fb8) this).c.G();
        } else if (this instanceof rb8) {
            G = ((rb8) this).c.G();
        } else if (this instanceof mb8) {
            G = ((mb8) this).c.G();
        } else if (this instanceof cb8) {
            jt8 jt8Var = ((cb8) this).c;
            Integer num2 = jt8Var.e0;
            if (num2 != null) {
                G = num2.intValue();
            } else {
                int G2 = jt8Var.G();
                List list = jt8Var.B;
                int i4 = 0;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        i4 += ((jc8) it.next()).b();
                    }
                }
                i = G2 + i4;
                jt8Var.e0 = Integer.valueOf(i);
                G = i;
            }
        } else if (this instanceof gb8) {
            w19 w19Var = ((gb8) this).c;
            Integer num3 = w19Var.W;
            if (num3 != null) {
                G = num3.intValue();
            } else {
                int G3 = w19Var.G();
                List list2 = w19Var.y;
                int i5 = 0;
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        i5 += ((jc8) it2.next()).b();
                    }
                }
                i = G3 + i5;
                w19Var.W = Integer.valueOf(i);
                G = i;
            }
        } else if (this instanceof eb8) {
            s09 s09Var = ((eb8) this).c;
            Integer num4 = s09Var.T;
            if (num4 != null) {
                G = num4.intValue();
            } else {
                int G4 = s09Var.G();
                List list3 = s09Var.u;
                int i6 = 0;
                if (list3 != null) {
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        i6 += ((jc8) it3.next()).b();
                    }
                }
                i = G4 + i6;
                s09Var.T = Integer.valueOf(i);
                G = i;
            }
        } else if (this instanceof kb8) {
            eb9 eb9Var = ((kb8) this).c;
            Integer num5 = eb9Var.T;
            if (num5 != null) {
                G = num5.intValue();
            } else {
                int G5 = eb9Var.G();
                List list4 = eb9Var.t;
                int i7 = 0;
                if (list4 != null) {
                    Iterator it4 = list4.iterator();
                    while (it4.hasNext()) {
                        i7 += ((jc8) it4.next()).b();
                    }
                }
                i = G5 + i7;
                eb9Var.T = Integer.valueOf(i);
                G = i;
            }
        } else if (this instanceof qb8) {
            vo9 vo9Var = ((qb8) this).c;
            Integer num6 = vo9Var.T;
            if (num6 != null) {
                G = num6.intValue();
            } else {
                int G6 = vo9Var.G();
                int i8 = 0;
                for (ro9 ro9Var : vo9Var.q) {
                    Integer num7 = ro9Var.d;
                    if (num7 != null) {
                        i3 = num7.intValue();
                    } else {
                        int hashCode2 = ro9Var.b.hashCode() + ro9Var.a.b() + ern.a(ro9.class).hashCode();
                        bd8 bd8Var = ro9Var.c;
                        int b = hashCode2 + (bd8Var != null ? bd8Var.b() : 0);
                        ro9Var.d = Integer.valueOf(b);
                        i3 = b;
                    }
                    i8 += i3;
                }
                i = G6 + i8;
                vo9Var.T = Integer.valueOf(i);
                G = i;
            }
        } else if (this instanceof ob8) {
            dm9 dm9Var = ((ob8) this).c;
            Integer num8 = dm9Var.Y;
            if (num8 != null) {
                G = num8.intValue();
            } else {
                int G7 = dm9Var.G();
                int i9 = 0;
                for (cm9 cm9Var : dm9Var.I) {
                    Integer num9 = cm9Var.f;
                    if (num9 != null) {
                        i2 = num9.intValue();
                    } else {
                        int hashCode3 = ern.a(cm9.class).hashCode();
                        sm8 sm8Var = cm9Var.a;
                        int i10 = 0;
                        int b2 = hashCode3 + (sm8Var != null ? sm8Var.b() : 0);
                        sm8 sm8Var2 = cm9Var.b;
                        int b3 = b2 + (sm8Var2 != null ? sm8Var2.b() : 0);
                        jc8 jc8Var = cm9Var.c;
                        int hashCode4 = cm9Var.d.hashCode() + b3 + (jc8Var != null ? jc8Var.b() : 0);
                        List list5 = cm9Var.e;
                        if (list5 != null) {
                            Iterator it5 = list5.iterator();
                            while (it5.hasNext()) {
                                i10 += ((bd8) it5.next()).b();
                            }
                        }
                        int i11 = hashCode4 + i10;
                        cm9Var.f = Integer.valueOf(i11);
                        i2 = i11;
                    }
                    i9 += i2;
                }
                i = G7 + i9;
                dm9Var.Y = Integer.valueOf(i);
                G = i;
            }
        } else if (this instanceof db8) {
            yu8 yu8Var = ((db8) this).c;
            Integer num10 = yu8Var.L;
            if (num10 != null) {
                G = num10.intValue();
            } else {
                int G8 = yu8Var.G();
                List list6 = yu8Var.q;
                int i12 = 0;
                if (list6 != null) {
                    Iterator it6 = list6.iterator();
                    while (it6.hasNext()) {
                        i12 += ((jc8) it6.next()).b();
                    }
                }
                i = G8 + i12;
                yu8Var.L = Integer.valueOf(i);
                G = i;
            }
        } else if (this instanceof ib8) {
            G = ((ib8) this).c.G();
        } else if (this instanceof nb8) {
            G = ((nb8) this).c.G();
        } else if (this instanceof pb8) {
            G = ((pb8) this).c.G();
        } else if (this instanceof jb8) {
            G = ((jb8) this).c.G();
        } else if (this instanceof lb8) {
            G = ((lb8) this).c.G();
        } else {
            if (!(this instanceof sb8)) {
                b6e.s();
                return 0;
            }
            G = ((sb8) this).c.G();
        }
        int i13 = hashCode + G;
        this.b = Integer.valueOf(i13);
        return i13;
    }

    public final int c() {
        int G;
        Integer num = this.a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = ern.a(getClass()).hashCode();
        if (this instanceof hb8) {
            G = ((hb8) this).c.F();
        } else if (this instanceof fb8) {
            G = ((fb8) this).c.G();
        } else if (this instanceof rb8) {
            G = ((rb8) this).c.G();
        } else if (this instanceof mb8) {
            G = ((mb8) this).c.G();
        } else if (this instanceof cb8) {
            G = ((cb8) this).c.G();
        } else if (this instanceof gb8) {
            G = ((gb8) this).c.G();
        } else if (this instanceof eb8) {
            G = ((eb8) this).c.G();
        } else if (this instanceof kb8) {
            G = ((kb8) this).c.G();
        } else if (this instanceof qb8) {
            G = ((qb8) this).c.G();
        } else if (this instanceof ob8) {
            G = ((ob8) this).c.G();
        } else if (this instanceof db8) {
            G = ((db8) this).c.G();
        } else if (this instanceof ib8) {
            G = ((ib8) this).c.G();
        } else if (this instanceof nb8) {
            G = ((nb8) this).c.G();
        } else if (this instanceof pb8) {
            G = ((pb8) this).c.G();
        } else if (this instanceof jb8) {
            G = ((jb8) this).c.G();
        } else if (this instanceof lb8) {
            G = ((lb8) this).c.G();
        } else {
            if (!(this instanceof sb8)) {
                b6e.s();
                return 0;
            }
            G = ((sb8) this).c.G();
        }
        int i = hashCode + G;
        this.a = Integer.valueOf(i);
        return i;
    }

    public final dp8 d() {
        if (this instanceof hb8) {
            return ((hb8) this).c;
        }
        if (this instanceof fb8) {
            return ((fb8) this).c;
        }
        if (this instanceof rb8) {
            return ((rb8) this).c;
        }
        if (this instanceof mb8) {
            return ((mb8) this).c;
        }
        if (this instanceof cb8) {
            return ((cb8) this).c;
        }
        if (this instanceof gb8) {
            return ((gb8) this).c;
        }
        if (this instanceof eb8) {
            return ((eb8) this).c;
        }
        if (this instanceof kb8) {
            return ((kb8) this).c;
        }
        if (this instanceof qb8) {
            return ((qb8) this).c;
        }
        if (this instanceof ob8) {
            return ((ob8) this).c;
        }
        if (this instanceof db8) {
            return ((db8) this).c;
        }
        if (this instanceof ib8) {
            return ((ib8) this).c;
        }
        if (this instanceof nb8) {
            return ((nb8) this).c;
        }
        if (this instanceof pb8) {
            return ((pb8) this).c;
        }
        if (this instanceof jb8) {
            return ((jb8) this).c;
        }
        if (this instanceof lb8) {
            return ((lb8) this).c;
        }
        if (this instanceof sb8) {
            return ((sb8) this).c;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((m79) rj3.b.aa.getValue()).b(rj3.a, this);
    }
}
