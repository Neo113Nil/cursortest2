package ru.yandex.taxi.logistics.postcard.presentation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.a2i0;
import defpackage.aoi;
import defpackage.bvf0;
import defpackage.ce0;
import defpackage.cma1;
import defpackage.dzg0;
import defpackage.e230;
import defpackage.ejz;
import defpackage.heh0;
import defpackage.kyh0;
import defpackage.mqh0;
import defpackage.mrg0;
import defpackage.myk0;
import defpackage.nfe0;
import defpackage.ny61;
import defpackage.pfe0;
import defpackage.tje;
import defpackage.ufe0;
import defpackage.v130;
import defpackage.wnb0;
import defpackage.xni;
import defpackage.y4a0;
import defpackage.y8g;
import defpackage.zy11;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/yandex/taxi/logistics/postcard/presentation/PostcardPresentationModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lejz;", "Lnfe0;", "Landroid/content/Context;", "context", "Lpfe0;", "presenter", "<init>", "(Landroid/content/Context;Lpfe0;)V", "Landroid/view/View;", "view", "Lzy11;", "makeRounded", "(Landroid/view/View;)V", "Le230;", "insetsType", "()Le230;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lejz;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", "getTopPadding", "()I", "Lpfe0;", "Lxni;", "engine", "Lxni;", "radius", CA20Status.STATUS_USER_I, "postcard"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PostcardPresentationModalView extends SlideableBindingModalView<ejz> implements nfe0 {
    private final xni engine;
    private final pfe0 presenter;
    private final int radius;

    public PostcardPresentationModalView(Context context, pfe0 pfe0Var) {
        super(context);
        aoi m;
        this.presenter = pfe0Var;
        y4a0 y4a0Var = new y4a0(new ufe0(pfe0Var.x.a, false), pfe0Var, false, 19);
        synchronized (bvf0.g) {
            y8g y8gVar = bvf0.e;
            m = (y8gVar == null ? null : y8gVar).e().m(y4a0Var);
        }
        this.engine = m;
        this.radius = tje.r(mrg0.modal_view_corner_radius_big, context);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(mrg0.go_design_s_space);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        makeRounded(getBottomSheet());
        wnb0 wnb0Var = new wnb0(24, pfe0Var);
        int i = dzg0.ic_cross_close;
        FloatButtonIconComponent floatButtonIconComponent = new FloatButtonIconComponent(getContext(), null, 0, a2i0.FloatButtonIconStyle, 4, null);
        floatButtonIconComponent.setDebounceClickListener(wnb0Var);
        floatButtonIconComponent.setLayoutParams(new ViewGroup.LayoutParams(-2, tje.u(90, floatButtonIconComponent.getContext())));
        floatButtonIconComponent.setIcon(i);
        _init_$lambda$0(context, floatButtonIconComponent);
        addFloatButton(floatButtonIconComponent, 8388661);
    }

    private static final zy11 _init_$lambda$0(Context context, FloatButtonIconComponent floatButtonIconComponent) {
        floatButtonIconComponent.setContentDescription(context.getString(kyh0.common_close));
        return zy11.a;
    }

    private final void makeRounded(View view) {
        myk0 myk0Var = new myk0(view);
        float f = this.radius;
        myk0Var.b(f, f);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public ejz bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        if (parent == null) {
            ny61.t("parent");
            return null;
        }
        inflater.inflate(mqh0.logistics_postcard_presentation_modal_view, parent);
        int i = heh0.container;
        FrameLayout frameLayout = (FrameLayout) cma1.O(i, parent);
        if (frameLayout != null) {
            return new ejz(parent, frameLayout);
        }
        ny61.t("Missing required view with ID: ".concat(parent.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getTopPadding() {
        return 0;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new v130(3);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.presenter.Bg(this);
        this.engine.b(getBinding().b);
        post(new ce0(this, 15));
        requestApplyInsets();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.engine.a();
        this.presenter.Cg();
        super.onDetachedFromWindow();
    }
}
