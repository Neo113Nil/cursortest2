package yc;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class m0 implements w0 {

    /* renamed from: g, reason: collision with root package name */
    public final boolean f8877g;

    public m0(boolean z10) {
        this.f8877g = z10;
    }

    @Override // yc.w0
    public final boolean b() {
        return this.f8877g;
    }

    @Override // yc.w0
    public final m1 e() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f8877g ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
