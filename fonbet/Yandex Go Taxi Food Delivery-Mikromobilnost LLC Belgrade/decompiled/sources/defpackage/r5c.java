package defpackage;

/* loaded from: classes9.dex */
public final class r5c implements s5c {
    public final float a;
    public final float b;

    public r5c(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.s5c
    public final boolean a(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.a6c
    public final boolean b(Comparable comparable) {
        float floatValue = ((Number) comparable).floatValue();
        return floatValue >= this.a && floatValue <= this.b;
    }

    @Override // defpackage.a6c
    public final Comparable d() {
        return Float.valueOf(this.b);
    }

    @Override // defpackage.a6c
    public final Comparable e() {
        return Float.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r5c)) {
            return false;
        }
        if (isEmpty() && ((r5c) obj).isEmpty()) {
            return true;
        }
        r5c r5cVar = (r5c) obj;
        return this.a == r5cVar.a && this.b == r5cVar.b;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    @Override // defpackage.a6c
    public final boolean isEmpty() {
        return this.a > this.b;
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
