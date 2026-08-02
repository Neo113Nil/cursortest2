package com.yandex.passport.internal.ui.sloth.webcard;

import defpackage.f1d;

/* loaded from: classes4.dex */
public final class b1 {
    public float a;
    public int b;
    public int c;
    public int d;
    public c1 e;

    public b1(float f, int i, int i2, int i3, c1 c1Var) {
        c1Var.getClass();
        this.a = f;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = c1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return Float.compare(this.a, b1Var.a) == 0 && this.b == b1Var.b && this.c == b1Var.c && this.d == b1Var.d && this.e == b1Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + f1d.a(this.d, f1d.a(this.c, f1d.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "ViewState(cornerRadius=" + this.a + ", hMargins=" + this.b + ", vMargins=" + this.c + ", height=" + this.d + ", vBias=" + this.e + ')';
    }
}
