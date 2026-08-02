package defpackage;

/* loaded from: classes.dex */
public final class eho {
    public final vqf a;
    public final boolean b;
    public final boolean c;

    public eho(vqf vqfVar, boolean z, boolean z2) {
        this.a = vqfVar;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eho)) {
            return false;
        }
        eho ehoVar = (eho) obj;
        return this.a == ehoVar.a && this.b == ehoVar.b && this.c == ehoVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + k5r.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RowColumnChildSelector(type=");
        sb.append(this.a);
        sb.append(", expandWidth=");
        sb.append(this.b);
        sb.append(", expandHeight=");
        return dfi.j(sb, this.c, ')');
    }
}
