package com.gamericefishpro.space.y;

import android.os.Build;
import android.view.KeyEvent;
import android.widget.EdgeEffect;
import com.gamericefishpro.space.t0.l1;
import com.gamericefishpro.space.t0.p1;
import com.gamericefishpro.space.z.k1;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {
    public static final void a(int i, com.gamericefishpro.space.h1.m mVar, com.gamericefishpro.space.t0.r rVar, Function1 function1) {
        rVar.b0(-932836462);
        int i2 = (rVar.f(mVar) ? 4 : 2) | i | (rVar.h(function1) ? 32 : 16);
        if (rVar.S(i2 & 1, (i2 & 19) != 18)) {
            com.gamericefishpro.space.d0.j.c(com.gamericefishpro.space.l1.h.d(mVar, function1), rVar);
        } else {
            rVar.V();
        }
        p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.d0.w(i, 17, mVar, function1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x009c  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:66:0x00be  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:70:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:75:0x0100  */
    /* JADX WARN: Code duplicated, block: B:78:0x0123  */
    /* JADX WARN: Code duplicated, block: B:79:0x0127  */
    /* JADX WARN: Code duplicated, block: B:81:0x014e  */
    /* JADX WARN: Code duplicated, block: B:84:0x015b  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    public static final void b(final com.gamericefishpro.space.t1.b bVar, final String str, final com.gamericefishpro.space.h1.m mVar, com.gamericefishpro.space.h1.e eVar, com.gamericefishpro.space.f2.o0 o0Var, float f, com.gamericefishpro.space.t0.r rVar, final int i, final int i2) {
        int i3;
        com.gamericefishpro.space.f2.o0 o0Var2;
        int i4;
        float f2;
        int i5;
        int i6;
        boolean z;
        final com.gamericefishpro.space.h1.e eVar2;
        final com.gamericefishpro.space.f2.o0 o0Var3;
        final float f3;
        p1 p1VarT;
        float f4;
        com.gamericefishpro.space.t0.f fVar;
        com.gamericefishpro.space.h1.m bVar2;
        Object objP;
        com.gamericefishpro.space.h2.y yVar;
        boolean z2;
        Object objP2;
        rVar.b0(1142754848);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? rVar.f(bVar) : rVar.h(bVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= rVar.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= rVar.f(mVar) ? 256 : 128;
        }
        int i7 = i3 | 3072;
        int i8 = i2 & 16;
        if (i8 == 0) {
            if ((i & 24576) == 0) {
                o0Var2 = o0Var;
                i7 |= rVar.f(o0Var2) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    f2 = f;
                    if (rVar.c(f2)) {
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i7 |= i5;
                }
                i6 = i7 | 1572864;
                if ((599187 & i6) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (rVar.S(i6 & 1, z)) {
                    com.gamericefishpro.space.h1.e eVar3 = com.gamericefishpro.space.h1.b.w;
                    if (i8 != 0) {
                        o0Var2 = com.gamericefishpro.space.f2.h.b;
                    }
                    if (i4 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    fVar = com.gamericefishpro.space.t0.n.a;
                    if (str != null) {
                        rVar.a0(1899222916);
                        if ((i6 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objP2 = rVar.P();
                        if (z2 || objP2 == fVar) {
                            objP2 = new com.gamericefishpro.space.i5.f(str, 2);
                            rVar.k0(objP2);
                        }
                        AtomicInteger atomicInteger = com.gamericefishpro.space.o2.m.a;
                        bVar2 = new com.gamericefishpro.space.o2.b((Function1) objP2, false);
                        rVar.p(false);
                    } else {
                        rVar.a0(1899381698);
                        rVar.p(false);
                        bVar2 = com.gamericefishpro.space.h1.j.a;
                    }
                    com.gamericefishpro.space.h1.m mVarC = com.gamericefishpro.space.l1.h.c(mVar.c(bVar2));
                    com.gamericefishpro.space.f2.o0 o0Var4 = o0Var2;
                    com.gamericefishpro.space.h1.m mVarE = com.gamericefishpro.space.l1.h.e(mVarC, bVar, o0Var4, f4, null, 2);
                    objP = rVar.P();
                    if (objP == fVar) {
                        objP = m0.a;
                        rVar.k0(objP);
                    }
                    com.gamericefishpro.space.f2.l0 l0Var = (com.gamericefishpro.space.f2.l0) objP;
                    int iHashCode = Long.hashCode(rVar.T);
                    com.gamericefishpro.space.h1.m mVarF = com.gamericefishpro.space.d9.h.F(mVarE, rVar);
                    l1 l1VarL = rVar.l();
                    com.gamericefishpro.space.h2.g.a.getClass();
                    yVar = com.gamericefishpro.space.h2.f.b;
                    rVar.d0();
                    if (rVar.S) {
                        rVar.k(yVar);
                    } else {
                        rVar.n0();
                    }
                    com.gamericefishpro.space.t0.i.B(rVar, l0Var, com.gamericefishpro.space.h2.f.e);
                    com.gamericefishpro.space.t0.i.B(rVar, l1VarL, com.gamericefishpro.space.h2.f.d);
                    com.gamericefishpro.space.t0.i.x(rVar, com.gamericefishpro.space.h2.f.g);
                    com.gamericefishpro.space.t0.i.B(rVar, mVarF, com.gamericefishpro.space.h2.f.c);
                    com.gamericefishpro.space.t0.i.t(rVar, Integer.valueOf(iHashCode), com.gamericefishpro.space.h2.f.f);
                    rVar.p(true);
                    o0Var3 = o0Var4;
                    f3 = f4;
                    eVar2 = eVar3;
                } else {
                    rVar.V();
                    eVar2 = eVar;
                    o0Var3 = o0Var2;
                    f3 = f2;
                }
                p1VarT = rVar.t();
                if (p1VarT != null) {
                    p1VarT.d = new Function2() { // from class: com.gamericefishpro.space.y.l0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            q.b(bVar, str, mVar, eVar2, o0Var3, f3, (com.gamericefishpro.space.t0.r) obj, com.gamericefishpro.space.t0.i.D(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i7 |= 196608;
            f2 = f;
            i6 = i7 | 1572864;
            if ((599187 & i6) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (rVar.S(i6 & 1, z)) {
                com.gamericefishpro.space.h1.e eVar4 = com.gamericefishpro.space.h1.b.w;
                if (i8 != 0) {
                    o0Var2 = com.gamericefishpro.space.f2.h.b;
                }
                if (i4 != 0) {
                    f4 = 1.0f;
                } else {
                    f4 = f2;
                }
                fVar = com.gamericefishpro.space.t0.n.a;
                if (str != null) {
                    rVar.a0(1899222916);
                    if ((i6 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objP2 = rVar.P();
                    if (z2) {
                        objP2 = new com.gamericefishpro.space.i5.f(str, 2);
                        rVar.k0(objP2);
                    } else {
                        objP2 = new com.gamericefishpro.space.i5.f(str, 2);
                        rVar.k0(objP2);
                    }
                    AtomicInteger atomicInteger2 = com.gamericefishpro.space.o2.m.a;
                    bVar2 = new com.gamericefishpro.space.o2.b((Function1) objP2, false);
                    rVar.p(false);
                } else {
                    rVar.a0(1899381698);
                    rVar.p(false);
                    bVar2 = com.gamericefishpro.space.h1.j.a;
                }
                com.gamericefishpro.space.h1.m mVarC2 = com.gamericefishpro.space.l1.h.c(mVar.c(bVar2));
                com.gamericefishpro.space.f2.o0 o0Var5 = o0Var2;
                com.gamericefishpro.space.h1.m mVarE2 = com.gamericefishpro.space.l1.h.e(mVarC2, bVar, o0Var5, f4, null, 2);
                objP = rVar.P();
                if (objP == fVar) {
                    objP = m0.a;
                    rVar.k0(objP);
                }
                com.gamericefishpro.space.f2.l0 l0Var2 = (com.gamericefishpro.space.f2.l0) objP;
                int iHashCode2 = Long.hashCode(rVar.T);
                com.gamericefishpro.space.h1.m mVarF2 = com.gamericefishpro.space.d9.h.F(mVarE2, rVar);
                l1 l1VarL2 = rVar.l();
                com.gamericefishpro.space.h2.g.a.getClass();
                yVar = com.gamericefishpro.space.h2.f.b;
                rVar.d0();
                if (rVar.S) {
                    rVar.k(yVar);
                } else {
                    rVar.n0();
                }
                com.gamericefishpro.space.t0.i.B(rVar, l0Var2, com.gamericefishpro.space.h2.f.e);
                com.gamericefishpro.space.t0.i.B(rVar, l1VarL2, com.gamericefishpro.space.h2.f.d);
                com.gamericefishpro.space.t0.i.x(rVar, com.gamericefishpro.space.h2.f.g);
                com.gamericefishpro.space.t0.i.B(rVar, mVarF2, com.gamericefishpro.space.h2.f.c);
                com.gamericefishpro.space.t0.i.t(rVar, Integer.valueOf(iHashCode2), com.gamericefishpro.space.h2.f.f);
                rVar.p(true);
                o0Var3 = o0Var5;
                f3 = f4;
                eVar2 = eVar4;
            } else {
                rVar.V();
                eVar2 = eVar;
                o0Var3 = o0Var2;
                f3 = f2;
            }
            p1VarT = rVar.t();
            if (p1VarT != null) {
                p1VarT.d = new Function2() { // from class: com.gamericefishpro.space.y.l0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        q.b(bVar, str, mVar, eVar2, o0Var3, f3, (com.gamericefishpro.space.t0.r) obj, com.gamericefishpro.space.t0.i.D(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i7 = i3 | 27648;
        o0Var2 = o0Var;
        i4 = i2 & 32;
        if (i4 != 0) {
            if ((196608 & i) == 0) {
                f2 = f;
                if (rVar.c(f2)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i7 |= i5;
            }
            i6 = i7 | 1572864;
            if ((599187 & i6) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (rVar.S(i6 & 1, z)) {
                com.gamericefishpro.space.h1.e eVar5 = com.gamericefishpro.space.h1.b.w;
                if (i8 != 0) {
                    o0Var2 = com.gamericefishpro.space.f2.h.b;
                }
                if (i4 != 0) {
                    f4 = 1.0f;
                } else {
                    f4 = f2;
                }
                fVar = com.gamericefishpro.space.t0.n.a;
                if (str != null) {
                    rVar.a0(1899222916);
                    if ((i6 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objP2 = rVar.P();
                    if (z2) {
                        objP2 = new com.gamericefishpro.space.i5.f(str, 2);
                        rVar.k0(objP2);
                    } else {
                        objP2 = new com.gamericefishpro.space.i5.f(str, 2);
                        rVar.k0(objP2);
                    }
                    AtomicInteger atomicInteger3 = com.gamericefishpro.space.o2.m.a;
                    bVar2 = new com.gamericefishpro.space.o2.b((Function1) objP2, false);
                    rVar.p(false);
                } else {
                    rVar.a0(1899381698);
                    rVar.p(false);
                    bVar2 = com.gamericefishpro.space.h1.j.a;
                }
                com.gamericefishpro.space.h1.m mVarC3 = com.gamericefishpro.space.l1.h.c(mVar.c(bVar2));
                com.gamericefishpro.space.f2.o0 o0Var6 = o0Var2;
                com.gamericefishpro.space.h1.m mVarE3 = com.gamericefishpro.space.l1.h.e(mVarC3, bVar, o0Var6, f4, null, 2);
                objP = rVar.P();
                if (objP == fVar) {
                    objP = m0.a;
                    rVar.k0(objP);
                }
                com.gamericefishpro.space.f2.l0 l0Var3 = (com.gamericefishpro.space.f2.l0) objP;
                int iHashCode3 = Long.hashCode(rVar.T);
                com.gamericefishpro.space.h1.m mVarF3 = com.gamericefishpro.space.d9.h.F(mVarE3, rVar);
                l1 l1VarL3 = rVar.l();
                com.gamericefishpro.space.h2.g.a.getClass();
                yVar = com.gamericefishpro.space.h2.f.b;
                rVar.d0();
                if (rVar.S) {
                    rVar.k(yVar);
                } else {
                    rVar.n0();
                }
                com.gamericefishpro.space.t0.i.B(rVar, l0Var3, com.gamericefishpro.space.h2.f.e);
                com.gamericefishpro.space.t0.i.B(rVar, l1VarL3, com.gamericefishpro.space.h2.f.d);
                com.gamericefishpro.space.t0.i.x(rVar, com.gamericefishpro.space.h2.f.g);
                com.gamericefishpro.space.t0.i.B(rVar, mVarF3, com.gamericefishpro.space.h2.f.c);
                com.gamericefishpro.space.t0.i.t(rVar, Integer.valueOf(iHashCode3), com.gamericefishpro.space.h2.f.f);
                rVar.p(true);
                o0Var3 = o0Var6;
                f3 = f4;
                eVar2 = eVar5;
            } else {
                rVar.V();
                eVar2 = eVar;
                o0Var3 = o0Var2;
                f3 = f2;
            }
            p1VarT = rVar.t();
            if (p1VarT != null) {
                p1VarT.d = new Function2() { // from class: com.gamericefishpro.space.y.l0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        q.b(bVar, str, mVar, eVar2, o0Var3, f3, (com.gamericefishpro.space.t0.r) obj, com.gamericefishpro.space.t0.i.D(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i7 |= 196608;
        f2 = f;
        i6 = i7 | 1572864;
        if ((599187 & i6) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (rVar.S(i6 & 1, z)) {
            com.gamericefishpro.space.h1.e eVar6 = com.gamericefishpro.space.h1.b.w;
            if (i8 != 0) {
                o0Var2 = com.gamericefishpro.space.f2.h.b;
            }
            if (i4 != 0) {
                f4 = 1.0f;
            } else {
                f4 = f2;
            }
            fVar = com.gamericefishpro.space.t0.n.a;
            if (str != null) {
                rVar.a0(1899222916);
                if ((i6 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objP2 = rVar.P();
                if (z2) {
                    objP2 = new com.gamericefishpro.space.i5.f(str, 2);
                    rVar.k0(objP2);
                } else {
                    objP2 = new com.gamericefishpro.space.i5.f(str, 2);
                    rVar.k0(objP2);
                }
                AtomicInteger atomicInteger4 = com.gamericefishpro.space.o2.m.a;
                bVar2 = new com.gamericefishpro.space.o2.b((Function1) objP2, false);
                rVar.p(false);
            } else {
                rVar.a0(1899381698);
                rVar.p(false);
                bVar2 = com.gamericefishpro.space.h1.j.a;
            }
            com.gamericefishpro.space.h1.m mVarC4 = com.gamericefishpro.space.l1.h.c(mVar.c(bVar2));
            com.gamericefishpro.space.f2.o0 o0Var7 = o0Var2;
            com.gamericefishpro.space.h1.m mVarE4 = com.gamericefishpro.space.l1.h.e(mVarC4, bVar, o0Var7, f4, null, 2);
            objP = rVar.P();
            if (objP == fVar) {
                objP = m0.a;
                rVar.k0(objP);
            }
            com.gamericefishpro.space.f2.l0 l0Var4 = (com.gamericefishpro.space.f2.l0) objP;
            int iHashCode4 = Long.hashCode(rVar.T);
            com.gamericefishpro.space.h1.m mVarF4 = com.gamericefishpro.space.d9.h.F(mVarE4, rVar);
            l1 l1VarL4 = rVar.l();
            com.gamericefishpro.space.h2.g.a.getClass();
            yVar = com.gamericefishpro.space.h2.f.b;
            rVar.d0();
            if (rVar.S) {
                rVar.k(yVar);
            } else {
                rVar.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar, l0Var4, com.gamericefishpro.space.h2.f.e);
            com.gamericefishpro.space.t0.i.B(rVar, l1VarL4, com.gamericefishpro.space.h2.f.d);
            com.gamericefishpro.space.t0.i.x(rVar, com.gamericefishpro.space.h2.f.g);
            com.gamericefishpro.space.t0.i.B(rVar, mVarF4, com.gamericefishpro.space.h2.f.c);
            com.gamericefishpro.space.t0.i.t(rVar, Integer.valueOf(iHashCode4), com.gamericefishpro.space.h2.f.f);
            rVar.p(true);
            o0Var3 = o0Var7;
            f3 = f4;
            eVar2 = eVar6;
        } else {
            rVar.V();
            eVar2 = eVar;
            o0Var3 = o0Var2;
            f3 = f2;
        }
        p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new Function2() { // from class: com.gamericefishpro.space.y.l0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    q.b(bVar, str, mVar, eVar2, o0Var3, f3, (com.gamericefishpro.space.t0.r) obj, com.gamericefishpro.space.t0.i.D(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    public static float c(EdgeEffect edgeEffect, float f, float f2, com.gamericefishpro.space.c3.c cVar) {
        float f3 = e0.a;
        double dB = cVar.b() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f) * 0.35f;
        double d = ((double) e0.a) * dB;
        float fExp = (float) (Math.exp((e0.b / e0.c) * Math.log(dAbs / d)) * d);
        int i = Build.VERSION.SDK_INT;
        if (fExp > (i >= 31 ? o.b(edgeEffect) : 0.0f) * f2) {
            return 0.0f;
        }
        int iA = com.gamericefishpro.space.gi.c.a(f);
        if (i >= 31) {
            edgeEffect.onAbsorb(iA);
            return f;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(iA);
        }
        return f;
    }

    public static com.gamericefishpro.space.h1.m d(com.gamericefishpro.space.h1.m mVar, com.gamericefishpro.space.o1.i0 i0Var, com.gamericefishpro.space.o1.k0 k0Var, int i) {
        if ((i & 2) != 0) {
            k0Var = com.gamericefishpro.space.o1.o.b;
        }
        return mVar.c(new p(0L, i0Var, k0Var, 1));
    }

    public static final com.gamericefishpro.space.h1.m e(com.gamericefishpro.space.h1.m mVar, long j, com.gamericefishpro.space.o1.k0 k0Var) {
        return mVar.c(new p(j, null, k0Var, 2));
    }

    public static final com.gamericefishpro.space.h1.m g(com.gamericefishpro.space.h1.m mVar, float f, long j, com.gamericefishpro.space.o1.k0 k0Var) {
        return mVar.c(new x(f, new com.gamericefishpro.space.o1.m0(j), k0Var));
    }

    public static final void h(long j, com.gamericefishpro.space.z.v0 v0Var) {
        if (v0Var == com.gamericefishpro.space.z.v0.d) {
            if (com.gamericefishpro.space.c3.a.g(j) != Integer.MAX_VALUE) {
                return;
            }
            com.gamericefishpro.space.c0.a.c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (com.gamericefishpro.space.c3.a.h(j) != Integer.MAX_VALUE) {
                return;
            }
            com.gamericefishpro.space.c0.a.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static com.gamericefishpro.space.h1.m i(com.gamericefishpro.space.h1.m mVar, com.gamericefishpro.space.b0.i iVar, boolean z, Function0 function0, int i) {
        if ((i & 4) != 0) {
            z = true;
        }
        return mVar.c(new y(iVar, false, z, function0));
    }

    public static com.gamericefishpro.space.h1.m j(com.gamericefishpro.space.h1.m mVar, Function0 function0) {
        return mVar.c(new y(null, true, true, function0));
    }

    public static final boolean k(KeyEvent keyEvent) {
        long jH = com.gamericefishpro.space.i.a.h(keyEvent.getKeyCode());
        return com.gamericefishpro.space.z1.a.a(jH, com.gamericefishpro.space.z1.a.h) || com.gamericefishpro.space.z1.a.a(jH, com.gamericefishpro.space.z1.a.k) || com.gamericefishpro.space.z1.a.a(jH, com.gamericefishpro.space.z1.a.o) || com.gamericefishpro.space.z1.a.a(jH, com.gamericefishpro.space.z1.a.j);
    }

    public static com.gamericefishpro.space.h1.m l(com.gamericefishpro.space.h1.m mVar, k1 k1Var, com.gamericefishpro.space.z.v0 v0Var, l lVar, boolean z, com.gamericefishpro.space.z.k kVar, com.gamericefishpro.space.b0.i iVar) {
        float f = b0.a;
        com.gamericefishpro.space.z.v0 v0Var2 = com.gamericefishpro.space.z.v0.d;
        com.gamericefishpro.space.h1.j jVar = com.gamericefishpro.space.h1.j.a;
        return mVar.c(v0Var == v0Var2 ? com.gamericefishpro.space.l1.h.b(jVar, k0.c) : com.gamericefishpro.space.l1.h.b(jVar, k0.b)).c(new d1(iVar, lVar, kVar, v0Var, k1Var, z, false));
    }

    public static final long m(long j, float f) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j >> 32)) - f);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) - f);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }

    public static com.gamericefishpro.space.h1.m n(com.gamericefishpro.space.h1.m mVar, c1 c1Var) {
        com.gamericefishpro.space.z.v0 v0Var = com.gamericefishpro.space.z.v0.d;
        com.gamericefishpro.space.b0.i iVar = c1Var.d;
        float f = b0.a;
        return mVar.c(com.gamericefishpro.space.l1.h.b(com.gamericefishpro.space.h1.j.a, k0.c)).c(new d1(iVar, null, null, v0Var, c1Var, true, true)).c(new f1(c1Var));
    }
}
