package ru.yandex.taxi.search.view;

import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.aph0;
import defpackage.ax4;
import defpackage.b61;
import defpackage.bx4;
import defpackage.cx4;
import defpackage.p51;
import defpackage.q51;
import defpackage.t030;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 42\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00015B!\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u0019\b\u0014\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\u000bB\u0011\b\u0014\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\fB\u0019\b\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0015¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ\u000f\u0010\u0014\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00152\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0015H\u0014¢\u0006\u0004\b$\u0010\u0017J\u000f\u0010%\u001a\u00020\u0015H\u0014¢\u0006\u0004\b%\u0010\u0017J\u0019\u0010(\u001a\u00020\u00152\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0015H\u0014¢\u0006\u0004\b*\u0010\u0017R\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010+R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u000fR\u0014\u00103\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u000f¨\u00066"}, d2 = {"Lru/yandex/taxi/search/view/AddressSearchModalView;", "Lru/yandex/taxi/search/view/BaseAddressSearchModalView;", "Lb61;", "Lru/yandex/taxi/search/view/AddressSearchView;", "viewBuilder", "", "initialState", "Lru/yandex/taxi/widget/SlideableModalView$CardMode;", "cardMode", "<init>", "(Lb61;ILru/yandex/taxi/widget/SlideableModalView$CardMode;)V", "(Lb61;I)V", "(Lb61;)V", "(Lb61;Lru/yandex/taxi/widget/SlideableModalView$CardMode;)V", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "", "isFullscreen", "()Z", "getTopPadding", "isArrowsPermanentlyHidden", "Lzy11;", "onDismissManually", "()V", "Lax4;", "onAddressPickedListener", "setOnAddressPickedListener", "(Lax4;)V", "Lcx4;", "listener", "setOnPickupFromPhotoTapListener", "(Lcx4;)V", "Lbx4;", "onKeyboardListener", "setOnKeyboardListener", "(Lbx4;)V", "onAttachedToWindow", "onDetachedFromWindow", "Ljava/lang/Runnable;", "onAnimationEnd", "dismissWithAction", "(Ljava/lang/Runnable;)V", "onTouchOutside", CA20Status.STATUS_USER_I, "Z", "Lt030;", "modalViewCompatibleDelegate", "Lt030;", "getCardContentViewLayoutRes", "cardContentViewLayoutRes", "getCornerRadius", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "Companion", "p51", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public class AddressSearchModalView extends BaseAddressSearchModalView<b61, AddressSearchView> {
    public static final p51 Companion = new p51();
    private final int backgroundColor;
    private final boolean isFullscreen;
    private final t030 modalViewCompatibleDelegate;

    public AddressSearchModalView(b61 b61Var, int i, SlideableModalView.CardMode cardMode) {
        super(b61Var, i, cardMode);
        this.backgroundColor = b61Var.z;
        this.isFullscreen = false;
        updateCurrentBackground();
        refreshTopPadding();
        updateArrow();
        this.modalViewCompatibleDelegate = new q51(this);
    }

    public static final AddressSearchModalView of(b61 b61Var) {
        Companion.getClass();
        return p51.a(b61Var);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor, reason: from getter */
    public int getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.u45
    public void dismissWithAction(Runnable onAnimationEnd) {
        getAddressSearchView().setOnKeyboardListener(null);
        super.dismissWithAction(onAnimationEnd);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        return aph0.address_search_modal_view;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getCornerRadius() {
        if (this.isFullscreen) {
            return 0;
        }
        return super.getCornerRadius();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getTopPadding() {
        if (this.isFullscreen) {
            return 0;
        }
        return super.getTopPadding();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isArrowsPermanentlyHidden */
    public boolean getIsArrowHidden() {
        if (this.isFullscreen) {
            return true;
        }
        return super.getIsArrowHidden();
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchModalView
    /* renamed from: isFullscreen, reason: from getter */
    public boolean getIsFullscreen() {
        return this.isFullscreen;
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAddressSearchView().setModalViewCompatibleDelegate(this.modalViewCompatibleDelegate);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getAddressSearchView().setModalViewCompatibleDelegate(null);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onDismissManually() {
        super.onDismissManually();
        getAddressSearchView().onParentDismissManually();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onTouchOutside() {
        getAddressSearchView().onTouchOutside();
        super.onTouchOutside();
    }

    public final void setOnAddressPickedListener(ax4 onAddressPickedListener) {
        getAddressSearchView().setOnAddressPickedListener(onAddressPickedListener);
    }

    public final void setOnKeyboardListener(bx4 onKeyboardListener) {
        getAddressSearchView().setOnKeyboardListener(onKeyboardListener);
    }

    public final void setOnPickupFromPhotoTapListener(cx4 listener) {
        getAddressSearchView().setOnPickupFromPhotoTapListener(listener);
    }

    public AddressSearchModalView(b61 b61Var, int i) {
        this(b61Var, i, SlideableModalView.CardMode.SLIDEABLE_CARD);
    }

    public AddressSearchModalView(b61 b61Var) {
        this(b61Var, SlideableModalView.CardMode.SLIDEABLE_CARD);
    }

    public AddressSearchModalView(b61 b61Var, SlideableModalView.CardMode cardMode) {
        this(b61Var, -1, cardMode);
    }
}
