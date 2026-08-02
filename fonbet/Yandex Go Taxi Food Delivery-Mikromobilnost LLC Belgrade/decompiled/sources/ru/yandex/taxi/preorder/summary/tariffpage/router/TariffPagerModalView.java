package ru.yandex.taxi.preorder.summary.tariffpage.router;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.efv0;
import defpackage.ejx0;
import defpackage.t1w;
import defpackage.xrh0;
import defpackage.zjj0;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u0001(B/\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R\u0016\u0010#\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00068UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lru/yandex/taxi/preorder/summary/tariffpage/router/TariffPagerModalView;", "Lru/yandex/taxi/widget/SlideableModalView;", "Lefv0;", "tariffPagerView", "Landroid/widget/FrameLayout;", "contentView", "", "initialState", "Lejx0;", "tariffOptionsShowRequirementsInteractor", "<init>", "(Lefv0;Landroid/widget/FrameLayout;ILejx0;)V", "Lt1w;", "insets", "Lzy11;", "onInsetsHandled", "(Lt1w;)V", "onAttachedToWindow", "()V", "Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;", "Landroid/view/View;", "getViewBottomSheetBehavior", "()Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;", "", "screenName", "()Ljava/lang/String;", "Lzjj0;", "scrollParams", "showTariffRequirements", "(Lzjj0;)V", "getFocusedView", "()Landroid/view/View;", "Lefv0;", "Landroid/widget/FrameLayout;", "Lejx0;", "statusBarHeight", CA20Status.STATUS_USER_I, "getCardContentViewLayoutRes", "()I", "cardContentViewLayoutRes", "gkx0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TariffPagerModalView extends SlideableModalView {
    private final FrameLayout contentView;
    private int statusBarHeight;
    private final ejx0 tariffOptionsShowRequirementsInteractor;
    private final efv0 tariffPagerView;

    public TariffPagerModalView(efv0 efv0Var, FrameLayout frameLayout, int i, ejx0 ejx0Var) {
        super(frameLayout, Integer.valueOf(i));
        this.tariffPagerView = efv0Var;
        this.contentView = frameLayout;
        this.tariffOptionsShowRequirementsInteractor = ejx0Var;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        return 0;
    }

    public final View getFocusedView() {
        return this.tariffPagerView.getFocusedView();
    }

    public final AnchorBottomSheetBehavior<View> getViewBottomSheetBehavior() {
        return getBottomSheetBehavior();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        FrameLayout frameLayout = this.contentView;
        View inflate = LayoutInflater.from(getContext()).inflate(xrh0.tariff_pager_shimmer, (ViewGroup) null);
        inflate.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(inflate);
        this.contentView.addView(new View(getContext()));
        this.contentView.addView(this.tariffPagerView.asView());
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onInsetsHandled(t1w insets) {
        super.onInsetsHandled(insets);
        this.statusBarHeight = insets.b;
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    /* renamed from: screenName */
    public String getModalScreenName() {
        return "TariffPagerView";
    }

    public final void showTariffRequirements(zjj0 scrollParams) {
        this.tariffOptionsShowRequirementsInteractor.a(scrollParams, this.tariffPagerView.asView(), this.statusBarHeight);
    }
}
