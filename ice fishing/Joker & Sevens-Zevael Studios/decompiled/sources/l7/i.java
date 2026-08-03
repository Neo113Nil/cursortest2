package l7;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final r f4234a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4235b;

    public i(r rVar, boolean z10) {
        this.f4234a = rVar;
        this.f4235b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f4234a.equals(this.f4234a) && iVar.f4235b == this.f4235b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f4234a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f4235b).hashCode();
    }
}
