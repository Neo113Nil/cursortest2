package ru.yandex.taxi.search.address.view;

import android.view.View;
import defpackage.eph0;
import defpackage.f51;
import defpackage.i3y;
import defpackage.m020;
import defpackage.oz20;
import defpackage.pz20;
import defpackage.qz20;
import defpackage.x9v0;
import defpackage.zch0;
import kotlin.Metadata;
import ru.yandex.taxi.search.view.AddressSearchView;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001a2\u00020\u0001:\u0003\u0002\u001b\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0010\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lru/yandex/taxi/search/address/view/ModalSourceSearchView;", "Lru/yandex/taxi/search/view/AddressSearchView;", "Loz20;", "builder", "<init>", "(Loz20;)V", "Lzy11;", "onAttachedToWindow", "()V", "Lx9v0;", "model", "onItemSelectedLongTap", "(Lx9v0;)V", "", "getContentViewLayoutRes", "()I", "onDismiss", "Loz20;", "getBuilder", "()Loz20;", "Landroid/view/View;", "bottomShadowView$delegate", "Li3y;", "getBottomShadowView", "()Landroid/view/View;", "bottomShadowView", "Companion", "qz20", "pz20", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ModalSourceSearchView extends AddressSearchView {
    public static final pz20 Companion = new pz20();

    /* renamed from: bottomShadowView$delegate, reason: from kotlin metadata */
    private final i3y bottomShadowView;
    private final oz20 builder;

    public ModalSourceSearchView(oz20 oz20Var) {
        super(oz20Var);
        this.builder = oz20Var;
        this.bottomShadowView = kotlin.a.a(new m020(11, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View bottomShadowView_delegate$lambda$0(ModalSourceSearchView modalSourceSearchView) {
        View findViewById = modalSourceSearchView.findViewById(zch0.bottom_shadow);
        if (findViewById == null) {
            return null;
        }
        modalSourceSearchView.presenter.ph(findViewById);
        findViewById.setVisibility(4);
        return findViewById;
    }

    public static final oz20 builder(f51 f51Var) {
        Companion.getClass();
        oz20 oz20Var = new oz20(f51Var);
        oz20Var.B = true;
        return oz20Var;
    }

    private final View getBottomShadowView() {
        return (View) this.bottomShadowView.getValue();
    }

    public final oz20 getBuilder() {
        return this.builder;
    }

    @Override // ru.yandex.taxi.search.view.AddressSearchView, ru.yandex.taxi.search.view.BaseAddressSearchView
    public int getContentViewLayoutRes() {
        return eph0.source_search_view;
    }

    @Override // ru.yandex.taxi.search.view.AddressSearchView, ru.yandex.taxi.search.view.BaseAddressSearchView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        suggestsViewField().setTopPadding(0);
        addShadowScrollListener(getBottomShadowView());
        this.addressInputHolder.a.setOnFocusChangeListener(null);
    }

    @Override // ru.yandex.taxi.search.view.AddressSearchView, ru.yandex.taxi.search.view.BaseAddressSearchView
    public void onDismiss() {
        qz20 qz20Var = this.builder.A;
        if (qz20Var != null) {
            qz20Var.onBack();
        }
    }

    @Override // ru.yandex.taxi.search.view.AddressSearchView, ru.yandex.taxi.search.view.BaseAddressSearchView
    public void onItemSelectedLongTap(x9v0 model) {
        if (this.builder.B) {
            super.onItemSelectedLongTap(model);
        }
    }
}
