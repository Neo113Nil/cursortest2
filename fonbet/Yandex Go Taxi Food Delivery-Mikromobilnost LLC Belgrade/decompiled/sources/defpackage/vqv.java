package defpackage;

@gsq0
/* loaded from: classes8.dex */
public final class vqv {
    public static final uqv Companion = new uqv();
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public /* synthetic */ vqv(int i, int i2, int i3, int i4, int i5) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, tqv.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vqv)) {
            return false;
        }
        vqv vqvVar = (vqv) obj;
        return this.a == vqvVar.a && this.b == vqvVar.b && this.c == vqvVar.c && this.d == vqvVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + oyr.b(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IndentDto(indentLeft=");
        sb.append(this.a);
        sb.append(", indentRight=");
        sb.append(this.b);
        sb.append(", indentTop=");
        sb.append(this.c);
        sb.append(", indentBottom=");
        return oyr.s(sb, this.d, ')');
    }

    public vqv(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }
}
