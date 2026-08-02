package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class utf implements mfh {
    public final stf a;
    public final dnr b;
    public final ttf c;
    public final soi d;

    public utf(stf stfVar, dnr dnrVar) {
        this.a = stfVar;
        this.b = dnrVar;
        this.c = (ttf) stfVar.b.invoke();
        soi soiVar = vpe.a;
        this.d = new soi();
    }

    @Override // defpackage.jx7
    public final long B0(long j) {
        return this.b.B0(j);
    }

    @Override // defpackage.fxe
    public final boolean F() {
        return this.b.F();
    }

    @Override // defpackage.jx7
    public final int L(float f) {
        return this.b.L(f);
    }

    @Override // defpackage.jx7
    public final float N(long j) {
        return this.b.N(j);
    }

    @Override // defpackage.mfh
    public final lfh W(int i, int i2, Map map, Function1 function1) {
        return this.b.W(i, i2, map, function1);
    }

    public final List a(int i, long j) {
        soi soiVar = this.d;
        List list = (List) soiVar.b(i);
        if (list != null) {
            return list;
        }
        ttf ttfVar = this.c;
        Object e = ttfVar.e(i);
        List i2 = this.b.i(e, this.a.a(i, e, ttfVar.c(i)));
        int size = i2.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(((ffh) i2.get(i3)).M(j));
        }
        soiVar.h(i, arrayList);
        return arrayList;
    }

    @Override // defpackage.jx7
    public final float c0(int i) {
        return this.b.c0(i);
    }

    @Override // defpackage.jx7
    public final float d0(float f) {
        return this.b.d0(f);
    }

    @Override // defpackage.jx7
    public final float getDensity() {
        return this.b.getDensity();
    }

    @Override // defpackage.fxe
    public final xof getLayoutDirection() {
        return this.b.getLayoutDirection();
    }

    @Override // defpackage.jx7
    public final float i0() {
        return this.b.i0();
    }

    @Override // defpackage.jx7
    public final long l(float f) {
        return this.b.l(f);
    }

    @Override // defpackage.jx7
    public final long m(long j) {
        return this.b.m(j);
    }

    @Override // defpackage.jx7
    public final float n0(float f) {
        return this.b.n0(f);
    }

    @Override // defpackage.jx7
    public final float p(long j) {
        return this.b.p(j);
    }

    @Override // defpackage.jx7
    public final int s0(long j) {
        return this.b.s0(j);
    }

    @Override // defpackage.jx7
    public final long w(float f) {
        return this.b.w(f);
    }

    @Override // defpackage.mfh
    public final lfh w0(int i, int i2, Map map, Function1 function1) {
        return this.b.w0(i, i2, map, function1);
    }
}
