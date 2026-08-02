package ru.yandex.taxi.delivery.cost_details;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import defpackage.a2i;
import defpackage.aoi;
import defpackage.apf;
import defpackage.cma1;
import defpackage.d2i;
import defpackage.deh0;
import defpackage.e2i;
import defpackage.h2i;
import defpackage.hqh0;
import defpackage.ny61;
import defpackage.qcp0;
import defpackage.t1i;
import defpackage.xni;
import defpackage.z1i;
import kotlin.Metadata;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.scroll.NestedScrollViewAdvanced;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B#\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/yandex/taxi/delivery/cost_details/DeliveryCostDetailsModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "La2i;", "Ld2i;", "Landroid/content/Context;", "context", "Le2i;", "presenter", "Lt1i;", "deliveryCostDetailsEngineFactory", "<init>", "(Landroid/content/Context;Le2i;Lt1i;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La2i;", "", "getTopPadding", "()I", "Le2i;", "Lxni;", "engine", "Lxni;", "delivery_form"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeliveryCostDetailsModalView extends SlideableBindingModalView<a2i> implements d2i {
    private final xni engine;
    private final e2i presenter;

    public DeliveryCostDetailsModalView(Context context, e2i e2iVar, t1i t1iVar) {
        super(context);
        this.presenter = e2iVar;
        h2i h2iVar = new h2i(e2iVar.x);
        z1i z1iVar = new z1i(this);
        qcp0 qcp0Var = t1iVar.a;
        apf apfVar = t1iVar.b;
        qcp0Var.getClass();
        this.engine = new aoi(apfVar, h2iVar, z1iVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public a2i bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        LayoutInflater from = LayoutInflater.from(getContext());
        ViewGroup cardContentContainer = getCardContentContainer();
        if (cardContentContainer == null) {
            ny61.t("parent");
            return null;
        }
        from.inflate(hqh0.delivery_cost_details_modal_view, cardContentContainer);
        int i = deh0.container;
        NestedScrollViewAdvanced nestedScrollViewAdvanced = (NestedScrollViewAdvanced) cma1.O(i, cardContentContainer);
        if (nestedScrollViewAdvanced != null) {
            return new a2i(cardContentContainer, nestedScrollViewAdvanced);
        }
        ny61.t("Missing required view with ID: ".concat(cardContentContainer.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getTopPadding() {
        return 0;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.presenter.Bg(this);
        this.engine.b(getBinding().b);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.engine.a();
        this.presenter.Cg();
        super.onDetachedFromWindow();
    }
}
