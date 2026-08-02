package ru.yandex.taxi.search.view;

import android.view.View;
import android.view.ViewGroup;
import defpackage.e230;
import defpackage.h61;
import defpackage.w130;
import defpackage.zw4;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.search.view.BaseAddressSearchView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\r\b&\u0018\u0000*\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001*\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00010\u00032\u00020\u0005B+\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB\u001d\b\u0015\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001¢\u0006\u0004\b\u000b\u0010\rB%\b\u0014\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00028\u00018\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010%¨\u0006'"}, d2 = {"Lru/yandex/taxi/search/view/BaseAddressSearchModalView;", "Lzw4;", "T", "Lru/yandex/taxi/search/view/BaseAddressSearchView;", CA20Status.STATUS_CERTIFICATE_V, "Lru/yandex/taxi/widget/SlideableModalView;", "builder", "", "initialState", "Lru/yandex/taxi/widget/SlideableModalView$CardMode;", "cardMode", "<init>", "(Lzw4;ILru/yandex/taxi/widget/SlideableModalView$CardMode;)V", "(Lzw4;)V", "(Lzw4;I)V", "", "isFullscreen", "()Z", "Le230;", "insetsType", "()Le230;", "Lzy11;", "onAttachedToWindow", "()V", "suggestViewTopOffset", "()I", "", "newOffset", "onDialogSlide", "(F)V", "addressSearchView", "Lru/yandex/taxi/search/view/BaseAddressSearchView;", "getAddressSearchView", "()Lru/yandex/taxi/search/view/BaseAddressSearchView;", "lastSlideOffset", "F", "canCloseKeyboard", "Z", "skipFirstInsetsChange", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseAddressSearchModalView<T extends zw4, V extends BaseAddressSearchView<V>> extends SlideableModalView {
    private final V addressSearchView;
    private boolean canCloseKeyboard;
    private float lastSlideOffset;
    private boolean skipFirstInsetsChange;

    public BaseAddressSearchModalView(zw4 zw4Var, int i, SlideableModalView.CardMode cardMode) {
        super(zw4Var.a, i);
        V v = (V) zw4Var.a();
        this.addressSearchView = v;
        this.lastSlideOffset = 1.0f;
        this.canCloseKeyboard = true;
        this.skipFirstInsetsChange = zw4Var.k;
        getCardContentContainer().addView(v);
        setId(zw4Var.j);
        setCardMode(cardMode);
    }

    public final V getAddressSearchView() {
        return this.addressSearchView;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new w130(1, new BaseAddressSearchModalView$insetsType$1(1, new h61(this, this.addressSearchView, this.skipFirstInsetsChange, getIsFullscreen()), h61.class, "onInsetsChanged", "onInsetsChanged(Lru/yandex/taxi/utils/Insets;)V", 0));
    }

    /* renamed from: isFullscreen */
    public boolean getIsFullscreen() {
        return false;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        requestApplyInsets();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onDialogSlide(float newOffset) {
        super.onDialogSlide(newOffset);
        if (hasFocus() && newOffset < this.lastSlideOffset && this.canCloseKeyboard) {
            this.addressSearchView.searchModalCloseKeyboard();
            this.canCloseKeyboard = false;
        } else if (Float.compare(newOffset, 1.0f) == 0) {
            this.canCloseKeyboard = true;
        }
        this.lastSlideOffset = newOffset;
        this.addressSearchView.getSearchModalInputShadow().setAlpha(Math.max(0.0f, Math.min(newOffset, 1.0f)));
    }

    public int suggestViewTopOffset() {
        ViewGroup cardContentContainer = getCardContentContainer();
        View suggestsView = this.addressSearchView.getSuggestsView();
        int i = 0;
        while (suggestsView != cardContentContainer && suggestsView != null) {
            i += suggestsView.getTop();
            Object parent = suggestsView.getParent();
            suggestsView = parent instanceof View ? (View) parent : null;
        }
        return i;
    }

    public BaseAddressSearchModalView(zw4 zw4Var, int i) {
        this(zw4Var, i, SlideableModalView.CardMode.SLIDEABLE_CARD);
    }

    public BaseAddressSearchModalView(zw4 zw4Var) {
        this(zw4Var, -1, SlideableModalView.CardMode.SLIDEABLE_CARD);
    }
}
