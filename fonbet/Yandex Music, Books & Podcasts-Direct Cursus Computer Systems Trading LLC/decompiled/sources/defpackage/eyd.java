package defpackage;

/* loaded from: classes.dex */
public final class eyd {
    public final ynn a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public eyd(ynn ynnVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = ynnVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eyd)) {
            return false;
        }
        eyd eydVar = (eyd) obj;
        return this.a.equals(eydVar.a) && this.b == eydVar.b && this.c == eydVar.c && this.d == eydVar.d && this.e == eydVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + k5r.e(k5r.e(k5r.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HingeInfo(bounds=");
        sb.append(this.a);
        sb.append(", isFlat=");
        sb.append(this.b);
        sb.append(", isVertical=");
        sb.append(this.c);
        sb.append(", isSeparating=");
        sb.append(this.d);
        sb.append(", isOccluding=");
        return dfi.j(sb, this.e, ')');
    }
}
