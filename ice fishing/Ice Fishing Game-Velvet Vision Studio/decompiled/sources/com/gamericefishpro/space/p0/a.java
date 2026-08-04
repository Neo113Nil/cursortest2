package com.gamericefishpro.space.p0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.gamericefishpro.space.b0.i;
import com.gamericefishpro.space.b0.j;
import com.gamericefishpro.space.b0.k;
import com.gamericefishpro.space.b0.m;
import com.gamericefishpro.space.b0.o;
import com.gamericefishpro.space.b2.p;
import com.gamericefishpro.space.h1.l;
import com.gamericefishpro.space.h2.h;
import com.gamericefishpro.space.h2.h0;
import com.gamericefishpro.space.h2.u;
import com.gamericefishpro.space.i2.j0;
import com.gamericefishpro.space.o1.q;
import com.gamericefishpro.space.ph.x;
import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.t.d0;
import com.gamericefishpro.space.u6.s;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends l implements h, com.gamericefishpro.space.h2.l, u {
    public final i H;
    public final boolean I;
    public final float J;
    public final com.gamericefishpro.space.m.d K;
    public final com.gamericefishpro.space.q0.g L;
    public p M;
    public float N;
    public boolean P;
    public d R;
    public e S;
    public long O = 0;
    public final d0 Q = new d0();

    public a(i iVar, boolean z, float f, com.gamericefishpro.space.m.d dVar, com.gamericefishpro.space.q0.g gVar) {
        this.H = iVar;
        this.I = z;
        this.J = f;
        this.K = dVar;
        this.L = gVar;
    }

    public final void A0(m mVar) {
        e eVar;
        if (!(mVar instanceof k)) {
            if (mVar instanceof com.gamericefishpro.space.b0.l) {
                e eVar2 = this.S;
                if (eVar2 != null) {
                    eVar2.d();
                    return;
                }
                return;
            }
            if (!(mVar instanceof j) || (eVar = this.S) == null) {
                return;
            }
            eVar.d();
            return;
        }
        k kVar = (k) mVar;
        long j = this.O;
        float f = this.N;
        d dVar = this.R;
        if (dVar == null) {
            Object obj = (View) com.gamericefishpro.space.h2.k.h(this, j0.f);
            while (!(obj instanceof ViewGroup)) {
                ViewParent parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    throw new IllegalArgumentException(("Couldn't find a valid parent for " + obj + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
                }
                obj = parent;
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    d dVar2 = new d(viewGroup.getContext());
                    viewGroup.addView(dVar2);
                    dVar = dVar2;
                    break;
                } else {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof d) {
                        dVar = (d) childAt;
                        break;
                    }
                    i++;
                }
            }
            this.R = dVar;
        }
        ArrayList arrayList = dVar.e;
        s sVar = dVar.v;
        LinkedHashMap linkedHashMap = (LinkedHashMap) sVar.e;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) sVar.e;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) sVar.i;
        e eVar3 = (e) linkedHashMap.get(this);
        if (eVar3 == null) {
            ArrayList arrayList2 = dVar.i;
            Intrinsics.checkNotNullParameter(arrayList2, "<this>");
            eVar3 = (e) (arrayList2.isEmpty() ? null : arrayList2.remove(0));
            if (eVar3 == null) {
                if (dVar.w > x.e(arrayList)) {
                    eVar3 = new e(dVar.getContext());
                    dVar.addView(eVar3);
                    arrayList.add(eVar3);
                } else {
                    eVar3 = (e) arrayList.get(dVar.w);
                    a aVar = (a) linkedHashMap3.get(eVar3);
                    if (aVar != null) {
                        aVar.S = null;
                        com.gamericefishpro.space.h2.k.j(aVar);
                        e eVar4 = (e) linkedHashMap2.get(aVar);
                        if (eVar4 != null) {
                        }
                        linkedHashMap2.remove(aVar);
                        eVar3.c();
                    }
                }
                int i2 = dVar.w;
                if (i2 < dVar.d - 1) {
                    dVar.w = i2 + 1;
                } else {
                    dVar.w = 0;
                }
            }
            linkedHashMap2.put(this, eVar3);
            linkedHashMap3.put(eVar3, this);
        }
        e eVar5 = eVar3;
        int iA = com.gamericefishpro.space.gi.c.a(f);
        long jW = this.K.w();
        this.L.invoke();
        eVar5.b(kVar, this.I, j, iA, jW, new com.gamericefishpro.space.a3.b(14, this));
        this.S = eVar5;
        com.gamericefishpro.space.h2.k.j(this);
    }

    @Override // com.gamericefishpro.space.h2.l
    public final void f(h0 h0Var) {
        com.gamericefishpro.space.q1.b bVar = h0Var.d;
        h0Var.a();
        p pVar = this.M;
        if (pVar != null) {
            float f = this.N;
            long jW = this.K.w();
            float fFloatValue = ((Number) ((com.gamericefishpro.space.w.b) pVar.c).c()).floatValue();
            if (fFloatValue > 0.0f) {
                long jC = com.gamericefishpro.space.o1.s.c(jW, fFloatValue);
                if (pVar.a) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (bVar.c() >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (bVar.c() & 4294967295L));
                    com.gamericefishpro.space.a8.c cVar = bVar.e;
                    long jO = cVar.o();
                    cVar.j().k();
                    try {
                        ((com.gamericefishpro.space.a8.c) ((com.gamericefishpro.space.m.d) cVar.e).e).j().f(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 1);
                        com.gamericefishpro.space.q1.d.I(h0Var, jC, f);
                        cVar.j().i();
                        cVar.H(jO);
                    } catch (Throwable th) {
                        cVar.j().i();
                        cVar.H(jO);
                        throw th;
                    }
                } else {
                    com.gamericefishpro.space.q1.d.I(h0Var, jC, f);
                }
            }
        }
        q qVarJ = bVar.e.j();
        e eVar = this.S;
        if (eVar != null) {
            long j = this.O;
            int iA = com.gamericefishpro.space.gi.c.a(this.N);
            long jW2 = this.K.w();
            this.L.invoke();
            eVar.e(iA, j, jW2);
            eVar.draw(com.gamericefishpro.space.o1.c.a(qVarJ));
        }
    }

    @Override // com.gamericefishpro.space.h2.u
    public final void l(long j) {
        float fR;
        this.P = true;
        com.gamericefishpro.space.c3.c cVar = com.gamericefishpro.space.h2.k.s(this).S;
        this.O = com.gamericefishpro.space.d9.h.Q(j);
        float f = this.J;
        if (Float.isNaN(f)) {
            long j2 = this.O;
            float f2 = c.a;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            fR = com.gamericefishpro.space.n1.b.c((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)) / 2.0f;
            if (this.I) {
                fR += cVar.r(c.a);
            }
        } else {
            fR = cVar.r(f);
        }
        this.N = fR;
        d0 d0Var = this.Q;
        Object[] objArr = d0Var.a;
        int i = d0Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            A0((m) objArr[i2]);
        }
        d0Var.d();
    }

    @Override // com.gamericefishpro.space.h1.l
    public final boolean p0() {
        return false;
    }

    @Override // com.gamericefishpro.space.h1.l
    public final void s0() {
        a0.u(o0(), null, new o(this, (com.gamericefishpro.space.th.a) null, 17), 3);
    }

    @Override // com.gamericefishpro.space.h1.l
    public final void t0() {
        d dVar = this.R;
        if (dVar != null) {
            this.S = null;
            com.gamericefishpro.space.h2.k.j(this);
            s sVar = dVar.v;
            e eVar = (e) ((LinkedHashMap) sVar.e).get(this);
            if (eVar != null) {
                eVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) sVar.e;
                e eVar2 = (e) linkedHashMap.get(this);
                if (eVar2 != null) {
                }
                linkedHashMap.remove(this);
                dVar.i.add(eVar);
            }
        }
    }
}
