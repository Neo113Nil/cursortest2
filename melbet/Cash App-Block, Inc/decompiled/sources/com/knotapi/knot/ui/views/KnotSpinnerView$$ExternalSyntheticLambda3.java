package com.knotapi.knot.ui.views;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.WindowDecorActionBar;
import androidx.biometric.BiometricPrompt;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.google.android.material.progressindicator.DeterminateDrawable;
import com.google.android.material.search.SearchBar;
import com.google.android.material.search.SearchViewAnimationHelper;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.squareup.cash.card.onboarding.InteractiveCardView;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.reactions.views.ChooseReactionDialog;
import com.squareup.cash.reactions.views.ChooseReactionOverlay;
import com.squareup.scannerview.SizeMap;
import com.withpersona.sdk2.inquiry.selfie.view.Pi2ProgressArcView;
import java.util.Iterator;
import java.util.function.Consumer;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes4.dex */
public final /* synthetic */ class KnotSpinnerView$$ExternalSyntheticLambda3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ KnotSpinnerView$$ExternalSyntheticLambda3(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.$r8$classId;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                KnotSpinnerView.lambda$createSafeUpdateListener$0((Consumer) obj2, (String) obj, valueAnimator);
                return;
            case 1:
                ((View) ((WindowDecorActionBar) ((BiometricPrompt) obj2).mClientFragmentManager).mContainerView.getParent()).invalidate();
                return;
            case 2:
                ((SwipeDismissTouchListener) obj2).lambda$performDismiss$0((ViewGroup.LayoutParams) obj, valueAnimator);
                return;
            case 3:
                AppBarLayout appBarLayout = (AppBarLayout) obj2;
                int i2 = AppBarLayout.$r8$clinit;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((MaterialShapeDrawable) obj).setElevation(floatValue);
                Drawable drawable = appBarLayout.statusBarForeground;
                if (drawable instanceof MaterialShapeDrawable) {
                    ((MaterialShapeDrawable) drawable).setElevation(floatValue);
                }
                Iterator it = appBarLayout.liftOnScrollListeners.iterator();
                if (it.hasNext()) {
                    throw Recorder$$ExternalSyntheticOutline2.m(it);
                }
                Iterator it2 = appBarLayout.liftProgressListeners.iterator();
                while (it2.hasNext()) {
                    SearchBar.AnonymousClass1 anonymousClass1 = (SearchBar.AnonymousClass1) it2.next();
                    float f = floatValue / appBarLayout.appBarElevation;
                    SearchBar searchBar = SearchBar.this;
                    ColorStateList colorStateList = searchBar.liftOnScrollColor;
                    if (colorStateList != null) {
                        searchBar.backgroundShape.setFillColor(ColorStateList.valueOf(MaterialColors.layer(f, searchBar.backgroundColor, colorStateList.getDefaultColor())));
                    }
                }
                return;
            case 4:
                DeterminateDrawable determinateDrawable = (DeterminateDrawable) obj2;
                BaseProgressIndicatorSpec baseProgressIndicatorSpec = (BaseProgressIndicatorSpec) obj;
                if (baseProgressIndicatorSpec.hasWavyEffect(true) && baseProgressIndicatorSpec.waveSpeed != 0 && determinateDrawable.isVisible()) {
                    determinateDrawable.invalidateSelf();
                    return;
                }
                return;
            case 5:
                Rect rect = (Rect) obj;
                rect.right = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ((SearchViewAnimationHelper) ((SizeMap) obj2).mRatios).editText.setClipBounds(rect);
                return;
            case 6:
                float[] fArr = InteractiveCardView.X_AXIS;
                ((InteractiveCardView) obj2).setCardRotation(((Quat) Matcher$$ExternalSyntheticOutline0.m(valueAnimator)).times((Quat) ((Ref$ObjectRef) obj).element));
                return;
            case 7:
                ChooseReactionOverlay chooseReactionOverlay = (ChooseReactionOverlay) obj2;
                ChooseReactionOverlay chooseReactionOverlay2 = (ChooseReactionOverlay) obj;
                float floatValue2 = ((Float) Matcher$$ExternalSyntheticOutline0.m(valueAnimator)).floatValue();
                float f2 = 1.0f - (0.2f * floatValue2);
                ChooseReactionDialog chooseReactionDialog = chooseReactionOverlay.dialog;
                if (chooseReactionDialog != null) {
                    chooseReactionDialog.setScaleX(f2);
                }
                ChooseReactionDialog chooseReactionDialog2 = chooseReactionOverlay.dialog;
                if (chooseReactionDialog2 != null) {
                    chooseReactionDialog2.setScaleY(f2);
                }
                chooseReactionOverlay2.setAlpha(1.0f - floatValue2);
                return;
            default:
                Pi2ProgressArcView pi2ProgressArcView = (Pi2ProgressArcView) obj2;
                int i3 = Pi2ProgressArcView.$r8$clinit;
                valueAnimator.getClass();
                Object animatedValue = ((ValueAnimator) obj).getAnimatedValue();
                animatedValue.getClass();
                pi2ProgressArcView.progress = ((Float) animatedValue).floatValue();
                pi2ProgressArcView.invalidate();
                return;
        }
    }
}
