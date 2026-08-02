package ru.yandex.taxi.altpins.walking_route.modal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.yandex.go.coroutines.b;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.bdh0;
import defpackage.bo31;
import defpackage.cma1;
import defpackage.f741;
import defpackage.g741;
import defpackage.gph0;
import defpackage.mqg0;
import defpackage.my6;
import defpackage.n741;
import defpackage.ny61;
import defpackage.o741;
import defpackage.pzt0;
import defpackage.qdb1;
import defpackage.qje;
import defpackage.qu;
import defpackage.tje;
import defpackage.xng0;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.altpins.walking_route.modal.WalkingRouteModalView;
import ru.yandex.taxi.altpins.walking_route.modal.a;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewRounded$1;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0013\u0010\u0011J\u001f\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u001dH\u0014¢\u0006\u0004\b \u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\"R\u0018\u0010$\u001a\u00060#R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/yandex/taxi/altpins/walking_route/modal/WalkingRouteModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lo741;", "Landroid/content/Context;", "context", "Lru/yandex/taxi/altpins/walking_route/modal/a;", "presenter", "Landroid/view/View$OnLayoutChangeListener;", "layoutChangeListener", "<init>", "(Landroid/content/Context;Lru/yandex/taxi/altpins/walking_route/modal/a;Landroid/view/View$OnLayoutChangeListener;)V", "Lg741;", ClidProvider.STATE, "Lzy11;", "render", "(Lg741;)V", "updateCardBackground", "()V", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lo741;", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "", "isApplyShadow", "()Z", "hasCustomBackground", "Lru/yandex/taxi/altpins/walking_route/modal/a;", "Landroid/view/View$OnLayoutChangeListener;", "Ln741;", "inner", "Ln741;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WalkingRouteModalView extends SlideableBindingModalView<o741> {
    private final n741 inner;
    private final View.OnLayoutChangeListener layoutChangeListener;
    private final a presenter;

    public WalkingRouteModalView(Context context, final a aVar, View.OnLayoutChangeListener onLayoutChangeListener) {
        super(context);
        this.presenter = aVar;
        this.layoutChangeListener = onLayoutChangeListener;
        this.inner = new n741(this);
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
        final int i = 0;
        qdb1.b(this, new Runnable() { // from class: m741
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                a aVar2 = aVar;
                switch (i2) {
                    case 0:
                        WalkingRouteModalView._init_$back(aVar2);
                        break;
                    case 1:
                        WalkingRouteModalView._init_$locationButtonClicked(aVar2);
                        break;
                    case 2:
                        WalkingRouteModalView._init_$back$0(aVar2);
                        break;
                    default:
                        WalkingRouteModalView._init_$routeFocused(aVar2);
                        break;
                }
            }
        });
        final int i2 = 1;
        qdb1.d(this, new Runnable() { // from class: m741
            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                a aVar2 = aVar;
                switch (i22) {
                    case 0:
                        WalkingRouteModalView._init_$back(aVar2);
                        break;
                    case 1:
                        WalkingRouteModalView._init_$locationButtonClicked(aVar2);
                        break;
                    case 2:
                        WalkingRouteModalView._init_$back$0(aVar2);
                        break;
                    default:
                        WalkingRouteModalView._init_$routeFocused(aVar2);
                        break;
                }
            }
        });
        getBottomSheet().setBackgroundColor(getContext().getColor(mqg0.transparent));
        LinearLayout linearLayout = getBinding().a;
        linearLayout.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewRounded$1(tje.u(24, getContext())));
        linearLayout.setClipToOutline(true);
        updateCardBackground();
        setClickable(false);
        setDismissOnTouchOutside(false);
        final int i3 = 2;
        setOnBackPressedListener(new Runnable() { // from class: m741
            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i3;
                a aVar2 = aVar;
                switch (i22) {
                    case 0:
                        WalkingRouteModalView._init_$back(aVar2);
                        break;
                    case 1:
                        WalkingRouteModalView._init_$locationButtonClicked(aVar2);
                        break;
                    case 2:
                        WalkingRouteModalView._init_$back$0(aVar2);
                        break;
                    default:
                        WalkingRouteModalView._init_$routeFocused(aVar2);
                        break;
                }
            }
        });
        final int i4 = 3;
        getBinding().c.setDebounceClickListener(new Runnable() { // from class: m741
            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i4;
                a aVar2 = aVar;
                switch (i22) {
                    case 0:
                        WalkingRouteModalView._init_$back(aVar2);
                        break;
                    case 1:
                        WalkingRouteModalView._init_$locationButtonClicked(aVar2);
                        break;
                    case 2:
                        WalkingRouteModalView._init_$back$0(aVar2);
                        break;
                    default:
                        WalkingRouteModalView._init_$routeFocused(aVar2);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$back(a aVar) {
        aVar.z.a.r(new qu(9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$back$0(a aVar) {
        aVar.z.a.r(new qu(9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$locationButtonClicked(a aVar) {
        pzt0 pzt0Var = aVar.G;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        aVar.G = b.g(aVar.Jg(), null, null, new WalkingRoutePresenter$locationButtonClicked$1(aVar, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$routeFocused(a aVar) {
        aVar.A.a.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void render(g741 state) {
        o741 binding = getBinding();
        ListItemComponent listItemComponent = binding.c;
        ButtonComponent buttonComponent = binding.b;
        listItemComponent.setTitle(state.a);
        binding.c.setSubtitle(state.b);
        my6 my6Var = state.c;
        if (my6Var != null) {
            buttonComponent.setText(my6Var.a);
            buttonComponent.setButtonTitleColor(my6Var.b);
            buttonComponent.setButtonBackground(my6Var.c);
            buttonComponent.setDebounceClickListener(new bo31(5, this, my6Var));
        }
        buttonComponent.setVisibility(my6Var != null ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$0$0$0(WalkingRouteModalView walkingRouteModalView, my6 my6Var) {
        a aVar = walkingRouteModalView.presenter;
        b.g(aVar.Jg(), null, null, new WalkingRoutePresenter$buttonClicked$1((f741) my6Var.e, aVar, null), 3);
    }

    private final void updateCardBackground() {
        getBinding().a.setBackgroundColor(qje.t(xng0.bgMain, getContext()));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return mqg0.transparent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public o741 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(gph0.walking_route_modal_view, parent, false);
        parent.addView(inflate);
        int i = bdh0.button;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            i = bdh0.walking_route_info;
            ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, inflate);
            if (listItemComponent != null) {
                return new o741((LinearLayout) inflate, buttonComponent, listItemComponent);
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: hasCustomBackground */
    public boolean getHasCustomBackgroundColor() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isApplyShadow */
    public boolean getIsCollapsable() {
        return false;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        addOnLayoutChangeListener(this.layoutChangeListener);
        a aVar = this.presenter;
        n741 n741Var = this.inner;
        aVar.Bg(n741Var);
        n741Var.render(aVar.y);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.layoutChangeListener);
        this.presenter.Cg();
    }
}
