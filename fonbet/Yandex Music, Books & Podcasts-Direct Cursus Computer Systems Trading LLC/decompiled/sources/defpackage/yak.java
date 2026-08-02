package defpackage;

/* loaded from: classes.dex */
public final class yak extends ebk {
    public final float c;
    public final float d;

    public yak(float f, float f2) {
        super(3);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yak)) {
            return false;
        }
        yak yakVar = (yak) obj;
        return Float.compare(this.c, yakVar.c) == 0 && Float.compare(this.d, yakVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeMoveTo(dx=");
        sb.append(this.c);
        sb.append(", dy=");
        return ouj.p(sb, this.d, ')');
    }
}
