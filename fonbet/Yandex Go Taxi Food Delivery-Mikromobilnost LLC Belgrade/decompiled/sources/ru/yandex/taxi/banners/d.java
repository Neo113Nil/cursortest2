package ru.yandex.taxi.banners;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.ViewGroup;
import defpackage.b7z0;
import defpackage.bt4;
import defpackage.cay0;
import defpackage.cb8;
import defpackage.eb8;
import defpackage.et4;
import defpackage.evu0;
import defpackage.fb8;
import defpackage.gb8;
import defpackage.gep0;
import defpackage.hz4;
import defpackage.iux0;
import defpackage.klf0;
import defpackage.kr4;
import defpackage.ltc;
import defpackage.n9y0;
import defpackage.ot4;
import defpackage.pwy0;
import defpackage.qeb1;
import defpackage.qke;
import defpackage.ru4;
import defpackage.ruc;
import defpackage.sqx;
import defpackage.tje;
import defpackage.tsf0;
import defpackage.u08;
import defpackage.vt4;
import defpackage.zpf0;
import defpackage.zq4;
import java.util.List;
import ru.yandex.taxi.HapticController$Effect;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.banners.model.h;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.communications.api.dto.BannerWidgets;
import ru.yandex.taxi.communications.api.dto.TypedContentWidget;
import ru.yandex.taxi.communications.n;
import ru.yandex.taxi.communications.q;
import ru.yandex.taxi.communications.ui.LabelInfoModalView;
import ru.yandex.taxi.promotions.model.Promotion;
import ru.yandex.taxi.promotions.model.PromotionBackground;

/* loaded from: classes5.dex */
public final class d extends hz4 {
    public long A;
    public PromoBannerActivationStatus B;
    public BannerWidgets.OnCloseEffect C;
    public final cb8 e;
    public final String f;
    public final ViewGroup g;
    public final ruc h;
    public final ru.yandex.taxi.communications.a i;
    public final Activity j;
    public final h k;
    public final klf0 l;
    public final zpf0 m;
    public final b7z0 n;
    public final ru.yandex.taxi.widget.c o;
    public final kr4 p;
    public final ltc q;
    public final q r;
    public final pwy0 s;
    public final com.yandex.go.benefits_center.activation.data.b t;
    public final ru4 u;
    public final et4 v;
    public final zq4 w;
    public final gep0 x;
    public final bt4 y;
    public final sqx z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(cb8 cb8Var, String str, ViewGroup viewGroup, ruc rucVar, ru.yandex.taxi.communications.a aVar, Activity activity, h hVar, klf0 klf0Var, zpf0 zpf0Var, b7z0 b7z0Var, ru.yandex.taxi.widget.c cVar, kr4 kr4Var, ltc ltcVar, q qVar, pwy0 pwy0Var, com.yandex.go.benefits_center.activation.data.b bVar, ru4 ru4Var, et4 et4Var, zq4 zq4Var, gep0 gep0Var, bt4 bt4Var) {
        super(eb8.b);
        fb8.w1.getClass();
        this.e = cb8Var;
        this.f = str;
        this.g = viewGroup;
        this.h = rucVar;
        this.i = aVar;
        this.j = activity;
        this.k = hVar;
        this.l = klf0Var;
        this.m = zpf0Var;
        this.n = b7z0Var;
        this.o = cVar;
        this.p = kr4Var;
        this.q = ltcVar;
        this.r = qVar;
        this.s = pwy0Var;
        this.t = bVar;
        this.u = ru4Var;
        this.v = et4Var;
        this.w = zq4Var;
        this.x = gep0Var;
        this.y = bt4Var;
        this.z = new sqx(activity);
    }

    @Override // defpackage.hz4
    public final void d() {
        cb8 cb8Var = this.e;
        this.k.l(cb8Var.b, cb8Var.j);
        this.p.onDetach();
        super.d();
        BannerWidgets.OnCloseEffect onCloseEffect = this.C;
        if (onCloseEffect != null) {
            this.C = null;
            ((ru.yandex.taxi.communications.banners.a) this.y).a(onCloseEffect);
        }
    }

    public final void f(fb8 fb8Var) {
        c(fb8Var);
        this.A = this.n.a();
        cb8 cb8Var = this.e;
        fb8Var.setData(cb8Var);
        this.k.k(cb8Var.b, null, Promotion.Type.CARD, Promotion.a.contains(cb8Var.m()), ((cay0) this.x).b(), cb8Var.i);
        boolean z = cb8Var.t;
        klf0 klf0Var = this.l;
        String str = this.f;
        if (z) {
            boolean z2 = tsf0.a;
            ((n9y0) klf0Var).g(cb8Var, str, 0L);
        } else {
            ((n9y0) klf0Var).g(cb8Var, str, null);
        }
        tje.N(e(), null, null, new CardBannerPresenter$attachView$1(this, null), 3);
    }

