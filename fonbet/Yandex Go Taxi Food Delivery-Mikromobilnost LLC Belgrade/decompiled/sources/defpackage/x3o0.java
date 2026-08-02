package defpackage;

import com.yandex.go.scooters.offer_on_camera.b;
import com.yandex.go.scooters.offer_on_camera.domain.a;
import java.util.List;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class x3o0 implements j4o0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h55 b;

    public /* synthetic */ x3o0(h55 h55Var, int i) {
        this.a = i;
        this.b = h55Var;
    }

    @Override // defpackage.sy60
    public final void a() {
        switch (this.a) {
            case 0:
                a aVar = ((b) this.b).G;
                aVar.f.b = false;
                aVar.b.Fg(opo0.a);
                break;
            default:
                i4o0 i4o0Var = (i4o0) this.b;
                i4o0.P(i4o0Var);
                i4o0Var.r(new qu(9));
                break;
        }
    }

    @Override // defpackage.j4o0
    public final void j1(fcj0 fcj0Var) {
        int i = this.a;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                b bVar = (b) h55Var;
                bVar.r(new vam0(21, fcj0Var, (qpo0) ((r0) bVar.G.b.b).getValue()));
                break;
            default:
                i4o0 i4o0Var = (i4o0) h55Var;
                i4o0.P(i4o0Var);
                i4o0Var.r(new t6n0(fcj0Var, 1));
                break;
        }
    }

    @Override // defpackage.j4o0
    public final void x(List list, pxm0 pxm0Var) {
        int i = this.a;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                ((b) h55Var).r(new w3o0(list, pxm0Var, 0));
                break;
            default:
                i4o0 i4o0Var = (i4o0) h55Var;
                i4o0.P(i4o0Var);
                i4o0Var.r(new w3o0(list, pxm0Var, 1));
                break;
        }
    }
}
