package ru.yandex.taxi.scooters.presentation.personal_goals;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.design.view.GoView;
import defpackage.bho0;
import defpackage.cma1;
import defpackage.e230;
import defpackage.eaj0;
import defpackage.evu0;
import defpackage.is8;
import defpackage.l8x;
import defpackage.noh;
import defpackage.ny61;
import defpackage.pfh0;
import defpackage.qrh0;
import defpackage.sls;
import defpackage.sso0;
import defpackage.t1w;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.v3n0;
import defpackage.w130;
import defpackage.ytz;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.CloseButtonIconComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B_\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\b\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0016\b\u0001\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\f0\u000e\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u0016J\u001f\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\fH\u0014¢\u0006\u0004\b#\u0010\u0016J\u000f\u0010$\u001a\u00020\fH\u0014¢\u0006\u0004\b$\u0010\u0016J\u000f\u0010&\u001a\u00020%H\u0014¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020%H\u0014¢\u0006\u0004\b(\u0010'J\u000f\u0010)\u001a\u00020\fH\u0014¢\u0006\u0004\b)\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010*R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010+R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010,R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010-R\"\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010.R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00102R \u00106\u001a\f\u0012\u0006\u0012\u0004\u0018\u000105\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107¨\u00068"}, d2 = {"Lru/yandex/taxi/scooters/presentation/personal_goals/ScootersRideFinishPersonalGoalsModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lsso0;", "Landroid/content/Context;", "context", "Ltse;", "coroutineScope", "Lytz;", "lottieLoader", "Lru/yandex/taxi/widget/utils/e;", "mediaInfoConverter", "Lkotlin/Function0;", "Lzy11;", "onClose", "Lkotlin/Function1;", "", "onAction", "Lbho0;", ClidProvider.STATE, "<init>", "(Landroid/content/Context;Ltse;Lytz;Lru/yandex/taxi/widget/utils/e;Lsls;Ltls;Lbho0;)V", "bindState", "()V", "loadImage", "loadAnimation", "startAnimation", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lsso0;", "Le230;", "insetsType", "()Le230;", "onAttachedToWindow", "onAppearAnimationComplete", "", "isArrowsPermanentlyHidden", "()Z", "isApplyShadow", "onDetachedFromWindow", "Ltse;", "Lytz;", "Lru/yandex/taxi/widget/utils/e;", "Lsls;", "Ltls;", "Lbho0;", "Ll8x;", "imageJob", "Ll8x;", "animationJob", "Lnoh;", "Lnsz;", "animationDeferred", "Lnoh;", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersRideFinishPersonalGoalsModalView extends SlideableBindingModalView<sso0> {
    public static final int $stable = 8;
    private noh animationDeferred;
    private l8x animationJob;
    private final tse coroutineScope;
    private l8x imageJob;
    private final ytz lottieLoader;
    private final e mediaInfoConverter;
    private final tls onAction;
    private final sls onClose;
    private final bho0 state;

    public ScootersRideFinishPersonalGoalsModalView(Context context, tse tseVar, ytz ytzVar, e eVar, sls slsVar, tls tlsVar, bho0 bho0Var) {
        super(context);
        this.coroutineScope = tseVar;
        this.lottieLoader = ytzVar;
        this.mediaInfoConverter = eVar;
        this.onClose = slsVar;
        this.onAction = tlsVar;
        this.state = bho0Var;
    }

    private final void bindState() {
        getBinding().h.setText(this.state.a);
        GoLinearLayout goLinearLayout = getBinding().f;
        CharSequence charSequence = this.state.b;
        goLinearLayout.setVisibility((charSequence == null || evu0.J(charSequence)) ? 8 : 0);
        getBinding().g.setText(this.state.b);
        CharSequence charSequence2 = this.state.e;
        boolean z = charSequence2 == null || evu0.J(charSequence2);
        getBinding().b.setVisibility(z ? 8 : 0);
        if (z) {
            return;
        }
        getBinding().b.setAccent(true);
        getBinding().b.setText(this.state.e);
        getBinding().b.setDebounceClickListener(new v3n0(23, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindState$lambda$0(ScootersRideFinishPersonalGoalsModalView scootersRideFinishPersonalGoalsModalView) {
        scootersRideFinishPersonalGoalsModalView.onAction.invoke(scootersRideFinishPersonalGoalsModalView.state.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 insetsType$lambda$0(ScootersRideFinishPersonalGoalsModalView scootersRideFinishPersonalGoalsModalView, int i, t1w t1wVar) {
        scootersRideFinishPersonalGoalsModalView.setPadding(scootersRideFinishPersonalGoalsModalView.getPaddingLeft(), t1wVar.b, scootersRideFinishPersonalGoalsModalView.getPaddingRight(), scootersRideFinishPersonalGoalsModalView.getPaddingBottom());
        ButtonComponent buttonComponent = scootersRideFinishPersonalGoalsModalView.getBinding().b;
        ViewGroup.LayoutParams layoutParams = buttonComponent.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = i + t1wVar.g;
        buttonComponent.setLayoutParams(marginLayoutParams);
        return zy11.a;
    }

    private final void loadAnimation() {
        String str = this.state.d;
        if (str != null) {
            ScootersRideFinishPersonalGoalsModalView$loadAnimation$1 scootersRideFinishPersonalGoalsModalView$loadAnimation$1 = new ScootersRideFinishPersonalGoalsModalView$loadAnimation$1(this, ScootersRideFinishPersonalGoalsModalView.class, "animationDeferred", "getAnimationDeferred()Lkotlinx/coroutines/Deferred;", 0);
            l8x l8xVar = (l8x) scootersRideFinishPersonalGoalsModalView$loadAnimation$1.get();
            scootersRideFinishPersonalGoalsModalView$loadAnimation$1.i(null);
            if (l8xVar != null) {
                l8xVar.a(null);
            }
            this.animationDeferred = tje.h(this.coroutineScope, null, null, new ScootersRideFinishPersonalGoalsModalView$loadAnimation$2(this, str, null), 3);
        }
    }

    private final void loadImage() {
        if (this.state.c != null) {
            l8x l8xVar = this.imageJob;
            if (l8xVar != null) {
                l8xVar.a(null);
            }
            this.imageJob = tje.N(this.coroutineScope, null, null, new ScootersRideFinishPersonalGoalsModalView$loadImage$1(this, null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(ScootersRideFinishPersonalGoalsModalView scootersRideFinishPersonalGoalsModalView, View view) {
        scootersRideFinishPersonalGoalsModalView.onClose.invoke();
    }

    private final void startAnimation() {
        ScootersRideFinishPersonalGoalsModalView$startAnimation$1 scootersRideFinishPersonalGoalsModalView$startAnimation$1 = new ScootersRideFinishPersonalGoalsModalView$startAnimation$1(this, ScootersRideFinishPersonalGoalsModalView.class, "animationJob", "getAnimationJob()Lkotlinx/coroutines/Job;", 0);
        l8x l8xVar = (l8x) scootersRideFinishPersonalGoalsModalView$startAnimation$1.get();
        scootersRideFinishPersonalGoalsModalView$startAnimation$1.i(null);
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        this.animationJob = tje.N(this.coroutineScope, null, null, new ScootersRideFinishPersonalGoalsModalView$startAnimation$2(this, null), 3);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public sso0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(qrh0.scooters_ride_finish_sharing_personal_goals_modal_view, parent, false);
        int i = pfh0.action_button;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            i = pfh0.background_view;
            if (((GoView) cma1.O(i, inflate)) != null) {
                i = pfh0.close_button;
                CloseButtonIconComponent closeButtonIconComponent = (CloseButtonIconComponent) cma1.O(i, inflate);
                if (closeButtonIconComponent != null) {
                    GoConstraintLayout goConstraintLayout = (GoConstraintLayout) inflate;
                    i = pfh0.graphic_anchor;
                    if (((GoView) cma1.O(i, inflate)) != null) {
                        i = pfh0.graphic_overflow_anchor;
                        if (((GoView) cma1.O(i, inflate)) != null) {
                            i = pfh0.image_view;
                            GoImageView goImageView = (GoImageView) cma1.O(i, inflate);
                            if (goImageView != null) {
                                i = pfh0.lottie_animation_view;
                                LottieAnimationView lottieAnimationView = (LottieAnimationView) cma1.O(i, inflate);
                                if (lottieAnimationView != null) {
                                    i = pfh0.subtitle_container;
                                    GoLinearLayout goLinearLayout = (GoLinearLayout) cma1.O(i, inflate);
                                    if (goLinearLayout != null) {
                                        i = pfh0.subtitle_text_view;
                                        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                                        if (robotoTextView != null) {
                                            i = pfh0.title_text_view;
                                            RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                                            if (robotoTextView2 != null) {
                                                return new sso0(goConstraintLayout, buttonComponent, closeButtonIconComponent, goImageView, lottieAnimationView, goLinearLayout, robotoTextView, robotoTextView2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new w130(2, new is8(this, ((ViewGroup.MarginLayoutParams) getBinding().b.getLayoutParams()).bottomMargin, 13));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isApplyShadow */
    public boolean getIsCollapsable() {
        return false;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isArrowsPermanentlyHidden */
    public boolean getWithCloseButton() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onAppearAnimationComplete() {
        super.onAppearAnimationComplete();
        startAnimation();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getBottomSheet().setBackground(null);
        getBinding().c.setOnClickListener(new eaj0(9, this));
        loadImage();
        bindState();
        loadAnimation();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ScootersRideFinishPersonalGoalsModalView$onDetachedFromWindow$1 scootersRideFinishPersonalGoalsModalView$onDetachedFromWindow$1 = new ScootersRideFinishPersonalGoalsModalView$onDetachedFromWindow$1(this, ScootersRideFinishPersonalGoalsModalView.class, "imageJob", "getImageJob()Lkotlinx/coroutines/Job;", 0);
        l8x l8xVar = (l8x) scootersRideFinishPersonalGoalsModalView$onDetachedFromWindow$1.get();
        scootersRideFinishPersonalGoalsModalView$onDetachedFromWindow$1.i(null);
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        ScootersRideFinishPersonalGoalsModalView$onDetachedFromWindow$2 scootersRideFinishPersonalGoalsModalView$onDetachedFromWindow$2 = new ScootersRideFinishPersonalGoalsModalView$onDetachedFromWindow$2(this, ScootersRideFinishPersonalGoalsModalView.class, "animationJob", "getAnimationJob()Lkotlinx/coroutines/Job;", 0);
        l8x l8xVar2 = (l8x) scootersRideFinishPersonalGoalsModalView$onDetachedFromWindow$2.get();
        scootersRideFinishPersonalGoalsModalView$onDetachedFromWindow$2.i(null);
        if (l8xVar2 != null) {
            l8xVar2.a(null);
        }
        ScootersRideFinishPersonalGoalsModalView$onDetachedFromWindow$3 scootersRideFinishPersonalGoalsModalView$onDetachedFromWindow$3 = new ScootersRideFinishPersonalGoalsModalView$onDetachedFromWindow$3(this, ScootersRideFinishPersonalGoalsModalView.class, "animationDeferred", "getAnimationDeferred()Lkotlinx/coroutines/Deferred;", 0);
        l8x l8xVar3 = (l8x) scootersRideFinishPersonalGoalsModalView$onDetachedFromWindow$3.get();
        scootersRideFinishPersonalGoalsModalView$onDetachedFromWindow$3.i(null);
        if (l8xVar3 != null) {
            l8xVar3.a(null);
        }
    }
}
