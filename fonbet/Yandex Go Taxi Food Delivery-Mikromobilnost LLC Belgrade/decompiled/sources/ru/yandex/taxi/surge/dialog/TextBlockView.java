package ru.yandex.taxi.surge.dialog;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.design.view.GoImageView;
import defpackage.auy0;
import defpackage.bdc;
import defpackage.bwi;
import defpackage.cma1;
import defpackage.dv31;
import defpackage.g18;
import defpackage.h8;
import defpackage.i3y;
import defpackage.kky0;
import defpackage.kok0;
import defpackage.lky0;
import defpackage.mky0;
import defpackage.mrg0;
import defpackage.nky0;
import defpackage.ny61;
import defpackage.oew0;
import defpackage.oky0;
import defpackage.pky0;
import defpackage.pry0;
import defpackage.rky0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tsg0;
import defpackage.uiy0;
import defpackage.vw0;
import defpackage.w511;
import defpackage.wd2;
import defpackage.xng0;
import defpackage.y7x0;
import defpackage.yrh0;
import defpackage.zfh0;
import defpackage.zy11;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.DividerAwareComponent;
import ru.yandex.taxi.design.ellipsize.TextMiddleEllipsizer$EllipsizingMode;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\u000f¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f0\u000f¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u000eJ\u0019\u0010\u0019\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\f2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\fH\u0002¢\u0006\u0004\b&\u0010'J\u0019\u0010*\u001a\u00020\f2\b\u0010)\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010/\u001a\u00020.2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\f2\u0006\u00101\u001a\u00020(H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\f2\u0006\u00101\u001a\u00020(H\u0002¢\u0006\u0004\b4\u00103J\u001b\u00106\u001a\u00020\f*\u0002052\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\n0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001b\u0010C\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001b\u0010H\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010@\u001a\u0004\bF\u0010GR\u001b\u0010M\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010@\u001a\u0004\bK\u0010LR\u001b\u0010R\u001a\u00020N8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010@\u001a\u0004\bP\u0010QR\"\u0010S\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f0\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\"\u0010U\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010TR\u0018\u0010V\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010W¨\u0006X"}, d2 = {"Lru/yandex/taxi/surge/dialog/TextBlockView;", "Lru/yandex/taxi/design/DividerAwareComponent;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Llky0;", ClidProvider.STATE, "Lzy11;", "render", "(Llky0;)V", "Lkotlin/Function1;", "Lnky0;", "onClickListener", "setOnSelectorClickListener", "(Ltls;)V", "Lkky0;", "setBlockClickListener", "updateMargins", "Lpky0;", "trail", "renderTrail", "(Lpky0;)V", "selector", "renderSelectorTrail", "(Lnky0;)V", "Loky0;", "trailText", "renderTextTrail", "(Loky0;)V", "Lmky0;", "trailIcon", "renderTrailIcon", "(Lmky0;)V", "hideTrail", "()V", "", "trailLayoutPriority", "updateLayout", "(Ljava/lang/Boolean;)V", "Landroid/view/View;", "view", "Lg18;", "runRotationAnimation", "(Landroid/view/View;)Lg18;", "hasPriority", "updateCenterLayoutParams", "(Z)V", "updateTrailLayoutParams", "Landroid/view/ViewGroup;", "replaceView", "(Landroid/view/ViewGroup;Landroid/view/View;)V", "Lrky0;", "binding", "Lrky0;", "Ldv31;", "stateHolder", "Ldv31;", "Lru/yandex/taxi/design/ButtonComponent;", "selectorView$delegate", "Li3y;", "getSelectorView", "()Lru/yandex/taxi/design/ButtonComponent;", "selectorView", "Lru/yandex/taxi/widget/RobotoTextView;", "trailTextView$delegate", "getTrailTextView", "()Lru/yandex/taxi/widget/RobotoTextView;", "trailTextView", "Lcom/yandex/go/design/view/GoImageView;", "trailIconView$delegate", "getTrailIconView", "()Lcom/yandex/go/design/view/GoImageView;", "trailIconView", "Lpry0;", "textMiddleEllipsizer$delegate", "getTextMiddleEllipsizer", "()Lpry0;", "textMiddleEllipsizer", "onBlockClickListener", "Ltls;", "onSelectorClickListener", "animationCancellable", "Lg18;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextBlockView extends DividerAwareComponent {
    private g18 animationCancellable;
    private final rky0 binding;
    private tls onBlockClickListener;
    private tls onSelectorClickListener;

    /* renamed from: selectorView$delegate, reason: from kotlin metadata */
    private final i3y selectorView;
    private final dv31 stateHolder;

    /* renamed from: textMiddleEllipsizer$delegate, reason: from kotlin metadata */
    private final i3y textMiddleEllipsizer;

    /* renamed from: trailIconView$delegate, reason: from kotlin metadata */
    private final i3y trailIconView;

    /* renamed from: trailTextView$delegate, reason: from kotlin metadata */
    private final i3y trailTextView;

    public TextBlockView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View inflate = LayoutInflater.from(context).inflate(yrh0.text_block_view, (ViewGroup) this, false);
        addView(inflate);
        int i2 = zfh0.center_layout;
        LinearLayout linearLayout = (LinearLayout) cma1.O(i2, inflate);
        if (linearLayout != null) {
            i2 = zfh0.chevron;
            GoImageView goImageView = (GoImageView) cma1.O(i2, inflate);
            if (goImageView != null) {
                i2 = zfh0.icon;
                ImageView imageView = (ImageView) cma1.O(i2, inflate);
                if (imageView != null) {
                    i2 = zfh0.subtitle;
                    RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, inflate);
                    if (robotoTextView != null) {
                        i2 = zfh0.title;
                        RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i2, inflate);
                        if (robotoTextView2 != null) {
                            i2 = zfh0.trail;
                            FrameLayout frameLayout = (FrameLayout) cma1.O(i2, inflate);
                            if (frameLayout != null) {
                                this.binding = new rky0((ConstraintLayout) inflate, linearLayout, goImageView, imageView, robotoTextView, robotoTextView2, frameLayout);
                                this.stateHolder = new vw0(this, this, context);
                                kok0 kok0Var = new kok0(context, 14);
                                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
                                this.selectorView = kotlin.a.b(lazyThreadSafetyMode, kok0Var);
                                this.trailTextView = kotlin.a.b(lazyThreadSafetyMode, new kok0(context, 15));
                                int i3 = 16;
                                this.trailIconView = kotlin.a.b(lazyThreadSafetyMode, new kok0(context, i3));
                                this.textMiddleEllipsizer = kotlin.a.a(new oew0(i3, this));
                                this.onBlockClickListener = new uiy0(3);
                                this.onSelectorClickListener = new uiy0(4);
                                return;
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    private final ButtonComponent getSelectorView() {
        return (ButtonComponent) this.selectorView.getValue();
    }

    private final pry0 getTextMiddleEllipsizer() {
        return (pry0) this.textMiddleEllipsizer.getValue();
    }

    private final GoImageView getTrailIconView() {
        return (GoImageView) this.trailIconView.getValue();
    }

    private final RobotoTextView getTrailTextView() {
        return (RobotoTextView) this.trailTextView.getValue();
    }

    private final void hideTrail() {
        this.binding.g.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onBlockClickListener$lambda$0(kky0 kky0Var) {
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onSelectorClickListener$lambda$0(nky0 nky0Var) {
        return zy11.a;
    }

    private final void renderSelectorTrail(nky0 selector) {
        rky0 rky0Var = this.binding;
        ButtonComponent selectorView = getSelectorView();
        selectorView.setText(selector.c);
        selectorView.setDebounceClickListener(new y7x0(19, this, selector));
        selectorView.setButtonBackground(selector.i);
        selectorView.setButtonTitleColor(selector.j);
        replaceView(rky0Var.g, getSelectorView());
        rky0Var.g.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderSelectorTrail$lambda$0$0$0(TextBlockView textBlockView, nky0 nky0Var) {
        textBlockView.onSelectorClickListener.invoke(nky0Var);
    }

    private final void renderTextTrail(oky0 trailText) {
        rky0 rky0Var = this.binding;
        replaceView(rky0Var.g, getTrailTextView());
        rky0Var.g.setVisibility(0);
        OneShotPreDrawListener.add(getTrailTextView(), new y7x0(20, trailText, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderTextTrail$lambda$0$0(oky0 oky0Var, TextBlockView textBlockView) {
        boolean z = oky0Var.a;
        CharSequence charSequence = oky0Var.b;
        if (!z) {
            pry0 textMiddleEllipsizer = textBlockView.getTextMiddleEllipsizer();
            textMiddleEllipsizer.getClass();
            charSequence = textMiddleEllipsizer.a(charSequence, TextMiddleEllipsizer$EllipsizingMode.CUSTOM_ELLIPSE);
        }
        textBlockView.getTrailTextView().setText(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderTrail(pky0 trail) {
        updateLayout(trail != null ? Boolean.valueOf(trail.a) : null);
        if (trail instanceof nky0) {
            renderSelectorTrail((nky0) trail);
            return;
        }
        if (trail instanceof oky0) {
            renderTextTrail((oky0) trail);
            return;
        }
        if (trail instanceof mky0) {
            renderTrailIcon((mky0) trail);
        } else if (trail == null) {
            hideTrail();
        } else {
            w511.b();
        }
    }

    private final void renderTrailIcon(mky0 trailIcon) {
        rky0 rky0Var = this.binding;
        replaceView(rky0Var.g, getTrailIconView());
        rky0Var.g.setVisibility(0);
        getTrailIconView().setImageDrawable(trailIcon.b);
    }

    private final void replaceView(ViewGroup viewGroup, View view) {
        if (viewGroup.getChildCount() == 1) {
            h8 h8Var = new h8(3, viewGroup);
            if (!h8Var.hasNext()) {
                w511.i("Sequence is empty.");
                return;
            } else if (h8Var.next() == view) {
                if (viewGroup.getChildCount() == 0) {
                    viewGroup.addView(view, -1, -1);
                    return;
                }
                return;
            }
        }
        viewGroup.removeAllViews();
        viewGroup.addView(view, -1, -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g18 runRotationAnimation(View view) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, -360.0f);
        ofFloat.setDuration(4000L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setRepeatCount(-1);
        ofFloat.addUpdateListener(new wd2(view, 14));
        ofFloat.start();
        return new bwi(3, ofFloat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runRotationAnimation$lambda$0$0(View view, ValueAnimator valueAnimator) {
        view.setRotation(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runRotationAnimation$lambda$1(ValueAnimator valueAnimator) {
        valueAnimator.removeAllUpdateListeners();
        valueAnimator.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ButtonComponent selectorView_delegate$lambda$0(Context context) {
        ButtonComponent buttonComponent = new ButtonComponent(context, null, 0, 6, null);
        buttonComponent.setTextSize(0, tje.r(mrg0.component_text_size_caption, buttonComponent.getContext()));
        buttonComponent.setButtonSize(0);
        buttonComponent.setButtonTitleColor(new bdc(xng0.textOnControlMinor));
        buttonComponent.setButtonBackground(new bdc(xng0.controlMinor));
        return buttonComponent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pry0 textMiddleEllipsizer_delegate$lambda$0(TextBlockView textBlockView) {
        return new pry0(new auy0(textBlockView.getTrailTextView()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GoImageView trailIconView_delegate$lambda$0(Context context) {
        GoImageView goImageView = new GoImageView(context, null, 0, 6, null);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        goImageView.setPadding(tje.u(0, goImageView.getContext()), tje.u(12, goImageView.getContext()), tje.u(0, goImageView.getContext()), tje.u(12, goImageView.getContext()));
        goImageView.setLayoutParams(marginLayoutParams);
        goImageView.setScaleType(ImageView.ScaleType.FIT_END);
        return goImageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RobotoTextView trailTextView_delegate$lambda$0(Context context) {
        RobotoTextView robotoTextView = new RobotoTextView(context, null, 0, 6, null);
        robotoTextView.setTextSize(0, tje.r(mrg0.component_text_size_caption, robotoTextView.getContext()));
        robotoTextView.setTextColor(new bdc(xng0.textMinor));
        robotoTextView.setTextAlignment(6);
        robotoTextView.setMaxLines(1);
        return robotoTextView;
    }

    private final void updateCenterLayoutParams(boolean hasPriority) {
        rky0 rky0Var = this.binding;
        LinearLayout linearLayout = rky0Var.b;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).width = hasPriority ? -2 : 0;
        layoutParams2.endToStart = hasPriority ? -1 : rky0Var.g.getId();
        linearLayout.setLayoutParams(layoutParams2);
    }

    private final void updateLayout(Boolean trailLayoutPriority) {
        if (trailLayoutPriority != null) {
            updateCenterLayoutParams(!trailLayoutPriority.booleanValue());
            updateTrailLayoutParams(trailLayoutPriority.booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateMargins(lky0 state) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        if (state.k != null) {
            int r = tje.r(tsg0.gradient_component_horizontal_margin, getContext());
            marginLayoutParams.setMarginStart(r);
            marginLayoutParams.setMarginEnd(r);
            marginLayoutParams.topMargin = state.n ? tje.u(12, getContext()) : 0;
            marginLayoutParams.bottomMargin = (state.m ? tje.r(tsg0.gradient_component_bottom_margin, getContext()) : 0) + (state.o ? tje.u(4, getContext()) : 0);
        } else {
            marginLayoutParams.setMarginStart(0);
            marginLayoutParams.setMarginEnd(0);
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.bottomMargin = 0;
        }
        setLayoutParams(marginLayoutParams);
    }

    private final void updateTrailLayoutParams(boolean hasPriority) {
        rky0 rky0Var = this.binding;
        FrameLayout frameLayout = rky0Var.g;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).width = hasPriority ? -2 : 0;
        layoutParams2.startToEnd = hasPriority ? -1 : rky0Var.b.getId();
        frameLayout.setLayoutParams(layoutParams2);
    }

    public final void render(lky0 state) {
        this.stateHolder.g(state, false, false);
    }

    public final void setBlockClickListener(tls onClickListener) {
        this.onBlockClickListener = onClickListener;
    }

    public final void setOnSelectorClickListener(tls onClickListener) {
        this.onSelectorClickListener = onClickListener;
    }

    public TextBlockView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public TextBlockView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ TextBlockView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
