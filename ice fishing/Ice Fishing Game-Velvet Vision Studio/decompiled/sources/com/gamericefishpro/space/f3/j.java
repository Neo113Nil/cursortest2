package com.gamericefishpro.space.f3;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.gamericefishpro.space.R;
import com.gamericefishpro.space.d4.d0;
import com.gamericefishpro.space.d4.l0;
import com.gamericefishpro.space.d4.l1;
import com.gamericefishpro.space.d4.o1;
import com.gamericefishpro.space.h2.a1;
import com.gamericefishpro.space.h2.c2;
import com.gamericefishpro.space.h2.f0;
import com.gamericefishpro.space.h2.p1;
import com.gamericefishpro.space.h2.q1;
import com.gamericefishpro.space.i2.m2;
import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.z.h1;
import com.gamericefishpro.space.z4.m0;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j extends ViewGroup implements com.gamericefishpro.space.d4.n, com.gamericefishpro.space.t0.j, p1, com.gamericefishpro.space.d4.p {
    public com.gamericefishpro.space.h1.m A;
    public Function1 B;
    public com.gamericefishpro.space.c3.c C;
    public Function1 D;
    public com.gamericefishpro.space.z4.u E;
    public com.gamericefishpro.space.z5.e F;
    public final int[] G;
    public long H;
    public o1 I;
    public Function1 J;
    public final i K;
    public final i L;
    public Function1 M;
    public final int[] N;
    public int O;
    public int P;
    public final com.gamericefishpro.space.d4.o Q;
    public boolean R;
    public final f0 S;
    public final com.gamericefishpro.space.a2.e d;
    public final View e;
    public final com.gamericefishpro.space.h2.o1 i;
    public Function0 v;
    public boolean w;
    public Function0 y;
    public Function0 z;

    public j(Context context, com.gamericefishpro.space.t0.q qVar, int i, com.gamericefishpro.space.a2.e eVar, View view, com.gamericefishpro.space.h2.o1 o1Var) {
        super(context);
        this.d = eVar;
        this.e = view;
        this.i = o1Var;
        LinkedHashMap linkedHashMap = m2.a;
        setTag(R.id.androidx_compose_ui_view_composition_context, qVar);
        int i2 = 0;
        setSaveFromParentEnabled(false);
        addView(view);
        z zVar = (z) this;
        l0.n(this, new b(zVar, i2));
        d0.i(this, this);
        this.v = h.v;
        this.y = h.i;
        this.z = h.e;
        this.A = com.gamericefishpro.space.h1.j.a;
        this.C = com.gamericefishpro.space.u6.f.a();
        this.G = new int[2];
        this.H = 0L;
        int i3 = 1;
        this.K = new i(zVar, i3);
        this.L = new i(zVar, i2);
        this.N = new int[2];
        this.O = Integer.MIN_VALUE;
        this.P = Integer.MIN_VALUE;
        this.Q = new com.gamericefishpro.space.d4.o();
        f0 f0Var = new f0(3);
        f0Var.I = zVar;
        com.gamericefishpro.space.h1.m mVarC = com.gamericefishpro.space.a2.g.a(eVar).c(new com.gamericefishpro.space.o2.b(c.v, true));
        com.gamericefishpro.space.b2.v vVar = new com.gamericefishpro.space.b2.v();
        vVar.a = new com.gamericefishpro.space.b2.w(zVar, 0);
        com.gamericefishpro.space.b2.z zVar2 = new com.gamericefishpro.space.b2.z();
        com.gamericefishpro.space.b2.z zVar3 = vVar.b;
        if (zVar3 != null) {
            zVar3.e = null;
        }
        vVar.b = zVar2;
        zVar2.e = vVar;
        setOnRequestDisallowInterceptTouchEvent$ui(zVar2);
        com.gamericefishpro.space.h1.m mVarC2 = com.gamericefishpro.space.f2.x.k(com.gamericefishpro.space.l1.h.d(mVarC.c(vVar), new f(zVar, f0Var, zVar)), new d(zVar, f0Var, 2)).c(new p(new com.gamericefishpro.space.b2.w(zVar, 2)));
        f0Var.d0(this.A.c(mVarC2));
        this.B = new com.gamericefishpro.space.b2.t(i3, f0Var, mVarC2);
        f0Var.Z(this.C);
        this.D = new com.gamericefishpro.space.b2.d0(i3, f0Var);
        f0Var.g0 = new d(zVar, f0Var, 0);
        f0Var.h0 = new com.gamericefishpro.space.b2.w(zVar, 1);
        f0Var.c0(new e(zVar, f0Var));
        this.S = f0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q1 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            com.gamericefishpro.space.e2.a.b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return ((com.gamericefishpro.space.i2.t) this.i).getSnapshotObserver();
    }

    public static final int j(z zVar, int i, int i2, int i3) {
        if (i3 >= 0 || i == i2) {
            return View.MeasureSpec.makeMeasureSpec(com.gamericefishpro.space.ji.f.c(i3, i, i2), 1073741824);
        }
        if (i3 != -2 || i2 == Integer.MAX_VALUE) {
            return (i3 != -1 || i2 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
    }

    public static com.gamericefishpro.space.u3.b k(com.gamericefishpro.space.u3.b bVar, int i, int i2, int i3, int i4) {
        int i5 = bVar.a - i;
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = bVar.b - i2;
        if (i6 < 0) {
            i6 = 0;
        }
        int i7 = bVar.c - i3;
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = bVar.d - i4;
        return com.gamericefishpro.space.u3.b.b(i5, i6, i7, i8 >= 0 ? i8 : 0);
    }

    @Override // com.gamericefishpro.space.d4.m
    public final void a(View view, View view2, int i, int i2) {
        com.gamericefishpro.space.d4.o oVar = this.Q;
        if (i2 == 1) {
            oVar.b = i;
        } else {
            oVar.a = i;
        }
    }

    @Override // com.gamericefishpro.space.d4.m
    public final void b(View view, int i) {
        com.gamericefishpro.space.d4.o oVar = this.Q;
        if (i == 1) {
            oVar.b = 0;
        } else {
            oVar.a = 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r7v17 */
    @Override // com.gamericefishpro.space.d4.m
    public final void c(View view, int i, int i2, int[] iArr, int i3) {
        char c;
        long j;
        a1 a1Var;
        byte b;
        ?? r16;
        ?? E;
        long j2;
        if (this.e.isNestedScrollingEnabled()) {
            byte b2 = -1;
            float f = -1;
            char c2 = ' ';
            long j3 = 4294967295L;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i2 * f)) & 4294967295L) | (((long) Float.floatToRawIntBits(i * f)) << 32);
            int i4 = i3 == 0 ? 1 : 2;
            com.gamericefishpro.space.a2.j jVar = this.d.a;
            com.gamericefishpro.space.a2.j jVar2 = null;
            c2 c2Var = null;
            if (jVar == null || !jVar.G) {
                c = ' ';
                j = 4294967295L;
            } else {
                if (!jVar.d.G) {
                    com.gamericefishpro.space.e2.a.b("visitAncestors called on an unattached node");
                }
                com.gamericefishpro.space.h1.l lVar = jVar.d.w;
                f0 f0VarS = com.gamericefishpro.space.h2.k.s(jVar);
                loop0: while (true) {
                    if (f0VarS == null) {
                        c = c2;
                        break;
                    }
                    if ((f0VarS.Z.f.v & 262144) != 0) {
                        while (lVar != null) {
                            if ((lVar.i & 262144) != 0) {
                                ?? r17 = 0;
                                ?? r14 = lVar;
                                while (r14 != 0) {
                                    c = c2;
                                    if (r14 instanceof c2) {
                                        c2 c2Var2 = (c2) r14;
                                        b = b2;
                                        if (Intrinsics.a(jVar.i(), c2Var2.i()) && com.gamericefishpro.space.a2.j.class == c2Var2.getClass()) {
                                            c2Var = c2Var2;
                                            break loop0;
                                        }
                                    } else {
                                        b = b2;
                                        if ((r14.i & 262144) != 0 && (r14 instanceof com.gamericefishpro.space.h2.j)) {
                                            com.gamericefishpro.space.h1.l lVar2 = ((com.gamericefishpro.space.h2.j) r14).I;
                                            int i5 = 0;
                                            while (lVar2 != null) {
                                                long j4 = j3;
                                                if ((lVar2.i & 262144) != 0) {
                                                    i5++;
                                                    if (i5 == 1) {
                                                        E = r14;
                                                        r16 = r17;
                                                        E = lVar2;
                                                    } else {
                                                        ?? eVar = r16 == 0 ? new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]) : r16;
                                                        if (E != 0) {
                                                            eVar.b(E);
                                                            E = 0;
                                                        }
                                                        eVar.b(lVar2);
                                                        r16 = eVar;
                                                    }
                                                } else {
                                                    E = r14;
                                                    r16 = r17;
                                                }
                                                lVar2 = lVar2.y;
                                                j3 = j4;
                                                E = E;
                                                r16 = r16;
                                            }
                                            E = r14;
                                            r16 = r17;
                                            j2 = j3;
                                            r16 = r16;
                                            if (i5 == 1) {
                                            }
                                            c2 = c;
                                            b2 = b;
                                            j3 = j2;
                                            r14 = E;
                                            r17 = r16;
                                        }
                                        E = com.gamericefishpro.space.h2.k.e(r16);
                                        c2 = c;
                                        b2 = b;
                                        j3 = j2;
                                        r14 = E;
                                        r17 = r16;
                                    }
                                    j2 = j3;
                                    r16 = r17;
                                    E = com.gamericefishpro.space.h2.k.e(r16);
                                    c2 = c;
                                    b2 = b;
                                    j3 = j2;
                                    r14 = E;
                                    r17 = r16;
                                }
                            }
                            lVar = lVar.w;
                            c2 = c2;
                            b2 = b2;
                            j3 = j3;
                        }
                    }
                    char c3 = c2;
                    byte b3 = b2;
                    long j5 = j3;
                    f0VarS = f0VarS.v();
                    lVar = (f0VarS == null || (a1Var = f0VarS.Z) == null) ? null : a1Var.e;
                    c2 = c3;
                    b2 = b3;
                    j3 = j5;
                }
                j = j3;
                jVar2 = (com.gamericefishpro.space.a2.j) c2Var;
            }
            long jC0 = jVar2 != null ? jVar2.c0(i4, jFloatToRawIntBits) : 0L;
            iArr[0] = com.gamericefishpro.space.gi.c.a(Float.intBitsToFloat((int) (jC0 >> c))) * (-1);
            iArr[1] = com.gamericefishpro.space.gi.c.a(Float.intBitsToFloat((int) (jC0 & j))) * (-1);
        }
    }

    @Override // com.gamericefishpro.space.t0.j
    public final void d() {
        this.z.invoke();
    }

    @Override // com.gamericefishpro.space.t0.j
    public final void e() {
        this.y.invoke();
        removeAllViewsInLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r24v1, types: [com.gamericefishpro.space.a2.j] */
    /* JADX WARN: Type inference failed for: r2v12 */
    @Override // com.gamericefishpro.space.d4.n
    public final void f(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        char c;
        long j;
        char c2;
        a1 a1Var;
        ?? r18;
        ?? E;
        if (this.e.isNestedScrollingEnabled()) {
            byte b = -1;
            float f = -1;
            char c3 = ' ';
            long j2 = 4294967295L;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i * f)) << 32) | (((long) Float.floatToRawIntBits(i2 * f)) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(i4 * f)) & 4294967295L) | (((long) Float.floatToRawIntBits(i3 * f)) << 32);
            int i6 = i5 == 0 ? 1 : 2;
            com.gamericefishpro.space.a2.j jVar = this.d.a;
            c2 c2Var = null;
            if (jVar == null || !jVar.G) {
                c = ' ';
                j = 4294967295L;
                c2 = 0;
            } else {
                if (!jVar.d.G) {
                    com.gamericefishpro.space.e2.a.b("visitAncestors called on an unattached node");
                }
                com.gamericefishpro.space.h1.l lVar = jVar.d.w;
                f0 f0VarS = com.gamericefishpro.space.h2.k.s(jVar);
                loop0: while (true) {
                    if (f0VarS == null) {
                        c = c3;
                        j = j2;
                        break;
                    }
                    c = c3;
                    if ((f0VarS.Z.f.v & 262144) != 0) {
                        while (lVar != null) {
                            if ((lVar.i & 262144) != 0) {
                                ?? r19 = 0;
                                ?? r1 = lVar;
                                while (r1 != 0) {
                                    byte b2 = b;
                                    if (r1 instanceof c2) {
                                        c2 c2Var2 = (c2) r1;
                                        j = j2;
                                        if (Intrinsics.a(jVar.i(), c2Var2.i()) && com.gamericefishpro.space.a2.j.class == c2Var2.getClass()) {
                                            c2Var = c2Var2;
                                            break loop0;
                                        }
                                    } else {
                                        j = j2;
                                        if ((r1.i & 262144) != 0 && (r1 instanceof com.gamericefishpro.space.h2.j)) {
                                            com.gamericefishpro.space.h1.l lVar2 = ((com.gamericefishpro.space.h2.j) r1).I;
                                            int i7 = 0;
                                            while (lVar2 != null) {
                                                if ((lVar2.i & 262144) == 0) {
                                                    E = r1;
                                                    r18 = r19;
                                                    E = E;
                                                } else {
                                                    i7++;
                                                    if (i7 == 1) {
                                                        E = r1;
                                                        r18 = r19;
                                                        E = E;
                                                        E = lVar2;
                                                        E = r1;
                                                        r18 = r19;
                                                        E = E;
                                                    } else {
                                                        ?? eVar = r18 == 0 ? new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]) : r18;
                                                        if (E != 0) {
                                                            eVar.b(E);
                                                            E = 0;
                                                        }
                                                        eVar.b(lVar2);
                                                        r18 = eVar;
                                                    }
                                                }
                                                lVar2 = lVar2.y;
                                                E = E;
                                                r18 = r18;
                                            }
                                            E = r1;
                                            r18 = r19;
                                            r18 = r18;
                                            if (i7 == 1) {
                                            }
                                            b = b2;
                                            j2 = j;
                                            r1 = E;
                                            r19 = r18;
                                        }
                                        E = com.gamericefishpro.space.h2.k.e(r18);
                                        b = b2;
                                        j2 = j;
                                        r1 = E;
                                        r19 = r18;
                                    }
                                    r18 = r19;
                                    E = com.gamericefishpro.space.h2.k.e(r18);
                                    b = b2;
                                    j2 = j;
                                    r1 = E;
                                    r19 = r18;
                                }
                            }
                            lVar = lVar.w;
                            b = b;
                            j2 = j2;
                        }
                    }
                    byte b3 = b;
                    long j3 = j2;
                    f0VarS = f0VarS.v();
                    lVar = (f0VarS == null || (a1Var = f0VarS.Z) == null) ? null : a1Var.e;
                    c3 = c;
                    b = b3;
                    j2 = j3;
                }
                c2 = 0;
                c2Var = (com.gamericefishpro.space.a2.j) c2Var;
            }
            long jH = c2Var != null ? c2Var.H(i6, jFloatToRawIntBits, jFloatToRawIntBits2) : 0L;
            iArr[c2] = com.gamericefishpro.space.gi.c.a(Float.intBitsToFloat((int) (jH >> c))) * (-1);
            iArr[1] = com.gamericefishpro.space.gi.c.a(Float.intBitsToFloat((int) (jH & j))) * (-1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v7 */
    @Override // com.gamericefishpro.space.d4.m
    public final void g(View view, int i, int i2, int i3, int i4, int i5) {
        com.gamericefishpro.space.a2.j jVar;
        c2 c2Var;
        a1 a1Var;
        if (this.e.isNestedScrollingEnabled()) {
            float f = -1;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i * f)) << 32) | (((long) Float.floatToRawIntBits(i2 * f)) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(i3 * f)) << 32) | (((long) Float.floatToRawIntBits(i4 * f)) & 4294967295L);
            int i6 = i5 == 0 ? 1 : 2;
            com.gamericefishpro.space.a2.j jVar2 = this.d.a;
            if (jVar2 == null || !jVar2.G) {
                jVar = null;
            } else {
                if (!jVar2.d.G) {
                    com.gamericefishpro.space.e2.a.b("visitAncestors called on an unattached node");
                }
                com.gamericefishpro.space.h1.l lVar = jVar2.d.w;
                f0 f0VarS = com.gamericefishpro.space.h2.k.s(jVar2);
                loop0: while (true) {
                    if (f0VarS == null) {
                        c2Var = null;
                        break;
                    }
                    if ((f0VarS.Z.f.v & 262144) != 0) {
                        while (lVar != null) {
                            if ((lVar.i & 262144) != 0) {
                                ?? E = lVar;
                                ?? eVar = 0;
                                while (E != 0) {
                                    if (E instanceof c2) {
                                        c2 c2Var2 = (c2) E;
                                        if (Intrinsics.a(jVar2.i(), c2Var2.i()) && com.gamericefishpro.space.a2.j.class == c2Var2.getClass()) {
                                            c2Var = c2Var2;
                                            break loop0;
                                        }
                                    } else if ((E.i & 262144) != 0 && (E instanceof com.gamericefishpro.space.h2.j)) {
                                        com.gamericefishpro.space.h1.l lVar2 = ((com.gamericefishpro.space.h2.j) E).I;
                                        int i7 = 0;
                                        while (lVar2 != null) {
                                            if ((lVar2.i & 262144) != 0) {
                                                i7++;
                                                if (i7 == 1) {
                                                    E = E;
                                                    eVar = eVar;
                                                    eVar = eVar;
                                                    E = lVar2;
                                                } else {
                                                    if (eVar == 0) {
                                                        eVar = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                                                    }
                                                    if (E != 0) {
                                                        eVar.b(E);
                                                        E = 0;
                                                    }
                                                    eVar.b(lVar2);
                                                }
                                            } else {
                                                E = E;
                                                eVar = eVar;
                                            }
                                            lVar2 = lVar2.y;
                                            E = E;
                                            eVar = eVar;
                                        }
                                        if (i7 == 1) {
                                            E = E;
                                            eVar = eVar;
                                        } else {
                                            E = E;
                                            eVar = eVar;
                                        }
                                    }
                                    E = com.gamericefishpro.space.h2.k.e(eVar);
                                }
                            }
                            lVar = lVar.w;
                        }
                    }
                    f0VarS = f0VarS.v();
                    lVar = (f0VarS == null || (a1Var = f0VarS.Z) == null) ? null : a1Var.e;
                }
                jVar = (com.gamericefishpro.space.a2.j) c2Var;
            }
            if (jVar != null) {
                jVar.H(i6, jFloatToRawIntBits, jFloatToRawIntBits2);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.N;
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], getWidth() + i, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final com.gamericefishpro.space.c3.c getDensity() {
        return this.C;
    }

    public final View getInteropView() {
        return this.e;
    }

    public final f0 getLayoutNode() {
        return this.S;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final com.gamericefishpro.space.z4.u getLifecycleOwner() {
        return this.E;
    }

    public final com.gamericefishpro.space.h1.m getModifier() {
        return this.A;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        com.gamericefishpro.space.d4.o oVar = this.Q;
        return oVar.b | oVar.a;
    }

    public final Function1<com.gamericefishpro.space.c3.c, Unit> getOnDensityChanged$ui() {
        return this.D;
    }

    public final Function1<com.gamericefishpro.space.h1.m, Unit> getOnModifierChanged$ui() {
        return this.B;
    }

    public final Function1<Boolean, Unit> getOnRequestDisallowInterceptTouchEvent$ui() {
        return this.M;
    }

    public final Function0<Unit> getRelease() {
        return this.z;
    }

    public final Function0<Unit> getReset() {
        return this.y;
    }

    public final com.gamericefishpro.space.z5.e getSavedStateRegistryOwner() {
        return this.F;
    }

    public final Function0<Unit> getUpdate() {
        return this.v;
    }

    public final View getView() {
        return this.e;
    }

    @Override // com.gamericefishpro.space.d4.m
    public final boolean h(View view, View view2, int i, int i2) {
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.R) {
            this.S.C();
            return null;
        }
        this.e.postOnAnimation(new a(0, this.L));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.e.isNestedScrollingEnabled();
    }

    @Override // com.gamericefishpro.space.d4.p
    public final o1 l(View view, o1 o1Var) {
        this.I = new o1(o1Var);
        return m(o1Var);
    }

    public final o1 m(o1 o1Var) {
        l1 l1Var = o1Var.a;
        com.gamericefishpro.space.u3.b bVarG = l1Var.g(-1);
        com.gamericefishpro.space.u3.b bVar = com.gamericefishpro.space.u3.b.e;
        if (!bVarG.equals(bVar) || !l1Var.h(-9).equals(bVar) || l1Var.f() != null) {
            com.gamericefishpro.space.h2.q qVar = this.S.Z.c;
            if (qVar.j0.G) {
                long jD = com.gamericefishpro.space.a.a.D(qVar.H(0L));
                int i = (int) (jD >> 32);
                if (i < 0) {
                    i = 0;
                }
                int i2 = (int) (jD & 4294967295L);
                if (i2 < 0) {
                    i2 = 0;
                }
                long jF = com.gamericefishpro.space.f2.x.h(qVar).F();
                int i3 = (int) (jF >> 32);
                int i4 = (int) (jF & 4294967295L);
                long j = qVar.i;
                long jD2 = com.gamericefishpro.space.a.a.D(qVar.H((((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L)));
                int i5 = i3 - ((int) (jD2 >> 32));
                if (i5 < 0) {
                    i5 = 0;
                }
                int i6 = i4 - ((int) (4294967295L & jD2));
                int i7 = i6 >= 0 ? i6 : 0;
                if (i != 0 || i2 != 0 || i5 != 0 || i7 != 0) {
                    return o1Var.a.n(i, i2, i5, i7);
                }
            }
        }
        return o1Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.R) {
            this.S.C();
        } else {
            this.e.postOnAnimation(new a(0, this.L));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().a.a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.e.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View view = this.e;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.O = i;
        this.P = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.e.isNestedScrollingEnabled()) {
            return false;
        }
        a0.u(this.d.c(), null, new g(z, this, y3.j(f * (-1.0f), f2 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (!this.e.isNestedScrollingEnabled()) {
            return false;
        }
        a0.u(this.d.c(), null, new h1(this, y3.j(f * (-1.0f), f2 * (-1.0f)), null, 3), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        Function1 function1 = this.J;
        if (function1 == null) {
            return true;
        }
        function1.invoke(rect != null ? com.gamericefishpro.space.o1.o.A(rect) : null);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        Function1 function1 = this.M;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(com.gamericefishpro.space.c3.c cVar) {
        if (cVar != this.C) {
            this.C = cVar;
            Function1 function1 = this.D;
            if (function1 != null) {
                function1.invoke(cVar);
            }
        }
    }

    public final void setLifecycleOwner(com.gamericefishpro.space.z4.u uVar) {
        if (uVar != this.E) {
            this.E = uVar;
            m0.i(this, uVar);
        }
    }

    public final void setModifier(com.gamericefishpro.space.h1.m mVar) {
        if (mVar != this.A) {
            this.A = mVar;
            Function1 function1 = this.B;
            if (function1 != null) {
                function1.invoke(mVar);
            }
        }
    }

    public final void setOnDensityChanged$ui(Function1<? super com.gamericefishpro.space.c3.c, Unit> function1) {
        this.D = function1;
    }

    public final void setOnModifierChanged$ui(Function1<? super com.gamericefishpro.space.h1.m, Unit> function1) {
        this.B = function1;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui(Function1<? super Boolean, Unit> function1) {
        this.M = function1;
    }

    public final void setRelease(Function0<Unit> function0) {
        this.z = function0;
    }

    public final void setReset(Function0<Unit> function0) {
        this.y = function0;
    }

    public final void setSavedStateRegistryOwner(com.gamericefishpro.space.z5.e eVar) {
        if (eVar != this.F) {
            this.F = eVar;
            com.gamericefishpro.space.z5.g.c(this, eVar);
        }
    }

    public final void setUpdate(Function0<Unit> function0) {
        this.v = function0;
        this.w = true;
        this.K.invoke();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // com.gamericefishpro.space.h2.p1
    public final boolean t() {
        return isAttachedToWindow();
    }
}
