package v1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final x4.l f7123a;

    /* renamed from: b, reason: collision with root package name */
    public a0 f7124b;

    /* renamed from: c, reason: collision with root package name */
    public final r0 f7125c = new r0(this, 2);

    /* renamed from: d, reason: collision with root package name */
    public final r0 f7126d = new r0(this, 0);

    /* renamed from: e, reason: collision with root package name */
    public final r0 f7127e = new r0(this, 1);

    public s0(x4.l lVar) {
        this.f7123a = lVar;
    }

    public final a0 a() {
        a0 a0Var = this.f7124b;
        if (a0Var != null) {
            return a0Var;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }
}
