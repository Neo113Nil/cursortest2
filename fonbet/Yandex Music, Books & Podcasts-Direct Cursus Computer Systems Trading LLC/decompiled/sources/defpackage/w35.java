package defpackage;

/* loaded from: classes6.dex */
public final class w35 {
    public final float a;
    public final float b;

    public w35(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w35)) {
            return false;
        }
        w35 w35Var = (w35) obj;
        return Float.compare(this.a, w35Var.a) == 0 && Float.compare(this.b, w35Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectionScrollPadding(start=");
        sb.append(this.a);
        sb.append(", end=");
        return ouj.p(sb, this.b, ')');
    }
}
