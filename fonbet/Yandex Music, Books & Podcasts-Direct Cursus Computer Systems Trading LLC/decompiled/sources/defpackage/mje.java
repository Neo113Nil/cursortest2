package defpackage;

/* loaded from: classes3.dex */
public final class mje extends weo {
    public final float i;
    public final float j;
    public final float k;

    public mje(float f, float f2, float f3) {
        this.i = f;
        this.j = f2;
        this.k = f3;
    }

    public static mje W(mje mjeVar, float f, float f2, int i) {
        if ((i & 2) != 0) {
            f2 = mjeVar.j;
        }
        float f3 = mjeVar.k;
        mjeVar.getClass();
        return new mje(f, f2, f3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mje)) {
            return false;
        }
        mje mjeVar = (mje) obj;
        return Float.compare(this.i, mjeVar.i) == 0 && Float.compare(this.j, mjeVar.j) == 0 && Float.compare(this.k, mjeVar.k) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.k) + eta.a(Float.hashCode(this.i) * 31, this.j, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoundedRect(itemWidth=");
        sb.append(this.i);
        sb.append(", itemHeight=");
        sb.append(this.j);
        sb.append(", cornerRadius=");
        return ouj.p(sb, this.k, ')');
    }
}
