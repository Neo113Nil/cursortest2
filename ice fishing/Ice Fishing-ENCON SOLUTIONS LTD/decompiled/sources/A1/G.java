package A1;

/* loaded from: classes.dex */
public final class G implements N {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5a;

    public G(boolean z2) {
        this.f5a = z2;
    }

    @Override // A1.N
    public final boolean b() {
        return this.f5a;
    }

    @Override // A1.N
    public final c0 d() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f5a ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
