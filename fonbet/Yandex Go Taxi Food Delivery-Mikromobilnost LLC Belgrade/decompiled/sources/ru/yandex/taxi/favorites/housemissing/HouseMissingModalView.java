package ru.yandex.taxi.favorites.housemissing;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.aip;
import defpackage.c57;
import defpackage.cma1;
import defpackage.ctu;
import defpackage.dtu;
import defpackage.ejp;
import defpackage.f1h0;
import defpackage.hk1;
import defpackage.hqu;
import defpackage.jtu;
import defpackage.mqg0;
import defpackage.ny61;
import defpackage.pm5;
import defpackage.qdb1;
import defpackage.qu;
import defpackage.tdh0;
import defpackage.tje;
import defpackage.xph0;
import java.util.HashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.favorites.analytics.FavoritesAnalytics$DismissType;
import ru.yandex.taxi.widget.ButtonsView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001e\u001fB\u001d\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0017\u0010\u000fJ\u000f\u0010\u0018\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0018\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lru/yandex/taxi/favorites/housemissing/HouseMissingModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Ldtu;", "Landroid/content/Context;", "context", "Lru/yandex/taxi/favorites/housemissing/b;", "presenter", "<init>", "(Landroid/content/Context;Lru/yandex/taxi/favorites/housemissing/b;)V", "Landroid/graphics/drawable/Drawable;", "fallbackImage", "()Landroid/graphics/drawable/Drawable;", "fallbackBackground", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ldtu;", "onBackPressed", "onTouchOutside", "Lru/yandex/taxi/favorites/housemissing/b;", "Lc57;", "Lbtu;", "buttons", "Lc57;", "ctu", "etu", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HouseMissingModalView extends SlideableBindingModalView<dtu> {
    public static final int $stable = 8;
    private final c57 buttons;
    private final b presenter;

    public HouseMissingModalView(Context context, b bVar) {
        super(context);
        this.presenter = bVar;
        c57 buttonsContract = getBinding().b.buttonsContract();
        this.buttons = buttonsContract;
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
        qdb1.c(this, new ejp(25, bVar));
        c.z(new hqu(3), getBinding().a);
        ((pm5) buttonsContract).f(new hk1(bVar, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$onCloseButtonClicked(b bVar) {
        bVar.A.a(FavoritesAnalytics$DismissType.CloseButton);
        ((jtu) bVar.B.a).r(new qu(9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Drawable fallbackBackground() {
        Drawable mutate = tje.y(f1h0.bg_circle_40dp, getContext()).mutate();
        mutate.setTint(getContext().getColor(mqg0.component_orange_normal));
        return mutate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Drawable fallbackImage() {
        Drawable mutate = tje.y(f1h0.ic_warning_pin_24, getContext()).mutate();
        mutate.setTint(getContext().getColor(mqg0.white));
        return mutate;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public dtu bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(xph0.house_missing_modal_view, parent, false);
        int i = tdh0.buttons_container;
        ButtonsView buttonsView = (ButtonsView) cma1.O(i, inflate);
        if (buttonsView != null) {
            GoLinearLayout goLinearLayout = (GoLinearLayout) inflate;
            i = tdh0.subtitle;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
            if (robotoTextView != null) {
                i = tdh0.title;
                RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                if (robotoTextView2 != null) {
                    i = tdh0.top_icon;
                    GoImageView goImageView = (GoImageView) cma1.O(i, inflate);
                    if (goImageView != null) {
                        return new dtu(goLinearLayout, buttonsView, robotoTextView, robotoTextView2, goImageView);
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.presenter;
        bVar.Bg(new ctu(this));
        aip aipVar = bVar.A;
        String str = bVar.D;
        aipVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("address", str);
        aipVar.a.a("Favorites.CreateRegularAddressModalCard.Shown", hashMap, 1, new HashMap());
        tje.N(bVar.Jg(), null, null, new HouseMissingPresenter$attachView$$inlined$safeCollectIn$1(bVar.y.a(), null, bVar), 3);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        this.presenter.A.a(FavoritesAnalytics$DismissType.SystemBack);
        super.onBackPressed();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onTouchOutside() {
        boolean L = tje.L(getContext());
        b bVar = this.presenter;
        if (L) {
            bVar.A.a(FavoritesAnalytics$DismissType.SystemBack);
        } else {
            bVar.A.a(FavoritesAnalytics$DismissType.TapOutside);
        }
        super.onTouchOutside();
    }
}
