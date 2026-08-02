package defpackage;

import java.util.List;

/* loaded from: classes6.dex */
public final class zad0 {
    public final List a;
    public final d6w b;
    public final d6w c;
    public final int d;

    public zad0(List list, d6w d6wVar, d6w d6wVar2, int i) {
        this.a = list;
        this.b = d6wVar;
        this.c = d6wVar2;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zad0)) {
            return false;
        }
        zad0 zad0Var = (zad0) obj;
        return this.a.equals(zad0Var.a) && jl40.l(this.b, zad0Var.b) && jl40.l(this.c, zad0Var.c) && this.d == zad0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + oyr.b(this.d, (this.c.hashCode() + ((this.b.hashCode() + unr0.c(Integer.hashCode(80) * 31, 31, this.a)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlusPayConfettiPreferences(count=80, availableColors=");
        sb.append(this.a);
        sb.append(", xSpeedRange=");
        sb.append(this.b);
        sb.append(", ySpeedRange=");
        sb.append(this.c);
        sb.append(", confettiSize=");
        return oyr.m(this.d, ", rethrowAfterFalling=false)", sb);
    }
}
