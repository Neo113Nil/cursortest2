package T3;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final r f3190a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3191b;

    public i(r rVar, boolean z6) {
        this.f3190a = rVar;
        this.f3191b = z6;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f3190a.equals(this.f3190a) && iVar.f3191b == this.f3191b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f3190a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f3191b).hashCode();
    }
}
