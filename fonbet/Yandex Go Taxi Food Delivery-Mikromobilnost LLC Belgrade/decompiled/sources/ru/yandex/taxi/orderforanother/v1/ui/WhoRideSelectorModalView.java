package ru.yandex.taxi.orderforanother.v1.ui;

import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.b;
import com.yandex.go.clarify_address.AddressClarificationReason;
import defpackage.a051;
import defpackage.arh0;
import defpackage.at20;
import defpackage.bw70;
import defpackage.cfv0;
import defpackage.cma1;
import defpackage.d82;
import defpackage.ny61;
import defpackage.pav;
import defpackage.qv70;
import defpackage.sd30;
import defpackage.tje;
import defpackage.wz41;
import defpackage.yeh0;
import defpackage.yz41;
import defpackage.zv70;
import java.util.HashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.ToolbarComponent;
import ru.yandex.taxi.orderforanother.model.FormedFrom;
import ru.yandex.taxi.orderforanother.v1.ui.WhoRideSelectorModalView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.accessibility.AccessibilityButtonLinearLayout;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002.1B-\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u001a\u0010\u0015J\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0013H\u0014¢\u0006\u0004\b!\u0010\u0015J\u000f\u0010\"\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\"\u0010\u0015J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0014¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010)R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010*R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010-R\u0018\u0010/\u001a\u00060.R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, d2 = {"Lru/yandex/taxi/orderforanother/v1/ui/WhoRideSelectorModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "La051;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "Lwz41;", "presenter", "Lbw70;", "orderForAnotherSelectorListener", "<init>", "(Landroid/content/Context;Lpav;Lwz41;Lbw70;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La051;", "Lzy11;", "onDismissManually", "()V", "", "contentTop", "onModalViewAppear", "(I)V", "onModalViewDisappear", "keyCode", "Landroid/view/KeyEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "onKeyUp", "(ILandroid/view/KeyEvent;)Z", "onAttachedToWindow", "onDetachedFromWindow", "", "screenName", "()Ljava/lang/String;", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "Lpav;", "Lwz41;", "Lbw70;", "getOrderForAnotherSelectorListener", "()Lbw70;", "Lyz41;", "mvpView", "Lyz41;", "zz41", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WhoRideSelectorModalView extends SlideableBindingModalView<a051> implements cfv0 {
    public static final int $stable = 8;
    private final pav imageLoader;
    private final yz41 mvpView;
    private final bw70 orderForAnotherSelectorListener;
    private final wz41 presenter;

    public WhoRideSelectorModalView(Context context, pav pavVar, wz41 wz41Var, bw70 bw70Var) {
        super(context);
        this.imageLoader = pavVar;
        this.presenter = wz41Var;
        this.orderForAnotherSelectorListener = bw70Var;
        this.mvpView = new yz41(this);
        final int i = 0;
        getBinding().f.setOnClickListener(new View.OnClickListener(this) { // from class: xz41
            public final /* synthetic */ WhoRideSelectorModalView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                WhoRideSelectorModalView whoRideSelectorModalView = this.b;
                switch (i2) {
                    case 0:
                        WhoRideSelectorModalView._init_$lambda$0(whoRideSelectorModalView, view);
                        break;
                    default:
                        WhoRideSelectorModalView._init_$lambda$1(whoRideSelectorModalView, view);
                        break;
                }
            }
        });
        final int i2 = 1;
        getBinding().c.setOnClickListener(new View.OnClickListener(this) { // from class: xz41
            public final /* synthetic */ WhoRideSelectorModalView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                WhoRideSelectorModalView whoRideSelectorModalView = this.b;
                switch (i22) {
                    case 0:
                        WhoRideSelectorModalView._init_$lambda$0(whoRideSelectorModalView, view);
                        break;
                    default:
                        WhoRideSelectorModalView._init_$lambda$1(whoRideSelectorModalView, view);
                        break;
                }
            }
        });
        b.q(getBinding().e, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(WhoRideSelectorModalView whoRideSelectorModalView, View view) {
        at20 at20Var = (at20) whoRideSelectorModalView.getOrderForAnotherSelectorListener();
        ((zv70) at20Var.b).n();
        ru.yandex.taxi.orderforanother.router.a aVar = (ru.yandex.taxi.orderforanother.router.a) at20Var.a;
        aVar.d.a().c(WhoRideSelectorModalView.class, true, null);
        ((com.yandex.go.clarify_address.a) aVar.g).c(true, AddressClarificationReason.Other);
        qv70 qv70Var = whoRideSelectorModalView.presenter.B;
        qv70Var.getClass();
        qv70Var.a.a("OrderForAnother.WhoRideUser", new HashMap(), 1, new HashMap());
        whoRideSelectorModalView.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(WhoRideSelectorModalView whoRideSelectorModalView, View view) {
        at20 at20Var = (at20) whoRideSelectorModalView.getOrderForAnotherSelectorListener();
        ru.yandex.taxi.orderforanother.router.a aVar = (ru.yandex.taxi.orderforanother.router.a) at20Var.a;
        aVar.b(new sd30(13, (zv70) at20Var.b, aVar), new d82(1));
        wz41 wz41Var = whoRideSelectorModalView.presenter;
        qv70 qv70Var = wz41Var.B;
        qv70Var.getClass();
        qv70Var.a.a("OrderForAnother.WhoRideAnother", new HashMap(), 1, new HashMap());
        wz41Var.z.i(FormedFrom.DIALOG);
        whoRideSelectorModalView.dismiss();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public a051 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(arh0.who_ride_selector_view, parent, false);
        int i = yeh0.account_avatar;
        AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, inflate);
        if (appCompatImageView != null) {
            i = yeh0.another_person;
            AccessibilityButtonLinearLayout accessibilityButtonLinearLayout = (AccessibilityButtonLinearLayout) cma1.O(i, inflate);
            if (accessibilityButtonLinearLayout != null) {
                LinearLayout linearLayout = (LinearLayout) inflate;
                i = yeh0.toolbar;
                ToolbarComponent toolbarComponent = (ToolbarComponent) cma1.O(i, inflate);
                if (toolbarComponent != null) {
                    i = yeh0.yourself;
                    AccessibilityButtonLinearLayout accessibilityButtonLinearLayout2 = (AccessibilityButtonLinearLayout) cma1.O(i, inflate);
                    if (accessibilityButtonLinearLayout2 != null) {
                        return new a051(linearLayout, appCompatImageView, accessibilityButtonLinearLayout, linearLayout, toolbarComponent, accessibilityButtonLinearLayout2);
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView */
    public View getContent() {
        return getBinding().d;
    }

    public bw70 getOrderForAnotherSelectorListener() {
        return this.orderForAnotherSelectorListener;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        wz41 wz41Var = this.presenter;
        yz41 yz41Var = this.mvpView;
        wz41Var.Bg(yz41Var);
        tje.N(wz41Var.Jg(), null, null, new WhoRidePresenter$attachView$$inlined$safeCollectIn$1(wz41Var.A.f, null, wz41Var, yz41Var), 3);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (isInEditMode()) {
            return;
        }
        this.presenter.Cg();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onDismissManually() {
        qv70 qv70Var = this.presenter.B;
        qv70Var.getClass();
        qv70Var.a.a("OrderForAnother.WhoRideClosed", new HashMap(), 1, new HashMap());
        ((zv70) ((at20) getOrderForAnotherSelectorListener()).b).getClass();
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        if (!super.onKeyUp(keyCode, event)) {
            return true;
        }
        this.presenter.z.e.a = false;
        return true;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView
    public void onModalViewAppear(int contentTop) {
        super.onModalViewAppear(contentTop);
        qv70 qv70Var = this.presenter.B;
        qv70Var.getClass();
        qv70Var.a.a("OrderForAnother.PinAlertShown", new HashMap(), 1, new HashMap());
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onModalViewDisappear() {
        super.onModalViewDisappear();
        this.presenter.z.e.a = false;
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    /* renamed from: screenName */
    public String getModalScreenName() {
        return "WhoRideSelector";
    }
}
