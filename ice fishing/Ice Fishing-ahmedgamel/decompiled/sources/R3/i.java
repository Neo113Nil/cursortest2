package R3;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final r f2735a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2736b;

    public i(r rVar, boolean z3) {
        this.f2735a = rVar;
        this.f2736b = z3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f2735a.equals(this.f2735a) && iVar.f2736b == this.f2736b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f2735a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f2736b).hashCode();
    }
}
