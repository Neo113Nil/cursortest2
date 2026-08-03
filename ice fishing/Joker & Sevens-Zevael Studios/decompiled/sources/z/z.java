package z;

import x1.p1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class z extends y0.m implements p1 {

    /* renamed from: u, reason: collision with root package name */
    public float f9046u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f9047v;

    @Override // x1.p1
    public final Object W(Object obj) {
        f0 f0Var = obj instanceof f0 ? (f0) obj : null;
        if (f0Var == null) {
            f0Var = new f0();
            f0Var.f8951a = 0.0f;
            f0Var.f8952b = true;
        }
        f0Var.f8951a = this.f9046u;
        f0Var.f8952b = this.f9047v;
        return f0Var;
    }
}
