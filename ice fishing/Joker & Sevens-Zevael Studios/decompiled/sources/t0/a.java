package t0;

import a4.d;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f6510a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f6510a == ((a) obj).f6510a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6510a);
    }

    public final String toString() {
        return d.l(new StringBuilder("DeltaCounter(count="), this.f6510a, ')');
    }
}
