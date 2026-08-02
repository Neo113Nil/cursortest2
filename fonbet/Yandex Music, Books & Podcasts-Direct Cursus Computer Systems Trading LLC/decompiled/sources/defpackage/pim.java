package defpackage;

/* loaded from: classes3.dex */
public final class pim {
    public final int a;
    public final int b;
    public final int c;

    public pim(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pim)) {
            return false;
        }
        pim pimVar = (pim) obj;
        return this.a == pimVar.a && this.b == pimVar.b && this.c == pimVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + f1d.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreCreationModel(capacity=");
        sb.append(this.a);
        sb.append(", min=");
        sb.append(this.b);
        sb.append(", max=");
        return vz1.r(sb, this.c, ')');
    }

    public /* synthetic */ pim(int i) {
        this(i, 0, Integer.MAX_VALUE);
    }
}
