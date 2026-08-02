package ru.yandex.taxi.plus.purchase;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q;
import defpackage.bkd0;
import defpackage.cdc;
import defpackage.d59;
import defpackage.ffh0;
import defpackage.frh0;
import defpackage.mth;
import defpackage.pey;
import defpackage.pjd0;
import defpackage.qje;
import defpackage.rp31;
import defpackage.sjd0;
import defpackage.tjd0;
import defpackage.u0v0;
import defpackage.vfc0;
import defpackage.wj6;
import defpackage.xnb1;
import defpackage.xng0;
import defpackage.z0a0;
import defpackage.z750;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.plus.design.view.CashbackGradientButton;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001%B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0015\u0010\u0014J\u0019\u0010\u0018\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00102\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010#R\u0018\u0010&\u001a\u00060%R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/yandex/taxi/plus/purchase/PlusPurchaseView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroidx/lifecycle/Lifecycle;", "activityLifecycle", "Lru/yandex/taxi/plus/purchase/d;", "presenter", "Lz0a0;", "paymentIconLoader", "<init>", "(Landroid/content/Context;Landroidx/lifecycle/Lifecycle;Lru/yandex/taxi/plus/purchase/d;Lz0a0;)V", "Lru/yandex/taxi/design/ListItemComponent;", "navComponent", "", "color", "Lzy11;", "applyNavIconColor", "(Lru/yandex/taxi/design/ListItemComponent;I)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Landroid/graphics/drawable/Drawable;", C0553n3.g, "setBackground", "(Landroid/graphics/drawable/Drawable;)V", "setNavIconColor", "(I)V", "Landroidx/lifecycle/Lifecycle;", "Lru/yandex/taxi/plus/purchase/d;", "Lz0a0;", "Lru/yandex/taxi/plus/design/view/CashbackGradientButton;", "subscribeButton", "Lru/yandex/taxi/plus/design/view/CashbackGradientButton;", "conditionsItem", "Lru/yandex/taxi/design/ListItemComponent;", "paymentActionPart", "Lsjd0;", "mvpView", "Lsjd0;", "navIconColor", CA20Status.STATUS_USER_I, "Landroidx/lifecycle/q;", "lifecycleObserver", "Landroidx/lifecycle/q;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlusPurchaseView extends RelativeLayout {
    private final Lifecycle activityLifecycle;
    private final ListItemComponent conditionsItem;
    private final q lifecycleObserver;
    private final sjd0 mvpView;
    private int navIconColor;
    private ListItemComponent paymentActionPart;
    private final z0a0 paymentIconLoader;
    private final d presenter;
    private final CashbackGradientButton subscribeButton;

    public PlusPurchaseView(Context context, Lifecycle lifecycle, d dVar, z0a0 z0a0Var) {
        super(context);
        this.activityLifecycle = lifecycle;
        this.presenter = dVar;
        this.paymentIconLoader = z0a0Var;
        this.mvpView = new sjd0(this);
        this.navIconColor = qje.t(xng0.textMain, getContext());
        this.lifecycleObserver = new wj6(4, this);
        ru.yandex.taxi.design.utils.c.q(this, frh0.plus_purchase_view, true);
        int i = ffh0.subscribe_action;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        CashbackGradientButton cashbackGradientButton = (CashbackGradientButton) ((View) rp31.d(this, i));
        this.subscribeButton = cashbackGradientButton;
        ListItemComponent listItemComponent = (ListItemComponent) ((View) rp31.d(this, ffh0.conditions_item));
        this.conditionsItem = listItemComponent;
        listItemComponent.subtitle().setLinkTextColor(qje.t(xng0.textMinor, getContext()));
        listItemComponent.setDebounceClickListener(new pjd0(dVar, 0));
        cashbackGradientButton.setDebounceClickListener(new pjd0(dVar, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$conditionsItemClicked(d dVar) {
        u0v0 u0v0Var = dVar.F;
        d59 d59Var = dVar.x;
        if (u0v0Var != null) {
            if (u0v0Var.g == AvailableButtonAction.BUY) {
                d59Var.a(((bkd0) dVar.C.b).b, false);
                return;
            }
            String str = u0v0Var.a;
            String str2 = u0v0Var.b;
            if (str2 == null) {
                str2 = "";
            }
            String d = xnb1.d(str2);
            if (d != null) {
                d59Var.b(d);
                return;
            }
            String d2 = xnb1.d(str);
            if (d2 != null) {
                d59Var.b(d2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$subscribeActionClicked(d dVar) {
        com.yandex.go.coroutines.b.g(dVar.Jg(), null, null, new PlusPurchasePresenter$subscribeActionClicked$1(true, dVar, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyNavIconColor(ListItemComponent navComponent, int color) {
        z750 navigationIconParams = navComponent.getNavigationIconParams();
        navigationIconParams.b = new cdc(color);
        navigationIconParams.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lifecycleObserver$lambda$0(PlusPurchaseView plusPurchaseView, pey peyVar, Lifecycle.Event event) {
        int i = tjd0.a[event.ordinal()];
        if (i == 1) {
            plusPurchaseView.presenter.resume();
        } else {
            if (i != 2) {
                return;
            }
            plusPurchaseView.presenter.pause();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        d dVar = this.presenter;
        dVar.Bg(this.mvpView);
        com.yandex.go.coroutines.b.h(dVar.Jg(), new m0(new c(e.t(new mth(dVar.y.a.e, 6)), dVar), dVar.A.a(), new PlusPurchasePresenter$observerSubscriptionInfo$2(dVar, null)));
        com.yandex.go.coroutines.b.g(dVar.Jg(), null, null, new PlusPurchasePresenter$attachView$1(dVar, null), 3);
        dVar.Kg();
        dVar.B.a = new vfc0(3, dVar);
        this.activityLifecycle.a(this.lifecycleObserver);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
        this.activityLifecycle.d(this.lifecycleObserver);
    }

    @Override // android.view.View
    public void setBackground(Drawable background) {
        super.setBackground(background);
        this.conditionsItem.setBackground(background);
    }

    public final void setNavIconColor(int color) {
        this.navIconColor = color;
        ListItemComponent listItemComponent = this.paymentActionPart;
        if (listItemComponent != null) {
            applyNavIconColor(listItemComponent, color);
        }
    }
}
