package defpackage;

/* loaded from: classes.dex */
public final class yrv extends sb2 {
    public final int A;
    public final int x;
    public final wrv y;
    public final float z;

    public yrv(int i, wrv wrvVar, float f, int i2) {
        this.x = i;
        this.y = wrvVar;
        this.z = f;
        this.A = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yrv)) {
            return false;
        }
        yrv yrvVar = (yrv) obj;
        return this.x == yrvVar.x && this.y.equals(yrvVar.y) && Float.compare(this.z, yrvVar.z) == 0 && this.A == yrvVar.A;
    }

    public final int hashCode() {
        return Integer.hashCode(this.A) + g8e.c(this.z, (this.y.hashCode() + (Integer.hashCode(this.x) * 31)) * 31, 31);
    }

    @Override // defpackage.sb2
    public final int r() {
        return this.x;
    }

    @Override // defpackage.sb2
    public final bb1 t() {
        return this.y;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoundedRect(color=");
        sb.append(this.x);
        sb.append(", itemSize=");
        sb.append(this.y);
        sb.append(", strokeWidth=");
        sb.append(this.z);
        sb.append(", strokeColor=");
        return oyr.s(sb, this.A, ')');
    }
}
