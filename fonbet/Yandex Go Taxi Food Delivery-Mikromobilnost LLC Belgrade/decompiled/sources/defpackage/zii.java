package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import java.util.LinkedHashMap;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes5.dex */
public final class zii {
    public final wiq0 a;
    public final lx4 b;
    public final nji0 c;

    public zii(wiq0 wiq0Var, lx4 lx4Var, nji0 nji0Var) {
        this.a = wiq0Var;
        this.b = lx4Var;
        this.c = nji0Var;
    }

    public final void a(int i, String str) {
        i d = ((j) this.b).d("DeliveryDetailsCard.PhotoComment.UploadError.Tapped");
        d.d("button_name", str);
        d.b(i, "num_pictures");
        pex0 m = ((k) this.a).m();
        d.a.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, m != null ? m.b : null);
        d.m();
    }

    public final void b(int i, int i2, String str) {
        String str2;
        hki a = this.c.a(i);
        int i3 = iwh.a[a.a().ordinal()];
        if (i3 == 1) {
            str2 = "source";
        } else {
            if (i3 != 2) {
                w511.b();
                return;
            }
            str2 = "destination";
        }
        i d = ((j) this.b).d("DeliveryDetailsCard.Tapped");
        LinkedHashMap linkedHashMap = d.a;
        if (a instanceof fki) {
            d.b(((fki) a).a + 1, "current_destination_point_num");
            d.b(i2 - 1, "total_destination_points_num");
        }
        linkedHashMap.put("button_name", str2 + "_" + str);
        pex0 m = ((k) this.a).m();
        linkedHashMap.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, m != null ? m.b : null);
        d.m();
    }
}
