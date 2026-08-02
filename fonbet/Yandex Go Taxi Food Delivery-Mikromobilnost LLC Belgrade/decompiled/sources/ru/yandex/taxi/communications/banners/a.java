package ru.yandex.taxi.communications.banners;

import com.yandex.go.promocodes.base.impl.promo_codes.data.repositories.c;
import defpackage.bt4;
import defpackage.ct4;
import defpackage.hit;
import defpackage.tje;
import defpackage.w511;
import ru.yandex.taxi.communications.api.dto.BannerWidgets;

/* loaded from: classes9.dex */
public final class a implements bt4 {
    public final c a;
    public final hit b;

    public a(c cVar, hit hitVar) {
        this.a = cVar;
        this.b = hitVar;
    }

    public final void a(BannerWidgets.OnCloseEffect onCloseEffect) {
        BannerWidgets.OnCloseEffect.Type type = onCloseEffect.b;
        int i = type == null ? -1 : ct4.a[type.ordinal()];
        if (i != -1) {
            if (i == 1) {
                tje.N(this.b.a, null, null, new BannerOnCloseEffectsHandlerImpl$handle$1(onCloseEffect, this, null), 3);
            } else {
                w511.b();
            }
        }
    }
}
