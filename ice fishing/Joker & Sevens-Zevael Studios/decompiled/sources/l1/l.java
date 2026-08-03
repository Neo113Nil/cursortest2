package l1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class l extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f4070c;

    public l(float f10) {
        super(3);
        this.f4070c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Float.compare(this.f4070c, ((l) obj).f4070c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4070c);
    }

    public final String toString() {
        return a4.d.k(new StringBuilder("HorizontalTo(x="), this.f4070c, ')');
    }
}
