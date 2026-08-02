package defpackage;

/* loaded from: classes3.dex */
public final class spd {
    public final int a;
    public final int b;
    public final int c;

    public spd(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof spd)) {
            return false;
        }
        spd spdVar = (spd) obj;
        return this.a == spdVar.a && this.b == spdVar.b && this.c == spdVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + f1d.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return f1d.i(dfi.l("GridIndex(columnIndex=", this.a, this.b, ", rowIndex=", ", dataIndex="), this.c, ")");
    }
}
