package com.squareup.cash.reactions.views;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import androidx.camera.view.ScreenFlashView;
import androidx.core.splashscreen.SplashScreen$Impl$setOnExitAnimationListener$2;
import androidx.media3.ui.DefaultTimeBar$$ExternalSyntheticLambda1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.CircularProgressDrawable;
import app.cash.broadway.ui.Ui;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.knotapi.knot.ui.views.KnotSpinnerView$$ExternalSyntheticLambda3;
import com.squareup.cash.R;
import com.squareup.cash.blockers.views.FormBlockerView$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.ReactionConfig;
import com.squareup.cash.overlays.Overlay;
import com.squareup.cash.overlays.OverlayLayer;
import com.squareup.cash.overlays.OverlaysKt;
import com.squareup.cash.reactions.viewmodels.ReactionViewEvent;
import com.squareup.cash.reactions.viewmodels.ReactionViewModel;
import com.squareup.cash.savings.views.ButtonGroupKt$$ExternalSyntheticLambda11;
import com.squareup.cash.sheet.BottomSheet;
import com.squareup.cash.storage.RealSandboxer$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.OnBackListener;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.scannerview.OverlayView$setOverlayType$$inlined$doOnEnd$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class ChooseReactionOverlay extends ViewGroup implements Overlay {
    public int activeReactionAnimations;
    public final int activityItemSidePadding;
    public final ChooseReactionOverlay asView;
    public final FormBlockerView$$ExternalSyntheticLambda0 backListener;
    public ChooseReactionDialog dialog;
    public Ui.EventReceiver eventReceiver;
    public final Function0 onDismiss;
    public ValueAnimator pendingAnimation;
    public final int reactionDialogMargin;
    public final int reactionHoverOffset;
    public final int reactionViewSize;
    public final ArrayList reactionViews;
    public BottomSheet sheet;
    public OverlayLayer.Session sheetOverlaySession;
    public State state;
    public final RealCashVibrator vibrator;
    public ViewContext viewContext;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class State {
        public static final /* synthetic */ State[] $VALUES;
        public static final State AcceptingInput;
        public static final State AnimatingClosed;
        public static final State SubmittingReaction;
        public static final State WaitingForInput;

        static {
            State state = new State("WaitingForInput", 0);
            WaitingForInput = state;
            State state2 = new State("AcceptingInput", 1);
            AcceptingInput = state2;
            State state3 = new State("SubmittingReaction", 2);
            SubmittingReaction = state3;
            State state4 = new State("AnimatingClosed", 3);
            AnimatingClosed = state4;
            $VALUES = new State[]{state, state2, state3, state4};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public final class ViewContext {
        public final Rect alignmentBounds;

        public ViewContext(Rect rect) {
            this.alignmentBounds = rect;
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            try {
                State state = State.WaitingForInput;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                State state2 = State.WaitingForInput;
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                State state3 = State.WaitingForInput;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                State state4 = State.WaitingForInput;
                iArr[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChooseReactionOverlay(Context context, RealCashVibrator realCashVibrator, Function0 function0) {
        super(context);
        context.getClass();
        this.vibrator = realCashVibrator;
        this.onDismiss = function0;
        this.reactionHoverOffset = context.getResources().getDimensionPixelOffset(R.dimen.reaction_hover_offset);
        this.reactionDialogMargin = context.getResources().getDimensionPixelOffset(R.dimen.reactions_dialog_margin);
        this.activityItemSidePadding = context.getResources().getDimensionPixelOffset(R.dimen.activity_item_padding_sides_tab);
        this.reactionViewSize = context.getResources().getDimensionPixelSize(R.dimen.reactions_view_default_size);
        ColorDrawable colorDrawable = new ColorDrawable(-16777216);
        colorDrawable.setAlpha(119);
        this.state = State.WaitingForInput;
        this.reactionViews = new ArrayList();
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setBackground(colorDrawable);
        this.asView = this;
        this.backListener = new FormBlockerView$$ExternalSyntheticLambda0(this, 1);
    }

    public static final void access$animateDialogIn(ChooseReactionOverlay chooseReactionOverlay, ChooseReactionDialog chooseReactionDialog) {
        chooseReactionDialog.setScaleX(0.8f);
        chooseReactionDialog.setScaleY(0.8f);
        chooseReactionDialog.setAlpha(RecyclerView.DECELERATION_RATE);
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(chooseReactionDialog, "scaleX", 1.0f);
        ofFloat.setInterpolator(new OvershootInterpolator());
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(chooseReactionDialog, "scaleY", 1.0f);
        ofFloat2.setInterpolator(new OvershootInterpolator());
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(chooseReactionDialog, "alpha", 1.0f);
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(RecyclerView.DECELERATION_RATE, 1.0f);
        ofFloat4.addUpdateListener(new DefaultTimeBar$$ExternalSyntheticLambda1(chooseReactionDialog, 16));
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        animatorSet.start();
    }

    @Override // com.squareup.cash.overlays.Overlay
    public final Animator exitAnimator() {
        return goToStateAnimator(State.AnimatingClosed);
    }

    @Override // com.squareup.cash.overlays.Overlay
    public final View getAsView() {
        return this.asView;
    }

    @Override // com.squareup.cash.overlays.Overlay
    public final OnBackListener getBackListener() {
        return this.backListener;
    }

    public final Animator goToStateAnimator(State state) {
        int ordinal = this.state.ordinal();
        if (ordinal == 0) {
            int ordinal2 = state.ordinal();
            if (ordinal2 == 1) {
                return setStateAnimator(state);
            }
            if (ordinal2 == 3) {
                return setCloseStateAnimator(state);
            }
            illegalTransition(state);
            throw null;
        }
        if (ordinal == 1) {
            int ordinal3 = state.ordinal();
            if (ordinal3 != 1) {
                if (ordinal3 == 2) {
                    return setStateAnimator(state);
                }
                if (ordinal3 != 3) {
                    illegalTransition(state);
                    throw null;
                }
            }
            return setStateAnimator(State.AcceptingInput);
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return setStateAnimator(State.AnimatingClosed);
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        if (WhenMappings.$EnumSwitchMapping$0[state.ordinal()] == 2) {
            return setCloseStateAnimator(state);
        }
        illegalTransition(state);
        throw null;
    }

    public final void illegalTransition(State state) {
        throw new IllegalArgumentException("Invalid state transition from " + this.state + " -> " + state);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        return this.state == State.AnimatingClosed;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ChooseReactionDialog chooseReactionDialog = this.dialog;
        if (chooseReactionDialog != null) {
            chooseReactionDialog.measure(View.MeasureSpec.makeMeasureSpec(getWidth() - (this.activityItemSidePadding * 2), PKIFailureInfo.systemUnavail), 0);
            int width = (getWidth() / 2) - (chooseReactionDialog.getMeasuredWidth() / 2);
            ViewContext viewContext = this.viewContext;
            Rect rect = viewContext != null ? viewContext.alignmentBounds : null;
            int i5 = viewContext != null ? this.reactionDialogMargin : 0;
            int measuredHeight = rect != null ? rect.centerY() < getHeight() / 2 ? rect.bottom + i5 : (rect.top - chooseReactionDialog.getMeasuredHeight()) - i5 : (getHeight() / 2) - (chooseReactionDialog.getMeasuredHeight() / 2);
            chooseReactionDialog.layout(width, measuredHeight, chooseReactionDialog.getMeasuredWidth() + width, chooseReactionDialog.getMeasuredHeight() + measuredHeight);
        }
        Iterator it = this.reactionViews.iterator();
        while (it.hasNext()) {
            ReactionView reactionView = (ReactionView) it.next();
            int i6 = this.reactionViewSize;
            reactionView.measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
            reactionView.layout(0, 0, reactionView.getMeasuredWidth(), reactionView.getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        if (this.state != State.AnimatingClosed && motionEvent.getActionMasked() == 1) {
            Ui.EventReceiver eventReceiver = this.eventReceiver;
            if (eventReceiver == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            }
            eventReceiver.sendEvent(ReactionViewEvent.ViewCloseRequested.INSTANCE);
        }
        return true;
    }

    public final ValueAnimator setCloseStateAnimator(State state) {
        ValueAnimator ofFloat;
        BottomSheet bottomSheet = this.sheet;
        if (bottomSheet != null) {
            ofFloat = ValueAnimator.ofFloat(bottomSheet.getY(), getHeight());
            ofFloat.getClass();
        } else {
            ofFloat = ValueAnimator.ofFloat(RecyclerView.DECELERATION_RATE, 1.0f);
            ofFloat.addUpdateListener(new KnotSpinnerView$$ExternalSyntheticLambda3(7, this, this));
        }
        ofFloat.addListener(new ScreenFlashView.AnonymousClass2(this, 3));
        ofFloat.addListener(new OverlayView$setOverlayType$$inlined$doOnEnd$1(this, state, ofFloat, 1));
        return ofFloat;
    }

    public final void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    public final void setModel(ReactionViewModel reactionViewModel) {
        List list;
        reactionViewModel.getClass();
        int i = 2;
        if (reactionViewModel instanceof ReactionViewModel.Loaded) {
            ReactionViewModel.Loaded loaded = (ReactionViewModel.Loaded) reactionViewModel;
            ReactionConfig reactionConfig = loaded.config;
            int i2 = (int) reactionConfig.maxEmojisPerReaction;
            if (i2 <= 0) {
                i2 = 3;
            }
            ReactionBuilder reactionBuilder = new ReactionBuilder(i2, new ButtonGroupKt$$ExternalSyntheticLambda11(this, 8), new RealSandboxer$$ExternalSyntheticLambda0(this, i));
            Context context = getContext();
            context.getClass();
            Ui.EventReceiver eventReceiver = this.eventReceiver;
            if (eventReceiver == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            }
            ChooseReactionDialog chooseReactionDialog = new ChooseReactionDialog(context, eventReceiver, reactionBuilder, loaded.availableReactions, (!loaded.showExtendedPicker || (list = reactionConfig.extendedReactions) == null || list.isEmpty()) ? false : true);
            addView(chooseReactionDialog);
            if (!isLaidOut() || isLayoutRequested()) {
                addOnLayoutChangeListener(new SplashScreen$Impl$setOnExitAnimationListener$2(4, this, chooseReactionDialog));
            } else {
                access$animateDialogIn(this, chooseReactionDialog);
            }
            this.dialog = chooseReactionDialog;
            return;
        }
        if (!(reactionViewModel instanceof ReactionViewModel.DisplayAdditional)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        List list2 = ((ReactionViewModel.DisplayAdditional) reactionViewModel).config.extendedReactions;
        if (list2 == null) {
            list2 = EmptyList.INSTANCE;
        }
        ChooseReactionDialog chooseReactionDialog2 = this.dialog;
        if (chooseReactionDialog2 == null) {
            a$$ExternalSyntheticBUOutline0.m$1("Dialog must exist to display sheet.");
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(chooseReactionDialog2, "y", getHeight());
        ofFloat.setInterpolator(new AccelerateInterpolator());
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(chooseReactionDialog2, "alpha", RecyclerView.DECELERATION_RATE);
        ofFloat2.setInterpolator(new AccelerateInterpolator());
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.start();
        Context context2 = getContext();
        context2.getClass();
        Context context3 = getContext();
        context3.getClass();
        BottomSheet bottomSheet = new BottomSheet(context2, new ChooseReactionSheet(context3, chooseReactionDialog2.reactionBuilder, list2), null, 60);
        this.sheet = bottomSheet;
        this.sheetOverlaySession = OverlaysKt.getOverlayLayer(this).show(bottomSheet);
        bottomSheet.setOnClickOutsideListener(new ChooseReactionOverlay$$ExternalSyntheticLambda4(this, 1));
    }

    public void setOnClickOutsideListener(Function0<Unit> function0) {
        function0.getClass();
    }

    public final AnimatorSet setStateAnimator(State state) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new CircularProgressDrawable.AnonymousClass2(2, this, state));
        return animatorSet;
    }

    public final void setViewContext(ViewContext viewContext) {
        this.viewContext = viewContext;
    }
}
