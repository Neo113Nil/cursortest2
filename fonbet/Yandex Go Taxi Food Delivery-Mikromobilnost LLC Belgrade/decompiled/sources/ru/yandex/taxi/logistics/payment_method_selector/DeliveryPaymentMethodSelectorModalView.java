package ru.yandex.taxi.logistics.payment_method_selector;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.aka0;
import defpackage.aoi;
import defpackage.ce0;
import defpackage.cma1;
import defpackage.d6z;
import defpackage.eii;
import defpackage.fii;
import defpackage.geh0;
import defpackage.gii;
import defpackage.h7a0;
import defpackage.hii;
import defpackage.l170;
import defpackage.lqh0;
import defpackage.m7a0;
import defpackage.n7a0;
import defpackage.ny61;
import defpackage.qcp0;
import defpackage.tcc;
import defpackage.ut90;
import defpackage.xja0;
import defpackage.xni;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B#\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/yandex/taxi/logistics/payment_method_selector/DeliveryPaymentMethodSelectorModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lfii;", "Lgii;", "Landroid/content/Context;", "context", "Lhii;", "presenter", "Lh7a0;", "paymentMethodSelectorEngineFactory", "<init>", "(Landroid/content/Context;Lhii;Lh7a0;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", "getTopPadding", "()I", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lfii;", "Lhii;", "Lxni;", "engine", "Lxni;", "payment_method_selector"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeliveryPaymentMethodSelectorModalView extends SlideableBindingModalView<fii> implements gii {
    private final xni engine;
    private final hii presenter;

    public DeliveryPaymentMethodSelectorModalView(Context context, hii hiiVar, h7a0 h7a0Var) {
        super(context);
        this.presenter = hiiVar;
        ut90 ut90Var = hiiVar.x;
        xja0 xja0Var = ut90Var.b().f;
        String Y = d6z.Y(ut90Var.b(), xja0Var.a);
        String str = xja0Var.b;
        String Y2 = str != null ? d6z.Y(ut90Var.b(), str) : null;
        String str2 = xja0Var.c;
        String Y3 = d6z.Y(ut90Var.b(), xja0Var.d);
        List<aka0> list = xja0Var.e;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (aka0 aka0Var : list) {
            String Y4 = d6z.Y(ut90Var.b(), aka0Var.b);
            String str3 = aka0Var.c;
            arrayList.add(new l170(Y4, str3 != null ? d6z.Y(ut90Var.b(), str3) : null, aka0Var.a));
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            l170 l170Var = (l170) it.next();
            arrayList2.add(new m7a0(l170Var.a, l170Var.b, l170Var.c));
        }
        n7a0 n7a0Var = new n7a0(Y, Y2, str2, Y3, arrayList2);
        eii eiiVar = new eii(this);
        qcp0 qcp0Var = h7a0Var.a;
        this.engine = new aoi(h7a0Var.b, n7a0Var, eiiVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public fii bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        LayoutInflater from = LayoutInflater.from(getContext());
        ViewGroup cardContentContainer = getCardContentContainer();
        if (cardContentContainer == null) {
            ny61.t("parent");
            return null;
        }
        from.inflate(lqh0.delivery_payment_method_selector_modal_view, cardContentContainer);
        int i = geh0.container;
        FrameLayout frameLayout = (FrameLayout) cma1.O(i, cardContentContainer);
        if (frameLayout != null) {
            return new fii(cardContentContainer, frameLayout);
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
        post(new ce0(this, 15));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.engine.a();
        this.presenter.Cg();
        super.onDetachedFromWindow();
    }
}
