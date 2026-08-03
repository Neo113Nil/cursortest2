package r2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: c, reason: collision with root package name */
    public static final p f6037c = new p(1.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f6038a;

    /* renamed from: b, reason: collision with root package name */
    public final float f6039b;

    public p(float f10, float f11) {
        this.f6038a = f10;
        this.f6039b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f6038a == pVar.f6038a && this.f6039b == pVar.f6039b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6039b) + (Float.hashCode(this.f6038a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.f6038a);
        sb.append(", skewX=");
        return a4.d.k(sb, this.f6039b, ')');
    }
}
