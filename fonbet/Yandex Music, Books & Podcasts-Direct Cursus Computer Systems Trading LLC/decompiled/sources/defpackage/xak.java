package defpackage;

/* loaded from: classes.dex */
public final class xak extends ebk {
    public final float c;
    public final float d;

    public xak(float f, float f2) {
        super(3);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xak)) {
            return false;
        }
        xak xakVar = (xak) obj;
        return Float.compare(this.c, xakVar.c) == 0 && Float.compare(this.d, xakVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeLineTo(dx=");
        sb.append(this.c);
        sb.append(", dy=");
        return ouj.p(sb, this.d, ')');
    }
}
