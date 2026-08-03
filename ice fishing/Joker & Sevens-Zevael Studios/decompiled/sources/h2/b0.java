package h2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f2627a = bc.a0.t(14);

    /* renamed from: b, reason: collision with root package name */
    public static final long f2628b = bc.a0.t(0);

    /* renamed from: c, reason: collision with root package name */
    public static final long f2629c = f1.q.f2282g;

    /* renamed from: d, reason: collision with root package name */
    public static final r2.o f2630d;

    static {
        long j3 = f1.q.f2277b;
        f2630d = j3 != 16 ? new r2.c(j3) : r2.n.f6036a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x00b6, code lost:
    
        if (r15.equals(r24.f2620i) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x00c5, code lost:
    
        if (r39.equals(r24.f2621j) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x00d4, code lost:
    
        if (r40.equals(r24.f2622k) == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final a0 a(a0 a0Var, long j3, f1.d0 d0Var, float f10, long j6, k2.l lVar, k2.j jVar, k2.k kVar, k2.r rVar, String str, long j10, r2.a aVar, r2.p pVar, n2.b bVar, long j11, r2.l lVar2, f1.f0 f0Var, h1.c cVar) {
        r2.a aVar2;
        long j12;
        f1.f0 f0Var2;
        h1.c cVar2;
        r2.o cVar3;
        r2.o oVar;
        boolean z10;
        k2.j jVar2 = jVar;
        k2.k kVar2 = kVar;
        k2.r rVar2 = rVar;
        String str2 = str;
        long j13 = j10;
        s2.o[] oVarArr = s2.n.f6400b;
        long j14 = j6 & 1095216660480L;
        if ((j14 == 0 || s2.n.a(j6, a0Var.f2613b)) && ((d0Var != null || j3 == 16 || f1.q.c(j3, a0Var.f2612a.b())) && ((jVar2 == null || jVar2.equals(a0Var.f2615d)) && ((lVar == null || lVar.equals(a0Var.f2614c)) && ((rVar2 == null || rVar2 == a0Var.f2617f) && (((j13 & 1095216660480L) == 0 || s2.n.a(j13, a0Var.f2619h)) && ((lVar2 == null || lVar2.equals(a0Var.f2624m)) && pc.j.a(d0Var, a0Var.f2612a.c()) && ((d0Var == null || f10 == a0Var.f2612a.a()) && ((kVar2 == null || kVar2.equals(a0Var.f2616e)) && (str2 == null || str2.equals(a0Var.f2618g))))))))))) {
            if (aVar != null) {
                aVar2 = aVar;
            } else {
                aVar2 = aVar;
            }
            if (pVar == null) {
            }
            if (bVar == null) {
            }
            j12 = j11;
            if (j12 == 16 || f1.q.c(j12, a0Var.f2623l)) {
                f0Var2 = f0Var;
                if (f0Var2 == null || f0Var2.equals(a0Var.f2625n)) {
                    cVar2 = cVar;
                    if (cVar2 == null || cVar2.equals(a0Var.f2626o)) {
                        return a0Var;
                    }
                    r2.n nVar = r2.n.f6036a;
                    if (d0Var != null) {
                        if (j3 != 16) {
                            cVar3 = new r2.c(j3);
                        }
                        cVar3 = nVar;
                    } else if (d0Var instanceof f1.i0) {
                        long A = i7.b.A(((f1.i0) d0Var).f2264e, f10);
                        if (A != 16) {
                            cVar3 = new r2.c(A);
                        }
                        cVar3 = nVar;
                    } else {
                        if (!(d0Var instanceof f1.n)) {
                            throw new ac.d();
                        }
                        cVar3 = new r2.b((f1.n) d0Var, f10);
                    }
                    oVar = a0Var.f2612a;
                    oVar.getClass();
                    z10 = cVar3 instanceof r2.b;
                    if (!z10 && (oVar instanceof r2.b)) {
                        r2.b bVar2 = (r2.b) cVar3;
                        f1.n nVar2 = bVar2.f6014a;
                        float f11 = bVar2.f6015b;
                        if (Float.isNaN(f11)) {
                            f11 = ((r2.b) oVar).f6015b;
                        }
                        cVar3 = new r2.b(nVar2, f11);
                    } else if ((z10 || (oVar instanceof r2.b)) && ((!z10 && (oVar instanceof r2.b)) || cVar3.equals(nVar))) {
                        cVar3 = oVar;
                    }
                    if (rVar2 == null) {
                        rVar2 = a0Var.f2617f;
                    }
                    long j15 = j14 != 0 ? a0Var.f2613b : j6;
                    k2.l lVar3 = lVar != null ? a0Var.f2614c : lVar;
                    if (jVar2 == null) {
                        jVar2 = a0Var.f2615d;
                    }
                    if (kVar2 == null) {
                        kVar2 = a0Var.f2616e;
                    }
                    if (str2 == null) {
                        str2 = a0Var.f2618g;
                    }
                    if ((j13 & 1095216660480L) == 0) {
                        j13 = a0Var.f2619h;
                    }
                    if (aVar2 == null) {
                        aVar2 = a0Var.f2620i;
                    }
                    long j16 = j15;
                    r2.p pVar2 = pVar != null ? a0Var.f2621j : pVar;
                    n2.b bVar3 = bVar != null ? a0Var.f2622k : bVar;
                    if (j12 == 16) {
                        j12 = a0Var.f2623l;
                    }
                    r2.p pVar3 = pVar2;
                    r2.l lVar4 = lVar2 != null ? a0Var.f2624m : lVar2;
                    if (f0Var2 == null) {
                        f0Var2 = a0Var.f2625n;
                    }
                    return new a0(cVar3, j16, lVar3, jVar2, kVar2, rVar2, str2, j13, aVar2, pVar3, bVar3, j12, lVar4, f0Var2, cVar2 != null ? a0Var.f2626o : cVar2);
                }
                cVar2 = cVar;
                r2.n nVar3 = r2.n.f6036a;
                if (d0Var != null) {
                }
                oVar = a0Var.f2612a;
                oVar.getClass();
                z10 = cVar3 instanceof r2.b;
                if (!z10) {
                }
                if (z10) {
                }
                cVar3 = oVar;
                if (rVar2 == null) {
                }
                if (j14 != 0) {
                }
                if (lVar != null) {
                }
                if (jVar2 == null) {
                }
                if (kVar2 == null) {
                }
                if (str2 == null) {
                }
                if ((j13 & 1095216660480L) == 0) {
                }
                if (aVar2 == null) {
                }
                long j162 = j15;
                if (pVar != null) {
                }
                if (bVar != null) {
                }
                if (j12 == 16) {
                }
                r2.p pVar32 = pVar2;
                if (lVar2 != null) {
                }
                if (f0Var2 == null) {
                }
                return new a0(cVar3, j162, lVar3, jVar2, kVar2, rVar2, str2, j13, aVar2, pVar32, bVar3, j12, lVar4, f0Var2, cVar2 != null ? a0Var.f2626o : cVar2);
            }
            f0Var2 = f0Var;
            cVar2 = cVar;
            r2.n nVar32 = r2.n.f6036a;
            if (d0Var != null) {
            }
            oVar = a0Var.f2612a;
            oVar.getClass();
            z10 = cVar3 instanceof r2.b;
            if (!z10) {
            }
            if (z10) {
            }
            cVar3 = oVar;
            if (rVar2 == null) {
            }
            if (j14 != 0) {
            }
            if (lVar != null) {
            }
            if (jVar2 == null) {
            }
            if (kVar2 == null) {
            }
            if (str2 == null) {
            }
            if ((j13 & 1095216660480L) == 0) {
            }
            if (aVar2 == null) {
            }
            long j1622 = j15;
            if (pVar != null) {
            }
            if (bVar != null) {
            }
            if (j12 == 16) {
            }
            r2.p pVar322 = pVar2;
            if (lVar2 != null) {
            }
            if (f0Var2 == null) {
            }
            return new a0(cVar3, j1622, lVar3, jVar2, kVar2, rVar2, str2, j13, aVar2, pVar322, bVar3, j12, lVar4, f0Var2, cVar2 != null ? a0Var.f2626o : cVar2);
        }
        aVar2 = aVar;
        j12 = j11;
        f0Var2 = f0Var;
        cVar2 = cVar;
        r2.n nVar322 = r2.n.f6036a;
        if (d0Var != null) {
        }
        oVar = a0Var.f2612a;
        oVar.getClass();
        z10 = cVar3 instanceof r2.b;
        if (!z10) {
        }
        if (z10) {
        }
        cVar3 = oVar;
        if (rVar2 == null) {
        }
        if (j14 != 0) {
        }
        if (lVar != null) {
        }
        if (jVar2 == null) {
        }
        if (kVar2 == null) {
        }
        if (str2 == null) {
        }
        if ((j13 & 1095216660480L) == 0) {
        }
        if (aVar2 == null) {
        }
        long j16222 = j15;
        if (pVar != null) {
        }
        if (bVar != null) {
        }
        if (j12 == 16) {
        }
        r2.p pVar3222 = pVar2;
        if (lVar2 != null) {
        }
        if (f0Var2 == null) {
        }
        return new a0(cVar3, j16222, lVar3, jVar2, kVar2, rVar2, str2, j13, aVar2, pVar3222, bVar3, j12, lVar4, f0Var2, cVar2 != null ? a0Var.f2626o : cVar2);
    }
}
