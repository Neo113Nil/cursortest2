package S7;

/* loaded from: classes2.dex */
public final class J implements V {

    /* renamed from: n, reason: collision with root package name */
    public final boolean f3004n;

    public J(boolean z6) {
        this.f3004n = z6;
    }

    @Override // S7.V
    public final boolean j() {
        return this.f3004n;
    }

    @Override // S7.V
    public final k0 k() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f3004n ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
