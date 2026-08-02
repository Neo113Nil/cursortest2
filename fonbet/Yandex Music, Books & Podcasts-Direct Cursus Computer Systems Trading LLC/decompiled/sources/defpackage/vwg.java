package defpackage;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class vwg extends twg implements ffh {
    public final f8j l;
    public LinkedHashMap n;
    public lfh p;
    public final cpi q;
    public long m = 0;
    public final wwg o = new wwg(this);

    public vwg(f8j f8jVar) {
        this.l = f8jVar;
        cpi cpiVar = uhj.a;
        this.q = new cpi();
    }

    public static final void P0(vwg vwgVar, lfh lfhVar) {
        Unit unit;
        LinkedHashMap linkedHashMap;
        if (lfhVar != null) {
            vwgVar.t0((lfhVar.a() & 4294967295L) | (lfhVar.c() << 32));
            unit = Unit.a;
        } else {
            unit = null;
        }
        if (unit == null) {
            vwgVar.t0(0L);
        }
        if (!Intrinsics.d(vwgVar.p, lfhVar) && lfhVar != null && ((((linkedHashMap = vwgVar.n) != null && !linkedHashMap.isEmpty()) || !lfhVar.b().isEmpty()) && !Intrinsics.d(lfhVar.b(), vwgVar.n))) {
            zwg zwgVar = vwgVar.l.l.G.q;
            zwgVar.getClass();
            zwgVar.s.f();
            LinkedHashMap linkedHashMap2 = vwgVar.n;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                vwgVar.n = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(lfhVar.b());
        }
        vwgVar.p = lfhVar;
    }

    @Override // defpackage.twg, defpackage.fxe
    public final boolean F() {
        return true;
    }

    @Override // defpackage.twg
    public final twg G0() {
        f8j f8jVar = this.l.m;
        if (f8jVar != null) {
            return f8jVar.Z0();
        }
        return null;
    }

    @Override // defpackage.twg
    public final wof H0() {
        return this.o;
    }

    @Override // defpackage.twg
    public final boolean I0() {
        return this.p != null;
    }

    @Override // defpackage.twg
    public final mpf J0() {
        return this.l.l;
    }

    @Override // defpackage.twg
    public final lfh K0() {
        lfh lfhVar = this.p;
        if (lfhVar != null) {
            return lfhVar;
        }
        throw ouj.f("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // defpackage.twg
    public final twg L0() {
        f8j f8jVar = this.l.n;
        if (f8jVar != null) {
            return f8jVar.Z0();
        }
        return null;
    }

    @Override // defpackage.twg
    public final long M0() {
        return this.m;
    }

    @Override // defpackage.twg
    public final void O0() {
        r0(this.m, 0.0f, null);
    }

    public void Q0() {
        K0().d();
    }

    public final void R0(long j) {
        if (!wpe.b(this.m, j)) {
            this.m = j;
            f8j f8jVar = this.l;
            zwg zwgVar = f8jVar.l.G.q;
            if (zwgVar != null) {
                zwgVar.G0();
            }
            twg.N0(f8jVar);
        }
        if (this.h) {
            return;
        }
        E0(new msk(K0(), this));
    }

    public final long S0(vwg vwgVar, boolean z) {
        long j = 0;
        vwg vwgVar2 = this;
        while (!vwgVar2.equals(vwgVar)) {
            if (!vwgVar2.f || !z) {
                j = wpe.d(j, vwgVar2.m);
            }
            f8j f8jVar = vwgVar2.l.n;
            f8jVar.getClass();
            vwgVar2 = f8jVar.Z0();
            vwgVar2.getClass();
        }
        return j;
    }

    @Override // defpackage.jx7
    public final float getDensity() {
        return this.l.getDensity();
    }

    @Override // defpackage.fxe
    public final xof getLayoutDirection() {
        return this.l.l.z;
    }

    @Override // defpackage.jx7
    public final float i0() {
        return this.l.i0();
    }

    @Override // defpackage.ksk, defpackage.ffh
    public final Object n() {
        return this.l.n();
    }

    @Override // defpackage.ksk
    public final void r0(long j, float f, Function1 function1) {
        R0(j);
        if (this.g) {
            return;
        }
        Q0();
    }
}
