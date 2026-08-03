package l1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class t extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f4098c;

    public t(float f10) {
        super(3);
        this.f4098c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Float.compare(this.f4098c, ((t) obj).f4098c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4098c);
    }

    public final String toString() {
        return a4.d.k(new StringBuilder("RelativeHorizontalTo(dx="), this.f4098c, ')');
    }
}
