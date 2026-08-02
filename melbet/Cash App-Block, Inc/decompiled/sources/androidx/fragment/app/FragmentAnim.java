package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.core.view.OneShotPreDrawListener;
import androidx.room.Room;
import com.squareup.cash.R;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.nfc.views.NfcNotAvailableKt$$ExternalSyntheticLambda1;
import com.squareup.cash.shopping.sup.views.SingleUsePaymentAddCardSheetKt;
import com.squareup.cash.shopping.views.BrandsSearchView$$ExternalSyntheticLambda6;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public abstract class FragmentAnim {
    public static final void ConnectionFailedContent(Function1 function1, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1443621999);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        boolean z = false;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            String stringResource = Room.stringResource(gapComposer, R.string.sup_connection_failed_header);
            String stringResource2 = Room.stringResource(gapComposer, R.string.sup_connection_failed_message);
            String stringResource3 = Room.stringResource(gapComposer, R.string.ok);
            boolean z2 = true;
            ButtonProminence buttonProminence = ButtonProminence.STANDARD;
            if ((i2 & 14) != 4) {
                z2 = false;
            }
            Object rememberedValue = gapComposer.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BrandsSearchView$$ExternalSyntheticLambda6(7, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SingleUsePaymentAddCardSheetKt.SingleUsePaymentHalfSheetContent(stringResource, stringResource2, stringResource3, buttonProminence, true, null, (Function0) rememberedValue, gapComposer, 27648, 32);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NfcNotAvailableKt$$ExternalSyntheticLambda1(function1, i, 25, z);
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.RefreshWeaverRecommendationsInBackground.deepLinkSpecs;
    }

    public static int toActivityTransitResId(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public final class AnimationOrAnimator {
        public final Animation animation;
        public final AnimatorSet animator;

        public AnimationOrAnimator(Animator animator) {
            this.animation = null;
            AnimatorSet animatorSet = new AnimatorSet();
            this.animator = animatorSet;
            animatorSet.play(animator);
        }

        public AnimationOrAnimator(Animation animation) {
            this.animation = animation;
            this.animator = null;
        }
    }

    public final class EndViewTransitionAnimation extends AnimationSet implements Runnable {
        public boolean mAnimating;
        public final View mChild;
        public boolean mEnded;
        public final ViewGroup mParent;
        public boolean mTransitionEnded;

        public EndViewTransitionAnimation(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.mAnimating = true;
            this.mParent = viewGroup;
            this.mChild = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public final boolean getTransformation(long j, Transformation transformation) {
            this.mAnimating = true;
            if (this.mEnded) {
                return !this.mTransitionEnded;
            }
            if (!super.getTransformation(j, transformation)) {
                this.mEnded = true;
                OneShotPreDrawListener.add(this.mParent, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z = this.mEnded;
            ViewGroup viewGroup = this.mParent;
            if (z || !this.mAnimating) {
                viewGroup.endViewTransition(this.mChild);
                this.mTransitionEnded = true;
            } else {
                this.mAnimating = false;
                viewGroup.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public final boolean getTransformation(long j, Transformation transformation, float f) {
            this.mAnimating = true;
            if (this.mEnded) {
                return !this.mTransitionEnded;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.mEnded = true;
                OneShotPreDrawListener.add(this.mParent, this);
            }
            return true;
        }
    }
}
