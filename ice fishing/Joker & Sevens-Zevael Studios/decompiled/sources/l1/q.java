package l1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class q extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f4083c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4084d;

    public q(float f10, float f11) {
        super(1);
        this.f4083c = f10;
        this.f4084d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Float.compare(this.f4083c, qVar.f4083c) == 0 && Float.compare(this.f4084d, qVar.f4084d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4084d) + (Float.hashCode(this.f4083c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveQuadTo(x=");
        sb.append(this.f4083c);
        sb.append(", y=");
        return a4.d.k(sb, this.f4084d, ')');
    }
}
