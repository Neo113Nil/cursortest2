package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class bds {
    public final mn0 a;
    public final ges b;
    public final List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final jx7 g;
    public final xof h;
    public final ppc i;
    public final long j;

    public bds(mn0 mn0Var, ges gesVar, List list, int i, boolean z, int i2, jx7 jx7Var, xof xofVar, ppc ppcVar, long j) {
        this.a = mn0Var;
        this.b = gesVar;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = jx7Var;
        this.h = xofVar;
        this.i = ppcVar;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bds)) {
            return false;
        }
        bds bdsVar = (bds) obj;
        return Intrinsics.d(this.a, bdsVar.a) && Intrinsics.d(this.b, bdsVar.b) && Intrinsics.d(this.c, bdsVar.c) && this.d == bdsVar.d && this.e == bdsVar.e && this.f == bdsVar.f && Intrinsics.d(this.g, bdsVar.g) && this.h == bdsVar.h && Intrinsics.d(this.i, bdsVar.i) && ga6.c(this.j, bdsVar.j);
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + f1d.a(this.f, k5r.e((k5r.d(tlm.d(this.b, this.a.hashCode() * 31, 31), 31, this.c) + this.d) * 31, 31, this.e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TextLayoutInput(text=" + ((Object) this.a) + ", style=" + this.b + ", placeholders=" + this.c + ", maxLines=" + this.d + ", softWrap=" + this.e + ", overflow=" + ((Object) ods.a(this.f)) + ", density=" + this.g + ", layoutDirection=" + this.h + ", fontFamilyResolver=" + this.i + ", constraints=" + ((Object) ga6.m(this.j)) + ')';
    }
}
