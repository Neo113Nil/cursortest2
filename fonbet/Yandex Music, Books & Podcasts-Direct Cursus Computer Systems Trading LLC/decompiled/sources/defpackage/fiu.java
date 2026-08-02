package defpackage;

/* loaded from: classes.dex */
public final class fiu extends hiu {
    public final int e;
    public final int f;

    public fiu(int i, int i2, int i3, int i4, int i5, int i6) {
        super(i3, i4, i5, i6);
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.hiu
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fiu)) {
            return false;
        }
        fiu fiuVar = (fiu) obj;
        return this.e == fiuVar.e && this.f == fiuVar.f && this.a == fiuVar.a && this.b == fiuVar.b && this.c == fiuVar.c && this.d == fiuVar.d;
    }

    @Override // defpackage.hiu
    public final int hashCode() {
        return Integer.hashCode(this.f) + Integer.hashCode(this.e) + super.hashCode();
    }

    public final String toString() {
        return hlr.e("ViewportHint.Access(\n            |    pageOffset=" + this.e + ",\n            |    indexInPage=" + this.f + ",\n            |    presentedItemsBefore=" + this.a + ",\n            |    presentedItemsAfter=" + this.b + ",\n            |    originalPageOffsetFirst=" + this.c + ",\n            |    originalPageOffsetLast=" + this.d + ",\n            |)");
    }
}
