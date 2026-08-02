package ru.yandex.taxi.communications.information;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import defpackage.bdc;
import defpackage.cma1;
import defpackage.czo0;
import defpackage.dhv;
import defpackage.g18;
import defpackage.hbp0;
import defpackage.huv;
import defpackage.juv;
import defpackage.kdc;
import defpackage.nac;
import defpackage.ny61;
import defpackage.pav;
import defpackage.pdc;
import defpackage.tje;
import defpackage.ufu;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.yhh0;
import defpackage.ysh0;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.c;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'B5\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0016\u0010\u0011J\u001f\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001eR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001fR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/yandex/taxi/communications/information/InformationModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lhuv;", "Landroid/content/Context;", "context", "Ljuv;", "model", "Lpav;", "imageLoader", "Lpdc;", "colorConverter", "Lru/yandex/taxi/widget/c;", "formattedTextConverter", "<init>", "(Landroid/content/Context;Ljuv;Lpav;Lpdc;Lru/yandex/taxi/widget/c;)V", "Lzy11;", "onAttachedToWindow", "()V", "", "contentTop", "onModalViewAppear", "(I)V", "onDetachedFromWindow", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lhuv;", "Ljuv;", "Lpav;", "Lpdc;", "Lru/yandex/taxi/widget/c;", "Lhbp0;", "scopeDelegate", "Lhbp0;", "Lg18;", "imageCancellable", "Lg18;", "iuv", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class InformationModalView extends SlideableBindingModalView<huv> {
    public static final int $stable = 8;
    private final pdc colorConverter;
    private final c formattedTextConverter;
    private g18 imageCancellable;
    private final pav imageLoader;
    private final juv model;
    private final hbp0 scopeDelegate;

    public InformationModalView(Context context, juv juvVar, pav pavVar, pdc pdcVar, c cVar) {
        super(context);
        this.model = juvVar;
        this.imageLoader = pavVar;
        this.colorConverter = pdcVar;
        this.formattedTextConverter = cVar;
        this.scopeDelegate = new hbp0(new czo0(14), "", null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public huv bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(ysh0.information_modal_view, parent, false);
        int i = yhh0.icon;
        ImageView imageView = (ImageView) cma1.O(i, inflate);
        if (imageView != null) {
            i = yhh0.message;
            ListTextComponent listTextComponent = (ListTextComponent) cma1.O(i, inflate);
            if (listTextComponent != null) {
                i = yhh0.primary_button;
                ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
                if (buttonComponent != null) {
                    i = yhh0.title;
                    ListTitleComponent listTitleComponent = (ListTitleComponent) cma1.O(i, inflate);
                    if (listTitleComponent != null) {
                        return new huv((LinearLayout) inflate, imageView, listTextComponent, buttonComponent, listTitleComponent);
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
        this.scopeDelegate.a();
        getBinding().e.setTitle(this.model.a);
        getBinding().d.setText(this.model.d);
        getBinding().b.setVisibility(this.model.c.length() > 0 ? 0 : 8);
        if (this.model.c.length() > 0) {
            this.imageCancellable = ((nac) this.imageLoader.a(getBinding().b)).c(this.model.c);
        }
        getBinding().d.setDebounceClickListener(new dhv(3, this));
        kdc b = ((ufu) this.colorConverter).b(this.model.e);
        if (b != null) {
            getBinding().d.setButtonBackground(b);
        }
        getBinding().d.setButtonTitleColor(((ufu) this.colorConverter).h(new bdc(xng0.textOnControl), this.model.f));
        tje.N(this.scopeDelegate.c(), null, null, new InformationModalView$onAttachedToWindow$4(this, null), 3);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g18 g18Var = this.imageCancellable;
        if (g18Var != null) {
            g18Var.cancel();
        }
        this.scopeDelegate.b();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView
    public void onModalViewAppear(int contentTop) {
        super.onModalViewAppear(contentTop);
        xw31.w(getBinding().e);
    }
}
