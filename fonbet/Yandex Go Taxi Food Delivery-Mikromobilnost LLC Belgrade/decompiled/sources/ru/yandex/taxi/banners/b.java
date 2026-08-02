package ru.yandex.taxi.banners;

import defpackage.tje;
import java.util.function.Consumer;
import ru.yandex.taxi.promotions.model.Promotion;

/* loaded from: classes9.dex */
public final /* synthetic */ class b implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ b(c cVar, int i) {
        this.a = i;
        this.b = cVar;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        c cVar = this.b;
        switch (i) {
            case 0:
                cVar.r = (String) obj;
                cVar.i();
                tje.N(cVar.m, null, null, new BannersController$processNotificationBanners$1(cVar, null), 3);
                cVar.j();
                Promotion promotion = cVar.f.i;
                if (promotion != null) {
                    tje.N(cVar.m, null, null, new BannersController$processGeoNotificationBanners$1(promotion, cVar, null), 3);
                    break;
                }
                break;
            default:
                cVar.j();
                Promotion promotion2 = cVar.f.i;
                if (promotion2 != null) {
                    tje.N(cVar.m, null, null, new BannersController$processGeoNotificationBanners$1(promotion2, cVar, null), 3);
                    break;
                }
                break;
        }
    }
}
