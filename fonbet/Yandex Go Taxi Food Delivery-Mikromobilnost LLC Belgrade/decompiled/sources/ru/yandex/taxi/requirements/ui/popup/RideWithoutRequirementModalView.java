package ru.yandex.taxi.requirements.ui.popup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.cma1;
import defpackage.mfh0;
import defpackage.nrh0;
import defpackage.ny61;
import defpackage.sc;
import defpackage.tje;
import defpackage.wjj0;
import defpackage.yqk0;
import kotlin.Metadata;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.requirements.ui.popup.RideWithoutRequirementModalView;
import ru.yandex.taxi.widget.ArrowsView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/yandex/taxi/requirements/ui/popup/RideWithoutRequirementModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lyqk0;", "Landroid/content/Context;", "context", "Lwjj0;", "popupModel", "Ljava/lang/Runnable;", "onNegativeClick", "onPositiveClick", "onDismiss", "<init>", "(Landroid/content/Context;Lwjj0;Ljava/lang/Runnable;Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;", "Landroid/view/View;", "behavior", "Lzy11;", "initBehavior", "(Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lyqk0;", "", "getCornerRadius", "()I", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "nonblocking"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RideWithoutRequirementModalView extends SlideableBindingModalView<yqk0> {
    public RideWithoutRequirementModalView(Context context, wjj0 wjj0Var, final Runnable runnable, final Runnable runnable2, Runnable runnable3) {
        super(context);
        setOnAppearingListener(new sc(9, runnable3));
        setArrowState(ArrowsView.State.GONE);
        getBinding().e.setText(wjj0Var.a);
        getBinding().b.setText(wjj0Var.b);
        getBinding().d.setText(wjj0Var.c);
        getBinding().c.setText(wjj0Var.d);
        final int i = 0;
        getBinding().d.setDebounceClickListener(new Runnable(this) { // from class: xqk0
            public final /* synthetic */ RideWithoutRequirementModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                Runnable runnable4 = runnable2;
                RideWithoutRequirementModalView rideWithoutRequirementModalView = this.b;
                switch (i2) {
                    case 0:
                        RideWithoutRequirementModalView._init_$lambda$0(rideWithoutRequirementModalView, runnable4);
                        break;
                    default:
                        RideWithoutRequirementModalView._init_$lambda$1(rideWithoutRequirementModalView, runnable4);
                        break;
                }
            }
        });
        final int i2 = 1;
        getBinding().c.setDebounceClickListener(new Runnable(this) { // from class: xqk0
            public final /* synthetic */ RideWithoutRequirementModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                Runnable runnable4 = runnable;
                RideWithoutRequirementModalView rideWithoutRequirementModalView = this.b;
                switch (i22) {
                    case 0:
                        RideWithoutRequirementModalView._init_$lambda$0(rideWithoutRequirementModalView, runnable4);
                        break;
                    default:
                        RideWithoutRequirementModalView._init_$lambda$1(rideWithoutRequirementModalView, runnable4);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(RideWithoutRequirementModalView rideWithoutRequirementModalView, Runnable runnable) {
        rideWithoutRequirementModalView.dismiss();
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(RideWithoutRequirementModalView rideWithoutRequirementModalView, Runnable runnable) {
        rideWithoutRequirementModalView.dismiss();
        runnable.run();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public yqk0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(nrh0.ride_without_requirement_modal_view, parent, false);
        int i = mfh0.message;
        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
        if (robotoTextView != null) {
            i = mfh0.negative_button;
            ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
            if (buttonComponent != null) {
                i = mfh0.positive_button;
                ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, inflate);
                if (buttonComponent2 != null) {
                    i = mfh0.title;
                    RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                    if (robotoTextView2 != null) {
                        return new yqk0((LinearLayout) inflate, robotoTextView, buttonComponent, buttonComponent2, robotoTextView2);
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
        return tje.u(24, getContext());
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void initBehavior(AnchorBottomSheetBehavior<View> behavior) {
        super.initBehavior(behavior);
        behavior.W = false;
        behavior.Z = false;
    }
}
