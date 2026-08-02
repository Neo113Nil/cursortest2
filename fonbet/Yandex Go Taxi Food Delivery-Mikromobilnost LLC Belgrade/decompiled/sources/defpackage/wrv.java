package defpackage;

/* loaded from: classes.dex */
public final class wrv extends bb1 {
    public final float f;
    public final float g;
    public final float h;

    public wrv(float f, float f2, float f3) {
        this.f = f;
        this.g = f2;
        this.h = f3;
    }

    public static wrv p0(wrv wrvVar, float f, float f2, int i) {
        if ((i & 2) != 0) {
            f2 = wrvVar.g;
        }
        float f3 = wrvVar.h;
        wrvVar.getClass();
        return new wrv(f, f2, f3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wrv)) {
            return false;
        }
        wrv wrvVar = (wrv) obj;
        return Float.compare(this.f, wrvVar.f) == 0 && Float.compare(this.g, wrvVar.g) == 0 && Float.compare(this.h, wrvVar.h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + g8e.c(this.g, Float.hashCode(this.f) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoundedRect(itemWidth=");
        sb.append(this.f);
        sb.append(", itemHeight=");
        sb.append(this.g);
        sb.append(", cornerRadius=");
        return n.n(sb, this.h, ')');
    }
}
