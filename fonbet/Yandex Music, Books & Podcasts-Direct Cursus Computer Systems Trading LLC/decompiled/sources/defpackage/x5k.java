package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class x5k implements in0 {
    public final int a;
    public final int b;
    public final long c;
    public final fcs d;
    public final duk e;
    public final h6g f;
    public final int g;
    public final int h;
    public final lds i;

    public x5k(int i, int i2, long j, fcs fcsVar, duk dukVar, h6g h6gVar, int i3, int i4, lds ldsVar) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = fcsVar;
        this.e = dukVar;
        this.f = h6gVar;
        this.g = i3;
        this.h = i4;
        this.i = ldsVar;
        if (kes.a(j, kes.c) || kes.c(j) >= 0.0f) {
            return;
        }
        tme.c("lineHeight can't be negative (" + kes.c(j) + ')');
    }

    public final x5k a(x5k x5kVar) {
        return x5kVar == null ? this : y5k.a(this, x5kVar.a, x5kVar.b, x5kVar.c, x5kVar.d, x5kVar.e, x5kVar.f, x5kVar.g, x5kVar.h, x5kVar.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5k)) {
            return false;
        }
        x5k x5kVar = (x5k) obj;
        if (this.a != x5kVar.a || this.b != x5kVar.b || !kes.a(this.c, x5kVar.c) || !Intrinsics.d(this.d, x5kVar.d) || !Intrinsics.d(this.e, x5kVar.e) || !Intrinsics.d(this.f, x5kVar.f)) {
            return false;
        }
        int i = x5kVar.g;
        int i2 = u5g.b;
        return this.g == i && this.h == x5kVar.h && Intrinsics.d(this.i, x5kVar.i);
    }

    public final int hashCode() {
        int a = f1d.a(this.b, Integer.hashCode(this.a) * 31, 31);
        les[] lesVarArr = kes.b;
        int c = tlm.c(this.c, a, 31);
        fcs fcsVar = this.d;
        int hashCode = (c + (fcsVar != null ? fcsVar.hashCode() : 0)) * 31;
        duk dukVar = this.e;
        int hashCode2 = (hashCode + (dukVar != null ? dukVar.hashCode() : 0)) * 31;
        h6g h6gVar = this.f;
        int hashCode3 = (hashCode2 + (h6gVar != null ? h6gVar.hashCode() : 0)) * 31;
        int i = u5g.b;
        int a2 = f1d.a(this.h, f1d.a(this.g, hashCode3, 31), 31);
        lds ldsVar = this.i;
        return a2 + (ldsVar != null ? ldsVar.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) o9s.a(this.a)) + ", textDirection=" + ((Object) fas.a(this.b)) + ", lineHeight=" + ((Object) kes.d(this.c)) + ", textIndent=" + this.d + ", platformStyle=" + this.e + ", lineHeightStyle=" + this.f + ", lineBreak=" + ((Object) u5g.a(this.g)) + ", hyphens=" + ((Object) f8e.a(this.h)) + ", textMotion=" + this.i + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x5k(int i, fcs fcsVar, int i2) {
        this(r1, Integer.MIN_VALUE, r3, fcsVar, null, null, 0, Integer.MIN_VALUE, null);
        int i3 = (i2 & 1) != 0 ? Integer.MIN_VALUE : i;
        long j = kes.c;
        fcsVar = (i2 & 8) != 0 ? null : fcsVar;
        int i4 = u5g.b;
    }
}
