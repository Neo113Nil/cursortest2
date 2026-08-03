package x1;

import com.onesignal.inAppMessages.internal.display.impl.a;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class w0 extends pc.k implements oc.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8198g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x0 f8199h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(x0 x0Var, int i10) {
        super(0);
        this.f8198g = i10;
        this.f8199h = x0Var;
    }

    @Override // oc.a
    public final Object invoke() {
        v1.i0 placementScope;
        switch (this.f8198g) {
            case 0:
                x0 x0Var = this.f8199h;
                k0 k0Var = x0Var.f8201l;
                k0Var.f8096i = 0;
                o0.e w3 = k0Var.f8088a.w();
                Object[] objArr = w3.f5134g;
                int i10 = w3.f5136i;
                for (int i11 = 0; i11 < i10; i11++) {
                    x0 x0Var2 = ((g0) objArr[i11]).J.f8103p;
                    x0Var2.f8203n = x0Var2.f8204o;
                    x0Var2.f8204o = Integer.MAX_VALUE;
                    x0Var2.f8214y = false;
                    if (x0Var2.f8207r == e0.f8020h) {
                        x0Var2.f8207r = e0.f8021i;
                    }
                }
                g0 g0Var = k0Var.f8088a;
                g0 g0Var2 = k0Var.f8088a;
                o0.e w10 = g0Var.w();
                Object[] objArr2 = w10.f5134g;
                int i12 = w10.f5136i;
                for (int i13 = 0; i13 < i12; i13++) {
                    ((g0) objArr2[i13]).J.f8103p.C.getClass();
                }
                x0Var.k().j0().b();
                o0.e w11 = g0Var2.w();
                Object[] objArr3 = w11.f5134g;
                int i14 = w11.f5136i;
                for (int i15 = 0; i15 < i14; i15++) {
                    g0 g0Var3 = (g0) objArr3[i15];
                    k0 k0Var2 = g0Var3.J;
                    if (k0Var2.f8103p.f8203n != g0Var3.t()) {
                        g0Var2.M();
                        g0Var2.A();
                        if (g0Var3.t() == Integer.MAX_VALUE) {
                            if (k0Var2.f8090c) {
                                t0 t0Var = k0Var2.f8104q;
                                pc.j.b(t0Var);
                                t0Var.T(false);
                            }
                            k0Var2.f8103p.X();
                        }
                    }
                }
                o0.e w12 = g0Var2.w();
                Object[] objArr4 = w12.f5134g;
                int i16 = w12.f5136i;
                for (int i17 = 0; i17 < i16; i17++) {
                    h0 h0Var = ((g0) objArr4[i17]).J.f8103p.C;
                    h0Var.getClass();
                    h0Var.f8069c = false;
                }
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                x0 x0Var3 = this.f8199h;
                x0Var3.f8201l.a().e(x0Var3.G);
                break;
            default:
                x0 x0Var4 = this.f8199h;
                k0 k0Var3 = x0Var4.f8201l;
                f1 f1Var = k0Var3.a().f8035w;
                if (f1Var == null || (placementScope = f1Var.f8127r) == null) {
                    placementScope = ((y1.r) j0.a(k0Var3.f8088a)).getPlacementScope();
                }
                oc.c cVar = x0Var4.L;
                if (cVar == null) {
                    f1 a6 = k0Var3.a();
                    long j3 = x0Var4.M;
                    float f10 = x0Var4.N;
                    placementScope.getClass();
                    v1.i0.a(placementScope, a6);
                    a6.P(s2.i.c(j3, a6.f7089k), f10, null);
                } else {
                    f1 a8 = k0Var3.a();
                    long j6 = x0Var4.M;
                    float f11 = x0Var4.N;
                    placementScope.getClass();
                    v1.i0.a(placementScope, a8);
                    a8.P(s2.i.c(j6, a8.f7089k), f11, cVar);
                }
                break;
        }
        return ac.o.f277a;
    }
}
