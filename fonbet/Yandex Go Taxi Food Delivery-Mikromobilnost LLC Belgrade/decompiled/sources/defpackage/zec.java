package defpackage;

/* loaded from: classes2.dex */
public final class zec {
    public final String a;
    public final vfu b;

    public zec(String str, vfu vfuVar) {
        this.a = str;
        this.b = vfuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zec)) {
            return false;
        }
        zec zecVar = (zec) obj;
        return this.a.equals(zecVar.a) && this.b.equals(zecVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnHexColor(__typename=" + this.a + ", hexColorFragment=" + this.b + ')';
    }
}
