package rd;

import androidx.lifecycle.m0;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.List;
import yc.r1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a0 implements bd.f {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6114g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d0 f6115h;

    public /* synthetic */ a0(d0 d0Var, int i10) {
        this.f6114g = i10;
        this.f6115h = d0Var;
    }

    @Override // bd.f
    public final Object a(Object obj, fc.d dVar) {
        switch (this.f6114g) {
            case 0:
                bd.e0 e0Var = this.f6115h.f6131d;
                e0Var.h(null, y.a((y) e0Var.getValue(), (qd.j) obj, null, null, null, false, false, false, null, null, 1022));
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                bd.e0 e0Var2 = this.f6115h.f6131d;
                e0Var2.h(null, y.a((y) e0Var2.getValue(), null, null, null, (List) obj, false, false, false, null, null, 1015));
                break;
            default:
                ac.i iVar = (ac.i) obj;
                qd.h hVar = (qd.h) iVar.f270g;
                List list = (List) iVar.f271h;
                d0 d0Var = this.f6115h;
                bd.e0 e0Var3 = d0Var.f6131d;
                e0Var3.h(null, y.a((y) e0Var3.getValue(), null, hVar, list, null, false, hVar.f5856l, false, null, null, 953));
                if (hVar.f5856l && !((y) e0Var3.getValue()).f6212h) {
                    e0Var3.h(null, y.a((y) e0Var3.getValue(), null, null, null, null, false, false, true, null, null, 895));
                    r1 r1Var = d0Var.f6133f;
                    if (r1Var != null) {
                        r1Var.a(null);
                    }
                    yc.a0.q(m0.h(d0Var), null, new c0(d0Var, hVar, null), 3);
                }
                break;
        }
        return ac.o.f277a;
    }
}