    public final void g(BannerWidgets.b bVar) {
        for (vt4 vt4Var : bVar.h) {
            if (vt4Var instanceof ot4) {
                ((ClipboardManager) this.j.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Promocode", ((ot4) vt4Var).a));
            }
        }
    }

    public final void h(BannerWidgets.b bVar) {
        BannerWidgets.ActionType actionType;
        BannerWidgets.a aVar = bVar.g;
        BannerWidgets.OnCloseEffect onCloseEffect = bVar.k;
        if (onCloseEffect != null) {
            this.C = onCloseEffect;
        }
        String b = ((cay0) this.x).b();
        zpf0 zpf0Var = this.m;
        cb8 cb8Var = this.e;
        zpf0Var.c(cb8Var, b);
        BannerWidgets.a aVar2 = bVar.g;
        ((n9y0) this.l).c(this.e, this.f, (aVar2 == null || (actionType = aVar2.a) == null) ? null : actionType.getAnalyticsName(), bVar.a, bVar.c, null, 0, 1, this.n.a() - this.A, PromotionBackground.Type.COLOR);
        this.r.a(bVar.b);
        ru.yandex.taxi.communications.a aVar3 = this.i;
        ruc rucVar = this.h;
        boolean z = false;
        if (aVar != null) {
            BannerWidgets.c cVar = aVar.b;
            BannerWidgets.ActionType actionType2 = aVar.a;
            if (actionType2 != null && cVar != null) {
                if (actionType2 != null && cVar != null) {
                    String str = cVar.a;
                    int i = gb8.a[actionType2.ordinal()];
                    if (i == 1) {
                        boolean a = aVar3.a(str, BannerType.CARD, onCloseEffect == null ? null : new u08(3, this, onCloseEffect));
                        g(bVar);
                        if (a) {
                            this.C = null;
                        }
                        ((fb8) this.a).dismiss();
                    } else if (i == 2) {
                        if (str != null && !evu0.J(str)) {
                            ((n) rucVar).b(str, cVar.b);
                        }
                        ((fb8) this.a).dismiss();
                    } else if (i == 3) {
                        HapticController$Effect hapticController$Effect = HapticController$Effect.BZZ;
                        Activity activity = this.j;
                        qke.E(activity, hapticController$Effect, false, 12);
                        ((ClipboardManager) activity.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Promocode", cVar.c));
                        ((fb8) this.a).updateButton(bVar, new BannerWidgets.b(null, cVar.g, null, bVar.e, null, bVar.g, 3755), cb8Var.s.a());
                    } else if (i != 4) {
                        ((iux0) this.q).d(actionType2);
                    } else {
                        tje.N(e(), null, null, new CardBannerPresenter$handleBannerAction$1(this, bVar, cVar, new BannerWidgets.a(BannerWidgets.ActionType.SAVE_BENEFIT, BannerWidgets.c.a(cVar, null, null)), null), 3);
                    }
                }
                this.p.c();
            }
        }
        BannerType bannerType = BannerType.CARD;
        String str2 = bVar.a;
        String str3 = bVar.d;
        u08 u08Var = onCloseEffect == null ? null : new u08(3, this, onCloseEffect);
        if (str2 != null && !evu0.J(str2)) {
            if ("webview".equals(str3)) {
                ((n) rucVar).b(str2, false);
            } else {
                z = aVar3.a(str2, bannerType, u08Var);
            }
        }
        g(bVar);
        if (z) {
            this.C = null;
        }
        ((fb8) this.a).dismiss();
        this.p.c();
    }

    public final void i(long j) {
        n9y0 n9y0Var = (n9y0) this.l;
        n9y0Var.getClass();
        i b = n9y0Var.b("PromoDidLoadAssets", this.e, true);
        b.a.put("open_reason", this.f);
        b.a(j / 1000.0d, "time_since_open");
        b.i();
        b.m();
    }

    public final void j(List list) {
        if (list.isEmpty()) {
            return;
        }
        float zOrder = ((fb8) this.a).getZOrder() + 1.0f;
        sqx sqxVar = this.z;
        sqxVar.getClass();
        new LabelInfoModalView(sqxVar.a, list).show(this.g, zOrder);
    }

    public final void k(BannerWidgets.f fVar) {
        this.m.c(this.e, ((cay0) this.x).b());
        ((n9y0) this.l).c(this.e, this.f, null, fVar.a, fVar.b, null, 0, 1, this.n.a() - this.A, PromotionBackground.Type.COLOR);
        BannerType bannerType = BannerType.CARD;
        String str = fVar.a;
        String str2 = fVar.c;
        if (str == null || evu0.J(str)) {
            return;
        }
        if ("webview".equals(str2)) {
            ((n) this.h).b(str, false);
        } else {
            this.i.a(str, bannerType, null);
        }
    }

    public final void l() {
        PromoBannerActivationStatus promoBannerActivationStatus = this.B;
        if (promoBannerActivationStatus != null) {
            this.w.a(promoBannerActivationStatus);
        }
        this.B = null;
        ((n9y0) this.l).f(this.e, this.f, PromotionBackground.Type.COLOR, 0, Long.valueOf(this.n.a() - this.A));
    }

    public final CharSequence m(TypedContentWidget typedContentWidget, int i) {
        FormattedText formattedText = typedContentWidget.d;
        if (formattedText.a.isEmpty()) {
            return qeb1.c(typedContentWidget.a);
        }
        if (formattedText.e()) {
            return ru.yandex.taxi.widget.c.f(this.o, formattedText, false, null, 14);
        }
        tje.N(e(), null, null, new CardBannerPresenter$processTypedContent$1(this, formattedText, i, typedContentWidget, null), 3);
        return "";
    }
}
