package ru.yandex.taxi.banners;

import defpackage.b7z0;
import defpackage.cay0;
import defpackage.g8e;
import defpackage.gep0;
import defpackage.hz4;
import defpackage.klf0;
import defpackage.ltc;
import defpackage.qa0;
import defpackage.qeb1;
import defpackage.ruc;
import defpackage.tg60;
import defpackage.tje;
import defpackage.vg60;
import defpackage.wg60;
import defpackage.zpf0;
import ru.yandex.taxi.banners.model.h;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.communications.api.dto.TypedContentWidget;
import ru.yandex.taxi.design.NotificationStackComponent;
import ru.yandex.taxi.promotions.model.Promotion;

/* loaded from: classes5.dex */
public final class e extends hz4 {
    public final tg60 e;
    public final ruc f;
    public final ru.yandex.taxi.communications.a g;
    public final NotificationStackComponent h;
    public final h i;
    public final gep0 j;
    public final klf0 k;
    public final zpf0 l;
    public final b7z0 m;
    public final ru.yandex.taxi.widget.c n;
    public final ltc o;
    public long p;
    public final qa0 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(tg60 tg60Var, ruc rucVar, ru.yandex.taxi.communications.a aVar, NotificationStackComponent notificationStackComponent, h hVar, gep0 gep0Var, klf0 klf0Var, zpf0 zpf0Var, b7z0 b7z0Var, ru.yandex.taxi.widget.c cVar, ltc ltcVar) {
        super(vg60.b);
        wg60.P2.getClass();
        this.e = tg60Var;
        this.f = rucVar;
        this.g = aVar;
        this.h = notificationStackComponent;
        this.i = hVar;
        this.j = gep0Var;
        this.k = klf0Var;
        this.l = zpf0Var;
        this.m = b7z0Var;
        this.n = cVar;
        this.o = ltcVar;
        this.q = new qa0(13, this);
    }

    @Override // defpackage.hz4
    public final void d() {
        ((cay0) this.j).c(this.q);
        super.d();
    }

    public final String f() {
        return g8e.o("BannerNotificationComponent_", this.e.b);
    }

    public final void g() {
        tg60 tg60Var = this.e;
        this.i.k(tg60Var.b, null, Promotion.Type.NOTIFICATION, Promotion.a.contains(tg60Var.m()), ((cay0) this.j).b(), tg60Var.i);
        this.i.l(tg60Var.b, tg60Var.j);
    }

    public final CharSequence h(TypedContentWidget typedContentWidget, boolean z) {
        FormattedText formattedText = typedContentWidget.d;
        if (formattedText.a.isEmpty()) {
            return qeb1.c(typedContentWidget.a);
        }
        if (formattedText.e()) {
            return ru.yandex.taxi.widget.c.f(this.n, formattedText, false, null, 14);
        }
        tje.N(e(), null, null, new NotificationBannerPresenter$processTypedContent$1(this, formattedText, z, typedContentWidget, null), 3);
        return "";
    }
}
