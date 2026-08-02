package ru.yandex.taxi.address.clarification.impl.ui;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.bph0;
import defpackage.cma1;
import defpackage.cp0;
import defpackage.cvw;
import defpackage.cxu0;
import defpackage.d4;
import defpackage.exu0;
import defpackage.i3y;
import defpackage.ip0;
import defpackage.jp0;
import defpackage.k7x0;
import defpackage.kp0;
import defpackage.lr0;
import defpackage.mqg0;
import defpackage.mrg0;
import defpackage.nrt;
import defpackage.ny61;
import defpackage.o400;
import defpackage.pav;
import defpackage.qdb1;
import defpackage.qje;
import defpackage.sjh;
import defpackage.sp0;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.v69;
import defpackage.xch0;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.y5e;
import defpackage.zp0;
import kotlin.Metadata;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.taxi.address.clarification.AddressClarificationCloseReason;
import ru.yandex.taxi.address.clarification.impl.ui.utils.MaxHeightConstraintLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 C2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003DEFB5\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001e\u001a\u00020\u0011*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0011H\u0015¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0011H\u0014¢\u0006\u0004\b%\u0010!J\u000f\u0010&\u001a\u00020\u0011H\u0014¢\u0006\u0004\b&\u0010!J\u001f\u0010+\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\"2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0014H\u0014¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b3\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00104R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00105R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00106R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00107R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00108R\u001b\u0010>\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0016\u0010B\u001a\u0004\u0018\u00010?8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006G"}, d2 = {"Lru/yandex/taxi/address/clarification/impl/ui/AddressAdjustmentModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Llr0;", "Landroid/view/ContextThemeWrapper;", "contextWrapper", "Lzp0;", "presenter", "Lpav;", "imageLoader", "Lk7x0;", "tagUrlFormatter", "Lru/yandex/taxi/widget/c;", "formattedTextConverter", "<init>", "(Landroid/view/ContextThemeWrapper;Lzp0;Lpav;Lk7x0;Lru/yandex/taxi/widget/c;)V", "Lru/yandex/taxi/address/clarification/AddressClarificationCloseReason;", CRLReasonCodeExtension.REASON, "Lzy11;", "innerCloseModalView", "(Lru/yandex/taxi/address/clarification/AddressClarificationCloseReason;)V", "", "styleRes", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyModalTheme", "(ILru/yandex/taxi/theme/ThemeType;)V", "dispatchThemeToCardContent", "(Lru/yandex/taxi/theme/ThemeType;)V", "Landroidx/recyclerview/widget/RecyclerView;", "position", "smoothScrollToCenteredPosition", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "onTouchOutside", "()V", "", "canDragToExpandFromAnchored", "()Z", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Llr0;", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "applyTheme", "Landroid/view/ContextThemeWrapper;", "Lzp0;", "Lpav;", "Lk7x0;", "Lru/yandex/taxi/widget/c;", "Lv69;", "smoothScroller$delegate", "Li3y;", "getSmoothScroller", "()Lv69;", "smoothScroller", "Lcp0;", "getAdapter", "()Lcp0;", "adapter", "Companion", "kp0", "jp0", "rp0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AddressAdjustmentModalView extends SlideableBindingModalView<lr0> {
    public static final int CLARIFICATION_MODAL_VIEW_HEIGHT_DP = 360;
    public static final jp0 Companion = new jp0();
    private final ContextThemeWrapper contextWrapper;
    private final ru.yandex.taxi.widget.c formattedTextConverter;
    private final pav imageLoader;
    private final zp0 presenter;

    /* renamed from: smoothScroller$delegate, reason: from kotlin metadata */
    private final i3y smoothScroller;
    private final k7x0 tagUrlFormatter;

    public AddressAdjustmentModalView(ContextThemeWrapper contextThemeWrapper, zp0 zp0Var, pav pavVar, k7x0 k7x0Var, ru.yandex.taxi.widget.c cVar) {
        super(contextThemeWrapper, 6);
        this.contextWrapper = contextThemeWrapper;
        this.presenter = zp0Var;
        this.imageLoader = pavVar;
        this.tagUrlFormatter = k7x0Var;
        this.formattedTextConverter = cVar;
        this.smoothScroller = kotlin.a.a(new d4(17, this));
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
        qdb1.d(this, new ip0(this, 0));
        qdb1.b(this, new ip0(this, 1));
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
        getBottomSheetBehavior().a0 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(AddressAdjustmentModalView addressAdjustmentModalView) {
        addressAdjustmentModalView.presenter.z.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyModalTheme(int styleRes, ThemeType themeType) {
        y5e.Q(this.contextWrapper, styleRes);
        dispatchThemeToCardContent(themeType);
        updateCurrentBackground();
    }

    private final void dispatchThemeToCardContent(ThemeType themeType) {
        cvw.g0(qje.u(this.contextWrapper.getTheme(), xng0.bgMain), tje.r(mrg0.modal_view_corner_radius_big, getContext()), getBinding().a);
        getBinding().e.applyTheme(themeType);
        getBinding().d.applyTheme(themeType);
        cp0 adapter = getAdapter();
        if (adapter != null) {
            adapter.applyTheme(themeType);
        }
        cp0 adapter2 = getAdapter();
        if (adapter2 != null) {
            adapter2.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final cp0 getAdapter() {
        RecyclerView.Adapter adapter = getBinding().c.getAdapter();
        if (adapter instanceof cp0) {
            return (cp0) adapter;
        }
        return null;
    }

    private final v69 getSmoothScroller() {
        return (v69) this.smoothScroller.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void innerCloseModalView(AddressClarificationCloseReason reason) {
        zp0 zp0Var = this.presenter;
        ru.yandex.taxi.address.clarification.impl.repo.a aVar = zp0Var.E;
        aVar.i.g(reason);
        if (reason == AddressClarificationCloseReason.DONE_PRESSED) {
            zp0Var.C.a("RestrictedAreaPopup.DidTapConfirmButton", true, zp0Var.x, zp0Var.L, aVar.e);
        }
        zp0Var.y.invoke(reason);
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(AddressAdjustmentModalView addressAdjustmentModalView) {
        addressAdjustmentModalView.innerCloseModalView(AddressClarificationCloseReason.DONE_PRESSED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$1(AddressAdjustmentModalView addressAdjustmentModalView) {
        zp0 zp0Var = addressAdjustmentModalView.presenter;
        zp0Var.C.a("RestrictedAreaPopup.DidTapBack", false, zp0Var.x, zp0Var.L, null);
        zp0Var.y.invoke(AddressClarificationCloseReason.BACK_PRESSED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void smoothScrollToCenteredPosition(RecyclerView recyclerView, int i) {
        if (i < 0) {
            return;
        }
        getSmoothScroller().a = i;
        RecyclerView.e layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.v(getSmoothScroller());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v69 smoothScroller_delegate$lambda$0(AddressAdjustmentModalView addressAdjustmentModalView) {
        return new v69(addressAdjustmentModalView.contextWrapper);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        cxu0 a;
        super.applyTheme(themeType);
        zp0 zp0Var = this.presenter;
        exu0 exu0Var = zp0Var.I;
        String str = zp0Var.M;
        if (str == null || (a = ((nrt) exu0Var).b(themeType, str)) == null) {
            a = exu0Var.a(themeType);
        }
        ((sp0) zp0Var.Dg()).applyModalTheme(a.b, themeType);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return mqg0.transparent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public lr0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(bph0.address_clarification_modal_view, parent, false);
        int i = xch0.bottom_container;
        if (((FrameLayout) cma1.O(i, inflate)) != null) {
            MaxHeightConstraintLayout maxHeightConstraintLayout = (MaxHeightConstraintLayout) inflate;
            i = xch0.content_recycler_view;
            RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
            if (recyclerView != null) {
                i = xch0.done_button;
                ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
                if (buttonComponent != null) {
                    i = xch0.shadow;
                    if (((ImageView) cma1.O(i, inflate)) != null) {
                        i = xch0.title;
                        ListTitleComponent listTitleComponent = (ListTitleComponent) cma1.O(i, inflate);
                        if (listTitleComponent != null) {
                            return new lr0(maxHeightConstraintLayout, maxHeightConstraintLayout, recyclerView, buttonComponent, listTitleComponent);
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: canDragToExpandFromAnchored */
    public boolean getCanDragToExpandedState() {
        return false;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getBinding().b.setMaxHeightContainer(360);
        getBinding().c.setItemAnimator(null);
        getBinding().c.setAdapter(new cp0(this.imageLoader, this.tagUrlFormatter, this.formattedTextConverter, new AddressAdjustmentModalView$onAttachedToWindow$1(1, this.presenter, zp0.class, "onOptionClicked", "onOptionClicked(Lru/yandex/taxi/address/clarification/impl/ui/recycler/SelectableOption;)V", 0)));
        getBinding().d.setOnClickListener(new ip0(this, 2));
        zp0 zp0Var = this.presenter;
        kp0 kp0Var = new kp0(this);
        zp0Var.Bg(kp0Var);
        zp0Var.E.b(true);
        tse Jg = zp0Var.Jg();
        sjh sjhVar = uyj.a;
        tje.N(Jg, o400.a.x, null, new AddressAdjustmentPresenter$attachView$1(zp0Var, kp0Var, null), 2);
        tje.N(zp0Var.Jg(), null, null, new AddressAdjustmentPresenter$attachView$2(zp0Var, kp0Var, null), 3);
        tje.N(zp0Var.Jg(), null, null, new AddressAdjustmentPresenter$attachView$3(zp0Var, null), 3);
        setOnBackPressedListener(new ip0(this, 3));
        androidx.core.view.b.q(getBinding().e, true);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (xw31.l((int) event.getX(), (int) event.getY(), 0, getCardContentView())) {
            return super.onTouchEvent(event);
        }
        return false;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onTouchOutside() {
    }
}
