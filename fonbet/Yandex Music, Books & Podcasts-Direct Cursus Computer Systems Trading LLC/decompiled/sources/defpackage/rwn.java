package defpackage;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class rwn implements y73 {
    public final htd a;
    public qwn b;

    public rwn(htd htdVar) {
        this.a = htdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1, types: [xzi] */
    /* JADX WARN: Type inference failed for: r19v0, types: [float] */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    @Override // defpackage.y73
    public final void a(opf opfVar) {
        nsh nshVar;
        long j;
        nsh nshVar2;
        long j2;
        float f;
        nsh nshVar3;
        long B;
        ou3 ou3Var = opfVar.a;
        ucm ucmVar = new ucm(14, this);
        final htd htdVar = this.a;
        final float a = itd.a(htdVar);
        long K = nt0.K(nmq.f(a, htdVar.z));
        final long j3 = htdVar.A;
        if (((int) (K >> 32)) <= 0 || ((int) (4294967295L & K)) <= 0) {
            return;
        }
        long j4 = htdVar.E;
        if (j4 == 16) {
            j4 = htdVar.u.a;
        }
        if (j4 == 16) {
            j4 = htdVar.t.a;
        }
        if (j4 == 16) {
            xq0.x("backgroundColor not specified. Please provide a color.");
            return;
        }
        uod uodVar = (uod) men.t(htdVar, es5.g);
        xod b = uodVar.b();
        final long j5 = j4;
        opfVar.c(K, b, new Function1() { // from class: a83
            /* JADX WARN: Code restructure failed: missing block: B:164:0x02af, code lost:
            
                if (((int) (r2 & r17)) > 0) goto L162;
             */
            /* JADX WARN: Code restructure failed: missing block: B:185:0x026d, code lost:
            
                if (((int) (r13 & r17)) > 0) goto L145;
             */
            /* JADX WARN: Code restructure failed: missing block: B:60:0x0137, code lost:
            
                if (((int) (r14 & 4294967295L)) > 0) goto L59;
             */
            /* JADX WARN: Finally extract failed */
            /* JADX WARN: Removed duplicated region for block: B:86:0x0182 A[Catch: all -> 0x00bd, TryCatch #12 {all -> 0x00bd, blocks: (B:24:0x00a9, B:26:0x00b8, B:27:0x00c2, B:30:0x00ca, B:32:0x00cf, B:37:0x00d7, B:39:0x00dd, B:40:0x00e5, B:45:0x00f6, B:47:0x00ff, B:49:0x0109, B:63:0x0143, B:70:0x0151, B:71:0x015e, B:73:0x015f, B:75:0x0165, B:79:0x016e, B:81:0x0176, B:86:0x0182, B:93:0x018d, B:94:0x0190, B:99:0x0192, B:100:0x0195, B:107:0x0196, B:108:0x019b, B:42:0x00e9, B:29:0x00c6, B:51:0x011c, B:53:0x0122, B:57:0x012b, B:59:0x0134, B:62:0x0140), top: B:23:0x00a9, inners: #2, #6, #10 }] */
            /* JADX WARN: Removed duplicated region for block: B:88:0x0185 A[SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, java.util.List] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.List] */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj) {
                long j6;
                nsh q0;
                long B2;
                long g;
                long j7;
                long j8;
                b2r G;
                Function1 e;
                b2r Q;
                float e2;
                float f2;
                xod xodVar;
                float f3 = a;
                long j9 = j3;
                htd htdVar2 = htdVar;
                jpa jpaVar = (jpa) obj;
                jpaVar.getClass();
                jpa.B(jpaVar, j5, 0L, 0L, 0.0f, null, 0, 126);
                float d = nmq.d(jpaVar.e());
                float b2 = nmq.b(jpaVar.e());
                nsh q02 = jpaVar.q0();
                long B3 = q02.B();
                q02.s().r();
                try {
                    ((xzi) q02.b).W(0.0f, 0.0f, d, b2, 1);
                    q0 = jpaVar.q0();
                    B2 = q0.B();
                    q0.s().r();
                    try {
                        ((xzi) q0.b).f0(f3, f3, 0L);
                        g = enj.g(j9, htdVar2.v);
                    } catch (Throwable th) {
                        th = th;
                        j6 = B3;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    j6 = B3;
                }
                try {
                    try {
                        if (swf.P(g)) {
                            j8 = 4294967295L;
                            try {
                                if (!enj.c(g, 0L)) {
                                    float e3 = enj.e(g);
                                    float f4 = enj.f(g);
                                    ((xzi) jpaVar.q0().b).m0(e3, f4);
                                    try {
                                        Iterator it = htdVar2.I.iterator();
                                        while (it.hasNext()) {
                                            ftd ftdVar = (ftd) it.next();
                                            long j10 = B3;
                                            if (ftdVar.e) {
                                                throw new IllegalArgumentException("Modifier.haze nodes can not draw Modifier.hazeChild nodes. This should not happen if you are providing correct values for zIndex on Modifier.haze. Alternatively you can use can `canDrawArea` to to filter out parent areas.");
                                            }
                                            try {
                                                Iterator it2 = it;
                                                ynn d2 = ywf.d(htdVar2.v, htdVar2.y);
                                                G = wyf.G();
                                                e = G != null ? G.e() : null;
                                                Q = wyf.Q(G);
                                                try {
                                                    ynn a2 = ftdVar.a();
                                                    if (a2 != null && d2.j(a2)) {
                                                        G = wyf.G();
                                                        e = G != null ? G.e() : null;
                                                        Q = wyf.Q(G);
                                                        try {
                                                            long c = ftdVar.c();
                                                            if (!swf.U(c)) {
                                                                c = 0;
                                                            }
                                                            wyf.b0(G, Q, e);
                                                            if (swf.P(c)) {
                                                                long j11 = c;
                                                                if (!enj.c(j11, 0L)) {
                                                                    e2 = enj.e(j11);
                                                                    f2 = enj.f(j11);
                                                                    ((xzi) jpaVar.q0().b).m0(e2, f2);
                                                                    try {
                                                                        xod b3 = ftdVar.b();
                                                                        if (b3 != null) {
                                                                            if (b3.s) {
                                                                                b3 = null;
                                                                            }
                                                                            if (b3 != null) {
                                                                                long j12 = b3.u;
                                                                                if (((int) (j12 >> 32)) > 0) {
                                                                                }
                                                                            }
                                                                        }
                                                                        b3 = null;
                                                                        if (b3 != null) {
                                                                            yd5.s(jpaVar, b3);
                                                                        }
                                                                        ((xzi) jpaVar.q0().b).m0(-e2, -f2);
                                                                    } catch (Throwable th3) {
                                                                        throw th3;
                                                                    }
                                                                }
                                                            }
                                                            xod b4 = ftdVar.b();
                                                            if (b4 != null) {
                                                                if (b4.s) {
                                                                    b4 = null;
                                                                }
                                                                if (b4 != null) {
                                                                    long j13 = b4.u;
                                                                    xod xodVar2 = b4;
                                                                    if (((int) (j13 >> 32)) > 0 && ((int) (j13 & 4294967295L)) > 0) {
                                                                        xodVar = xodVar2;
                                                                        if (xodVar == null) {
                                                                            yd5.s(jpaVar, xodVar);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            xodVar = null;
                                                            if (xodVar == null) {
                                                            }
                                                        } finally {
                                                        }
                                                    }
                                                    it = it2;
                                                    B3 = j10;
                                                } finally {
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                ((xzi) jpaVar.q0().b).m0(-e3, -f4);
                                                throw th;
                                            }
                                        }
                                        j7 = B3;
                                        ((xzi) jpaVar.q0().b).m0(-e3, -f4);
                                        q0.s().k();
                                        q0.R(B2);
                                        vz1.A(q02, j7);
                                        return Unit.a;
                                    } catch (Throwable th5) {
                                        th = th5;
                                    }
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                j7 = B3;
                                j6 = j7;
                                try {
                                    q0.s().k();
                                    q0.R(B2);
                                    throw th;
                                } catch (Throwable th7) {
                                    th = th7;
                                    vz1.A(q02, j6);
                                    throw th;
                                }
                            }
                        } else {
                            j8 = 4294967295L;
                        }
                        q0.s().k();
                        q0.R(B2);
                        vz1.A(q02, j7);
                        return Unit.a;
                    } catch (Throwable th8) {
                        th = th8;
                        j6 = j7;
                        vz1.A(q02, j6);
                        throw th;
                    }
                    j7 = B3;
                    for (ftd ftdVar2 : htdVar2.I) {
                        if (ftdVar2.e) {
                            throw new IllegalArgumentException("Modifier.haze nodes can not draw Modifier.hazeChild nodes. This should not happen if you are providing correct values for zIndex on Modifier.haze. Alternatively you can use can `canDrawArea` to to filter out parent areas.");
                        }
                        ynn d3 = ywf.d(htdVar2.v, htdVar2.y);
                        G = wyf.G();
                        e = G != null ? G.e() : null;
                        Q = wyf.Q(G);
                        try {
                            ynn a3 = ftdVar2.a();
                            if (a3 != null && d3.j(a3)) {
                                G = wyf.G();
                                e = G != null ? G.e() : null;
                                Q = wyf.Q(G);
                                try {
                                    long c2 = ftdVar2.c();
                                    if (!swf.U(c2)) {
                                        c2 = 0;
                                    }
                                    wyf.b0(G, Q, e);
                                    if (!swf.P(c2) || enj.c(c2, 0L)) {
                                        xod b5 = ftdVar2.b();
                                        if (b5 != null) {
                                            if (b5.s) {
                                                b5 = null;
                                            }
                                            if (b5 != null) {
                                                long j14 = b5.u;
                                                if (((int) (j14 >> 32)) > 0) {
                                                }
                                            }
                                        }
                                        b5 = null;
                                        if (b5 != null) {
                                            yd5.s(jpaVar, b5);
                                        }
                                    } else {
                                        e2 = enj.e(c2);
                                        f2 = enj.f(c2);
                                        ((xzi) jpaVar.q0().b).m0(e2, f2);
                                        try {
                                            xod b6 = ftdVar2.b();
                                            if (b6 != null) {
                                                if (b6.s) {
                                                    b6 = null;
                                                }
                                                if (b6 != null) {
                                                    long j15 = b6.u;
                                                    if (((int) (j15 >> 32)) > 0) {
                                                    }
                                                }
                                            }
                                            b6 = null;
                                            if (b6 != null) {
                                                yd5.s(jpaVar, b6);
                                            }
                                            ((xzi) jpaVar.q0().b).m0(-e2, -f2);
                                        } finally {
                                            ((xzi) jpaVar.q0().b).m0(-e2, -f2);
                                        }
                                    }
                                } finally {
                                }
                            }
                        } finally {
                        }
                    }
                } catch (Throwable th9) {
                    th = th9;
                }
            }
        });
        ?? d = nmq.d(ou3Var.e());
        float b2 = nmq.b(ou3Var.e());
        nsh nshVar4 = ou3Var.b;
        long B2 = nshVar4.B();
        nshVar4.s().r();
        try {
            nsh nshVar5 = null;
            ((xzi) nshVar4.b).W(0.0f, 0.0f, d, b2, 1);
            long j6 = j3 ^ (-9223372034707292160L);
            try {
                try {
                    if (swf.P(j6)) {
                        try {
                            if (!enj.c(j6, 0L)) {
                                float e = enj.e(j6);
                                float f2 = enj.f(j6);
                                ((xzi) ou3Var.b.b).m0(e, f2);
                                float f3 = 1.0f / a;
                                try {
                                    try {
                                        nsh nshVar6 = ou3Var.b;
                                        long B3 = nshVar6.B();
                                        nshVar6.s().r();
                                        try {
                                            nshVar2 = nshVar4;
                                            j2 = B2;
                                            try {
                                                ((xzi) nshVar6.b).f0(f3, f3, 0L);
                                                ucmVar.invoke(opfVar, b);
                                                nshVar6.s().k();
                                                nshVar6.R(B3);
                                                ((xzi) ou3Var.b.b).m0(-e, -f2);
                                                nshVar2.s().k();
                                                nshVar2.R(j2);
                                                uodVar.a(b);
                                                return;
                                            } catch (Throwable th) {
                                                th = th;
                                                nshVar6.s().k();
                                                nshVar6.R(B3);
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        ((xzi) ou3Var.b.b).m0(-e, -f2);
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    ((xzi) ou3Var.b.b).m0(-e, -f2);
                                    throw th;
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            nshVar5 = nshVar4;
                            d = B2;
                            nshVar = nshVar5;
                            j = d;
                            vz1.A(nshVar, j);
                            throw th;
                        }
                    }
                    ((xzi) nshVar3.b).f0(f, f, 0L);
                    ucmVar.invoke(opfVar, b);
                    nshVar3.s().k();
                    nshVar3.R(B);
                    nshVar2.s().k();
                    nshVar2.R(j2);
                    uodVar.a(b);
                    return;
                } catch (Throwable th6) {
                    nshVar = nshVar2;
                    j = j2;
                    try {
                        nshVar3.s().k();
                        nshVar3.R(B);
                        throw th6;
                    } catch (Throwable th7) {
                        th = th7;
                        vz1.A(nshVar, j);
                        throw th;
                    }
                }
                nshVar2 = nshVar4;
                j2 = B2;
                f = 1.0f / a;
                nshVar3 = ou3Var.b;
                B = nshVar3.B();
                nshVar3.s().r();
            } catch (Throwable th8) {
                th = th8;
            }
        } catch (Throwable th9) {
            th = th9;
            nshVar = nshVar4;
            j = B2;
        }
    }
}
