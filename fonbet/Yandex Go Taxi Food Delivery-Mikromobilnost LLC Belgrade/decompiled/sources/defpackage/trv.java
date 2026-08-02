package defpackage;

/* loaded from: classes11.dex */
public final class trv implements urv {
    public final float a;
    public final int b;

    public trv(float f, int i) {
        this.a = f;
        this.b = i;
    }

    public final float a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof trv)) {
            return false;
        }
        trv trvVar = (trv) obj;
        return Float.compare(this.a, trvVar.a) == 0 && this.b == trvVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Stretch(itemSpacing=");
        sb.append(this.a);
        sb.append(", maxVisibleItems=");
        return oyr.s(sb, this.b, ')');
    }
}
