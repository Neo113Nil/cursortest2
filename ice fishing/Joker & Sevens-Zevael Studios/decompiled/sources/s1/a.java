package s1;

import a4.d;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public long f6374a;

    /* renamed from: b, reason: collision with root package name */
    public float f6375b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f6374a == aVar.f6374a && Float.compare(this.f6375b, aVar.f6375b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6375b) + (Long.hashCode(this.f6374a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataPointAtTime(time=");
        sb.append(this.f6374a);
        sb.append(", dataPoint=");
        return d.k(sb, this.f6375b, ')');
    }
}
