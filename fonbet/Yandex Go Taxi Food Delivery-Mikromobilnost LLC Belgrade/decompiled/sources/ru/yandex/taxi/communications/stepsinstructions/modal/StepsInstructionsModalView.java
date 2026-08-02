package ru.yandex.taxi.communications.stepsinstructions.modal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoImageView;
import defpackage.bbu0;
import defpackage.c57;
import defpackage.cbu0;
import defpackage.cma1;
import defpackage.hk1;
import defpackage.ny61;
import defpackage.pm5;
import defpackage.qau0;
import defpackage.yhh0;
import defpackage.ysh0;
import kotlin.Metadata;
import ru.yandex.taxi.communications.modal.analytics.CommunicationModalAnalyticsData$CloseReason;
import ru.yandex.taxi.widget.ButtonsView;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001fB\u001d\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0015\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/yandex/taxi/communications/stepsinstructions/modal/StepsInstructionsModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lcbu0;", "Lnwy0;", "Lru/yandex/taxi/communications/stepsinstructions/presenter/a;", "presenter", "Landroid/content/Context;", "context", "<init>", "(Lru/yandex/taxi/communications/stepsinstructions/presenter/a;Landroid/content/Context;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcbu0;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "onBackPressed", "onTouchOutside", "onSlideOut", "Lru/yandex/taxi/communications/stepsinstructions/presenter/a;", "Lqau0;", "stepsAdapter", "Lqau0;", "Lc57;", "Luau0;", "stickyButtons", "Lc57;", "bbu0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StepsInstructionsModalView extends SlideableBindingModalView<cbu0> {
    public static final int $stable = 8;
    private final ru.yandex.taxi.communications.stepsinstructions.presenter.a presenter;
    private final qau0 stepsAdapter;
    private final c57 stickyButtons;

    public StepsInstructionsModalView(ru.yandex.taxi.communications.stepsinstructions.presenter.a aVar, Context context) {
        super(context);
        this.presenter = aVar;
        qau0 qau0Var = new qau0(new StepsInstructionsModalView$stepsAdapter$1(1, aVar, ru.yandex.taxi.communications.stepsinstructions.presenter.a.class, "onButtonClick", "onButtonClick(Lru/yandex/taxi/communications/stepsinstructions/model/StepsButtonAction;)V", 0));
        this.stepsAdapter = qau0Var;
        c57 buttonsContract = getBinding().e.buttonsContract();
        this.stickyButtons = buttonsContract;
        setNestedScrollingEnabled(false);
        RecyclerView recyclerView = getBinding().d;
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        recyclerView.setAdapter(qau0Var);
        recyclerView.setItemAnimator(null);
        ((pm5) buttonsContract).f(new hk1(aVar, 3));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public cbu0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(ysh0.steps_instructions_modal_view, parent, false);
        int i = yhh0.bottom_container;
        FrameLayout frameLayout = (FrameLayout) cma1.O(i, inflate);
        if (frameLayout != null) {
            i = yhh0.bottom_container_shadow;
            GoImageView goImageView = (GoImageView) cma1.O(i, inflate);
            if (goImageView != null) {
                i = yhh0.steps;
                RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                if (recyclerView != null) {
                    i = yhh0.stickyButtons;
                    ButtonsView buttonsView = (ButtonsView) cma1.O(i, inflate);
                    if (buttonsView != null) {
                        return new cbu0((ConstraintLayout) inflate, frameLayout, goImageView, recyclerView, buttonsView);
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
        this.presenter.Kg(new bbu0(this));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        super.onBackPressed();
        ru.yandex.taxi.communications.stepsinstructions.presenter.a aVar = this.presenter;
        aVar.B.b(aVar.y, CommunicationModalAnalyticsData$CloseReason.SYSTEM_BACK);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onSlideOut() {
        super.onSlideOut();
        ru.yandex.taxi.communications.stepsinstructions.presenter.a aVar = this.presenter;
        aVar.B.b(aVar.y, CommunicationModalAnalyticsData$CloseReason.SWIPE);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onTouchOutside() {
        super.onTouchOutside();
        ru.yandex.taxi.communications.stepsinstructions.presenter.a aVar = this.presenter;
        aVar.B.b(aVar.y, CommunicationModalAnalyticsData$CloseReason.TAP_OUTSIDE);
    }
}
