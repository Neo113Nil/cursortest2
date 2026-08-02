package defpackage;

import com.yandex.go.zone.dto.objects.BulletsOrderPopup;
import com.yandex.go.zone.dto.objects.DefaultOrderPopup;
import com.yandex.go.zone.dto.objects.DeliveryInsuranceModal;
import com.yandex.go.zone.dto.objects.OrderButton;
import com.yandex.go.zone.dto.objects.s6;
import com.yandex.go.zone.dto.objects.u2;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.tariffs.model.TariffSource;

/* loaded from: classes6.dex */
public final class v380 implements xi70 {
    public final iu6 a;

    public v380(iu6 iu6Var) {
        this.a = iu6Var;
    }

    public static wi70 c(String str, String str2, vi70 vi70Var) {
        if (evu0.J(str)) {
            return null;
        }
        return hay.g(str, str2, vi70Var.b, vi70Var.a.a.a == TariffSource.ZONE_INFO_AND_FULL_ROUTE_STATS, 8);
    }

    @Override // defpackage.xi70
    public final Object a(vi70 vi70Var, Continuation continuation) {
        pex0 pex0Var = vi70Var.a.a;
        u2 u2Var = pex0Var.e0.f;
        boolean z = u2Var instanceof BulletsOrderPopup;
        if (z) {
            BulletsOrderPopup.ShowPolicy showPolicy = ((BulletsOrderPopup) u2Var).f;
            String str = showPolicy.a;
            int i = showPolicy.b;
            int i2 = showPolicy.d;
            BulletsOrderPopup.ShowPolicy.Companion.getClass();
            r3 = this.a.a(i, str, showPolicy == BulletsOrderPopup.ShowPolicy.e, i2);
        } else if (!(u2Var instanceof DefaultOrderPopup)) {
            if (!(u2Var instanceof DeliveryInsuranceModal) && !jl40.l(u2Var, s6.INSTANCE)) {
                w511.b();
                return null;
            }
            r3 = false;
        }
        if (r3 && pex0Var.e0.e && !pex0Var.h()) {
            if (u2Var instanceof DefaultOrderPopup) {
                OrderButton orderButton = ((DefaultOrderPopup) u2Var).f;
                return c(orderButton.a, orderButton.b, vi70Var);
            }
            if (z) {
                OrderButton orderButton2 = ((BulletsOrderPopup) u2Var).g;
                return c(orderButton2.a, orderButton2.b, vi70Var);
            }
            if (!(u2Var instanceof DeliveryInsuranceModal) && !(u2Var instanceof s6)) {
                w511.b();
            }
        }
        return null;
    }

    @Override // defpackage.xi70
    public final String b() {
        return "OrderPopupButtonFactory";
    }
}
