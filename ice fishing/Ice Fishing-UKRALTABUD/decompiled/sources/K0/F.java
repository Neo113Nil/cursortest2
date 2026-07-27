package K0;

/* loaded from: classes.dex */
public final class F implements M {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f466f;

    public F(boolean z2) {
        this.f466f = z2;
    }

    @Override // K0.M
    public final boolean b() {
        return this.f466f;
    }

    @Override // K0.M
    public final b0 c() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f466f ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
