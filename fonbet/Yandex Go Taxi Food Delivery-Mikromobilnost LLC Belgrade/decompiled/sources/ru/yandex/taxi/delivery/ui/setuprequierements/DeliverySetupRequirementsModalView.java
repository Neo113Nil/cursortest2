package ru.yandex.taxi.delivery.ui.setuprequierements;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.b1;
import defpackage.cma1;
import defpackage.cmi;
import defpackage.deh0;
import defpackage.hqh0;
import defpackage.ipi;
import defpackage.jpi;
import defpackage.jqr;
import defpackage.kpi;
import defpackage.mpi;
import defpackage.ny61;
import defpackage.opi;
import defpackage.wls;
import defpackage.x4e;
import defpackage.x8;
import defpackage.yzh;
import defpackage.zch;
import java.util.HashMap;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.design.AutoDividerComponentList;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002 !B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0012\u0010\u000fJ\u000f\u0010\u0013\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0013\u0010\u000fJ\u000f\u0010\u0014\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0014\u0010\u000fJ\u001f\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR&\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lru/yandex/taxi/delivery/ui/setuprequierements/DeliverySetupRequirementsModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lopi;", "Landroid/content/Context;", "context", "Lmpi;", "presenter", "Lkotlin/Function2;", "", "", "Lzy11;", "requirementCallback", "<init>", "(Landroid/content/Context;Lmpi;Lwls;)V", "onAttachedToWindow", "()V", "onBackPressed", "onTouchOutside", "onSlideOut", "onDismissManually", "onDetachedFromWindow", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lopi;", "Lmpi;", "Lwls;", "Lipi;", "adapter", "Lipi;", "yzh", "kpi", "delivery_form"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeliverySetupRequirementsModalView extends SlideableBindingModalView<opi> {
    private final ipi adapter;
    private final mpi presenter;
    private final wls requirementCallback;

    public DeliverySetupRequirementsModalView(Context context, mpi mpiVar, wls wlsVar) {
        super(context);
        this.presenter = mpiVar;
        this.requirementCallback = wlsVar;
        this.adapter = new ipi(getBinding().c, new yzh(this));
    }

    public static final /* synthetic */ opi access$getBinding(DeliverySetupRequirementsModalView deliverySetupRequirementsModalView) {
        return deliverySetupRequirementsModalView.getBinding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(DeliverySetupRequirementsModalView deliverySetupRequirementsModalView, View view) {
        ((x8) deliverySetupRequirementsModalView.presenter.A.a).a();
        zch zchVar = deliverySetupRequirementsModalView.presenter.y;
        b1 b1Var = (b1) zchVar.a;
        b1Var.a.a("DeliveryDetailsRequirements.Tapped", x4e.p("button_name", "confirm"), 1, new HashMap());
        zchVar.g(DeliverySetupRequirementsAnalytics$CloseReason.CONFIRM);
        deliverySetupRequirementsModalView.dismiss();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public opi bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = LayoutInflater.from(getContext()).inflate(hqh0.delivery_setup_requirements_view, getCardContentContainer(), false);
        int i = deh0.done_button;
        ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, inflate);
        if (listItemComponent != null) {
            i = deh0.requirements_group;
            AutoDividerComponentList autoDividerComponentList = (AutoDividerComponentList) cma1.O(i, inflate);
            if (autoDividerComponentList != null) {
                i = deh0.requirements_title;
                ListHeaderComponent listHeaderComponent = (ListHeaderComponent) cma1.O(i, inflate);
                if (listHeaderComponent != null) {
                    return new opi((LinearLayout) inflate, listItemComponent, autoDividerComponentList, listHeaderComponent);
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mpi mpiVar = this.presenter;
        kpi kpiVar = new kpi(this);
        mpiVar.Bg(kpiVar);
        e.H(mpiVar.Jg(), new jqr(new b(e.t(mpiVar.A.c), mpiVar.B), new DeliverySetupRequirementsPresenter$attachView$2(kpiVar, null), 3));
        jpi jpiVar = mpiVar.x;
        access$getBinding(this).d.setTitle(jpiVar.c);
        access$getBinding(this).b.setTitle(jpiVar.d);
        b1 b1Var = (b1) mpiVar.y.a;
        b1Var.a.a("DeliveryDetailsRequirements.Shown", new HashMap(), 1, new HashMap());
        getBinding().b.setOnClickListener(new cmi(1, this));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        super.onBackPressed();
        this.presenter.y.g(DeliverySetupRequirementsAnalytics$CloseReason.BACK);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.presenter.Cg();
        super.onDetachedFromWindow();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onDismissManually() {
        ((x8) this.presenter.A.a).a();
        super.onDismissManually();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onSlideOut() {
        super.onSlideOut();
        this.presenter.y.g(DeliverySetupRequirementsAnalytics$CloseReason.SLIDE_OUT);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onTouchOutside() {
        super.onTouchOutside();
        this.presenter.y.g(DeliverySetupRequirementsAnalytics$CloseReason.TOUCH_OUTSIDE);
    }
}
