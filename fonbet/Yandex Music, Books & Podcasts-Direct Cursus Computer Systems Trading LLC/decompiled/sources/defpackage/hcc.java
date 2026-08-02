package defpackage;

/* loaded from: classes3.dex */
public final class hcc {
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;

    public hcc(int i, String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hcc)) {
            return false;
        }
        hcc hccVar = (hcc) obj;
        return this.a.equals(hccVar.a) && this.b.equals(hccVar.b) && this.c == hccVar.c && this.d == hccVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + f1d.a(this.c, k5r.c(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("FilterUiData(id=", this.a, ", title=", this.b, ", index=");
        m.append(this.c);
        m.append(", isSelected=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }
}
