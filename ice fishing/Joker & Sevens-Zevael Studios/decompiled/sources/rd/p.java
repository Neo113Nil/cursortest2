package rd;

import com.onesignal.inAppMessages.internal.display.impl.a;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6173g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v.c f6174h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ v.c f6175i;

    public /* synthetic */ p(v.c cVar, v.c cVar2, int i10) {
        this.f6173g = i10;
        this.f6174h = cVar;
        this.f6175i = cVar2;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        f1.e0 e0Var = (f1.e0) obj;
        switch (this.f6173g) {
            case 0:
                pc.j.e(e0Var, "$this$graphicsLayer");
                v.c cVar = this.f6174h;
                e0Var.g(((Number) cVar.d()).floatValue());
                e0Var.h(((Number) cVar.d()).floatValue());
                e0Var.a(((Number) this.f6175i.d()).floatValue());
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                pc.j.e(e0Var, "$this$graphicsLayer");
                v.c cVar2 = this.f6174h;
                e0Var.g(((Number) cVar2.d()).floatValue());
                e0Var.h(((Number) cVar2.d()).floatValue());
                e0Var.a(((Number) this.f6175i.d()).floatValue());
                break;
            default:
                pc.j.e(e0Var, "$this$graphicsLayer");
                v.c cVar3 = this.f6174h;
                e0Var.g(((Number) cVar3.d()).floatValue());
                e0Var.h(((Number) cVar3.d()).floatValue());
                e0Var.f(((Number) this.f6175i.d()).floatValue());
                break;
        }
        return ac.o.f277a;
    }
}
