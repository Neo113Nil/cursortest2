package com.gamericefishpro.space.f2;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements h1 {
    public com.gamericefishpro.space.c3.l d = com.gamericefishpro.space.c3.l.e;
    public float e;
    public float i;
    public final /* synthetic */ h0 v;

    public b0(h0 h0Var) {
        this.v = h0Var;
    }

    @Override // com.gamericefishpro.space.f2.n0
    public final m0 G(int i, int i2, Map map, Function1 function1, Function1 function2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            com.gamericefishpro.space.e2.a.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new a0(i, i2, map, function1, this, this.v, function2);
    }

    @Override // com.gamericefishpro.space.c3.c
    public final float b() {
        return this.e;
    }

    @Override // com.gamericefishpro.space.c3.c
    public final float g() {
        return this.i;
    }

    @Override // com.gamericefishpro.space.f2.p
    public final com.gamericefishpro.space.c3.l getLayoutDirection() {
        return this.d;
    }

    @Override // com.gamericefishpro.space.f2.h1
    public final List j(Object obj, Function2 function2) {
        h0 h0Var = this.v;
        h0Var.h();
        com.gamericefishpro.space.h2.f0 f0Var = h0Var.d;
        com.gamericefishpro.space.h2.b0 b0Var = f0Var.a0.d;
        com.gamericefishpro.space.h2.b0 b0Var2 = com.gamericefishpro.space.h2.b0.d;
        if (b0Var != b0Var2 && b0Var != com.gamericefishpro.space.h2.b0.i && b0Var != com.gamericefishpro.space.h2.b0.e && b0Var != com.gamericefishpro.space.h2.b0.v) {
            com.gamericefishpro.space.e2.a.b("subcompose can only be used inside the measure or layout blocks");
        }
        com.gamericefishpro.space.t.h0 h0Var2 = h0Var.z;
        Object objG = h0Var2.g(obj);
        if (objG == null) {
            objG = (com.gamericefishpro.space.h2.f0) h0Var.C.k(obj);
            if (objG != null) {
                if (h0Var.H <= 0) {
                    com.gamericefishpro.space.e2.a.b("Check failed.");
                }
                h0Var.H--;
            } else {
                objG = h0Var.n(obj);
                if (objG == null) {
                    int i = h0Var.v;
                    com.gamericefishpro.space.h2.f0 f0Var2 = new com.gamericefishpro.space.h2.f0(2);
                    f0Var.K = true;
                    f0Var.B(i, f0Var2);
                    Unit unit = Unit.a;
                    f0Var.K = false;
                    objG = f0Var2;
                }
            }
            h0Var2.m(obj, objG);
        }
        com.gamericefishpro.space.h2.f0 f0Var3 = (com.gamericefishpro.space.h2.f0) objG;
        if (CollectionsKt.x(h0Var.v, f0Var.o()) != f0Var3) {
            int i2 = ((com.gamericefishpro.space.v0.b) f0Var.o()).d.i(f0Var3);
            if (i2 < h0Var.v) {
                com.gamericefishpro.space.e2.a.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i3 = h0Var.v;
            if (i3 != i2) {
                h0Var.j(i2, i3);
            }
        }
        h0Var.v++;
        h0Var.m(f0Var3, obj, false, function2);
        return (b0Var == b0Var2 || b0Var == com.gamericefishpro.space.h2.b0.i) ? f0Var3.m() : f0Var3.l();
    }

    @Override // com.gamericefishpro.space.f2.p
    public final boolean n() {
        com.gamericefishpro.space.h2.b0 b0Var = this.v.d.a0.d;
        return b0Var == com.gamericefishpro.space.h2.b0.v || b0Var == com.gamericefishpro.space.h2.b0.e;
    }
}
