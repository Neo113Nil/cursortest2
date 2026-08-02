package defpackage;

import java.util.Iterator;

/* loaded from: classes10.dex */
public final class tus0 implements aud, Iterable, xfx {
    public final sus0 a;
    public final int b;
    public final int c;

    public tus0(sus0 sus0Var, int i, int i2) {
        this.a = sus0Var;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.aud
    public final String a() {
        this.a.m(this.b);
        return null;
    }

    @Override // defpackage.aud
    public final Object b() {
        sus0 sus0Var = this.a;
        if (sus0Var.A != this.c) {
            uus0.h();
        }
        dus0 j = sus0Var.j();
        try {
            return j.a(this.b);
        } finally {
            j.c();
        }
    }

    @Override // defpackage.vtd
    public final Iterable d() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tus0)) {
            return false;
        }
        tus0 tus0Var = (tus0) obj;
        return tus0Var.b == this.b && tus0Var.c == this.c && tus0Var.a == this.a;
    }

    @Override // defpackage.aud
    public final Iterable getData() {
        sus0 sus0Var = this.a;
        int i = this.b;
        sus0Var.m(i);
        return new log(sus0Var, i);
    }

    @Override // defpackage.aud
    public final Object getKey() {
        sus0 sus0Var = this.a;
        int[] iArr = sus0Var.a;
        int i = this.b;
        int i2 = i * 5;
        return (iArr[i2 + 1] & 536870912) != 0 ? sus0Var.c[uus0.c(i, iArr)] : Integer.valueOf(iArr[i2]);
    }

    @Override // defpackage.aud
    public final Object getNode() {
        sus0 sus0Var = this.a;
        int[] iArr = sus0Var.a;
        int i = this.b * 5;
        if ((iArr[i + 1] & 1073741824) != 0) {
            return sus0Var.c[iArr[i + 4]];
        }
        return null;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        sus0 sus0Var = this.a;
        if (sus0Var.A != this.c) {
            uus0.h();
        }
        int i = this.b;
        sus0Var.m(i);
        return new u2u(sus0Var, i + 1, uus0.a(i, sus0Var.a) + i);
    }
}
