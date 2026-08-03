package c0;

import com.onesignal.inAppMessages.internal.display.impl.a;
import f1.o;
import pc.j;
import pc.k;
import x1.f1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h extends k implements oc.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1195g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f1 f1196h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(f1 f1Var, int i10) {
        super(0);
        this.f1195g = i10;
        this.f1196h = f1Var;
    }

    @Override // oc.a
    public final Object invoke() {
        switch (this.f1195g) {
            case 0:
                f1 f1Var = this.f1196h;
                if (!f1Var.B0().f8456t) {
                    f1Var = null;
                }
                if (f1Var != null) {
                    break;
                }
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                f1 f1Var2 = this.f1196h;
                o oVar = f1Var2.K;
                j.b(oVar);
                f1Var2.v0(oVar, f1Var2.J);
                break;
            default:
                f1 f1Var3 = this.f1196h.f8035w;
                if (f1Var3 != null) {
                    f1Var3.I0();
                }
                break;
        }
        return ac.o.f277a;
    }
}
