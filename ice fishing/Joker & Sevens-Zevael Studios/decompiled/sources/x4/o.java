package x4;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public String f8320a;

    /* renamed from: b, reason: collision with root package name */
    public int f8321b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return pc.j.a(this.f8320a, oVar.f8320a) && this.f8321b == oVar.f8321b;
    }

    public final int hashCode() {
        return v.f.d(this.f8321b) + (this.f8320a.hashCode() * 31);
    }

    public final String toString() {
        return "IdAndState(id=" + this.f8320a + ", state=" + a4.d.w(this.f8321b) + ')';
    }
}
