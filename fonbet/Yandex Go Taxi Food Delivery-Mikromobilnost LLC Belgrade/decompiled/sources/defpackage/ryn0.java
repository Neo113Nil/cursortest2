package defpackage;

import android.content.Context;
import com.yandex.go.scooters.api.domain.model.ScootersVehicleType;
import java.util.HashMap;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.common_models.net.b;
import ru.yandex.taxi.scooters.data.p;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes6.dex */
public final class ryn0 extends h55 {
    public final e D;
    public final yvf0 E;
    public final p F;
    public final mr40 G;
    public final kyn0 H;

    public ryn0(e eVar, yvf0 yvf0Var, p pVar, mr40 mr40Var, kyn0 kyn0Var) {
        super(null);
        this.D = eVar;
        this.E = yvf0Var;
        this.F = pVar;
        this.G = mr40Var;
        this.H = kyn0Var;
    }

    public static final void P(ryn0 ryn0Var) {
        String str;
        cyn0 b = ryn0Var.F.b();
        if (b == null || (str = b.b) == null) {
            return;
        }
        ryn0Var.G.a.a.a("MultimodalRoute.Completion.Tapped", x4e.p("multimodal_id", str), 1, new HashMap());
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        int i;
        String str;
        ScootersVehicleType scootersVehicleType = ((pyn0) obj).a;
        cyn0 b = this.F.b();
        if (b != null && (str = b.b) != null) {
            this.G.a.a.a("MultimodalRoute.Completion.Shown", x4e.p("multimodal_id", str), 1, new HashMap());
        }
        int i2 = qyn0.a[scootersVehicleType.ordinal()];
        if (i2 == 1) {
            i = kyh0.scooters_cancel_mobility_hub_route_navigation_first_btn;
        } else {
            if (i2 != 2) {
                w511.b();
                return;
            }
            i = kyh0.scooters_cancel_mobility_hub_route_navigation_first_btn_bicycle;
        }
        b bVar = FormattedText.Companion;
        int i3 = kyh0.scooters_cancel_mobility_hub_route_navigation_title;
        Context context = this.D.a;
        A((m950) this.E.get(), new iqm0(null, null, b.b(bVar, context.getString(i3), null, null, null, FormattedText.FontWeight.BOLD, 30), null, new xpm0(bVar.c(context.getString(i)), null), new xpm0(bVar.c(context.getString(kyh0.scooters_cancel_mobility_hub_route_navigation_second_btn)), null), 59), new dgn0(2, this));
    }
}
