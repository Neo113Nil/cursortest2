package L0;

/* loaded from: classes.dex */
public final class F implements M {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f614e;

    public F(boolean z2) {
        this.f614e = z2;
    }

    @Override // L0.M
    public final boolean b() {
        return this.f614e;
    }

    @Override // L0.M
    public final b0 c() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f614e ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
