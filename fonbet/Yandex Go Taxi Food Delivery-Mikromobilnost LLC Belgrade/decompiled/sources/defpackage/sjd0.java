package defpackage;

import android.text.Html;
import android.text.Spanned;
import android.view.View;
import ru.yandex.taxi.design.ClickableImageView;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.plus.design.view.CashbackGradientButton;
import ru.yandex.taxi.plus.purchase.PlusInfoTrailType;
import ru.yandex.taxi.plus.purchase.PlusPurchaseView;
import ru.yandex.taxi.plus.purchase.d;
import ru.yandex.taxi.widget.text.method.LinkMovementMethod;

/* loaded from: classes6.dex */
public final class sjd0 implements sid0 {
    public final /* synthetic */ PlusPurchaseView a;

    public sjd0(PlusPurchaseView plusPurchaseView) {
        this.a = plusPurchaseView;
    }

    @Override // defpackage.sid0
    public final void K8(PlusInfoTrailType plusInfoTrailType, fl8 fl8Var) {
        ListItemComponent listItemComponent;
        d dVar;
        int i;
        z0a0 z0a0Var;
        ListItemComponent listItemComponent2;
        ListItemComponent listItemComponent3;
        int i2;
        ListItemComponent listItemComponent4;
        ListItemComponent listItemComponent5;
        int i3 = rjd0.a[plusInfoTrailType.ordinal()];
        PlusPurchaseView plusPurchaseView = this.a;
        if (i3 != 1) {
            if (i3 == 2) {
                listItemComponent2 = plusPurchaseView.conditionsItem;
                listItemComponent2.setTrailImage(o0h0.ic_info);
                listItemComponent3 = plusPurchaseView.conditionsItem;
                ClickableImageView trailImageView = listItemComponent3.getTrailImageView();
                i2 = plusPurchaseView.navIconColor;
                trailImageView.setColorFilter(i2);
                return;
            }
            if (i3 == 3) {
                listItemComponent4 = plusPurchaseView.conditionsItem;
                listItemComponent4.setTrailMode(2);
                return;
            } else if (i3 != 4) {
                w511.b();
                return;
            } else {
                listItemComponent5 = plusPurchaseView.conditionsItem;
                listItemComponent5.setTrailMode(0);
                return;
            }
        }
        ListItemComponent listItemComponent6 = new ListItemComponent(plusPurchaseView.getContext(), null, 0, 6, null);
        listItemComponent6.setBackgroundResource(dzg0.bg_main_ripple);
        listItemComponent = plusPurchaseView.conditionsItem;
        listItemComponent.setTrailView(listItemComponent6);
        dVar = plusPurchaseView.presenter;
        listItemComponent6.setDebounceClickListener(new pjd0(dVar, 2));
        listItemComponent6.setTrailMode(2);
        i = plusPurchaseView.navIconColor;
        plusPurchaseView.applyNavIconColor(listItemComponent6, i);
        listItemComponent6.setLeadImageSize(tje.u(36, plusPurchaseView.getContext()));
        View trailViewAs = listItemComponent6.getTrailViewAs(View.class);
        if (trailViewAs != null) {
            xw31.J(trailViewAs, Integer.valueOf(tje.u(9, plusPurchaseView.getContext())), null, null, null);
        }
        if (fl8Var != null) {
            z0a0Var = plusPurchaseView.paymentIconLoader;
            ((g1a0) z0a0Var).c(listItemComponent6.getLeadImageView(), fl8Var);
        } else {
            listItemComponent6.getLeadImageView().setImageDrawable(null);
        }
        plusPurchaseView.paymentActionPart = listItemComponent6;
    }

    @Override // defpackage.sid0
    public final void L4(String str, String str2) {
        CashbackGradientButton cashbackGradientButton;
        CashbackGradientButton cashbackGradientButton2;
        PlusPurchaseView plusPurchaseView = this.a;
        cashbackGradientButton = plusPurchaseView.subscribeButton;
        cashbackGradientButton.setTitle(str);
        cashbackGradientButton2 = plusPurchaseView.subscribeButton;
        cashbackGradientButton2.setSubtitle(str2);
    }

    @Override // defpackage.sid0
    public final void M8(boolean z) {
        CashbackGradientButton cashbackGradientButton;
        cashbackGradientButton = this.a.subscribeButton;
        cashbackGradientButton.setIsAnimated(z);
    }

    @Override // defpackage.sid0
    public final void ja(String str, String str2) {
        ListItemComponent listItemComponent;
        ListItemComponent listItemComponent2;
        ListItemComponent listItemComponent3;
        ListItemComponent listItemComponent4;
        ListItemComponent listItemComponent5;
        ListItemComponent listItemComponent6;
        Spanned fromHtml = Html.fromHtml(str);
        final PlusPurchaseView plusPurchaseView = this.a;
        listItemComponent = plusPurchaseView.conditionsItem;
        listItemComponent.setTitle(fromHtml);
        if (qeb1.d(fromHtml)) {
            listItemComponent6 = plusPurchaseView.conditionsItem;
            final int i = 0;
            listItemComponent6.setTitleMovementMethod(new LinkMovementMethod(new nb1(11, new tls() { // from class: qjd0
                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    d dVar;
                    d dVar2;
                    int i2 = i;
                    zy11 zy11Var = zy11.a;
                    PlusPurchaseView plusPurchaseView2 = plusPurchaseView;
                    String str3 = (String) obj;
                    switch (i2) {
                        case 0:
                            dVar = plusPurchaseView2.presenter;
                            dVar.x.b(str3);
                            break;
                        default:
                            dVar2 = plusPurchaseView2.presenter;
                            dVar2.x.b(str3);
                            break;
                    }
                    return zy11Var;
                }
            })));
        } else {
            listItemComponent2 = plusPurchaseView.conditionsItem;
            listItemComponent2.setTitleMovementMethod(null);
        }
        Spanned fromHtml2 = Html.fromHtml(str2);
        listItemComponent3 = plusPurchaseView.conditionsItem;
        listItemComponent3.setSubtitle(fromHtml2);
        if (!qeb1.d(fromHtml2)) {
            listItemComponent4 = plusPurchaseView.conditionsItem;
            listItemComponent4.setSubtitleMovementMethod(null);
        } else {
            listItemComponent5 = plusPurchaseView.conditionsItem;
            final int i2 = 1;
            listItemComponent5.setSubtitleMovementMethod(new LinkMovementMethod(new nb1(11, new tls() { // from class: qjd0
                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    d dVar;
                    d dVar2;
                    int i22 = i2;
                    zy11 zy11Var = zy11.a;
                    PlusPurchaseView plusPurchaseView2 = plusPurchaseView;
                    String str3 = (String) obj;
                    switch (i22) {
                        case 0:
                            dVar = plusPurchaseView2.presenter;
                            dVar.x.b(str3);
                            break;
                        default:
                            dVar2 = plusPurchaseView2.presenter;
                            dVar2.x.b(str3);
                            break;
                    }
                    return zy11Var;
                }
            })));
        }
    }

    @Override // defpackage.sid0
    public final void setVisibility(boolean z) {
        this.a.setVisibility(z ? 0 : 8);
    }

    @Override // defpackage.sid0
    public final void ze(boolean z) {
        CashbackGradientButton cashbackGradientButton;
        cashbackGradientButton = this.a.subscribeButton;
        cashbackGradientButton.setClickable(z);
    }
}
