package ru.yandex.taxi.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.cma1;
import defpackage.f580;
import defpackage.ggj0;
import defpackage.jfj0;
import defpackage.jgj0;
import defpackage.kfh0;
import defpackage.krh0;
import defpackage.mrg0;
import defpackage.ny61;
import defpackage.p8j;
import defpackage.ps21;
import defpackage.q3c0;
import defpackage.qfj0;
import defpackage.rfj0;
import defpackage.tfj0;
import defpackage.tje;
import defpackage.ycc;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.a;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB+\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0011\u0010\u000fJ\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u0018\u0010\u001c\u001a\u00060\u001bR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/yandex/taxi/ui/RequirementDetailsModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lp8j;", "Landroid/content/Context;", "context", "Ltfj0;", "presenter", "Lf580;", "analytics", "", "openReason", "<init>", "(Landroid/content/Context;Ltfj0;Lf580;Ljava/lang/String;)V", "Lzy11;", "onAttachedToWindow", "()V", "onAppearAnimationComplete", "onModalViewDisappear", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lp8j;", "Ltfj0;", "Lf580;", "Ljava/lang/String;", "Lrfj0;", "mvpView", "Lrfj0;", "Ljfj0;", "adapter", "Ljfj0;", "", "getCornerRadius", "()I", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "details"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RequirementDetailsModalView extends SlideableBindingModalView<p8j> {
    private final jfj0 adapter;
    private final f580 analytics;
    private final rfj0 mvpView;
    private final String openReason;
    private final tfj0 presenter;

    public RequirementDetailsModalView(Context context, tfj0 tfj0Var, f580 f580Var, String str) {
        super(context);
        this.presenter = tfj0Var;
        this.analytics = f580Var;
        this.openReason = str;
        this.mvpView = new rfj0(this);
        this.adapter = new jfj0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$quit(tfj0 tfj0Var) {
        tfj0Var.B.a().p();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public p8j bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = LayoutInflater.from(getContext()).inflate(krh0.details_modal_view, getCardContentContainer(), false);
        int i = kfh0.bottom_container;
        FrameLayout frameLayout = (FrameLayout) cma1.O(i, inflate);
        if (frameLayout != null) {
            i = kfh0.content_recycler_view;
            RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
            if (recyclerView != null) {
                i = kfh0.done_button;
                ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
                if (buttonComponent != null) {
                    i = kfh0.shadow;
                    if (((ImageView) cma1.O(i, inflate)) != null) {
                        return new p8j((LinearLayout) inflate, frameLayout, recyclerView, buttonComponent);
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: getCornerRadius */
    public int getCornersRadius() {
        return tje.r(mrg0.modal_view_corner_radius_big, getContext());
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onAppearAnimationComplete() {
        super.onAppearAnimationComplete();
        tfj0 tfj0Var = this.presenter;
        tje.N(tfj0Var.Jg(), null, null, new RequirementDetailsPresenter$getRequirementDetails$1(tfj0Var, null), 3);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        tfj0 tfj0Var = this.presenter;
        rfj0 rfj0Var = this.mvpView;
        tfj0Var.Bg(rfj0Var);
        ggj0 ggj0Var = tfj0Var.y;
        ggj0Var.b().clear();
        ycc.t(ggj0Var.b(), (q3c0[]) ggj0Var.b.getValue());
        rfj0Var.x4(new jgj0(a.J0(ggj0Var.b())));
        getBinding().c.setAdapter(this.adapter);
        getBinding().d.setDebounceClickListener(new qfj0(this.presenter, 0));
        f580 f580Var = this.analytics;
        String str = this.openReason;
        ps21 ps21Var = f580Var.e;
        String lowerCase = str != null ? str.toLowerCase(Locale.ROOT) : null;
        ps21Var.getClass();
        HashMap hashMap = new HashMap();
        if (lowerCase != null) {
            hashMap.put("open_reason", lowerCase);
        }
        ps21Var.a.a("MoveThingsDescriptionCard.Shown", hashMap, 1, new HashMap());
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onModalViewDisappear() {
        this.presenter.Cg();
        super.onModalViewDisappear();
    }
}
