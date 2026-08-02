package defpackage;

/* loaded from: classes5.dex */
public final class fq4 implements gq4 {
    public final float a;
    public final float b;

    public fq4(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gq4
    public final boolean a(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b(Comparable comparable) {
        float floatValue = ((Number) comparable).floatValue();
        return floatValue >= this.a && floatValue <= this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fq4)) {
            return false;
        }
        if (isEmpty() && ((fq4) obj).isEmpty()) {
            return true;
        }
        fq4 fq4Var = (fq4) obj;
        return this.a == fq4Var.a && this.b == fq4Var.b;
    }

    @Override // defpackage.hq4
    public final Comparable g() {
        return Float.valueOf(this.a);
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    @Override // defpackage.hq4
    public final boolean isEmpty() {
        return this.a > this.b;
    }

    @Override // defpackage.hq4
    public final Comparable m() {
        return Float.valueOf(this.b);
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
