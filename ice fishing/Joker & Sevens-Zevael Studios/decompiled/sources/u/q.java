package u;

import v.e1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class q extends pc.k implements oc.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6636g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e1 f6637h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(e1 e1Var, int i10) {
        super(0);
        this.f6636g = i10;
        this.f6637h = e1Var;
    }

    @Override // oc.a
    public final Object invoke() {
        switch (this.f6636g) {
            case 0:
                e1 e1Var = this.f6637h;
                Object c3 = e1Var.c();
                v vVar = v.f6647i;
                return Boolean.valueOf(c3 == vVar && e1Var.f6826d.getValue() == vVar);
            default:
                return Long.valueOf(this.f6637h.b());
        }
    }
}
