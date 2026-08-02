package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class sxe implements mfh, fxe {
    public final xof a;
    public final /* synthetic */ fxe b;

    public sxe(fxe fxeVar, xof xofVar) {
        this.a = xofVar;
        this.b = fxeVar;
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
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            sme.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new rxe(map, i, i2);
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
        return this.a;
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
}
