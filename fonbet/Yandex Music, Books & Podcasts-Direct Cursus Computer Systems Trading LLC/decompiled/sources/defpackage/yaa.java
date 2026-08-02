package defpackage;

/* loaded from: classes3.dex */
public final class yaa {
    public final int a;
    public final int b;
    public final int c;

    public yaa(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yaa)) {
            return false;
        }
        yaa yaaVar = (yaa) obj;
        return this.a == yaaVar.a && this.b == yaaVar.b && this.c == yaaVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + f1d.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return f1d.i(dfi.l("State(finished=", this.a, this.b, ", errors=", ", total="), this.c, ")");
    }
}
