package d0;

import s2.f;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final float f1557a;

    public b(float f10) {
        this.f1557a = f10;
    }

    @Override // d0.a
    public final float a(long j3, s2.c cVar) {
        return cVar.x(this.f1557a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && f.a(this.f1557a, ((b) obj).f1557a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f1557a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f1557a + ".dp)";
    }
}
