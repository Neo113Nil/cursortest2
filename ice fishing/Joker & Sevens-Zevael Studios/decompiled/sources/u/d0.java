package u;

import v.z0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d0 extends pc.k implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6578g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e0 f6579h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(e0 e0Var, int i10) {
        super(1);
        this.f6578g = i10;
        this.f6579h = e0Var;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        switch (this.f6578g) {
            case 0:
                z0 z0Var = (z0) obj;
                v vVar = v.f6645g;
                v vVar2 = v.f6646h;
                v.o0 o0Var = null;
                if (!z0Var.b(vVar, vVar2)) {
                    if (z0Var.b(vVar2, v.f6647i)) {
                        o0 o0Var2 = this.f6579h.f6585v.f6601a;
                    } else {
                        o0Var = b0.f6569d;
                    }
                }
                return o0Var == null ? b0.f6569d : o0Var;
            default:
                z0 z0Var2 = (z0) obj;
                v vVar3 = v.f6645g;
                v vVar4 = v.f6646h;
                if (z0Var2.b(vVar3, vVar4)) {
                    return b0.f6568c;
                }
                if (!z0Var2.b(vVar4, v.f6647i)) {
                    return b0.f6568c;
                }
                o0 o0Var3 = this.f6579h.f6585v.f6601a;
                return b0.f6568c;
        }
    }
}
