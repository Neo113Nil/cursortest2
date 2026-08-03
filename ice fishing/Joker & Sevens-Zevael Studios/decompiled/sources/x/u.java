package x;

import com.onesignal.inAppMessages.internal.display.impl.a;
import m0.x2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class u extends pc.k implements oc.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7907g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s0 f7908h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(s0 s0Var, int i10) {
        super(0);
        this.f7907g = i10;
        this.f7908h = s0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        if (r0 != false) goto L13;
     */
    @Override // oc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        boolean z10;
        boolean z11;
        switch (this.f7907g) {
            case 0:
                ad.e eVar = this.f7908h.A;
                if (eVar != null) {
                    eVar.s(m.f7845a);
                }
                return ac.o.f277a;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                z0 z0Var = this.f7908h.J;
                if (!z0Var.f7951a.b()) {
                    w.w0 w0Var = z0Var.f7952b;
                    z10 = false;
                    if (w0Var == null) {
                        z11 = false;
                        break;
                    } else {
                        z11 = w0Var.a();
                        break;
                    }
                }
                z10 = true;
                return Boolean.valueOf(!z10);
            default:
                x2 x2Var = y1.y0.f8709h;
                s0 s0Var = this.f7908h;
                s0Var.I.f7834a = new v.t(new m7.g((s2.c) x1.f.i(s0Var, x2Var)));
                return ac.o.f277a;
        }
    }
}
