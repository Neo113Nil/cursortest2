package defpackage;

import android.content.Context;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.zone.dto.objects.ServiceLevel;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.communications.model.widgets.ActionButton;

/* loaded from: classes14.dex */
public final class vpv0 {
    public final wiq0 a;
    public final tu b;

    public vpv0(Context context, wiq0 wiq0Var, tu tuVar) {
        this.a = wiq0Var;
        this.b = tuVar;
    }

    public final void a() {
        List list;
        Object obj;
        pex0 m = ((k) this.a).m();
        ServiceLevel.TariffPopup tariffPopup = null;
        if (m != null && (list = m.S) != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((ServiceLevel.Branding) obj).c == ServiceLevel.Branding.Type.TARIFF_TOOLTIP) {
                        break;
                    }
                }
            }
            ServiceLevel.Branding branding = (ServiceLevel.Branding) obj;
            if (branding != null) {
                tariffPopup = branding.o;
            }
        }
        if (tariffPopup != null) {
            ((uu) this.b).a(new ActionButton.h(tariffPopup.a, FormattedText.Companion.c(tariffPopup.b), new ActionButton.e(tariffPopup.c, 6), 4));
        } else {
            jst.e.q("Popup info is missing in selected tariff!");
        }
    }
}
