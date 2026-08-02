package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class azv implements bzv {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final jtv f;
    public final zzv g;

    public azv(String str, boolean z, boolean z2, boolean z3, boolean z4, jtv jtvVar, zzv zzvVar) {
        str.getClass();
        zzvVar.getClass();
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = jtvVar;
        this.g = zzvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azv)) {
            return false;
        }
        azv azvVar = (azv) obj;
        return Intrinsics.d(this.a, azvVar.a) && this.b == azvVar.b && this.c == azvVar.c && this.d == azvVar.d && this.e == azvVar.e && this.f.equals(azvVar.f) && Intrinsics.d(this.g, azvVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + k5r.e(k5r.e(k5r.e(k5r.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31);
    }

    public final String toString() {
        StringBuilder h = v3w.h("OneToOne(currentGenre=", this.a, ", isHudVisible=", ", isHeaderVisible=", this.b);
        dfi.t(h, this.c, ", isCardInfoVisible=", this.d, ", isFooterVisible=");
        h.append(this.e);
        h.append(", coordinatesInFocus=");
        h.append(this.f);
        h.append(", playerState=");
        h.append(this.g);
        h.append(")");
        return h.toString();
    }
}
