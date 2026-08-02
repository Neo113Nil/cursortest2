package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.parks.nearest.presentation.ui.NearestZoneErrorModalView;
import com.yandex.go.promocodes.referral.impl.ui.b;
import com.yandex.go.taxi.main.h;
import com.yandex.mapkit.ScreenRect;
import kotlin.coroutines.Continuation;

/* loaded from: classes13.dex */
public final class r2s0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;

    public /* synthetic */ r2s0(h hVar, int i) {
        this.a = i;
        this.b = hVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        h hVar = this.b;
        switch (i) {
            case 0:
                Address h = ((d0l0) obj).h();
                if (h != null && !h.X1()) {
                    hVar.G.a().c(NearestZoneErrorModalView.class, true, null);
                    break;
                }
                break;
            case 1:
                hVar.Lg();
                break;
            default:
                ScreenRect screenRect = (ScreenRect) obj;
                b bVar = (b) hVar.D;
                bVar.getClass();
                if (screenRect != null && screenRect.getBottomRight().getY() - screenRect.getTopLeft().getY() > 0.0f) {
                    xni0 xni0Var = bVar.a;
                    xni0Var.E = screenRect;
                    xni0Var.Lg(xni0Var.B, xni0Var.z.a.b());
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
