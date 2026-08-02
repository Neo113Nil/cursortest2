package ru.yandex.taxi.design;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.agh0;
import defpackage.g4i0;
import defpackage.g8e;
import defpackage.jst;
import defpackage.k4o;
import defpackage.kdc;
import defpackage.mqg0;
import defpackage.nwy0;
import defpackage.qje;
import defpackage.s8o;
import defpackage.tje;
import defpackage.uh6;
import defpackage.usg0;
import defpackage.vf2;
import defpackage.w511;
import defpackage.xng0;
import defpackage.xw31;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.animation.BaseAnimatorListener;
import ru.yandex.taxi.design.DialogueComponent;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewRounded$1;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewTopRounded$1;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0003xyzB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\f2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\r\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001aJ\r\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u001dJ\u001f\u0010!\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H\u0014¢\u0006\u0004\b!\u0010\"J7\u0010)\u001a\u00020\f2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0007H\u0014¢\u0006\u0004\b)\u0010*J)\u0010/\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u00072\b\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\f2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\fH\u0014¢\u0006\u0004\b5\u0010\u001dJ\u0017\u00107\u001a\u00020\f2\u0006\u00106\u001a\u00020\u0007H\u0002¢\u0006\u0004\b7\u0010\u0012J\u000f\u00108\u001a\u00020\fH\u0002¢\u0006\u0004\b8\u0010\u001dJ\u000f\u00109\u001a\u00020\fH\u0002¢\u0006\u0004\b9\u0010\u001dJ\u000f\u0010:\u001a\u00020\fH\u0002¢\u0006\u0004\b:\u0010\u001dJ\u000f\u0010;\u001a\u00020\fH\u0002¢\u0006\u0004\b;\u0010\u001dJ\u000f\u0010<\u001a\u00020\fH\u0002¢\u0006\u0004\b<\u0010\u001dJ\u000f\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010B\u001a\u00020A2\u0006\u0010@\u001a\u00020\u0007H\u0002¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\u00020D2\u0006\u0010@\u001a\u00020\u0007H\u0002¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\fH\u0002¢\u0006\u0004\bG\u0010\u001dR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010N\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010Q\u001a\u00020P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010S\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010OR\u0014\u0010T\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010OR*\u0010U\u001a\u00020\u00072\u0006\u0010@\u001a\u00020\u00078\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bU\u0010O\u001a\u0004\bV\u0010W\"\u0004\bX\u0010\u0012R*\u0010Y\u001a\u00020#2\u0006\u0010@\u001a\u00020#8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R*\u0010_\u001a\u00020A2\u0006\u0010@\u001a\u00020A8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR*\u0010e\u001a\u00020D2\u0006\u0010@\u001a\u00020D8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u0018\u0010k\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010m\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010ZR\u0016\u0010n\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010ZR\u0016\u0010o\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u0016\u0010q\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010s\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010rR\u001c\u0010v\u001a\n u*\u0004\u0018\u00010t0t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010w¨\u0006{"}, d2 = {"Lru/yandex/taxi/design/DialogueComponent;", "Landroid/view/ViewGroup;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "color", "Lzy11;", "updateHeaderColor", "(Ljava/lang/Integer;)V", "Lkdc;", "(Lkdc;)V", "updateContentBackgroundColor", "(I)V", "Ljava/lang/Runnable;", "callback", "setAnimationScheduledCallback", "(Ljava/lang/Runnable;)V", "Landroid/view/View;", "view", "setContentView", "(Landroid/view/View;)V", "setHeaderView", "show", "()V", "hide", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "child", "index", "Landroid/view/ViewGroup$LayoutParams;", "params", "addView", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "onDetachedFromWindow", "topHeight", "measureTargetForAnimation", "applyThemeColors", "hideTopImmediately", "animateChangesChanged", "animationTypeChanged", "forceStopAnimation", "", "targetTranslation", "()F", "value", "Lru/yandex/taxi/design/DialogueComponent$AnimationType;", "animationTypeFromAttr", "(I)Lru/yandex/taxi/design/DialogueComponent$AnimationType;", "Lru/yandex/taxi/design/DialogueComponent$RoundedType;", "roundedTypeFromAttr", "(I)Lru/yandex/taxi/design/DialogueComponent$RoundedType;", "refreshItemRounding", "Lcom/yandex/go/design/view/GoFrameLayout;", "topHeaderContainer", "Lcom/yandex/go/design/view/GoFrameLayout;", "Landroid/widget/FrameLayout;", "contentContainer", "Landroid/widget/FrameLayout;", "defaultHeaderColor", CA20Status.STATUS_USER_I, "Lru/yandex/taxi/design/DialogueComponent$State;", ClidProvider.STATE, "Lru/yandex/taxi/design/DialogueComponent$State;", "lastMeasureHeaderSize", "CORNER_RADIUS_DEFAULT_RES_ID", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "getCornerRadius", "()I", "setCornerRadius", "animateChanges", "Z", "getAnimateChanges", "()Z", "setAnimateChanges", "(Z)V", "animationType", "Lru/yandex/taxi/design/DialogueComponent$AnimationType;", "getAnimationType", "()Lru/yandex/taxi/design/DialogueComponent$AnimationType;", "setAnimationType", "(Lru/yandex/taxi/design/DialogueComponent$AnimationType;)V", "roundedType", "Lru/yandex/taxi/design/DialogueComponent$RoundedType;", "getRoundedType", "()Lru/yandex/taxi/design/DialogueComponent$RoundedType;", "setRoundedType", "(Lru/yandex/taxi/design/DialogueComponent$RoundedType;)V", "animationScheduledCallback", "Ljava/lang/Runnable;", "waitToAnimationStart", "waitToAnimationEnd", "animatedView", "Landroid/view/View;", "fromTranslation", "F", "toTranslation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "dialogSlideAnimator", "Landroid/animation/ValueAnimator;", "State", "AnimationType", "RoundedType", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DialogueComponent extends ViewGroup implements nwy0 {
    public static final int $stable = 8;
    private final int CORNER_RADIUS_DEFAULT_RES_ID;
    private boolean animateChanges;
    private View animatedView;
    private Runnable animationScheduledCallback;
    private AnimationType animationType;
    private final FrameLayout contentContainer;
    private int cornerRadius;
    private int defaultHeaderColor;
    private final ValueAnimator dialogSlideAnimator;
    private float fromTranslation;
    private int lastMeasureHeaderSize;
    private RoundedType roundedType;
    private State state;
    private float toTranslation;
    private final GoFrameLayout topHeaderContainer;
    private boolean waitToAnimationEnd;
    private boolean waitToAnimationStart;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/design/DialogueComponent$AnimationType;", "", "NOTIFICATION_SLIDE_TOP", "CONTENT_SLIDE_BOTTOM", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class AnimationType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ AnimationType[] $VALUES;
        public static final AnimationType CONTENT_SLIDE_BOTTOM;
        public static final AnimationType NOTIFICATION_SLIDE_TOP;

        static {
            AnimationType animationType = new AnimationType("NOTIFICATION_SLIDE_TOP", 0);
            NOTIFICATION_SLIDE_TOP = animationType;
            AnimationType animationType2 = new AnimationType("CONTENT_SLIDE_BOTTOM", 1);
            CONTENT_SLIDE_BOTTOM = animationType2;
            AnimationType[] animationTypeArr = {animationType, animationType2};
            $VALUES = animationTypeArr;
            $ENTRIES = kotlin.enums.a.a(animationTypeArr);
        }

        public static AnimationType valueOf(String str) {
            return (AnimationType) Enum.valueOf(AnimationType.class, str);
        }

        public static AnimationType[] values() {
            return (AnimationType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/design/DialogueComponent$RoundedType;", "", "TOP", "FULL", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class RoundedType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ RoundedType[] $VALUES;
        public static final RoundedType FULL;
        public static final RoundedType TOP;

        static {
            RoundedType roundedType = new RoundedType("TOP", 0);
            TOP = roundedType;
            RoundedType roundedType2 = new RoundedType("FULL", 1);
            FULL = roundedType2;
            RoundedType[] roundedTypeArr = {roundedType, roundedType2};
            $VALUES = roundedTypeArr;
            $ENTRIES = kotlin.enums.a.a(roundedTypeArr);
        }

        public static RoundedType valueOf(String str) {
            return (RoundedType) Enum.valueOf(RoundedType.class, str);
        }

        public static RoundedType[] values() {
            return (RoundedType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/design/DialogueComponent$State;", "", "Normal", "Open", "AnimateClose", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State AnimateClose;
        public static final State Normal;
        public static final State Open;

        static {
            State state = new State("Normal", 0);
            Normal = state;
            State state2 = new State("Open", 1);
            Open = state2;
            State state3 = new State("AnimateClose", 2);
            AnimateClose = state3;
            State[] stateArr = {state, state2, state3};
            $VALUES = stateArr;
            $ENTRIES = kotlin.enums.a.a(stateArr);
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public DialogueComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        GoFrameLayout goFrameLayout = new GoFrameLayout(context, null, 0, 0, 14, null);
        goFrameLayout.setVisibility(8);
        addView(goFrameLayout);
        this.topHeaderContainer = goFrameLayout;
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout);
        this.contentContainer = frameLayout;
        this.defaultHeaderColor = getContext().getColor(mqg0.component_chrome_650);
        this.state = State.Normal;
        int i2 = usg0.dialogue_component_corner_radius;
        this.CORNER_RADIUS_DEFAULT_RES_ID = i2;
        this.cornerRadius = tje.r(i2, getContext());
        this.animateChanges = true;
        this.animationType = AnimationType.NOTIFICATION_SLIDE_TOP;
        this.roundedType = RoundedType.TOP;
        this.animatedView = goFrameLayout;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f));
        ofFloat.addUpdateListener(new vf2(3, this, ofFloat));
        ofFloat.addListener(new BaseAnimatorListener() { // from class: ru.yandex.taxi.design.DialogueComponent$dialogSlideAnimator$1$2
            @Override // ru.yandex.taxi.animation.BaseAnimatorListener, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                boolean z;
                DialogueComponent.State state;
                DialogueComponent.State state2;
                int i3;
                GoFrameLayout goFrameLayout2;
                Runnable runnable;
                super.onAnimationEnd(animation);
                z = DialogueComponent.this.waitToAnimationEnd;
                if (z) {
                    state = DialogueComponent.this.state;
                    DialogueComponent.State state3 = DialogueComponent.State.AnimateClose;
                    DialogueComponent dialogueComponent = DialogueComponent.this;
                    if (state == state3) {
                        runnable = dialogueComponent.animationScheduledCallback;
                        if (runnable != null) {
                            runnable.run();
                        }
                        DialogueComponent.this.hideTopImmediately();
                        return;
                    }
                    state2 = dialogueComponent.state;
                    if (state2 == DialogueComponent.State.Open) {
                        i3 = DialogueComponent.this.lastMeasureHeaderSize;
                        goFrameLayout2 = DialogueComponent.this.topHeaderContainer;
                        if (i3 != goFrameLayout2.getMeasuredHeight() - DialogueComponent.this.getCornerRadius()) {
                            DialogueComponent.this.requestLayout();
                        }
                    }
                }
            }
        });
        this.dialogSlideAnimator = ofFloat;
        goFrameLayout.setId(agh0.dialogue_component_header);
        frameLayout.setId(agh0.dialogue_component_content_container);
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, g4i0.DialogueComponent, i, 0);
        goFrameLayout.setBackgroundColor(this.defaultHeaderColor);
        setCornerRadius(obtainStyledAttributes.getDimensionPixelSize(g4i0.DialogueComponent_corner_radius, tje.r(i2, getContext())));
        setRoundedType(roundedTypeFromAttr(obtainStyledAttributes.getInt(g4i0.DialogueComponent_component_rounded_type, 0)));
        setAnimateChanges(obtainStyledAttributes.getBoolean(g4i0.DialogueComponent_animate_header, true));
        setAnimationType(animationTypeFromAttr(obtainStyledAttributes.getInt(g4i0.DialogueComponent_animation_type, 0)));
        obtainStyledAttributes.recycle();
        applyThemeColors();
        refreshItemRounding();
    }

    private final void animateChangesChanged() {
        forceStopAnimation();
        requestLayout();
    }

    private final void animationTypeChanged() {
        View view;
        forceStopAnimation();
        int i = e.a[this.animationType.ordinal()];
        if (i == 1) {
            view = this.topHeaderContainer;
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            view = this.contentContainer;
        }
        this.animatedView = view;
        requestLayout();
    }

    private final AnimationType animationTypeFromAttr(int value) {
        return value == 1 ? AnimationType.CONTENT_SLIDE_BOTTOM : AnimationType.NOTIFICATION_SLIDE_TOP;
    }

    private final void applyThemeColors() {
        this.contentContainer.setBackgroundColor(qje.t(xng0.bgMain, getContext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dialogSlideAnimator$lambda$0$0(DialogueComponent dialogueComponent, ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
        dialogueComponent.animatedView.setTranslationY(uh6.H(dialogueComponent.fromTranslation, dialogueComponent.toTranslation, valueAnimator.getAnimatedFraction()));
    }

    private final void forceStopAnimation() {
        this.waitToAnimationEnd = false;
        this.dialogSlideAnimator.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideTopImmediately() {
        this.state = State.Normal;
        this.topHeaderContainer.setVisibility(8);
        this.contentContainer.setTranslationY(0.0f);
        this.topHeaderContainer.setTranslationY(0.0f);
        requestLayout();
    }

    private final void measureTargetForAnimation(int topHeight) {
        int i = e.a[this.animationType.ordinal()];
        if (i == 1) {
            float translationY = this.lastMeasureHeaderSize - this.topHeaderContainer.getTranslationY();
            if (this.lastMeasureHeaderSize <= topHeight || translationY <= topHeight) {
                this.lastMeasureHeaderSize = topHeight;
                this.topHeaderContainer.setTranslationY(topHeight - translationY);
                return;
            } else {
                this.lastMeasureHeaderSize = (int) translationY;
                this.topHeaderContainer.setTranslationY(0.0f);
                return;
            }
        }
        if (i != 2) {
            w511.b();
            return;
        }
        float translationY2 = this.contentContainer.getTranslationY() + this.lastMeasureHeaderSize;
        if (this.lastMeasureHeaderSize <= topHeight || translationY2 <= topHeight) {
            this.lastMeasureHeaderSize = topHeight;
            this.contentContainer.setTranslationY(translationY2 - topHeight);
        } else {
            this.lastMeasureHeaderSize = (int) translationY2;
            this.contentContainer.setTranslationY(0.0f);
        }
    }

    private final void refreshItemRounding() {
        xw31.y(this.cornerRadius, this.topHeaderContainer);
        GoFrameLayout goFrameLayout = this.topHeaderContainer;
        goFrameLayout.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewTopRounded$1(this.cornerRadius));
        goFrameLayout.setClipToOutline(true);
        int i = e.c[this.roundedType.ordinal()];
        if (i == 1) {
            FrameLayout frameLayout = this.contentContainer;
            frameLayout.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewTopRounded$1(this.cornerRadius));
            frameLayout.setClipToOutline(true);
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            FrameLayout frameLayout2 = this.contentContainer;
            frameLayout2.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewRounded$1(this.cornerRadius));
            frameLayout2.setClipToOutline(true);
        }
    }

    private final RoundedType roundedTypeFromAttr(int value) {
        return value == 1 ? RoundedType.FULL : RoundedType.TOP;
    }

    private final float targetTranslation() {
        int i = e.b[this.state.ordinal()];
        if (i == 1) {
            int i2 = e.a[this.animationType.ordinal()];
            if (i2 == 1) {
                return this.lastMeasureHeaderSize - (this.topHeaderContainer.getMeasuredHeight() - this.cornerRadius);
            }
            if (i2 == 2) {
                return (this.topHeaderContainer.getMeasuredHeight() - this.cornerRadius) - this.lastMeasureHeaderSize;
            }
            w511.b();
            return 0.0f;
        }
        if (i != 2) {
            return this.toTranslation;
        }
        int i3 = e.a[this.animationType.ordinal()];
        if (i3 == 1) {
            return this.lastMeasureHeaderSize;
        }
        if (i3 == 2) {
            return -this.lastMeasureHeaderSize;
        }
        w511.b();
        return 0.0f;
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        if (getChildCount() < 2) {
            super.addView(child, index, params);
            return;
        }
        if (this.topHeaderContainer.getChildCount() == 0) {
            this.topHeaderContainer.addView(child, params);
        } else if (this.contentContainer.getChildCount() == 0) {
            this.contentContainer.addView(child, params);
        } else {
            g8e.A(jst.e, "Too much childs reached");
        }
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        applyThemeColors();
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    public final boolean getAnimateChanges() {
        return this.animateChanges;
    }

    public final AnimationType getAnimationType() {
        return this.animationType;
    }

    public final int getCornerRadius() {
        return this.cornerRadius;
    }

    public final RoundedType getRoundedType() {
        return this.roundedType;
    }

    public final void hide() {
        State state = this.state;
        State state2 = State.AnimateClose;
        if (state == state2 || state == State.Normal) {
            return;
        }
        boolean z = this.animateChanges;
        this.waitToAnimationStart = z;
        if (!z) {
            hideTopImmediately();
        } else {
            this.state = state2;
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        forceStopAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l, int t, int r, int b) {
        int i = b - t;
        int i2 = r - l;
        if (this.state == State.Normal) {
            this.contentContainer.layout(0, 0, i2, i);
            return;
        }
        int i3 = this.lastMeasureHeaderSize;
        this.topHeaderContainer.layout(0, 0, i2, this.cornerRadius + i3);
        this.contentContainer.layout(0, i3, i2, i);
        if (this.animateChanges && this.waitToAnimationStart) {
            this.waitToAnimationStart = false;
            forceStopAnimation();
            this.fromTranslation = this.animatedView.getTranslationY();
            this.toTranslation = targetTranslation();
            this.waitToAnimationEnd = true;
            this.dialogSlideAnimator.start();
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.state == State.Normal) {
            this.lastMeasureHeaderSize = 0;
            this.contentContainer.measure(widthMeasureSpec, heightMeasureSpec);
            setMeasuredDimension(this.contentContainer.getMeasuredWidthAndState(), this.contentContainer.getMeasuredHeightAndState());
            return;
        }
        int size = View.MeasureSpec.getSize(heightMeasureSpec);
        int mode = View.MeasureSpec.getMode(heightMeasureSpec);
        this.topHeaderContainer.measure(widthMeasureSpec, mode == 1073741824 ? View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE) : heightMeasureSpec);
        int measuredHeight = this.topHeaderContainer.getMeasuredHeight() - this.cornerRadius;
        if (!this.animateChanges) {
            this.lastMeasureHeaderSize = measuredHeight;
            this.contentContainer.setTranslationY(0.0f);
            this.topHeaderContainer.setTranslationY(0.0f);
        } else if (this.lastMeasureHeaderSize != measuredHeight) {
            measureTargetForAnimation(measuredHeight);
            this.waitToAnimationStart = true;
            Runnable runnable = this.animationScheduledCallback;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.contentContainer.measure(widthMeasureSpec, mode != 0 ? View.MeasureSpec.makeMeasureSpec(size - this.lastMeasureHeaderSize, mode) : heightMeasureSpec);
        int combineMeasuredStates = View.combineMeasuredStates(this.topHeaderContainer.getMeasuredState(), this.contentContainer.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(this.topHeaderContainer.getMeasuredWidth(), this.contentContainer.getMeasuredWidth()), widthMeasureSpec, combineMeasuredStates), View.resolveSizeAndState(this.contentContainer.getMeasuredHeight() + this.lastMeasureHeaderSize, heightMeasureSpec, combineMeasuredStates << 16));
    }

    public final void setAnimateChanges(boolean z) {
        if (this.animateChanges == z) {
            return;
        }
        this.animateChanges = z;
        animateChangesChanged();
    }

    public final void setAnimationScheduledCallback(Runnable callback) {
        this.animationScheduledCallback = callback;
    }

    public final void setAnimationType(AnimationType animationType) {
        if (this.animationType == animationType) {
            return;
        }
        this.animationType = animationType;
        animationTypeChanged();
    }

    public final void setContentView(View view) {
        this.contentContainer.removeAllViews();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        view.setLayoutParams(layoutParams);
        this.contentContainer.addView(view);
    }

    public final void setCornerRadius(int i) {
        if (this.cornerRadius == i) {
            return;
        }
        this.cornerRadius = i;
        refreshItemRounding();
        invalidate();
    }

    public final void setHeaderView(View view) {
        this.topHeaderContainer.removeAllViews();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        view.setLayoutParams(layoutParams);
        this.topHeaderContainer.addView(view);
    }

    public final void setRoundedType(RoundedType roundedType) {
        if (this.roundedType == roundedType) {
            return;
        }
        this.roundedType = roundedType;
        refreshItemRounding();
        invalidate();
    }

    public final void show() {
        State state = this.state;
        State state2 = State.Open;
        if (state == state2) {
            return;
        }
        this.state = state2;
        this.topHeaderContainer.setVisibility(0);
        this.waitToAnimationStart = this.animateChanges;
        requestLayout();
    }

    public final void updateContentBackgroundColor(int color) {
        this.contentContainer.setBackgroundColor(color);
    }

    public final void updateHeaderColor(kdc color) {
        this.topHeaderContainer.setBackgroundColor(color != null ? s8o.m(color, getContext()) : this.defaultHeaderColor);
    }

    public final void updateHeaderColor(Integer color) {
        this.topHeaderContainer.setBackgroundColor(color != null ? color.intValue() : this.defaultHeaderColor);
    }

    public DialogueComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public DialogueComponent(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ DialogueComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
