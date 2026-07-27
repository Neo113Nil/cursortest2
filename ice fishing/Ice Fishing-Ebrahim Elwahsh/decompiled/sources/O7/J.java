package O7;

/* loaded from: classes2.dex */
public final class J implements V {

    /* renamed from: n, reason: collision with root package name */
    public final boolean f2557n;

    public J(boolean z8) {
        this.f2557n = z8;
    }

    @Override // O7.V
    public final boolean j() {
        return this.f2557n;
    }

    @Override // O7.V
    public final k0 k() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f2557n ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
