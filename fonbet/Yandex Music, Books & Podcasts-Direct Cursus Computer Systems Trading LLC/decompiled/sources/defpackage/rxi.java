package defpackage;

import android.util.DisplayMetrics;

/* loaded from: classes3.dex */
public final class rxi extends gc9 {
    public final /* synthetic */ int d = 1;
    public final float e;
    public final float f;
    public final boolean g;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rxi(ca9 ca9Var, xzb xzbVar, int i, cc9 cc9Var, cb9 cb9Var) {
        super(i, cc9Var, cb9Var);
        float f;
        float f2;
        float f3;
        double doubleValue = ((Number) ca9Var.a.a.a(xzbVar)).doubleValue();
        float f4 = (float) ((i * doubleValue) / 100);
        this.e = f4;
        int ordinal = cb9Var.ordinal();
        if (ordinal == 0) {
            f = i;
            f2 = cc9Var.g;
        } else if (ordinal == 1) {
            f3 = (i - f4) / 2;
            this.f = f3;
            this.g = doubleValue < 100.0d;
        } else {
            if (ordinal != 2) {
                b6e.s();
                throw null;
            }
            f = i;
            f2 = cc9Var.h;
        }
        f3 = (f - f2) - f4;
        this.f = f3;
        this.g = doubleValue < 100.0d;
    }

    @Override // defpackage.gc9
    public final Float i(int i) {
        switch (this.d) {
            case 0:
                return Float.valueOf(this.f);
            default:
                return Float.valueOf(this.e);
        }
    }

    public final float s() {
        switch (this.d) {
            case 0:
                return this.f;
            default:
                return this.e;
        }
    }

    public final float t() {
        switch (this.d) {
            case 0:
                return this.e;
            default:
                return this.f;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rxi(g99 g99Var, xzb xzbVar, DisplayMetrics displayMetrics, int i, float f, cc9 cc9Var, cb9 cb9Var) {
        super(i, cc9Var, cb9Var);
        float f2;
        float f3;
        float f4;
        float j0 = bg3.j0(g99Var.a, displayMetrics, xzbVar);
        float f5 = f + j0;
        this.e = f5;
        int ordinal = cb9Var.ordinal();
        if (ordinal == 0) {
            f2 = i;
            f3 = cc9Var.g;
        } else {
            if (ordinal == 1) {
                f4 = i;
                f5 *= 2;
                this.f = f4 - f5;
                this.g = j0 > 0.0f;
            }
            if (ordinal == 2) {
                f2 = i;
                f3 = cc9Var.h;
            } else {
                b6e.s();
                throw null;
            }
        }
        f4 = f2 - f3;
        this.f = f4 - f5;
        this.g = j0 > 0.0f;
    }
}
