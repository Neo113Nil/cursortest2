package L1;

/* loaded from: classes.dex */
public final class B implements I {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f525a;

    public B(boolean z2) {
        this.f525a = z2;
    }

    @Override // L1.I
    public final boolean a() {
        return this.f525a;
    }

    @Override // L1.I
    public final U b() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f525a ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
