package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class t5y implements k {
    public final p5y a;
    public final tyu0 b;
    public final q5y c;
    public final wx40 w;

    public t5y(p5y p5yVar, tyu0 tyu0Var) {
        this.a = p5yVar;
        this.b = tyu0Var;
        this.c = (q5y) p5yVar.b.invoke();
        y5w.a();
        this.w = y5w.a();
    }

    @Override // androidx.compose.ui.layout.k
    public final aa10 E(int i, int i2, Map map, tls tlsVar, tls tlsVar2) {
        return this.b.E(i, i2, map, tlsVar, tlsVar2);
    }

    @Override // defpackage.fwi
    public final float H(int i) {
        return this.b.H(i);
    }

    @Override // defpackage.fwi
    public final float I(float f) {
        return this.b.I(f);
    }

    @Override // defpackage.fwi
    public final long R(long j) {
        return this.b.R(j);
    }

    @Override // defpackage.fwi
    public final long W(float f) {
        return this.b.W(f);
    }

    public final List a(int i) {
        wx40 wx40Var = this.w;
        List list = (List) wx40Var.b(i);
        if (list != null) {
            return list;
        }
        q5y q5yVar = this.c;
        Object c = q5yVar.c(i);
        List h0 = this.b.h0(c, this.a.a(i, c, q5yVar.a(i)));
        wx40Var.i(i, h0);
        return h0;
    }

    @Override // defpackage.yuw
    public final boolean d0() {
        return this.b.d0();
    }

    @Override // defpackage.fwi
    public final long f(long j) {
        return this.b.f(j);
    }

    @Override // defpackage.fwi
    public final int f0(float f) {
        return this.b.f0(f);
    }

    @Override // defpackage.fwi
    public final float getDensity() {
        return this.b.getDensity();
    }

    @Override // defpackage.yuw
    public final LayoutDirection getLayoutDirection() {
        return this.b.getLayoutDirection();
    }

    @Override // defpackage.fwi
    public final float i(long j) {
        return this.b.i(j);
    }

    @Override // defpackage.fwi
    public final float i0(long j) {
        return this.b.i0(j);
    }

    @Override // defpackage.fwi
    public final long n(float f) {
        return this.b.n(f);
    }

    @Override // defpackage.fwi
    public final float u0() {
        return this.b.u0();
    }

    @Override // androidx.compose.ui.layout.k
    public final aa10 w(int i, int i2, Map map, tls tlsVar) {
        return this.b.w(i, i2, map, tlsVar);
    }

    @Override // defpackage.fwi
    public final float w0(float f) {
        return this.b.w0(f);
    }
}
