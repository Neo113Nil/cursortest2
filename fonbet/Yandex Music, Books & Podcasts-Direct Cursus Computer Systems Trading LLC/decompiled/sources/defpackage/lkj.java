package defpackage;

import com.yandex.plus.pay.a;
import com.yandex.plus.pay.api.analytics.b;
import com.yandex.plus.pay.api.analytics.c;
import com.yandex.plus.pay.api.analytics.d;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPaySmartOffer;
import com.yandex.plus.pay.internal.analytics.evgen.e;
import com.yandex.plus.pay.internal.g;
import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public final class lkj implements kkj {
    public final a a;
    public final c7m b;

    public lkj(a aVar, c7m c7mVar) {
        aVar.getClass();
        c7mVar.getClass();
        this.a = aVar;
        this.b = c7mVar;
    }

    public final void a(bve bveVar) {
        bveVar.getClass();
        PlusPaySmartOffer plusPaySmartOffer = bveVar.a;
        g gVar = (g) this.a;
        com.yandex.plus.pay.api.analytics.a b = gVar.b();
        PlusPayCompositeOffers.Offer compositeOffer = plusPaySmartOffer.getCompositeOffer();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        e eVar = (e) b;
        eVar.a(new d(plusPaySmartOffer.getPlace(), plusPaySmartOffer.getPage(), null, linkedHashMap), compositeOffer);
        com.yandex.plus.pay.api.analytics.tarifficator.e.a(gVar.g(), plusPaySmartOffer.getCompositeOffer(), plusPaySmartOffer.getPriority(), plusPaySmartOffer.getPlace(), plusPaySmartOffer.getPage(), null);
    }

    public final void b(bve bveVar) {
        bveVar.getClass();
        PlusPaySmartOffer plusPaySmartOffer = bveVar.a;
        g gVar = (g) this.a;
        com.yandex.plus.pay.api.analytics.a b = gVar.b();
        PlusPayCompositeOffers.Offer compositeOffer = plusPaySmartOffer.getCompositeOffer();
        b bVar = new b();
        bVar.a = plusPaySmartOffer.getMeta().getSessionId();
        c7m c7mVar = this.b;
        bVar.c = c7mVar.b();
        bVar.a(c7mVar.a());
        ((e) b).b(compositeOffer, new c(bVar.a, null, bVar.b, null, bVar.c, bVar.d));
        com.yandex.plus.pay.api.analytics.tarifficator.e.d(gVar.g(), plusPaySmartOffer.getCompositeOffer(), plusPaySmartOffer.getPriority(), plusPaySmartOffer.getPlace(), plusPaySmartOffer.getPage(), null);
    }
}
