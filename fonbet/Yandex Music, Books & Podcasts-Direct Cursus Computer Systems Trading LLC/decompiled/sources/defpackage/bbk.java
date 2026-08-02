package defpackage;

/* loaded from: classes.dex */
public final class bbk extends ebk {
    public final float c;
    public final float d;

    public bbk(float f, float f2) {
        super(1);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbk)) {
            return false;
        }
        bbk bbkVar = (bbk) obj;
        return Float.compare(this.c, bbkVar.c) == 0 && Float.compare(this.d, bbkVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb.append(this.c);
        sb.append(", dy=");
        return ouj.p(sb, this.d, ')');
    }
}
