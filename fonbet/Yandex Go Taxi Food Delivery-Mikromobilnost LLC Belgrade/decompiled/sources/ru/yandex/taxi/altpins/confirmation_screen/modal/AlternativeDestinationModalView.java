package ru.yandex.taxi.altpins.confirmation_screen.modal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.bdh0;
import defpackage.c57;
import defpackage.cma1;
import defpackage.cx1;
import defpackage.dx1;
import defpackage.gph0;
import defpackage.hk1;
import defpackage.jg;
import defpackage.m6;
import defpackage.mqg0;
import defpackage.ny61;
import defpackage.pm5;
import defpackage.qdb1;
import defpackage.sls;
import defpackage.t61;
import defpackage.tje;
import defpackage.tls;
import defpackage.vw1;
import defpackage.w511;
import defpackage.ww1;
import defpackage.xw1;
import defpackage.yw1;
import java.util.HashMap;
import kotlin.Metadata;
import ru.yandex.taxi.altpins.confirmation_screen.modal.comparison_block.ComparisonView;
import ru.yandex.taxi.altpins.confirmation_screen.modal.comparison_block.OptionType;
import ru.yandex.taxi.altpins.models.b;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.widget.ButtonsView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 62\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002,7BM\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\tH\u0014¢\u0006\u0004\b \u0010\u001bJ\u000f\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\tH\u0014¢\u0006\u0004\b$\u0010\u001bJ\u0015\u0010%\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b%\u0010\u0013J\u000f\u0010'\u001a\u00020&H\u0014¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010)R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010*R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010+R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010*R\u0018\u0010-\u001a\u00060,R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00104\u001a\b\u0012\u0004\u0012\u000203028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00068"}, d2 = {"Lru/yandex/taxi/altpins/confirmation_screen/modal/AlternativeDestinationModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lyw1;", "Landroid/content/Context;", "context", "Lcx1;", "presenter", "Lkotlin/Function1;", "Lru/yandex/taxi/altpins/models/OptionType;", "Lzy11;", "onConfirm", "Lkotlin/Function0;", "onDismiss", "onChangeOptionType", "<init>", "(Landroid/content/Context;Lcx1;Ltls;Lsls;Ltls;)V", "Lru/yandex/taxi/altpins/models/b$a;", "model", "render", "(Lru/yandex/taxi/altpins/models/b$a;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lyw1;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "onBackPressed", "", "appearAnimationDuration", "()J", "onAppearAnimationComplete", "updateModel", "Landroid/view/View;", "getFocusedForAccessibilityViewOnAppear", "()Landroid/view/View;", "Lcx1;", "Ltls;", "Lsls;", "Lww1;", "innerView", "Lww1;", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "backButton", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "Lc57;", "Lbz1;", "buttons", "Lc57;", "Companion", "vw1", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AlternativeDestinationModalView extends SlideableBindingModalView<yw1> {
    private static final long APPEAR_ANIMATION_DURATION = 800;
    public static final vw1 Companion = new vw1();
    private final FloatButtonIconComponent backButton;
    private final c57 buttons;
    private final ww1 innerView;
    private final tls onChangeOptionType;
    private final tls onConfirm;
    private final sls onDismiss;
    private final cx1 presenter;

    public AlternativeDestinationModalView(Context context, cx1 cx1Var, tls tlsVar, sls slsVar, tls tlsVar2) {
        super(context);
        this.presenter = cx1Var;
        this.onConfirm = tlsVar;
        this.onDismiss = slsVar;
        this.onChangeOptionType = tlsVar2;
        this.innerView = new ww1(this);
        this.backButton = qdb1.b(this, new jg(14, cx1Var));
        c57 buttonsContract = getBinding().b.buttonsContract();
        this.buttons = buttonsContract;
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
        getBinding().c.setChangeTypeListener(new m6(6, this));
        setClickable(false);
        setDismissOnTouchOutside(false);
        ((pm5) buttonsContract).f(new hk1(cx1Var, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(AlternativeDestinationModalView alternativeDestinationModalView, OptionType optionType) {
        ru.yandex.taxi.altpins.models.OptionType optionType2;
        int i = xw1.a[optionType.ordinal()];
        if (i == 1) {
            optionType2 = ru.yandex.taxi.altpins.models.OptionType.ALTPIN;
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            optionType2 = ru.yandex.taxi.altpins.models.OptionType.ORIGINAL;
        }
        alternativeDestinationModalView.onChangeOptionType.invoke(optionType2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void backButton$onBackButtonClick(cx1 cx1Var) {
        t61 t61Var = (t61) cx1Var.y.a;
        t61Var.a.a("AltpinB.ConfirmationScreen.BackButton.Tap", new HashMap(), 1, new HashMap());
        ((dx1) cx1Var.Dg()).dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void render(b.a model) {
        yw1 binding = getBinding();
        binding.d.setTitle(model.b);
        binding.c.render(model.c);
        ((pm5) this.buttons).d(model.a);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public long appearAnimationDuration() {
        return 800L;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return mqg0.transparent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public yw1 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(gph0.alternative_destination_modal_view, parent, false);
        int i = bdh0.buttons;
        ButtonsView buttonsView = (ButtonsView) cma1.O(i, inflate);
        if (buttonsView != null) {
            i = bdh0.comparison_block;
            ComparisonView comparisonView = (ComparisonView) cma1.O(i, inflate);
            if (comparisonView != null) {
                i = bdh0.title;
                ListHeaderComponent listHeaderComponent = (ListHeaderComponent) cma1.O(i, inflate);
                if (listHeaderComponent != null) {
                    return new yw1((LinearLayout) inflate, buttonsView, comparisonView, listHeaderComponent);
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public View getFocusedForAccessibilityViewOnAppear() {
        return this.backButton;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onAppearAnimationComplete() {
        super.onAppearAnimationComplete();
        sendAccessibilityEvent(4096);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        cx1 cx1Var = this.presenter;
        ww1 ww1Var = this.innerView;
        cx1Var.Bg(ww1Var);
        tje.N(cx1Var.Jg(), null, null, new AlternativeDestinationPresenter$attachView$1(cx1Var, ww1Var, null), 3);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        super.onBackPressed();
        this.onDismiss.invoke();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    public final void updateModel(b.a model) {
        this.presenter.z.l(model);
    }
}
