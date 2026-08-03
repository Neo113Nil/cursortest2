package l1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a0 extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f3929c;

    public a0(float f10) {
        super(3);
        this.f3929c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && Float.compare(this.f3929c, ((a0) obj).f3929c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3929c);
    }

    public final String toString() {
        return a4.d.k(new StringBuilder("VerticalTo(y="), this.f3929c, ')');
    }
}
