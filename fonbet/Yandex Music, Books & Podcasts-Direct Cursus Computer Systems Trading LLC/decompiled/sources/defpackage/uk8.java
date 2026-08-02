package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class uk8 implements u1f {
    public Integer a;

    /* JADX WARN: Code restructure failed: missing block: B:232:0x037b, code lost:
    
        if (r5 == null) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0338, code lost:
    
        if (r5 == null) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x04de, code lost:
    
        if (((java.lang.Number) r4.a.a(r13)).longValue() != ((java.lang.Number) r3.a.a(r14)).longValue()) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x04e0, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0513, code lost:
    
        if (((java.lang.Number) r4.a.a(r13)).longValue() != ((java.lang.Number) r3.a.a(r14)).longValue()) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0525, code lost:
    
        if ((r4 instanceof defpackage.pbr ? (defpackage.pbr) r4 : null) != null) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0537, code lost:
    
        if ((r4 instanceof defpackage.b7b ? (defpackage.b7b) r4 : null) != null) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x07cb, code lost:
    
        if (r5 == null) goto L493;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x075c, code lost:
    
        if (r5 == null) goto L465;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x0719, code lost:
    
        if (r5 == null) goto L446;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x092a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(uk8 uk8Var, xzb xzbVar, xzb xzbVar2) {
        boolean d;
        Object obj;
        Object obj2;
        if (uk8Var != null) {
            if (this instanceof xj8) {
                xj8 xj8Var = (xj8) this;
                Object c = uk8Var.c();
                cd8 cd8Var = c instanceof cd8 ? (cd8) c : null;
                if (cd8Var != null) {
                    cd8 cd8Var2 = xj8Var.b;
                    if (Intrinsics.d(cd8Var2.a, cd8Var.a)) {
                        szb szbVar = cd8Var2.b;
                        tm8 tm8Var = szbVar != null ? (tm8) szbVar.a(xzbVar) : null;
                        szb szbVar2 = cd8Var.b;
                        if (tm8Var == (szbVar2 != null ? (tm8) szbVar2.a(xzbVar2) : null)) {
                            szb szbVar3 = cd8Var2.c;
                            Long l = szbVar3 != null ? (Long) szbVar3.a(xzbVar) : null;
                            szb szbVar4 = cd8Var.c;
                            if (Intrinsics.d(l, szbVar4 != null ? (Long) szbVar4.a(xzbVar2) : null)) {
                                wx9 wx9Var = cd8Var2.d;
                                wx9 wx9Var2 = cd8Var.d;
                                if (wx9Var != null ? wx9Var.a(wx9Var2, xzbVar, xzbVar2) : wx9Var2 == null) {
                                    szb szbVar5 = cd8Var2.e;
                                    um8 um8Var = szbVar5 != null ? (um8) szbVar5.a(xzbVar) : null;
                                    szb szbVar6 = cd8Var.e;
                                    if (um8Var == (szbVar6 != null ? (um8) szbVar6.a(xzbVar2) : null)) {
                                        lu8 lu8Var = cd8Var2.f;
                                        lu8 lu8Var2 = cd8Var.f;
                                        if (lu8Var != null ? lu8Var.a(lu8Var2, xzbVar, xzbVar2) : lu8Var2 == null) {
                                            szb szbVar7 = cd8Var2.g;
                                            Long l2 = szbVar7 != null ? (Long) szbVar7.a(xzbVar) : null;
                                            szb szbVar8 = cd8Var.g;
                                            if (Intrinsics.d(l2, szbVar8 != null ? (Long) szbVar8.a(xzbVar2) : null)) {
                                                wx9 wx9Var3 = cd8Var2.h;
                                                wx9 wx9Var4 = cd8Var.h;
                                                if (wx9Var3 != null ? wx9Var3.a(wx9Var4, xzbVar, xzbVar2) : wx9Var4 == null) {
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
            } else if (this instanceof yj8) {
                yj8 yj8Var = (yj8) this;
                Object c2 = uk8Var.c();
                id8 id8Var = c2 instanceof id8 ? (id8) c2 : null;
                if (id8Var != null) {
                    return Intrinsics.d(yj8Var.b.a, id8Var.a);
                }
            } else if (this instanceof zj8) {
                zj8 zj8Var = (zj8) this;
                Object c3 = uk8Var.c();
                nd8 nd8Var = c3 instanceof nd8 ? (nd8) c3 : null;
                if (nd8Var != null) {
                    nd8 nd8Var2 = zj8Var.b;
                    szb szbVar9 = nd8Var2.a;
                    Long l3 = szbVar9 != null ? (Long) szbVar9.a(xzbVar) : null;
                    szb szbVar10 = nd8Var.a;
                    if (!Intrinsics.d(l3, szbVar10 != null ? (Long) szbVar10.a(xzbVar2) : null) || !nd8Var2.b.a(nd8Var.b, xzbVar, xzbVar2) || !Intrinsics.d(nd8Var2.c.a(xzbVar), nd8Var.c.a(xzbVar2))) {
                    }
                }
            } else if (this instanceof ak8) {
                ak8 ak8Var = (ak8) this;
                Object c4 = uk8Var.c();
                sd8 sd8Var = c4 instanceof sd8 ? (sd8) c4 : null;
                if (sd8Var != null) {
                    sd8 sd8Var2 = ak8Var.b;
                    if (((Number) sd8Var2.a.a(xzbVar)).longValue() != ((Number) sd8Var.a.a(xzbVar2)).longValue() || !Intrinsics.d(sd8Var2.b.a(xzbVar), sd8Var.b.a(xzbVar2))) {
                    }
                }
            } else if (this instanceof bk8) {
                bk8 bk8Var = (bk8) this;
                Object c5 = uk8Var.c();
                xd8 xd8Var = c5 instanceof xd8 ? (xd8) c5 : null;
                if (xd8Var != null) {
                    xd8 xd8Var2 = bk8Var.b;
                    if (((Number) xd8Var2.a.a(xzbVar)).longValue() != ((Number) xd8Var.a.a(xzbVar2)).longValue() || !xd8Var2.b.a(xd8Var.b, xzbVar, xzbVar2) || !Intrinsics.d(xd8Var2.c.a(xzbVar), xd8Var.c.a(xzbVar2))) {
                    }
                }
            } else if (this instanceof ck8) {
                Object c6 = uk8Var.c();
                if ((c6 instanceof qe8 ? (qe8) c6 : null) != null) {
                }
            } else if (this instanceof dk8) {
                dk8 dk8Var = (dk8) this;
                Object c7 = uk8Var.c();
                ve8 ve8Var = c7 instanceof ve8 ? (ve8) c7 : null;
                if (ve8Var != null) {
                    ye8 ye8Var = dk8Var.b.a;
                    ye8 ye8Var2 = ve8Var.a;
                    ye8Var.getClass();
                    if (ye8Var2 != null) {
                        if (ye8Var instanceof we8) {
                            ud6 ud6Var = ((we8) ye8Var).b;
                            if (ye8Var2 instanceof we8) {
                                obj2 = ((we8) ye8Var2).b;
                            } else {
                                if (!(ye8Var2 instanceof xe8)) {
                                    b6e.s();
                                    return false;
                                }
                                obj2 = ((xe8) ye8Var2).b;
                            }
                            ud6 ud6Var2 = obj2 instanceof ud6 ? (ud6) obj2 : null;
                            if (ud6Var2 != null) {
                                return Intrinsics.d(ud6Var.a.a(xzbVar), ud6Var2.a.a(xzbVar2));
                            }
                        } else {
                            if (!(ye8Var instanceof xe8)) {
                                b6e.s();
                                return false;
                            }
                            ge6 ge6Var = ((xe8) ye8Var).b;
                            if (ye8Var2 instanceof we8) {
                                obj = ((we8) ye8Var2).b;
                            } else {
                                if (!(ye8Var2 instanceof xe8)) {
                                    b6e.s();
                                    return false;
                                }
                                obj = ((xe8) ye8Var2).b;
                            }
                            ge6 ge6Var2 = obj instanceof ge6 ? (ge6) obj : null;
                            if (ge6Var2 != null) {
                                return Intrinsics.d(ge6Var.a.a(xzbVar), ge6Var2.a.a(xzbVar2));
                            }
                        }
                    }
                }
            } else if (this instanceof fk8) {
                fk8 fk8Var = (fk8) this;
                Object c8 = uk8Var.c();
                of8 of8Var = c8 instanceof of8 ? (of8) c8 : null;
                if (of8Var != null) {
                    of8 of8Var2 = fk8Var.b;
                    if (Intrinsics.d(of8Var2.a.a(xzbVar), of8Var.a.a(xzbVar2))) {
                        wx9 wx9Var5 = of8Var2.b;
                        wx9 wx9Var6 = of8Var.b;
                        if (!(wx9Var5 != null ? wx9Var5.a(wx9Var6, xzbVar, xzbVar2) : wx9Var6 == null) || !Intrinsics.d(of8Var2.c.a(xzbVar), of8Var.c.a(xzbVar2))) {
                        }
                    }
                }
            } else if (this instanceof gk8) {
                gk8 gk8Var = (gk8) this;
                Object c9 = uk8Var.c();
                tf8 tf8Var = c9 instanceof tf8 ? (tf8) c9 : null;
                if (tf8Var != null) {
                    tf8 tf8Var2 = gk8Var.b;
                    List list = tf8Var2.a;
                    List list2 = tf8Var.a;
                    if (list != null) {
                        if (list2 != null && list.size() == list2.size()) {
                            int i = 0;
                            for (Object obj3 : list) {
                                int i2 = i + 1;
                                if (i < 0) {
                                    u75.n();
                                    throw null;
                                }
                                if (!((bd8) obj3).a((bd8) list2.get(i), xzbVar, xzbVar2)) {
                                    break;
                                }
                                i = i2;
                            }
                            List list3 = tf8Var2.b;
                            List list4 = tf8Var.b;
                            if (list3 != null) {
                                if (list4 != null && list3.size() == list4.size()) {
                                    int i3 = 0;
                                    for (Object obj4 : list3) {
                                        int i4 = i3 + 1;
                                        if (i3 < 0) {
                                            u75.n();
                                            throw null;
                                        }
                                        if (!((bd8) obj4).a((bd8) list4.get(i3), xzbVar, xzbVar2)) {
                                            break;
                                        }
                                        i3 = i4;
                                    }
                                    if (Intrinsics.d(tf8Var2.c.a(xzbVar), tf8Var.c.a(xzbVar2))) {
                                    }
                                }
                            }
                        }
                    }
                    return true;
                }
            } else if (this instanceof hk8) {
                hk8 hk8Var = (hk8) this;
                Object c10 = uk8Var.c();
                zf8 zf8Var = c10 instanceof zf8 ? (zf8) c10 : null;
                if (zf8Var != null) {
                    return Intrinsics.d(hk8Var.b.a.a(xzbVar), zf8Var.a.a(xzbVar2));
                }
            } else if (this instanceof ik8) {
                ik8 ik8Var = (ik8) this;
                Object c11 = uk8Var.c();
                fg8 fg8Var = c11 instanceof fg8 ? (fg8) c11 : null;
                if (fg8Var != null) {
                    return Intrinsics.d(ik8Var.b.a.a(xzbVar), fg8Var.a.a(xzbVar2));
                }
            } else if (this instanceof jk8) {
                jk8 jk8Var = (jk8) this;
                Object c12 = uk8Var.c();
                sg8 sg8Var = c12 instanceof sg8 ? (sg8) c12 : null;
                if (sg8Var != null) {
                    sg8 sg8Var2 = jk8Var.b;
                    if (((Boolean) sg8Var2.a.a(xzbVar)).booleanValue() != ((Boolean) sg8Var.a.a(xzbVar2)).booleanValue() || !Intrinsics.d(sg8Var2.b.a(xzbVar), sg8Var.b.a(xzbVar2)) || ((Number) sg8Var2.c.a(xzbVar)).longValue() != ((Number) sg8Var.c.a(xzbVar2)).longValue() || ((Number) sg8Var2.d.a(xzbVar)).longValue() != ((Number) sg8Var.d.a(xzbVar2)).longValue() || sg8Var2.e.a(xzbVar) != sg8Var.e.a(xzbVar2)) {
                        break;
                    }
                }
            } else if (this instanceof kk8) {
                kk8 kk8Var = (kk8) this;
                Object c13 = uk8Var.c();
                nh8 nh8Var = c13 instanceof nh8 ? (nh8) c13 : null;
                if (nh8Var != null) {
                    nh8 nh8Var2 = kk8Var.b;
                    if (((Boolean) nh8Var2.a.a(xzbVar)).booleanValue() == ((Boolean) nh8Var.a.a(xzbVar2)).booleanValue()) {
                        dh8 dh8Var = nh8Var2.b;
                        dh8 dh8Var2 = nh8Var.b;
                        dh8Var.getClass();
                        if (dh8Var2 != null) {
                            if (dh8Var instanceof bh8) {
                                gnj gnjVar = ((bh8) dh8Var).b;
                                Object a = dh8Var2.a();
                                gnj gnjVar2 = a instanceof gnj ? (gnj) a : null;
                                if (gnjVar2 != null) {
                                }
                            } else if (dh8Var instanceof zg8) {
                                rie rieVar = ((zg8) dh8Var).b;
                                Object a2 = dh8Var2.a();
                                rie rieVar2 = a2 instanceof rie ? (rie) a2 : null;
                                if (rieVar2 != null) {
                                }
                            } else if (dh8Var instanceof ch8) {
                                Object a3 = dh8Var2.a();
                            } else if (dh8Var instanceof yg8) {
                                Object a4 = dh8Var2.a();
                            } else {
                                if (!(dh8Var instanceof ah8)) {
                                    b6e.s();
                                    return false;
                                }
                                cze czeVar = ((ah8) dh8Var).b;
                                Object a5 = dh8Var2.a();
                                cze czeVar2 = a5 instanceof cze ? (cze) a5 : null;
                                if (czeVar2 != null) {
                                    d = Intrinsics.d(czeVar.a.a(xzbVar), czeVar2.a.a(xzbVar2));
                                }
                            }
                            if (d || !Intrinsics.d(nh8Var2.c.a(xzbVar), nh8Var.c.a(xzbVar2))) {
                                break;
                            }
                        }
                        d = false;
                        if (d) {
                        }
                    }
                }
            } else if (this instanceof mk8) {
                mk8 mk8Var = (mk8) this;
                Object c14 = uk8Var.c();
                ci8 ci8Var = c14 instanceof ci8 ? (ci8) c14 : null;
                if (ci8Var != null) {
                    ci8 ci8Var2 = mk8Var.b;
                    if (!Intrinsics.d(ci8Var2.a.a(xzbVar), ci8Var.a.a(xzbVar2)) || ((Boolean) ci8Var2.b.a(xzbVar)).booleanValue() != ((Boolean) ci8Var.b.a(xzbVar2)).booleanValue()) {
                        break;
                    }
                }
            } else if (this instanceof nk8) {
                nk8 nk8Var = (nk8) this;
                Object c15 = uk8Var.c();
                ji8 ji8Var = c15 instanceof ji8 ? (ji8) c15 : null;
                if (ji8Var != null) {
                    ji8 ji8Var2 = nk8Var.b;
                    if (((Number) ji8Var2.a.a(xzbVar)).longValue() == ((Number) ji8Var.a.a(xzbVar2)).longValue() && Intrinsics.d(ji8Var2.b.a(xzbVar), ji8Var.b.a(xzbVar2))) {
                        szb szbVar11 = ji8Var2.c;
                        ii8 ii8Var = szbVar11 != null ? (ii8) szbVar11.a(xzbVar) : null;
                        szb szbVar12 = ji8Var.c;
                        if (ii8Var != (szbVar12 != null ? (ii8) szbVar12.a(xzbVar2) : null) || !ji8Var2.d.a(ji8Var.d, xzbVar, xzbVar2)) {
                            break;
                        }
                    }
                }
            } else if (this instanceof ok8) {
                ok8 ok8Var = (ok8) this;
                Object c16 = uk8Var.c();
                pi8 pi8Var = c16 instanceof pi8 ? (pi8) c16 : null;
                if (pi8Var != null) {
                    pi8 pi8Var2 = ok8Var.b;
                    if (!pi8Var2.a.a(pi8Var.a, xzbVar, xzbVar2) || !Intrinsics.d(pi8Var2.b.a(xzbVar), pi8Var.b.a(xzbVar2))) {
                        break;
                    }
                }
            } else if (this instanceof pk8) {
                pk8 pk8Var = (pk8) this;
                Object c17 = uk8Var.c();
                ui8 ui8Var = c17 instanceof ui8 ? (ui8) c17 : null;
                if (ui8Var != null) {
                    ui8 ui8Var2 = pk8Var.b;
                    if (Intrinsics.d(ui8Var2.a.a(xzbVar), ui8Var.a.a(xzbVar2))) {
                        szb szbVar13 = ui8Var2.b;
                        Boolean bool = szbVar13 != null ? (Boolean) szbVar13.a(xzbVar) : null;
                        szb szbVar14 = ui8Var.b;
                        if (Intrinsics.d(bool, szbVar14 != null ? (Boolean) szbVar14.a(xzbVar2) : null)) {
                        }
                    }
                }
            } else if (this instanceof qk8) {
                qk8 qk8Var = (qk8) this;
                Object c18 = uk8Var.c();
                cj8 cj8Var = c18 instanceof cj8 ? (cj8) c18 : null;
                if (cj8Var != null) {
                    cj8 cj8Var2 = qk8Var.b;
                    if (Intrinsics.d(cj8Var2.a.a(xzbVar), cj8Var.a.a(xzbVar2))) {
                        List list5 = cj8Var2.b;
                        List list6 = cj8Var.b;
                        if (list5 != null) {
                            if (list6 != null && list5.size() == list6.size()) {
                                int i5 = 0;
                                for (Object obj5 : list5) {
                                    int i6 = i5 + 1;
                                    if (i5 < 0) {
                                        u75.n();
                                        throw null;
                                    }
                                    if (!((bd8) obj5).a((bd8) list6.get(i5), xzbVar, xzbVar2)) {
                                        break;
                                    }
                                    i5 = i6;
                                }
                                List list7 = cj8Var2.c;
                                List list8 = cj8Var.c;
                                if (list7 != null) {
                                    if (list8 != null && list7.size() == list8.size()) {
                                        int i7 = 0;
                                        for (Object obj6 : list7) {
                                            int i8 = i7 + 1;
                                            if (i7 < 0) {
                                                u75.n();
                                                throw null;
                                            }
                                            if (!((bd8) obj6).a((bd8) list8.get(i7), xzbVar, xzbVar2)) {
                                                break;
                                            }
                                            i7 = i8;
                                        }
                                        bj8 bj8Var = cj8Var2.d;
                                        bj8 bj8Var2 = cj8Var.d;
                                        if (bj8Var2 == null) {
                                            bj8Var.getClass();
                                            return false;
                                        }
                                        List list9 = bj8Var.a;
                                        List list10 = bj8Var2.a;
                                        if (list9 != null) {
                                            if (list10 != null && list9.size() == list10.size()) {
                                                int i9 = 0;
                                                for (Object obj7 : list9) {
                                                    int i10 = i9 + 1;
                                                    if (i9 < 0) {
                                                        u75.n();
                                                        throw null;
                                                    }
                                                    zi8 zi8Var = (zi8) list10.get(i9);
                                                    zi8 zi8Var2 = (zi8) obj7;
                                                    if (zi8Var == null) {
                                                        zi8Var2.getClass();
                                                        return false;
                                                    }
                                                    if (!Intrinsics.d(zi8Var2.a.a(xzbVar), zi8Var.a.a(xzbVar2)) || !Intrinsics.d(zi8Var2.b.a(xzbVar), zi8Var.b.a(xzbVar2))) {
                                                        break;
                                                    }
                                                    i9 = i10;
                                                }
                                                if (bj8Var.b.a(xzbVar) != bj8Var2.b.a(xzbVar2) || !Intrinsics.d(bj8Var.c.a(xzbVar), bj8Var2.c.a(xzbVar2))) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return true;
                    }
                }
            } else if (this instanceof rk8) {
                rk8 rk8Var = (rk8) this;
                Object c19 = uk8Var.c();
                rj8 rj8Var = c19 instanceof rj8 ? (rj8) c19 : null;
                if (rj8Var != null) {
                    rj8 rj8Var2 = rk8Var.b;
                    if (rj8Var2.a.a(xzbVar) != rj8Var.a.a(xzbVar2) || !Intrinsics.d(rj8Var2.b.a(xzbVar), rj8Var.b.a(xzbVar2))) {
                        break;
                    }
                }
            } else if (this instanceof sk8) {
                sk8 sk8Var = (sk8) this;
                Object c20 = uk8Var.c();
                bm8 bm8Var = c20 instanceof bm8 ? (bm8) c20 : null;
                if (bm8Var != null) {
                    bm8 bm8Var2 = sk8Var.b;
                    if (!Intrinsics.d(bm8Var2.a.a(xzbVar), bm8Var.a.a(xzbVar2)) || !bm8Var2.b.a(bm8Var.b, xzbVar, xzbVar2) || !Intrinsics.d(bm8Var2.c.a(xzbVar), bm8Var.c.a(xzbVar2))) {
                        break;
                    }
                }
            } else if (this instanceof tk8) {
                tk8 tk8Var = (tk8) this;
                Object c21 = uk8Var.c();
                hm8 hm8Var = c21 instanceof hm8 ? (hm8) c21 : null;
                if (hm8Var != null) {
                    hm8 hm8Var2 = tk8Var.b;
                    if (hm8Var2.a.a(xzbVar) != hm8Var.a.a(xzbVar2) || !Intrinsics.d(hm8Var2.b.a(xzbVar), hm8Var.b.a(xzbVar2))) {
                        break;
                    }
                }
            } else if (this instanceof ek8) {
                Object c22 = uk8Var.c();
                if ((c22 instanceof jf8 ? (jf8) c22 : null) != null) {
                }
            } else {
                if (!(this instanceof lk8)) {
                    b6e.s();
                    return false;
                }
                lk8 lk8Var = (lk8) this;
                Object c23 = uk8Var.c();
                uh8 uh8Var = c23 instanceof uh8 ? (uh8) c23 : null;
                if (uh8Var != null) {
                    uh8 uh8Var2 = lk8Var.b;
                    if (Intrinsics.d(uh8Var2.a.a(xzbVar), uh8Var.a.a(xzbVar2))) {
                        th8 th8Var = uh8Var2.b;
                        th8 th8Var2 = uh8Var.b;
                        if (th8Var2 == null) {
                            th8Var.getClass();
                            return false;
                        }
                        szb szbVar15 = th8Var.a;
                        Long l4 = szbVar15 != null ? (Long) szbVar15.a(xzbVar) : null;
                        szb szbVar16 = th8Var2.a;
                        if (!Intrinsics.d(l4, szbVar16 != null ? (Long) szbVar16.a(xzbVar2) : null) || ((Number) th8Var.b.a(xzbVar)).longValue() != ((Number) th8Var2.b.a(xzbVar2)).longValue()) {
                            break;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int b() {
        int i;
        int i2;
        int intValue;
        int hashCode;
        int i3;
        int i4;
        int i5;
        int i6;
        int hashCode2;
        int intValue2;
        int hashCode3;
        int i7;
        int i8;
        int i9;
        Integer num = this.a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode4 = ern.a(getClass()).hashCode();
        if (this instanceof xj8) {
            cd8 cd8Var = ((xj8) this).b;
            Integer num2 = cd8Var.i;
            if (num2 != null) {
                intValue = num2.intValue();
            } else {
                int hashCode5 = cd8Var.a.hashCode() + ern.a(cd8.class).hashCode();
                szb szbVar = cd8Var.b;
                int hashCode6 = hashCode5 + (szbVar != null ? szbVar.hashCode() : 0);
                szb szbVar2 = cd8Var.c;
                int hashCode7 = hashCode6 + (szbVar2 != null ? szbVar2.hashCode() : 0);
                wx9 wx9Var = cd8Var.d;
                int b = hashCode7 + (wx9Var != null ? wx9Var.b() : 0);
                szb szbVar3 = cd8Var.e;
                int hashCode8 = b + (szbVar3 != null ? szbVar3.hashCode() : 0);
                lu8 lu8Var = cd8Var.f;
                int b2 = hashCode8 + (lu8Var != null ? lu8Var.b() : 0);
                szb szbVar4 = cd8Var.g;
                int hashCode9 = b2 + (szbVar4 != null ? szbVar4.hashCode() : 0);
                wx9 wx9Var2 = cd8Var.h;
                i2 = hashCode9 + (wx9Var2 != null ? wx9Var2.b() : 0);
                cd8Var.i = Integer.valueOf(i2);
                intValue = i2;
            }
        } else if (this instanceof yj8) {
            id8 id8Var = ((yj8) this).b;
            Integer num3 = id8Var.b;
            if (num3 != null) {
                intValue = num3.intValue();
            } else {
                hashCode = id8Var.a.hashCode() + ern.a(id8.class).hashCode();
                id8Var.b = Integer.valueOf(hashCode);
                intValue = hashCode;
            }
        } else if (this instanceof zj8) {
            nd8 nd8Var = ((zj8) this).b;
            Integer num4 = nd8Var.d;
            if (num4 != null) {
                intValue = num4.intValue();
            } else {
                int hashCode10 = ern.a(nd8.class).hashCode();
                szb szbVar5 = nd8Var.a;
                i2 = nd8Var.c.hashCode() + nd8Var.b.b() + hashCode10 + (szbVar5 != null ? szbVar5.hashCode() : 0);
                nd8Var.d = Integer.valueOf(i2);
                intValue = i2;
            }
        } else if (this instanceof ak8) {
            sd8 sd8Var = ((ak8) this).b;
            Integer num5 = sd8Var.c;
            if (num5 != null) {
                intValue = num5.intValue();
            } else {
                i2 = sd8Var.b.hashCode() + sd8Var.a.hashCode() + ern.a(sd8.class).hashCode();
                sd8Var.c = Integer.valueOf(i2);
                intValue = i2;
            }
        } else if (this instanceof bk8) {
            xd8 xd8Var = ((bk8) this).b;
            Integer num6 = xd8Var.d;
            if (num6 != null) {
                intValue = num6.intValue();
            } else {
                hashCode = xd8Var.c.hashCode() + xd8Var.b.b() + xd8Var.a.hashCode() + ern.a(xd8.class).hashCode();
                xd8Var.d = Integer.valueOf(hashCode);
                intValue = hashCode;
            }
        } else if (this instanceof ck8) {
            qe8 qe8Var = ((ck8) this).b;
            Integer num7 = qe8Var.a;
            if (num7 != null) {
                intValue = num7.intValue();
            } else {
                i2 = ern.a(qe8.class).hashCode();
                qe8Var.a = Integer.valueOf(i2);
                intValue = i2;
            }
        } else if (this instanceof dk8) {
            ve8 ve8Var = ((dk8) this).b;
            Integer num8 = ve8Var.b;
            if (num8 != null) {
                intValue = num8.intValue();
            } else {
                int hashCode11 = ern.a(ve8.class).hashCode();
                ye8 ye8Var = ve8Var.a;
                Integer num9 = ye8Var.a;
                if (num9 != null) {
                    i8 = num9.intValue();
                } else {
                    int hashCode12 = ern.a(ye8Var.getClass()).hashCode();
                    if (ye8Var instanceof we8) {
                        ud6 ud6Var = ((we8) ye8Var).b;
                        Integer num10 = ud6Var.b;
                        if (num10 != null) {
                            i9 = num10.intValue();
                        } else {
                            int hashCode13 = ern.a(ud6.class).hashCode() + ud6Var.a.hashCode();
                            ud6Var.b = Integer.valueOf(hashCode13);
                            i9 = hashCode13;
                        }
                    } else if (ye8Var instanceof xe8) {
                        ge6 ge6Var = ((xe8) ye8Var).b;
                        Integer num11 = ge6Var.b;
                        if (num11 != null) {
                            i9 = num11.intValue();
                        } else {
                            int hashCode14 = ge6Var.a.hashCode() + ern.a(ge6.class).hashCode();
                            ge6Var.b = Integer.valueOf(hashCode14);
                            i9 = hashCode14;
                        }
                    } else {
                        b6e.s();
                        i8 = 0;
                    }
                    int i10 = hashCode12 + i9;
                    ye8Var.a = Integer.valueOf(i10);
                    i8 = i10;
                }
                hashCode = i8 + hashCode11;
                ve8Var.b = Integer.valueOf(hashCode);
                intValue = hashCode;
            }
        } else if (this instanceof fk8) {
            of8 of8Var = ((fk8) this).b;
            Integer num12 = of8Var.d;
            if (num12 != null) {
                intValue = num12.intValue();
            } else {
                int hashCode15 = of8Var.a.hashCode() + ern.a(of8.class).hashCode();
                wx9 wx9Var3 = of8Var.b;
                i2 = of8Var.c.hashCode() + hashCode15 + (wx9Var3 != null ? wx9Var3.b() : 0);
                of8Var.d = Integer.valueOf(i2);
                intValue = i2;
            }
        } else if (this instanceof gk8) {
            tf8 tf8Var = ((gk8) this).b;
            Integer num13 = tf8Var.d;
            if (num13 != null) {
                intValue = num13.intValue();
            } else {
                int hashCode16 = ern.a(tf8.class).hashCode();
                List list = tf8Var.a;
                int i11 = 0;
                if (list != null) {
                    Iterator it = list.iterator();
                    i7 = 0;
                    while (it.hasNext()) {
                        i7 += ((bd8) it.next()).b();
                    }
                } else {
                    i7 = 0;
                }
                int i12 = hashCode16 + i7;
                List list2 = tf8Var.b;
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        i11 += ((bd8) it2.next()).b();
                    }
                }
                hashCode = tf8Var.c.hashCode() + i12 + i11;
                tf8Var.d = Integer.valueOf(hashCode);
                intValue = hashCode;
            }
        } else if (this instanceof hk8) {
            zf8 zf8Var = ((hk8) this).b;
            Integer num14 = zf8Var.b;
            if (num14 != null) {
                intValue = num14.intValue();
            } else {
                hashCode = zf8Var.a.hashCode() + ern.a(zf8.class).hashCode();
                zf8Var.b = Integer.valueOf(hashCode);
                intValue = hashCode;
            }
        } else if (this instanceof ik8) {
            fg8 fg8Var = ((ik8) this).b;
            Integer num15 = fg8Var.b;
            if (num15 != null) {
                intValue = num15.intValue();
            } else {
                hashCode = fg8Var.a.hashCode() + ern.a(fg8.class).hashCode();
                fg8Var.b = Integer.valueOf(hashCode);
                intValue = hashCode;
            }
        } else if (this instanceof jk8) {
            sg8 sg8Var = ((jk8) this).b;
            Integer num16 = sg8Var.f;
            if (num16 != null) {
                intValue = num16.intValue();
            } else {
                hashCode = sg8Var.e.hashCode() + sg8Var.d.hashCode() + sg8Var.c.hashCode() + sg8Var.b.hashCode() + sg8Var.a.hashCode() + ern.a(sg8.class).hashCode();
                sg8Var.f = Integer.valueOf(hashCode);
                intValue = hashCode;
            }
        } else if (this instanceof kk8) {
            nh8 nh8Var = ((kk8) this).b;
            Integer num17 = nh8Var.d;
            if (num17 != null) {
                intValue = num17.intValue();
            } else {
                int hashCode17 = nh8Var.a.hashCode() + ern.a(nh8.class).hashCode();
                dh8 dh8Var = nh8Var.b;
                Integer num18 = dh8Var.a;
                if (num18 != null) {
                    i6 = num18.intValue();
                } else {
                    int hashCode18 = ern.a(dh8Var.getClass()).hashCode();
                    if (dh8Var instanceof bh8) {
                        gnj gnjVar = ((bh8) dh8Var).b;
                        Integer num19 = gnjVar.b;
                        if (num19 != null) {
                            intValue2 = num19.intValue();
                            int i13 = hashCode18 + intValue2;
                            dh8Var.a = Integer.valueOf(i13);
                            i6 = i13;
                        } else {
                            hashCode3 = ern.a(gnj.class).hashCode() + gnjVar.a.hashCode();
                            gnjVar.b = Integer.valueOf(hashCode3);
                            intValue2 = hashCode3;
                            int i132 = hashCode18 + intValue2;
                            dh8Var.a = Integer.valueOf(i132);
                            i6 = i132;
                        }
                    } else if (dh8Var instanceof zg8) {
                        rie rieVar = ((zg8) dh8Var).b;
                        Integer num20 = rieVar.b;
                        if (num20 != null) {
                            intValue2 = num20.intValue();
                            int i1322 = hashCode18 + intValue2;
                            dh8Var.a = Integer.valueOf(i1322);
                            i6 = i1322;
                        } else {
                            hashCode2 = rieVar.a.hashCode() + ern.a(rie.class).hashCode();
                            rieVar.b = Integer.valueOf(hashCode2);
                            intValue2 = hashCode2;
                            int i13222 = hashCode18 + intValue2;
                            dh8Var.a = Integer.valueOf(i13222);
                            i6 = i13222;
                        }
                    } else if (dh8Var instanceof ch8) {
                        pbr pbrVar = ((ch8) dh8Var).b;
                        Integer num21 = pbrVar.a;
                        if (num21 != null) {
                            intValue2 = num21.intValue();
                            int i132222 = hashCode18 + intValue2;
                            dh8Var.a = Integer.valueOf(i132222);
                            i6 = i132222;
                        } else {
                            hashCode3 = ern.a(pbr.class).hashCode();
                            pbrVar.a = Integer.valueOf(hashCode3);
                            intValue2 = hashCode3;
                            int i1322222 = hashCode18 + intValue2;
                            dh8Var.a = Integer.valueOf(i1322222);
                            i6 = i1322222;
                        }
                    } else {
                        if (dh8Var instanceof yg8) {
                            b7b b7bVar = ((yg8) dh8Var).b;
                            Integer num22 = b7bVar.a;
                            if (num22 != null) {
                                intValue2 = num22.intValue();
                            } else {
                                hashCode3 = ern.a(b7b.class).hashCode();
                                b7bVar.a = Integer.valueOf(hashCode3);
                                intValue2 = hashCode3;
                            }
                        } else if (dh8Var instanceof ah8) {
                            cze czeVar = ((ah8) dh8Var).b;
                            Integer num23 = czeVar.b;
                            if (num23 != null) {
                                intValue2 = num23.intValue();
                            } else {
                                hashCode2 = czeVar.a.hashCode() + ern.a(cze.class).hashCode();
                                czeVar.b = Integer.valueOf(hashCode2);
                                intValue2 = hashCode2;
                            }
                        } else {
                            b6e.s();
                            i6 = 0;
                        }
                        int i13222222 = hashCode18 + intValue2;
                        dh8Var.a = Integer.valueOf(i13222222);
                        i6 = i13222222;
                    }
                }
                hashCode = nh8Var.c.hashCode() + i6 + hashCode17;
                nh8Var.d = Integer.valueOf(hashCode);
                intValue = hashCode;
            }
        } else if (this instanceof mk8) {
            ci8 ci8Var = ((mk8) this).b;
            Integer num24 = ci8Var.c;
            if (num24 != null) {
                intValue = num24.intValue();
            } else {
                i2 = ci8Var.b.hashCode() + ci8Var.a.hashCode() + ern.a(ci8.class).hashCode();
                ci8Var.c = Integer.valueOf(i2);
                intValue = i2;
            }
        } else if (this instanceof nk8) {
            ji8 ji8Var = ((nk8) this).b;
            Integer num25 = ji8Var.e;
            if (num25 != null) {
                intValue = num25.intValue();
            } else {
                int hashCode19 = ji8Var.b.hashCode() + ji8Var.a.hashCode() + ern.a(ji8.class).hashCode();
                szb szbVar6 = ji8Var.c;
                hashCode = ji8Var.d.b() + hashCode19 + (szbVar6 != null ? szbVar6.hashCode() : 0);
                ji8Var.e = Integer.valueOf(hashCode);
                intValue = hashCode;
            }
        } else if (this instanceof ok8) {
            pi8 pi8Var = ((ok8) this).b;
            Integer num26 = pi8Var.c;
            if (num26 != null) {
                intValue = num26.intValue();
            } else {
                i2 = pi8Var.b.hashCode() + pi8Var.a.b() + ern.a(pi8.class).hashCode();
                pi8Var.c = Integer.valueOf(i2);
                intValue = i2;
            }
        } else if (this instanceof pk8) {
            ui8 ui8Var = ((pk8) this).b;
            Integer num27 = ui8Var.c;
            if (num27 != null) {
                intValue = num27.intValue();
            } else {
                int hashCode20 = ui8Var.a.hashCode() + ern.a(ui8.class).hashCode();
                szb szbVar7 = ui8Var.b;
                hashCode = hashCode20 + (szbVar7 != null ? szbVar7.hashCode() : 0);
                ui8Var.c = Integer.valueOf(hashCode);
                intValue = hashCode;
            }
        } else if (this instanceof qk8) {
            cj8 cj8Var = ((qk8) this).b;
            Integer num28 = cj8Var.e;
            if (num28 != null) {
                intValue = num28.intValue();
            } else {
                int hashCode21 = cj8Var.a.hashCode() + ern.a(cj8.class).hashCode();
                List list3 = cj8Var.b;
                int i14 = 0;
                if (list3 != null) {
                    Iterator it3 = list3.iterator();
                    i3 = 0;
                    while (it3.hasNext()) {
                        i3 += ((bd8) it3.next()).b();
                    }
                } else {
                    i3 = 0;
                }
                int i15 = hashCode21 + i3;
                List list4 = cj8Var.c;
                if (list4 != null) {
                    Iterator it4 = list4.iterator();
                    while (it4.hasNext()) {
                        i14 += ((bd8) it4.next()).b();
                    }
                }
                int i16 = i15 + i14;
                bj8 bj8Var = cj8Var.d;
                Integer num29 = bj8Var.d;
                if (num29 != null) {
                    i4 = num29.intValue();
                } else {
                    int hashCode22 = ern.a(bj8.class).hashCode();
                    List<zi8> list5 = bj8Var.a;
                    int i17 = 0;
                    if (list5 != null) {
                        for (zi8 zi8Var : list5) {
                            Integer num30 = zi8Var.c;
                            if (num30 != null) {
                                i5 = num30.intValue();
                            } else {
                                int hashCode23 = zi8Var.b.hashCode() + zi8Var.a.hashCode() + ern.a(zi8.class).hashCode();
                                zi8Var.c = Integer.valueOf(hashCode23);
                                i5 = hashCode23;
                            }
                            i17 += i5;
                        }
                    }
                    int hashCode24 = bj8Var.c.hashCode() + bj8Var.b.hashCode() + hashCode22 + i17;
                    bj8Var.d = Integer.valueOf(hashCode24);
                    i4 = hashCode24;
                }
                i2 = i4 + i16;
                cj8Var.e = Integer.valueOf(i2);
                intValue = i2;
            }
        } else if (this instanceof rk8) {
            rj8 rj8Var = ((rk8) this).b;
            Integer num31 = rj8Var.c;
            if (num31 != null) {
                intValue = num31.intValue();
            } else {
                i2 = rj8Var.b.hashCode() + rj8Var.a.hashCode() + ern.a(rj8.class).hashCode();
                rj8Var.c = Integer.valueOf(i2);
                intValue = i2;
            }
        } else if (this instanceof sk8) {
            bm8 bm8Var = ((sk8) this).b;
            Integer num32 = bm8Var.d;
            if (num32 != null) {
                intValue = num32.intValue();
            } else {
                hashCode = bm8Var.c.hashCode() + bm8Var.b.b() + bm8Var.a.hashCode() + ern.a(bm8.class).hashCode();
                bm8Var.d = Integer.valueOf(hashCode);
                intValue = hashCode;
            }
        } else if (this instanceof tk8) {
            hm8 hm8Var = ((tk8) this).b;
            Integer num33 = hm8Var.c;
            if (num33 != null) {
                intValue = num33.intValue();
            } else {
                i2 = hm8Var.b.hashCode() + hm8Var.a.hashCode() + ern.a(hm8.class).hashCode();
                hm8Var.c = Integer.valueOf(i2);
                intValue = i2;
            }
        } else if (this instanceof ek8) {
            jf8 jf8Var = ((ek8) this).b;
            Integer num34 = jf8Var.a;
            if (num34 != null) {
                intValue = num34.intValue();
            } else {
                i2 = ern.a(jf8.class).hashCode();
                jf8Var.a = Integer.valueOf(i2);
                intValue = i2;
            }
        } else {
            if (!(this instanceof lk8)) {
                b6e.s();
                return 0;
            }
            uh8 uh8Var = ((lk8) this).b;
            Integer num35 = uh8Var.c;
            if (num35 != null) {
                intValue = num35.intValue();
            } else {
                int hashCode25 = uh8Var.a.hashCode() + ern.a(uh8.class).hashCode();
                th8 th8Var = uh8Var.b;
                Integer num36 = th8Var.c;
                if (num36 != null) {
                    i = num36.intValue();
                } else {
                    int hashCode26 = ern.a(th8.class).hashCode();
                    szb szbVar8 = th8Var.a;
                    int hashCode27 = hashCode26 + (szbVar8 != null ? szbVar8.hashCode() : 0) + th8Var.b.hashCode();
                    th8Var.c = Integer.valueOf(hashCode27);
                    i = hashCode27;
                }
                i2 = i + hashCode25;
                uh8Var.c = Integer.valueOf(i2);
                intValue = i2;
            }
        }
        int i18 = hashCode4 + intValue;
        this.a = Integer.valueOf(i18);
        return i18;
    }

    public final Object c() {
        if (this instanceof xj8) {
            return ((xj8) this).b;
        }
        if (this instanceof yj8) {
            return ((yj8) this).b;
        }
        if (this instanceof zj8) {
            return ((zj8) this).b;
        }
        if (this instanceof ak8) {
            return ((ak8) this).b;
        }
        if (this instanceof bk8) {
            return ((bk8) this).b;
        }
        if (this instanceof ck8) {
            return ((ck8) this).b;
        }
        if (this instanceof dk8) {
            return ((dk8) this).b;
        }
        if (this instanceof fk8) {
            return ((fk8) this).b;
        }
        if (this instanceof gk8) {
            return ((gk8) this).b;
        }
        if (this instanceof hk8) {
            return ((hk8) this).b;
        }
        if (this instanceof ik8) {
            return ((ik8) this).b;
        }
        if (this instanceof jk8) {
            return ((jk8) this).b;
        }
        if (this instanceof kk8) {
            return ((kk8) this).b;
        }
        if (this instanceof mk8) {
            return ((mk8) this).b;
        }
        if (this instanceof nk8) {
            return ((nk8) this).b;
        }
        if (this instanceof ok8) {
            return ((ok8) this).b;
        }
        if (this instanceof pk8) {
            return ((pk8) this).b;
        }
        if (this instanceof qk8) {
            return ((qk8) this).b;
        }
        if (this instanceof rk8) {
            return ((rk8) this).b;
        }
        if (this instanceof sk8) {
            return ((sk8) this).b;
        }
        if (this instanceof tk8) {
            return ((tk8) this).b;
        }
        if (this instanceof ek8) {
            return ((ek8) this).b;
        }
        if (this instanceof lk8) {
            return ((lk8) this).b;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((zk8) rj3.b.k1.getValue()).b(rj3.a, this);
    }
}
