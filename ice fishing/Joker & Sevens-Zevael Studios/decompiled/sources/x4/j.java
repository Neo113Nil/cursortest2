package x4;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f8307a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8308b;

    public j(String str, int i10) {
        pc.j.e(str, "workSpecId");
        this.f8307a = str;
        this.f8308b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return pc.j.a(this.f8307a, jVar.f8307a) && this.f8308b == jVar.f8308b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8308b) + (this.f8307a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb.append(this.f8307a);
        sb.append(", generation=");
        return a4.d.l(sb, this.f8308b, ')');
    }
}
